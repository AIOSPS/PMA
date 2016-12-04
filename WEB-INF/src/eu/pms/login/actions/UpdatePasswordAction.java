package eu.pms.login.actions;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Al-Quds Open University</p>
 * @author Mustafa Al-Tamim
 * @version 1.0
 */

import eu.pms.common.struct.AuditInfo;
import eu.pms.login.useCases.UpdatePasswordUseCase;
import eu.pms.common.component.CommonOperationMessage;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class UpdatePasswordAction extends Action
{
    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception
    {
        if (!(eu.pms.common.tools.SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");

//        UpdatePasswordForm inForm = (UpdatePasswordForm) form;
//        ActionMessages messages = new ActionMessages();
//        ActionMessage message = null;
        String returnPath = "success";
//        ArrayList inputs = new ArrayList();
//        boolean updateMoodlePswd = false;
//        String userName = "";
//
//        int type = Integer.parseInt(request.getParameter("type"));
//
//        switch (type)
//        {
//            case 1:// change student password
////                StudentInfoHolder studentInfo = (StudentInfoHolder) ((List) request.getSession().getAttribute(UserInfoHolder.STUDENT_INFO)).get(0);
////                userName = studentInfo.getStudentId();
//                inputs.add(userName);
//                inputs.add(inForm.getSmsReg());
//                updateMoodlePswd = true;
//
//                 // check if  mobile number found by another student
//
//                if(inForm.getMobile() !=null && !inForm.getMobile().equals(""))
//                {
//                    try {
//                        List dataList = new UpdatePasswordComponent().getStudLoginMobileInfo(inForm.getMobile(), userName);
//                        if (dataList != null && dataList.size() > 0)
//                        {
//                            CommonOperationMessage.operationFailed(request, "studInfo.PersonalStudentInfo.found.mobileNum");
//                            return mapping.findForward("failed");
//                        }
//                    }
//                    catch (Exception e) {
//                        System.err.println("Error in UpdatePasswordAction.execute:" + e);
//                    }
//                }
//
//                break;
//
//
//        }
//
////        inputs.add(Encrypter.encrypt(inForm.getOldPassword()));
////        inputs.add(Encrypter.encrypt(inForm.getNewPassword()));
//        inputs.add(inForm.getEmail());
//        inputs.add(inForm.getMobile());
//        inputs.add(inForm.getProcessNoUpdate());
////        inputs.add(Encrypter.encrypt(inForm.getCurrentPassword()));
//        inputs.add("OWN"); // how change password
//
//
//        String screenName=  inForm.getScreenName();
//        AuditInfo audInfo = new AuditInfo(request);
//        inputs.add(audInfo.getTimeStamp());  // Date change password
//        inputs.add(audInfo.getRemoteIp());
//        inputs.add(audInfo.getAuditScreenId());
//        inputs.add(screenName);
//
//        Collection result = new UpdatePasswordUseCase().execute(inputs, request);
//
//        if (result != null && result.size() > 0) // error occured, the password doesnot match
//        {
//            messages.add("errorUpdate", new ActionMessage("errors.wrongOldPassword"));
//            returnPath = "failed";
//        }
//        else
//        {
//            messages.add("successUpdate", new ActionMessage("message.passwordChangeSuccess"));
////            if(updateMoodlePswd)
////            {   // update the password in moodle if user exist
////                MoodleUsersManager mum = new MoodleUsersManager();
////                EasMoodleUsersManager easmum = new EasMoodleUsersManager();
////                mum.updateMoodleUserPassword(userName, inForm.getNewPassword());
////                easmum.updateMoodleUserPassword(userName, inForm.getNewPassword());
////            }
//            CommonOperationMessage.updateSuccess(request);
//        }
//        saveErrors(request, messages);

        return mapping.findForward(returnPath);

    }
}

