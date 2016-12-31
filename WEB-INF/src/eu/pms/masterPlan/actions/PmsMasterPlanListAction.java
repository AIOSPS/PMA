package eu.pms.masterPlan.actions;


import eu.pms.common.tools.SessionTraker;
import eu.pms.masterPlan.forms.PmsMasterPlanSearchForm;
import eu.pms.masterPlan.useCases.PmsMasterPlanListUseCase;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class PmsMasterPlanListAction extends Action
{

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        ArrayList inputData = new ArrayList();
        PmsMasterPlanSearchForm pmsMasterPlanSearchForm = (PmsMasterPlanSearchForm) form;
        if (pmsMasterPlanSearchForm != null) {
            inputData.add(pmsMasterPlanSearchForm.getMasterPlanNo());
            inputData.add(pmsMasterPlanSearchForm.getMasterPlanName());
        }
        request.setAttribute("pmsMasterPlanList", new PmsMasterPlanListUseCase().execute(inputData, request));

        return mapping.findForward("success");
    }
}

