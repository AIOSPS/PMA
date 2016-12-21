package eu.pms.activity.actions;


import eu.pms.activity.forms.PmsActivityForm;
import eu.pms.activity.useCases.GetPmsActivityUseCase;
import eu.pms.activity.useCases.GetPmsInterventionUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.intervention.useCases.GetPmsSectorsUseCase;
import eu.pms.project.database.PmsActivity;
import eu.pms.project.database.PmsIntervention;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class ViewPmsActivityAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        List inertventionList = (List) new GetPmsInterventionUseCase().execute(null, request);
        List sectorsList = (List) new GetPmsSectorsUseCase().execute(null, request);
        request.setAttribute("inertventionList", inertventionList);
        request.setAttribute("sectorsList", sectorsList);

        String actId = request.getParameter("actId");
        String intId = request.getParameter("intId");
        String secId = request.getParameter("secId");
        ArrayList inputs = new ArrayList();
        inputs.add(actId);
        inputs.add(intId);
        inputs.add(secId);
        List activityList = (List) new GetPmsActivityUseCase().execute(inputs, request);
        PmsActivity pmsActivity = null;
        if (activityList != null && activityList.size() > 0 && activityList.get(0) instanceof PmsIntervention) {
            pmsActivity = (PmsActivity) activityList.get(0);

            PmsActivityForm pmsActivityForm = (PmsActivityForm) form;
            fillPmsActivityData(pmsActivityForm, pmsActivity);
        }


        return mapping.findForward("success");
    }

    private void fillPmsActivityData(PmsActivityForm pmsActivityForm, PmsActivity pmsActivity) {
        pmsActivityForm.setActId(pmsActivity.getCompId().getActId());
        pmsActivityForm.setIntId(pmsActivity.getCompId().getIntId());
        pmsActivityForm.setSecId(pmsActivity.getCompId().getSecId());
        pmsActivityForm.setActDesc(pmsActivity.getActDesc());
        pmsActivityForm.setActUnit(pmsActivity.getActUnit());
        pmsActivityForm.setActUnitQty(pmsActivity.getActUnitQty());
        pmsActivityForm.setActEstimatedBudget(pmsActivity.getActEstimatedBudget());
    }
}

