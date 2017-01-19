package eu.pms.project.actions;


import eu.pms.common.tools.DateTool;
import eu.pms.common.tools.SessionTraker;
import eu.pms.login.database.SecUser;
import eu.pms.project.database.*;
import eu.pms.project.forms.PmsProjectForm;
import eu.pms.project.useCases.AddPmsProjectUseCase;
import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

public class AddPmsProjectAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        PmsProjectForm pmsProjectForm = (PmsProjectForm) form;
        String proId = pmsProjectForm.getProId();
        String proTitle = pmsProjectForm.getProTitle();
        String proDescription = pmsProjectForm.getProDescription();
        String proStatus = pmsProjectForm.getProStatus();
        java.math.BigDecimal proBudget = pmsProjectForm.getProBudget();
        String proStartDate = pmsProjectForm.getProStartDate();
        String proEndDate = pmsProjectForm.getProEndDate();
        String proNeedPermit = pmsProjectForm.getProNeedPermit();
        String proHasCluster = pmsProjectForm.getProHasCluster();
        String proNotes = pmsProjectForm.getProNotes();
        String proArea = pmsProjectForm.getProArea();
        String prgId = pmsProjectForm.getPrgId();
        String devId = pmsProjectForm.getDevId();
        String secId = pmsProjectForm.getSecId();
        String secType = pmsProjectForm.getSecType();
        String preId = pmsProjectForm.getPreId();
        String[] donorProjectList = pmsProjectForm.getDonorProjectList();
        String[] implementerProjectList = pmsProjectForm.getImplementerProjectList();
        String[] communityProjectList = pmsProjectForm.getCommunityProjectList();
        String[] indicatorProjectList = pmsProjectForm.getIndicatorProjectList();

        ArrayList inputs = new ArrayList();
      if (proId == null || proId.equals("")){
          String donorId = "";
          if (donorProjectList != null && donorProjectList.length > 0) {
              int i = 0;
              for ( String donor : donorProjectList) {
                  if (i++ == 0)
                      donorId = donor;
                   else
                      donorId = "XX";
              }
          }

          String serial = eu.pms.common.tools.Randomizer.randomIntegers(5).toString();
          proId = donorId+ StringUtils.leftPad(secType, 7
                  , '0')+secId+serial;
      }
        inputs.add(proId);
        inputs.add(proTitle);
        inputs.add(proDescription);
        inputs.add(proStatus);
        inputs.add(proBudget);
        inputs.add(proStartDate);
        inputs.add(proEndDate);
        inputs.add(proNeedPermit);
        inputs.add(proHasCluster);
        inputs.add(proNotes);
        inputs.add(proArea);
        inputs.add(prgId);
        inputs.add(devId);
        inputs.add(secId);
        inputs.add(secType);
        inputs.add(preId);
        inputs.add(donorProjectList);
        inputs.add(implementerProjectList);
        inputs.add(communityProjectList);
        inputs.add(indicatorProjectList);

        ArrayList locationList=new ArrayList();
        Map<String, String[]> parameters = request.getParameterMap();
        String username = ((SecUser)request.getSession().getAttribute("userInfo")).getUsrId();
        Date timeStamp = new Date();
        int count=1;
        for(String parameter : parameters.keySet()) {
            PmsProjectsLocationPK pmsProjectsLocationPK= new PmsProjectsLocationPK();
            PmsProjectsLocation pmsProjectsLocation= new PmsProjectsLocation();
            if(parameters.containsKey("comLatitude"+count)) {
                pmsProjectsLocationPK.setProId(proId);
                DecimalFormatSymbols symbols = new DecimalFormatSymbols();
                symbols.setGroupingSeparator(',');
                symbols.setDecimalSeparator('.');
                String pattern = "#,##0.0#";
                DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
                decimalFormat.setParseBigDecimal(true);
                BigDecimal comLatitude = (BigDecimal) decimalFormat.parse(parameters.get("comLatitude"+count)[0]);
                pmsProjectsLocationPK.setComLatitude(comLatitude);
                BigDecimal comLongitude = (BigDecimal) decimalFormat.parse(parameters.get("comLongitude"+count)[0]);
                pmsProjectsLocationPK.setComLongitude(comLongitude);
                pmsProjectsLocation.setCompId(pmsProjectsLocationPK);
                pmsProjectsLocation.setUsername(username);
                pmsProjectsLocation.setTimeStamp(timeStamp);
                locationList.add(pmsProjectsLocation);
                count++;
            }
        }
        inputs.add(locationList);

        ArrayList penificiaryList=new ArrayList();
        count=1;
        for(String parameter : parameters.keySet()) {
            PmsProjectsBenificiaryPK pmsProjectsBenificiaryPK= new PmsProjectsBenificiaryPK();
            PmsProjectsBenificiary pmsProjectsBenificiary= new PmsProjectsBenificiary();
            if(parameters.containsKey("btpId"+count)) {
                pmsProjectsBenificiaryPK.setProId(proId);
                pmsProjectsBenificiaryPK.setBtpId(parameters.get("btpId"+count)[0]);
                pmsProjectsBenificiary.setCompId(pmsProjectsBenificiaryPK);
                String benTotalStr =parameters.get("benTotal"+count)[0];
                Integer benTotal=null;
                try {
                      benTotal = Integer.parseInt(benTotalStr);
                      pmsProjectsBenificiary.setBenTotal(benTotal);
                }catch (NumberFormatException nfe){

                }

                pmsProjectsBenificiary.setUsername(username);
                pmsProjectsBenificiary.setTimeStamp(timeStamp);
                penificiaryList.add(pmsProjectsBenificiary);
                count++;
            }
        }
        inputs.add(penificiaryList);

        Collection result = new AddPmsProjectUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }
        pmsProjectForm.reset(mapping, request);
        return new ActionForward(mapping.findForward("success").getPath()+"?proId="+proId);
//        return mapping.findForward("success");
    }
}

