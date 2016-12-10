package eu.pms.project.forms;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.Date;

/** @author Hibernate CodeGenerator */
public class PmsProjectForm  extends ActionForm {
    private String proId;
    private String proTitle;
    private String proDescription;
    private String proStatus;
    private java.math.BigDecimal proBudget;
    private String proStartDate;
    private String proEndDate;
    private String proNeedPermit;
    private String proHasCluster;
    private String proNotes;
    private String proArea;
    private String username;
    private String timeStamp;
    private String prgId;
    private String devId;
    private String cluId;
    private String proType;
    private String preId;

    private String[] donorProjectList;
    private String[] implementerProjectList;
    private String[] locationProjectList;
    private String[] communityProjectList;
    private String[] benificiaryProjectList;
    private String[] indicatorProjectList;



    /** default constructor */
    public PmsProjectForm() {
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

    public String getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
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

    public String getCluId() {
        return cluId;
    }

    public void setCluId(String cluId) {
        this.cluId = cluId;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public String getPreId() {
        return preId;
    }

    public void setPreId(String preId) {
        this.preId = preId;
    }

    public String[] getDonorProjectList() {
        return donorProjectList;
    }

    public void setDonorProjectList(String[] donorProjectList) {
        this.donorProjectList = donorProjectList;
    }

    public String[] getImplementerProjectList() {
        return implementerProjectList;
    }

    public void setImplementerProjectList(String[] implementerProjectList) {
        this.implementerProjectList = implementerProjectList;
    }

    public String[] getLocationProjectList() {
        return locationProjectList;
    }

    public void setLocationProjectList(String[] locationProjectList) {
        this.locationProjectList = locationProjectList;
    }

    public String[] getCommunityProjectList() {
        return communityProjectList;
    }

    public void setCommunityProjectList(String[] communityProjectList) {
        this.communityProjectList = communityProjectList;
    }

    public String[] getBenificiaryProjectList() {
        return benificiaryProjectList;
    }

    public void setBenificiaryProjectList(String[] benificiaryProjectList) {
        this.benificiaryProjectList = benificiaryProjectList;
    }

    public String[] getIndicatorProjectList() {
        return indicatorProjectList;
    }

    public void setIndicatorProjectList(String[] indicatorProjectList) {
        this.indicatorProjectList = indicatorProjectList;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
