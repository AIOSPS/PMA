package eu.pms.community.actions;


import eu.pms.common.tools.SessionTraker;
import eu.pms.community.forms.PmsCommunityForm;
import eu.pms.community.useCases.AddPmsCommunityUseCase;
import eu.pms.project.useCases.AddPmsProjectUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public class AddPmsCommunityAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        PmsCommunityForm pmsCommunityForm = (PmsCommunityForm) form;
        String comId = pmsCommunityForm.getComId();
        String comPcbsCode = pmsCommunityForm.getComPcbsCode();
        String comOchaCode = pmsCommunityForm.getComOchaCode();
        String comName = pmsCommunityForm.getComName();
        String typeId = pmsCommunityForm.getTypeId();
        Integer comTotalAreaLand = pmsCommunityForm.getComTotalAreaLand();
        String comLocationShortDescription = pmsCommunityForm.getComLocationShortDescription();
        String comTopology = pmsCommunityForm.getComTopology();
        Integer comResidentsTotal = pmsCommunityForm.getComResidentsTotal();
        Integer comMaleTotal = pmsCommunityForm.getComMaleTotal();
        Integer comFemaleTotal = pmsCommunityForm.getComFemaleTotal();
        Integer comKidsTotal = pmsCommunityForm.getComKidsTotal();
        String comSchoolsInfo = pmsCommunityForm.getComSchoolsInfo();
        String comHealthSchoolsInfo = pmsCommunityForm.getComHealthSchoolsInfo();
        String comReligionCenters = pmsCommunityForm.getComReligionCenters();
        String comCemetery = pmsCommunityForm.getComCemetery();
        String comWaterNetworkInfo = pmsCommunityForm.getComWaterNetworkInfo();
        String comSewerageNetworkInfo = pmsCommunityForm.getComSewerageNetworkInfo();
        String comElectricalNetworkInfo = pmsCommunityForm.getComElectricalNetworkInfo();
        String comSolidWasteServiceInfo = pmsCommunityForm.getComSolidWasteServiceInfo();
        String comRoadNetworkInfo = pmsCommunityForm.getComRoadNetworkInfo();
        String comTransportNetworkInfo = pmsCommunityForm.getComTransportNetworkInfo();
        String comEcnonomicActivitiesInfo = pmsCommunityForm.getComEcnonomicActivitiesInfo();
        String govId = pmsCommunityForm.getGovId();
        BigDecimal comLatitude = pmsCommunityForm.getComLatitude();
        BigDecimal comLongitude = pmsCommunityForm.getComLongitude();
        String comPercentAreaC = pmsCommunityForm.getComPercentAreaC();
        String comTouchingBorder = pmsCommunityForm.getComTouchingBorder();


        ArrayList inputs = new ArrayList();
        inputs.add(comId);
        inputs.add(comPcbsCode);
        inputs.add(comOchaCode);
        inputs.add(comName);
        inputs.add(typeId);
        inputs.add(comTotalAreaLand);
        inputs.add(comLocationShortDescription);
        inputs.add(comTopology);
        inputs.add(comResidentsTotal);
        inputs.add(comMaleTotal);
        inputs.add(comFemaleTotal);
        inputs.add(comKidsTotal);
        inputs.add(comSchoolsInfo);
        inputs.add(comHealthSchoolsInfo);
        inputs.add(comReligionCenters);
        inputs.add(comCemetery);
        inputs.add(comWaterNetworkInfo);
        inputs.add(comSewerageNetworkInfo);
        inputs.add(comElectricalNetworkInfo);
        inputs.add(comSolidWasteServiceInfo);
        inputs.add(comRoadNetworkInfo);
        inputs.add(comTransportNetworkInfo);
        inputs.add(comEcnonomicActivitiesInfo);
        inputs.add(govId);
        inputs.add(comLatitude);
        inputs.add(comLongitude);
        inputs.add(comPercentAreaC);
        inputs.add(comTouchingBorder);

        Collection result = new AddPmsCommunityUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }
        pmsCommunityForm.reset(mapping, request);
        return mapping.findForward("success");
    }
}

