package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsBenificiaryTyp implements Serializable {

    /** identifier field */
    private String btpId;

    /** persistent field */
    private String btpDesc;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private Set pmsBenificiaries;

    /** full constructor */
    public PmsBenificiaryTyp(String btpId, String btpDesc, String username, java.util.Date timeStamp, Set pmsBenificiaries) {
        this.btpId = btpId;
        this.btpDesc = btpDesc;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsBenificiaries = pmsBenificiaries;
    }

    /** default constructor */
    public PmsBenificiaryTyp() {
    }

    public String getBtpId() {
        return this.btpId;
    }

    public void setBtpId(String btpId) {
        this.btpId = btpId;
    }

    public String getBtpDesc() {
        return this.btpDesc;
    }

    public void setBtpDesc(String btpDesc) {
        this.btpDesc = btpDesc;
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

    public Set getPmsBenificiaries() {
        return this.pmsBenificiaries;
    }

    public void setPmsBenificiaries(Set pmsBenificiaries) {
        this.pmsBenificiaries = pmsBenificiaries;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("btpId", getBtpId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsBenificiaryTyp) ) return false;
        PmsBenificiaryTyp castOther = (PmsBenificiaryTyp) other;
        return new EqualsBuilder()
            .append(this.getBtpId(), castOther.getBtpId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getBtpId())
            .toHashCode();
    }

}
