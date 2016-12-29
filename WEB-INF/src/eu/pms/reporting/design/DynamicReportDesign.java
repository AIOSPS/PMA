package eu.pms.reporting.design;

import eu.pms.reporting.dataSources.DynamicReportDataSource;
import net.sf.dynamicreports.report.builder.ReportBuilder;
import net.sf.dynamicreports.report.builder.column.ColumnBuilder;
import net.sf.dynamicreports.report.constant.PageOrientation;
import net.sf.dynamicreports.report.constant.PageType;
import net.sf.dynamicreports.report.exception.DRException;

import java.util.List;

import static net.sf.dynamicreports.report.builder.DynamicReports.col;
import static net.sf.dynamicreports.report.builder.DynamicReports.stl;
import static net.sf.dynamicreports.report.builder.DynamicReports.type;

/**
 * Created by alisa_000 on 12/28/2016.
 */
public class DynamicReportDesign implements ReportDesign<DynamicReportDataSource> {

    public void configureReport(ReportBuilder<?> rb, DynamicReportDataSource invoiceData, List<String> header) throws DRException {
        Object[] h = header.toArray(new Object[header.size()]);

        ColumnBuilder[] colArray=new ColumnBuilder[h.length];

        for(int i=0;i<h.length;i++)
            colArray[i]=col.column("row["+i+"]",  type.stringType());





        rb.setPageFormat(PageType.A4, PageOrientation.LANDSCAPE);
        rb.setTemplate(Templates.reportTemplate);
        rb.setReportName("Grad");
//          rb.addColumnHeader(Templates.getReportHeader(new Object[]{h}));
//          rb.columns(col1, col2);
        rb.columns(colArray).setColumnStyle(stl.style(Templates.cellStyle));
        rb.setShowColumnTitle(true)  ;
        rb.setIgnorePageWidth(true);
        rb.setIgnorePagination(true);
        rb.setBackgroundStyle(stl.style(Templates.subtotalStyle)) ;
    }




}