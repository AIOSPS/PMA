package eu.pms.permit.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.tools.DateTool;
import eu.pms.common.useCase.ComponentUseCase;
import eu.pms.project.database.*;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by alisa_000 on 12/5/2016.
 */
public class AddPmsPermitUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        try {
            Iterator itr = input.iterator();
            String perId = (String) itr.next();
            String perTitle = (String) itr.next();
            String perType = (String) itr.next();
            String perSubmitDate = (String) itr.next();
            String perIssueDate = (String) itr.next();
            int perPeriod = (Integer) itr.next();
            String perStatus = (String) itr.next();
            String perIssuingAgency = (String) itr.next();

            String username = "pms";
            Date timeStamp = new Date();

            PmsPermit pmsPermit = new PmsPermit();
            pmsPermit.setPerId(perId);
            pmsPermit.setPerTitle(perTitle);
            pmsPermit.setPerType(perType);
            pmsPermit.setPerSubmitDate(DateTool.convertStringToDate(perSubmitDate,DateTool.DD_MM_YYYY));
            pmsPermit.setPerIssueDate(DateTool.convertStringToDate(perIssueDate,DateTool.DD_MM_YYYY));
            pmsPermit.setPerPeriod(perPeriod);
            pmsPermit.setPerStatus(perStatus);
            pmsPermit.setPerIssuingAgency(perIssuingAgency);
            pmsPermit.setUsername(username);
            pmsPermit.setTimeStamp(timeStamp);

            List insertList = new ArrayList();
            insertList.add(pmsPermit);
            new DataAccessObjectImpl().insertOrUpdate(insertList);

        } catch (Exception ce) {
            System.err.println("Error add a new PMS Permit: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error add a new PMS Permit :" + ce.getMessage()));
        }
        return retList;
    }
}
