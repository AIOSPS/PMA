package eu.pms.objective.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/** @author Hibernate CodeGenerator */
public class PmsObjectiveSearchForm extends ActionForm {
    private String objectiveDesc;
    private String objectiveLongDesc;

    /** default constructor */
    public PmsObjectiveSearchForm() {
    }

    public String getObjectiveDesc() {
        return objectiveDesc;
    }

    public void setObjectiveDesc(String objectiveDesc) {
        this.objectiveDesc = objectiveDesc;
    }

    public String getObjectiveLongDesc() {
        return objectiveLongDesc;
    }

    public void setObjectiveLongDesc(String objectiveLongDesc) {
        this.objectiveLongDesc = objectiveLongDesc;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
