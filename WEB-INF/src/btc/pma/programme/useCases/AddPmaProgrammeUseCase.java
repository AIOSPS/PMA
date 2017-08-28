package btc.pma.programme.useCases;

import btc.pma.programme.database.PmaProgrammeInfo;
import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.tools.DateTool;
import eu.pms.common.useCase.ComponentUseCase;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created by PC on 8/28/2017.
 */
public class AddPmaProgrammeUseCase  implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        try {
            Iterator itr = input.iterator();
            String intrNo = (String) itr.next();
            String intrTitle = (String) itr.next();
            int intrDuration = (Integer) itr.next();
            String intrDescription = (String) itr.next();
            String btcNavisionCode = (String) itr.next();
            String partInstitution = (String) itr.next();
            int agrmDuration = (Integer) itr.next();
            String estmStartDate = (String) itr.next();
            int contPartnerCountry = (Integer) itr.next();
            int belgContribution = (Integer) itr.next();
            String secCode = (String) itr.next();
            String oallObjective = (String) itr.next();
            String agrmSignDate = (String) itr.next();
            String username = "pma";
            Date timeStamp = new Date();

            PmaProgrammeInfo pmaProgrammeInfo = new PmaProgrammeInfo();
            pmaProgrammeInfo.setIntrNo(intrNo);
            pmaProgrammeInfo.setIntrTitle(intrTitle);
            pmaProgrammeInfo.setIntrDuration(intrDuration);
            pmaProgrammeInfo.setIntrDescription(intrDescription);
            pmaProgrammeInfo.setBtcNavisionCode(btcNavisionCode);
            pmaProgrammeInfo.setPartInstitution(partInstitution);
            pmaProgrammeInfo.setAgrmDuration(agrmDuration);
            pmaProgrammeInfo.setEstmStartDate(DateTool.convertStringToDate(estmStartDate,DateTool.DD_MM_YYYY));
            pmaProgrammeInfo.setContPartnerCountry(contPartnerCountry);
            pmaProgrammeInfo.setBelgContribution(belgContribution);
            pmaProgrammeInfo.setSecCode(secCode);
            pmaProgrammeInfo.setOallObjective(oallObjective);
            pmaProgrammeInfo.setAgrmSignDate(DateTool.convertStringToDate(agrmSignDate,DateTool.DD_MM_YYYY));
            pmaProgrammeInfo.setUsername(username);
            pmaProgrammeInfo.setTimeStamp(timeStamp);

            List insertList = new ArrayList();
            insertList.add(pmaProgrammeInfo);
            new DataAccessObjectImpl().insertOrUpdate(insertList);

        } catch (Exception ce) {
            System.err.println("Error add a new PMA Programme: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error add a new PMA Programme :" + ce.getMessage()));
        }
        return retList;
    }
}
