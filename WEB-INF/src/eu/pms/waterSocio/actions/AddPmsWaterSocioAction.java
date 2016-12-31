package eu.pms.waterSocio.actions;


import eu.pms.agricultureSocio.forms.PmsAgricultureSocioForm;
import eu.pms.agricultureSocio.useCases.AddPmsAgricultureSocioUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.masterPlan.forms.PmsMasterPlanForm;
import eu.pms.masterPlan.useCases.AddPmsMasterPlanUseCase;
import eu.pms.waterSocio.forms.PmsWaterSocioForm;
import eu.pms.waterSocio.useCases.AddPmsWaterSocioUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collection;

public class AddPmsWaterSocioAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        PmsWaterSocioForm pmsWaterSocioForm = (PmsWaterSocioForm) form;
        String watId = pmsWaterSocioForm.getWatId();
        String comId = pmsWaterSocioForm.getComId();
        String watIsconnected = pmsWaterSocioForm.getWatIsconnected();
        Integer watNetwork = pmsWaterSocioForm.getWatNetwork();
        String watUseWatTanker = pmsWaterSocioForm.getWatUseWatTanker();
        String watRainWaterWell = pmsWaterSocioForm.getWatRainWaterWell();
        Integer watNoSprings = pmsWaterSocioForm.getWatNoSprings();
        java.math.BigDecimal watPriceWater = pmsWaterSocioForm.getWatPriceWater();
        Integer watFillingPoint = pmsWaterSocioForm.getWatFillingPoint();
        Integer watQuantity = pmsWaterSocioForm.getWatQuantity();
        String watSurveyDate = pmsWaterSocioForm.getWatSurveyDate();

        ArrayList inputs = new ArrayList();
        inputs.add(watId);
        inputs.add(comId);
        inputs.add(watIsconnected);
        inputs.add(watNetwork);
        inputs.add(watUseWatTanker);
        inputs.add(watRainWaterWell);
        inputs.add(watNoSprings);
        inputs.add(watPriceWater);
        inputs.add(watFillingPoint);
        inputs.add(watQuantity);
        inputs.add(watSurveyDate);


        Collection result = new AddPmsWaterSocioUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }
        pmsWaterSocioForm.reset(mapping, request);
        return mapping.findForward("success");
    }
}

