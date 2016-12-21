package eu.pms.common.tools;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Al-Quds Open University</p>
 * @author Mustafa Al-Tamim
 * @version 1.0
 */

import eu.pms.common.exceptions.ComponentException;
import eu.pms.login.components.LoginComponent;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

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
        if (request.getSession().getAttribute("userInfo") != null)
        {
            valid = true;
        }
        return valid;
    }

    public static boolean checkActionToRole(HttpServletRequest request, String actionName) throws ComponentException {
        boolean hasRole = false;
//        List result = null;
//
//        LoginComponent authcmp = new LoginComponent();
//        actionName = actionName.substring(actionName.lastIndexOf(".") + 1);
//        Integer userRole = 0;
//        if (request.getSession().getAttribute("userRule") != null)
//            userRole = Integer.parseInt("" + request.getSession().getAttribute("userRule"));
//        String userRoleDesc = "";
//        if (request.getSession().getAttribute("userRuleDesc") != null)
//            userRoleDesc = "" + request.getSession().getAttribute("userRuleDesc");
//
//        if (userRole != 0) {
//            if (userRoleDesc.equalsIgnoreCase(RoleConstants.RoleConstant.manage.getCode())&&
//                    ((QLBUsersList) request.getSession().getAttribute("user")).getCode().equals("LIBADMIN")) // this mean this is admin
//            {
//                hasRole = true;
//            } else {
//                result = authcmp.checkActionPermission(userRole, actionName);
//
//                if (result != null && result.size() > 0) {
//                    hasRole = true;
//                }
//            }
//        } else {
//            if (((QLBUsersList) request.getSession().getAttribute("user")).getCode().equals("LIBADMIN")) {
//                hasRole = true;
//            }
//        }
        return hasRole;
    }
}