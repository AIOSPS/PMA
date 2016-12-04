package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsProgramm implements Serializable {

    /** identifier field */
    private String prgId;

    /** persistent field */
    private String prgTitle;

    /** nullable persistent field */
    private String prgDesc;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private Set pmsProjects;

    /** full constructor */
    public PmsProgramm(String prgId, String prgTitle, String prgDesc, String username, java.util.Date timeStamp, Set pmsProjects) {
        this.prgId = prgId;
        this.prgTitle = prgTitle;
        this.prgDesc = prgDesc;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsProjects = pmsProjects;
    }

    /** default constructor */
    public PmsProgramm() {
    }

    /** minimal constructor */
    public PmsProgramm(String prgId, String prgTitle, String username, java.util.Date timeStamp, Set pmsProjects) {
        this.prgId = prgId;
        this.prgTitle = prgTitle;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsProjects = pmsProjects;
    }

    public String getPrgId() {
        return this.prgId;
    }

    public void setPrgId(String prgId) {
        this.prgId = prgId;
    }

    public String getPrgTitle() {
        return this.prgTitle;
    }

    public void setPrgTitle(String prgTitle) {
        this.prgTitle = prgTitle;
    }

    public String getPrgDesc() {
        return this.prgDesc;
    }

    public void setPrgDesc(String prgDesc) {
        this.prgDesc = prgDesc;
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
            .append("prgId", getPrgId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsProgramm) ) return false;
        PmsProgramm castOther = (PmsProgramm) other;
        return new EqualsBuilder()
            .append(this.getPrgId(), castOther.getPrgId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getPrgId())
            .toHashCode();
    }

}
