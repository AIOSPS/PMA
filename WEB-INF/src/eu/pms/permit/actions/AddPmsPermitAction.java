package eu.pms.permit.actions;


import eu.pms.activity.forms.PmsActivityForm;
import eu.pms.activity.useCases.AddPmsActivityUseCase;
import eu.pms.benificiary.forms.PmsBenificiaryForm;
import eu.pms.benificiary.useCases.AddPmsBenificiaryUseCase;
import eu.pms.intervention.forms.PmsInterventionForm;
import eu.pms.intervention.useCases.AddPmsInterventionUseCase;
import eu.pms.permit.forms.PmsPermitForm;
import eu.pms.permit.useCases.AddPmsPermitUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collection;

public class AddPmsPermitAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        PmsPermitForm pmsPermitForm = (PmsPermitForm) form;
        String perId = pmsPermitForm.getPerId();
        String perTitle = pmsPermitForm.getPerTitle();
        String perType = pmsPermitForm.getPerType();
        String perSubmitDate = pmsPermitForm.getPerSubmitDate();
        String perIssueDate = pmsPermitForm.getPerIssueDate();
        int perPeriod = pmsPermitForm.getPerPeriod();
        String perStatus = pmsPermitForm.getPerStatus();
        String perIssuingAgency = pmsPermitForm.getPerIssuingAgency();


        ArrayList inputs = new ArrayList();
        inputs.add(perId);
        inputs.add(perTitle);
        inputs.add(perType);
        inputs.add(perSubmitDate);
        inputs.add(perIssueDate);
        inputs.add(perPeriod);
        inputs.add(perStatus);
        inputs.add(perIssuingAgency);

        Collection result = new AddPmsPermitUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }

        return mapping.findForward("success");
    }
}

