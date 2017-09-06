package btc.pma.result.useCases;

import btc.pma.programme.database.PmaProgrammeInfo;
import btc.pma.programme.database.PmaResult;
import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.tools.DateTool;
import eu.pms.common.useCase.ComponentUseCase;
import eu.pms.login.database.SecUser;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created by PC on 9/6/2017.
 */
public class AddPmaResultUseCase  implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        try {
            Iterator itr = input.iterator();
            String rsltNo = (String) itr.next();
            String rsltTitle = (String) itr.next();
            String rsltDefineDate = (String) itr.next();
            String rsltCloseDate = (String) itr.next();
            String rsltStatus = (String) itr.next();
            String rsltLongDescription = (String) itr.next();
            String sobjNo = (String) itr.next();
            String username = ((SecUser)request.getSession().getAttribute("userInfo")).getUsrId();
            Date timeStamp = new Date();

            PmaResult pmaResult = new PmaResult();
            pmaResult.setRsltNo(rsltNo);
            pmaResult.setRsltTitle(rsltTitle);
            pmaResult.setRsltDefineDate(DateTool.convertStringToDate(rsltDefineDate,DateTool.DD_MM_YYYY));
            pmaResult.setRsltCloseDate(DateTool.convertStringToDate(rsltCloseDate,DateTool.DD_MM_YYYY));
            pmaResult.setRsltStatus(rsltStatus);
            pmaResult.setRsltLongDescription(rsltLongDescription);
            pmaResult.setSobjNo(sobjNo);
            pmaResult.setUsername(username);
            pmaResult.setTimeStamp(timeStamp);

            List insertList = new ArrayList();
            insertList.add(pmaResult);
            new DataAccessObjectImpl().insertOrUpdate(insertList);

        } catch (Exception ce) {
            System.err.println("Error add a new PMA Result: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error add a new PMA Result :" + ce.getMessage()));
        }
        return retList;
    }
}
