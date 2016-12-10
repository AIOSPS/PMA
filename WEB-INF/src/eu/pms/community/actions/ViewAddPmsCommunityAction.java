package eu.pms.community.actions;


import eu.pms.community.useCases.GetPmsCommunityTypeUseCase;
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
        List communityTypeList = (List) new GetPmsCommunityTypeUseCase().execute(null, request);
        List locationList = (List) new GetPmsLocationUseCase().execute(null, request);
        request.setAttribute("communityTypeList", communityTypeList);
        request.setAttribute("locationList", locationList);

        return mapping.findForward("success");
    }
}

