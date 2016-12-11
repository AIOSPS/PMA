package eu.pms.permit.forms;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** @author Hibernate CodeGenerator */
public class PmsPermitForm extends ActionForm {
    private String perId;
    private String perTitle;
    private String perType;
    private String perSubmitDate;
    private String perIssueDate;
    private int perPeriod;
    private String perStatus;
    private String perIssuingAgency;

    /** default constructor */
    public PmsPermitForm() {
    }

    public String getPerId() {
        return perId;
    }

    public void setPerId(String perId) {
        this.perId = perId;
    }

    public String getPerTitle() {
        return perTitle;
    }

    public void setPerTitle(String perTitle) {
        this.perTitle = perTitle;
    }

    public String getPerType() {
        return perType;
    }

    public void setPerType(String perType) {
        this.perType = perType;
    }

    public String getPerSubmitDate() {
        return perSubmitDate;
    }

    public void setPerSubmitDate(String perSubmitDate) {
        this.perSubmitDate = perSubmitDate;
    }

    public String getPerIssueDate() {
        return perIssueDate;
    }

    public void setPerIssueDate(String perIssueDate) {
        this.perIssueDate = perIssueDate;
    }

    public int getPerPeriod() {
        return perPeriod;
    }

    public void setPerPeriod(int perPeriod) {
        this.perPeriod = perPeriod;
    }

    public String getPerStatus() {
        return perStatus;
    }

    public void setPerStatus(String perStatus) {
        this.perStatus = perStatus;
    }

    public String getPerIssuingAgency() {
        return perIssuingAgency;
    }

    public void setPerIssuingAgency(String perIssuingAgency) {
        this.perIssuingAgency = perIssuingAgency;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
