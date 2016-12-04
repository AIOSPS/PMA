package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsDevelopmentAgency implements Serializable {

    /** identifier field */
    private String devId;

    /** nullable persistent field */
    private String devAbbName;

    /** nullable persistent field */
    private String devDesc;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private PmsContry pmsContry;

    /** persistent field */
    private Set pmsProjects;

    /** full constructor */
    public PmsDevelopmentAgency(String devId, String devAbbName, String devDesc, String username, java.util.Date timeStamp, PmsContry pmsContry, Set pmsProjects) {
        this.devId = devId;
        this.devAbbName = devAbbName;
        this.devDesc = devDesc;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsContry = pmsContry;
        this.pmsProjects = pmsProjects;
    }

    /** default constructor */
    public PmsDevelopmentAgency() {
    }

    /** minimal constructor */
    public PmsDevelopmentAgency(String devId, String username, java.util.Date timeStamp, PmsContry pmsContry, Set pmsProjects) {
        this.devId = devId;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsContry = pmsContry;
        this.pmsProjects = pmsProjects;
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

    public PmsContry getPmsContry() {
        return this.pmsContry;
    }

    public void setPmsContry(PmsContry pmsContry) {
        this.pmsContry = pmsContry;
    }

    public Set getPmsProjects() {
        return this.pmsProjects;
    }

    public void setPmsProjects(Set pmsProjects) {
        this.pmsProjects = pmsProjects;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("devId", getDevId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsDevelopmentAgency) ) return false;
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
