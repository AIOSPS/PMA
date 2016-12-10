package eu.pms.project.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

/** @author Hibernate CodeGenerator */
public class PmsProjectSearchForm extends ActionForm {
    private String projectTitle;
    private String projectDescription;
    private String projectStatus;
    private String projectStartDate;
    private String projectEndDate;
    private String projectNeedPermit;
    private String projectHasCluster;
    /** default constructor */
    public PmsProjectSearchForm() {
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(String projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public String getProjectEndDate() {
        return projectEndDate;
    }

    public void setProjectEndDate(String projectEndDate) {
        this.projectEndDate = projectEndDate;
    }

    public String getProjectNeedPermit() {
        return projectNeedPermit;
    }

    public void setProjectNeedPermit(String projectNeedPermit) {
        this.projectNeedPermit = projectNeedPermit;
    }

    public String getProjectHasCluster() {
        return projectHasCluster;
    }

    public void setProjectHasCluster(String projectHasCluster) {
        this.projectHasCluster = projectHasCluster;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
