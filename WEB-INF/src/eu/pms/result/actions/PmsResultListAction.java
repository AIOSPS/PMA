package eu.pms.result.actions;


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
import eu.pms.result.forms.PmsResultSearchForm;
import eu.pms.result.useCases.GetPmsObjectivesUseCase;
import eu.pms.result.useCases.PmsResultListUseCase;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


public class PmsResultListAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");

        List objectiveList = (List) new GetPmsObjectivesUseCase().execute(null, request);

        ArrayList inputData = new ArrayList();
        PmsResultSearchForm pmsResultSearchForm = (PmsResultSearchForm) form;
        if (pmsResultSearchForm != null) {
            inputData.add(pmsResultSearchForm.getResultDesc());
            inputData.add(pmsResultSearchForm.getObjId());
        }
        request.setAttribute("pmsResultList", new PmsResultListUseCase().execute(inputData, request));
        request.setAttribute("objectiveList", objectiveList);
        return mapping.findForward("success");
    }
}

