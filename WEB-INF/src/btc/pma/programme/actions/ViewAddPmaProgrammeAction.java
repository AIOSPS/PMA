package btc.pma.programme.actions;

import eu.pms.activity.useCases.GetPmsInterventionUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.intervention.useCases.GetPmsSectorsUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by PC on 8/28/2017.
 */
public class ViewAddPmaProgrammeAction  extends Action
{

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");

        List sectorsList = (List) new GetPmsSectorsUseCase().execute(null, request);

        request.setAttribute("sectorsList", sectorsList);

        return mapping.findForward("success");
    }
}
