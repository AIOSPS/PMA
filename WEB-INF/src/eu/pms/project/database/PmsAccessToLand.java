package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsAccessToLand implements Serializable {

    /** identifier field */
    private String accId;

    /** persistent field */
    private String accDesc;

    /** persistent field */
    private String accAreaClassId;

    /** persistent field */
    private String accRisk;

    /** persistent field */
    private String accSensitive;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private eu.pms.project.database.PmsCommunity pmsCommunity;

    /** full constructor */
    public PmsAccessToLand(String accId, String accDesc, String accAreaClassId, String accRisk, String accSensitive, String username, java.util.Date timeStamp, eu.pms.project.database.PmsCommunity pmsCommunity) {
        this.accId = accId;
        this.accDesc = accDesc;
        this.accAreaClassId = accAreaClassId;
        this.accRisk = accRisk;
        this.accSensitive = accSensitive;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsCommunity = pmsCommunity;
    }

    /** default constructor */
    public PmsAccessToLand() {
    }

    public String getAccId() {
        return this.accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public String getAccDesc() {
        return this.accDesc;
    }

    public void setAccDesc(String accDesc) {
        this.accDesc = accDesc;
    }

    public String getAccAreaClassId() {
        return this.accAreaClassId;
    }

    public void setAccAreaClassId(String accAreaClassId) {
        this.accAreaClassId = accAreaClassId;
    }

    public String getAccRisk() {
        return this.accRisk;
    }

    public void setAccRisk(String accRisk) {
        this.accRisk = accRisk;
    }

    public String getAccSensitive() {
        return this.accSensitive;
    }

    public void setAccSensitive(String accSensitive) {
        this.accSensitive = accSensitive;
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

    public eu.pms.project.database.PmsCommunity getPmsCommunity() {
        return this.pmsCommunity;
    }

    public void setPmsCommunity(eu.pms.project.database.PmsCommunity pmsCommunity) {
        this.pmsCommunity = pmsCommunity;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("accId", getAccId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsAccessToLand) ) return false;
        PmsAccessToLand castOther = (PmsAccessToLand) other;
        return new EqualsBuilder()
            .append(this.getAccId(), castOther.getAccId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getAccId())
            .toHashCode();
    }

}
