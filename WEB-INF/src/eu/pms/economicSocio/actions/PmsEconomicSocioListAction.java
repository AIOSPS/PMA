package eu.pms.economicSocio.actions;


import eu.pms.common.tools.SessionTraker;
import eu.pms.economicSocio.forms.PmsEconomicSocioForm;
import eu.pms.economicSocio.forms.PmsEconomicSocioSearchForm;
import eu.pms.economicSocio.useCases.PmsEconomicSocioListUseCase;
import eu.pms.project.useCases.GetPmsCommunityUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by orayyan on 1/27/2017.
 */
public class PmsEconomicSocioListAction extends Action {
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

        ArrayList inputData = new ArrayList();
        PmsEconomicSocioSearchForm pmsEconomicSocioForm = (PmsEconomicSocioSearchForm) form;
        if (pmsEconomicSocioForm != null) {
            inputData.add(pmsEconomicSocioForm.getComId());
        }
        request.setAttribute("pmsEconomicSocioList", new PmsEconomicSocioListUseCase().execute(inputData, request));

        return mapping.findForward("success");
    }

}
