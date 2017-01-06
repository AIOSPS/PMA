package eu.pms.objective.actions;


import eu.pms.activity.forms.PmsActivitySearchForm;
import eu.pms.activity.useCases.PmsActivityListUseCase;
import eu.pms.benificiary.forms.PmsBenificiarySearchForm;
import eu.pms.benificiary.useCases.GetPmsBenificiaryTypeUseCase;
import eu.pms.benificiary.useCases.PmsBenificiaryListUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.intervention.useCases.PmsInterventionListUseCase;
import eu.pms.objective.forms.PmsObjectiveSearchForm;
import eu.pms.objective.useCases.PmsObjectiveListUseCase;
import eu.pms.permit.forms.PmsPermitSearchForm;
import eu.pms.permit.useCases.PmsPermitListUseCase;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


public class PmsObjectiveListAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");

        ArrayList inputData = new ArrayList();
        PmsObjectiveSearchForm pmsObjectiveSearchForm = (PmsObjectiveSearchForm) form;
        if (pmsObjectiveSearchForm != null) {
            inputData.add(pmsObjectiveSearchForm.getObjectiveDesc());
            inputData.add(pmsObjectiveSearchForm.getObjStatus());
        }
        request.setAttribute("pmsObjectiveList", new PmsObjectiveListUseCase().execute(inputData, request));

        return mapping.findForward("success");
    }
}

