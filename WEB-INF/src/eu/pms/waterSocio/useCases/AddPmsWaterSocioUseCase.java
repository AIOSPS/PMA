package eu.pms.waterSocio.useCases;

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
public class AddPmsWaterSocioUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        try {
            Iterator itr = input.iterator();
            String watId = (String) itr.next();
            if (watId == null || watId.equals("")){
                watId = eu.pms.common.tools.Randomizer.randomIntegers(10).toString();
            }
            String comId = (String) itr.next();
            String watIsconnected = (String) itr.next();
            Integer watNetwork = (Integer) itr.next();
            String watUseWatTanker = (String) itr.next();
            String watRainWaterWell = (String) itr.next();
            Integer watNoSprings = (Integer) itr.next();
            java.math.BigDecimal watPriceWater = (java.math.BigDecimal) itr.next();
            Integer watFillingPoint = (Integer) itr.next();
            Integer watQuantity = (Integer) itr.next();
            String watSurveyDate = (String) itr.next();

            String username = ((SecUser)request.getSession().getAttribute("userInfo")).getUsrId();
            Date timeStamp = new Date();

            PmsWaterSocio pmsWaterSocio = new PmsWaterSocio();
            pmsWaterSocio.setWatId(watId);
            pmsWaterSocio.setComId(comId);
            pmsWaterSocio.setWatIsconnected(watIsconnected);
            pmsWaterSocio.setWatNetwork(watNetwork);
            pmsWaterSocio.setWatUseWatTanker(watUseWatTanker);
            pmsWaterSocio.setWatRainWaterWell(watRainWaterWell);
            pmsWaterSocio.setWatNoSprings(watNoSprings);
            pmsWaterSocio.setWatPriceWater(watPriceWater);
            pmsWaterSocio.setWatFillingPoint(watFillingPoint);
            pmsWaterSocio.setWatQuantity(watQuantity);
            pmsWaterSocio.setWatSurveyDate(DateTool.convertStringToDate(watSurveyDate,DateTool.DD_MM_YYYY));
            pmsWaterSocio.setUsername(username);
            pmsWaterSocio.setTimeStamp(timeStamp);

            List insertList = new ArrayList();
            insertList.add(pmsWaterSocio);
            new DataAccessObjectImpl().insertOrUpdate(insertList);

        } catch (Exception ce) {
            System.err.println("Error add a new PMS WaterSocio: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error add a new PMS WaterSocio :" + ce.getMessage()));
        }
        return retList;
    }
}
