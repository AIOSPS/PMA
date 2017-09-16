package btc.pma.activity.actions;

import btc.pma.activity.forms.PmaActivityInfoForm;
import btc.pma.activity.useCases.*;
import btc.pma.indicator.useCases.PmaIndicatorListUseCase;
import btc.pma.programme.database.PmaActivityBeneficiar;
import btc.pma.programme.database.PmaActivityImplementer;
import btc.pma.programme.database.PmaActivityInfo;
import btc.pma.programme.database.PmaResult;
import btc.pma.programme.useCases.PmaProgrammeListUseCase;
import btc.pma.result.forms.PmaResultForm;
import btc.pma.result.useCases.GetPmaResultUseCase;
import btc.pma.result.useCases.PmaResultListUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.project.database.PmsProjectsLocation;
import eu.pms.project.useCases.GetPmsProjectLocationUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC on 9/15/2017.
 */
public class ViewPmaActivityAction  extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");

        List programmeList = (List) new PmaProgrammeListUseCase().execute(null, request);
        request.setAttribute("programmeList", programmeList);

        List resultList = (List) new PmaResultListUseCase().execute(null, request);
        request.setAttribute("resultList", resultList);

        List indrList = (List) new PmaIndicatorListUseCase().execute(null, request);
        request.setAttribute("indrList", indrList);

        List actClasList = (List) new PmaActivityClasListUseCase().execute(null, request);
        request.setAttribute("actClasList", actClasList);

        List implList = (List) new PmaImplementersListUseCase().execute(null, request);
        request.setAttribute("implList", implList);

        List benificiaryList = (List) new PmaBeneficiaryTypeListUseCase().execute(null, request);
        request.setAttribute("benificiaryList", benificiaryList);

        List communityList = (List) new PmaCommunityListUseCase().execute(null, request);
        request.setAttribute("communityList", communityList);


        String actvNo = request.getParameter("actvNo");
        String intrNo = request.getParameter("intrNo");

        ArrayList inputs = new ArrayList();
        inputs.add(actvNo);
        inputs.add(intrNo);


        List<PmaActivityImplementer> PmaActivityImplementerList = (List) new GetPmaActivityImplementerUseCase().execute(inputs, request);
        request.setAttribute("PmaActivityImplementerList", PmaActivityImplementerList!=null&&PmaActivityImplementerList.size()>0?PmaActivityImplementerList:null);

        List<PmaActivityBeneficiar> PmaActivityBeneficiaryList = (List) new GetPmaActivityBeneficiaryUseCase().execute(inputs, request);
        request.setAttribute("PmaActivityBeneficiaryList", PmaActivityBeneficiaryList!=null&&PmaActivityBeneficiaryList.size()>0?PmaActivityBeneficiaryList:null);

        List activityList = (List) new GetPmaActivityUseCase().execute(inputs, request);
        PmaActivityInfo pmaActivityInfo = null;
        if (activityList != null && activityList.size() > 0 && activityList.get(0) instanceof PmaActivityInfo) {
            pmaActivityInfo = (PmaActivityInfo) activityList.get(0);

            PmaActivityInfoForm pmaActivityInfoForm = (PmaActivityInfoForm) form;
            fillPmaActivityData(pmaActivityInfoForm, pmaActivityInfo);
        }

        return mapping.findForward("success");
    }

    private void fillPmaActivityData(PmaActivityInfoForm pmaActivityInfoForm, PmaActivityInfo pmaActivityInfo) {
        pmaActivityInfoForm.setActvNo(pmaActivityInfo.getComp_id().getActvNo());
        pmaActivityInfoForm.setIntrNo(pmaActivityInfo.getComp_id().getIntrNo());
        pmaActivityInfoForm.setActvLevel(pmaActivityInfo.getActvLevel());
        pmaActivityInfoForm.setActvImplementingPartner(pmaActivityInfo.getActvImplementingPartner());
        pmaActivityInfoForm.setClasCode(pmaActivityInfo.getClasCode());
        pmaActivityInfoForm.setActvProposedStartDate(pmaActivityInfo.getActvProposedStartDateStr());
        pmaActivityInfoForm.setActvProposedEndDate(pmaActivityInfo.getActvProposedEndDateStr());
        pmaActivityInfoForm.setActvActualStartDate(pmaActivityInfo.getActvActualStartDateStr());
        pmaActivityInfoForm.setActvActualEndDate(pmaActivityInfo.getActvActualEndDateStr());
        pmaActivityInfoForm.setActvTitle(pmaActivityInfo.getActvTitle());
        pmaActivityInfoForm.setActvBudget(pmaActivityInfo.getActvBudget());
        pmaActivityInfoForm.setRsltNo(pmaActivityInfo.getRsltNo());
        pmaActivityInfoForm.setActvStatus(pmaActivityInfo.getActvStatus());
        pmaActivityInfoForm.setActvResponsibility(pmaActivityInfo.getActvResponsibility());
        pmaActivityInfoForm.setIndrNo(pmaActivityInfo.getIndrNo());
        pmaActivityInfoForm.setActvLessonsLearned(pmaActivityInfo.getActvLessonsLearned());
        pmaActivityInfoForm.setActChallenges(pmaActivityInfo.getActChallenges());
        pmaActivityInfoForm.setActvSummaryDescription(pmaActivityInfo.getActvSummaryDescription());
        pmaActivityInfoForm.setActvTotalCost(pmaActivityInfo.getActvTotalCost());
    }
}


