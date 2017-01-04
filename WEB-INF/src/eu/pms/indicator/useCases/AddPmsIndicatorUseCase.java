package eu.pms.indicator.useCases;

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
public class AddPmsIndicatorUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        try {
            Iterator itr = input.iterator();
            String indId = (String) itr.next();
            String resId = (String) itr.next();
            String objId = (String) itr.next();
            String indTitle = (String) itr.next();
            String indDate = (String) itr.next();
            String indLongDesc = (String) itr.next();
            int indBaseline = (Integer) itr.next();
            int indFrequency = (Integer) itr.next();
            String indCollectionMethod = (String) itr.next();
            String indStatisticalMethod = (String) itr.next();
            ArrayList indicatorMeasuresList = (ArrayList) itr.next();
            String username = ((SecUser)request.getSession().getAttribute("userInfo")).getUsrId();
            Date timeStamp = new Date();

            PmsIndicator pmsIndicator = new PmsIndicator();
            PmsIndicatorPK pmsIndicatorPK = new PmsIndicatorPK();
            pmsIndicatorPK.setIndId(indId);
            pmsIndicatorPK.setResId(resId);
            pmsIndicatorPK.setObjId(objId);
            pmsIndicator.setCompId(pmsIndicatorPK);
            pmsIndicator.setIndTitle(indTitle);
            pmsIndicator.setIndDate(DateTool.convertStringToDate(indDate,DateTool.DD_MM_YYYY));
            pmsIndicator.setIndLongDesc(indLongDesc);
            pmsIndicator.setIndBaseline(indBaseline);
            pmsIndicator.setIndFrequency(indFrequency);
            pmsIndicator.setIndCollectionMethod(indCollectionMethod);
            pmsIndicator.setIndStatisticalMethod(indStatisticalMethod);
            pmsIndicator.setUsername(username);
            pmsIndicator.setTimeStamp(timeStamp);



            List insertList = new ArrayList();
            insertList.add(pmsIndicator);
            new DataAccessObjectImpl().deleteAsSelect("from eu.pms.project.database.PmsIndicatorMeasures a where a.compId.indId='"+indId+"' and a.compId.resId='"+resId+"' and a.compId.objId='"+objId+"'");
            if(indicatorMeasuresList!=null && indicatorMeasuresList.size()>0) {
                Iterator itrInd = indicatorMeasuresList.iterator();
                while (itrInd.hasNext()) {
                    insertList.add((PmsIndicatorMeasures) itrInd.next());
                }
            }
            new DataAccessObjectImpl().insertOrUpdate(insertList);

        } catch (Exception ce) {
            System.err.println("Error add a new PMS Indicator: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error add a new PMS Indicator :" + ce.getMessage()));
        }
        return retList;
    }
}
