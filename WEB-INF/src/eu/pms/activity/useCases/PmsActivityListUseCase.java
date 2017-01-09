package eu.pms.activity.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
import eu.pms.common.utils.CommonFilter;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by alisa_000 on 12/6/2016.
 */
public class PmsActivityListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String activityDesc = (String)itr.next();
                String activityUnit = (String)itr.next();
                Integer estimateBudget = (Integer) itr.next();
                String cond = " where 1=1 ";
                if(activityDesc!=null && !activityDesc.trim().equals("")){
                    activityDesc =  CommonFilter.cleanQeuryParam(activityDesc);
                    cond += " and a.actDesc like '%"+activityDesc+"%' ";
                }
                if(activityUnit!=null && !activityUnit.trim().equals("")){
                    activityUnit =  CommonFilter.cleanQeuryParam(activityUnit);
                    cond += " and a.actUnit like '%"+activityUnit+"%' ";
                }
                if(estimateBudget!=null && !estimateBudget.equals("")&& estimateBudget!=0 ){
                    cond += " and a.actEstimatedBudget= "+estimateBudget+" ";
                }
                String query = " from eu.pms.project.database.PmsActivity a ";
                query +=cond;
                query +=" order by a.actDesc ";
                retList = new DataAccessObjectImpl().getFromDynamicQuery(query);
            }else {
                retList = new DataAccessObjectImpl().getList("getPmsActivityList");
            }
        } catch (Exception ce) {
            System.out.println("Error PmsActivityList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmsActivityList"));
        }
        return retList;
    }

}
