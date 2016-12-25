package eu.pms.community.actions;


import eu.pms.common.tools.SessionTraker;
import eu.pms.community.useCases.GetPmsCommunityTypeUseCase;
import eu.pms.community.useCases.GetPmsGovernateUseCase;
import eu.pms.project.useCases.*;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ViewAddPmsCommunityAction extends Action
{

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        List communityTypeList = (List) new GetPmsCommunityTypeUseCase().execute(null, request);
        List governateList = (List) new GetPmsGovernateUseCase().execute(null, request);
        request.setAttribute("communityTypeList", communityTypeList);
        request.setAttribute("governateList", governateList);

        return mapping.findForward("success");
    }
}

