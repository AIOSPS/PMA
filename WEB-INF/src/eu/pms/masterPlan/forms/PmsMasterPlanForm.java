package eu.pms.masterPlan.forms;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.Date;

/** @author Hibernate CodeGenerator */
public class PmsMasterPlanForm  extends ActionForm {
    private String masId;
    private String impId;
    private String masMpNo;
    private String masMpName;
    private String masStatus;
    private String masStatusIca;
    private String masFirstSubmitDateToIca;//
    private String masLastSubmitDateToIca;//
    private Integer masNoSessionWithIca;
    private String masSubmitToMod;
    private String masApprovalDate;//
    private String masPublicationDate;//
    private String masLastDateForObjection;//
    private String masDateOfFinalPublication;//
    private Integer masApprovedPlanedArea;
    private String masVillageAdminBoarder;
    private String masNote;
    private String masMajorObjection;
    private String[] donorMasterPlanList;
    private String[] communityMasterPlanList;



    /** default constructor */
    public PmsMasterPlanForm() {
    }

    public String getMasId() {
        return masId;
    }

    public void setMasId(String masId) {
        this.masId = masId;
    }

    public String getImpId() {
        return impId;
    }

    public void setImpId(String impId) {
        this.impId = impId;
    }

    public String getMasMpNo() {
        return masMpNo;
    }

    public void setMasMpNo(String masMpNo) {
        this.masMpNo = masMpNo;
    }

    public String getMasMpName() {
        return masMpName;
    }

    public void setMasMpName(String masMpName) {
        this.masMpName = masMpName;
    }

    public String getMasStatus() {
        return masStatus;
    }

    public void setMasStatus(String masStatus) {
        this.masStatus = masStatus;
    }

    public String getMasStatusIca() {
        return masStatusIca;
    }

    public void setMasStatusIca(String masStatusIca) {
        this.masStatusIca = masStatusIca;
    }

    public String getMasFirstSubmitDateToIca() {
        return masFirstSubmitDateToIca;
    }

    public void setMasFirstSubmitDateToIca(String masFirstSubmitDateToIca) {
        this.masFirstSubmitDateToIca = masFirstSubmitDateToIca;
    }

    public String getMasLastSubmitDateToIca() {
        return masLastSubmitDateToIca;
    }

    public void setMasLastSubmitDateToIca(String masLastSubmitDateToIca) {
        this.masLastSubmitDateToIca = masLastSubmitDateToIca;
    }

    public Integer getMasNoSessionWithIca() {
        return masNoSessionWithIca;
    }

    public void setMasNoSessionWithIca(Integer masNoSessionWithIca) {
        this.masNoSessionWithIca = masNoSessionWithIca;
    }

    public String getMasSubmitToMod() {
        return masSubmitToMod;
    }

    public void setMasSubmitToMod(String masSubmitToMod) {
        this.masSubmitToMod = masSubmitToMod;
    }

    public String getMasApprovalDate() {
        return masApprovalDate;
    }

    public void setMasApprovalDate(String masApprovalDate) {
        this.masApprovalDate = masApprovalDate;
    }

    public String getMasPublicationDate() {
        return masPublicationDate;
    }

    public void setMasPublicationDate(String masPublicationDate) {
        this.masPublicationDate = masPublicationDate;
    }

    public String getMasLastDateForObjection() {
        return masLastDateForObjection;
    }

    public void setMasLastDateForObjection(String masLastDateForObjection) {
        this.masLastDateForObjection = masLastDateForObjection;
    }

    public String getMasDateOfFinalPublication() {
        return masDateOfFinalPublication;
    }

    public void setMasDateOfFinalPublication(String masDateOfFinalPublication) {
        this.masDateOfFinalPublication = masDateOfFinalPublication;
    }

    public Integer getMasApprovedPlanedArea() {
        return masApprovedPlanedArea;
    }

    public void setMasApprovedPlanedArea(Integer masApprovedPlanedArea) {
        this.masApprovedPlanedArea = masApprovedPlanedArea;
    }

    public String getMasVillageAdminBoarder() {
        return masVillageAdminBoarder;
    }

    public void setMasVillageAdminBoarder(String masVillageAdminBoarder) {
        this.masVillageAdminBoarder = masVillageAdminBoarder;
    }

    public String getMasNote() {
        return masNote;
    }

    public void setMasNote(String masNote) {
        this.masNote = masNote;
    }

    public String[] getDonorMasterPlanList() {
        return donorMasterPlanList;
    }

    public void setDonorMasterPlanList(String[] donorMasterPlanList) {
        this.donorMasterPlanList = donorMasterPlanList;
    }

    public String[] getCommunityMasterPlanList() {
        return communityMasterPlanList;
    }

    public void setCommunityMasterPlanList(String[] communityMasterPlanList) {
        this.communityMasterPlanList = communityMasterPlanList;
    }

    public String getMasMajorObjection() {
        return masMajorObjection;
    }

    public void setMasMajorObjection(String masMajorObjection) {
        this.masMajorObjection = masMajorObjection;
    }

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        masId = null;
        impId = null;
        masMpNo = null;
        masMpName = null;
        masStatus = null;
        masStatusIca = null;
        masFirstSubmitDateToIca = null;//
        masLastSubmitDateToIca = null;//
        masNoSessionWithIca = null;///
        masSubmitToMod = null;
        masApprovalDate = null;//
        masPublicationDate = null;//
        masLastDateForObjection = null;//
        masDateOfFinalPublication = null;//
        masApprovedPlanedArea = null;///
        masVillageAdminBoarder = null;
        masNote = null;
        masMajorObjection=null;
        donorMasterPlanList = null;
        communityMasterPlanList = null;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
