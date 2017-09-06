package btc.pma.result.actions;

import btc.pma.programme.database.PmaProgrammeInfo;
import btc.pma.programme.database.PmaResult;
import btc.pma.programme.forms.PmaProgrammeInfoForm;
import btc.pma.programme.useCases.GetPmaProgrammeUseCase;
import btc.pma.result.forms.PmaResultForm;
import btc.pma.result.useCases.GetPmaResultUseCase;
import btc.pma.specObjective.useCases.PmaSpecObjectiveListUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.intervention.useCases.GetPmsSectorsUseCase;
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
public class ViewPmaResultAction  extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");




        List specObjectiveList = (List) new PmaSpecObjectiveListUseCase().execute(null, request);
        request.setAttribute("specObjectiveList", specObjectiveList);

        String rsltNo = request.getParameter("rsltNo");

        ArrayList inputs = new ArrayList();
        inputs.add(rsltNo);

        List resultList = (List) new GetPmaResultUseCase().execute(inputs, request);
        PmaResult pmaResult = null;
        if (resultList != null && resultList.size() > 0 && resultList.get(0) instanceof PmaResult) {
            pmaResult = (PmaResult) resultList.get(0);

            PmaResultForm pmaResultForm = (PmaResultForm) form;
            fillPmaResultData(pmaResultForm, pmaResult);
        }

        return mapping.findForward("success");
    }

    private void fillPmaResultData(PmaResultForm pmaResultForm, PmaResult pmaResult) {
        pmaResultForm.setRsltNo(pmaResult.getRsltNo());
        pmaResultForm.setRsltTitle(pmaResult.getRsltTitle());
        pmaResultForm.setRsltDefineDate(pmaResult.getRsltDefineDateStr());
        pmaResultForm.setRsltCloseDate(pmaResult.getRsltCloseDateStr());
        pmaResultForm.setRsltStatus(pmaResult.getRsltStatus());
        pmaResultForm.setRsltLongDescription(pmaResult.getRsltLongDescription());
        pmaResultForm.setSobjNo(pmaResult.getSobjNo());
    }
}

