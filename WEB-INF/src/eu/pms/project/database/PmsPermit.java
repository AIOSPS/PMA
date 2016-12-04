package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsPermit implements Serializable {

    /** identifier field */
    private String perId;

    /** persistent field */
    private String perTitle;

    /** persistent field */
    private String perType;

    /** persistent field */
    private java.util.Date perSubmitDate;

    /** persistent field */
    private java.util.Date perIssueDate;

    /** persistent field */
    private int perPeriod;

    /** persistent field */
    private String perStatus;

    /** persistent field */
    private String perIssuingAgency;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private Set pmsProjects;

    /** full constructor */
    public PmsPermit(String perId, String perTitle, String perType, java.util.Date perSubmitDate, java.util.Date perIssueDate, int perPeriod, String perStatus, String perIssuingAgency, String username, java.util.Date timeStamp, Set pmsProjects) {
        this.perId = perId;
        this.perTitle = perTitle;
        this.perType = perType;
        this.perSubmitDate = perSubmitDate;
        this.perIssueDate = perIssueDate;
        this.perPeriod = perPeriod;
        this.perStatus = perStatus;
        this.perIssuingAgency = perIssuingAgency;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsProjects = pmsProjects;
    }

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

    public Set getPmsProjects() {
        return this.pmsProjects;
    }

    public void setPmsProjects(Set pmsProjects) {
        this.pmsProjects = pmsProjects;
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
