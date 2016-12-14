package eu.pms.indicator.actions;


import eu.pms.activity.forms.PmsActivityForm;
import eu.pms.activity.useCases.GetPmsActivityUseCase;
import eu.pms.activity.useCases.GetPmsInterventionUseCase;
import eu.pms.benificiary.forms.PmsBenificiaryForm;
import eu.pms.benificiary.useCases.GetPmsBenificiaryTypeUseCase;
import eu.pms.benificiary.useCases.GetPmsBenificiaryUseCase;
import eu.pms.indicator.forms.PmsIndicatorForm;
import eu.pms.indicator.useCases.GetPmsIndicatorUseCase;
import eu.pms.indicator.useCases.GetPmsResultUseCase;
import eu.pms.intervention.useCases.GetPmsSectorsUseCase;
import eu.pms.objective.forms.PmsObjectiveForm;
import eu.pms.objective.useCases.GetPmsObjectiveUseCase;
import eu.pms.objective.useCases.GetPmsStrategicPlanDocUseCase;
import eu.pms.permit.forms.PmsPermitForm;
import eu.pms.permit.useCases.GetPmsPermitUseCase;
import eu.pms.project.database.*;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class ViewPmsIndicatorAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        List resultList = (List) new GetPmsResultUseCase().execute(null, request);
        request.setAttribute("resultList", resultList);
        String indId = request.getParameter("indId");
        ArrayList inputs = new ArrayList();
        inputs.add(indId);
        List indicatorList = (List) new GetPmsIndicatorUseCase().execute(inputs, request);
        PmsIndicator pmsIndicator = null;
        if (indicatorList != null && indicatorList.size() > 0 && indicatorList.get(0) instanceof PmsIndicator) {
            pmsIndicator = (PmsIndicator) indicatorList.get(0);

            PmsIndicatorForm pmsIndicatorForm = (PmsIndicatorForm) form;
            fillPmsIndicatorData(pmsIndicatorForm, pmsIndicator);
        }


        return mapping.findForward("success");
    }

    private void fillPmsIndicatorData(PmsIndicatorForm pmsIndicatorForm, PmsIndicator pmsIndicator) {
        pmsIndicatorForm.setIndId(pmsIndicator.getCompId().getIndId());
        pmsIndicatorForm.setResId(pmsIndicator.getCompId().getResId());
        pmsIndicatorForm.setObjId(pmsIndicator.getCompId().getObjId());
        pmsIndicatorForm.setIndTitle(pmsIndicator.getIndTitle());
        pmsIndicatorForm.setIndDate(pmsIndicator.getIndDateStr());
        pmsIndicatorForm.setIndLongDesc(pmsIndicator.getIndLongDesc());
        pmsIndicatorForm.setIndBaseline(pmsIndicator.getIndBaseline());
        pmsIndicatorForm.setIndFrequency(pmsIndicator.getIndFrequency());
        pmsIndicatorForm.setIndCollectionMethod(pmsIndicator.getIndCollectionMethod());
        pmsIndicatorForm.setIndStatisticalMethod(pmsIndicator.getIndStatisticalMethod());
        pmsIndicatorForm.setIndTarget(pmsIndicator.getIndTarget());
        pmsIndicatorForm.setIndValue(pmsIndicator.getIndValue());
    }
}

