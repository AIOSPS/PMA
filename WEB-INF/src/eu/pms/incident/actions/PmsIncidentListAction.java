package eu.pms.incident.actions;


import eu.pms.activity.forms.PmsActivitySearchForm;
import eu.pms.activity.useCases.PmsActivityListUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.incident.forms.PmsIncidentSearchForm;
import eu.pms.incident.useCases.PmsIncidentListUseCase;
import eu.pms.intervention.useCases.PmsInterventionListUseCase;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;


public class PmsIncidentListAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        ArrayList inputData = new ArrayList();
        PmsIncidentSearchForm pmsIncidentSearchForm = (PmsIncidentSearchForm) form;
        if (pmsIncidentSearchForm != null) {
            inputData.add(pmsIncidentSearchForm.getIncidentType());
            inputData.add(pmsIncidentSearchForm.getIncidentOcha());
            inputData.add(pmsIncidentSearchForm.getIncidentDescription());
        }
        request.setAttribute("pmsIncidentList", new PmsIncidentListUseCase().execute(inputData, request));

        return mapping.findForward("success");
    }
}

