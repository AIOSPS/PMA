package eu.pms.intervention.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
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
            String subId = (String) itr.next();
            String secId = (String) itr.next();
            String masId = (String) itr.next();
            String intDesc = (String) itr.next();
            int intEstimatedBudget = (Integer) itr.next();
            String intSource = (String) itr.next();

            String username = "pms";
            Date timeStamp = new Date();

            PmsIntervention pmsIntervention = new PmsIntervention();
            PmsInterventionPK pmsInterventionPK = new PmsInterventionPK();
            pmsInterventionPK.setIntId(intId);
            pmsInterventionPK.setSecId(secId);
            pmsInterventionPK.setSubId(subId);
            pmsIntervention.setCompId(pmsInterventionPK);
            pmsIntervention.setMasId(masId);
            pmsIntervention.setIntDesc(intDesc);
            pmsIntervention.setIntEstimatedBudget(intEstimatedBudget);
            pmsIntervention.setIntSource(intSource);
            pmsIntervention.setUsername(username);
            pmsIntervention.setTimeStamp(timeStamp);

            List insertList = new ArrayList();
            insertList.add(pmsIntervention);
            new DataAccessObjectImpl().insertOrUpdate(insertList);

        } catch (Exception ce) {
            System.err.println("Error add a new PMS Intervention: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error add a new PMS Intervention :" + ce.getMessage()));
        }
        return retList;
    }
}
