package eu.pms.incident.actions;


import eu.pms.activity.forms.PmsActivityForm;
import eu.pms.activity.useCases.AddPmsActivityUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.incident.forms.PmsIncidentForm;
import eu.pms.incident.useCases.AddPmsIncidentUseCase;
import eu.pms.intervention.forms.PmsInterventionForm;
import eu.pms.intervention.useCases.AddPmsInterventionUseCase;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collection;

public class AddPmsIncidentAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        PmsIncidentForm pmsIncidentForm = (PmsIncidentForm) form;
        String incId = pmsIncidentForm.getIncId();
        String datId = pmsIncidentForm.getDatId();
        String comId = pmsIncidentForm.getComId();
        String proId = pmsIncidentForm.getProId();
        String incOchaId = pmsIncidentForm.getIncOchaId();
        String incDescription = pmsIncidentForm.getIncDescription();
        int incAffectedWomen = pmsIncidentForm.getIncAffectedWomen();
        int incAffectedMen = pmsIncidentForm.getIncAffectedMen();
        int incAffectedAdaults = pmsIncidentForm.getIncAffectedAdaults();
        int incAffectedChildren = pmsIncidentForm.getIncAffectedChildren();
        int incDisplacedWomen = pmsIncidentForm.getIncDisplacedWomen();
        int incDemolishedWomen = pmsIncidentForm.getIncDemolishedWomen();
        String incSourceLink = pmsIncidentForm.getIncSourceLink();
        String incType = pmsIncidentForm.getIncType();
        String incTimeStamp = pmsIncidentForm.getIncDescription();
        java.math.BigDecimal locLatitude = pmsIncidentForm.getLocLatitude();
        java.math.BigDecimal locLongitude = pmsIncidentForm.getLocLongitude();
        int incDisplacedMen = pmsIncidentForm.getIncDisplacedMen();
        int incDisplacedAdult = pmsIncidentForm.getIncDisplacedAdult();
        int incDisplacedChildren = pmsIncidentForm.getIncDisplacedChildren();
        int incDemolishedMen = pmsIncidentForm.getIncDemolishedMen();
        int incDemolishedAdult = pmsIncidentForm.getIncDemolishedAdult();
        int incDemolishedChildren = pmsIncidentForm.getIncDemolishedChildren();


        ArrayList inputs = new ArrayList();
        inputs.add(incId);
        inputs.add(datId);
        inputs.add(comId);
        inputs.add(proId);
        inputs.add(incOchaId);
        inputs.add(incDescription);
        inputs.add(incAffectedWomen);
        inputs.add(incAffectedMen);
        inputs.add(incAffectedAdaults);
        inputs.add(incAffectedChildren);
        inputs.add(incDisplacedWomen);
        inputs.add(incDemolishedWomen);
        inputs.add(incSourceLink);
        inputs.add(incType);
        inputs.add(incTimeStamp);
        inputs.add(locLatitude);
        inputs.add(locLongitude);
        inputs.add(incDisplacedMen);
        inputs.add(incDisplacedAdult);
        inputs.add(incDisplacedChildren);
        inputs.add(incDemolishedMen);
        inputs.add(incDemolishedAdult);
        inputs.add(incDemolishedChildren);

        Collection result = new AddPmsIncidentUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }

        return mapping.findForward("success");
    }
}

