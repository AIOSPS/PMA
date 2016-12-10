package eu.pms.project.actions;


import eu.pms.login.components.LoginComponent;
import eu.pms.login.forms.LoginForm;
import eu.pms.project.forms.PmsProjectSearchForm;
import eu.pms.project.useCases.PmsProjectListUseCase;
import org.apache.struts.action.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

public class PmsProjectListAction extends Action
{

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        ArrayList inputData = new ArrayList();
        PmsProjectSearchForm pmsProjectSearchForm = (PmsProjectSearchForm) form;
        if (pmsProjectSearchForm != null) {
            inputData.add(pmsProjectSearchForm.getProjectTitle());
            inputData.add(pmsProjectSearchForm.getProjectDescription());
            inputData.add(pmsProjectSearchForm.getProjectStatus());
            inputData.add(pmsProjectSearchForm.getProjectStartDate());
            inputData.add(pmsProjectSearchForm.getProjectEndDate());
            inputData.add(pmsProjectSearchForm.getProjectNeedPermit());
            inputData.add(pmsProjectSearchForm.getProjectHasCluster());
        }
        request.setAttribute("pmsProjectList", new PmsProjectListUseCase().execute(inputData, request));

        return mapping.findForward("success");
    }
}

