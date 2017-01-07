package eu.pms.incident.actions;


import eu.pms.common.tools.SessionTraker;
import eu.pms.incident.forms.PmsIncidentByProjectSearchForm;
import eu.pms.incident.forms.PmsIncidentSearchForm;
import eu.pms.incident.useCases.PmsIncidentListByProjectUseCase;
import eu.pms.incident.useCases.PmsIncidentListUseCase;
import eu.pms.project.useCases.PmsProjectListUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


public class PmsIncidentListByProjectAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");

        List projectList = (List) new PmsProjectListUseCase().execute(null, request);
        request.setAttribute("projectList", projectList);

        ArrayList inputData = new ArrayList();
        PmsIncidentByProjectSearchForm pmsIncidentByProjectSearchForm = (PmsIncidentByProjectSearchForm) form;
        if (pmsIncidentByProjectSearchForm != null&&pmsIncidentByProjectSearchForm.getProId()!=null) {
            inputData.add(pmsIncidentByProjectSearchForm.getProId());
            request.setAttribute("pmsIncidentList", new PmsIncidentListByProjectUseCase().execute(inputData, request));
        }

        return mapping.findForward("success");
    }
}

