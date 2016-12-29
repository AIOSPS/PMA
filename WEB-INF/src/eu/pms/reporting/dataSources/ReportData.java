package eu.pms.reporting.dataSources;

import net.sf.jasperreports.engine.JRDataSource;

import java.util.Collection;
import java.util.List;

/**
 * Created by alisa_000 on 12/28/2016.
 */
public interface ReportData {
    public JRDataSource createDataSource(Collection input, List<String> header);
}
