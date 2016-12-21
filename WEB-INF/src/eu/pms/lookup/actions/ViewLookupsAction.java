package eu.pms.lookup.actions;


import eu.pms.common.tools.SessionTraker;
import eu.pms.lookup.forms.LookupForm;
import eu.pms.lookup.useCase.ViewLookupUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collection;

public class ViewLookupsAction extends Action
{
    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response)
            throws Exception
    {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");

        String[] lookupsAlias = new String[]{"Data Sources","Benificiary Types"};
        ArrayList inputs = new ArrayList();
        LookupForm lookupForm = (LookupForm) form;
        String lookupType = request.getParameter("lt");

        if(lookupType == null && lookupForm.getLockupType() != null && !lookupForm.getLockupType().trim().equals(""))
             lookupType = lookupForm.getLockupType();

        if(lookupType == null)
            lookupType = "1";

        Integer lookupTypeVal = new Integer(lookupType);

        request.setAttribute("lkAlias", lookupsAlias[lookupTypeVal.intValue() - 1]);

        inputs.add(lookupType);

        Collection lookupList = new ViewLookupUseCase().execute(inputs,request);
        request.setAttribute("lookups",lookupList);
        request.setAttribute("tabNo", lookupType);
        lookupForm.reset();
        lookupForm.setLockupType(lookupType);

        return mapping.findForward("success");
    }
}
