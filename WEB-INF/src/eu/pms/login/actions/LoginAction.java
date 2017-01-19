package eu.pms.login.actions;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Al-Quds Open University</p>
 * @author Mustafa Al-Tamim
 * @version 1.0
 */

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.constant.SystemConstant;
import eu.pms.login.components.LoginComponent;
import eu.pms.login.database.SecUser;
import eu.pms.login.forms.LoginForm;
import org.apache.struts.action.*;
import org.hibernate.Session;

import javax.security.auth.Subject;
import javax.security.auth.login.LoginContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

public class LoginAction extends Action
{

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        HttpSession session = request.getSession(true);

        LoginForm loginForm = (LoginForm) form;
        String forward="fail";
        ActionMessages errors = new ActionMessages();
        List users = null;

        String name = loginForm.getUserId().trim();
        String pass = loginForm.getPassword().trim();


        try {
            try {
                users = new DataAccessObjectImpl().getList("pms.getUser",new Object[]{name,pass});
                if(users!=null && users.size()>0){
                    SecUser secUser = (SecUser) users.iterator().next();
                    request.getSession().setAttribute("userInfo",secUser);
                    forward = "success";
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
//            if (name.equals("orayyan") && pass.equals("123")) {
//
//                SecUser secUser = new SecUser();
//                secUser.setUsrName("orayyan");
//                secUser.setUsrPassword("123");
//                request.getSession().setAttribute("userInfo",secUser);
//                forward = "success";
//            }
//
//
//                Cookie loginCookie = new Cookie("pmsportal", session.getId());
//                loginCookie.setMaxAge(-1);
//                response.addCookie(loginCookie);
//
//                return mapping.findForward(fullPath);
//            }

//            return mapping.findForward("failed");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mapping.findForward(forward);
    }
}

