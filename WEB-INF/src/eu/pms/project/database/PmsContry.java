package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsContry implements Serializable {

    /** identifier field */
    private String conId;

    /** persistent field */
    private String conName;

    /** persistent field */
    private String conAbbreviation;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private Set pmsDevelopmentAgencies;

    /** persistent field */
    private Set pmsImplementers;

    /** persistent field */
    private Set pmsDonors;

    /** full constructor */
    public PmsContry(String conId, String conName, String conAbbreviation, String username, java.util.Date timeStamp, Set pmsDevelopmentAgencies, Set pmsImplementers, Set pmsDonors) {
        this.conId = conId;
        this.conName = conName;
        this.conAbbreviation = conAbbreviation;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsDevelopmentAgencies = pmsDevelopmentAgencies;
        this.pmsImplementers = pmsImplementers;
        this.pmsDonors = pmsDonors;
    }

    /** default constructor */
    public PmsContry() {
    }

    public String getConId() {
        return this.conId;
    }

    public void setConId(String conId) {
        this.conId = conId;
    }

    public String getConName() {
        return this.conName;
    }

    public void setConName(String conName) {
        this.conName = conName;
    }

    public String getConAbbreviation() {
        return this.conAbbreviation;
    }

    public void setConAbbreviation(String conAbbreviation) {
        this.conAbbreviation = conAbbreviation;
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

    public Set getPmsDevelopmentAgencies() {
        return this.pmsDevelopmentAgencies;
    }

    public void setPmsDevelopmentAgencies(Set pmsDevelopmentAgencies) {
        this.pmsDevelopmentAgencies = pmsDevelopmentAgencies;
    }

    public Set getPmsImplementers() {
        return this.pmsImplementers;
    }

    public void setPmsImplementers(Set pmsImplementers) {
        this.pmsImplementers = pmsImplementers;
    }

    public Set getPmsDonors() {
        return this.pmsDonors;
    }

    public void setPmsDonors(Set pmsDonors) {
        this.pmsDonors = pmsDonors;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("conId", getConId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsContry) ) return false;
        PmsContry castOther = (PmsContry) other;
        return new EqualsBuilder()
            .append(this.getConId(), castOther.getConId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getConId())
            .toHashCode();
    }

}
