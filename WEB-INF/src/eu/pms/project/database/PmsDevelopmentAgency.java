package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author Hibernate CodeGenerator
 */
public class PmsDevelopmentAgency implements Serializable {

    private String devId;
    private String conId;
    private String devAbbName;
    private String devDesc;
    private String username;
    private java.util.Date timeStamp;

    /**
     * default constructor
     */
    public PmsDevelopmentAgency() {
    }


    public String getDevId() {
        return this.devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

    public String getDevAbbName() {
        return this.devAbbName;
    }

    public void setDevAbbName(String devAbbName) {
        this.devAbbName = devAbbName;
    }

    public String getDevDesc() {
        return this.devDesc;
    }

    public void setDevDesc(String devDesc) {
        this.devDesc = devDesc;
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

    public String getConId() {
        return conId;
    }

    public void setConId(String conId) {
        this.conId = conId;
    }

    public String toString() {
        return new ToStringBuilder(this)
                .append("devId", getDevId())
                .toString();
    }

    public boolean equals(Object other) {
        if (!(other instanceof PmsDevelopmentAgency)) return false;
        PmsDevelopmentAgency castOther = (PmsDevelopmentAgency) other;
        return new EqualsBuilder()
                .append(this.getDevId(), castOther.getDevId())
                .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
                .append(getDevId())
                .toHashCode();
    }

}
