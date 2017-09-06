package btc.pma.programme.database;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmaIndicator implements Serializable {

    /** identifier field */
    private String indrNo;

    /** nullable persistent field */
    private String indrDefinition;

    /** nullable persistent field */
    private String indrBaseline;

    /** nullable persistent field */
    private java.util.Date indrDefineDate;

    /** nullable persistent field */
    private java.util.Date indrClosedDate;

    /** nullable persistent field */
    private String indrStatus;

    /** nullable persistent field */
    private String indrTargetPlaned;

    /** nullable persistent field */
    private String indrDataCollMethod;

    /** nullable persistent field */
    private String indrTool;

    /** nullable persistent field */
    private String indrFrequency;

    /** nullable persistent field */
    private String indrResponsibilities;

    /** nullable persistent field */
    private String indrTargetAcheived;

    /** nullable persistent field */
    private String indrType;

    /** identifier field */
    private String rsltNo;

    /** identifier field */
    private String intrNo;

    /** nullable persistent field */
    private String userName;

    /** nullable persistent field */
    private java.util.Date timeStamp;


    /** full constructor */
    public PmaIndicator(String indrNo, String indrDefinition, String indrBaseline, java.util.Date indrDefineDate, java.util.Date indrClosedDate, String indrStatus, String indrTargetPlaned, String indrDataCollMethod, String indrTool, String indrFrequency, String indrResponsibilities, String indrTargetAcheived, String indrType, String intrNo, String rsltNo, String userName, java.util.Date timeStamp) {
        this.indrNo = indrNo;
        this.indrDefinition = indrDefinition;
        this.indrBaseline = indrBaseline;
        this.indrDefineDate = indrDefineDate;
        this.indrClosedDate = indrClosedDate;
        this.indrStatus = indrStatus;
        this.indrTargetPlaned = indrTargetPlaned;
        this.indrDataCollMethod = indrDataCollMethod;
        this.indrTool = indrTool;
        this.indrFrequency = indrFrequency;
        this.indrResponsibilities = indrResponsibilities;
        this.indrTargetAcheived = indrTargetAcheived;
        this.indrType = indrType;
        this.intrNo = intrNo;
        this.rsltNo = rsltNo;
        this.userName = userName;
        this.timeStamp = timeStamp;
    }

    /** default constructor */
    public PmaIndicator() {
    }


    public String getIndrNo() {
        return this.indrNo;
    }

    public void setIndrNo(String indrNo) {
        this.indrNo = indrNo;
    }

    public String getIndrDefinition() {
        return this.indrDefinition;
    }

    public void setIndrDefinition(String indrDefinition) {
        this.indrDefinition = indrDefinition;
    }

    public String getIndrBaseline() {
        return this.indrBaseline;
    }

    public void setIndrBaseline(String indrBaseline) {
        this.indrBaseline = indrBaseline;
    }

    public java.util.Date getIndrDefineDate() {
        return this.indrDefineDate;
    }

    public void setIndrDefineDate(java.util.Date indrDefineDate) {
        this.indrDefineDate = indrDefineDate;
    }

    public java.util.Date getIndrClosedDate() {
        return this.indrClosedDate;
    }

    public void setIndrClosedDate(java.util.Date indrClosedDate) {
        this.indrClosedDate = indrClosedDate;
    }

    public String getIndrStatus() {
        return this.indrStatus;
    }

    public void setIndrStatus(String indrStatus) {
        this.indrStatus = indrStatus;
    }

    public String getIndrTargetPlaned() {
        return this.indrTargetPlaned;
    }

    public void setIndrTargetPlaned(String indrTargetPlaned) {
        this.indrTargetPlaned = indrTargetPlaned;
    }

    public String getIndrDataCollMethod() {
        return this.indrDataCollMethod;
    }

    public void setIndrDataCollMethod(String indrDataCollMethod) {
        this.indrDataCollMethod = indrDataCollMethod;
    }

    public String getIndrTool() {
        return this.indrTool;
    }

    public void setIndrTool(String indrTool) {
        this.indrTool = indrTool;
    }

    public String getIndrFrequency() {
        return this.indrFrequency;
    }

    public void setIndrFrequency(String indrFrequency) {
        this.indrFrequency = indrFrequency;
    }

    public String getIndrResponsibilities() {
        return this.indrResponsibilities;
    }

    public void setIndrResponsibilities(String indrResponsibilities) {
        this.indrResponsibilities = indrResponsibilities;
    }

    public String getIndrTargetAcheived() {
        return this.indrTargetAcheived;
    }

    public void setIndrTargetAcheived(String indrTargetAcheived) {
        this.indrTargetAcheived = indrTargetAcheived;
    }

    public String getIndrType() {
        return indrType;
    }

    public void setIndrType(String indrType) {
        this.indrType = indrType;
    }

    public String getRsltNo() {
        return rsltNo;
    }

    public void setRsltNo(String rsltNo) {
        this.rsltNo = rsltNo;
    }

    public String getIntrNo() {
        return intrNo;
    }

    public void setIntrNo(String intrNo) {
        this.intrNo = intrNo;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public java.util.Date getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(java.util.Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("indrNo", getIndrNo())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmaIndicator) ) return false;
        PmaIndicator castOther = (PmaIndicator) other;
        return new EqualsBuilder()
            .append(this.getIndrNo(), castOther.getIndrNo())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getIndrNo())
            .toHashCode();
    }

}
