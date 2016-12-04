package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsDatasourc implements Serializable {

    /** identifier field */
    private String datId;

    /** persistent field */
    private String datDesc;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private Set pmsIncidents;

    /** full constructor */
    public PmsDatasourc(String datId, String datDesc, String username, java.util.Date timeStamp, Set pmsIncidents) {
        this.datId = datId;
        this.datDesc = datDesc;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsIncidents = pmsIncidents;
    }

    /** default constructor */
    public PmsDatasourc() {
    }

    public String getDatId() {
        return this.datId;
    }

    public void setDatId(String datId) {
        this.datId = datId;
    }

    public String getDatDesc() {
        return this.datDesc;
    }

    public void setDatDesc(String datDesc) {
        this.datDesc = datDesc;
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

    public Set getPmsIncidents() {
        return this.pmsIncidents;
    }

    public void setPmsIncidents(Set pmsIncidents) {
        this.pmsIncidents = pmsIncidents;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("datId", getDatId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsDatasourc) ) return false;
        PmsDatasourc castOther = (PmsDatasourc) other;
        return new EqualsBuilder()
            .append(this.getDatId(), castOther.getDatId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getDatId())
            .toHashCode();
    }

}
