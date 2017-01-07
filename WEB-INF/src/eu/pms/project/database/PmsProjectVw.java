package eu.pms.project.database;

import eu.pms.common.tools.DateTool;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/** @author Hibernate CodeGenerator */
public class PmsProjectVw implements Serializable {
    private String proId;
    private String proTitle;
    private String proDescription;
    private String proStatus;
    private String proStatusDesc;
    private java.math.BigDecimal proBudget;
    private String proStartDate;
    private String proEndDate;
    private String donorId;
    private String donorName;
    private String governateId;
    private String governateDesc;
    private String communityId;
    private String communityName;
    private String sectorId;
    private String sectorName;
    private String hasPermit;
    private String pDesc;
    private String btpId;
    private String btpDesc;
    private String impId;
    private String impName;

    /** default constructor */
    public PmsProjectVw() {
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

    public String getProStartDate() {
        return this.proStartDate;
    }

    public void setProStartDate(String proStartDate) {
        this.proStartDate = proStartDate;
    }

    public String getProEndDate() {
        return this.proEndDate;
    }

    public void setProEndDate(String proEndDate) {
        this.proEndDate = proEndDate;
    }

    public String getDonorId() {
        return donorId;
    }

    public void setDonorId(String donorId) {
        this.donorId = donorId;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getGovernateId() {
        return governateId;
    }

    public void setGovernateId(String governateId) {
        this.governateId = governateId;
    }

    public String getGovernateDesc() {
        return governateDesc;
    }

    public void setGovernateDesc(String governateDesc) {
        this.governateDesc = governateDesc;
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getSectorId() {
        return sectorId;
    }

    public void setSectorId(String sectorId) {
        this.sectorId = sectorId;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    public String getProStatusDesc() {
        return proStatusDesc;
    }

    public void setProStatusDesc(String proStatusDesc) {
        this.proStatusDesc = proStatusDesc;
    }

    public String getHasPermit() {
        return hasPermit;
    }

    public void setHasPermit(String hasPermit) {
        this.hasPermit = hasPermit;
    }

    public String getpDesc() {
        return pDesc;
    }

    public void setpDesc(String pDesc) {
        this.pDesc = pDesc;
    }

    public String getBtpId() {
        return btpId;
    }

    public void setBtpId(String btpId) {
        this.btpId = btpId;
    }

    public String getBtpDesc() {
        return btpDesc;
    }

    public void setBtpDesc(String btpDesc) {
        this.btpDesc = btpDesc;
    }

    public String getImpId() {
        return impId;
    }

    public void setImpId(String impId) {
        this.impId = impId;
    }

    public String getImpName() {
        return impName;
    }

    public void setImpName(String impName) {
        this.impName = impName;
    }
}
