package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsSubSector implements Serializable {

    /** identifier field */
    private eu.pms.project.database.PmsSubSectorPK comp_id;

    /** nullable persistent field */
    private String subName;

    /** nullable persistent field */
    private String subDesc;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private PmsSector pmsSector;

    /** persistent field */
    private Set pmsInterventions;

    /** full constructor */
    public PmsSubSector(eu.pms.project.database.PmsSubSectorPK comp_id, String subName, String subDesc, String username, java.util.Date timeStamp, PmsSector pmsSector, Set pmsInterventions) {
        this.comp_id = comp_id;
        this.subName = subName;
        this.subDesc = subDesc;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsSector = pmsSector;
        this.pmsInterventions = pmsInterventions;
    }

    /** default constructor */
    public PmsSubSector() {
    }

    /** minimal constructor */
    public PmsSubSector(eu.pms.project.database.PmsSubSectorPK comp_id, String username, java.util.Date timeStamp, PmsSector pmsSector, Set pmsInterventions) {
        this.comp_id = comp_id;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsSector = pmsSector;
        this.pmsInterventions = pmsInterventions;
    }

    public eu.pms.project.database.PmsSubSectorPK getComp_id() {
        return this.comp_id;
    }

    public void setComp_id(eu.pms.project.database.PmsSubSectorPK comp_id) {
        this.comp_id = comp_id;
    }

    public String getSubName() {
        return this.subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getSubDesc() {
        return this.subDesc;
    }

    public void setSubDesc(String subDesc) {
        this.subDesc = subDesc;
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

    public PmsSector getPmsSector() {
        return this.pmsSector;
    }

    public void setPmsSector(PmsSector pmsSector) {
        this.pmsSector = pmsSector;
    }

    public Set getPmsInterventions() {
        return this.pmsInterventions;
    }

    public void setPmsInterventions(Set pmsInterventions) {
        this.pmsInterventions = pmsInterventions;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsSubSector) ) return false;
        PmsSubSector castOther = (PmsSubSector) other;
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
