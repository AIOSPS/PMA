package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsMasterPlan implements Serializable {

    /** identifier field */
    private String masId;

    /** persistent field */
    private String masMpNo;

    /** persistent field */
    private String masMpName;

    /** nullable persistent field */
    private String masStatus;

    /** persistent field */
    private String masStatusIca;

    /** persistent field */
    private java.util.Date masFirstSubmitDateToIca;

    /** persistent field */
    private java.util.Date masLastSubmitDateToIca;

    /** persistent field */
    private int masNoSessionWithIca;

    /** persistent field */
    private String masSubmitToMod;

    /** persistent field */
    private java.util.Date masApprovalDate;

    /** persistent field */
    private java.util.Date masPublicationDate;

    /** persistent field */
    private java.util.Date masLastDateForObjection;

    /** persistent field */
    private java.util.Date masDateOfFinalPublication;

    /** persistent field */
    private int masApprovedPlanedArea;

    /** persistent field */
    private String masVillageAdminBoarder;

    /** persistent field */
    private String masNote;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private PmsImplementer pmsImplementer;

    /** persistent field */
    private Set pmsMasterPlanCommunities;

    /** persistent field */
    private Set pmsInterventions;

    /** persistent field */
    private Set pmsMasterPlanDonors;

    /** full constructor */
    public PmsMasterPlan(String masId, String masMpNo, String masMpName, String masStatus, String masStatusIca, java.util.Date masFirstSubmitDateToIca, java.util.Date masLastSubmitDateToIca, int masNoSessionWithIca, String masSubmitToMod, java.util.Date masApprovalDate, java.util.Date masPublicationDate, java.util.Date masLastDateForObjection, java.util.Date masDateOfFinalPublication, int masApprovedPlanedArea, String masVillageAdminBoarder, String masNote, String username, java.util.Date timeStamp, PmsImplementer pmsImplementer, Set pmsMasterPlanCommunities, Set pmsInterventions, Set pmsMasterPlanDonors) {
        this.masId = masId;
        this.masMpNo = masMpNo;
        this.masMpName = masMpName;
        this.masStatus = masStatus;
        this.masStatusIca = masStatusIca;
        this.masFirstSubmitDateToIca = masFirstSubmitDateToIca;
        this.masLastSubmitDateToIca = masLastSubmitDateToIca;
        this.masNoSessionWithIca = masNoSessionWithIca;
        this.masSubmitToMod = masSubmitToMod;
        this.masApprovalDate = masApprovalDate;
        this.masPublicationDate = masPublicationDate;
        this.masLastDateForObjection = masLastDateForObjection;
        this.masDateOfFinalPublication = masDateOfFinalPublication;
        this.masApprovedPlanedArea = masApprovedPlanedArea;
        this.masVillageAdminBoarder = masVillageAdminBoarder;
        this.masNote = masNote;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsImplementer = pmsImplementer;
        this.pmsMasterPlanCommunities = pmsMasterPlanCommunities;
        this.pmsInterventions = pmsInterventions;
        this.pmsMasterPlanDonors = pmsMasterPlanDonors;
    }

    /** default constructor */
    public PmsMasterPlan() {
    }

    /** minimal constructor */
    public PmsMasterPlan(String masId, String masMpNo, String masMpName, String masStatusIca, java.util.Date masFirstSubmitDateToIca, java.util.Date masLastSubmitDateToIca, int masNoSessionWithIca, String masSubmitToMod, java.util.Date masApprovalDate, java.util.Date masPublicationDate, java.util.Date masLastDateForObjection, java.util.Date masDateOfFinalPublication, int masApprovedPlanedArea, String masVillageAdminBoarder, String masNote, String username, java.util.Date timeStamp, PmsImplementer pmsImplementer, Set pmsMasterPlanCommunities, Set pmsInterventions, Set pmsMasterPlanDonors) {
        this.masId = masId;
        this.masMpNo = masMpNo;
        this.masMpName = masMpName;
        this.masStatusIca = masStatusIca;
        this.masFirstSubmitDateToIca = masFirstSubmitDateToIca;
        this.masLastSubmitDateToIca = masLastSubmitDateToIca;
        this.masNoSessionWithIca = masNoSessionWithIca;
        this.masSubmitToMod = masSubmitToMod;
        this.masApprovalDate = masApprovalDate;
        this.masPublicationDate = masPublicationDate;
        this.masLastDateForObjection = masLastDateForObjection;
        this.masDateOfFinalPublication = masDateOfFinalPublication;
        this.masApprovedPlanedArea = masApprovedPlanedArea;
        this.masVillageAdminBoarder = masVillageAdminBoarder;
        this.masNote = masNote;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsImplementer = pmsImplementer;
        this.pmsMasterPlanCommunities = pmsMasterPlanCommunities;
        this.pmsInterventions = pmsInterventions;
        this.pmsMasterPlanDonors = pmsMasterPlanDonors;
    }

    public String getMasId() {
        return this.masId;
    }

    public void setMasId(String masId) {
        this.masId = masId;
    }

    public String getMasMpNo() {
        return this.masMpNo;
    }

    public void setMasMpNo(String masMpNo) {
        this.masMpNo = masMpNo;
    }

    public String getMasMpName() {
        return this.masMpName;
    }

    public void setMasMpName(String masMpName) {
        this.masMpName = masMpName;
    }

    public String getMasStatus() {
        return this.masStatus;
    }

    public void setMasStatus(String masStatus) {
        this.masStatus = masStatus;
    }

    public String getMasStatusIca() {
        return this.masStatusIca;
    }

    public void setMasStatusIca(String masStatusIca) {
        this.masStatusIca = masStatusIca;
    }

    public java.util.Date getMasFirstSubmitDateToIca() {
        return this.masFirstSubmitDateToIca;
    }

    public void setMasFirstSubmitDateToIca(java.util.Date masFirstSubmitDateToIca) {
        this.masFirstSubmitDateToIca = masFirstSubmitDateToIca;
    }

    public java.util.Date getMasLastSubmitDateToIca() {
        return this.masLastSubmitDateToIca;
    }

    public void setMasLastSubmitDateToIca(java.util.Date masLastSubmitDateToIca) {
        this.masLastSubmitDateToIca = masLastSubmitDateToIca;
    }

    public int getMasNoSessionWithIca() {
        return this.masNoSessionWithIca;
    }

    public void setMasNoSessionWithIca(int masNoSessionWithIca) {
        this.masNoSessionWithIca = masNoSessionWithIca;
    }

    public String getMasSubmitToMod() {
        return this.masSubmitToMod;
    }

    public void setMasSubmitToMod(String masSubmitToMod) {
        this.masSubmitToMod = masSubmitToMod;
    }

    public java.util.Date getMasApprovalDate() {
        return this.masApprovalDate;
    }

    public void setMasApprovalDate(java.util.Date masApprovalDate) {
        this.masApprovalDate = masApprovalDate;
    }

    public java.util.Date getMasPublicationDate() {
        return this.masPublicationDate;
    }

    public void setMasPublicationDate(java.util.Date masPublicationDate) {
        this.masPublicationDate = masPublicationDate;
    }

    public java.util.Date getMasLastDateForObjection() {
        return this.masLastDateForObjection;
    }

    public void setMasLastDateForObjection(java.util.Date masLastDateForObjection) {
        this.masLastDateForObjection = masLastDateForObjection;
    }

    public java.util.Date getMasDateOfFinalPublication() {
        return this.masDateOfFinalPublication;
    }

    public void setMasDateOfFinalPublication(java.util.Date masDateOfFinalPublication) {
        this.masDateOfFinalPublication = masDateOfFinalPublication;
    }

    public int getMasApprovedPlanedArea() {
        return this.masApprovedPlanedArea;
    }

    public void setMasApprovedPlanedArea(int masApprovedPlanedArea) {
        this.masApprovedPlanedArea = masApprovedPlanedArea;
    }

    public String getMasVillageAdminBoarder() {
        return this.masVillageAdminBoarder;
    }

    public void setMasVillageAdminBoarder(String masVillageAdminBoarder) {
        this.masVillageAdminBoarder = masVillageAdminBoarder;
    }

    public String getMasNote() {
        return this.masNote;
    }

    public void setMasNote(String masNote) {
        this.masNote = masNote;
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

    public PmsImplementer getPmsImplementer() {
        return this.pmsImplementer;
    }

    public void setPmsImplementer(PmsImplementer pmsImplementer) {
        this.pmsImplementer = pmsImplementer;
    }

    public Set getPmsMasterPlanCommunities() {
        return this.pmsMasterPlanCommunities;
    }

    public void setPmsMasterPlanCommunities(Set pmsMasterPlanCommunities) {
        this.pmsMasterPlanCommunities = pmsMasterPlanCommunities;
    }

    public Set getPmsInterventions() {
        return this.pmsInterventions;
    }

    public void setPmsInterventions(Set pmsInterventions) {
        this.pmsInterventions = pmsInterventions;
    }

    public Set getPmsMasterPlanDonors() {
        return this.pmsMasterPlanDonors;
    }

    public void setPmsMasterPlanDonors(Set pmsMasterPlanDonors) {
        this.pmsMasterPlanDonors = pmsMasterPlanDonors;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("masId", getMasId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsMasterPlan) ) return false;
        PmsMasterPlan castOther = (PmsMasterPlan) other;
        return new EqualsBuilder()
            .append(this.getMasId(), castOther.getMasId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getMasId())
            .toHashCode();
    }

}
