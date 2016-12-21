package eu.pms.permit.actions;


import eu.pms.activity.forms.PmsActivityForm;
import eu.pms.activity.useCases.GetPmsActivityUseCase;
import eu.pms.activity.useCases.GetPmsInterventionUseCase;
import eu.pms.benificiary.forms.PmsBenificiaryForm;
import eu.pms.benificiary.useCases.GetPmsBenificiaryTypeUseCase;
import eu.pms.benificiary.useCases.GetPmsBenificiaryUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.intervention.useCases.GetPmsSectorsUseCase;
import eu.pms.permit.forms.PmsPermitForm;
import eu.pms.permit.useCases.GetPmsPermitUseCase;
import eu.pms.project.database.PmsActivity;
import eu.pms.project.database.PmsBenificiary;
import eu.pms.project.database.PmsIntervention;
import eu.pms.project.database.PmsPermit;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class ViewPmsPermitAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        String perId = request.getParameter("perId");
        ArrayList inputs = new ArrayList();
        inputs.add(perId);
        List permitList = (List) new GetPmsPermitUseCase().execute(inputs, request);
        PmsPermit pmsPermit = null;
        if (permitList != null && permitList.size() > 0 && permitList.get(0) instanceof PmsPermit) {
            pmsPermit = (PmsPermit) permitList.get(0);

            PmsPermitForm pmsPermitForm = (PmsPermitForm) form;
            fillPmsActivityData(pmsPermitForm, pmsPermit);
        }


        return mapping.findForward("success");
    }

    private void fillPmsActivityData(PmsPermitForm pmsPermitForm, PmsPermit pmsPermit) {
        pmsPermitForm.setPerId(pmsPermit.getPerId());
        pmsPermitForm.setPerTitle(pmsPermit.getPerTitle());
        pmsPermitForm.setPerType(pmsPermit.getPerType());
        pmsPermitForm.setPerSubmitDate(pmsPermit.getPerSubmitDateStr());
        pmsPermitForm.setPerIssueDate(pmsPermit.getPerIssueDateStr());
        pmsPermitForm.setPerPeriod(pmsPermit.getPerPeriod());
        pmsPermitForm.setPerStatus(pmsPermit.getPerStatus());
        pmsPermitForm.setPerIssuingAgency(pmsPermit.getPerIssuingAgency());
    }
}

