package eu.pms.waterSocio.actions;


import eu.pms.agricultureSocio.forms.PmsAgricultureSocioSearchForm;
import eu.pms.agricultureSocio.useCases.PmsAgricultureSocioListUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.community.useCases.GetPmsGovernateUseCase;
import eu.pms.masterPlan.forms.PmsMasterPlanSearchForm;
import eu.pms.masterPlan.useCases.PmsMasterPlanListUseCase;
import eu.pms.project.useCases.GetPmsCommunityUseCase;
import eu.pms.waterSocio.forms.PmsWaterSocioSearchForm;
import eu.pms.waterSocio.useCases.PmsWaterSocioListUseCase;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class PmsWaterSocioListAction extends Action
{

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        List governateList = (List) new GetPmsGovernateUseCase().execute(null, request);
        request.setAttribute("governateList", governateList);

        List communityList = (List) new GetPmsCommunityUseCase().execute(null, request);
        request.setAttribute("communityList", communityList);

        ArrayList inputData = new ArrayList();
        PmsWaterSocioSearchForm pmsWaterSocioSearchForm = (PmsWaterSocioSearchForm) form;
        if (pmsWaterSocioSearchForm != null) {
            inputData.add(pmsWaterSocioSearchForm.getComId());
            inputData.add(pmsWaterSocioSearchForm.getGovId());
        }
        request.setAttribute("pmsWaterSocioList", new PmsWaterSocioListUseCase().execute(inputData, request));

        return mapping.findForward("success");
    }
}

