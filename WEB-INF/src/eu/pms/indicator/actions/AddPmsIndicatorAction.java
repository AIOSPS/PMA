package eu.pms.indicator.actions;


import eu.pms.activity.forms.PmsActivityForm;
import eu.pms.activity.useCases.AddPmsActivityUseCase;
import eu.pms.benificiary.forms.PmsBenificiaryForm;
import eu.pms.benificiary.useCases.AddPmsBenificiaryUseCase;
import eu.pms.common.tools.DateTool;
import eu.pms.common.tools.SessionTraker;
import eu.pms.indicator.forms.PmsIndicatorForm;
import eu.pms.indicator.useCases.AddPmsIndicatorUseCase;
import eu.pms.intervention.forms.PmsInterventionForm;
import eu.pms.intervention.useCases.AddPmsInterventionUseCase;
import eu.pms.login.database.SecUser;
import eu.pms.objective.forms.PmsObjectiveForm;
import eu.pms.objective.useCases.AddPmsObjectiveUseCase;
import eu.pms.permit.forms.PmsPermitForm;
import eu.pms.permit.useCases.AddPmsPermitUseCase;
import eu.pms.project.database.PmsActivity;
import eu.pms.project.database.PmsIndicator;
import eu.pms.project.database.PmsIndicatorMeasures;
import eu.pms.project.database.PmsIndicatorMeasuresPK;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

public class AddPmsIndicatorAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        PmsIndicatorForm pmsIndicatorForm = (PmsIndicatorForm) form;
        String indId=pmsIndicatorForm.getIndId();
        String compId=pmsIndicatorForm.getResId();
        String []resCompId= compId.split("_");
        String resId=resCompId[0];
        String objId=resCompId[1];
        String indTitle=pmsIndicatorForm.getIndTitle();
        String indDate=pmsIndicatorForm.getIndDate();
        String indLongDesc=pmsIndicatorForm.getIndLongDesc();
        int indBaseline=pmsIndicatorForm.getIndBaseline();
        int indFrequency=pmsIndicatorForm.getIndFrequency();
        String indCollectionMethod=pmsIndicatorForm.getIndCollectionMethod();
        String indStatisticalMethod=pmsIndicatorForm.getIndStatisticalMethod();



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

        ArrayList indicatorMeasuresList=new ArrayList();


        Map<String, String[]> parameters = request.getParameterMap();
        String username = ((SecUser)request.getSession().getAttribute("userInfo")).getUsrId();
        Date timeStamp = new Date();
        int count=1;
        for(String parameter : parameters.keySet()) {

            PmsIndicatorMeasuresPK pmsIndicatorMeasuresPK= new PmsIndicatorMeasuresPK();
            PmsIndicatorMeasures pmsIndicatorMeasures= new PmsIndicatorMeasures();
            if(parameters.containsKey("msrDate"+count)) {
                pmsIndicatorMeasuresPK.setMsrDate(DateTool.convertStringToDate(parameters.get("msrDate"+count)[0],DateTool.DD_MM_YYYY));
                pmsIndicatorMeasuresPK.setIndId(indId);
                pmsIndicatorMeasuresPK.setResId(resId);
                pmsIndicatorMeasuresPK.setObjId(objId);
                pmsIndicatorMeasures.setCompId(pmsIndicatorMeasuresPK);
                String indTargetStr =parameters.get("indTarget"+count)[0];
                Integer indTarget =Integer.parseInt(indTargetStr);
                pmsIndicatorMeasures.setIndTarget(indTarget);
                String indValueStr =parameters.get("indValue"+count)[0];
                Integer indValue =Integer.parseInt(indValueStr);
                pmsIndicatorMeasures.setIndValue(indValue);
                pmsIndicatorMeasures.setUsername(username);
                pmsIndicatorMeasures.setTimeStamp(timeStamp);
                indicatorMeasuresList.add(pmsIndicatorMeasures);
                count++;
            }

        }
        inputs.add(indicatorMeasuresList);

        Collection result = new AddPmsIndicatorUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }

        return mapping.findForward("success");
    }
}

