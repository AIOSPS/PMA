package btc.pma.specObjective.useCases;

import btc.pma.programme.database.PmaSpecificObjective;
import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.tools.DateTool;
import eu.pms.common.useCase.ComponentUseCase;
import eu.pms.login.database.SecUser;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created by PC on 9/2/2017.
 */
public class AddPmaSpecObjectiveUseCase  implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        try {
            Iterator itr = input.iterator();
            String intrNo = (String) itr.next();
            String sobjNo = (String) itr.next();
            String sobjDescription = (String)itr.next();
            String sobjDefineDate = (String) itr.next();
            String sobjAdaptationDate = (String) itr.next();
            String sobjRelatedDocuments = (String) itr.next();
            String username = ((SecUser)request.getSession().getAttribute("userInfo")).getUsrId();
            Date timeStamp = new Date();

            PmaSpecificObjective pmaSpecificObjective = new PmaSpecificObjective();
            pmaSpecificObjective.setIntrNo(intrNo);
            pmaSpecificObjective.setSobjNo(sobjNo);
            pmaSpecificObjective.setSobjDescription(sobjDescription);
            pmaSpecificObjective.setSobjDefineDate(DateTool.convertStringToDate(sobjDefineDate,DateTool.DD_MM_YYYY));
            pmaSpecificObjective.setSobjAdaptationDate(DateTool.convertStringToDate(sobjAdaptationDate,DateTool.DD_MM_YYYY));
            pmaSpecificObjective.setSobjRelatedDocuments(sobjRelatedDocuments);
            pmaSpecificObjective.setUsername(username);
            pmaSpecificObjective.setTimeStamp(timeStamp);

            List insertList = new ArrayList();
            insertList.add(pmaSpecificObjective);
            new DataAccessObjectImpl().insertOrUpdate(insertList);

        } catch (Exception ce) {
            System.err.println("Error add a new  pmaSpecificObjective: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error add a new pmaSpecificObjective :" + ce.getMessage()));
        }
        return retList;
    }
}

