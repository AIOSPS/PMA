package eu.pms.project.actions;


import eu.pms.common.tools.SessionTraker;
import eu.pms.project.forms.PmsProjectAlbumForm;
import eu.pms.project.useCases.AddImgAlbumPmsProjectUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collection;

public class AddImgAlbumPmsProjectAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        PmsProjectAlbumForm pmsProjectAlbumForm = (PmsProjectAlbumForm) form;
        ArrayList inputData = new ArrayList();
        inputData.add(pmsProjectAlbumForm.getProId());
        inputData.add(pmsProjectAlbumForm.getAlbImage());
        Collection result = new AddImgAlbumPmsProjectUseCase().execute(inputData, request);
        if (result != null && result.size() > 0) {

        }
        return mapping.findForward("success");
    }
}

