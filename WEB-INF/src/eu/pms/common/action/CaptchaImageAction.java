package eu.pms.common.action;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: Al-Quds Open University</p>
 * @author Mustafa Al-Tamim
 * @version 1.0
 */

/**
 * We used action to generate the image instead of imageTest.jsp file to eliminate the illegale stat exception
 * generated when call response.getOutputStream(); in the jsp file
 */

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.imageio.ImageIO;
import java.io.OutputStream;

import eu.pms.common.tools.PasswordImageCreator;

public class CaptchaImageAction extends Action
        {
    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception
    {
        try
        {
            // set the content type and get the output stream
            response.setContentType("image/png");
            OutputStream os = response.getOutputStream();
            String text = eu.pms.common.tools.Randomizer.shortRandom(new Integer(4));
            request.getSession().setAttribute("passwordImageData", text);
            // output the image as png
            ImageIO.write(PasswordImageCreator.createRandomImage(text.toLowerCase(), request.getRealPath("ARIAL.TTF"), new Float(20.0f), "FDF7D7", "FF0000"), "png", os);
            os.close();
        }
        catch (IllegalStateException e)
        {
            //e.printStackTrace();
        }
        catch (Exception ee)
        {
            //e.printStackTrace();
        }
        catch (Throwable eee)
        {
            //e.printStackTrace();
        }

        return null;
    }
}

