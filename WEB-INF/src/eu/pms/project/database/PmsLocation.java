package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsLocation implements Serializable {

    private String locId;
    private java.math.BigDecimal locLatitude;
    private java.math.BigDecimal locLongitude;
    private String username;
    private java.util.Date timeStamp;
    /** default constructor */
    public PmsLocation() {
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
