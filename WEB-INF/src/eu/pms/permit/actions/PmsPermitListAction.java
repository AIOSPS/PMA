package eu.pms.permit.actions;


import eu.pms.activity.forms.PmsActivitySearchForm;
import eu.pms.activity.useCases.PmsActivityListUseCase;
import eu.pms.benificiary.forms.PmsBenificiarySearchForm;
import eu.pms.benificiary.useCases.GetPmsBenificiaryTypeUseCase;
import eu.pms.benificiary.useCases.PmsBenificiaryListUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.intervention.useCases.PmsInterventionListUseCase;
import eu.pms.permit.forms.PmsPermitSearchForm;
import eu.pms.permit.useCases.PmsPermitListUseCase;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


public class PmsPermitListAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");

        ArrayList inputData = new ArrayList();
        PmsPermitSearchForm pmsPermitSearchForm = (PmsPermitSearchForm) form;
        if (pmsPermitSearchForm != null) {
            inputData.add(pmsPermitSearchForm.getPermitTitle());
            inputData.add(pmsPermitSearchForm.getPermitType());
            inputData.add(pmsPermitSearchForm.getPermitStatus());
        }
        request.setAttribute("pmsPermitList", new PmsPermitListUseCase().execute(inputData, request));

        return mapping.findForward("success");
    }
}

