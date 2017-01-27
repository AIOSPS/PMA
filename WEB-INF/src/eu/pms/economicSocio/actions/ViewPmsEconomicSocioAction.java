package eu.pms.economicSocio.actions;


import eu.pms.agricultureSocio.forms.PmsAgricultureSocioForm;
import eu.pms.common.tools.SessionTraker;
import eu.pms.economicSocio.forms.PmsEconomicSocioForm;
import eu.pms.economicSocio.useCases.GetPmsEconomicSocioUseCase;
import eu.pms.project.database.PmsAgricultureSocio;
import eu.pms.project.database.PmsEconomicSocio;
import eu.pms.project.useCases.GetPmsCommunityUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class ViewPmsEconomicSocioAction extends Action {

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

        String ecoId = request.getParameter("ecoId");
        ArrayList inputs = new ArrayList();
        inputs.add(ecoId);
        List economicSocioList = (List) new GetPmsEconomicSocioUseCase().execute(inputs, request);
        PmsEconomicSocio pmsEconomicSocio = null;
        if (economicSocioList != null && economicSocioList.size() > 0 && economicSocioList.get(0) instanceof PmsEconomicSocio) {
            pmsEconomicSocio = (PmsEconomicSocio) economicSocioList.get(0);
            PmsEconomicSocioForm pmsEconomicSocioForm = (PmsEconomicSocioForm) form;
            fillPmsProjectData(pmsEconomicSocioForm, pmsEconomicSocio);
        }


        return mapping.findForward("success");
    }

    private void fillPmsProjectData(PmsEconomicSocioForm pmsEconomicSocioForm, PmsEconomicSocio pmsEconomicSocio) {
        pmsEconomicSocioForm.setEcoId(pmsEconomicSocio.getCompId().getEcoId());
        pmsEconomicSocioForm.setComId(pmsEconomicSocio.getCompId().getComId());
        pmsEconomicSocioForm.setMenLivelihoodSource1(pmsEconomicSocio.getMenLivelihoodSource1());
        pmsEconomicSocioForm.setMenLivelihoodSource2(pmsEconomicSocio.getMenLivelihoodSource2());
        pmsEconomicSocioForm.setMenLivelihoodSource3(pmsEconomicSocio.getMenLivelihoodSource3());
        pmsEconomicSocioForm.setWomenLivelihoodSource1(pmsEconomicSocio.getWomenLivelihoodSource1());
        pmsEconomicSocioForm.setWomenLivelihoodSource2(pmsEconomicSocio.getWomenLivelihoodSource2());
        pmsEconomicSocioForm.setWomenLivelihoodSource3(pmsEconomicSocio.getWomenLivelihoodSource3());
        pmsEconomicSocioForm.setAccessToLandsMilitary(pmsEconomicSocio.getAccessToLandsMilitary());
        pmsEconomicSocioForm.setAccessToLandsCheckpoints(pmsEconomicSocio.getAccessToLandsCheckpoints());
        pmsEconomicSocioForm.setFamilyAvgSize(pmsEconomicSocio.getFamilyAvgSize());
        pmsEconomicSocioForm.setFamilyAvgIncome(pmsEconomicSocio.getFamilyAvgIncome());

    }
}

