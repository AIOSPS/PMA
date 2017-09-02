package btc.pma.specObjective.actions;

import btc.pma.programme.useCases.PmaProgrammeListUseCase;
import btc.pma.specObjective.forms.PmaSpecObjectiveSearchForm;
import btc.pma.specObjective.useCases.PmaSpecObjectiveListUseCase;
import eu.pms.common.tools.SessionTraker;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC on 8/29/2017.
 */
public class PmaSpecObjectiveListAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");

        ArrayList inputData = new ArrayList();

        List programmeList = (List) new PmaProgrammeListUseCase().execute(null, request);
        request.setAttribute("programmeList", programmeList);

        PmaSpecObjectiveSearchForm pmaSpecObjectiveSearchForm = (PmaSpecObjectiveSearchForm) form;
        if (pmaSpecObjectiveSearchForm != null) {
            inputData.add(pmaSpecObjectiveSearchForm.getIntrNo());
            inputData.add(pmaSpecObjectiveSearchForm.getSobjNo());
            inputData.add(pmaSpecObjectiveSearchForm.getSobjDescription());
        }
        request.setAttribute("pmaSpecObjectiveList", new PmaSpecObjectiveListUseCase().execute(inputData, request));
        return mapping.findForward("success");
    }
}
