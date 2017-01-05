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
                String secId = (String)itr.next();
                String intPriority = (String)itr.next();
                String intSource = (String) itr.next();
                String cond = " where 1=1 ";
                if(secId!=null && !secId.trim().equals("")){
                    cond += " and a.compId.secId = '"+secId+"' ";
                }
                if(intPriority!=null && !intPriority.equals("")){
                    cond += " and a.intPriority = '"+intPriority+"' ";
                }
                if(intSource!=null && !intSource.trim().equals("") ){
                    cond += " and a.intSource = '"+intSource+"' ";
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
