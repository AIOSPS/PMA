package btc.pma.indicator.actions;

import btc.pma.indicator.forms.PmaIndicatorSearchForm;
import btc.pma.indicator.useCases.PmaIndicatorListUseCase;
import btc.pma.programme.useCases.PmaProgrammeListUseCase;
import btc.pma.result.useCases.PmaResultListUseCase;
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
 * Created by PC on 9/6/2017.
 */
public class PmaIndicatorListAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");

        List programmeList = (List) new PmaProgrammeListUseCase().execute(null, request);
        request.setAttribute("programmeList", programmeList);

        List resultList = (List) new PmaResultListUseCase().execute(null, request);
        request.setAttribute("resultList", resultList);

        ArrayList inputData = new ArrayList();
        PmaIndicatorSearchForm pmaIndicatorSearchForm = (PmaIndicatorSearchForm) form;
        if (pmaIndicatorSearchForm != null) {
            inputData.add(pmaIndicatorSearchForm.getIntrNo());
            inputData.add(pmaIndicatorSearchForm.getRsltNo());
        }
        request.setAttribute("pmaIndicatorList", new PmaIndicatorListUseCase().execute(inputData, request));
        return mapping.findForward("success");
    }
}