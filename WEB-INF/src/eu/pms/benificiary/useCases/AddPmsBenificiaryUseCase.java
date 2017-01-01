package eu.pms.benificiary.useCases;

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
public class AddPmsBenificiaryUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        try {
            Iterator itr = input.iterator();
            String benId = (String) itr.next();
            String benDesc = (String) itr.next();
            int benTotal = (Integer) itr.next();
            String btpId = (String) itr.next();

            String username = "pms";
            Date timeStamp = new Date();

            PmsProjectsBenificiary bmsBenificiary = new PmsProjectsBenificiary();
            bmsBenificiary.getCompId().setBtpId(btpId);
           // bmsBenificiary.setBenDesc(benDesc);
            bmsBenificiary.setBenTotal(benTotal);
           // bmsBenificiary.setBtpId(btpId);
            bmsBenificiary.setUsername(username);
            bmsBenificiary.setTimeStamp(timeStamp);

            List insertList = new ArrayList();
            insertList.add(bmsBenificiary);
            new DataAccessObjectImpl().insertOrUpdate(insertList);

        } catch (Exception ce) {
            System.err.println("Error add a new PMS Benificiary: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error add a new PMS Benificiary :" + ce.getMessage()));
        }
        return retList;
    }
}
