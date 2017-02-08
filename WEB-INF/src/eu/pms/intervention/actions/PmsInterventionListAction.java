package eu.pms.intervention.actions;


import eu.pms.common.tools.SessionTraker;
import eu.pms.intervention.forms.PmsInterventionSearchForm;
import eu.pms.intervention.useCases.GetPmsMasterPlanUseCase;
import eu.pms.intervention.useCases.GetPmsSectorsUseCase;
import eu.pms.intervention.useCases.PmsInterventionListUseCase;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


public class PmsInterventionListAction extends Action
{

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        List sectorsList = (List) new GetPmsSectorsUseCase().execute(null, request);
        List masterPlanList = (List) new GetPmsMasterPlanUseCase().execute(null, request);
        request.setAttribute("sectorsList", sectorsList);
        request.setAttribute("masterPlanList", masterPlanList);
        ArrayList inputData = new ArrayList();
        PmsInterventionSearchForm pmsInterventionSearchForm = (PmsInterventionSearchForm) form;
        if (pmsInterventionSearchForm != null) {
            inputData.add(pmsInterventionSearchForm.getSecId());
            inputData.add(pmsInterventionSearchForm.getIntPriority());
            inputData.add(pmsInterventionSearchForm.getInterventionSource());
            inputData.add(pmsInterventionSearchForm.getMasId());
        }
        request.setAttribute("pmsInterventionList", new PmsInterventionListUseCase().execute(inputData, request));

        return mapping.findForward("success");
    }
}

