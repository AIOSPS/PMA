package btc.pma.activity.actions;

import btc.pma.activity.useCases.PmaActivityClasListUseCase;
import btc.pma.activity.useCases.PmaBeneficiaryTypeListUseCase;
import btc.pma.activity.useCases.PmaCommunityListUseCase;
import btc.pma.activity.useCases.PmaImplementersListUseCase;
import btc.pma.indicator.useCases.PmaIndicatorListUseCase;
import btc.pma.programme.useCases.PmaProgrammeListUseCase;
import btc.pma.result.useCases.PmaResultListUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.project.database.PmsCommunitiesVw;
import eu.pms.project.useCases.GetPmsCommunityUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by PC on 9/10/2017.
 */
public class ViewAddPmaActivityAction extends Action
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

        List indrList = (List) new PmaIndicatorListUseCase().execute(null, request);
        request.setAttribute("indrList", indrList);

        List actClasList = (List) new PmaActivityClasListUseCase().execute(null, request);
        request.setAttribute("actClasList", actClasList);

        List implList = (List) new PmaImplementersListUseCase().execute(null, request);
        request.setAttribute("implList", implList);

        List benificiaryList = (List) new PmaBeneficiaryTypeListUseCase().execute(null, request);
        request.setAttribute("benificiaryList", benificiaryList);

        List communityList = (List) new PmaCommunityListUseCase().execute(null, request);
        request.setAttribute("communityList", communityList);

        return mapping.findForward("success");
    }
}
