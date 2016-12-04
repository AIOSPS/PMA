package eu.pms.common.tools;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Al-Quds Open University</p>
 * @author Mustafa Al-Tamim
 * @version 1.0
 */

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class SessionTraker
{
    public SessionTraker()
    {
    }

    public static boolean isSessionExist(HttpServletRequest request)
    {
        boolean valid = false;

//        if (request.getSession(true) != null && request.getCookies() != null)
//        {
//            Cookie[] cookies = request.getCookies();
//            String sessionId = request.getSession(true).getId().trim();
//            System.out.println("sessionId: "+ sessionId);
//            for (int i = 0; i < cookies.length; i++)
//            {
//                if (cookies[i].getName().trim().startsWith("qouportal"))
//                {
//                    System.out.println("cookieSID: "+ cookies[i].getValue().trim());
//                    if (sessionId.equals(cookies[i].getValue().trim()))
//                    {
//                        valid = true;
//                        break;
//                    }
//                }
//            }
//            if (!valid)
//                request.getSession().invalidate();
//        }
        if (request.getSession().getAttribute("userLogged") != null)
        {
            valid = true;
        }
        return valid;
    }
}