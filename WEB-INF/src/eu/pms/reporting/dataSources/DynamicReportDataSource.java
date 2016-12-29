package eu.pms.reporting.dataSources;

import net.sf.jasperreports.engine.JRDataSource;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by alisa_000 on 12/28/2016.
 */
public class DynamicReportDataSource implements ReportData {
    public JRDataSource createDataSource(Collection dataList, List<String> header)
    {
        DataSource dataSource =null;

        if(dataList !=null )
        {
            Object obj=dataList.iterator().next();
            Object[] row = (Object[]) obj;
            String [] cols = new String[header.size()];
            Object[] hdr = header.toArray(new Object[header.size()]);
            for(int i=0;i<header.size();i++){
                cols[i] = "row["+i+"]";
            }
            dataSource=new DataSource(cols);
            Iterator itr=dataList.iterator();
            dataSource.add(hdr);
            int i=0;
            while(itr.hasNext())
            {
                Object rowObj = itr.next();
                if(rowObj instanceof Object[]) {
                    Object[] r = (Object[]) rowObj;
                    String[]rr = new String[r.length];
                    for (int j = 0; j < r.length; j++) {
                        rr[j] = r[j]!=null?r[j]+"":"";

                    }
                    dataSource.add(rr);
                }
                i++;
                if(i==65533){
                    dataSource.add(hdr);
                }
            }
        }

        return dataSource;
    }
}
