package eu.pms.objective.actions;


import eu.pms.activity.forms.PmsActivityForm;
import eu.pms.activity.useCases.GetPmsActivityUseCase;
import eu.pms.activity.useCases.GetPmsInterventionUseCase;
import eu.pms.benificiary.forms.PmsBenificiaryForm;
import eu.pms.benificiary.useCases.GetPmsBenificiaryTypeUseCase;
import eu.pms.benificiary.useCases.GetPmsBenificiaryUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.intervention.useCases.GetPmsSectorsUseCase;
import eu.pms.objective.forms.PmsObjectiveForm;
import eu.pms.objective.useCases.GetPmsObjectiveUseCase;
import eu.pms.objective.useCases.GetPmsStrategicPlanDocUseCase;
import eu.pms.permit.forms.PmsPermitForm;
import eu.pms.permit.useCases.GetPmsPermitUseCase;
import eu.pms.project.database.*;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class ViewPmsObjectiveAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        List strategicPlanDocList = (List) new GetPmsStrategicPlanDocUseCase().execute(null, request);
        request.setAttribute("strategicPlanDocList", strategicPlanDocList);
        String objId = request.getParameter("objId");
        ArrayList inputs = new ArrayList();
        inputs.add(objId);
        List objectiveList = (List) new GetPmsObjectiveUseCase().execute(inputs, request);
        PmsObjectiv pmsObjectiv = null;
        if (objectiveList != null && objectiveList.size() > 0 && objectiveList.get(0) instanceof PmsObjectiv) {
            pmsObjectiv = (PmsObjectiv) objectiveList.get(0);

            PmsObjectiveForm pmsObjectiveForm = (PmsObjectiveForm) form;
            fillPmsObjectiveData(pmsObjectiveForm, pmsObjectiv);
        }


        return mapping.findForward("success");
    }

    private void fillPmsObjectiveData(PmsObjectiveForm pmsObjectiveForm, PmsObjectiv pmsObjectiv) {
        pmsObjectiveForm.setObjId(pmsObjectiv.getObjId());
        pmsObjectiveForm.setObjDesc(pmsObjectiv.getObjDesc());
        pmsObjectiveForm.setObjLongDesc(pmsObjectiv.getObjLongDesc());
        pmsObjectiveForm.setObjDefineDate(pmsObjectiv.getObjDefineDateStr());
        pmsObjectiveForm.setObjStatus(pmsObjectiv.getObjStatus());
        pmsObjectiveForm.setObjCloseDate(pmsObjectiv.getObjCloseDateStr());
        pmsObjectiveForm.setOjbUserId(pmsObjectiv.getOjbUserId());
        pmsObjectiveForm.setStrDocId(pmsObjectiv.getStrDocId());
    }
}

