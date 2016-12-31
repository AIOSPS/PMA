package eu.pms.agricultureSocio.actions;


import eu.pms.agricultureSocio.forms.PmsAgricultureSocioForm;
import eu.pms.agricultureSocio.useCases.AddPmsAgricultureSocioUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.masterPlan.forms.PmsMasterPlanForm;
import eu.pms.masterPlan.useCases.AddPmsMasterPlanUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collection;

public class AddPmsAgricultureSocioAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        PmsAgricultureSocioForm pmsAgricultureSocioForm = (PmsAgricultureSocioForm) form;
        String agrId = pmsAgricultureSocioForm.getAgrId();
        String comId = pmsAgricultureSocioForm.getComId();
        Integer agrArea = pmsAgricultureSocioForm.getAgrArea();
        Integer agrNoCowYear = pmsAgricultureSocioForm.getAgrNoCowYear();
        Integer agrNoSheepYear = pmsAgricultureSocioForm.getAgrNoSheepYear();
        Integer agrCostWaterTank = pmsAgricultureSocioForm.getAgrCostWaterTank();
        Integer agrHerdingArea = pmsAgricultureSocioForm.getAgrHerdingArea();
        Integer agrMilitaryArea = pmsAgricultureSocioForm.getAgrMilitaryArea();
        Integer agrBypassRoadArea = pmsAgricultureSocioForm.getAgrBypassRoadArea();
        String agrSurveyDate = pmsAgricultureSocioForm.getAgrSurveyDate();

        ArrayList inputs = new ArrayList();
        inputs.add(agrId);
        inputs.add(comId);
        inputs.add(agrArea);
        inputs.add(agrNoCowYear);
        inputs.add(agrNoSheepYear);
        inputs.add(agrCostWaterTank);
        inputs.add(agrHerdingArea);
        inputs.add(agrMilitaryArea);
        inputs.add(agrBypassRoadArea);
        inputs.add(agrSurveyDate);


        Collection result = new AddPmsAgricultureSocioUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }
        pmsAgricultureSocioForm.reset(mapping, request);
        return mapping.findForward("success");
    }
}

