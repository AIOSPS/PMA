package eu.pms.masterPlan.actions;


import eu.pms.common.tools.SessionTraker;
import eu.pms.masterPlan.forms.PmsMasterPlanForm;
import eu.pms.masterPlan.useCases.GetPmsMasterPlanCommunityUseCase;
import eu.pms.masterPlan.useCases.GetPmsMasterPlanDonorsUseCase;
import eu.pms.masterPlan.useCases.GetPmsMasterPlanUseCase;
import eu.pms.project.database.PmsMasterPlan;
import eu.pms.project.database.PmsMasterPlanCommunity;
import eu.pms.project.database.PmsMasterPlanDonor;
import eu.pms.project.useCases.GetPmsCommunityUseCase;
import eu.pms.project.useCases.GetPmsDonorsUseCase;
import eu.pms.project.useCases.GetPmsImplementerUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class ViewPmsMasterPlanAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        List dononrList = (List) new GetPmsDonorsUseCase().execute(null, request);
        List implementerList = (List) new GetPmsImplementerUseCase().execute(null, request);
        List communityList = (List) new GetPmsCommunityUseCase().execute(null, request);

        request.setAttribute("dononrList", dononrList);
        request.setAttribute("implementerList", implementerList);
        request.setAttribute("communityList", communityList);

        String masId = request.getParameter("masId");
        ArrayList inputs = new ArrayList();
        inputs.add(masId);
        List masterPlanList = (List) new GetPmsMasterPlanUseCase().execute(inputs, request);
        PmsMasterPlan pmsMasterPlan = null;
        String[] masterPlanDonorArr = null;
        String[] masterPlanCommunityArr = null;
        if (masterPlanList != null && masterPlanList.size() > 0 && masterPlanList.get(0) instanceof PmsMasterPlan) {
            pmsMasterPlan = (PmsMasterPlan) masterPlanList.get(0);
            List<PmsMasterPlanDonor> masterPlanDonorList = (List) new GetPmsMasterPlanDonorsUseCase().execute(inputs, request);
            if (masterPlanDonorList != null && masterPlanDonorList.size() > 0) {
                masterPlanDonorArr = new String[masterPlanDonorList.size()];
                int i = 0;
                for (PmsMasterPlanDonor pmsMasterPlanDonor : masterPlanDonorList) {
                    masterPlanDonorArr[i] = pmsMasterPlanDonor.getCompId().getDonId();
                    i++;
                }
            }
            List<PmsMasterPlanCommunity> masterPlanCommunityList = (List) new GetPmsMasterPlanCommunityUseCase().execute(inputs, request);
            if (masterPlanCommunityList != null && masterPlanCommunityList.size() > 0) {
                masterPlanCommunityArr = new String[masterPlanCommunityList.size()];
                int i = 0;
                for (PmsMasterPlanCommunity pmsMasterPlanCommunity : masterPlanCommunityList) {
                    masterPlanCommunityArr[i] = pmsMasterPlanCommunity.getCompId().getComId();
                    i++;
                }
            }
            PmsMasterPlanForm pmsMasterPlanForm = (PmsMasterPlanForm) form;
            fillPmsProjectData(pmsMasterPlanForm, pmsMasterPlan, masterPlanDonorArr, masterPlanCommunityArr);
        }


        return mapping.findForward("success");
    }

    private void fillPmsProjectData(PmsMasterPlanForm pmsMasterPlanForm, PmsMasterPlan pmsMasterPlan, String[] masterPlanDonorArr, String[] masterPlanCommunityArr) {
        pmsMasterPlanForm.setMasId(pmsMasterPlan.getMasId());
        pmsMasterPlanForm.setImpId(pmsMasterPlan.getImpId());
        pmsMasterPlanForm.setMasMpNo(pmsMasterPlan.getMasMpNo());
        pmsMasterPlanForm.setMasMpName(pmsMasterPlan.getMasMpName());
        pmsMasterPlanForm.setMasStatus(pmsMasterPlan.getMasStatus());
        pmsMasterPlanForm.setMasStatusIca(pmsMasterPlan.getMasStatusIca());
        pmsMasterPlanForm.setMasFirstSubmitDateToIca(pmsMasterPlan.getMasFirstSubmitDateToIcaStr());
        pmsMasterPlanForm.setMasLastSubmitDateToIca(pmsMasterPlan.getMasLastSubmitDateToIcaStr());
        pmsMasterPlanForm.setMasNoSessionWithIca(pmsMasterPlan.getMasNoSessionWithIca());
        pmsMasterPlanForm.setMasSubmitToMod(pmsMasterPlan.getMasSubmitToMod());
        pmsMasterPlanForm.setMasApprovalDate(pmsMasterPlan.getMasApprovalDateStr());
        pmsMasterPlanForm.setMasPublicationDate(pmsMasterPlan.getMasPublicationDateStr());
        pmsMasterPlanForm.setMasLastDateForObjection(pmsMasterPlan.getMasLastDateForObjectionStr());
        pmsMasterPlanForm.setMasDateOfFinalPublication(pmsMasterPlan.getMasDateOfFinalPublicationStr());
        pmsMasterPlanForm.setMasApprovedPlanedArea(pmsMasterPlan.getMasApprovedPlanedArea());
        pmsMasterPlanForm.setMasVillageAdminBoarder(pmsMasterPlan.getMasVillageAdminBoarder());
        pmsMasterPlanForm.setMasNote(pmsMasterPlan.getMasNote());
        pmsMasterPlanForm.setMasMajorObjection(pmsMasterPlan.getMasMajorObjection());

        pmsMasterPlanForm.setDonorMasterPlanList(masterPlanDonorArr);
        pmsMasterPlanForm.setCommunityMasterPlanList(masterPlanCommunityArr);

    }
}

