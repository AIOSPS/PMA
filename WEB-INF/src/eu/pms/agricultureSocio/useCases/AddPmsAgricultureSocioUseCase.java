package eu.pms.agricultureSocio.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.tools.DateTool;
import eu.pms.common.useCase.ComponentUseCase;
import eu.pms.login.database.SecUser;
import eu.pms.project.database.*;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created by alisa_000 on 12/5/2016.
 */
public class AddPmsAgricultureSocioUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        try {
            Iterator itr = input.iterator();
            String agrId = (String) itr.next();
            String comId = (String) itr.next();
            Integer agrArea = (Integer) itr.next();
            Integer agrNoCowYear = (Integer) itr.next();
            Integer agrNoSheepYear = (Integer) itr.next();
            Integer agrCostWaterTank = (Integer) itr.next();
            Integer agrHerdingArea = (Integer) itr.next();
            Integer agrMilitaryArea = (Integer) itr.next();
            Integer agrBypassRoadArea = (Integer) itr.next();
            String agrSurveyDate = (String) itr.next();

            String username = ((SecUser)request.getSession().getAttribute("userInfo")).getUsrId();
            Date timeStamp = new Date();

            PmsAgricultureSocio pmsAgricultureSocio = new PmsAgricultureSocio();
            pmsAgricultureSocio.setAgrId(agrId);
            pmsAgricultureSocio.setComId(comId);
            pmsAgricultureSocio.setAgrArea(agrArea);
            pmsAgricultureSocio.setAgrNoCowYear(agrNoCowYear);
            pmsAgricultureSocio.setAgrNoSheepYear(agrNoSheepYear);
            pmsAgricultureSocio.setAgrCostWaterTank(agrCostWaterTank);
            pmsAgricultureSocio.setAgrHerdingArea(agrHerdingArea);
            pmsAgricultureSocio.setAgrMilitaryArea(agrMilitaryArea);
            pmsAgricultureSocio.setAgrBypassRoadArea(agrBypassRoadArea);
            pmsAgricultureSocio.setAgrSurveyDate(DateTool.convertStringToDate(agrSurveyDate,DateTool.DD_MM_YYYY));
            pmsAgricultureSocio.setUsername(username);
            pmsAgricultureSocio.setTimeStamp(timeStamp);

            List insertList = new ArrayList();
            insertList.add(pmsAgricultureSocio);
            new DataAccessObjectImpl().insertOrUpdate(insertList);

        } catch (Exception ce) {
            System.err.println("Error add a new PMS AgricultureSocio: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error add a new PMS AgricultureSocio :" + ce.getMessage()));
        }
        return retList;
    }
}
