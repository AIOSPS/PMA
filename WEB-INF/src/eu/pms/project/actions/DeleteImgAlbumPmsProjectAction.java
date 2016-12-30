package eu.pms.project.actions;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.tools.SessionTraker;
import eu.pms.project.database.PmsProjectAlbum;
import eu.pms.project.useCases.AddImgAlbumPmsProjectUseCase;
import eu.pms.project.useCases.DeleteImgAlbumPmsProjectUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by alisa_000 on 12/29/2016.
 */
public class DeleteImgAlbumPmsProjectAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        String proId =request.getParameter("proId");
        String albId =request.getParameter("albId");
        ArrayList inputData = new ArrayList();
        inputData.add(proId);
        inputData.add(albId);
        Collection result = new DeleteImgAlbumPmsProjectUseCase().execute(inputData, request);
        if (result != null && result.size() > 0) {

        }
        return mapping.findForward("success");
    }
}
