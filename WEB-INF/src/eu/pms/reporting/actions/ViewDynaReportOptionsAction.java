package eu.pms.reporting.actions;

import eu.pms.common.tools.SessionTraker;
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


        return mapping.findForward("success");
    }

}

