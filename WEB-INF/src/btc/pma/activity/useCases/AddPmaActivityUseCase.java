package btc.pma.activity.useCases;

import btc.pma.programme.database.PmaActivityBeneficiar;
import btc.pma.programme.database.PmaActivityImplementer;
import btc.pma.programme.database.PmaActivityInfo;
import btc.pma.programme.database.PmaActivityInfoPK;
import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.tools.DateTool;
import eu.pms.common.useCase.ComponentUseCase;
import eu.pms.login.database.SecUser;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by PC on 9/12/2017.
 */
public class AddPmaActivityUseCase  implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        try {
            Iterator itr = input.iterator();
            String actvNo = (String) itr.next();
            String intrNo = (String) itr.next();
            String actvLevel = (String) itr.next();
            String actvImplementingPartner = (String) itr.next();
            String actvTitle = (String) itr.next();
            String actvSummaryDescription = (String) itr.next();
            String actvStatus = (String) itr.next();
            String actvProposedStartDate = (String) itr.next();
            String actvProposedEndDate = (String) itr.next();
            String actvBudgetStr = (String) itr.next();
            long actvBudget = Long.valueOf(actvBudgetStr).longValue();
            String actvActualStartDate = (String) itr.next();
            String actvActualEndDate = (String) itr.next();
            String actvTotalCostStr = (String) itr.next();
            long actvTotalCost = Long.valueOf(actvTotalCostStr).longValue();
            String actvResponsibility = (String) itr.next();
            String actvLessonsLearned = (String) itr.next();
            String actChallenges = (String) itr.next();
            String indrNo = (String) itr.next();
            String rsltNo = (String) itr.next();
            String clasCode = (String) itr.next();
            ArrayList impList = (ArrayList) itr.next();
            ArrayList penificiaryList = (ArrayList) itr.next();

            String username = ((SecUser)request.getSession().getAttribute("userInfo")).getUsrId();
            Date timeStamp = new Date();
            PmaActivityInfoPK pmaActivityInfoPK = new PmaActivityInfoPK();
            pmaActivityInfoPK.setActvNo(actvNo);
            pmaActivityInfoPK.setIntrNo(intrNo);

            PmaActivityInfo pmaActivityInfo = new PmaActivityInfo();
            pmaActivityInfo.setComp_id(pmaActivityInfoPK);
            pmaActivityInfo.setActvLevel(actvLevel);
            pmaActivityInfo.setActvImplementingPartner(actvImplementingPartner);
            pmaActivityInfo.setActvTitle(actvTitle);
            pmaActivityInfo.setActvSummaryDescription(actvSummaryDescription);
            pmaActivityInfo.setActvStatus(actvStatus);
            pmaActivityInfo.setActvProposedStartDate(DateTool.convertStringToDate(actvProposedStartDate,DateTool.DD_MM_YYYY));
            pmaActivityInfo.setActvProposedEndDate(DateTool.convertStringToDate(actvProposedEndDate,DateTool.DD_MM_YYYY));
            pmaActivityInfo.setActvBudget(actvBudget);
            pmaActivityInfo.setActvActualStartDate(DateTool.convertStringToDate(actvActualStartDate,DateTool.DD_MM_YYYY));
            pmaActivityInfo.setActvActualEndDate(DateTool.convertStringToDate(actvActualEndDate,DateTool.DD_MM_YYYY));
            pmaActivityInfo.setActvTotalCost(actvTotalCost);
            pmaActivityInfo.setActvResponsibility(actvResponsibility);
            pmaActivityInfo.setActvLessonsLearned(actvLessonsLearned);
            pmaActivityInfo.setActChallenges(actChallenges);
            pmaActivityInfo.setIndrNo(indrNo);
            pmaActivityInfo.setRsltNo(rsltNo);
            pmaActivityInfo.setClasCode(clasCode);
            pmaActivityInfo.setUsername(username);
            pmaActivityInfo.setTimeStamp(timeStamp);


            List insertList = new ArrayList();
            insertList.add(pmaActivityInfo);


            new DataAccessObjectImpl().deleteAsSelect("from btc.pma.programme.database.PmaActivityImplementer a where a.comp_id.actvNo='"+actvNo+"'");

            new DataAccessObjectImpl().deleteAsSelect("from btc.pma.programme.database.PmaActivityBeneficiar a where a.comp_id.actvNo='"+actvNo+"'");

            if(impList!=null && impList.size()>0) {
                Iterator itrInd = impList.iterator();
                while (itrInd.hasNext()) {
                    insertList.add((PmaActivityImplementer) itrInd.next());
                }
            }
            if(penificiaryList!=null && penificiaryList.size()>0) {
                Iterator itrInd = penificiaryList.iterator();
                while (itrInd.hasNext()) {
                    insertList.add((PmaActivityBeneficiar) itrInd.next());
                }
            }

            new DataAccessObjectImpl().insertOrUpdate(insertList);

        } catch (Exception ce) {
            System.err.println("Error add a new PMA Activity: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error add a new PMA Activity :" + ce.getMessage()));
        }
        return retList;
    }
}
