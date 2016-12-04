package eu.pms.admin.servlets;

import eu.pms.common.component.DataAccessObjectImpl;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: iassi
 * Date: 23/09/2013
 * Time: 10:22:21 ص
 * To change this template use File | Settings | File Templates.
 */
public class StudImgDownloader   extends HttpServlet
{

    public void doGet(HttpServletRequest request, HttpServletResponse res)
            throws ServletException, IOException {

        doPost(request, res);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

          String  termNo = request.getParameter("termNo");
          String  programNo = request.getParameter("programNo");
          String  studId = request.getParameter("studId");




           try
        {

//               Collection retList=  new DataAccessObjectImpl().getList("acad.getPrtlStudHonorRecord",new Object[]{termNo,programNo,studId});
//               if(retList!=null&&retList.size()>0)
//               {
//                    PrtlStudHonor obj=(PrtlStudHonor)retList.iterator().next();
//
//                    response.setContentType(obj.getStudPictureType());
//                    response.setHeader("Content-Disposition", "inline; filename=" + obj.getStudPictureName() + ";");
//                    ServletOutputStream out = response.getOutputStream();
//                    BufferedInputStream bufferedIo = new BufferedInputStream(obj.getStudPicture().getBinaryStream());
//
//                    int bytesRead = 0;
//                    byte byteArray[] = new byte[1024];
//
//                    while (true)
//                    {
//                        bytesRead = bufferedIo.read(byteArray);
//
//                        if (bytesRead == -1)
//                            break;
//
//                        out.write(byteArray);
//                        out.flush();
//                    }
//                    bufferedIo.close();
//               }

        }
        catch ( Exception e)
        {
             System.err.println("*** StudImgDownloader.execute has  Exception detials :"+e.toString());
        }


    }
}
