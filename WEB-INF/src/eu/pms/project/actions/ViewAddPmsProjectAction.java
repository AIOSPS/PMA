package eu.pms.project.actions;


import eu.pms.common.tools.SessionTraker;
import eu.pms.project.database.PmsCommunitiesVw;
import eu.pms.project.database.PmsSector;
import eu.pms.project.useCases.*;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ViewAddPmsProjectAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        List dononrList = (List) new GetPmsDonorsUseCase().execute(null, request);
        List implementerList = (List) new GetPmsImplementerUseCase().execute(null, request);
        List developmentAgencyList = (List) new GetPmsDevelopmentAgencyUseCase().execute(null, request);
        List programmList = (List) new GetPmsProgrammUseCase().execute(null, request);
//        List locationList = (List) new GetPmsLocationUseCase().execute(null, request);
        List communityList = (List) new GetPmsCommunityUseCase().execute(null, request);
        List subSectorList = (List) new GetPmsSubSectorUseCase().execute(null, request);
        List clusterList = (List) new GetPmsClusterTypUseCase().execute(null, request);
        List clusterHList = new ArrayList();
        List clusterDList = new ArrayList();
        List clusterOthList = new ArrayList();
        Iterator itr = clusterList.iterator();
        PmsSector pmsSecTyp = new PmsSector();
        while (itr.hasNext()) {
            pmsSecTyp = (PmsSector) itr.next();
            if (pmsSecTyp.getSecType().equals("H"))
                clusterHList.add(pmsSecTyp);
            else if (pmsSecTyp.getSecType().equals("D"))
                clusterDList.add(pmsSecTyp);
            else if (pmsSecTyp.getSecType().equals("Oth"))
                clusterOthList.add(pmsSecTyp);
        }
        List permitList = (List) new GetPmsPermitUseCase().execute(null, request);
        List benificiryTypeList = (List) new GetPmsBenificiaryUseCase().execute(null, request);
        List indicatorList = (List) new GetPmsIndicatorListUseCase().execute(null, request);
        request.setAttribute("dononrList", dononrList);
        request.setAttribute("implementerList", implementerList);
        request.setAttribute("developmentAgencyList", developmentAgencyList);
        request.setAttribute("programmList", programmList);
//        request.setAttribute("locationList", locationList);
        request.setAttribute("communityList", communityList!=null && communityList.size()>0&& communityList.get(0) instanceof PmsCommunitiesVw ?communityList:null);
        request.setAttribute("clusterHList", clusterHList);
        request.setAttribute("clusterDList", clusterDList);
        request.setAttribute("clusterOthList", clusterOthList);
        request.setAttribute("subSectorList", subSectorList);
        request.setAttribute("permitList", permitList);
        request.setAttribute("benificiryTypeList", benificiryTypeList);
        request.setAttribute("indicatorList", indicatorList);

        return mapping.findForward("success");
    }
}

