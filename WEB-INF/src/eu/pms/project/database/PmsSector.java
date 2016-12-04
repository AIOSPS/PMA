package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsSector implements Serializable {

    /** identifier field */
    private String secId;

    /** persistent field */
    private String secName;

    /** persistent field */
    private String secDesc;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private Set pmsSubSectors;

    /** full constructor */
    public PmsSector(String secId, String secName, String secDesc, String username, java.util.Date timeStamp, Set pmsSubSectors) {
        this.secId = secId;
        this.secName = secName;
        this.secDesc = secDesc;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsSubSectors = pmsSubSectors;
    }

    /** default constructor */
    public PmsSector() {
    }

    public String getSecId() {
        return this.secId;
    }

    public void setSecId(String secId) {
        this.secId = secId;
    }

    public String getSecName() {
        return this.secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getSecDesc() {
        return this.secDesc;
    }

    public void setSecDesc(String secDesc) {
        this.secDesc = secDesc;
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

    public Set getPmsSubSectors() {
        return this.pmsSubSectors;
    }

    public void setPmsSubSectors(Set pmsSubSectors) {
        this.pmsSubSectors = pmsSubSectors;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("secId", getSecId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsSector) ) return false;
        PmsSector castOther = (PmsSector) other;
        return new EqualsBuilder()
            .append(this.getSecId(), castOther.getSecId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getSecId())
            .toHashCode();
    }

}
