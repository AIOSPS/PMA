package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;

import eu.pms.common.tools.DateTool;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsPermit implements Serializable {

    private String perId;
    private String perTitle;
    private String perType;
    private java.util.Date perSubmitDate;
    private java.util.Date perIssueDate;
    private String perSubmitDateStr;
    private String perIssueDateStr;
    private int perPeriod;
    private String perStatus;
    private String perIssuingAgency;
    private String username;
    private java.util.Date timeStamp;

    /** default constructor */
    public PmsPermit() {
    }

    public String getPerId() {
        return this.perId;
    }

    public void setPerId(String perId) {
        this.perId = perId;
    }

    public String getPerTitle() {
        return this.perTitle;
    }

    public void setPerTitle(String perTitle) {
        this.perTitle = perTitle;
    }

    public String getPerType() {
        return this.perType;
    }

    public void setPerType(String perType) {
        this.perType = perType;
    }

    public java.util.Date getPerSubmitDate() {
        return this.perSubmitDate;
    }

    public void setPerSubmitDate(java.util.Date perSubmitDate) {
        this.perSubmitDate = perSubmitDate;
    }

    public java.util.Date getPerIssueDate() {
        return this.perIssueDate;
    }

    public void setPerIssueDate(java.util.Date perIssueDate) {
        this.perIssueDate = perIssueDate;
    }

    public int getPerPeriod() {
        return this.perPeriod;
    }

    public void setPerPeriod(int perPeriod) {
        this.perPeriod = perPeriod;
    }

    public String getPerStatus() {
        return this.perStatus;
    }

    public void setPerStatus(String perStatus) {
        this.perStatus = perStatus;
    }

    public String getPerIssuingAgency() {
        return this.perIssuingAgency;
    }

    public void setPerIssuingAgency(String perIssuingAgency) {
        this.perIssuingAgency = perIssuingAgency;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public java.util.Date getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(java.util.Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getPerSubmitDateStr() {
        return perSubmitDate!=null? DateTool.decorateDate(perSubmitDate, DateTool.DD_MM_YYYY):"";
    }

    public void setPerSubmitDateStr(String perSubmitDateStr) {
        this.perSubmitDateStr = perSubmitDateStr;
    }

    public String getPerIssueDateStr() {
        return perIssueDate!=null? DateTool.decorateDate(perIssueDate, DateTool.DD_MM_YYYY):"";
    }

    public void setPerIssueDateStr(String perIssueDateStr) {
        this.perIssueDateStr = perIssueDateStr;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("perId", getPerId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsPermit) ) return false;
        PmsPermit castOther = (PmsPermit) other;
        return new EqualsBuilder()
            .append(this.getPerId(), castOther.getPerId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getPerId())
            .toHashCode();
    }

}
