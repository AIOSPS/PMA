package btc.pma.result.actions;

import btc.pma.result.forms.PmaResultForm;
import btc.pma.result.useCases.AddPmaResultUseCase;
import eu.pms.common.tools.SessionTraker;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by PC on 9/6/2017.
 */
public class AddPmaResultAction  extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        PmaResultForm pmaResultForm = (PmaResultForm) form;
        String rsltNo = pmaResultForm.getRsltNo();
        String rsltTitle = pmaResultForm.getRsltTitle();
        String rsltDefineDate = pmaResultForm.getRsltDefineDate();
        String rsltCloseDate = pmaResultForm.getRsltCloseDate();
        String rsltStatus = pmaResultForm.getRsltStatus();
        String rsltLongDescription = pmaResultForm.getRsltLongDescription();
        String sobjNo = pmaResultForm.getSobjNo();

        ArrayList inputs = new ArrayList();
        inputs.add(rsltNo);
        inputs.add(rsltTitle);
        inputs.add(rsltDefineDate);
        inputs.add(rsltCloseDate);
        inputs.add(rsltStatus);
        inputs.add(rsltLongDescription);
        inputs.add(sobjNo);

        Collection result = new AddPmaResultUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }

        return mapping.findForward("success");
    }
}
