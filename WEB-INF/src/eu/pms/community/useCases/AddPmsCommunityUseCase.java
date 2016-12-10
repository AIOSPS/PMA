package eu.pms.community.useCases;

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
public class AddPmsCommunityUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        try {
            Iterator itr = input.iterator();
            String comId = (String) itr.next();
            String comPcbsCode = (String) itr.next();
            String comOchaCode = (String) itr.next();
            String comName = (String) itr.next();
            String typeId = (String) itr.next();
            int comTotalAreaLand = (Integer) itr.next();
            String comLocationShortDescription = (String) itr.next();
            String comTopology = (String) itr.next();
            int comResidentsTotal = (Integer) itr.next();
            int comMaleTotal = (Integer) itr.next();
            int comFemaleTotal = (Integer) itr.next();
            int comKidsTotal = (Integer) itr.next();
            String comSchoolsInfo = (String) itr.next();
            String comHealthSchoolsInfo = (String) itr.next();
            String comReligionCenters = (String) itr.next();
            String comCemetery = (String) itr.next();
            String comWaterNetworkInfo = (String) itr.next();
            String comSewerageNetworkInfo = (String) itr.next();
            String comElectricalNetworkInfo = (String) itr.next();
            String comSolidWasteServiceInfo = (String) itr.next();
            String comRoadNetworkInfo = (String) itr.next();
            String comTransportNetworkInfo = (String) itr.next();
            String comEcnonomicActivitiesInfo = (String) itr.next();
            String locId = (String) itr.next();

            String username = "";
            Date timeStamp = new Date();

            PmsCommunity pmsCommunity = new PmsCommunity();
            pmsCommunity.setComId(comId);
            pmsCommunity.setComPcbsCode(comPcbsCode);
            pmsCommunity.setComOchaCode(comOchaCode);
            pmsCommunity.setComName(comName);
            pmsCommunity.setTypeId(typeId);
            pmsCommunity.setComTotalAreaLand(comTotalAreaLand);
            pmsCommunity.setComLocationShortDescription(comLocationShortDescription);
            pmsCommunity.setComTopology(comTopology);
            pmsCommunity.setComResidentsTotal(comResidentsTotal);
            pmsCommunity.setComMaleTotal(comMaleTotal);
            pmsCommunity.setComFemaleTotal(comFemaleTotal);
            pmsCommunity.setComKidsTotal(comKidsTotal);
            pmsCommunity.setComSchoolsInfo(comSchoolsInfo);
            pmsCommunity.setComHealthSchoolsInfo(comHealthSchoolsInfo);
            pmsCommunity.setComReligionCenters(comReligionCenters);
            pmsCommunity.setComCemetery(comCemetery);
            pmsCommunity.setComWaterNetworkInfo(comWaterNetworkInfo);
            pmsCommunity.setComSewerageNetworkInfo(comSewerageNetworkInfo);
            pmsCommunity.setComElectricalNetworkInfo(comElectricalNetworkInfo);
            pmsCommunity.setComSolidWasteServiceInfo(comSolidWasteServiceInfo);
            pmsCommunity.setComRoadNetworkInfo(comRoadNetworkInfo);
            pmsCommunity.setComTransportNetworkInfo(comTransportNetworkInfo);
            pmsCommunity.setComEcnonomicActivitiesInfo(comEcnonomicActivitiesInfo);
            pmsCommunity.setLocId(locId);
            pmsCommunity.setUsername(username);
            pmsCommunity.setTimeStamp(timeStamp);

            List insertList = new ArrayList();
            insertList.add(pmsCommunity);
            new DataAccessObjectImpl().insertOrUpdate(insertList);

        } catch (Exception ce) {
            System.err.println("Error add a new PMS Community: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error add a new PMS Community :" + ce.getMessage()));
        }
        return retList;
    }
}
