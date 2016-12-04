package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsIncident implements Serializable {

    /** identifier field */
    private String incId;

    /** nullable persistent field */
    private String incOchaId;

    /** persistent field */
    private String incDescription;

    /** nullable persistent field */
    private int incAffectedWomen;

    /** nullable persistent field */
    private int incAffectedMen;

    /** nullable persistent field */
    private int incAffectedAdaults;

    /** nullable persistent field */
    private int incAffectedChildren;

    /** nullable persistent field */
    private int incDisplacedWomen;

    /** nullable persistent field */
    private int incDemolishedWomen;

    /** nullable persistent field */
    private String incSourceLink;

    /** persistent field */
    private String incUserId;

    /** persistent field */
    private java.util.Date incTimeStamp;

    /** nullable persistent field */
    private java.math.BigDecimal locLatitude;

    /** nullable persistent field */
    private java.math.BigDecimal locLongitude;

    /** nullable persistent field */
    private int incDisplacedMen;

    /** nullable persistent field */
    private int incDisplacedAdult;

    /** nullable persistent field */
    private int incDisplacedChildren;

    /** nullable persistent field */
    private int incDemolishedMen;

    /** nullable persistent field */
    private int incDemolishedAdult;

    /** nullable persistent field */
    private int incDemolishedChildren;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private PmsProject pmsProject;

    /** persistent field */
    private PmsCommunity pmsCommunity;

    /** persistent field */
    private PmsDatasourc pmsDatasourc;

    /** full constructor */
    public PmsIncident(String incId, String incOchaId, String incDescription, int incAffectedWomen, int incAffectedMen, int incAffectedAdaults, int incAffectedChildren, int incDisplacedWomen, int incDemolishedWomen, String incSourceLink, String incUserId, java.util.Date incTimeStamp, java.math.BigDecimal locLatitude, java.math.BigDecimal locLongitude, int incDisplacedMen, int incDisplacedAdult, int incDisplacedChildren, int incDemolishedMen, int incDemolishedAdult, int incDemolishedChildren, String username, java.util.Date timeStamp, PmsProject pmsProject, PmsCommunity pmsCommunity, PmsDatasourc pmsDatasourc) {
        this.incId = incId;
        this.incOchaId = incOchaId;
        this.incDescription = incDescription;
        this.incAffectedWomen = incAffectedWomen;
        this.incAffectedMen = incAffectedMen;
        this.incAffectedAdaults = incAffectedAdaults;
        this.incAffectedChildren = incAffectedChildren;
        this.incDisplacedWomen = incDisplacedWomen;
        this.incDemolishedWomen = incDemolishedWomen;
        this.incSourceLink = incSourceLink;
        this.incUserId = incUserId;
        this.incTimeStamp = incTimeStamp;
        this.locLatitude = locLatitude;
        this.locLongitude = locLongitude;
        this.incDisplacedMen = incDisplacedMen;
        this.incDisplacedAdult = incDisplacedAdult;
        this.incDisplacedChildren = incDisplacedChildren;
        this.incDemolishedMen = incDemolishedMen;
        this.incDemolishedAdult = incDemolishedAdult;
        this.incDemolishedChildren = incDemolishedChildren;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsProject = pmsProject;
        this.pmsCommunity = pmsCommunity;
        this.pmsDatasourc = pmsDatasourc;
    }

    /** default constructor */
    public PmsIncident() {
    }

    /** minimal constructor */
    public PmsIncident(String incId, String incDescription, String incUserId, java.util.Date incTimeStamp, String username, java.util.Date timeStamp, PmsProject pmsProject, PmsCommunity pmsCommunity, PmsDatasourc pmsDatasourc) {
        this.incId = incId;
        this.incDescription = incDescription;
        this.incUserId = incUserId;
        this.incTimeStamp = incTimeStamp;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsProject = pmsProject;
        this.pmsCommunity = pmsCommunity;
        this.pmsDatasourc = pmsDatasourc;
    }

    public String getIncId() {
        return this.incId;
    }

    public void setIncId(String incId) {
        this.incId = incId;
    }

    public String getIncOchaId() {
        return this.incOchaId;
    }

    public void setIncOchaId(String incOchaId) {
        this.incOchaId = incOchaId;
    }

    public String getIncDescription() {
        return this.incDescription;
    }

    public void setIncDescription(String incDescription) {
        this.incDescription = incDescription;
    }

    public int getIncAffectedWomen() {
        return this.incAffectedWomen;
    }

    public void setIncAffectedWomen(int incAffectedWomen) {
        this.incAffectedWomen = incAffectedWomen;
    }

    public int getIncAffectedMen() {
        return this.incAffectedMen;
    }

    public void setIncAffectedMen(int incAffectedMen) {
        this.incAffectedMen = incAffectedMen;
    }

    public int getIncAffectedAdaults() {
        return this.incAffectedAdaults;
    }

    public void setIncAffectedAdaults(int incAffectedAdaults) {
        this.incAffectedAdaults = incAffectedAdaults;
    }

    public int getIncAffectedChildren() {
        return this.incAffectedChildren;
    }

    public void setIncAffectedChildren(int incAffectedChildren) {
        this.incAffectedChildren = incAffectedChildren;
    }

    public int getIncDisplacedWomen() {
        return this.incDisplacedWomen;
    }

    public void setIncDisplacedWomen(int incDisplacedWomen) {
        this.incDisplacedWomen = incDisplacedWomen;
    }

    public int getIncDemolishedWomen() {
        return this.incDemolishedWomen;
    }

    public void setIncDemolishedWomen(int incDemolishedWomen) {
        this.incDemolishedWomen = incDemolishedWomen;
    }

    public String getIncSourceLink() {
        return this.incSourceLink;
    }

    public void setIncSourceLink(String incSourceLink) {
        this.incSourceLink = incSourceLink;
    }

    public String getIncUserId() {
        return this.incUserId;
    }

    public void setIncUserId(String incUserId) {
        this.incUserId = incUserId;
    }

    public java.util.Date getIncTimeStamp() {
        return this.incTimeStamp;
    }

    public void setIncTimeStamp(java.util.Date incTimeStamp) {
        this.incTimeStamp = incTimeStamp;
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

    public int getIncDisplacedMen() {
        return this.incDisplacedMen;
    }

    public void setIncDisplacedMen(int incDisplacedMen) {
        this.incDisplacedMen = incDisplacedMen;
    }

    public int getIncDisplacedAdult() {
        return this.incDisplacedAdult;
    }

    public void setIncDisplacedAdult(int incDisplacedAdult) {
        this.incDisplacedAdult = incDisplacedAdult;
    }

    public int getIncDisplacedChildren() {
        return this.incDisplacedChildren;
    }

    public void setIncDisplacedChildren(int incDisplacedChildren) {
        this.incDisplacedChildren = incDisplacedChildren;
    }

    public int getIncDemolishedMen() {
        return this.incDemolishedMen;
    }

    public void setIncDemolishedMen(int incDemolishedMen) {
        this.incDemolishedMen = incDemolishedMen;
    }

    public int getIncDemolishedAdult() {
        return this.incDemolishedAdult;
    }

    public void setIncDemolishedAdult(int incDemolishedAdult) {
        this.incDemolishedAdult = incDemolishedAdult;
    }

    public int getIncDemolishedChildren() {
        return this.incDemolishedChildren;
    }

    public void setIncDemolishedChildren(int incDemolishedChildren) {
        this.incDemolishedChildren = incDemolishedChildren;
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

    public PmsProject getPmsProject() {
        return this.pmsProject;
    }

    public void setPmsProject(PmsProject pmsProject) {
        this.pmsProject = pmsProject;
    }

    public PmsCommunity getPmsCommunity() {
        return this.pmsCommunity;
    }

    public void setPmsCommunity(PmsCommunity pmsCommunity) {
        this.pmsCommunity = pmsCommunity;
    }

    public PmsDatasourc getPmsDatasourc() {
        return this.pmsDatasourc;
    }

    public void setPmsDatasourc(PmsDatasourc pmsDatasourc) {
        this.pmsDatasourc = pmsDatasourc;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("incId", getIncId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsIncident) ) return false;
        PmsIncident castOther = (PmsIncident) other;
        return new EqualsBuilder()
            .append(this.getIncId(), castOther.getIncId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getIncId())
            .toHashCode();
    }

}
