package eu.pms.reporting.design;

import eu.pms.reporting.dataSources.ReportData;
import net.sf.dynamicreports.report.builder.ReportBuilder;
import net.sf.dynamicreports.report.exception.DRException;

import java.util.List;

/**
 * Created by alisa_000 on 12/28/2016.
 */
public interface ReportDesign<T extends ReportData> {
    public void configureReport(ReportBuilder<?> rb, T reportData, List<String> header) throws DRException;
}
