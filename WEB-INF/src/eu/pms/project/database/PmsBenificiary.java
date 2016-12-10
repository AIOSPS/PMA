package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsBenificiary implements Serializable {

    private String benId;
    private String btpId;
    private String benDesc;
    private int benTotal;
    private String username;
    private java.util.Date timeStamp;

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

    public String getBtpId() {
        return btpId;
    }

    public void setBtpId(String btpId) {
        this.btpId = btpId;
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
