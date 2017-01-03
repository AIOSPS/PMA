package eu.pms.result.actions;


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
import eu.pms.result.forms.PmsResultForm;
import eu.pms.result.useCases.GetPmsObjectivesUseCase;
import eu.pms.result.useCases.GetPmsResultUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class ViewPmsResultAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        List objectiveList = (List) new GetPmsObjectivesUseCase().execute(null, request);
        request.setAttribute("objectiveList", objectiveList);
        String resId = request.getParameter("resId");
        String objId = request.getParameter("objId");
        ArrayList inputs = new ArrayList();
        inputs.add(resId);
        inputs.add(objId);
        List resultList = (List) new GetPmsResultUseCase().execute(inputs, request);
        PmsResult pmsResult = null;
        if (resultList != null && resultList.size() > 0 && resultList.get(0) instanceof PmsResult) {
            pmsResult = (PmsResult) resultList.get(0);

            PmsResultForm pmsResultForm = (PmsResultForm) form;
            fillPmsResultData(pmsResultForm, pmsResult);
        }


        return mapping.findForward("success");
    }

    private void fillPmsResultData(PmsResultForm pmsResultForm, PmsResult pmsResult) {
        pmsResultForm.setResId(pmsResult.getCompId().getResId());
        pmsResultForm.setObjId(pmsResult.getCompId().getObjId());
        pmsResultForm.setResDesc(pmsResult.getResDesc());
        pmsResultForm.setResLongDesc(pmsResult.getResLongDesc());
        pmsResultForm.setResDefineDate(pmsResult.getResDefineDateStr());
        pmsResultForm.setResStatus(pmsResult.getResStatus());
        pmsResultForm.setResCloseDate(pmsResult.getResCloseDateStr());
    }
}

