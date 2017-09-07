package btc.pma.indicator.actions;

import btc.pma.indicator.useCases.PmaIndicatorListUseCase;
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

        List idicatorList = (List) new PmaIndicatorListUseCase().execute(null, request);
        request.setAttribute("idicatorList", idicatorList);

        return mapping.findForward("success");
    }
}
