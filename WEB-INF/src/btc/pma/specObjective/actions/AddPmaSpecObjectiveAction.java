package btc.pma.specObjective.actions;

import btc.pma.programme.forms.PmaProgrammeInfoForm;
import btc.pma.programme.useCases.AddPmaProgrammeUseCase;
import btc.pma.specObjective.forms.PmaSpecObjectiveForm;
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
 * Created by PC on 9/2/2017.
 */
public class AddPmaSpecObjectiveAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        PmaSpecObjectiveForm pmaSpecObjectiveForm = (PmaSpecObjectiveForm) form;
        String intrNo = pmaSpecObjectiveForm.getIntrNo();
        String sobjNo = pmaSpecObjectiveForm.getSobjNo();
        String sobjDescription = pmaSpecObjectiveForm.getSobjDescription();
        String sobjDefineDate = pmaSpecObjectiveForm.getSobjDefineDate();
        String sobjAdaptationDate = pmaSpecObjectiveForm.getSobjAdaptationDate();
        String sobjRelatedDocuments = pmaSpecObjectiveForm.getSobjRelatedDocuments();

        ArrayList inputs = new ArrayList();
        inputs.add(intrNo);
        inputs.add(sobjNo);
        inputs.add(sobjDescription);
        inputs.add(sobjDefineDate);
        inputs.add(sobjAdaptationDate);
        inputs.add(sobjRelatedDocuments);

        Collection result = new AddPmaProgrammeUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }

        return mapping.findForward("success");
    }
}
