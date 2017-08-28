package btc.pma.programme.actions;

import btc.pma.programme.forms.PmaProgrammeInfoForm;
import btc.pma.programme.useCases.AddPmaProgrammeUseCase;
import eu.pms.common.tools.SessionTraker;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Created by PC on 8/28/2017.
 */
public class AddPmaProgrammeAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        PmaProgrammeInfoForm pmaProgrammeInfoForm = (PmaProgrammeInfoForm) form;
        String intrNo = pmaProgrammeInfoForm.getIntrNo();
        String intrTitle = pmaProgrammeInfoForm.getIntrTitle();
        int intrDuration = pmaProgrammeInfoForm.getIntrDuration();
        String intrDescription = pmaProgrammeInfoForm.getIntrDescription();
        String btcNavisionCode = pmaProgrammeInfoForm.getBtcNavisionCode();
        String partInstitution = pmaProgrammeInfoForm.getPartInstitution();
        int agrmDuration = pmaProgrammeInfoForm.getAgrmDuration();
        String estmStartDate = pmaProgrammeInfoForm.getEstmStartDate();
        int contPartnerCountry = pmaProgrammeInfoForm.getContPartnerCountry();
        int belgContribution = pmaProgrammeInfoForm.getBelgContribution();
        String secCode = pmaProgrammeInfoForm.getSecCode();
        String oallObjective = pmaProgrammeInfoForm.getOallObjective();
        String agrmSignDate = pmaProgrammeInfoForm.getAgrmSignDate();


        ArrayList inputs = new ArrayList();
        inputs.add(intrNo);
        inputs.add(intrTitle);
        inputs.add(intrDuration);
        inputs.add(intrDescription);
        inputs.add(btcNavisionCode);
        inputs.add(partInstitution);
        inputs.add(agrmDuration);
        inputs.add(estmStartDate);
        inputs.add(contPartnerCountry);
        inputs.add(belgContribution);
        inputs.add(secCode);
        inputs.add(oallObjective);
        inputs.add(agrmSignDate);

        Collection result = new AddPmaProgrammeUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }

        return mapping.findForward("success");
    }
}

