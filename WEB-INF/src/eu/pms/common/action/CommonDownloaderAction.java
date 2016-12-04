package eu.pms.common.action;



import eu.pms.common.useCase.CommonDownloaderUseCase;
import org.apache.struts.action.*;

import javax.security.auth.Subject;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;

public class CommonDownloaderAction extends Action
{
    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response)
            throws Exception
    {
        if(!(eu.pms.common.tools.SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
        ArrayList input = new ArrayList();

        input.add((String) request.getParameter("aid"));
        input.add(request.getParameter("cd"));

        Subject userSubject = (Subject) request.getSession().getAttribute("user");
//        ArrayList userRolesList = (ArrayList) ((HibernatePrincipal) userSubject.
//                                           getPrincipals().iterator().next()).getRoles();

//        input.add(userRolesList);

//        Moidifed By Ibrahim Assi Date :4/3/2012

        if(request.getParameter("tutorUploaded") !=null)
        {
          input.add(new Boolean(request.getParameter("tutorUploaded")));
        }
        Collection result = new CommonDownloaderUseCase().execute(input, request);  
//       End Moidifed By Ibrahim Assi Date :4/3/2012


        if(result != null && result.size() != 0)
        {
           Object object = result.iterator().next();
           if(object.getClass().getName().indexOf("DBPortalFileManager") != -1)
           {
               ActionMessages errors = new ActionMessages();
               errors.add("error.actionExist", new ActionMessage("fileManager.errors.downLoadAttachmentError", "Downloading File"));
               saveErrors(request, errors);

//               DBPortalFileManager file = (DBPortalFileManager) object;
//
//               InputStream is= file.getFileContent().getBinaryStream();
//
//               response.setContentType(file.getFileType());
//               response.setHeader("Content-Disposition","inline; filename="+file.getFileName()+";");
//               ServletOutputStream out = response.getOutputStream();
//               BufferedInputStream bufferedIo = new BufferedInputStream(is);

//               int bytesRead=0;
//               byte byteArray[]=new byte[1024];
//               boolean isTrue=true;
//
//               while(isTrue)
//               {
//                 bytesRead = bufferedIo.read(byteArray);
//
//                 if(bytesRead==-1)
//                   break;
//
//                 out.write(byteArray);
//                 out.flush();
//               }
//               bufferedIo.close();
               return null;
           }
           else
           {
               ActionMessages errors = new ActionMessages();
               errors.add("error.internalError", new ActionMessage("fileManager.errors.downLoadAttachmentError", (String) object));
               saveErrors(request, errors);
           }
        }
        return mapping.findForward("downloadResult");
    }
}
