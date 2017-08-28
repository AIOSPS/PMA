package eu.pms.intervention.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
import eu.pms.login.database.SecUser;
import eu.pms.project.database.*;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by alisa_000 on 12/5/2016.
 */
public class AddPmsInterventionUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        try {
            Iterator itr = input.iterator();
            String intId = (String) itr.next();
            String secId = (String) itr.next();
            String masId = (String) itr.next();
            String intDesc = (String) itr.next();
            int intEstimatedBudget = (Integer) itr.next();
            String intSource = (String) itr.next();
            String intPriority = (String) itr.next();
            ArrayList activitiesList = (ArrayList) itr.next();
            String username = ((SecUser)request.getSession().getAttribute("userInfo")).getUsrId();
            Date timeStamp = new Date();

            PmsIntervention pmsIntervention = new PmsIntervention();
            PmsInterventionPK pmsInterventionPK = new PmsInterventionPK();
            pmsInterventionPK.setIntId(intId);
            pmsInterventionPK.setSecId(secId);
            pmsIntervention.setCompId(pmsInterventionPK);
            pmsIntervention.setMasId(masId);
            pmsIntervention.setIntDesc(intDesc);
            pmsIntervention.setIntEstimatedBudget(intEstimatedBudget);
            pmsIntervention.setIntSource(intSource);
            pmsIntervention.setIntPriority(intPriority);
            pmsIntervention.setUsername(username);
            pmsIntervention.setTimeStamp(timeStamp);

            List insertList = new ArrayList();
            insertList.add(pmsIntervention);
            new DataAccessObjectImpl().deleteAsSelect("from eu.pms.project.database.PmsActivity a where a.compId.intId='"+intId+"' and a.compId.secId='"+secId+"'");
            if(activitiesList!=null && activitiesList.size()>0) {
                Iterator itrActv = activitiesList.iterator();
                while (itrActv.hasNext()) {
                    insertList.add((PmsActivity) itrActv.next());
                }
            }
            new DataAccessObjectImpl().insertOrUpdate(insertList);

        } catch (Exception ce) {
            System.err.println("Error add a new PMS Intervention and programme: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error add a new PMS Intervention and programme :" + ce.getMessage()));
        }
        return retList;
    }
}
