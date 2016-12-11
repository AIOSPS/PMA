package eu.pms.benificiary.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/** @author Hibernate CodeGenerator */
public class PmsBenificiarySearchForm extends ActionForm {
    private String benificiaryDesc;
    private int BenificiaryTotal;
    private String BenificiaryType;

    /** default constructor */
    public PmsBenificiarySearchForm() {
    }

    public String getBenificiaryDesc() {
        return benificiaryDesc;
    }

    public void setBenificiaryDesc(String benificiaryDesc) {
        this.benificiaryDesc = benificiaryDesc;
    }

    public int getBenificiaryTotal() {
        return BenificiaryTotal;
    }

    public void setBenificiaryTotal(int benificiaryTotal) {
        BenificiaryTotal = benificiaryTotal;
    }

    public String getBenificiaryType() {
        return BenificiaryType;
    }

    public void setBenificiaryType(String benificiaryType) {
        BenificiaryType = benificiaryType;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
