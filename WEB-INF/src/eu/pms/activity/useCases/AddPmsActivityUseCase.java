package eu.pms.activity.useCases;

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
public class AddPmsActivityUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        try {
            Iterator itr = input.iterator();
            String actId = (String) itr.next();
            String intId = (String) itr.next();
            String secId = (String) itr.next();
            String actDesc = (String) itr.next();
            String actUnit = (String) itr.next();
            BigDecimal actUnitQty = (BigDecimal) itr.next();
            int actEstimatedBudget = (Integer) itr.next();

            String username = "pms";
            Date timeStamp = new Date();

            PmsActivity pmsActivity = new PmsActivity();
            PmsActivityPK pmsActivityPK = new PmsActivityPK();
            pmsActivityPK.setActId(actId);
            pmsActivityPK.setSecId(secId);
            pmsActivityPK.setIntId(intId);
            pmsActivity.setCompId(pmsActivityPK);
            pmsActivity.setActDesc(actDesc);
            pmsActivity.setActUnit(actUnit);
            pmsActivity.setActUnitQty(actUnitQty);
            pmsActivity.setActEstimatedBudget(actEstimatedBudget);
            pmsActivity.setUsername(username);
            pmsActivity.setTimeStamp(timeStamp);

            List insertList = new ArrayList();
            insertList.add(pmsActivity);
            new DataAccessObjectImpl().insertOrUpdate(insertList);

        } catch (Exception ce) {
            System.err.println("Error add a new PMS Activity: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error add a new PMS Activity :" + ce.getMessage()));
        }
        return retList;
    }
}
