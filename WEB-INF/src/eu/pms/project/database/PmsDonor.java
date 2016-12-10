package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsDonor implements Serializable {

    /** identifier field */
    private String donId;
    private String conId;

    /** persistent field */
    private String donName;

    /** persistent field */
    private String donAbbName;

    /** persistent field */
    private String donType;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private PmsContry pmsContry;

    /** persistent field */
    private Set pmsProjectDonors;

    /** persistent field */
    private Set pmsMasterPlanDonors;

    /** full constructor */
    public PmsDonor(String donId, String donName, String donAbbName, String donType, String username, java.util.Date timeStamp, PmsContry pmsContry, Set pmsProjectDonors, Set pmsMasterPlanDonors) {
        this.donId = donId;
        this.donName = donName;
        this.donAbbName = donAbbName;
        this.donType = donType;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsContry = pmsContry;
        this.pmsProjectDonors = pmsProjectDonors;
        this.pmsMasterPlanDonors = pmsMasterPlanDonors;
    }

    /** default constructor */
    public PmsDonor() {
    }

    public String getDonId() {
        return this.donId;
    }

    public void setDonId(String donId) {
        this.donId = donId;
    }

    public String getDonName() {
        return this.donName;
    }

    public void setDonName(String donName) {
        this.donName = donName;
    }

    public String getDonAbbName() {
        return this.donAbbName;
    }

    public void setDonAbbName(String donAbbName) {
        this.donAbbName = donAbbName;
    }

    public String getDonType() {
        return this.donType;
    }

    public void setDonType(String donType) {
        this.donType = donType;
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

    public PmsContry getPmsContry() {
        return this.pmsContry;
    }

    public void setPmsContry(PmsContry pmsContry) {
        this.pmsContry = pmsContry;
    }

    public Set getPmsProjectDonors() {
        return this.pmsProjectDonors;
    }

    public void setPmsProjectDonors(Set pmsProjectDonors) {
        this.pmsProjectDonors = pmsProjectDonors;
    }

    public Set getPmsMasterPlanDonors() {
        return this.pmsMasterPlanDonors;
    }

    public void setPmsMasterPlanDonors(Set pmsMasterPlanDonors) {
        this.pmsMasterPlanDonors = pmsMasterPlanDonors;
    }

    public String getConId() {
        return conId;
    }

    public void setConId(String conId) {
        this.conId = conId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("donId", getDonId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsDonor) ) return false;
        PmsDonor castOther = (PmsDonor) other;
        return new EqualsBuilder()
            .append(this.getDonId(), castOther.getDonId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getDonId())
            .toHashCode();
    }

}
