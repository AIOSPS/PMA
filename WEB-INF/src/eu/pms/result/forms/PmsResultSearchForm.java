package eu.pms.result.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/** @author Hibernate CodeGenerator */
public class PmsResultSearchForm extends ActionForm {
    private String resultDesc;
    private String resultLongDesc;

    /** default constructor */
    public PmsResultSearchForm() {
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public String getResultLongDesc() {
        return resultLongDesc;
    }

    public void setResultLongDesc(String resultLongDesc) {
        this.resultLongDesc = resultLongDesc;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
