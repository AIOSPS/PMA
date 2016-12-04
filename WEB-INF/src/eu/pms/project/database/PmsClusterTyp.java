package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsClusterTyp implements Serializable {

    /** identifier field */
    private PmsClusterTypPK comp_id;

    /** nullable persistent field */
    private String cluDesc;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private Set pmsProjects;

    /** full constructor */
    public PmsClusterTyp(PmsClusterTypPK comp_id, String cluDesc, String username, java.util.Date timeStamp, Set pmsProjects) {
        this.comp_id = comp_id;
        this.cluDesc = cluDesc;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsProjects = pmsProjects;
    }

    /** default constructor */
    public PmsClusterTyp() {
    }

    /** minimal constructor */
    public PmsClusterTyp(PmsClusterTypPK comp_id, String username, java.util.Date timeStamp, Set pmsProjects) {
        this.comp_id = comp_id;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsProjects = pmsProjects;
    }

    public PmsClusterTypPK getComp_id() {
        return this.comp_id;
    }

    public void setComp_id(PmsClusterTypPK comp_id) {
        this.comp_id = comp_id;
    }

    public String getCluDesc() {
        return this.cluDesc;
    }

    public void setCluDesc(String cluDesc) {
        this.cluDesc = cluDesc;
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
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsClusterTyp) ) return false;
        PmsClusterTyp castOther = (PmsClusterTyp) other;
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
