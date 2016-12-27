package eu.pms.project.actions;


import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.tools.SessionTraker;
import eu.pms.project.database.PmsProjectAlbum;
import eu.pms.project.forms.PmsProjectAlbumForm;
import eu.pms.project.useCases.GetImgsAlbumPmsProjectListUseCase;
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

public class DownloadImgAlbumAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        String fileType ="image/jpeg";
        String proId =request.getParameter("proId");
        String albId =request.getParameter("albId");
        try
        {
            Collection retList = new DataAccessObjectImpl().getList("pms.getImgAlbum", new Object[]{proId, albId});
            if(retList!=null&&retList.size()>0)
            {
                PmsProjectAlbum obj=(PmsProjectAlbum)retList.iterator().next();

                response.setContentType(fileType);
                response.setHeader("Content-Disposition", "inline; filename=" + obj.getCompId().getAlbId() + ";");
                ServletOutputStream out = response.getOutputStream();
                BufferedInputStream bufferedIo = new BufferedInputStream(obj.getAlbImage().getBinaryStream());

                int bytesRead = 0;
                byte byteArray[] = new byte[1024];

                while (true)
                {
                    bytesRead = bufferedIo.read(byteArray);

                    if (bytesRead == -1)
                        break;

                    out.write(byteArray);
                    out.flush();
                }
                bufferedIo.close();
            }
        }
        catch ( Exception e)
        {
            System.err.println("*** Downloader.execute has  Exception detials :"+e.toString());
        }
        return mapping.findForward("success");
    }
}

