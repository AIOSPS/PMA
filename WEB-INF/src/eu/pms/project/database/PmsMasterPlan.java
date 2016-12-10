package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsMasterPlan implements Serializable {

    private String masId;
    private String impId;
    private String masMpNo;
    private String masMpName;
    private String masStatus;
    private String masStatusIca;
    private java.util.Date masFirstSubmitDateToIca;
    private java.util.Date masLastSubmitDateToIca;
    private int masNoSessionWithIca;
    private String masSubmitToMod;
    private java.util.Date masApprovalDate;
    private java.util.Date masPublicationDate;
    private java.util.Date masLastDateForObjection;
    private java.util.Date masDateOfFinalPublication;
    private int masApprovedPlanedArea;
    private String masVillageAdminBoarder;
    private String masNote;
    private String username;
    private java.util.Date timeStamp;


    /** default constructor */
    public PmsMasterPlan() {
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

    public String getImpId() {
        return impId;
    }

    public void setImpId(String impId) {
        this.impId = impId;
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
