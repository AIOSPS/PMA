package eu.pms.warnings.forms;

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
public class PmsWarningForm extends ActionForm {
    private String warId;
    private String warNo;
    private String warWarnedName;
    private String warWarnedId;
    private String comId;
    private String donId;
    private java.math.BigDecimal warLatitude;
    private java.math.BigDecimal warLongitude;
    private String warType;
    private String warStructType;
    private String warIssueDate;
    private String warSubmitDate;
    private String warReceptionistId;
    private String warReceptionistName;
    private String warReceptionDate;
    private String warStatus;
    private String warNotes;

    /** default constructor */
    public PmsWarningForm() {
    }

    public String getWarId() {
        return warId;
    }

    public void setWarId(String warId) {
        this.warId = warId;
    }

    public String getWarNo() {
        return warNo;
    }

    public void setWarNo(String warNo) {
        this.warNo = warNo;
    }

    public String getWarWarnedName() {
        return warWarnedName;
    }

    public void setWarWarnedName(String warWarnedName) {
        this.warWarnedName = warWarnedName;
    }

    public String getWarWarnedId() {
        return warWarnedId;
    }

    public void setWarWarnedId(String warWarnedId) {
        this.warWarnedId = warWarnedId;
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    public String getDonId() {
        return donId;
    }

    public void setDonId(String donId) {
        this.donId = donId;
    }

    public BigDecimal getWarLatitude() {
        return warLatitude;
    }

    public void setWarLatitude(BigDecimal warLatitude) {
        this.warLatitude = warLatitude;
    }

    public BigDecimal getWarLongitude() {
        return warLongitude;
    }

    public void setWarLongitude(BigDecimal warLongitude) {
        this.warLongitude = warLongitude;
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

    public String getWarIssueDate() {
        return warIssueDate;
    }

    public void setWarIssueDate(String warIssueDate) {
        this.warIssueDate = warIssueDate;
    }

    public String getWarSubmitDate() {
        return warSubmitDate;
    }

    public void setWarSubmitDate(String warSubmitDate) {
        this.warSubmitDate = warSubmitDate;
    }

    public String getWarReceptionistId() {
        return warReceptionistId;
    }

    public void setWarReceptionistId(String warReceptionistId) {
        this.warReceptionistId = warReceptionistId;
    }

    public String getWarReceptionistName() {
        return warReceptionistName;
    }

    public void setWarReceptionistName(String warReceptionistName) {
        this.warReceptionistName = warReceptionistName;
    }

    public String getWarReceptionDate() {
        return warReceptionDate;
    }

    public void setWarReceptionDate(String warReceptionDate) {
        this.warReceptionDate = warReceptionDate;
    }

    public String getWarStatus() {
        return warStatus;
    }

    public void setWarStatus(String warStatus) {
        this.warStatus = warStatus;
    }

    public String getWarNotes() {
        return warNotes;
    }

    public void setWarNotes(String warNotes) {
        this.warNotes = warNotes;
    }

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        warId = null;
        warNo = null;
        warWarnedName = null;
        warWarnedId = null;
        comId = null;
        donId = null;
        warLatitude = null;
        warLongitude = null;
        warType = null;
        warStructType = null;
        warIssueDate = null;
        warSubmitDate = null;
        warReceptionistId = null;
        warReceptionistName = null;
        warReceptionDate = null;
        warStatus = null;
        warNotes = null;
    }
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
