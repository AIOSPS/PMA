package eu.pms.objective.actions;


import eu.pms.activity.forms.PmsActivityForm;
import eu.pms.activity.useCases.AddPmsActivityUseCase;
import eu.pms.benificiary.forms.PmsBenificiaryForm;
import eu.pms.benificiary.useCases.AddPmsBenificiaryUseCase;
import eu.pms.intervention.forms.PmsInterventionForm;
import eu.pms.intervention.useCases.AddPmsInterventionUseCase;
import eu.pms.objective.forms.PmsObjectiveForm;
import eu.pms.objective.useCases.AddPmsObjectiveUseCase;
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

public class AddPmsObjectiveAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        PmsObjectiveForm pmsObjectiveForm = (PmsObjectiveForm) form;
        String objId = pmsObjectiveForm.getObjId();
        String objDesc = pmsObjectiveForm.getObjDesc();
        String objLongDesc = pmsObjectiveForm.getObjLongDesc();
        String objDefineDate = pmsObjectiveForm.getObjDefineDate();
        String objStatus = pmsObjectiveForm.getObjStatus();
        String objCloseDate = pmsObjectiveForm.getObjCloseDate();
        String ojbUserId = pmsObjectiveForm.getOjbUserId();
        String strDocId = pmsObjectiveForm.getStrDocId();


        ArrayList inputs = new ArrayList();
        inputs.add(objId);
        inputs.add(objDesc);
        inputs.add(objLongDesc);
        inputs.add(objDefineDate);
        inputs.add(objStatus);
        inputs.add(objCloseDate);
        inputs.add(ojbUserId);
        inputs.add(strDocId);

        Collection result = new AddPmsObjectiveUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }

        return mapping.findForward("success");
    }
}

