package eu.pms.lookup.actions;

import eu.pms.common.tools.SessionTraker;
import eu.pms.lookup.forms.LookupForm;
import eu.pms.lookup.useCase.DeleteLookupUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class DeleteLookupAction extends Action
{
    public ActionForward execute(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
            throws Exception
    {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        ArrayList inputs = new ArrayList();
        LookupForm lookupForm = (LookupForm) form;

        inputs.add(request.getParameter("lt"));
        inputs.add(request.getParameter("id"));

        new DeleteLookupUseCase().execute(inputs,request);
        lookupForm.setLockupType(request.getParameter("lt"));

        return mapping.findForward("success");
    }
}
