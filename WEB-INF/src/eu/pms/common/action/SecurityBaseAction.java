package eu.pms.common.action;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: Al-Quds Open University</p>
 * @author Mustafa Al-Tamim
 * @version 1.0
 */

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecurityBaseAction extends Action
{
    private String className = null;

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response)
            throws Exception
    {
        if(!(eu.pms.common.tools.SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");

//        if(!(edu.qou.security.actionroles.tools.ActionToRoleChecker.
//             checkActionToRole(request, className)))
//            return mapping.findForward(com.psgateway.action.
//                                     PsgatewayActionConstans.NO_PERMISSION);
        return null;
    }

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response,
                                 String className)
            throws Exception
    {
        this.className = className;
        return execute(mapping, form, request, response);
    }
}
