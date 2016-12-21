package eu.pms.result.actions;


import eu.pms.common.tools.SessionTraker;
import eu.pms.objective.useCases.GetPmsStrategicPlanDocUseCase;
import eu.pms.result.useCases.GetPmsObjectivesUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ViewAddPmsResultAction extends Action
{

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        List objectiveList = (List) new GetPmsObjectivesUseCase().execute(null, request);
        request.setAttribute("objectiveList", objectiveList);
        return mapping.findForward("success");
    }
}

