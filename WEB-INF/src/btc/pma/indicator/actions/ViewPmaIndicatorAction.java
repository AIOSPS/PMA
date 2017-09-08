package btc.pma.indicator.actions;

import btc.pma.indicator.forms.PmaIndicatorForm;
import btc.pma.indicator.useCases.GetPmaIndicatorDetailByIndUseCase;
import btc.pma.indicator.useCases.GetPmaIndicatorUseCase;
import btc.pma.programme.database.PmaIndicator;
import btc.pma.programme.useCases.PmaProgrammeListUseCase;
import btc.pma.result.useCases.PmaResultListUseCase;
import eu.pms.common.tools.SessionTraker;
import eu.pms.indicator.forms.PmsIndicatorForm;
import eu.pms.indicator.useCases.GetPmsIndicatorMeasuresByIndUseCase;
import eu.pms.indicator.useCases.GetPmsIndicatorUseCase;
import eu.pms.indicator.useCases.GetPmsResultUseCase;
import eu.pms.project.database.PmsIndicator;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC on 9/8/2017.
 */
public class ViewPmaIndicatorAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");
        List programmeList = (List) new PmaProgrammeListUseCase().execute(null, request);
        request.setAttribute("programmeList", programmeList);

        List resultList = (List) new PmaResultListUseCase().execute(null, request);
        request.setAttribute("resultList", resultList);

        String indrNo = request.getParameter("indrNo");
        ArrayList inputs = new ArrayList();
        inputs.add(indrNo);

        List indicatorList = (List) new GetPmaIndicatorUseCase().execute(inputs, request);
        PmaIndicator pmaIndicator = null;
        if (indicatorList != null && indicatorList.size() > 0 && indicatorList.get(0) instanceof PmaIndicator) {
            pmaIndicator = (PmaIndicator) indicatorList.get(0);

            PmaIndicatorForm pmaIndicatorForm = (PmaIndicatorForm) form;
            fillPmaIndicatorData(pmaIndicatorForm, pmaIndicator);
        }
        List indicatorDetailList = (List) new GetPmaIndicatorDetailByIndUseCase().execute(inputs, request);
        request.setAttribute("indicatorDetailList", indicatorDetailList);

        return mapping.findForward("success");
    }

    private void fillPmaIndicatorData(PmaIndicatorForm pmaIndicatorForm, PmaIndicator pmaIndicator) {
        pmaIndicatorForm.setIndrNo(pmaIndicator.getIndrNo());
        pmaIndicatorForm.setIndrDefinition(pmaIndicator.getIndrDefinition());
        pmaIndicatorForm.setIndrBaseline(pmaIndicator.getIndrBaseline());
        pmaIndicatorForm.setIndrDefineDate(pmaIndicator.getIndrDefineDateStr());
        pmaIndicatorForm.setIndrClosedDate(pmaIndicator.getIndrClosedDateStr());
        pmaIndicatorForm.setIndrStatus(pmaIndicator.getIndrStatus());
        pmaIndicatorForm.setIndrTargetPlaned(pmaIndicator.getIndrTargetPlaned());
        pmaIndicatorForm.setIndrDataCollMethod(pmaIndicator.getIndrDataCollMethod());
        pmaIndicatorForm.setIndrTool(pmaIndicator.getIndrTool());
        pmaIndicatorForm.setIndrFrequency(pmaIndicator.getIndrFrequency());
        pmaIndicatorForm.setIndrResponsibilities(pmaIndicator.getIndrResponsibilities());
        pmaIndicatorForm.setIndrTargetAcheived(pmaIndicator.getIndrTargetAcheived());
        pmaIndicatorForm.setIndrType(pmaIndicator.getIndrType());
        pmaIndicatorForm.setRsltNo(pmaIndicator.getRsltNo());
        pmaIndicatorForm.setIntrNo(pmaIndicator.getIntrNo());
    }
}

