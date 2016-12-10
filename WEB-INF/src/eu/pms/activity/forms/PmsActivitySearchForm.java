package eu.pms.activity.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/** @author Hibernate CodeGenerator */
public class PmsActivitySearchForm extends ActionForm {
    private String activityDesc;
    private String activityUnit;
    private int estimateBudget;

    /** default constructor */
    public PmsActivitySearchForm() {
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc;
    }

    public String getActivityUnit() {
        return activityUnit;
    }

    public void setActivityUnit(String activityUnit) {
        this.activityUnit = activityUnit;
    }

    public int getEstimateBudget() {
        return estimateBudget;
    }

    public void setEstimateBudget(int estimateBudget) {
        this.estimateBudget = estimateBudget;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
