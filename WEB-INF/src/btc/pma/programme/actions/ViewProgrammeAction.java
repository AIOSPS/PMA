package btc.pma.programme.actions;

import btc.pma.programme.database.PmaProgrammeInfo;
import btc.pma.programme.forms.PmaProgrammeInfoForm;
import btc.pma.programme.useCases.GetPmaProgrammeUseCase;
import eu.pms.activity.forms.PmsActivityForm;
import eu.pms.activity.useCases.GetPmsActivityUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.intervention.useCases.GetPmsSectorsUseCase;
import eu.pms.project.database.PmsActivity;
import eu.pms.project.database.PmsIntervention;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC on 8/24/2017.
 */
public class ViewProgrammeAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");




        List sectorsList = (List) new GetPmsSectorsUseCase().execute(null, request);
        request.setAttribute("sectorsList", sectorsList);

        String intrNo = request.getParameter("intrNo");

        ArrayList inputs = new ArrayList();
        inputs.add(intrNo);

        List programmeList = (List) new GetPmaProgrammeUseCase().execute(inputs, request);
        PmaProgrammeInfo pmaProgrammeInfo = null;
        if (programmeList != null && programmeList.size() > 0 && programmeList.get(0) instanceof PmaProgrammeInfo) {
            pmaProgrammeInfo = (PmaProgrammeInfo) programmeList.get(0);

            PmaProgrammeInfoForm pmaProgrammeInfoForm = (PmaProgrammeInfoForm) form;
            fillPmaProgrammeData(pmaProgrammeInfoForm, pmaProgrammeInfo);
        }

        return mapping.findForward("success");
    }

    private void fillPmaProgrammeData(PmaProgrammeInfoForm pmaProgrammeInfoForm, PmaProgrammeInfo pmaProgrammeInfo) {
        pmaProgrammeInfoForm.setIntrNo(pmaProgrammeInfo.getIntrNo());
        pmaProgrammeInfoForm.setIntrTitle(pmaProgrammeInfo.getIntrTitle());
        pmaProgrammeInfoForm.setIntrDuration(pmaProgrammeInfo.getIntrDuration());
        pmaProgrammeInfoForm.setIntrDescription(pmaProgrammeInfo.getIntrDescription());
        pmaProgrammeInfoForm.setBtcNavisionCode(pmaProgrammeInfo.getBtcNavisionCode());
        pmaProgrammeInfoForm.setPartInstitution(pmaProgrammeInfo.getPartInstitution());
        pmaProgrammeInfoForm.setAgrmDuration(pmaProgrammeInfo.getAgrmDuration());
        pmaProgrammeInfoForm.setEstmStartDate(pmaProgrammeInfo.getEstmStartDateStr());
        pmaProgrammeInfoForm.setContPartnerCountry(pmaProgrammeInfo.getContPartnerCountry());
        pmaProgrammeInfoForm.setBelgContribution(pmaProgrammeInfo.getBelgContribution());
        pmaProgrammeInfoForm.setSecCode(pmaProgrammeInfo.getSecCode());
        pmaProgrammeInfoForm.setOallObjective(pmaProgrammeInfo.getOallObjective());
        pmaProgrammeInfoForm.setAgrmSignDate(pmaProgrammeInfo.getAgrmSignDateStr());
    }
}
