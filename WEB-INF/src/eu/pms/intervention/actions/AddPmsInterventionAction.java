package eu.pms.intervention.actions;


import eu.pms.common.tools.SessionTraker;
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

public class AddPmsInterventionAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        PmsInterventionForm pmsInterventionForm = (PmsInterventionForm) form;
        String intId = pmsInterventionForm.getIntId();
        String secId = pmsInterventionForm.getSecId();
        String masId = pmsInterventionForm.getMasId();
        String intDesc = pmsInterventionForm.getIntDesc();
        int intEstimatedBudget = pmsInterventionForm.getIntEstimatedBudget();
        String intSource = pmsInterventionForm.getIntSource();
        String intPriority = pmsInterventionForm.getIntPriority();


        ArrayList inputs = new ArrayList();
        inputs.add(intId);
        inputs.add(secId);
        inputs.add(masId);
        inputs.add(intDesc);
        inputs.add(intEstimatedBudget);
        inputs.add(intSource);
        inputs.add(intPriority);

        Collection result = new AddPmsInterventionUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }

        return mapping.findForward("success");
    }
}

