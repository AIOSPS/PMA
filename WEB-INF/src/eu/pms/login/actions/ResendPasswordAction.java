package eu.pms.login.actions;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: Al-Quds Open University</p>
 * @author Mustafa Al-Tamim
 * @version 1.0
 */

 import eu.pms.login.useCases.ResendPasswordUseCase;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ResendPasswordAction extends Action{
  public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response)throws Exception
  {
//    ForgetPasswordForm inForm = (ForgetPasswordForm) form;
//    ArrayList input = new ArrayList();
//
//    input.add(inForm.getRegistrationId());
//
//    Collection result = new ResendPasswordUseCase().execute(input, request);
//
//    Iterator iter = result.iterator();
//    int statusNo = Integer.parseInt((String) iter.next());
//
//    ActionMessages messages = new ActionMessages();
//    ActionMessage message = null;
//
//    switch(statusNo)
//    {
//      case 1://NOT_EXIST
//            message = new ActionMessage("errors.accountRegistration.userNotExist");
//            break;
//
//      case 2://INVALID_INFO
//            message = new ActionMessage("errors.accountRegistration.invalidAccountInfo");
//            break;
//
//      case 3://ALREADY_REGISTRED
//            message = new ActionMessage("message.accountRegistration.existUser");
//            request.setAttribute("success", new String("success"));
//            break;
//
//      case 4://NEW_USER
//            message = new ActionMessage("message.accountRegistration.successfulRegistration");
//            request.setAttribute("success", new String("success"));
//            break;
//
//      case 5://FATAL_ERROR
//            message = new ActionMessage("errors.accountRegistration.fatalError");
//            break;
//
//      case 6://DISABLED_ACCOUNT
//            message = new ActionMessage("errors.accountRegistration.disabledAccount");
//            break;
//    }
//
//    messages.add( ActionMessages.GLOBAL_MESSAGE, message);
//    saveErrors( request, messages );

    return mapping.findForward("success");
  }
}

