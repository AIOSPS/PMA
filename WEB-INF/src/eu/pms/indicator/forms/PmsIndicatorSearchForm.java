package eu.pms.indicator.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/** @author Hibernate CodeGenerator */
public class PmsIndicatorSearchForm extends ActionForm {
    private String indicatorTitle;
    private String indicatorLongDesc;

    /** default constructor */
    public PmsIndicatorSearchForm() {
    }

    public String getIndicatorTitle() {
        return indicatorTitle;
    }

    public void setIndicatorTitle(String indicatorTitle) {
        this.indicatorTitle = indicatorTitle;
    }

    public String getIndicatorLongDesc() {
        return indicatorLongDesc;
    }

    public void setIndicatorLongDesc(String indicatorLongDesc) {
        this.indicatorLongDesc = indicatorLongDesc;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
