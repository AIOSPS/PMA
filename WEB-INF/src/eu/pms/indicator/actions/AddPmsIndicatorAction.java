package eu.pms.indicator.actions;


import eu.pms.activity.forms.PmsActivityForm;
import eu.pms.activity.useCases.AddPmsActivityUseCase;
import eu.pms.benificiary.forms.PmsBenificiaryForm;
import eu.pms.benificiary.useCases.AddPmsBenificiaryUseCase;
import eu.pms.indicator.forms.PmsIndicatorForm;
import eu.pms.indicator.useCases.AddPmsIndicatorUseCase;
import eu.pms.intervention.forms.PmsInterventionForm;
import eu.pms.intervention.useCases.AddPmsInterventionUseCase;
import eu.pms.objective.forms.PmsObjectiveForm;
import eu.pms.objective.useCases.AddPmsObjectiveUseCase;
import eu.pms.permit.forms.PmsPermitForm;
import eu.pms.permit.useCases.AddPmsPermitUseCase;
import eu.pms.project.database.PmsIndicator;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collection;

public class AddPmsIndicatorAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        PmsIndicatorForm pmsIndicatorForm = (PmsIndicatorForm) form;
        String indId=pmsIndicatorForm.getIndId();
        String resId=pmsIndicatorForm.getResId();
        String objId=pmsIndicatorForm.getObjId();
        String indTitle=pmsIndicatorForm.getIndTitle();
        String indDate=pmsIndicatorForm.getIndDate();
        String indLongDesc=pmsIndicatorForm.getIndLongDesc();
        int indBaseline=pmsIndicatorForm.getIndBaseline();
        int indFrequency=pmsIndicatorForm.getIndFrequency();
        String indCollectionMethod=pmsIndicatorForm.getIndCollectionMethod();
        String indStatisticalMethod=pmsIndicatorForm.getIndStatisticalMethod();
        int indTarget=pmsIndicatorForm.getIndTarget();
        int indValue=pmsIndicatorForm.getIndValue();


        ArrayList inputs = new ArrayList();
        inputs.add(indId);
        inputs.add(resId);
        inputs.add(objId);
        inputs.add(indTitle);
        inputs.add(indDate);
        inputs.add(indLongDesc);
        inputs.add(indBaseline);
        inputs.add(indFrequency);
        inputs.add(indCollectionMethod);
        inputs.add(indStatisticalMethod);
        inputs.add(indTarget);
        inputs.add(indValue);

        Collection result = new AddPmsIndicatorUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }

        return mapping.findForward("success");
    }
}

