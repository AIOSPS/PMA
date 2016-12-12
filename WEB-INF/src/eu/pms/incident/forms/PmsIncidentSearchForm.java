package eu.pms.incident.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/** @author Hibernate CodeGenerator */
public class PmsIncidentSearchForm extends ActionForm {
    private String incidentType;
    private String incidentOcha;
    private int incidentDescription;

    /** default constructor */
    public PmsIncidentSearchForm() {
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public String getIncidentOcha() {
        return incidentOcha;
    }

    public void setIncidentOcha(String incidentOcha) {
        this.incidentOcha = incidentOcha;
    }

    public int getIncidentDescription() {
        return incidentDescription;
    }

    public void setIncidentDescription(int incidentDescription) {
        this.incidentDescription = incidentDescription;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
