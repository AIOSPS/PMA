package btc.pma.activity.actions;

import btc.pma.activity.forms.PmaActivityInfoForm;
import btc.pma.activity.useCases.AddPmaActivityUseCase;
import btc.pma.programme.database.PmaActivityBeneficiar;
import btc.pma.programme.database.PmaActivityBeneficiarPK;
import btc.pma.programme.database.PmaActivityImplementer;
import btc.pma.programme.database.PmaActivityImplementerPK;
import eu.pms.common.tools.SessionTraker;
import eu.pms.login.database.SecUser;
import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/**
 * Created by PC on 9/11/2017.
 */
public class AddPmaActivityAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        PmaActivityInfoForm pmaActivityInfoForm = (PmaActivityInfoForm) form;
        String actvNo = pmaActivityInfoForm.getActvNo();
        String intrNo = pmaActivityInfoForm.getIntrNo();
        String actvLevel = pmaActivityInfoForm.getActvLevel();
        String actvImplementingPartner = pmaActivityInfoForm.getActvImplementingPartner();
        String actvTitle = pmaActivityInfoForm.getActvTitle();
        String actvSummaryDescription = pmaActivityInfoForm.getActvSummaryDescription();
        String actvStatus = pmaActivityInfoForm.getActvStatus();
        String actvProposedStartDate = pmaActivityInfoForm.getActvProposedStartDate();
        String actvProposedEndDate = pmaActivityInfoForm.getActvProposedEndDate();
        long actvBudget = pmaActivityInfoForm.getActvBudget();
        String actvActualStartDate = pmaActivityInfoForm.getActvActualStartDate();
        String actvActualEndDate = pmaActivityInfoForm.getActvActualEndDate();
        long actvTotalCost = pmaActivityInfoForm.getActvTotalCost();
        String actvResponsibility = pmaActivityInfoForm.getActvResponsibility();
        String actvLessonsLearned = pmaActivityInfoForm.getActvLessonsLearned();
        String actChallenges = pmaActivityInfoForm.getActChallenges();
        String indrNo = pmaActivityInfoForm.getIndrNo();
        String rsltNo = pmaActivityInfoForm.getRsltNo();
        String clasCode = pmaActivityInfoForm.getClasCode();

        ArrayList inputs = new ArrayList();
        inputs.add(actvNo);
        inputs.add(intrNo);
        inputs.add(actvLevel);
        inputs.add(actvImplementingPartner);
        inputs.add(actvTitle);
        inputs.add(actvSummaryDescription);
        inputs.add(actvStatus);
        inputs.add(actvProposedStartDate);
        inputs.add(actvProposedEndDate);
        inputs.add(actvBudget);
        inputs.add(actvActualStartDate);
        inputs.add(actvActualEndDate);
        inputs.add(actvTotalCost);
        inputs.add(actvResponsibility);
        inputs.add(actvLessonsLearned);
        inputs.add(actChallenges);
        inputs.add(indrNo);
        inputs.add(rsltNo);
        inputs.add(clasCode);

        ArrayList impList=new ArrayList();
        Map<String, String[]> parameters = request.getParameterMap();
        String username = ((SecUser)request.getSession().getAttribute("userInfo")).getUsrId();
        Date timeStamp = new Date();
        int count=1;
        for(String parameter : parameters.keySet()) {
            PmaActivityImplementerPK pmaActivityImplementerPK= new PmaActivityImplementerPK();
            PmaActivityImplementer pmaActivityImplementer= new PmaActivityImplementer();
            if(parameters.containsKey("actImplmnt"+count)) {
                pmaActivityImplementerPK.setActvNo(actvNo);
//                DecimalFormatSymbols symbols = new DecimalFormatSymbols();
//                symbols.setGroupingSeparator(',');
//                symbols.setDecimalSeparator('.');
//                String pattern = "#,##0.0#";
//                DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
//                decimalFormat.setParseBigDecimal(true);
//                BigDecimal comLatitude = (BigDecimal) decimalFormat.parse(parameters.get("comLatitude"+count)[0]);
                pmaActivityImplementerPK.setIntrNo(intrNo);
                pmaActivityImplementerPK.setImpId(parameters.get("actImplmnt"+count)[0]);
//                BigDecimal comLongitude = (BigDecimal) decimalFormat.parse(parameters.get("comLongitude"+count)[0]);
                pmaActivityImplementer.setComp_id(pmaActivityImplementerPK);
                String actCostStr = (String) parameters.get("actCost"+count)[0];
                long actCost= Long.valueOf(actCostStr).longValue();
                pmaActivityImplementer.setImplCost(actCost);
                pmaActivityImplementer.setComId(parameters.get("actCommunity"+count)[0]);
                pmaActivityImplementer.setUsername(username);
                pmaActivityImplementer.setTimeStamp(timeStamp);
                impList.add(pmaActivityImplementer);
                count++;
            }
        }
        inputs.add(impList);

        ArrayList penificiaryList=new ArrayList();
        count=1;
        for(String parameter : parameters.keySet()) {
            PmaActivityBeneficiarPK pmaActivityBeneficiarPK= new PmaActivityBeneficiarPK();
            PmaActivityBeneficiar pmaActivityBeneficiar= new PmaActivityBeneficiar();
            if(parameters.containsKey("btpId"+count)) {
                pmaActivityBeneficiarPK.setActvNo(actvNo);
                pmaActivityBeneficiarPK.setIntrNo(intrNo);
                pmaActivityBeneficiarPK.setBtpId(parameters.get("btpId"+count)[0]);
                pmaActivityBeneficiar.setComp_id(pmaActivityBeneficiarPK);
                String benTotalStr =parameters.get("benTotal"+count)[0];
                pmaActivityBeneficiar.setBeneCount(benTotalStr);
//                Integer benTotal=null;
//                try {
//                    benTotal = Integer.parseInt(benTotalStr);
//                    pmsProjectsBenificiary.setBenTotal(benTotal);
//                }catch (NumberFormatException nfe){
//
//                }

                pmaActivityBeneficiar.setUsername(username);
                pmaActivityBeneficiar.setTimeStamp(timeStamp);
                penificiaryList.add(pmaActivityBeneficiar);
                count++;
            }
        }
        inputs.add(penificiaryList);

        Collection result = new AddPmaActivityUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }
        pmaActivityInfoForm.reset(mapping, request);
        return mapping.findForward("success");
    }
}

