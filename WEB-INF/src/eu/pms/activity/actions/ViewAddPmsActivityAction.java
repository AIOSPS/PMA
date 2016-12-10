package eu.pms.activity.actions;


import eu.pms.activity.useCases.GetPmsInterventionUseCase;
import eu.pms.intervention.useCases.GetPmsSectorsUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ViewAddPmsActivityAction extends Action
{

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        List inertventionList = (List) new GetPmsInterventionUseCase().execute(null, request);
        List sectorsList = (List) new GetPmsSectorsUseCase().execute(null, request);
        request.setAttribute("inertventionList", inertventionList);
        request.setAttribute("sectorsList", sectorsList);

        return mapping.findForward("success");
    }
}

