package btc.pma.programme.database;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmaActivityInfo implements Serializable {

    /** identifier field */
    private PmaActivityInfoPK comp_id;

    /** nullable persistent field */
    private String actvLevel;

    /** nullable persistent field */
    private String actvImplementingPartner;

    /** nullable persistent field */
    private String actvTitle;

    /** nullable persistent field */
    private String actvSummaryDescription;

    /** nullable persistent field */
    private String actvStatus;

    /** nullable persistent field */
    private java.util.Date actvProposedStartDate;

    /** nullable persistent field */
    private java.util.Date actvProposedEndDate;

    /** nullable persistent field */
    private long actvBudget;

    /** nullable persistent field */
    private java.util.Date actvActualStartDate;

    /** nullable persistent field */
    private java.util.Date actvActualEndDate;

    /** nullable persistent field */
    private long actvTotalCost;

    /** nullable persistent field */
    private String actvResponsibility;

    /** nullable persistent field */
    private String actvLessonsLearned;

    /** nullable persistent field */
    private String actChallenges;

    /** identifier field */
    private String indrNo;

    /** identifier field */
    private String rsltNo;

    /** identifier field */
    private String clasCode;

    /** nullable persistent field */
    private String username;

    /** nullable persistent field */
    private java.util.Date timeStamp;


    /** full constructor */
    public PmaActivityInfo(PmaActivityInfoPK comp_id, String actvLevel, String actvImplementingPartner, String actvTitle, String actvSummaryDescription, String actvStatus, java.util.Date actvProposedStartDate, java.util.Date actvProposedEndDate, long actvBudget, java.util.Date actvActualStartDate, java.util.Date actvActualEndDate, long actvTotalCost, String actvResponsibility, String actvLessonsLearned, String actChallenges,String indrNo, String rsltNo, String clasCode, String username, java.util.Date timeStamp) {
        this.comp_id = comp_id;
        this.actvLevel = actvLevel;
        this.actvImplementingPartner = actvImplementingPartner;
        this.actvTitle = actvTitle;
        this.actvSummaryDescription = actvSummaryDescription;
        this.actvStatus = actvStatus;
        this.actvProposedStartDate = actvProposedStartDate;
        this.actvProposedEndDate = actvProposedEndDate;
        this.actvBudget = actvBudget;
        this.actvActualStartDate = actvActualStartDate;
        this.actvActualEndDate = actvActualEndDate;
        this.actvTotalCost = actvTotalCost;
        this.actvResponsibility = actvResponsibility;
        this.actvLessonsLearned = actvLessonsLearned;
        this.actChallenges = actChallenges;
        this.indrNo = indrNo;
        this.rsltNo = rsltNo;
        this.clasCode = clasCode;
        this.username = username;
        this.timeStamp = timeStamp;
    }

    /** default constructor */
    public PmaActivityInfo() {
    }


    public PmaActivityInfoPK getComp_id() {
        return this.comp_id;
    }

    public void setComp_id(PmaActivityInfoPK comp_id) {
        this.comp_id = comp_id;
    }

    public String getActvLevel() {
        return this.actvLevel;
    }

    public void setActvLevel(String actvLevel) {
        this.actvLevel = actvLevel;
    }

    public String getActvImplementingPartner() {
        return this.actvImplementingPartner;
    }

    public void setActvImplementingPartner(String actvImplementingPartner) {
        this.actvImplementingPartner = actvImplementingPartner;
    }

    public String getActvTitle() {
        return this.actvTitle;
    }

    public void setActvTitle(String actvTitle) {
        this.actvTitle = actvTitle;
    }

    public String getActvSummaryDescription() {
        return this.actvSummaryDescription;
    }

    public void setActvSummaryDescription(String actvSummaryDescription) {
        this.actvSummaryDescription = actvSummaryDescription;
    }

    public String getActvStatus() {
        return this.actvStatus;
    }

    public void setActvStatus(String actvStatus) {
        this.actvStatus = actvStatus;
    }

    public java.util.Date getActvProposedStartDate() {
        return this.actvProposedStartDate;
    }

    public void setActvProposedStartDate(java.util.Date actvProposedStartDate) {
        this.actvProposedStartDate = actvProposedStartDate;
    }

    public java.util.Date getActvProposedEndDate() {
        return this.actvProposedEndDate;
    }

    public void setActvProposedEndDate(java.util.Date actvProposedEndDate) {
        this.actvProposedEndDate = actvProposedEndDate;
    }

    public long getActvBudget() {
        return this.actvBudget;
    }

    public void setActvBudget(long actvBudget) {
        this.actvBudget = actvBudget;
    }

    public java.util.Date getActvActualStartDate() {
        return this.actvActualStartDate;
    }

    public void setActvActualStartDate(java.util.Date actvActualStartDate) {
        this.actvActualStartDate = actvActualStartDate;
    }

    public java.util.Date getActvActualEndDate() {
        return this.actvActualEndDate;
    }

    public void setActvActualEndDate(java.util.Date actvActualEndDate) {
        this.actvActualEndDate = actvActualEndDate;
    }

    public long getActvTotalCost() {
        return this.actvTotalCost;
    }

    public void setActvTotalCost(long actvTotalCost) {
        this.actvTotalCost = actvTotalCost;
    }

    public String getActvResponsibility() {
        return this.actvResponsibility;
    }

    public void setActvResponsibility(String actvResponsibility) {
        this.actvResponsibility = actvResponsibility;
    }

    public String getActvLessonsLearned() {
        return this.actvLessonsLearned;
    }

    public void setActvLessonsLearned(String actvLessonsLearned) {
        this.actvLessonsLearned = actvLessonsLearned;
    }

    public String getActChallenges() {
        return this.actChallenges;
    }

    public void setActChallenges(String actChallenges) {
        this.actChallenges = actChallenges;
    }

    public String getIndrNo() {
        return indrNo;
    }

    public void setIndrNo(String indrNo) {
        this.indrNo = indrNo;
    }

    public String getRsltNo() {
        return rsltNo;
    }

    public void setRsltNo(String rsltNo) {
        this.rsltNo = rsltNo;
    }

    public String getClasCode() {
        return clasCode;
    }

    public void setClasCode(String clasCode) {
        this.clasCode = clasCode;
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


    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmaActivityInfo) ) return false;
        PmaActivityInfo castOther = (PmaActivityInfo) other;
        return new EqualsBuilder()
            .append(this.getComp_id(), castOther.getComp_id())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getComp_id())
            .toHashCode();
    }

}
