package eu.pms.activity.actions;


import eu.pms.activity.forms.PmsActivityForm;
import eu.pms.activity.useCases.AddPmsActivityUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.intervention.forms.PmsInterventionForm;
import eu.pms.intervention.useCases.AddPmsInterventionUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public class AddPmsActivityAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        PmsActivityForm pmsActivityForm = (PmsActivityForm) form;
        String actId = pmsActivityForm.getActId();
        String intId = pmsActivityForm.getIntId();
        String secId = pmsActivityForm.getSecId();
        String actDesc = pmsActivityForm.getActDesc();
        String actUnit = pmsActivityForm.getActUnit();
        BigDecimal actUnitQty = pmsActivityForm.getActUnitQty();
        int actEstimatedBudget = pmsActivityForm.getActEstimatedBudget();


        ArrayList inputs = new ArrayList();
        inputs.add(actId);
        inputs.add(intId);
        inputs.add(secId);
        inputs.add(actDesc);
        inputs.add(actUnit);
        inputs.add(actUnitQty);
        inputs.add(actEstimatedBudget);

        Collection result = new AddPmsActivityUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }

        return mapping.findForward("success");
    }
}

