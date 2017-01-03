package eu.pms.intervention.actions;


import eu.pms.common.tools.SessionTraker;
import eu.pms.intervention.forms.PmsInterventionForm;
import eu.pms.intervention.useCases.AddPmsInterventionUseCase;
import eu.pms.login.database.SecUser;
import eu.pms.project.database.PmsActivity;
import eu.pms.project.database.PmsActivityPK;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

public class AddPmsInterventionAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        PmsInterventionForm pmsInterventionForm = (PmsInterventionForm) form;
        String intId = pmsInterventionForm.getIntId();
        String secId = pmsInterventionForm.getSecId();
        String masId = pmsInterventionForm.getMasId();
        String intDesc = pmsInterventionForm.getIntDesc();
        int intEstimatedBudget = pmsInterventionForm.getIntEstimatedBudget();
        String intSource = pmsInterventionForm.getIntSource();
        String intPriority = pmsInterventionForm.getIntPriority();


        ArrayList inputs = new ArrayList();
        inputs.add(intId);
        inputs.add(secId);
        inputs.add(masId);
        inputs.add(intDesc);
        inputs.add(intEstimatedBudget);
        inputs.add(intSource);
        inputs.add(intPriority);

        ArrayList activitiesList=new ArrayList();


        Map<String, String[]> parameters = request.getParameterMap();
        String username = ((SecUser)request.getSession().getAttribute("userInfo")).getUsrId();
        Date timeStamp = new Date();
        int count=1;
        for(String parameter : parameters.keySet()) {

            PmsActivityPK pmsActivityPK= new PmsActivityPK();
            PmsActivity pmsActivity= new PmsActivity();
            if(parameters.containsKey("actId"+count)) {
                pmsActivityPK.setActId(parameters.get("actId"+count)[0]);
                pmsActivityPK.setIntId(intId);
                pmsActivityPK.setSecId(secId);
                pmsActivity.setCompId(pmsActivityPK);
                pmsActivity.setActDesc(parameters.get("actDesc"+count)[0]);
                pmsActivity.setActUnit(parameters.get("actUnit"+count)[0]);
                String actUnitQtyStr =parameters.get("actUnitQty"+count)[0];
                Integer actUnitQty =Integer.parseInt(actUnitQtyStr);
                pmsActivity.setActUnitQty(actUnitQty);
                pmsActivity.setActEstimatedBudget(Integer.parseInt(parameters.get("actEstimatedBudget"+count)[0]));
                pmsActivity.setUsername(username);
                pmsActivity.setTimeStamp(timeStamp);
                activitiesList.add(pmsActivity);
                count++;
            }

        }

        inputs.add(activitiesList);
        Collection result = new AddPmsInterventionUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }
        pmsInterventionForm.reset(mapping, request);
        return mapping.findForward("success");
    }
}

