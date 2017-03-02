package eu.pms.intervention.actions;


import eu.pms.common.tools.SessionTraker;
import eu.pms.intervention.useCases.GetPmsMasterPlanUseCase;
import eu.pms.intervention.useCases.GetPmsSectorsUseCase;
import eu.pms.project.database.PmsSector;
import eu.pms.project.useCases.GetPmsClusterTypUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ViewAddPmsInterventionAction extends Action
{

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        List masterPlanList = (List) new GetPmsMasterPlanUseCase().execute(null, request);
//        List sectorsList = (List) new GetPmsSectorsUseCase().execute(null, request);
        request.setAttribute("masterPlanList", masterPlanList);
//        request.setAttribute("sectorsList", sectorsList);

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

        request.setAttribute("clusterHList", clusterHList);
        request.setAttribute("clusterDList", clusterDList);
        request.setAttribute("clusterOthList", clusterOthList);

        return mapping.findForward("success");
    }
}

