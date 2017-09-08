package btc.pma.indicator.useCases;

import btc.pma.programme.database.PmaIndicator;
import btc.pma.programme.database.PmaIndicatorDetail;
import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.tools.DateTool;
import eu.pms.common.useCase.ComponentUseCase;
import eu.pms.login.database.SecUser;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created by PC on 9/8/2017.
 */
public class AddPmaIndicatorUseCase  implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        try {
            Iterator itr = input.iterator();
            String indrNo = (String) itr.next();
            if (indrNo == null || indrNo.equals("")){
                indrNo = eu.pms.common.tools.Randomizer.randomIntegers(10).toString();
            }
            String indrDefinition = (String) itr.next();
            String indrBaseline = (String) itr.next();
            String indrDefineDate = (String) itr.next();
            String indrClosedDate = (String) itr.next();
            String indrStatus = (String) itr.next();
            String indrTargetPlaned = (String) itr.next();
            String indrDataCollMethod = (String) itr.next();
            String indrTool = (String) itr.next();
            String indrFrequency = (String) itr.next();
            String indrResponsibilities = (String) itr.next();
            String indrTargetAcheived = (String) itr.next();
            String indrType = (String) itr.next();
            String rsltNo = (String) itr.next();
            String intrNo = (String) itr.next();
            ArrayList indicatorMeasuresList = (ArrayList) itr.next();
            String username = ((SecUser)request.getSession().getAttribute("userInfo")).getUsrId();
            Date timeStamp = new Date();

            PmaIndicator pmaIndicator = new PmaIndicator();
            pmaIndicator.setIndrNo(indrNo);
            pmaIndicator.setIndrDefinition(indrDefinition);
            pmaIndicator.setIndrBaseline(indrBaseline);
            pmaIndicator.setIndrDefineDate(DateTool.convertStringToDate(indrDefineDate,DateTool.DD_MM_YYYY));
            pmaIndicator.setIndrClosedDate(DateTool.convertStringToDate(indrClosedDate,DateTool.DD_MM_YYYY));
            pmaIndicator.setIndrStatus(indrStatus);
            pmaIndicator.setIndrTargetPlaned(indrTargetPlaned);
            pmaIndicator.setIndrDataCollMethod(indrDataCollMethod);
            pmaIndicator.setIndrTool(indrTool);
            pmaIndicator.setIndrFrequency(indrFrequency);
            pmaIndicator.setIndrResponsibilities(indrResponsibilities);
            pmaIndicator.setIndrTargetAcheived(indrTargetAcheived);
            pmaIndicator.setIndrType(indrType);
            pmaIndicator.setRsltNo(rsltNo);
            pmaIndicator.setIntrNo(intrNo);
            pmaIndicator.setUserName(username);
            pmaIndicator.setTimeStamp(timeStamp);



            List insertList = new ArrayList();
            insertList.add(pmaIndicator);
            new DataAccessObjectImpl().deleteAsSelect("from btc.pma.programme.database.PmaIndicatorDetail a where a.comp_id.indrNo='"+indrNo+"' ");
            if(indicatorMeasuresList!=null && indicatorMeasuresList.size()>0) {
                Iterator itrInd = indicatorMeasuresList.iterator();
                while (itrInd.hasNext()) {
                    insertList.add((PmaIndicatorDetail) itrInd.next());
                }
            }
            new DataAccessObjectImpl().insertOrUpdate(insertList);

        } catch (Exception ce) {
            System.err.println("Error add a new PMA Indicator: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error add a new PMA Indicator :" + ce.getMessage()));
        }
        return retList;
    }
}
