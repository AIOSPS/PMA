package eu.pms.project.database;

import eu.pms.common.tools.DateTool;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** @author Hibernate CodeGenerator */
public class PmsWarnings implements Serializable {

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
    private java.util.Date warIssueDate;
    private String warIssueDateStr;
    private java.util.Date warSubmitDate;
    private String warSubmitDateStr;
    private String warReceptionistId;
    private String warReceptionistName;
    private java.util.Date warReceptionDate;
    private String warReceptionDateStr;
    private String warStatus;
    private String warNotes;
    private String username;
    private java.util.Date timeStamp;

    /** default constructor */
    public PmsWarnings() {
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

    public Date getWarIssueDate() {
        return warIssueDate;
    }

    public void setWarIssueDate(Date warIssueDate) {
        this.warIssueDate = warIssueDate;
    }

    public Date getWarSubmitDate() {
        return warSubmitDate;
    }

    public void setWarSubmitDate(Date warSubmitDate) {
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

    public Date getWarReceptionDate() {
        return warReceptionDate;
    }

    public void setWarReceptionDate(Date warReceptionDate) {
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getWarIssueDateStr() {
        return warIssueDate!=null? DateTool.decorateDate(warIssueDate, DateTool.DD_MM_YYYY):"";
    }

    public void setWarIssueDateStr(String warIssueDateStr) {
        this.warIssueDateStr = warIssueDateStr;
    }

    public String getWarSubmitDateStr() {
        return warSubmitDate!=null? DateTool.decorateDate(warSubmitDate, DateTool.DD_MM_YYYY):"";
    }

    public void setWarSubmitDateStr(String warSubmitDateStr) {
        this.warSubmitDateStr = warSubmitDateStr;
    }

    public String getWarReceptionDateStr() {
        return warReceptionDate!=null? DateTool.decorateDate(warReceptionDate, DateTool.DD_MM_YYYY):"";
    }

    public void setWarReceptionDateStr(String warReceptionDateStr) {
        this.warReceptionDateStr = warReceptionDateStr;
    }
}
