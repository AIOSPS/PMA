package eu.pms.project.database;

import java.io.Serializable;

import eu.pms.common.tools.DateTool;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsAgricultureSocio implements Serializable {

    private String agrId;
    private String comId;
    private int agrArea;
    private int agrNoCowYear;
    private int agrNoSheepYear;
    private int agrCostWaterTank;
    private int agrHerdingArea;
    private int agrMilitaryArea;
    private int agrBypassRoadArea;
    private java.util.Date agrSurveyDate;
    private String agrSurveyDateStr;
    private String username;
    private java.util.Date timeStamp;

    /** default constructor */
    public PmsAgricultureSocio() {
    }

    public String getAgrId() {
        return this.agrId;
    }

    public void setAgrId(String agrId) {
        this.agrId = agrId;
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    public int getAgrArea() {
        return this.agrArea;
    }

    public void setAgrArea(int agrArea) {
        this.agrArea = agrArea;
    }

    public int getAgrNoCowYear() {
        return this.agrNoCowYear;
    }

    public void setAgrNoCowYear(int agrNoCowYear) {
        this.agrNoCowYear = agrNoCowYear;
    }

    public int getAgrNoSheepYear() {
        return this.agrNoSheepYear;
    }

    public void setAgrNoSheepYear(int agrNoSheepYear) {
        this.agrNoSheepYear = agrNoSheepYear;
    }

    public int getAgrCostWaterTank() {
        return this.agrCostWaterTank;
    }

    public void setAgrCostWaterTank(int agrCostWaterTank) {
        this.agrCostWaterTank = agrCostWaterTank;
    }

    public int getAgrHerdingArea() {
        return this.agrHerdingArea;
    }

    public void setAgrHerdingArea(int agrHerdingArea) {
        this.agrHerdingArea = agrHerdingArea;
    }

    public int getAgrMilitaryArea() {
        return this.agrMilitaryArea;
    }

    public void setAgrMilitaryArea(int agrMilitaryArea) {
        this.agrMilitaryArea = agrMilitaryArea;
    }

    public int getAgrBypassRoadArea() {
        return this.agrBypassRoadArea;
    }

    public void setAgrBypassRoadArea(int agrBypassRoadArea) {
        this.agrBypassRoadArea = agrBypassRoadArea;
    }

    public java.util.Date getAgrSurveyDate() {
        return this.agrSurveyDate;
    }

    public void setAgrSurveyDate(java.util.Date agrSurveyDate) {
        this.agrSurveyDate = agrSurveyDate;
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

    public String getAgrSurveyDateStr() {
        return agrSurveyDate!=null? DateTool.decorateDate(agrSurveyDate, DateTool.DD_MM_YYYY):"";
    }

    public void setAgrSurveyDateStr(String agrSurveyDateStr) {
        this.agrSurveyDateStr = agrSurveyDateStr;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("agrId", getAgrId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsAgricultureSocio) ) return false;
        PmsAgricultureSocio castOther = (PmsAgricultureSocio) other;
        return new EqualsBuilder()
            .append(this.getAgrId(), castOther.getAgrId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getAgrId())
            .toHashCode();
    }

}
