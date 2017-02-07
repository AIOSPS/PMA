package eu.pms.warnings.actions;


import eu.pms.activity.forms.PmsActivitySearchForm;
import eu.pms.activity.useCases.PmsActivityListUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.intervention.useCases.PmsInterventionListUseCase;
import eu.pms.warnings.forms.PmsWarningSearchForm;
import eu.pms.warnings.useCases.PmsWarningListUseCase;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;


public class PmsWarningListAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        ArrayList inputData = new ArrayList();
        PmsWarningSearchForm pmsWarningSearchForm = (PmsWarningSearchForm) form;
        if (pmsWarningSearchForm != null) {
            inputData.add(pmsWarningSearchForm.getWarningNo());
            inputData.add(pmsWarningSearchForm.getWarningName());
            inputData.add(pmsWarningSearchForm.getWarnedId());
        }
        request.setAttribute("pmsWarningList", new PmsWarningListUseCase().execute(inputData, request));

        return mapping.findForward("success");
    }
}

