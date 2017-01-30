package eu.pms.incident.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/** @author Hibernate CodeGenerator */
public class PmsIncidentSearchForm extends ActionForm {
    private String incidentType;
    private String communityId;
    private String govId;
    private String incFromDate;
    private String incToDate;
    /** default constructor */
    public PmsIncidentSearchForm() {
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    public String getGovId() {
        return govId;
    }

    public void setGovId(String govId) {
        this.govId = govId;
    }

    public String getIncFromDate() {
        return incFromDate;
    }

    public void setIncFromDate(String incFromDate) {
        this.incFromDate = incFromDate;
    }

    public String getIncToDate() {
        return incToDate;
    }

    public void setIncToDate(String incToDate) {
        this.incToDate = incToDate;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
