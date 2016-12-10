package eu.pms.intervention.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/** @author Hibernate CodeGenerator */
public class PmsInterventionSearchForm extends ActionForm {
    private String interventionDesc;
    private int interventionEstimatedBudget;
    private String interventionSource;

    /** default constructor */
    public PmsInterventionSearchForm() {
    }

    public String getInterventionDesc() {
        return interventionDesc;
    }

    public void setInterventionDesc(String interventionDesc) {
        this.interventionDesc = interventionDesc;
    }

    public int getInterventionEstimatedBudget() {
        return interventionEstimatedBudget;
    }

    public void setInterventionEstimatedBudget(int interventionEstimatedBudget) {
        this.interventionEstimatedBudget = interventionEstimatedBudget;
    }

    public String getInterventionSource() {
        return interventionSource;
    }

    public void setInterventionSource(String interventionSource) {
        this.interventionSource = interventionSource;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
