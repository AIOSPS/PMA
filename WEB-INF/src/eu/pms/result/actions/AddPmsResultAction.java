package eu.pms.result.actions;


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
import eu.pms.project.database.PmsResult;
import eu.pms.result.forms.PmsResultForm;
import eu.pms.result.useCases.AddPmsResultUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collection;

public class AddPmsResultAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        PmsResultForm pmsResultForm = (PmsResultForm) form;
        String resId = pmsResultForm.getObjId();
        String objId = pmsResultForm.getObjId();
        String resDesc = pmsResultForm.getResDesc();
        String resLongDesc = pmsResultForm.getResLongDesc();
        String resDefineDate = pmsResultForm.getResDefineDate();
        String resStatus = pmsResultForm.getResStatus();
        String resCloseDate = pmsResultForm.getResCloseDate();


        ArrayList inputs = new ArrayList();
        inputs.add(resId);
        inputs.add(objId);
        inputs.add(resDesc);
        inputs.add(resLongDesc);
        inputs.add(resDefineDate);
        inputs.add(resStatus);
        inputs.add(resCloseDate);

        Collection result = new AddPmsResultUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }

        return mapping.findForward("success");
    }
}

