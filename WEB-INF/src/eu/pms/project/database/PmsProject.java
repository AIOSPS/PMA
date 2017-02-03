package eu.pms.project.database;

import java.io.Serializable;
import java.util.Date;

import eu.pms.common.tools.DateTool;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsProject implements Serializable {
    private String proId;
    private String proTitle;
    private String proDescription;
    private String proStatus;
    private String proStatusDesc;
    private java.math.BigDecimal proBudget;
    private Date proStartDate;
    private Date proEndDate;
    private String proStartDateStr;
    private String proEndDateStr;
    private String proNeedPermit;
    private String proHasCluster;
    private String proNotes;
    private String proArea;
    private String username;
    private Date timeStamp;
    private String prgId;
    private String devId;
    private String secId;
    private String subSecId;
    private String preId;
    private String comLatitude;
    private String comLongitude;
    private String secType;
    /** default constructor */
    public PmsProject() {
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

    public Date getProStartDate() {
        return this.proStartDate;
    }

    public void setProStartDate(Date proStartDate) {
        this.proStartDate = proStartDate;
    }

    public Date getProEndDate() {
        return this.proEndDate;
    }

    public void setProEndDate(Date proEndDate) {
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

    public Date getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getPrgId() {
        return prgId;
    }

    public void setPrgId(String prgId) {
        this.prgId = prgId;
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

    public String getSecId() {
        return secId;
    }

    public void setSecId(String secId) {
        this.secId = secId;
    }


    public String getPreId() {
        return preId;
    }

    public void setPreId(String preId) {
        this.preId = preId;
    }

    public String getProStatusDesc() {
        if (this.proStatus==null || this.proStatus.isEmpty()){
            proStatusDesc = "Unknown";
        }else if(this.proStatus.equals("1")){
            proStatusDesc = "Design / Approval";
        }else if(this.proStatus.equals("2")){
            proStatusDesc = "Ongoing";
        }else if(this.proStatus.equals("3")){
            proStatusDesc = "Delayed";
        }else if(this.proStatus.equals("4")){
            proStatusDesc = "Completed";
        }else if(this.proStatus.equals("5")){
            proStatusDesc = "On-Hold";
        }else if(this.proStatus.equals("6")){
            proStatusDesc = "Closed";
        }else if(this.proStatus.equals("7")){
            proStatusDesc = "Cancelled";
        }else{
            proStatusDesc = "Unknown";
        }
        return proStatusDesc;
    }

    public void setProStatusDesc(String proStatusDesc) {
        this.proStatusDesc = proStatusDesc;
    }

    public String getProStartDateStr() {
        return proStartDate!=null? DateTool.decorateDate(proStartDate, DateTool.DD_MM_YYYY):"";
    }

    public void setProStartDateStr(String proStartDateStr) {
        this.proStartDateStr = proStartDateStr;
    }

    public String getProEndDateStr() {
        return proEndDate!=null? DateTool.decorateDate(proEndDate, DateTool.DD_MM_YYYY):"";
    }

    public void setProEndDateStr(String proEndDateStr) {
        this.proEndDateStr = proEndDateStr;
    }

    public String getComLatitude() {
        return comLatitude;
    }

    public void setComLatitude(String comLatitude) {
        this.comLatitude = comLatitude;
    }

    public String getComLongitude() {
        return comLongitude;
    }

    public void setComLongitude(String comLongitude) {
        this.comLongitude = comLongitude;
    }

    public String getSecType() {
        return secType;
    }

    public void setSecType(String secType) {
        this.secType = secType;
    }

    public String getSubSecId() {
        return subSecId;
    }

    public void setSubSecId(String subSecId) {
        this.subSecId = subSecId;
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
