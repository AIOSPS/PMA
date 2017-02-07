package eu.pms.warnings.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.tools.DateTool;
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
public class AddPmsWarningUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        try {
            Iterator itr = input.iterator();
            String warId = (String) itr.next();
            if (warId == null || warId.equals("")){
                warId = eu.pms.common.tools.Randomizer.randomIntegers(10).toString();
            }
            String warNo = (String) itr.next();
            String warWarnedName = (String) itr.next();
            String warWarnedId = (String) itr.next();
            String comId = (String) itr.next();
            String donId = (String) itr.next();
            java.math.BigDecimal warLatitude = (java.math.BigDecimal) itr.next();
            java.math.BigDecimal warLongitude = (java.math.BigDecimal) itr.next();
            String warType = (String) itr.next();
            String warStructType = (String) itr.next();
            String warIssueDate = (String) itr.next();
            String warSubmitDate = (String) itr.next();
            String warReceptionistId = (String) itr.next();
            String warReceptionistName = (String) itr.next();
            String warReceptionDate = (String) itr.next();
            String warStatus = (String) itr.next();
            String warNotes = (String) itr.next();

            String username = ((SecUser)request.getSession().getAttribute("userInfo")).getUsrId();
            Date timeStamp = new Date();

            PmsWarnings pmsWarnings = new PmsWarnings();
            pmsWarnings.setWarId(warId);
            pmsWarnings.setWarNo(warNo);
            pmsWarnings.setWarWarnedName(warWarnedName);
            pmsWarnings.setWarWarnedId(warWarnedId);
            pmsWarnings.setComId(comId);
            pmsWarnings.setDonId(donId);
            pmsWarnings.setWarLatitude(warLatitude);
            pmsWarnings.setWarLongitude(warLongitude);
            pmsWarnings.setWarType(warType);
            pmsWarnings.setWarStructType(warStructType);
            pmsWarnings.setWarIssueDate(DateTool.convertStringToDate(warIssueDate,DateTool.DD_MM_YYYY));
            pmsWarnings.setWarSubmitDate(DateTool.convertStringToDate(warSubmitDate,DateTool.DD_MM_YYYY));
            pmsWarnings.setWarReceptionistId(warReceptionistId);
            pmsWarnings.setWarReceptionistName(warReceptionistName);
            pmsWarnings.setWarReceptionDate(DateTool.convertStringToDate(warReceptionDate,DateTool.DD_MM_YYYY));
            pmsWarnings.setWarStatus(warStatus);
            pmsWarnings.setWarNotes(warNotes);
            pmsWarnings.setUsername(username);
            pmsWarnings.setTimeStamp(timeStamp);

            List insertList = new ArrayList();
            insertList.add(pmsWarnings);
            new DataAccessObjectImpl().insertOrUpdate(insertList);

        } catch (Exception ce) {
            System.err.println("Error add a new PMS Warning: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error add a new PMS Warning :" + ce.getMessage()));
        }
        return retList;
    }
}
