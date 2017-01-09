package eu.pms.objective.useCases;

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
public class PmsObjectiveListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String objectiveDesc = (String)itr.next();
                String objStatus = (String) itr.next();
                String cond = " where 1=1 ";
                if(objectiveDesc!=null && !objectiveDesc.trim().equals("")){
                    objectiveDesc = CommonFilter.cleanQeuryParam(objectiveDesc);
                    cond += " and a.objDesc like '%"+objectiveDesc+"%' ";
                }
                if(objStatus!=null && !objStatus.trim().equals("")){
                    cond += " and a.objStatus like '%"+objStatus+"%' ";
                }
                String query = " from eu.pms.project.database.PmsObjectiv a ";
                query +=cond;
                query +=" order by a.objDesc ";
                retList = new DataAccessObjectImpl().getFromDynamicQuery(query);
            }else {
                retList = new DataAccessObjectImpl().getList("getPmsObjectiveList");
            }
        } catch (Exception ce) {
            System.out.println("Error PmsObjectiveList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmsObjectiveList"));
        }
        return retList;
    }

}
