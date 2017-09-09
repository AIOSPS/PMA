package btc.pma.activity.actions;

import btc.pma.activity.forms.PmaActivitySearchForm;
import btc.pma.activity.useCases.PmaActivityListUseCase;
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
 * Created by PC on 9/9/2017.
 */
public class PmaActivityListAction  extends Action {

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

        List indrList = (List) new PmaIndicatorListUseCase().execute(null, request);
        request.setAttribute("indrList", indrList);

        ArrayList inputData = new ArrayList();
        PmaActivitySearchForm pmaActivitySearchForm = (PmaActivitySearchForm) form;
        if (pmaActivitySearchForm != null) {
            inputData.add(pmaActivitySearchForm.getIntrNo());
            inputData.add(pmaActivitySearchForm.getRsltNo());
            inputData.add(pmaActivitySearchForm.getIndrNo());
        }
        request.setAttribute("pmaActivityList", new PmaActivityListUseCase().execute(inputData, request));
        return mapping.findForward("success");
    }
}
