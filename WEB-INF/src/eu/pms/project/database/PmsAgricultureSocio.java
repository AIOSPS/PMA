package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsAgricultureSocio implements Serializable {

    /** identifier field */
    private String agrId;

    /** persistent field */
    private int agrArea;

    /** persistent field */
    private int agrNoCowYear;

    /** persistent field */
    private int agrNoSheepYear;

    /** persistent field */
    private int agrCostWaterTank;

    /** persistent field */
    private int agrHerdingArea;

    /** persistent field */
    private int agrMilitaryArea;

    /** persistent field */
    private int agrBypassRoadArea;

    /** persistent field */
    private java.util.Date agrSurveyDate;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private eu.pms.project.database.PmsCommunity pmsCommunity;

    /** full constructor */
    public PmsAgricultureSocio(String agrId, int agrArea, int agrNoCowYear, int agrNoSheepYear, int agrCostWaterTank, int agrHerdingArea, int agrMilitaryArea, int agrBypassRoadArea, java.util.Date agrSurveyDate, String username, java.util.Date timeStamp, eu.pms.project.database.PmsCommunity pmsCommunity) {
        this.agrId = agrId;
        this.agrArea = agrArea;
        this.agrNoCowYear = agrNoCowYear;
        this.agrNoSheepYear = agrNoSheepYear;
        this.agrCostWaterTank = agrCostWaterTank;
        this.agrHerdingArea = agrHerdingArea;
        this.agrMilitaryArea = agrMilitaryArea;
        this.agrBypassRoadArea = agrBypassRoadArea;
        this.agrSurveyDate = agrSurveyDate;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsCommunity = pmsCommunity;
    }

    /** default constructor */
    public PmsAgricultureSocio() {
    }

    public String getAgrId() {
        return this.agrId;
    }

    public void setAgrId(String agrId) {
        this.agrId = agrId;
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

    public eu.pms.project.database.PmsCommunity getPmsCommunity() {
        return this.pmsCommunity;
    }

    public void setPmsCommunity(eu.pms.project.database.PmsCommunity pmsCommunity) {
        this.pmsCommunity = pmsCommunity;
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
