package eu.pms.project.actions;


import eu.pms.common.tools.SessionTraker;
import eu.pms.incident.useCases.PmsIncidentListByProjectUseCase;
import eu.pms.masterPlan.useCases.GetPmsMPByCommunityUseCase;
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
import java.util.Iterator;
import java.util.List;

public class ViewPmsProjectAction extends Action {

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
        List developmentAgencyList = (List) new GetPmsDevelopmentAgencyUseCase().execute(null, request);
        List programmList = (List) new GetPmsProgrammUseCase().execute(null, request);
        //List locationList = (List) new GetPmsLocationUseCase().execute(null, request);
        List communityList = (List) new GetPmsCommunityUseCase().execute(null, request);
        List subSectorList = (List) new GetPmsSubSectorUseCase().execute(null, request);
        List clusterList = (List) new GetPmsClusterTypUseCase().execute(null, request);
        List clusterHList = new ArrayList();
        List clusterDList = new ArrayList();
        Iterator itr = clusterList.iterator();
        PmsSector pmsSecTyp = new PmsSector();
        while (itr.hasNext()) {
            pmsSecTyp = (PmsSector) itr.next();
            if (pmsSecTyp.getSecType().equals("H"))
                clusterHList.add(pmsSecTyp);
            else if (pmsSecTyp.getSecType().equals("D"))
                clusterDList.add(pmsSecTyp);
            else if (pmsSecTyp.getSecType().equals("Oth"))
                clusterDList.add(pmsSecTyp);

        }

        List permitList = (List) new GetPmsPermitUseCase().execute(null, request);
        List benificiryList = (List) new GetPmsBenificiaryUseCase().execute(null, request);
        List indicatorList = (List) new GetPmsIndicatorListUseCase().execute(null, request);
        request.setAttribute("dononrList", dononrList);
        request.setAttribute("implementerList", implementerList);
        request.setAttribute("developmentAgencyList", developmentAgencyList);
        request.setAttribute("programmList", programmList);
       // request.setAttribute("locationList", locationList);
        request.setAttribute("communityList",  communityList!=null && communityList.size()>0&& communityList.get(0) instanceof PmsCommunitiesVw ?communityList:null);
        request.setAttribute("clusterHList", clusterHList);
        request.setAttribute("clusterDList", clusterDList);
        request.setAttribute("subSectorList", subSectorList);
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
        String[] projectCommunityArr = null;
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

            List<PmsProjectsCommunity> projectCommunityList = (List) new GetPmsProjectCommunityUseCase().execute(inputs, request);
            if (projectCommunityList != null && projectCommunityList.size() > 0) {
                projectCommunityArr = new String[projectCommunityList.size()];
                int i = 0;
                ArrayList input = new ArrayList();
                String hasMPName = "";
                for (PmsProjectsCommunity pmsProjectsCommunity : projectCommunityList) {
                    projectCommunityArr[i] = pmsProjectsCommunity.getCompId().getComId();
                    i++;

                    input.add(pmsProjectsCommunity.getCompId().getComId());
                    List hasMP = (List) new GetPmsMPByCommunityUseCase().execute(input, request);
                    if (hasMP != null && hasMP.size() > 0)
                        hasMPName = "Yes";
                    else
                        hasMPName = "No";
                }
                request.setAttribute("hasMp",hasMPName);
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
            fillPmsProjectData(pmsProjectForm, pmsProject, projectDonorArr, projectImplementerArr, projectCommunityArr, projectIndicatorArr);

            List<PmsProjectsLocation> projectLocationList = (List) new GetPmsProjectLocationUseCase().execute(inputs, request);
            request.setAttribute("projectLocationList", projectLocationList!=null&&projectLocationList.size()>0?projectLocationList:null);
            List<PmsProjectsBenificiary> projectBenificiryList = (List) new GetPmsProjectBenificiaryUseCase().execute(inputs, request);
            request.setAttribute("projectBenificiryList", projectBenificiryList);
            List benificiryTypeList = (List) new GetPmsBenificiaryUseCase().execute(null, request);
            request.setAttribute("benificiryTypeList", benificiryTypeList);
            inputs.clear();
            inputs.add(proId);
            List incidentList = (List) new PmsIncidentListByProjectUseCase().execute(inputs, request);
            request.setAttribute("incidentList", incidentList);

            request.setAttribute("pmsProjectAlbumList", new GetImgsAlbumPmsProjectListUseCase().execute(inputs, request));
        }

//****************************************** for print project****************
        String donorName = "";
        request.setAttribute("donorName",donorName);
        if(dononrList!=null&&dononrList.size()>0) {
            if(projectDonorArr!=null&&projectDonorArr.length>0){
            for (int i = 0; i < dononrList.size(); i++) {
                PmsDonor obj = (PmsDonor) dononrList.get(i);

                for(int j = 0;j< projectDonorArr.length;j++)
                    if(obj.getDonId().equals(projectDonorArr[j])){
                        donorName +=obj.getDonName()+" | ";
                }
            }
            request.setAttribute("donorName",donorName.substring(0,donorName.lastIndexOf("|")));}
        }
        String impName = "";
        request.setAttribute("impName",impName);
        if(implementerList!=null&&implementerList.size()>0) {
            if(projectImplementerArr!=null&&projectImplementerArr.length>0){
            for (int i = 0; i < implementerList.size(); i++) {
                PmsImplementer obj = (PmsImplementer) implementerList.get(i);
                for(int j = 0;j< projectImplementerArr.length;j++)
                    if(obj.getImpId().equals(projectImplementerArr[j])){
                        impName +=obj.getImpName()+" | ";
                }
            }
            request.setAttribute("impName",impName.substring(0,impName.lastIndexOf("|")));}
        }
        String comName = "";
        request.setAttribute("comName",comName);
        if(communityList!=null&&communityList.size()>0) {
            if(projectCommunityArr!=null&&projectCommunityArr.length>0){
            for (int i = 0; i < communityList.size(); i++) {
                PmsCommunitiesVw obj = (PmsCommunitiesVw) communityList.get(i);
                for(int j = 0;j< projectCommunityArr.length;j++)
                    if(obj.getComId().equals(projectCommunityArr[j])){
                        comName +=obj.getComName()+" | ";
                }
            }
            request.setAttribute("comName",comName.substring(0,comName.lastIndexOf("|")));}
        }
        String indTitle = "";
        request.setAttribute("indTitle",indTitle);
        if(indicatorList!=null&&indicatorList.size()>0) {
            if(projectIndicatorArr!=null&&projectIndicatorArr.length>0){
            for (int i = 0; i < indicatorList.size(); i++) {
                PmsIndicator obj = (PmsIndicator) indicatorList.get(i);
                for(int j = 0;j< projectIndicatorArr.length;j++)
                    if(obj.getCompId().getIndId().equals(projectIndicatorArr[j])){
                        indTitle +=obj.getIndTitle()+" | ";
                }
            }
            request.setAttribute("indTitle",indTitle);}
        }
        request.setAttribute("devDesc","");
        if(developmentAgencyList!=null&&developmentAgencyList.size()>0) {
            for (int i = 0; i < developmentAgencyList.size(); i++) {
                PmsDevelopmentAgency obj = (PmsDevelopmentAgency) developmentAgencyList.get(i);
                if(obj.getDevId().equals(pmsProject.getDevId())){
                    request.setAttribute("devDesc",obj.getDevDesc());
                }
            }
        }
        request.setAttribute("prgDesc","");
        if(programmList!=null&&programmList.size()>0) {
            for (int i = 0; i < programmList.size(); i++) {
                PmsProgramm obj = (PmsProgramm) programmList.get(i);
                if(obj.getPrgId().equals(pmsProject.getPrgId())){
                    request.setAttribute("prgDesc",obj.getPrgDesc());
                }
            }
        }
        request.setAttribute("secName","");
        if(clusterList!=null&&clusterList.size()>0) {
            for (int i = 0; i < clusterList.size(); i++) {
                PmsSector obj = (PmsSector) clusterList.get(i);
                if(obj.getSecId().equals(pmsProject.getSecId())){
                    request.setAttribute("secName",obj.getSecName());
                }
            }
        }
        request.setAttribute("perTitle","");
        if(permitList!=null&&permitList.size()>0) {
            for (int i = 0; i < permitList.size(); i++) {
                PmsPermit obj = (PmsPermit) permitList.get(i);
                if(obj.getPerId().equals(pmsProject.getPreId())){
                    request.setAttribute("perTitle",obj.getPerTitle());
                }
            }
        }
        return mapping.findForward("success");
    }

    private void fillPmsProjectData(PmsProjectForm pmsProjectForm, PmsProject pmsProject, String[] projectDonorArr, String[] projectImplementerArr, String[] projectCommunityArr,  String[] projectIndicatorArr) {
        pmsProjectForm.setProId(pmsProject.getProId());
        pmsProjectForm.setProTitle(pmsProject.getProTitle());
        pmsProjectForm.setProDescription(pmsProject.getProDescription());
        pmsProjectForm.setProStatus(pmsProject.getProStatus());
        pmsProjectForm.setProStartDate(pmsProject.getProStartDateStr());
        pmsProjectForm.setProEndDate(pmsProject.getProEndDateStr());
        pmsProjectForm.setProBudget(pmsProject.getProBudget());
        pmsProjectForm.setProBudgetTxt(""+pmsProject.getProBudget());
        pmsProjectForm.setProNotes(pmsProject.getProNotes());
        pmsProjectForm.setDevId(pmsProject.getDevId());
        pmsProjectForm.setPrgId(pmsProject.getPrgId());
        pmsProjectForm.setProArea(pmsProject.getProArea());
        pmsProjectForm.setProHasCluster(pmsProject.getProHasCluster());
        pmsProjectForm.setSecId(pmsProject.getSecId());
        pmsProjectForm.setSubSecId(pmsProject.getSubSecId());
        pmsProjectForm.setProNeedPermit(pmsProject.getProNeedPermit());
        pmsProjectForm.setPreId(pmsProject.getPreId());
        pmsProjectForm.setSecType(pmsProject.getSecType());
        pmsProjectForm.setDonorProjectList(projectDonorArr);
        pmsProjectForm.setImplementerProjectList(projectImplementerArr);
        pmsProjectForm.setCommunityProjectList(projectCommunityArr);
        pmsProjectForm.setIndicatorProjectList(projectIndicatorArr);

    }
}

