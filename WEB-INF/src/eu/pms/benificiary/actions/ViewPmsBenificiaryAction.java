package eu.pms.benificiary.actions;


import eu.pms.activity.forms.PmsActivityForm;
import eu.pms.activity.useCases.GetPmsActivityUseCase;
import eu.pms.activity.useCases.GetPmsInterventionUseCase;
import eu.pms.benificiary.forms.PmsBenificiaryForm;
import eu.pms.benificiary.useCases.GetPmsBenificiaryTypeUseCase;
import eu.pms.benificiary.useCases.GetPmsBenificiaryUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.intervention.useCases.GetPmsSectorsUseCase;
import eu.pms.project.database.PmsActivity;
import eu.pms.project.database.PmsBenificiary;
import eu.pms.project.database.PmsIntervention;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class ViewPmsBenificiaryAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        List benificiaryTypeList = (List) new GetPmsBenificiaryTypeUseCase().execute(null, request);
        request.setAttribute("benificiaryTypeList", benificiaryTypeList);

        String benId = request.getParameter("benId");
        ArrayList inputs = new ArrayList();
        inputs.add(benId);
        List benificiaryList = (List) new GetPmsBenificiaryUseCase().execute(inputs, request);
        PmsBenificiary pmsBenificiary = null;
        if (benificiaryList != null && benificiaryList.size() > 0 && benificiaryList.get(0) instanceof PmsBenificiary) {
            pmsBenificiary = (PmsBenificiary) benificiaryList.get(0);

            PmsBenificiaryForm pmsBenificiaryForm = (PmsBenificiaryForm) form;
            fillPmsActivityData(pmsBenificiaryForm, pmsBenificiary);
        }


        return mapping.findForward("success");
    }

    private void fillPmsActivityData(PmsBenificiaryForm pmsBenificiaryForm, PmsBenificiary pmsBenificiary) {
        pmsBenificiaryForm.setBenId(pmsBenificiary.getBenId());
        pmsBenificiaryForm.setBenDesc(pmsBenificiary.getBenDesc());
        pmsBenificiaryForm.setBenTotal(pmsBenificiary.getBenTotal());
        pmsBenificiaryForm.setBtpId(pmsBenificiary.getBtpId());
    }
}

