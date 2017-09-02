package btc.pma.specObjective.actions;


import btc.pma.programme.database.PmaSpecificObjective;
import btc.pma.programme.useCases.PmaProgrammeListUseCase;
import btc.pma.specObjective.forms.PmaSpecObjectiveForm;
import btc.pma.specObjective.useCases.GetPmaSpecObjectiveUseCase;
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
 * Created by PC on 9/2/2017.
 */
public class ViewSpecObjectiveAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");

        List programmeList = (List) new PmaProgrammeListUseCase().execute(null, request);
        request.setAttribute("programmeList", programmeList);


        String sobjNo = request.getParameter("sobjNo");

        ArrayList inputs = new ArrayList();
        inputs.add(sobjNo);

        List pmaSpecObjectiveList = (List) new GetPmaSpecObjectiveUseCase().execute(inputs, request);
        PmaSpecificObjective pmaSpecObjective = null;

        if (pmaSpecObjectiveList != null && pmaSpecObjectiveList.size() > 0 && pmaSpecObjectiveList.get(0) instanceof PmaSpecificObjective) {
            pmaSpecObjective = (PmaSpecificObjective) pmaSpecObjectiveList.get(0);

            PmaSpecObjectiveForm pmaSpecObjectiveForm = (PmaSpecObjectiveForm) form;
            fillPmsSpecObjectiveData(pmaSpecObjectiveForm, pmaSpecObjective);
        }

        return mapping.findForward("success");
    }

    private void fillPmsSpecObjectiveData(PmaSpecObjectiveForm pmaSpecObjectiveForm, PmaSpecificObjective pmaSpecObjective) {
        pmaSpecObjectiveForm.setIntrNo(pmaSpecObjective.getIntrNo());
        pmaSpecObjectiveForm.setSobjNo(pmaSpecObjective.getSobjNo());
        pmaSpecObjectiveForm.setSobjDescription(pmaSpecObjective.getSobjDescription());
        pmaSpecObjectiveForm.setSobjRelatedDocuments(pmaSpecObjective.getSobjRelatedDocuments());
        pmaSpecObjectiveForm.setSobjDefineDate(pmaSpecObjective.getSobjDefineDateStr());
        pmaSpecObjectiveForm.setSobjAdaptationDate(pmaSpecObjective.getSobjAdaptationDateStr());

    }
}
