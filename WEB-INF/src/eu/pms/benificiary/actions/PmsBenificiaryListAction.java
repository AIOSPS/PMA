package eu.pms.benificiary.actions;


import eu.pms.activity.forms.PmsActivitySearchForm;
import eu.pms.activity.useCases.PmsActivityListUseCase;
import eu.pms.benificiary.forms.PmsBenificiarySearchForm;
import eu.pms.benificiary.useCases.GetPmsBenificiaryTypeUseCase;
import eu.pms.benificiary.useCases.PmsBenificiaryListUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.intervention.useCases.PmsInterventionListUseCase;
import eu.pms.project.useCases.PmsProjectListUseCase;
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
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");

//        List benificiaryTypeList = (List) new GetPmsBenificiaryTypeUseCase().execute(null, request);
//        request.setAttribute("benificiaryTypeList", benificiaryTypeList);
        List projectList = (List) new PmsProjectListUseCase().execute(null, request);
        request.setAttribute("projectList", projectList);

        ArrayList inputData = new ArrayList();
        PmsBenificiarySearchForm pmsBenificiarySearchForm = (PmsBenificiarySearchForm) form;
        if (pmsBenificiarySearchForm != null) {
            inputData.add(pmsBenificiarySearchForm.getProId());
//            inputData.add(pmsBenificiarySearchForm.getBenificiaryTotal());
//            inputData.add(pmsBenificiarySearchForm.getBenificiaryType());
        }
        request.setAttribute("pmsBenificiaryList", new PmsBenificiaryListUseCase().execute(inputData, request));

        return mapping.findForward("success");
    }
}

