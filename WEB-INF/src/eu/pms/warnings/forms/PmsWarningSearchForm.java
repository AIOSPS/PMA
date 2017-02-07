package eu.pms.warnings.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/** @author Hibernate CodeGenerator */
public class PmsWarningSearchForm extends ActionForm {
    private String warningNo;
    private String warningName;
    private String warnedId;

    /** default constructor */
    public PmsWarningSearchForm() {
    }

    public String getWarningNo() {
        return warningNo;
    }

    public void setWarningNo(String warningNo) {
        this.warningNo = warningNo;
    }

    public String getWarningName() {
        return warningName;
    }

    public void setWarningName(String warningName) {
        this.warningName = warningName;
    }

    public String getWarnedId() {
        return warnedId;
    }

    public void setWarnedId(String warnedId) {
        this.warnedId = warnedId;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
