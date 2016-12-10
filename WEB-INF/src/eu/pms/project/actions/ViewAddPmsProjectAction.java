package eu.pms.project.actions;


import eu.pms.project.useCases.*;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ViewAddPmsProjectAction extends Action
{

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        List dononrList = (List) new GetPmsDonorsUseCase().execute(null,request);
        List implementerList = (List) new GetPmsImplementerUseCase().execute(null,request);
        List developmentAgencyList = (List) new GetPmsDevelopmentAgencyUseCase().execute(null,request);
        List programmList = (List) new GetPmsProgrammUseCase().execute(null,request);
        List locationList = (List) new GetPmsLocationUseCase().execute(null,request);
        List communityList = (List) new GetPmsCommunityUseCase().execute(null,request);
        List clusterList = (List) new GetPmsClusterTypUseCase().execute(null,request);
        List permitList = (List) new GetPmsPermitUseCase().execute(null,request);
        List benificiryList = (List) new GetPmsBenificiaryUseCase().execute(null,request);
        List indicatorList = (List) new GetPmsIndicatorListUseCase().execute(null,request);
        request.setAttribute("dononrList",dononrList);
        request.setAttribute("implementerList",implementerList);
        request.setAttribute("developmentAgencyList",developmentAgencyList);
        request.setAttribute("programmList",programmList);
        request.setAttribute("locationList",locationList);
        request.setAttribute("communityList",communityList);
        request.setAttribute("clusterList",clusterList);
        request.setAttribute("permitList",permitList);
        request.setAttribute("benificiryList",benificiryList);
        request.setAttribute("indicatorList",indicatorList);

        return mapping.findForward("success");
    }
}

