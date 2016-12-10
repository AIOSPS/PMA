package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsCommunityTyp implements Serializable {

    private String typId;
    private String typDesc;
    private String username;
    private java.util.Date timeStamp;
    /** default constructor */
    public PmsCommunityTyp() {
    }



    public String getTypId() {
        return this.typId;
    }

    public void setTypId(String typId) {
        this.typId = typId;
    }

    public String getTypDesc() {
        return this.typDesc;
    }

    public void setTypDesc(String typDesc) {
        this.typDesc = typDesc;
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
            .append("typId", getTypId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsCommunityTyp) ) return false;
        PmsCommunityTyp castOther = (PmsCommunityTyp) other;
        return new EqualsBuilder()
            .append(this.getTypId(), castOther.getTypId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getTypId())
            .toHashCode();
    }

}
