package eu.pms.masterPlan.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

/** @author Hibernate CodeGenerator */
public class PmsMasterPlanSearchForm extends ActionForm {
    private String masterPlanNo;
    private String masterPlanName;
    /** default constructor */
    public PmsMasterPlanSearchForm() {
    }

    public String getMasterPlanNo() {
        return masterPlanNo;
    }

    public void setMasterPlanNo(String masterPlanNo) {
        this.masterPlanNo = masterPlanNo;
    }

    public String getMasterPlanName() {
        return masterPlanName;
    }

    public void setMasterPlanName(String masterPlanName) {
        this.masterPlanName = masterPlanName;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
