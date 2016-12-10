package eu.pms.activity.actions;


import eu.pms.activity.forms.PmsActivitySearchForm;
import eu.pms.activity.useCases.PmsActivityListUseCase;
import eu.pms.intervention.useCases.PmsInterventionListUseCase;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;


public class PmsActivityListAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        ArrayList inputData = new ArrayList();
        PmsActivitySearchForm pmsActivitySearchForm = (PmsActivitySearchForm) form;
        if (pmsActivitySearchForm != null) {
            inputData.add(pmsActivitySearchForm.getActivityDesc());
            inputData.add(pmsActivitySearchForm.getActivityUnit());
            inputData.add(pmsActivitySearchForm.getEstimateBudget());
        }
        request.setAttribute("pmsActivityList", new PmsActivityListUseCase().execute(inputData, request));

        return mapping.findForward("success");
    }
}

