package eu.pms.economicSocio.actions;

import eu.pms.common.tools.SessionTraker;
import eu.pms.economicSocio.forms.PmsEconomicSocioForm;
import eu.pms.economicSocio.useCases.AddPmsEconomicSocioUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by orayyan on 1/27/2017.
 */
public class AddPmsEconomicSocioAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        PmsEconomicSocioForm pmsEconomicSocioForm = (PmsEconomicSocioForm) form;
        String ecoId = pmsEconomicSocioForm.getEcoId();
        String comId = pmsEconomicSocioForm.getComId();
        String menLivelihoodSource1 = pmsEconomicSocioForm.getMenLivelihoodSource1();
        String menLivelihoodSource2 = pmsEconomicSocioForm.getMenLivelihoodSource2();
        String menLivelihoodSource3 = pmsEconomicSocioForm.getMenLivelihoodSource3();
        String womenLivelihoodSource1 = pmsEconomicSocioForm.getWomenLivelihoodSource1();
        String womenLivelihoodSource2 = pmsEconomicSocioForm.getWomenLivelihoodSource2();
        String womenLivelihoodSource3 = pmsEconomicSocioForm.getWomenLivelihoodSource3();
        String accessToLandsMilitary = pmsEconomicSocioForm.getAccessToLandsMilitary();
        String accessToLandsCheckpoints = pmsEconomicSocioForm.getAccessToLandsCheckpoints();
        Integer familyAvgSize = pmsEconomicSocioForm.getFamilyAvgSize();
        BigDecimal familyAvgIncome = pmsEconomicSocioForm.getFamilyAvgIncome();

        ArrayList inputs = new ArrayList();
        inputs.add(ecoId);
        inputs.add(comId);
        inputs.add(menLivelihoodSource1);
        inputs.add(menLivelihoodSource2);
        inputs.add(menLivelihoodSource3);
        inputs.add(womenLivelihoodSource1);
        inputs.add(womenLivelihoodSource2);
        inputs.add(womenLivelihoodSource3);
        inputs.add(accessToLandsMilitary);
        inputs.add(accessToLandsCheckpoints);
        inputs.add(familyAvgSize);
        inputs.add(familyAvgIncome);


        Collection result = new AddPmsEconomicSocioUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }
        pmsEconomicSocioForm.reset(mapping, request);
        return mapping.findForward("success");
    }
}
