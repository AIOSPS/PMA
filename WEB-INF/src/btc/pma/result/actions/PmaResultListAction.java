package btc.pma.result.actions;

import btc.pma.result.forms.PmaResultSearchForm;
import btc.pma.result.useCases.PmaResultListUseCase;
import btc.pma.specObjective.useCases.PmaSpecObjectiveListUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.project.useCases.PmsProjectListUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC on 9/2/2017.
 */
public class PmaResultListAction  extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");

        ArrayList inputData = new ArrayList();

        List specObjectiveList = (List) new PmaSpecObjectiveListUseCase().execute(null, request);
        request.setAttribute("specObjectiveList", specObjectiveList);

        PmaResultSearchForm pmaResultSearchForm = (PmaResultSearchForm) form;
        if (pmaResultSearchForm != null) {
            inputData.add(pmaResultSearchForm.getRsltNo());
            inputData.add(pmaResultSearchForm.getRsltTitle());
            inputData.add(pmaResultSearchForm.getSobjNo());
        }
        request.setAttribute("pmaResultList", new PmaResultListUseCase().execute(inputData, request));
        return mapping.findForward("success");
    }
}