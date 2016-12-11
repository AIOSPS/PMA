package eu.pms.benificiary.actions;


import eu.pms.activity.useCases.GetPmsInterventionUseCase;
import eu.pms.benificiary.useCases.GetPmsBenificiaryTypeUseCase;
import eu.pms.intervention.useCases.GetPmsSectorsUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ViewAddPmsBenificiaryAction extends Action
{

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        List benificiaryTypeList = (List) new GetPmsBenificiaryTypeUseCase().execute(null, request);
        request.setAttribute("benificiaryTypeList", benificiaryTypeList);

        return mapping.findForward("success");
    }
}

