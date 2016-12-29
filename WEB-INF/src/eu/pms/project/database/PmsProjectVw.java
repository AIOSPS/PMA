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


    public String getProStatusDesc() {
        if (this.proStatus==null || this.proStatus.isEmpty()){
            proStatusDesc = "Unknown";
        }else if(this.proStatus.equals("1")){
            proStatusDesc = "New";
        }else if(this.proStatus.equals("2")){
            proStatusDesc = "Stopped";
        }else if(this.proStatus.equals("3")){
            proStatusDesc = "Completed";
        }else{
            proStatusDesc = "Unknown";
        }
        return proStatusDesc;
    }

    public void setProStatusDesc(String proStatusDesc) {
        this.proStatusDesc = proStatusDesc;
    }



}
