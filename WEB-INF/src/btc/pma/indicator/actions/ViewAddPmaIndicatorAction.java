package btc.pma.indicator.actions;

import btc.pma.indicator.useCases.PmaIndicatorListUseCase;
import btc.pma.programme.useCases.PmaProgrammeListUseCase;
import btc.pma.result.useCases.PmaResultListUseCase;
import btc.pma.specObjective.useCases.PmaSpecObjectiveListUseCase;
import eu.pms.common.tools.SessionTraker;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by PC on 9/7/2017.
 */
public class ViewAddPmaIndicatorAction extends Action
{

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

        return mapping.findForward("success");
    }
}
