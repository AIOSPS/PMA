package eu.pms.result.useCases;

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
public class AddPmsResultUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        try {
            Iterator itr = input.iterator();
            String resId = (String) itr.next();
            String objId = (String) itr.next();
            String resDesc = (String) itr.next();
            String resLongDesc = (String) itr.next();
            String resDefineDate = (String) itr.next();
            String resStatus = (String) itr.next();
            String resCloseDate = (String) itr.next();

            String username = "pms";
            Date timeStamp = new Date();

            PmsResult pmsResult = new PmsResult();
            PmsResultPK pmsResultPK = new PmsResultPK();
            pmsResultPK.setResId(resId);
            pmsResultPK.setObjId(objId);
            pmsResult.setCompId(pmsResultPK);
            pmsResult.setResDesc(resDesc);
            pmsResult.setResLongDesc(resLongDesc);
            pmsResult.setResDefineDate(DateTool.convertStringToDate(resDefineDate,DateTool.DD_MM_YYYY));
            pmsResult.setResStatus(resStatus);
            pmsResult.setResCloseDate(DateTool.convertStringToDate(resCloseDate,DateTool.DD_MM_YYYY));
            pmsResult.setUsername(username);
            pmsResult.setTimeStamp(timeStamp);

            List insertList = new ArrayList();
            insertList.add(pmsResult);
            new DataAccessObjectImpl().insertOrUpdate(insertList);

        } catch (Exception ce) {
            System.err.println("Error add a new PMS Result: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error add a new PMS Result :" + ce.getMessage()));
        }
        return retList;
    }
}
