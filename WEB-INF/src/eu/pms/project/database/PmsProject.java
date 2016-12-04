package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsProject implements Serializable {

    /** identifier field */
    private String proId;

    /** persistent field */
    private String proTitle;

    /** nullable persistent field */
    private String proDescription;

    /** persistent field */
    private String proStatus;

    /** persistent field */
    private java.math.BigDecimal proBudget;

    /** persistent field */
    private java.util.Date proStartDate;

    /** persistent field */
    private java.util.Date proEndDate;

    /** persistent field */
    private String proNeedPermit;

    /** persistent field */
    private String proHasCluster;

    /** nullable persistent field */
    private String proNotes;

    /** persistent field */
    private String proUserId;

    /** persistent field */
    private java.util.Date proTimeStamp;

    /** persistent field */
    private String proArea;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** nullable persistent field */
    private eu.pms.project.database.PmsProjectAlbum pmsProjectAlbum;

    /** persistent field */
    private eu.pms.project.database.PmsPermit pmsPermit;

    /** persistent field */
    private eu.pms.project.database.PmsProgramm pmsProgramm;

    /** persistent field */
    private eu.pms.project.database.PmsDevelopmentAgency pmsDevelopmentAgency;

    /** persistent field */
    private eu.pms.project.database.PmsClusterTyp pmsClusterTyp;

    /** persistent field */
    private Set pmsProjectsImplementers;

    /** persistent field */
    private Set pmsProjectsHasPmsProjectsByPmsProjectsProId;

    /** persistent field */
    private Set pmsProjectsHasPmsProjectsByPmsProjectsProId1;

    /** persistent field */
    private Set pmsProjectsCommunities;

    /** persistent field */
    private Set pmsProjectsLocations;

    /** persistent field */
    private Set pmsProjectsBenificiaries;

    /** persistent field */
    private Set pmsProjectDonors;

    /** persistent field */
    private Set pmsIncidents;

    /** full constructor */
    public PmsProject(String proId, String proTitle, String proDescription, String proStatus, java.math.BigDecimal proBudget, java.util.Date proStartDate, java.util.Date proEndDate, String proNeedPermit, String proHasCluster, String proNotes, String proUserId, java.util.Date proTimeStamp, String proArea, String username, java.util.Date timeStamp, eu.pms.project.database.PmsProjectAlbum pmsProjectAlbum, eu.pms.project.database.PmsPermit pmsPermit, eu.pms.project.database.PmsProgramm pmsProgramm, eu.pms.project.database.PmsDevelopmentAgency pmsDevelopmentAgency, eu.pms.project.database.PmsClusterTyp pmsClusterTyp, Set pmsProjectsImplementers, Set pmsProjectsHasPmsProjectsByPmsProjectsProId, Set pmsProjectsHasPmsProjectsByPmsProjectsProId1, Set pmsProjectsCommunities, Set pmsProjectsLocations, Set pmsProjectsBenificiaries, Set pmsProjectDonors, Set pmsIncidents) {
        this.proId = proId;
        this.proTitle = proTitle;
        this.proDescription = proDescription;
        this.proStatus = proStatus;
        this.proBudget = proBudget;
        this.proStartDate = proStartDate;
        this.proEndDate = proEndDate;
        this.proNeedPermit = proNeedPermit;
        this.proHasCluster = proHasCluster;
        this.proNotes = proNotes;
        this.proUserId = proUserId;
        this.proTimeStamp = proTimeStamp;
        this.proArea = proArea;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsProjectAlbum = pmsProjectAlbum;
        this.pmsPermit = pmsPermit;
        this.pmsProgramm = pmsProgramm;
        this.pmsDevelopmentAgency = pmsDevelopmentAgency;
        this.pmsClusterTyp = pmsClusterTyp;
        this.pmsProjectsImplementers = pmsProjectsImplementers;
        this.pmsProjectsHasPmsProjectsByPmsProjectsProId = pmsProjectsHasPmsProjectsByPmsProjectsProId;
        this.pmsProjectsHasPmsProjectsByPmsProjectsProId1 = pmsProjectsHasPmsProjectsByPmsProjectsProId1;
        this.pmsProjectsCommunities = pmsProjectsCommunities;
        this.pmsProjectsLocations = pmsProjectsLocations;
        this.pmsProjectsBenificiaries = pmsProjectsBenificiaries;
        this.pmsProjectDonors = pmsProjectDonors;
        this.pmsIncidents = pmsIncidents;
    }

    /** default constructor */
    public PmsProject() {
    }

    /** minimal constructor */
    public PmsProject(String proId, String proTitle, String proStatus, java.math.BigDecimal proBudget, java.util.Date proStartDate, java.util.Date proEndDate, String proNeedPermit, String proHasCluster, String proUserId, java.util.Date proTimeStamp, String proArea, String username, java.util.Date timeStamp, eu.pms.project.database.PmsPermit pmsPermit, eu.pms.project.database.PmsProgramm pmsProgramm, eu.pms.project.database.PmsDevelopmentAgency pmsDevelopmentAgency, eu.pms.project.database.PmsClusterTyp pmsClusterTyp, Set pmsProjectsImplementers, Set pmsProjectsHasPmsProjectsByPmsProjectsProId, Set pmsProjectsHasPmsProjectsByPmsProjectsProId1, Set pmsProjectsCommunities, Set pmsProjectsLocations, Set pmsProjectsBenificiaries, Set pmsProjectDonors, Set pmsIncidents) {
        this.proId = proId;
        this.proTitle = proTitle;
        this.proStatus = proStatus;
        this.proBudget = proBudget;
        this.proStartDate = proStartDate;
        this.proEndDate = proEndDate;
        this.proNeedPermit = proNeedPermit;
        this.proHasCluster = proHasCluster;
        this.proUserId = proUserId;
        this.proTimeStamp = proTimeStamp;
        this.proArea = proArea;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsPermit = pmsPermit;
        this.pmsProgramm = pmsProgramm;
        this.pmsDevelopmentAgency = pmsDevelopmentAgency;
        this.pmsClusterTyp = pmsClusterTyp;
        this.pmsProjectsImplementers = pmsProjectsImplementers;
        this.pmsProjectsHasPmsProjectsByPmsProjectsProId = pmsProjectsHasPmsProjectsByPmsProjectsProId;
        this.pmsProjectsHasPmsProjectsByPmsProjectsProId1 = pmsProjectsHasPmsProjectsByPmsProjectsProId1;
        this.pmsProjectsCommunities = pmsProjectsCommunities;
        this.pmsProjectsLocations = pmsProjectsLocations;
        this.pmsProjectsBenificiaries = pmsProjectsBenificiaries;
        this.pmsProjectDonors = pmsProjectDonors;
        this.pmsIncidents = pmsIncidents;
    }

    public String getProId() {
        return this.proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProTitle() {
        return this.proTitle;
    }

    public void setProTitle(String proTitle) {
        this.proTitle = proTitle;
    }

    public String getProDescription() {
        return this.proDescription;
    }

    public void setProDescription(String proDescription) {
        this.proDescription = proDescription;
    }

    public String getProStatus() {
        return this.proStatus;
    }

    public void setProStatus(String proStatus) {
        this.proStatus = proStatus;
    }

    public java.math.BigDecimal getProBudget() {
        return this.proBudget;
    }

    public void setProBudget(java.math.BigDecimal proBudget) {
        this.proBudget = proBudget;
    }

    public java.util.Date getProStartDate() {
        return this.proStartDate;
    }

    public void setProStartDate(java.util.Date proStartDate) {
        this.proStartDate = proStartDate;
    }

    public java.util.Date getProEndDate() {
        return this.proEndDate;
    }

    public void setProEndDate(java.util.Date proEndDate) {
        this.proEndDate = proEndDate;
    }

    public String getProNeedPermit() {
        return this.proNeedPermit;
    }

    public void setProNeedPermit(String proNeedPermit) {
        this.proNeedPermit = proNeedPermit;
    }

    public String getProHasCluster() {
        return this.proHasCluster;
    }

    public void setProHasCluster(String proHasCluster) {
        this.proHasCluster = proHasCluster;
    }

    public String getProNotes() {
        return this.proNotes;
    }

    public void setProNotes(String proNotes) {
        this.proNotes = proNotes;
    }

    public String getProUserId() {
        return this.proUserId;
    }

    public void setProUserId(String proUserId) {
        this.proUserId = proUserId;
    }

    public java.util.Date getProTimeStamp() {
        return this.proTimeStamp;
    }

    public void setProTimeStamp(java.util.Date proTimeStamp) {
        this.proTimeStamp = proTimeStamp;
    }

    public String getProArea() {
        return this.proArea;
    }

    public void setProArea(String proArea) {
        this.proArea = proArea;
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

    public eu.pms.project.database.PmsProjectAlbum getPmsProjectAlbum() {
        return this.pmsProjectAlbum;
    }

    public void setPmsProjectAlbum(eu.pms.project.database.PmsProjectAlbum pmsProjectAlbum) {
        this.pmsProjectAlbum = pmsProjectAlbum;
    }

    public eu.pms.project.database.PmsPermit getPmsPermit() {
        return this.pmsPermit;
    }

    public void setPmsPermit(eu.pms.project.database.PmsPermit pmsPermit) {
        this.pmsPermit = pmsPermit;
    }

    public eu.pms.project.database.PmsProgramm getPmsProgramm() {
        return this.pmsProgramm;
    }

    public void setPmsProgramm(eu.pms.project.database.PmsProgramm pmsProgramm) {
        this.pmsProgramm = pmsProgramm;
    }

    public eu.pms.project.database.PmsDevelopmentAgency getPmsDevelopmentAgency() {
        return this.pmsDevelopmentAgency;
    }

    public void setPmsDevelopmentAgency(eu.pms.project.database.PmsDevelopmentAgency pmsDevelopmentAgency) {
        this.pmsDevelopmentAgency = pmsDevelopmentAgency;
    }

    public eu.pms.project.database.PmsClusterTyp getPmsClusterTyp() {
        return this.pmsClusterTyp;
    }

    public void setPmsClusterTyp(eu.pms.project.database.PmsClusterTyp pmsClusterTyp) {
        this.pmsClusterTyp = pmsClusterTyp;
    }

    public Set getPmsProjectsImplementers() {
        return this.pmsProjectsImplementers;
    }

    public void setPmsProjectsImplementers(Set pmsProjectsImplementers) {
        this.pmsProjectsImplementers = pmsProjectsImplementers;
    }

    public Set getPmsProjectsHasPmsProjectsByPmsProjectsProId() {
        return this.pmsProjectsHasPmsProjectsByPmsProjectsProId;
    }

    public void setPmsProjectsHasPmsProjectsByPmsProjectsProId(Set pmsProjectsHasPmsProjectsByPmsProjectsProId) {
        this.pmsProjectsHasPmsProjectsByPmsProjectsProId = pmsProjectsHasPmsProjectsByPmsProjectsProId;
    }

    public Set getPmsProjectsHasPmsProjectsByPmsProjectsProId1() {
        return this.pmsProjectsHasPmsProjectsByPmsProjectsProId1;
    }

    public void setPmsProjectsHasPmsProjectsByPmsProjectsProId1(Set pmsProjectsHasPmsProjectsByPmsProjectsProId1) {
        this.pmsProjectsHasPmsProjectsByPmsProjectsProId1 = pmsProjectsHasPmsProjectsByPmsProjectsProId1;
    }

    public Set getPmsProjectsCommunities() {
        return this.pmsProjectsCommunities;
    }

    public void setPmsProjectsCommunities(Set pmsProjectsCommunities) {
        this.pmsProjectsCommunities = pmsProjectsCommunities;
    }

    public Set getPmsProjectsLocations() {
        return this.pmsProjectsLocations;
    }

    public void setPmsProjectsLocations(Set pmsProjectsLocations) {
        this.pmsProjectsLocations = pmsProjectsLocations;
    }

    public Set getPmsProjectsBenificiaries() {
        return this.pmsProjectsBenificiaries;
    }

    public void setPmsProjectsBenificiaries(Set pmsProjectsBenificiaries) {
        this.pmsProjectsBenificiaries = pmsProjectsBenificiaries;
    }

    public Set getPmsProjectDonors() {
        return this.pmsProjectDonors;
    }

    public void setPmsProjectDonors(Set pmsProjectDonors) {
        this.pmsProjectDonors = pmsProjectDonors;
    }

    public Set getPmsIncidents() {
        return this.pmsIncidents;
    }

    public void setPmsIncidents(Set pmsIncidents) {
        this.pmsIncidents = pmsIncidents;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("proId", getProId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsProject) ) return false;
        PmsProject castOther = (PmsProject) other;
        return new EqualsBuilder()
            .append(this.getProId(), castOther.getProId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getProId())
            .toHashCode();
    }

}
