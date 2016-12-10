package eu.pms.community.actions;


import eu.pms.common.tools.SessionTraker;
import eu.pms.community.forms.PmsCommunitySearchForm;
import eu.pms.community.useCases.PmsCommunityListUseCase;
import eu.pms.login.components.LoginComponent;
import eu.pms.login.forms.LoginForm;
import eu.pms.project.useCases.PmsProjectListUseCase;
import org.apache.struts.action.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

public class PmsCommunityListAction extends Action
{

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
//        if (!(SessionTraker.isSessionExist(request)))
//            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");

        ArrayList inputData = new ArrayList();
        PmsCommunitySearchForm pmsCommunitySearchForm = (PmsCommunitySearchForm) form;
        if (pmsCommunitySearchForm != null) {
            inputData.add(pmsCommunitySearchForm.getCommunityName());
            inputData.add(pmsCommunitySearchForm.getCommunityPcbsCode());
            inputData.add(pmsCommunitySearchForm.getCommunityOchaCode());
            inputData.add(pmsCommunitySearchForm.getCommunityTopology());
        }
        request.setAttribute("pmsCommunityList", new PmsCommunityListUseCase().execute(inputData, request));

        return mapping.findForward("success");
    }
}

