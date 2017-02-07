package eu.pms.warnings.actions;


import eu.pms.common.tools.SessionTraker;
import eu.pms.project.database.PmsCommunitiesVw;
import eu.pms.project.database.PmsWarnings;
import eu.pms.project.useCases.GetPmsCommunityUseCase;
import eu.pms.project.useCases.GetPmsDonorsUseCase;
import eu.pms.warnings.forms.PmsWarningForm;
import eu.pms.warnings.useCases.GetPmsWarningUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class ViewPmsWarningAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        List communityList = (List) new GetPmsCommunityUseCase().execute(null, request);
        List dononrList = (List) new GetPmsDonorsUseCase().execute(null, request);
        request.setAttribute("communityList",  communityList!=null && communityList.size()>0&& communityList.get(0) instanceof PmsCommunitiesVw ?communityList:null);
        request.setAttribute("dononrList", dononrList);

        String warId = request.getParameter("warId");
        ArrayList inputs = new ArrayList();
        inputs.add(warId);
        List warningList = (List) new GetPmsWarningUseCase().execute(inputs, request);
        PmsWarnings pmsWarnings = null;
        if (warningList != null && warningList.size() > 0 && warningList.get(0) instanceof PmsWarnings) {
            pmsWarnings = (PmsWarnings) warningList.get(0);

            PmsWarningForm pmsWarningForm = (PmsWarningForm) form;
            fillPmsWarningData(pmsWarningForm, pmsWarnings);
        }


        return mapping.findForward("success");
    }

    private void fillPmsWarningData(PmsWarningForm pmsWarningForm, PmsWarnings pmsWarnings) {
        pmsWarningForm.setWarId(pmsWarnings.getWarId());
        pmsWarningForm.setWarNo(pmsWarnings.getWarNo());
        pmsWarningForm.setWarWarnedName(pmsWarnings.getWarWarnedName());
        pmsWarningForm.setWarWarnedId(pmsWarnings.getWarWarnedId());
        pmsWarningForm.setComId(pmsWarnings.getComId());
        pmsWarningForm.setDonId(pmsWarnings.getDonId());
        pmsWarningForm.setWarLatitude(pmsWarnings.getWarLatitude());
        pmsWarningForm.setWarLongitude(pmsWarnings.getWarLongitude());
        pmsWarningForm.setWarType(pmsWarnings.getWarType());
        pmsWarningForm.setWarStructType(pmsWarnings.getWarStructType());
        pmsWarningForm.setWarIssueDate(pmsWarnings.getWarIssueDateStr());
        pmsWarningForm.setWarSubmitDate(pmsWarnings.getWarSubmitDateStr());
        pmsWarningForm.setWarReceptionistId(pmsWarnings.getWarReceptionistId());
        pmsWarningForm.setWarReceptionistName(pmsWarnings.getWarReceptionistName());
        pmsWarningForm.setWarReceptionDate(pmsWarnings.getWarReceptionDateStr());
        pmsWarningForm.setWarStatus(pmsWarnings.getWarStatus());
        pmsWarningForm.setWarNotes(pmsWarnings.getWarNotes());
    }
}

