package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsBenificiary implements Serializable {

    /** identifier field */
    private String benId;

    /** persistent field */
    private String benDesc;

    /** persistent field */
    private int benTotal;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private eu.pms.project.database.PmsBenificiaryTyp pmsBenificiaryTyp;

    /** persistent field */
    private Set pmsProjectsBenificiaries;

    /** full constructor */
    public PmsBenificiary(String benId, String benDesc, int benTotal, String username, java.util.Date timeStamp, eu.pms.project.database.PmsBenificiaryTyp pmsBenificiaryTyp, Set pmsProjectsBenificiaries) {
        this.benId = benId;
        this.benDesc = benDesc;
        this.benTotal = benTotal;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsBenificiaryTyp = pmsBenificiaryTyp;
        this.pmsProjectsBenificiaries = pmsProjectsBenificiaries;
    }

    /** default constructor */
    public PmsBenificiary() {
    }

    public String getBenId() {
        return this.benId;
    }

    public void setBenId(String benId) {
        this.benId = benId;
    }

    public String getBenDesc() {
        return this.benDesc;
    }

    public void setBenDesc(String benDesc) {
        this.benDesc = benDesc;
    }

    public int getBenTotal() {
        return this.benTotal;
    }

    public void setBenTotal(int benTotal) {
        this.benTotal = benTotal;
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

    public eu.pms.project.database.PmsBenificiaryTyp getPmsBenificiaryTyp() {
        return this.pmsBenificiaryTyp;
    }

    public void setPmsBenificiaryTyp(eu.pms.project.database.PmsBenificiaryTyp pmsBenificiaryTyp) {
        this.pmsBenificiaryTyp = pmsBenificiaryTyp;
    }

    public Set getPmsProjectsBenificiaries() {
        return this.pmsProjectsBenificiaries;
    }

    public void setPmsProjectsBenificiaries(Set pmsProjectsBenificiaries) {
        this.pmsProjectsBenificiaries = pmsProjectsBenificiaries;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("benId", getBenId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsBenificiary) ) return false;
        PmsBenificiary castOther = (PmsBenificiary) other;
        return new EqualsBuilder()
            .append(this.getBenId(), castOther.getBenId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getBenId())
            .toHashCode();
    }

}
