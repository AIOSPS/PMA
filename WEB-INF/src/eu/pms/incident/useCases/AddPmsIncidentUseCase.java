package eu.pms.incident.useCases;

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
public class AddPmsIncidentUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        try {
            Iterator itr = input.iterator();
            String incId = (String) itr.next();
            String datId = (String) itr.next();
            String comId = (String) itr.next();
            String proId = (String) itr.next();
            String incOchaId = (String) itr.next();
            String incDescription = (String) itr.next();
            Integer incAffectedWomen = (Integer) itr.next();
            Integer incAffectedMen = (Integer) itr.next();
            Integer incAffectedAdaults = (Integer) itr.next();
            Integer incAffectedChildren = (Integer) itr.next();
            Integer incDisplacedWomen = (Integer) itr.next();
            Integer incDemolishedStructure = (Integer) itr.next();
            String incSourceLink = (String) itr.next();
            String incType = (String) itr.next();
            String incTimeStamp = (String) itr.next();
            java.math.BigDecimal locLatitude = (java.math.BigDecimal) itr.next();
            java.math.BigDecimal locLongitude = (java.math.BigDecimal) itr.next();
            int incDisplacedMen = (Integer) itr.next();
            int incDisplacedAdult = (Integer) itr.next();
            int incDisplacedChildren = (Integer) itr.next();

            String username = "pms";
            Date timeStamp = new Date();

            PmsIncident pmsIncident = new PmsIncident();
            pmsIncident.setIncId(incId);
            pmsIncident.setDatId(datId);
            pmsIncident.setComId(comId);
            pmsIncident.setProId(proId);
            pmsIncident.setIncOchaId(incOchaId);
            pmsIncident.setIncDescription(incDescription);
            pmsIncident.setIncAffectedWomen(incAffectedWomen);
            pmsIncident.setIncAffectedMen(incAffectedMen);
            pmsIncident.setIncAffectedAdaults(incAffectedAdaults);
            pmsIncident.setIncAffectedChildren(incAffectedChildren);
            pmsIncident.setIncDisplacedWomen(incDisplacedWomen);
            pmsIncident.setIncDisplacedMen(incDisplacedMen);
            pmsIncident.setIncDisplacedAdult(incDisplacedAdult);
            pmsIncident.setIncDisplacedChildren(incDisplacedChildren);
            pmsIncident.setIncDemolishedStructure(incDemolishedStructure);
            pmsIncident.setIncType(incType);
            pmsIncident.setIncSourceLink(incSourceLink);
            pmsIncident.setIncTimeStamp(DateTool.convertStringToDate(incTimeStamp,DateTool.DD_MM_YYYY));
            pmsIncident.setLocLatitude(locLatitude);
            pmsIncident.setLocLongitude(locLongitude);
            pmsIncident.setUsername(username);
            pmsIncident.setTimeStamp(timeStamp);

            List insertList = new ArrayList();
            insertList.add(pmsIncident);
            new DataAccessObjectImpl().insertOrUpdate(insertList);

        } catch (Exception ce) {
            System.err.println("Error add a new PMS Incident: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error add a new PMS Incident :" + ce.getMessage()));
        }
        return retList;
    }
}
