package eu.pms.project.actions;


import eu.pms.project.database.*;
import eu.pms.project.forms.PmsProjectForm;
import eu.pms.project.useCases.*;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class ViewPmsProjectAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        List dononrList = (List) new GetPmsDonorsUseCase().execute(null, request);
        List implementerList = (List) new GetPmsImplementerUseCase().execute(null, request);
        List developmentAgencyList = (List) new GetPmsDevelopmentAgencyUseCase().execute(null, request);
        List programmList = (List) new GetPmsProgrammUseCase().execute(null, request);
        List locationList = (List) new GetPmsLocationUseCase().execute(null, request);
        List communityList = (List) new GetPmsCommunityUseCase().execute(null, request);
        List clusterList = (List) new GetPmsClusterTypUseCase().execute(null, request);
        List permitList = (List) new GetPmsPermitUseCase().execute(null, request);
        List benificiryList = (List) new GetPmsBenificiaryUseCase().execute(null, request);
        List indicatorList = (List) new GetPmsIndicatorListUseCase().execute(null, request);
        request.setAttribute("dononrList", dononrList);
        request.setAttribute("implementerList", implementerList);
        request.setAttribute("developmentAgencyList", developmentAgencyList);
        request.setAttribute("programmList", programmList);
        request.setAttribute("locationList", locationList);
        request.setAttribute("communityList", communityList);
        request.setAttribute("clusterList", clusterList);
        request.setAttribute("permitList", permitList);
        request.setAttribute("benificiryList", benificiryList);
        request.setAttribute("indicatorList", indicatorList);

        String proId = request.getParameter("proId");
        ArrayList inputs = new ArrayList();
        inputs.add(proId);
        List projectList = (List) new GetPmsProjectUseCase().execute(inputs, request);
        PmsProject pmsProject = null;
        String[] projectDonorArr = null;
        String[] projectImplementerArr = null;
        String[] projectLocationArr = null;
        String[] projectCommunityArr = null;
        String[] projectBenificiryArr = null;
        String[] projectIndicatorArr = null;
        if (projectList != null && projectList.size() > 0 && projectList.get(0) instanceof PmsProject) {
            pmsProject = (PmsProject) projectList.get(0);
            List<PmsProjectDonor> projectDonorList = (List) new GetPmsProjectDonorsUseCase().execute(inputs, request);
            if (projectDonorList != null && projectDonorList.size() > 0) {
                projectDonorArr = new String[projectDonorList.size()];
                int i = 0;
                for (PmsProjectDonor pmsProjectDonor : projectDonorList) {
                    projectDonorArr[i] = pmsProjectDonor.getCompId().getDonId();
                    i++;
                }
            }
            List<PmsProjectsImplementer> projectImplementerList = (List) new GetPmsProjectImplementerUseCase().execute(inputs, request);
            if (projectImplementerList != null && projectImplementerList.size() > 0) {
                projectImplementerArr = new String[projectImplementerList.size()];
                int i = 0;
                for (PmsProjectsImplementer pmsProjectsImplementer : projectImplementerList) {
                    projectImplementerArr[i] = pmsProjectsImplementer.getCompId().getImpId();
                    i++;
                }
            }
            List<PmsProjectsLocation> projectLocationList = (List) new GetPmsProjectLocationUseCase().execute(inputs, request);
            if (projectLocationList != null && projectLocationList.size() > 0) {
                projectLocationArr = new String[projectLocationList.size()];
                int i = 0;
                for (PmsProjectsLocation pmsProjectsLocation : projectLocationList) {
                    projectLocationArr[i] = pmsProjectsLocation.getCompId().getLocId();
                    i++;
                }
            }
            List<PmsProjectsCommunity> projectCommunityList = (List) new GetPmsProjectCommunityUseCase().execute(inputs, request);
            if (projectCommunityList != null && projectCommunityList.size() > 0) {
                projectCommunityArr = new String[projectCommunityList.size()];
                int i = 0;
                for (PmsProjectsCommunity pmsProjectsCommunity : projectCommunityList) {
                    projectCommunityArr[i] = pmsProjectsCommunity.getCompId().getComId();
                    i++;
                }
            }
            List<PmsProjectsBenificiary> projectBenificiryList = (List) new GetPmsProjectBenificiaryUseCase().execute(inputs, request);
            if (projectBenificiryList != null && projectBenificiryList.size() > 0) {
                projectBenificiryArr = new String[projectBenificiryList.size()];
                int i = 0;
                for (PmsProjectsBenificiary pmsProjectsBenificiary : projectBenificiryList) {
                    projectBenificiryArr[i] = pmsProjectsBenificiary.getCompId().getBenId();
                    i++;
                }
            }
            List<PmsProjectsIndicator> projectIndicatorList = (List) new GetPmsProjectIndicatorUseCase().execute(inputs, request);
            if (projectIndicatorList != null && projectIndicatorList.size() > 0) {
                projectIndicatorArr = new String[projectIndicatorList.size()];
                int i = 0;
                for (PmsProjectsIndicator pmsProjectsIndicator : projectIndicatorList) {
                    projectIndicatorArr[i] = pmsProjectsIndicator.getCompId().getIndId();
                    i++;
                }
            }
            PmsProjectForm pmsProjectForm = (PmsProjectForm) form;
            fillPmsProjectData(pmsProjectForm, pmsProject, projectDonorArr, projectImplementerArr, projectLocationArr, projectCommunityArr, projectBenificiryArr, projectIndicatorArr);
        }


        return mapping.findForward("success");
    }

    private void fillPmsProjectData(PmsProjectForm pmsProjectForm, PmsProject pmsProject, String[] projectDonorArr, String[] projectImplementerArr, String[] projectLocationArr, String[] projectCommunityArr, String[] projectBenificiryArr, String[] projectIndicatorArr) {
        pmsProjectForm.setProId(pmsProject.getProId());
        pmsProjectForm.setProTitle(pmsProject.getProTitle());
        pmsProjectForm.setProDescription(pmsProject.getProDescription());
        pmsProjectForm.setProStatus(pmsProject.getProStatus());
        pmsProjectForm.setProStartDate(pmsProject.getProStartDateStr());
        pmsProjectForm.setProEndDate(pmsProject.getProEndDateStr());
        pmsProjectForm.setProBudget(pmsProject.getProBudget());
        pmsProjectForm.setProNotes(pmsProject.getProNotes());
        pmsProjectForm.setDevId(pmsProject.getDevId());
        pmsProjectForm.setPrgId(pmsProject.getPrgId());
        pmsProjectForm.setProArea(pmsProject.getProArea());
        pmsProjectForm.setProType(pmsProject.getProType());
        pmsProjectForm.setProHasCluster(pmsProject.getProHasCluster());
        pmsProjectForm.setCluId(pmsProject.getCluId());
        pmsProjectForm.setProNeedPermit(pmsProject.getProNeedPermit());
        pmsProjectForm.setPreId(pmsProject.getPreId());
        pmsProjectForm.setDonorProjectList(projectDonorArr);
        pmsProjectForm.setImplementerProjectList(projectImplementerArr);
        pmsProjectForm.setLocationProjectList(projectLocationArr);
        pmsProjectForm.setCommunityProjectList(projectCommunityArr);
        pmsProjectForm.setBenificiaryProjectList(projectBenificiryArr);
        pmsProjectForm.setIndicatorProjectList(projectIndicatorArr);

    }
}

