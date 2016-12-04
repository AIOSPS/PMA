package eu.pms.login.actions;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Al-Quds Open University</p>
 * @author Mustafa Al-Tamim
 * @version 1.0
 */

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
                                 HttpServletResponse response) throws Exception
    {
        HttpSession session = request.getSession(true);

        LoginForm item = (LoginForm) form;
        ActionMessages errors = new ActionMessages();
        List users = null;
        SecUser oneUser = null;

        String name = item.getUserId().trim();
        String pass = item.getPassword().trim();


        LoginComponent comp = new LoginComponent();

            try
            {
                users = comp.getList(new Object[]{name});
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        if (name.equals("pms") && pass.equals("123"))
        {

            String fullPath = "success";


            Cookie loginCookie = new Cookie("pmsportal", session.getId());
            loginCookie.setMaxAge(-1);
            response.addCookie(loginCookie);

            return mapping.findForward(fullPath);
        }

        return mapping.findForward("failed");
    }



}

