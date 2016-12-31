package eu.pms.masterPlan.useCases;

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
public class PmsMasterPlanListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String masterPlanNo= (String) itr.next();
                String masterPlanName= (String) itr.next();
                String cond = " where 1=1 ";
                if(masterPlanNo!=null && !masterPlanNo.trim().equals("")){
                    cond += " and a.masMpNo like '%"+masterPlanNo+"%' ";
                }
                if(masterPlanName!=null && !masterPlanName.trim().equals("")){
                    cond += " and a.masMpName like '%"+masterPlanName+"%' ";
                }
                String query = " from eu.pms.project.database.PmsMasterPlan a ";
                query +=cond;
                query +=" order by a.masMpName ";
                retList = new DataAccessObjectImpl().getFromDynamicQuery(query);
            }else {
                retList = new DataAccessObjectImpl().getList("getPmsMasterPlanList");
            }
        } catch (Exception ce) {
            System.out.println("Error PmsMasterPlanList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmsMasterPlanList"));
        }
        return retList;
    }

}
