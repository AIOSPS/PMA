package eu.pms.incident.actions;


import eu.pms.activity.useCases.GetPmsInterventionUseCase;
import eu.pms.incident.useCases.GetPmsDataSourceUseCase;
import eu.pms.intervention.useCases.GetPmsSectorsUseCase;
import eu.pms.project.useCases.GetPmsCommunityUseCase;
import eu.pms.project.useCases.GetPmsProjectUseCase;
import eu.pms.project.useCases.PmsProjectListUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ViewAddPmsIncidentAction extends Action
{

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        List dataSourceList = (List) new GetPmsDataSourceUseCase().execute(null, request);
        request.setAttribute("dataSourceList", dataSourceList);
        List communityList = (List) new GetPmsCommunityUseCase().execute(null, request);
        request.setAttribute("communityList", communityList);
        List projectList = (List) new PmsProjectListUseCase().execute(null, request);
        request.setAttribute("projectList", projectList);

        return mapping.findForward("success");
    }
}

