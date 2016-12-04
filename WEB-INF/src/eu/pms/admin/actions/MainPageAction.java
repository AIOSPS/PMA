package eu.pms.admin.actions;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;


/**
 * Auther: Mustafa Al-Tamim
 * Date: Oct 29, 2008
 * Time: 11:26:31 AM
 * QOU Portal Project (ICTC)  center
 * version 1.0
 */
public class MainPageAction extends Action
{
    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception
    {
        if (!(eu.pms.common.tools.SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");


        return mapping.findForward("success");
    }
}
