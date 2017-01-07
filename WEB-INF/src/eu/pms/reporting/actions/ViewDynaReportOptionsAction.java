package eu.pms.reporting.actions;

import eu.pms.benificiary.useCases.GetPmsBenificiaryTypeUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.community.useCases.GetPmsGovernateUseCase;
import eu.pms.intervention.useCases.GetPmsSectorsUseCase;
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
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by alisa_000 on 12/28/2016.
 */
public class ViewDynaReportOptionsAction extends Action {
    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");

        ArrayList inputData = new ArrayList();


//        inputData.clear();
//        inputData.add(new LkpCurrentJob().getClass().getName());
//        request.setAttribute("currentJobList", new LoadLookupsListBusinessLayer().BusinessImpl(inputData));
        List dononrList = (List) new GetPmsDonorsUseCase().execute(null, request);
        request.setAttribute("dononrList", dononrList);
        List sectorsList = (List) new GetPmsSectorsUseCase().execute(null, request);
        request.setAttribute("sectorsList", sectorsList);
        List governateList = (List) new GetPmsGovernateUseCase().execute(null, request);
        request.setAttribute("governateList", governateList);
        List communityList = (List) new GetPmsCommunityUseCase().execute(null, request);
        request.setAttribute("communityList", communityList);
        List benificiaryTypeList = (List) new GetPmsBenificiaryTypeUseCase().execute(null, request);
        request.setAttribute("benificiaryTypeList", benificiaryTypeList);
        List implementerList = (List) new GetPmsImplementerUseCase().execute(null, request);
        request.setAttribute("implementerList", implementerList);


        return mapping.findForward("success");
    }

}

