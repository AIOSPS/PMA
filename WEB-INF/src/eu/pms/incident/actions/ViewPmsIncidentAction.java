package eu.pms.incident.actions;


import eu.pms.activity.forms.PmsActivityForm;
import eu.pms.activity.useCases.GetPmsActivityUseCase;
import eu.pms.activity.useCases.GetPmsInterventionUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.incident.forms.PmsIncidentForm;
import eu.pms.incident.useCases.GetPmsDataSourceUseCase;
import eu.pms.incident.useCases.GetPmsIncidentUseCase;
import eu.pms.intervention.useCases.GetPmsSectorsUseCase;
import eu.pms.project.database.PmsActivity;
import eu.pms.project.database.PmsIncident;
import eu.pms.project.database.PmsIntervention;
import eu.pms.project.useCases.GetPmsCommunityUseCase;
import eu.pms.project.useCases.PmsProjectListUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class ViewPmsIncidentAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        List dataSourceList = (List) new GetPmsDataSourceUseCase().execute(null, request);
        request.setAttribute("dataSourceList", dataSourceList);
        List communityList = (List) new GetPmsCommunityUseCase().execute(null, request);
        request.setAttribute("communityList", communityList);
        List projectList = (List) new PmsProjectListUseCase().execute(null, request);
        request.setAttribute("projectList", projectList);

        String incId = request.getParameter("incId");
        ArrayList inputs = new ArrayList();
        inputs.add(incId);
        List incidentList = (List) new GetPmsIncidentUseCase().execute(inputs, request);
        PmsIncident pmsIncident = null;
        if (incidentList != null && incidentList.size() > 0 && incidentList.get(0) instanceof PmsIncident) {
            pmsIncident = (PmsIncident) incidentList.get(0);

            PmsIncidentForm pmsIncidentForm = (PmsIncidentForm) form;
            fillPmsActivityData(pmsIncidentForm, pmsIncident);
        }


        return mapping.findForward("success");
    }

    private void fillPmsActivityData(PmsIncidentForm pmsIncidentForm, PmsIncident pmsIncident) {
        pmsIncidentForm.setIncId(pmsIncident.getIncId());
        pmsIncidentForm.setDatId(pmsIncident.getDatId());
        pmsIncidentForm.setComId(pmsIncident.getComId());
        pmsIncidentForm.setProId(pmsIncident.getComId());
        pmsIncidentForm.setIncOchaId(pmsIncident.getIncOchaId());
        pmsIncidentForm.setIncDescription(pmsIncident.getIncDescription());
        pmsIncidentForm.setIncAffectedWomen(pmsIncident.getIncAffectedWomen());
        pmsIncidentForm.setIncAffectedMen(pmsIncident.getIncAffectedMen());
        pmsIncidentForm.setIncAffectedAdaults(pmsIncident.getIncAffectedAdaults());
        pmsIncidentForm.setIncAffectedChildren(pmsIncident.getIncAffectedChildren());
        pmsIncidentForm.setIncDisplacedWomen(pmsIncident.getIncDisplacedWomen());
        pmsIncidentForm.setIncDisplacedMen(pmsIncident.getIncDisplacedMen());
        pmsIncidentForm.setIncDisplacedAdult(pmsIncident.getIncDisplacedAdult());
        pmsIncidentForm.setIncDisplacedChildren(pmsIncident.getIncDisplacedChildren());
        pmsIncidentForm.setIncDemolishedWomen(pmsIncident.getIncDemolishedWomen());
        pmsIncidentForm.setIncDemolishedMen(pmsIncident.getIncDemolishedMen());
        pmsIncidentForm.setIncDemolishedAdult(pmsIncident.getIncDemolishedAdult());
        pmsIncidentForm.setIncDemolishedChildren(pmsIncident.getIncDemolishedChildren());
        pmsIncidentForm.setIncType(pmsIncident.getIncType());
        pmsIncidentForm.setIncSourceLink(pmsIncident.getIncSourceLink());
        pmsIncidentForm.setIncTimeStamp(pmsIncident.getIncTimeStampStr());
        pmsIncidentForm.setLocLatitude(pmsIncident.getLocLatitude());
        pmsIncidentForm.setLocLongitude(pmsIncident.getLocLongitude());
    }
}

