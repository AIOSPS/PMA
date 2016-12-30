package eu.pms.reporting.actions;

import eu.pms.common.tools.SessionTraker;
import eu.pms.reporting.engine.DynamicReportingEngine;
import eu.pms.reporting.entity.PresenationDynaQueryItemInfo;
import eu.pms.reporting.forms.DynaReportCriteriaForm;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by alisa_000 on 12/28/2016.
 */
public class GenerateDynaReportAction extends Action
{
    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception
    {
        if (!(SessionTraker.isSessionExist(request)))
            return mapping.findForward("invalidAccess");
//        if (!SessionTraker.checkActionToRole(request, this.getClass().getName()))
//            return mapping.findForward("noPermission");

        DynaReportCriteriaForm inForm = (DynaReportCriteriaForm) form;

        ArrayList<PresenationDynaQueryItemInfo> inputsList = null;
        ArrayList<PresenationDynaQueryItemInfo> outputsList = null;

        String[] inputs = inForm.getInputItems();
        int whereCondType = -1;
        if (inputs != null)
        {
            inputsList = new ArrayList<PresenationDynaQueryItemInfo>();
            for (int i = 0; i < inputs.length; i++)
            {
                PresenationDynaQueryItemInfo inItem = new PresenationDynaQueryItemInfo(inputs[i]);
                whereCondType = Integer.parseInt(request.getParameter(inputs[i] + "_whereCondType"));
                inItem.setItemWhereType(whereCondType);

                if (whereCondType < PresenationDynaQueryItemInfo.BETWEEN_2_VALUES_CONDITION)
                    inItem.setItemVal1(request.getParameter(inputs[i] + "_val1"));

                else if(whereCondType == PresenationDynaQueryItemInfo.MULTI_VALUE_IN_CONDITION)
                {
                    String []values = request.getParameterValues(inputs[i] + "_val1");
                    inItem.setItemList1(values);
                }
                else
                {
                    inItem.setItemVal1(request.getParameter(inputs[i] + "_val1"));
                    inItem.setItemVal2(request.getParameter(inputs[i] + "_val2"));
                }
                inputsList.add(inItem);
            }
        }

        String[] outputs = inForm.getOutputItems();
        if (inputs != null)
        {
            outputsList = new ArrayList<PresenationDynaQueryItemInfo>();
            for (int i = 0; i < outputs.length; i++)
            {
                PresenationDynaQueryItemInfo outItem = new PresenationDynaQueryItemInfo(outputs[i]);
                outputsList.add(outItem);
            }
        }

        DynamicReportingEngine dynaReportEngine = new DynamicReportingEngine(request.getSession().getServletContext().getInitParameter("webInfPath") + "/classes/dynamicReportCriteria.xml");
        JasperReportBuilder reportBuilder = dynaReportEngine.createReport(inputsList, outputsList);
        OutputStream out = response.getOutputStream();

//        response.setContentType("application/vnd.ms-excel;charset=UTF-8");
//        response.setHeader("Content-Disposition","inline; filename=DynamicReport.xls;");
        String reportType = request.getParameter("reportType");
        try {
            switch (reportType.charAt(0)) {
                case 'e': {
                    response.setContentType("application/vnd.ms-excel;charset=UTF-8");
                    response.setHeader("Content-Disposition","inline; filename=DynamicReport.xls;");
                    reportBuilder.toXls(out);
                }

                break;
                case 'p': {
                    response.setContentType("application/pdf;charset=UTF-8");
                    reportBuilder.toPdf(out);
                }

                break;
            }
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            out.flush();
            out.close();
        }

        return mapping.findForward("success");
    }


}

