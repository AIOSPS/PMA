package eu.pms.warnings.actions;


import eu.pms.activity.forms.PmsActivityForm;
import eu.pms.activity.useCases.AddPmsActivityUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.intervention.forms.PmsInterventionForm;
import eu.pms.intervention.useCases.AddPmsInterventionUseCase;
import eu.pms.warnings.forms.PmsWarningForm;
import eu.pms.warnings.useCases.AddPmsWarningUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class AddPmsWarningAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        PmsWarningForm pmsWarningForm = (PmsWarningForm) form;
        String warId = pmsWarningForm.getWarId();
        if (warId == null || warId.equals("")){
            warId = eu.pms.common.tools.Randomizer.randomIntegers(10).toString();
        }
        String warNo = pmsWarningForm.getWarNo();
        String warWarnedName = pmsWarningForm.getWarWarnedName();
        String warWarnedId = pmsWarningForm.getWarWarnedId();
        String comId = pmsWarningForm.getComId();
        String donId = pmsWarningForm.getDonId();
        java.math.BigDecimal warLatitude = pmsWarningForm.getWarLatitude();
        java.math.BigDecimal warLongitude = pmsWarningForm.getWarLongitude();
        String warType = pmsWarningForm.getWarType();
        String warStructType = pmsWarningForm.getWarStructType();
        String warIssueDate = pmsWarningForm.getWarIssueDate();
        String warSubmitDate = pmsWarningForm.getWarSubmitDate();
        String warReceptionistId = pmsWarningForm.getWarReceptionistId();
        String warReceptionistName = pmsWarningForm.getWarReceptionistName();
        String warReceptionDate = pmsWarningForm.getWarReceptionDate();
        String warStatus = pmsWarningForm.getWarStatus();
        String warNotes = pmsWarningForm.getWarNotes();


        ArrayList inputs = new ArrayList();
        inputs.add(warId);
        inputs.add(warNo);
        inputs.add(warWarnedName);
        inputs.add(warWarnedId);
        inputs.add(comId);
        inputs.add(donId);
        inputs.add(warLatitude);
        inputs.add(warLongitude);
        inputs.add(warType);
        inputs.add(warStructType);
        inputs.add(warIssueDate);
        inputs.add(warSubmitDate);
        inputs.add(warReceptionistId);
        inputs.add(warReceptionistName);
        inputs.add(warReceptionDate);
        inputs.add(warStatus);
        inputs.add(warNotes);

        Collection result = new AddPmsWarningUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }

        return mapping.findForward("success");
    }
}

