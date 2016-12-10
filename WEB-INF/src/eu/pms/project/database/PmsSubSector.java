package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsSubSector implements Serializable {

    private PmsSubSectorPK compId;
    private String subName;
    private String subDesc;
    private String username;
    private java.util.Date timeStamp;

    /** default constructor */
    public PmsSubSector() {
    }

    public PmsSubSectorPK getCompId() {
        return compId;
    }

    public void setCompId(PmsSubSectorPK compId) {
        this.compId = compId;
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


    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getCompId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsSubSector) ) return false;
        PmsSubSector castOther = (PmsSubSector) other;
        return new EqualsBuilder()
            .append(this.getCompId(), castOther.getCompId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getCompId())
            .toHashCode();
    }

}
