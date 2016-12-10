package eu.pms.intervention.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by alisa_000 on 12/6/2016.
 */
public class PmsInterventionListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String intDesc = (String)itr.next();
                Integer intEstimateBudget = (Integer)itr.next();
                String intSource = (String) itr.next();
                String cond = " where 1=1 ";
                if(intDesc!=null && !intDesc.trim().equals("")){
                    cond += " and a.intDesc like '%"+intDesc+"%' ";
                }
                if(intEstimateBudget!=null && !intEstimateBudget.equals("")&& intEstimateBudget!=0){
                    cond += " and a.intEstimatedBudget= "+intEstimateBudget+" ";
                }
                if(intSource!=null && !intSource.trim().equals("") ){
                    cond += " and a.intSource like '%"+intSource+"%' ";
                }
                String query = " from eu.pms.project.database.PmsIntervention a ";
                query +=cond;
                query +=" order by a.intDesc ";
                retList = new DataAccessObjectImpl().getFromDynamicQuery(query);
            }else {
                retList = new DataAccessObjectImpl().getList("getPmsInterventionList");
            }
        } catch (Exception ce) {
            System.out.println("Error PmsInterventionList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmsInterventionList"));
        }
        return retList;
    }

}
