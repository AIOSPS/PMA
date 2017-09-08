package btc.pma.indicator.actions;

import btc.pma.indicator.forms.PmaIndicatorForm;
import btc.pma.indicator.useCases.AddPmaIndicatorUseCase;
import btc.pma.programme.database.PmaIndicatorDetail;
import btc.pma.programme.database.PmaIndicatorDetailPK;
import eu.pms.common.tools.SessionTraker;
import eu.pms.login.database.SecUser;
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

/**
 * Created by PC on 9/8/2017.
 */
public class AddPmaIndicatorAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        PmaIndicatorForm pmaIndicatorForm = (PmaIndicatorForm) form;
        String indNo=pmaIndicatorForm.getIndrNo();
        String indrDefinition=pmaIndicatorForm.getIndrDefinition();
        String indDaindrBaselinete=pmaIndicatorForm.getIndrBaseline();
        String indrDefineDate=pmaIndicatorForm.getIndrDefineDate();
        String indrClosedDate=pmaIndicatorForm.getIndrClosedDate();
        String indrStatus=pmaIndicatorForm.getIndrStatus();
        String indrTargetPlaned=pmaIndicatorForm.getIndrTargetPlaned();
        String indrDataCollMethod=pmaIndicatorForm.getIndrDataCollMethod();
        String indrTool=pmaIndicatorForm.getIndrTool();
        String indrFrequency=pmaIndicatorForm.getIndrFrequency();
        String indrResponsibilities=pmaIndicatorForm.getIndrResponsibilities();
        String indrTargetAcheived=pmaIndicatorForm.getIndrTargetAcheived();
        String indrType=pmaIndicatorForm.getIndrType();
        String rsltNo=pmaIndicatorForm.getRsltNo();
        String intrNo=pmaIndicatorForm.getIntrNo();



        ArrayList inputs = new ArrayList();
        inputs.add(indNo);
        inputs.add(indrDefinition);
        inputs.add(indDaindrBaselinete);
        inputs.add(indrDefineDate);
        inputs.add(indrClosedDate);
        inputs.add(indrStatus);
        inputs.add(indrTargetPlaned);
        inputs.add(indrDataCollMethod);
        inputs.add(indrTool);
        inputs.add(indrFrequency);
        inputs.add(indrResponsibilities);
        inputs.add(indrTargetAcheived);
        inputs.add(indrType);
        inputs.add(rsltNo);
        inputs.add(intrNo);

        ArrayList indicatorMeasuresList=new ArrayList();


        Map<String, String[]> parameters = request.getParameterMap();
        String username = ((SecUser)request.getSession().getAttribute("userInfo")).getUsrId();
        Date timeStamp = new Date();
        int count=1;
        for(String parameter : parameters.keySet()) {

            PmaIndicatorDetailPK pmaIndicatorDetailPK= new PmaIndicatorDetailPK();
            PmaIndicatorDetail pmaIndicatorDetail= new PmaIndicatorDetail();
            if(parameters.containsKey("indValue"+count)) {
                pmaIndicatorDetailPK.setIdtlMeasureDate(new Date());
                pmaIndicatorDetailPK.setIndrNo(indNo);
                pmaIndicatorDetail.setComp_id(pmaIndicatorDetailPK);
                String indValueStr =parameters.get("indValue"+count)[0];
//                Integer indValue =Integer.parseInt(indValueStr);
                pmaIndicatorDetail.setIdtlValue(indValueStr);
                pmaIndicatorDetail.setUsername(username);
                pmaIndicatorDetail.setTimeStamp(timeStamp);
                indicatorMeasuresList.add(pmaIndicatorDetail);
                count++;
            }

        }
        inputs.add(indicatorMeasuresList);

        Collection result = new AddPmaIndicatorUseCase().execute(inputs, request);
        if (result != null && result.size() > 0) {

        }
        pmaIndicatorForm.reset(mapping, request);
        return mapping.findForward("success");
    }
}


