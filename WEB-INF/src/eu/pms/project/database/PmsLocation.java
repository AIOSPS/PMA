package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsLocation implements Serializable {

    /** identifier field */
    private String locId;

    /** nullable persistent field */
    private java.math.BigDecimal locLatitude;

    /** persistent field */
    private java.math.BigDecimal locLongitude;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private Set pmsProjectsLocations;

    /** full constructor */
    public PmsLocation(String locId, java.math.BigDecimal locLatitude, java.math.BigDecimal locLongitude, String username, java.util.Date timeStamp, Set pmsProjectsLocations) {
        this.locId = locId;
        this.locLatitude = locLatitude;
        this.locLongitude = locLongitude;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsProjectsLocations = pmsProjectsLocations;
    }

    /** default constructor */
    public PmsLocation() {
    }

    /** minimal constructor */
    public PmsLocation(String locId, java.math.BigDecimal locLongitude, String username, java.util.Date timeStamp, Set pmsProjectsLocations) {
        this.locId = locId;
        this.locLongitude = locLongitude;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsProjectsLocations = pmsProjectsLocations;
    }

    public String getLocId() {
        return this.locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
    }

    public java.math.BigDecimal getLocLatitude() {
        return this.locLatitude;
    }

    public void setLocLatitude(java.math.BigDecimal locLatitude) {
        this.locLatitude = locLatitude;
    }

    public java.math.BigDecimal getLocLongitude() {
        return this.locLongitude;
    }

    public void setLocLongitude(java.math.BigDecimal locLongitude) {
        this.locLongitude = locLongitude;
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

    public Set getPmsProjectsLocations() {
        return this.pmsProjectsLocations;
    }

    public void setPmsProjectsLocations(Set pmsProjectsLocations) {
        this.pmsProjectsLocations = pmsProjectsLocations;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("locId", getLocId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsLocation) ) return false;
        PmsLocation castOther = (PmsLocation) other;
        return new EqualsBuilder()
            .append(this.getLocId(), castOther.getLocId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getLocId())
            .toHashCode();
    }

}
