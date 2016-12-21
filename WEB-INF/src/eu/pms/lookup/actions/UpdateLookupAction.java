package eu.pms.lookup.actions;


import eu.pms.common.tools.SessionTraker;
import eu.pms.lookup.forms.LookupForm;
import eu.pms.lookup.useCase.UpdateLookupUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class UpdateLookupAction extends Action
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

        LookupForm lookupForm = (LookupForm) form;
        ArrayList inputs = new ArrayList();

        inputs.add(lookupForm.getLockupType());
        inputs.add(lookupForm.getLockupId());
        inputs.add(lookupForm.getLockupDesc());

        new UpdateLookupUseCase().execute(inputs,request);

        lookupForm.reset();

        return mapping.findForward("success");
    }
}
