package eu.pms.project.actions;


import eu.pms.common.tools.SessionTraker;
import eu.pms.project.forms.PmsProjectAlbumForm;
import eu.pms.project.useCases.*;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

public class ViewAlbumPmsProjectAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        PmsProjectAlbumForm pmsProjectAlbumForm = (eu.pms.project.forms.PmsProjectAlbumForm) form;
        pmsProjectAlbumForm.setProId(pmsProjectAlbumForm.getProId()!=null?pmsProjectAlbumForm.getProId():request.getParameter("proId"));
        ArrayList inputData = new ArrayList();
        inputData.add(pmsProjectAlbumForm.getProId());
        request.setAttribute("pmsProjectAlbumList", new GetImgsAlbumPmsProjectListUseCase().execute(inputData, request));
        return mapping.findForward("success");
    }
}

