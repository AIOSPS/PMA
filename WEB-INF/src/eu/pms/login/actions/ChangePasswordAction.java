package eu.pms.login.actions;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Al-Quds Open University</p>
 * @author Mustafa Al-Tamim
 * @version 1.0
 */

import eu.pms.common.constant.UserInfoHolder;
import eu.pms.login.useCases.ChangePasswordUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collection;


public class ChangePasswordAction extends Action
{
    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception
    {

        if (!(eu.pms.common.tools.SessionTraker.isSessionExist(request)))
        {
            return mapping.findForward("invalidAccess");
        }

//        UpdatePasswordForm inputForm = (UpdatePasswordForm) form;

        String user = "";

        if (request.getSession().getAttribute(UserInfoHolder.STUDENT_INFO) != null)
        {
//            StudentInfoHolder studentInfo = (StudentInfoHolder) ((List) request.getSession().getAttribute(UserInfoHolder.STUDENT_INFO)).get(0);
//            user = studentInfo.getStudentId();
//            try
//            {
//                new edu.qou.studentInfo.actions.MainPageAction().execute(mapping,form,request,response);
//            }
//            catch (Exception e)
//            { }
        }

        


         if (request.getAttribute("org.apache.struts.actions.ERROR") == null)
        {
            ArrayList input = new ArrayList();
            input.add(user);



            Collection userData = new ChangePasswordUseCase().execute(input, request);

            if (userData != null && userData.size() > 0)
            {
//                UserLogin userLogin = (UserLogin) userData.iterator().next();
//                inputForm.setIsEdit(true);
//                inputForm.setScreenName(userLogin.getScreenName());
//                inputForm.setEmail(userLogin.getEmail());
//                inputForm.setMobile(userLogin.getMobile());
//                inputForm.setSmsReg((userLogin.getSmsReg() != null && userLogin.getSmsReg().equalsIgnoreCase("Y")) ? "on" : "");

            }
        }
        return mapping.findForward("showPage");
    }
}


