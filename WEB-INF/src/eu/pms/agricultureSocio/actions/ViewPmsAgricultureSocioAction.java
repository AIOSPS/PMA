package eu.pms.agricultureSocio.actions;


import eu.pms.agricultureSocio.forms.PmsAgricultureSocioForm;
import eu.pms.agricultureSocio.useCases.GetPmsAgricultureSocioUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.masterPlan.forms.PmsMasterPlanForm;
import eu.pms.masterPlan.useCases.GetPmsMasterPlanCommunityUseCase;
import eu.pms.masterPlan.useCases.GetPmsMasterPlanDonorsUseCase;
import eu.pms.masterPlan.useCases.GetPmsMasterPlanUseCase;
import eu.pms.project.database.PmsAgricultureSocio;
import eu.pms.project.database.PmsMasterPlan;
import eu.pms.project.database.PmsMasterPlanCommunity;
import eu.pms.project.database.PmsMasterPlanDonor;
import eu.pms.project.useCases.GetPmsCommunityUseCase;
import eu.pms.project.useCases.GetPmsDonorsUseCase;
import eu.pms.project.useCases.GetPmsImplementerUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class ViewPmsAgricultureSocioAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        List communityList = (List) new GetPmsCommunityUseCase().execute(null, request);

        request.setAttribute("communityList", communityList);

        String agrId = request.getParameter("agrId");
        ArrayList inputs = new ArrayList();
        inputs.add(agrId);
        List agricultureSocioList = (List) new GetPmsAgricultureSocioUseCase().execute(inputs, request);
        PmsAgricultureSocio pmsAgricultureSocion = null;
        if (agricultureSocioList != null && agricultureSocioList.size() > 0 && agricultureSocioList.get(0) instanceof PmsAgricultureSocio) {
            pmsAgricultureSocion = (PmsAgricultureSocio) agricultureSocioList.get(0);
            PmsAgricultureSocioForm pmsAgricultureSocionForm = (PmsAgricultureSocioForm) form;
            fillPmsProjectData(pmsAgricultureSocionForm, pmsAgricultureSocion);
        }


        return mapping.findForward("success");
    }

    private void fillPmsProjectData(PmsAgricultureSocioForm pmsAgricultureSocionForm, PmsAgricultureSocio pmsAgricultureSocion) {
        pmsAgricultureSocionForm.setAgrId(pmsAgricultureSocion.getAgrId());
        pmsAgricultureSocionForm.setComId(pmsAgricultureSocion.getComId());
        pmsAgricultureSocionForm.setAgrArea(pmsAgricultureSocion.getAgrArea());
        pmsAgricultureSocionForm.setAgrNoCowYear(pmsAgricultureSocion.getAgrNoCowYear());
        pmsAgricultureSocionForm.setAgrNoSheepYear(pmsAgricultureSocion.getAgrNoSheepYear());
        pmsAgricultureSocionForm.setAgrCostWaterTank(pmsAgricultureSocion.getAgrCostWaterTank());
        pmsAgricultureSocionForm.setAgrHerdingArea(pmsAgricultureSocion.getAgrHerdingArea());
        pmsAgricultureSocionForm.setAgrMilitaryArea(pmsAgricultureSocion.getAgrMilitaryArea());
        pmsAgricultureSocionForm.setAgrBypassRoadArea(pmsAgricultureSocion.getAgrBypassRoadArea());
        pmsAgricultureSocionForm.setAgrSurveyDate(pmsAgricultureSocion.getAgrSurveyDateStr());

    }
}

