package eu.pms.indicator.actions;


import eu.pms.activity.forms.PmsActivitySearchForm;
import eu.pms.activity.useCases.PmsActivityListUseCase;
import eu.pms.benificiary.forms.PmsBenificiarySearchForm;
import eu.pms.benificiary.useCases.GetPmsBenificiaryTypeUseCase;
import eu.pms.benificiary.useCases.PmsBenificiaryListUseCase;
import eu.pms.indicator.forms.PmsIndicatorSearchForm;
import eu.pms.indicator.useCases.PmsIndicatorListUseCase;
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


public class PmsIndicatorListAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {

        ArrayList inputData = new ArrayList();
        PmsIndicatorSearchForm pmsIndicatorSearchForm = (PmsIndicatorSearchForm) form;
        if (pmsIndicatorSearchForm != null) {
            inputData.add(pmsIndicatorSearchForm.getIndicatorTitle());
            inputData.add(pmsIndicatorSearchForm.getIndicatorLongDesc());
        }
        request.setAttribute("pmsIndicatorList", new PmsIndicatorListUseCase().execute(inputData, request));

        return mapping.findForward("success");
    }
}

