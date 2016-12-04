package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsCommunityTyp implements Serializable {

    /** identifier field */
    private String typId;

    /** nullable persistent field */
    private String typDesc;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private Set pmsCommunities;

    /** full constructor */
    public PmsCommunityTyp(String typId, String typDesc, String username, java.util.Date timeStamp, Set pmsCommunities) {
        this.typId = typId;
        this.typDesc = typDesc;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsCommunities = pmsCommunities;
    }

    /** default constructor */
    public PmsCommunityTyp() {
    }

    /** minimal constructor */
    public PmsCommunityTyp(String typId, String username, java.util.Date timeStamp, Set pmsCommunities) {
        this.typId = typId;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsCommunities = pmsCommunities;
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

    public Set getPmsCommunities() {
        return this.pmsCommunities;
    }

    public void setPmsCommunities(Set pmsCommunities) {
        this.pmsCommunities = pmsCommunities;
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
