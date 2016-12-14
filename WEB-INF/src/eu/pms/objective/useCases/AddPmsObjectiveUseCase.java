package eu.pms.objective.useCases;

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
public class AddPmsObjectiveUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        try {
            Iterator itr = input.iterator();
            String objId = (String) itr.next();
            String objDesc = (String) itr.next();
            String objLongDesc = (String) itr.next();
            String objDefineDate = (String) itr.next();
            String objStatus = (String) itr.next();
            String objCloseDate = (String) itr.next();
            String ojbUserId = (String) itr.next();
            String strDocId = (String) itr.next();

            String username = "";
            Date timeStamp = new Date();

            PmsObjectiv pmsObjectiv = new PmsObjectiv();
            pmsObjectiv.setObjId(objId);
            pmsObjectiv.setStrDocId(strDocId);
            pmsObjectiv.setObjDesc(objDesc);
            pmsObjectiv.setObjLongDesc(objLongDesc);
            pmsObjectiv.setObjDefineDate(timeStamp);
            pmsObjectiv.setObjStatus(objStatus);
            pmsObjectiv.setObjCloseDate(timeStamp);
            pmsObjectiv.setOjbUserId(ojbUserId);
            pmsObjectiv.setUsername(username);
            pmsObjectiv.setTimeStamp(timeStamp);

            List insertList = new ArrayList();
            insertList.add(pmsObjectiv);
            new DataAccessObjectImpl().insertOrUpdate(insertList);

        } catch (Exception ce) {
            System.err.println("Error add a new PMS Objective: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error add a new PMS Objective :" + ce.getMessage()));
        }
        return retList;
    }
}
