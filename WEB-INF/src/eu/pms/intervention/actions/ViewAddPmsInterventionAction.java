package eu.pms.intervention.actions;


import eu.pms.common.tools.SessionTraker;
import eu.pms.community.useCases.GetPmsCommunityTypeUseCase;
import eu.pms.intervention.useCases.GetPmsMasterPlanUseCase;
import eu.pms.intervention.useCases.GetPmsSectorsUseCase;
import eu.pms.intervention.useCases.GetPmsSubSectorsUseCase;
import eu.pms.project.useCases.*;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ViewAddPmsInterventionAction extends Action
{

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        List masterPlanList = (List) new GetPmsMasterPlanUseCase().execute(null, request);
        List sectorsList = (List) new GetPmsSectorsUseCase().execute(null, request);
        //List subSectorsList = (List) new GetPmsSubSectorsUseCase().execute(null, request);
        request.setAttribute("masterPlanList", masterPlanList);
        request.setAttribute("sectorsList", sectorsList);

        return mapping.findForward("success");
    }
}

