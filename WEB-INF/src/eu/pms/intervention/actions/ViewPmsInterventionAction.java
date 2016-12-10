package eu.pms.intervention.actions;


import eu.pms.intervention.forms.PmsInterventionForm;
import eu.pms.intervention.useCases.GetPmsInterventionUseCase;
import eu.pms.intervention.useCases.GetPmsMasterPlanUseCase;
import eu.pms.intervention.useCases.GetPmsSectorsUseCase;
import eu.pms.intervention.useCases.GetPmsSubSectorsUseCase;
import eu.pms.project.database.PmsIntervention;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class ViewPmsInterventionAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        List masterPlanList = (List) new GetPmsMasterPlanUseCase().execute(null, request);
        List sectorsList = (List) new GetPmsSectorsUseCase().execute(null, request);
        List subSectorsList = (List) new GetPmsSubSectorsUseCase().execute(null, request);
        request.setAttribute("masterPlanList", masterPlanList);
        request.setAttribute("sectorsList", sectorsList);
        request.setAttribute("subSectorsList", subSectorsList);

        String intId = request.getParameter("intId");
        String secId = request.getParameter("secId");
        String subId = request.getParameter("subId");
        ArrayList inputs = new ArrayList();
        inputs.add(intId);
        inputs.add(secId);
        inputs.add(subId);
        List interventionList = (List) new GetPmsInterventionUseCase().execute(inputs, request);
        PmsIntervention pmsIntervention = null;
        if (interventionList != null && interventionList.size() > 0 && interventionList.get(0) instanceof PmsIntervention) {
            pmsIntervention = (PmsIntervention) interventionList.get(0);

            PmsInterventionForm pmsInterventionForm = (PmsInterventionForm) form;
            fillPmsInterventionData(pmsInterventionForm, pmsIntervention);
        }


        return mapping.findForward("success");
    }

    private void fillPmsInterventionData(PmsInterventionForm pmsInterventionForm, PmsIntervention pmsIntervention) {
        pmsInterventionForm.setIntId(pmsIntervention.getCompId().getIntId());
        pmsInterventionForm.setSubId(pmsIntervention.getCompId().getSubId());
        pmsInterventionForm.setSecId(pmsIntervention.getCompId().getSecId());
        pmsInterventionForm.setMasId(pmsIntervention.getMasId());
        pmsInterventionForm.setIntDesc(pmsIntervention.getIntDesc());
        pmsInterventionForm.setIntEstimatedBudget(pmsIntervention.getIntEstimatedBudget());
        pmsInterventionForm.setIntSource(pmsIntervention.getIntSource());
    }
}

