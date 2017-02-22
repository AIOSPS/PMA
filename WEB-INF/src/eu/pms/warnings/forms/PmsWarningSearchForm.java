package eu.pms.warnings.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/** @author Hibernate CodeGenerator */
public class PmsWarningSearchForm extends ActionForm {
    private String warType;
    private String warStructType;
    private String warStatus;
    private String comId;
    private String govId;

    /** default constructor */
    public PmsWarningSearchForm() {
    }

    public String getWarType() {
        return warType;
    }

    public void setWarType(String warType) {
        this.warType = warType;
    }

    public String getWarStructType() {
        return warStructType;
    }

    public void setWarStructType(String warStructType) {
        this.warStructType = warStructType;
    }

    public String getWarStatus() {
        return warStatus;
    }

    public void setWarStatus(String warStatus) {
        this.warStatus = warStatus;
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    public String getGovId() {
        return govId;
    }

    public void setGovId(String govId) {
        this.govId = govId;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
