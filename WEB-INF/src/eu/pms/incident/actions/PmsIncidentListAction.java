package eu.pms.incident.actions;


import eu.pms.activity.forms.PmsActivitySearchForm;
import eu.pms.activity.useCases.PmsActivityListUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.community.useCases.GetPmsCommunityTypeUseCase;
import eu.pms.community.useCases.GetPmsGovernateUseCase;
import eu.pms.incident.forms.PmsIncidentSearchForm;
import eu.pms.incident.useCases.PmsIncidentListUseCase;
import eu.pms.intervention.useCases.PmsInterventionListUseCase;
import eu.pms.project.useCases.GetPmsCommunityUseCase;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


public class PmsIncidentListAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");

        List communityList = (List) new GetPmsCommunityUseCase().execute(null, request);
        List governateList = (List) new GetPmsGovernateUseCase().execute(null, request);
        request.setAttribute("communityList", communityList);
        request.setAttribute("governateList", governateList);
        ArrayList inputData = new ArrayList();
        PmsIncidentSearchForm pmsIncidentSearchForm = (PmsIncidentSearchForm) form;
        if (pmsIncidentSearchForm != null) {
            inputData.add(pmsIncidentSearchForm.getIncidentType());
            inputData.add(pmsIncidentSearchForm.getCommunityId());
            inputData.add(pmsIncidentSearchForm.getGovId());
            inputData.add(pmsIncidentSearchForm.getIncFromDate());
            inputData.add(pmsIncidentSearchForm.getIncToDate());
        }
        request.setAttribute("pmsIncidentList", new PmsIncidentListUseCase().execute(inputData, request));

        return mapping.findForward("success");
    }
}

