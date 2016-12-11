package eu.pms.permit.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/** @author Hibernate CodeGenerator */
public class PmsPermitSearchForm extends ActionForm {
    private String permitTitle;
    private String permitType;
    private String permitStatus;

    /** default constructor */
    public PmsPermitSearchForm() {
    }

    public String getPermitTitle() {
        return permitTitle;
    }

    public void setPermitTitle(String permitTitle) {
        this.permitTitle = permitTitle;
    }

    public String getPermitType() {
        return permitType;
    }

    public void setPermitType(String permitType) {
        this.permitType = permitType;
    }

    public String getPermitStatus() {
        return permitStatus;
    }

    public void setPermitStatus(String permitStatus) {
        this.permitStatus = permitStatus;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
