package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsImplementer implements Serializable {

    /** identifier field */
    private String impId;

    /** persistent field */
    private String impName;

    /** persistent field */
    private String impType;

    /** persistent field */
    private String impAbbName;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private PmsContry pmsContry;

    /** persistent field */
    private Set pmsProjectsImplementers;

    /** persistent field */
    private Set pmsMasterPlans;

    /** full constructor */
    public PmsImplementer(String impId, String impName, String impType, String impAbbName, String username, java.util.Date timeStamp, PmsContry pmsContry, Set pmsProjectsImplementers, Set pmsMasterPlans) {
        this.impId = impId;
        this.impName = impName;
        this.impType = impType;
        this.impAbbName = impAbbName;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsContry = pmsContry;
        this.pmsProjectsImplementers = pmsProjectsImplementers;
        this.pmsMasterPlans = pmsMasterPlans;
    }

    /** default constructor */
    public PmsImplementer() {
    }

    public String getImpId() {
        return this.impId;
    }

    public void setImpId(String impId) {
        this.impId = impId;
    }

    public String getImpName() {
        return this.impName;
    }

    public void setImpName(String impName) {
        this.impName = impName;
    }

    public String getImpType() {
        return this.impType;
    }

    public void setImpType(String impType) {
        this.impType = impType;
    }

    public String getImpAbbName() {
        return this.impAbbName;
    }

    public void setImpAbbName(String impAbbName) {
        this.impAbbName = impAbbName;
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

    public PmsContry getPmsContry() {
        return this.pmsContry;
    }

    public void setPmsContry(PmsContry pmsContry) {
        this.pmsContry = pmsContry;
    }

    public Set getPmsProjectsImplementers() {
        return this.pmsProjectsImplementers;
    }

    public void setPmsProjectsImplementers(Set pmsProjectsImplementers) {
        this.pmsProjectsImplementers = pmsProjectsImplementers;
    }

    public Set getPmsMasterPlans() {
        return this.pmsMasterPlans;
    }

    public void setPmsMasterPlans(Set pmsMasterPlans) {
        this.pmsMasterPlans = pmsMasterPlans;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("impId", getImpId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsImplementer) ) return false;
        PmsImplementer castOther = (PmsImplementer) other;
        return new EqualsBuilder()
            .append(this.getImpId(), castOther.getImpId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getImpId())
            .toHashCode();
    }

}
