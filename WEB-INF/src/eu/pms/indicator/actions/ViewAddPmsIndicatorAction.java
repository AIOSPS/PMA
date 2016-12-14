package eu.pms.indicator.actions;


import eu.pms.indicator.useCases.GetPmsResultUseCase;
import eu.pms.objective.useCases.GetPmsStrategicPlanDocUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ViewAddPmsIndicatorAction extends Action
{

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        List resultList = (List) new GetPmsResultUseCase().execute(null, request);
        request.setAttribute("resultList", resultList);
        return mapping.findForward("success");
    }
}

