package eu.pms.benificiary.actions;


import eu.pms.activity.forms.PmsActivitySearchForm;
import eu.pms.activity.useCases.PmsActivityListUseCase;
import eu.pms.benificiary.forms.PmsBenificiarySearchForm;
import eu.pms.benificiary.useCases.GetPmsBenificiaryTypeUseCase;
import eu.pms.benificiary.useCases.PmsBenificiaryListUseCase;
import eu.pms.intervention.useCases.PmsInterventionListUseCase;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


public class PmsBenificiaryListAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {

        List benificiaryTypeList = (List) new GetPmsBenificiaryTypeUseCase().execute(null, request);
        request.setAttribute("benificiaryTypeList", benificiaryTypeList);
        ArrayList inputData = new ArrayList();
        PmsBenificiarySearchForm pmsBenificiarySearchForm = (PmsBenificiarySearchForm) form;
        if (pmsBenificiarySearchForm != null) {
            inputData.add(pmsBenificiarySearchForm.getBenificiaryDesc());
            inputData.add(pmsBenificiarySearchForm.getBenificiaryTotal());
            inputData.add(pmsBenificiarySearchForm.getBenificiaryType());
        }
        request.setAttribute("pmsBenificiaryList", new PmsBenificiaryListUseCase().execute(inputData, request));

        return mapping.findForward("success");
    }
}

