package eu.pms.project.actions;


import eu.pms.common.tools.SessionTraker;
import eu.pms.community.useCases.GetPmsGovernateUseCase;
import eu.pms.intervention.useCases.GetPmsSectorsUseCase;
import eu.pms.login.components.LoginComponent;
import eu.pms.login.forms.LoginForm;
import eu.pms.project.database.PmsCommunitiesVw;
import eu.pms.project.forms.PmsProjectSearchForm;
import eu.pms.project.useCases.GetPmsCommunityUseCase;
import eu.pms.project.useCases.GetPmsDonorsUseCase;
import eu.pms.project.useCases.PmsProjectListUseCase;
import org.apache.struts.action.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

public class PmsProjectListAction extends Action
{

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");

        List dononrList = (List) new GetPmsDonorsUseCase().execute(null, request);
        request.setAttribute("dononrList", dononrList);
        List sectorsList = (List) new GetPmsSectorsUseCase().execute(null, request);
        request.setAttribute("sectorsList", sectorsList);
        List governateList = (List) new GetPmsGovernateUseCase().execute(null, request);
        request.setAttribute("governateList", governateList);
        List communityList = (List) new GetPmsCommunityUseCase().execute(null, request);
        request.setAttribute("communityList", communityList!=null && communityList.size()>0&& communityList.get(0) instanceof PmsCommunitiesVw ?communityList:null);


        ArrayList inputData = new ArrayList();
        PmsProjectSearchForm pmsProjectSearchForm = (PmsProjectSearchForm) form;
        if (pmsProjectSearchForm != null) {
            inputData.add(pmsProjectSearchForm.getDonorId());
            inputData.add(pmsProjectSearchForm.getSectorId());
            inputData.add(pmsProjectSearchForm.getGovernateId());
            inputData.add(pmsProjectSearchForm.getCommunityId());
            inputData.add(pmsProjectSearchForm.getStatusId());
        }
        request.setAttribute("pmsProjectList", new PmsProjectListUseCase().execute(inputData, request));

        return mapping.findForward("success");
    }
}

