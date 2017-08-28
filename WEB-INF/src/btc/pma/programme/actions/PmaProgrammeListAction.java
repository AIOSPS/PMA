package btc.pma.programme.actions;

import btc.pma.programme.forms.PmaProgrammeSearchForm;
import btc.pma.programme.useCases.PmaProgrammeListUseCase;
import eu.pms.activity.forms.PmsActivitySearchForm;
import eu.pms.activity.useCases.PmsActivityListUseCase;
import eu.pms.common.tools.SessionTraker;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 * Created by PC on 8/27/2017.
 */
public class PmaProgrammeListAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");

        ArrayList inputData = new ArrayList();
        PmaProgrammeSearchForm pmaProgrammeSearchForm = (PmaProgrammeSearchForm) form;
        if (pmaProgrammeSearchForm != null) {
            inputData.add(pmaProgrammeSearchForm.getIntrNo());
            inputData.add(pmaProgrammeSearchForm.getIntrTitle());
            inputData.add(pmaProgrammeSearchForm.getIntrDescription());
        }
        request.setAttribute("pmaProgrammeList", new PmaProgrammeListUseCase().execute(inputData, request));
        return mapping.findForward("success");
    }
}
