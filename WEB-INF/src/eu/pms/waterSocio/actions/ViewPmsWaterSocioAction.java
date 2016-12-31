package eu.pms.waterSocio.actions;


import eu.pms.agricultureSocio.forms.PmsAgricultureSocioForm;
import eu.pms.agricultureSocio.useCases.GetPmsAgricultureSocioUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.masterPlan.forms.PmsMasterPlanForm;
import eu.pms.masterPlan.useCases.GetPmsMasterPlanCommunityUseCase;
import eu.pms.masterPlan.useCases.GetPmsMasterPlanDonorsUseCase;
import eu.pms.masterPlan.useCases.GetPmsMasterPlanUseCase;
import eu.pms.project.database.*;
import eu.pms.project.useCases.GetPmsCommunityUseCase;
import eu.pms.project.useCases.GetPmsDonorsUseCase;
import eu.pms.project.useCases.GetPmsImplementerUseCase;
import eu.pms.waterSocio.forms.PmsWaterSocioForm;
import eu.pms.waterSocio.useCases.GetPmsWaterSocioUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class ViewPmsWaterSocioAction extends Action {

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

        String watId = request.getParameter("watId");
        ArrayList inputs = new ArrayList();
        inputs.add(watId);
        List waterSocioList = (List) new GetPmsWaterSocioUseCase().execute(inputs, request);
        PmsWaterSocio pmsWaterSocion = null;
        if (waterSocioList != null && waterSocioList.size() > 0 && waterSocioList.get(0) instanceof PmsWaterSocio) {
            pmsWaterSocion = (PmsWaterSocio) waterSocioList.get(0);
            PmsWaterSocioForm pmsWaterSocionForm = (PmsWaterSocioForm) form;
            fillPmsProjectData(pmsWaterSocionForm, pmsWaterSocion);
        }


        return mapping.findForward("success");
    }

    private void fillPmsProjectData(PmsWaterSocioForm pmsWaterSocionForm, PmsWaterSocio pmsWaterSocion) {
        pmsWaterSocionForm.setWatId(pmsWaterSocion.getWatId());
        pmsWaterSocionForm.setComId(pmsWaterSocion.getComId());
        pmsWaterSocionForm.setWatIsconnected(pmsWaterSocion.getWatIsconnected());
        pmsWaterSocionForm.setWatNetwork(pmsWaterSocion.getWatNetwork());
        pmsWaterSocionForm.setWatUseWatTanker(pmsWaterSocion.getWatUseWatTanker());
        pmsWaterSocionForm.setWatRainWaterWell(pmsWaterSocion.getWatRainWaterWell());
        pmsWaterSocionForm.setWatNoSprings(pmsWaterSocion.getWatNoSprings());
        pmsWaterSocionForm.setWatPriceWater(pmsWaterSocion.getWatPriceWater());
        pmsWaterSocionForm.setWatFillingPoint(pmsWaterSocion.getWatFillingPoint());
        pmsWaterSocionForm.setWatQuantity(pmsWaterSocion.getWatQuantity());
        pmsWaterSocionForm.setWatSurveyDate(pmsWaterSocion.getWatSurveyDateStr());

    }
}

