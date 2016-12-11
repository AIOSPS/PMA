package eu.pms.benificiary.actions;


import eu.pms.activity.forms.PmsActivityForm;
import eu.pms.activity.useCases.AddPmsActivityUseCase;
import eu.pms.benificiary.forms.PmsBenificiaryForm;
import eu.pms.benificiary.useCases.AddPmsBenificiaryUseCase;
import eu.pms.intervention.forms.PmsInterventionForm;
import eu.pms.intervention.useCases.AddPmsInterventionUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collection;

public class AddPmsBenificiaryAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        PmsBenificiaryForm pmsBenificiaryForm = (PmsBenificiaryForm) form;
        String benId = pmsBenificiaryForm.getBenId();
        String benDesc = pmsBenificiaryForm.getBenDesc();
        String btpId = pmsBenificiaryForm.getBtpId();
        int benTotal = pmsBenificiaryForm.getBenTotal();


        ArrayList inputs = new ArrayList();
        inputs.add(benId);
        inputs.add(benDesc);
        inputs.add(benTotal);
        inputs.add(btpId);

        Collection result = new AddPmsBenificiaryUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }

        return mapping.findForward("success");
    }
}

