package eu.pms.masterPlan.actions;


import eu.pms.common.tools.SessionTraker;
import eu.pms.masterPlan.forms.PmsMasterPlanForm;
import eu.pms.masterPlan.useCases.AddPmsMasterPlanUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collection;

public class AddPmsMasterPlanAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        PmsMasterPlanForm pmsMasterPlanForm = (PmsMasterPlanForm) form;
        String masId = pmsMasterPlanForm.getMasId();
        String impId = pmsMasterPlanForm.getImpId();
        String masMpNo = pmsMasterPlanForm.getMasMpNo();
        String masMpName = pmsMasterPlanForm.getMasMpName();
        String masStatus = pmsMasterPlanForm.getMasStatus();
        String masStatusIca = pmsMasterPlanForm.getMasStatusIca();
        String masFirstSubmitDateToIca = pmsMasterPlanForm.getMasFirstSubmitDateToIca();//
        String masLastSubmitDateToIca = pmsMasterPlanForm.getMasLastSubmitDateToIca();//
        Integer masNoSessionWithIca = pmsMasterPlanForm.getMasNoSessionWithIca();
        String masSubmitToMod = pmsMasterPlanForm.getMasSubmitToMod();
        String masApprovalDate = pmsMasterPlanForm.getMasApprovalDate();//
        String masPublicationDate = pmsMasterPlanForm.getMasPublicationDate();//
        String masLastDateForObjection = pmsMasterPlanForm.getMasLastDateForObjection();//
        String masDateOfFinalPublication = pmsMasterPlanForm.getMasDateOfFinalPublication();//
        Integer masApprovedPlanedArea = pmsMasterPlanForm.getMasApprovedPlanedArea();
        String masVillageAdminBoarder = pmsMasterPlanForm.getMasVillageAdminBoarder();
        String masNote = pmsMasterPlanForm.getMasNote();
        String masMajorObjection = pmsMasterPlanForm.getMasMajorObjection();

        String[] donorMasterPlanArray = pmsMasterPlanForm.getDonorMasterPlanList();
        String[] communityMasterPlanArray = pmsMasterPlanForm.getCommunityMasterPlanList();

        ArrayList inputs = new ArrayList();
        inputs.add(masId);
        inputs.add(impId);
        inputs.add(masMpNo);
        inputs.add(masMpName);
        inputs.add(masStatus);
        inputs.add(masStatusIca);
        inputs.add(masFirstSubmitDateToIca);
        inputs.add(masLastSubmitDateToIca);
        inputs.add(masNoSessionWithIca);
        inputs.add(masSubmitToMod);
        inputs.add(masApprovalDate);
        inputs.add(masPublicationDate);
        inputs.add(masLastDateForObjection);
        inputs.add(masDateOfFinalPublication);
        inputs.add(masApprovedPlanedArea);
        inputs.add(masVillageAdminBoarder);
        inputs.add(masNote);
        inputs.add(masMajorObjection);
        inputs.add(donorMasterPlanArray);
        inputs.add(communityMasterPlanArray);


        Collection result = new AddPmsMasterPlanUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }
        pmsMasterPlanForm.reset(mapping, request);
        return mapping.findForward("success");
    }
}

