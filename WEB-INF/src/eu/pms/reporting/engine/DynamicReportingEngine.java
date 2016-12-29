package eu.pms.reporting.engine;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.exceptions.BusinessException;
import eu.pms.common.tools.XmlParser;
import eu.pms.common.utils.XMLItemEntity;
import eu.pms.reporting.dataSources.DynamicReportDataSource;
import eu.pms.reporting.design.DynamicReportDesign;
import eu.pms.reporting.entity.PresenationDynaQueryItemInfo;
import eu.pms.reporting.entity.QueryItemEntity;
import eu.pms.reporting.entity.TableJoinInfoEntity;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.builder.DynamicReports;

import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by alisa_000 on 12/28/2016.
 */
public class DynamicReportingEngine {
    private static TreeMap<String, QueryItemEntity> parsedQueryItems;
    private ArrayList<String> tableHeader;
    private String queryConditions[] = new String[]{" = ? "," < ? "," > ? "," <= ? "," >= ? "," LIKE '%?%' "," BETWEEN ?1 AND ?2 "," IN (?) ","<>?"," IN (?) "};

    public DynamicReportingEngine(String confFileName)
    {
        parsedQueryItems = new TreeMap<String, QueryItemEntity>();
        loadReportingConfiguration(confFileName);

    }

    public JasperReportBuilder createReport(List<PresenationDynaQueryItemInfo> inputItems, List<PresenationDynaQueryItemInfo> outputItems) throws BusinessException
    {
        StringBuffer query = buildQuery(inputItems, outputItems);

        if(query == null || query.length() <= 0)
            throw new BusinessException("No reporting query generated...!!!");

        List qResult;
        try
        {
//            qResult =new DataAccessObjectImpl().getFromDynamicQuery(query.toString().replace("select","SELECT DISTINCT"));
            qResult =new DataAccessObjectImpl().getFromDynamicQuery(query.toString());

        }
        catch (Exception sqlEx)
        {
            sqlEx.printStackTrace();
            throw new BusinessException(sqlEx);
        }

        Object reportObject = null;
        JasperReportBuilder reportBuilder = null;
        if(qResult != null && qResult.size() > 0)
        {
            reportBuilder=    generateReport(qResult, tableHeader);
        }
//        return reportObject;
        return reportBuilder;
    }

    private JasperReportBuilder generateReport(List dataList, List<String> header)
    {
        JasperReportBuilder reportBuilder = DynamicReports.report();
        DynamicReportDataSource data = new DynamicReportDataSource();
        reportBuilder.setDataSource(data.createDataSource(dataList,header));
        try {
            new DynamicReportDesign().configureReport(reportBuilder, data,header);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return reportBuilder;

    }


    private StringBuffer buildQuery(List<PresenationDynaQueryItemInfo> inputItems, List<PresenationDynaQueryItemInfo> outputItems)throws BusinessException
    {
        if(parsedQueryItems == null || parsedQueryItems.size() <=0)
            throw new BusinessException("No reporting query configuration found...!!!");

        ArrayList<String> selectParts = new ArrayList<String>();
        ArrayList<String> fromParts = new ArrayList<String>();
        ArrayList<String> whereParts = new ArrayList<String>();
        StringBuffer selectSegement = new StringBuffer();
        StringBuffer fromSegement = new StringBuffer();
        StringBuffer whereSegement = new StringBuffer();
        tableHeader = new ArrayList<String>();

        for(PresenationDynaQueryItemInfo outItem : outputItems)
        {
            QueryItemEntity qItem = parsedQueryItems.get(outItem.getItemId());

            if(!selectParts.contains(qItem.getLockupDisplayValue()))
            {
                selectParts.add(qItem.getLockupDisplayValue());

                if(!tableHeader.contains(qItem.getDisplayName()))
                {
                    tableHeader.add(qItem.getDisplayName());
                }
            }

            if(!fromParts.contains(qItem.getHdbTableName()))
                fromParts.add(qItem.getHdbTableName());
        }

        for(PresenationDynaQueryItemInfo inItem : inputItems)
        {
            QueryItemEntity qItem = parsedQueryItems.get(inItem.getItemId());

            if(!fromParts.contains(qItem.getHdbTableName()))
                fromParts.add(qItem.getHdbTableName());

            String whereCond = qItem.getWhereCondition();
            whereCond = qItem.getWhereCondition() + queryConditions[inItem.getItemWhereType()];

            if(inItem.getItemWhereType() < PresenationDynaQueryItemInfo.ONE_VALUE_LIKE_CONDITION)
            {
                whereCond = whereCond.replace("?","'"+inItem.getItemVal1()+"'");
            }
            else if(inItem.getItemWhereType() == PresenationDynaQueryItemInfo.ONE_VALUE_LIKE_CONDITION)
            {
                try{
                    whereCond = whereCond.replace("?",new String(inItem.getItemVal1().getBytes("ISO8859_1"), "utf8"));
                }catch(Exception e){}

            }
            else if(inItem.getItemWhereType() == PresenationDynaQueryItemInfo.ONE_VALUE_IN_CONDITION)
            {
                whereCond = whereCond.replace("?",inItem.getItemVal1());
            }
            else if(inItem.getItemWhereType() == PresenationDynaQueryItemInfo.MULTI_VALUE_IN_CONDITION){
                String values = "";
                boolean all = false;
                if(inItem.getItemList1()!=null && inItem.getItemList1().length>0)
                    for(int i=0;i<inItem.getItemList1().length;i++){
                        if(inItem.getItemList1()[i]!=null && inItem.getItemList1()[i].equals("*"))
                        {
                            all = true;
                            break;
                        }
                        values += "'"+inItem.getItemList1()[i]+"',";
                    } else all=true;
                if(!all)
                    whereCond = whereCond.replace("?",values.substring(0,values.lastIndexOf(",")));
                else whereCond = " 1=1 ";
            }
            else
            {
                whereCond = whereCond.replace("?1","'"+inItem.getItemVal1()+"'");
                whereCond = whereCond.replace("?2","'"+inItem.getItemVal2()+"'");
            }

            if(!whereParts.contains(whereCond))
                whereParts.add(whereCond);
        }

        selectSegement.append("select ");
        for(String selectItem : selectParts)
        {
            selectSegement.append(selectItem +", ");
        }

        fromSegement.append(" from ");
        for(String fromItem : fromParts)
        {
            fromSegement.append(fromItem +", ");
        }

        whereSegement.append(" where ");
        for(String whereItem : whereParts)
        {
            whereSegement.append(whereItem +" and ");
        }

        selectSegement = selectSegement.replace(selectSegement.lastIndexOf(","), selectSegement.lastIndexOf(",")+1, "");
        fromSegement = fromSegement.replace(fromSegement.lastIndexOf(","), fromSegement.lastIndexOf(",")+1, "");
        whereSegement = whereSegement.replace(whereSegement.lastIndexOf("and"), whereSegement.lastIndexOf("and")+3, "");

        StringBuffer query = new StringBuffer();
        query.append(selectSegement);
        query.append(fromSegement);
        query.append(whereSegement);
        return query;
    }

    private void loadReportingConfiguration(String confFileName)
    {
        try
        {
            XmlParser xp = new XmlParser();
            xp.parseFile(confFileName);
            ArrayList<XMLItemEntity> configList = xp.getTagsList();
            HashMap<String, TableJoinInfoEntity> joinInfo = null;

            Class[] stringPar = new Class[1];
            stringPar[0] = String.class;
            Class[] arrayListPar = new Class[1];
            arrayListPar[0] = ArrayList.class;
            QueryItemEntity item = null;
            int count = 0;
            Class cl = null;

            for(XMLItemEntity xmlItem : configList)
            {
                if(xmlItem.getItemName().equalsIgnoreCase("itemId"))//this mean begining of new object
                {
                    if(count > 0)
                    {
                        item.setJoinInfoList(new TreeMap(joinInfo));// use tree map to sort the conditions by key in the map
                        parsedQueryItems.put(item.getItemId(), item);
                    }
                    item = new QueryItemEntity();
                    joinInfo = new HashMap<String, TableJoinInfoEntity>();
                    cl=item.getClass();
                    count++;
                }

                if(xmlItem.getItemName().indexOf("JoinWith")!= -1)
                {
                    TableJoinInfoEntity joinEntity ;
                    if(joinInfo.containsKey(xmlItem.getAttribute()))
                        // update the exist entry with new value
                        joinEntity = joinInfo.get(xmlItem.getAttribute());
                    else
                        // create new entery and object with new values
                        joinEntity = new TableJoinInfoEntity();

                    //update values in object using refliction
                    Class joinEntityClass = joinEntity.getClass();
                    Method entityMthd = joinEntityClass.getMethod("set"+xmlItem.getItemName(),stringPar);
                    String[] entityInput = {new String(xmlItem.getItemValue())};
                    entityMthd.invoke(joinEntity, entityInput);

                    // add / overwrite exist object in the map with the new one
                    joinInfo.put(xmlItem.getAttribute(), joinEntity);
                }
                else
                {
                    Method mthd = cl.getMethod("set"+xmlItem.getItemName(),stringPar);
                    String[] input = {new String(xmlItem.getItemValue())};
                    mthd.invoke(item,input);
                }
            }

            if(item != null)
            {
                item.setJoinInfoList(new TreeMap(joinInfo));// use tree map to sort the conditions by key in the map
                parsedQueryItems.put(item.getItemId(), item);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
