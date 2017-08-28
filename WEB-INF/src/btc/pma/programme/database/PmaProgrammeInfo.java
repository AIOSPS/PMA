package btc.pma.programme.database;

import java.io.Serializable;

import eu.pms.common.tools.DateTool;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmaProgrammeInfo implements Serializable {

    /** identifier field */
    private String intrNo;

    /** nullable persistent field */
    private String intrTitle;

    /** nullable persistent field */
    private int intrDuration;

    /** nullable persistent field */
    private String intrDescription;

    /** nullable persistent field */
    private String btcNavisionCode;

    /** nullable persistent field */
    private String partInstitution;

    /** nullable persistent field */
    private int agrmDuration;

    /** nullable persistent field */
    private java.util.Date estmStartDate;

    private String estmStartDateStr;

    /** nullable persistent field */
    private int contPartnerCountry;

    /** nullable persistent field */
    private int belgContribution;

    /** nullable persistent field */
    private String secCode;

    /** nullable persistent field */
    private String oallObjective;

    /** nullable persistent field */
    private java.util.Date agrmSignDate;

    private String agrmSignDateStr;

    /** nullable persistent field */
    private String username;

    /** nullable persistent field */
    private java.util.Date timeStamp;


    /** full constructor */
    public PmaProgrammeInfo(String intrNo, String intrTitle, int intrDuration, String intrDescription, String btcNavisionCode, String partInstitution, int agrmDuration, java.util.Date estmStartDate, int contPartnerCountry, int belgContribution, String secCode, String oallObjective, java.util.Date agrmSignDate, String username, java.util.Date timeStamp) {
        this.intrNo = intrNo;
        this.intrTitle = intrTitle;
        this.intrDuration = intrDuration;
        this.intrDescription = intrDescription;
        this.btcNavisionCode = btcNavisionCode;
        this.partInstitution = partInstitution;
        this.agrmDuration = agrmDuration;
        this.estmStartDate = estmStartDate;
        this.contPartnerCountry = contPartnerCountry;
        this.belgContribution = belgContribution;
        this.secCode = secCode;
        this.oallObjective = oallObjective;
        this.agrmSignDate = agrmSignDate;
        this.username = username;
        this.timeStamp = timeStamp;
    }

    /** default constructor */
    public PmaProgrammeInfo() {
    }

    public String getIntrNo() {
        return this.intrNo;
    }

    public void setIntrNo(String intrNo) {
        this.intrNo = intrNo;
    }

    public String getIntrTitle() {
        return this.intrTitle;
    }

    public void setIntrTitle(String intrTitle) {
        this.intrTitle = intrTitle;
    }

    public int getIntrDuration() {
        return this.intrDuration;
    }

    public void setIntrDuration(int intrDuration) {
        this.intrDuration = intrDuration;
    }

    public String getIntrDescription() {
        return this.intrDescription;
    }

    public void setIntrDescription(String intrDescription) {
        this.intrDescription = intrDescription;
    }

    public String getBtcNavisionCode() {
        return this.btcNavisionCode;
    }

    public void setBtcNavisionCode(String btcNavisionCode) {
        this.btcNavisionCode = btcNavisionCode;
    }

    public String getPartInstitution() {
        return this.partInstitution;
    }

    public void setPartInstitution(String partInstitution) {
        this.partInstitution = partInstitution;
    }

    public int getAgrmDuration() {
        return this.agrmDuration;
    }

    public void setAgrmDuration(int agrmDuration) {
        this.agrmDuration = agrmDuration;
    }

    public java.util.Date getEstmStartDate() {
        return this.estmStartDate;
    }

    public void setEstmStartDate(java.util.Date estmStartDate) {
        this.estmStartDate = estmStartDate;
    }

    public int getContPartnerCountry() {
        return this.contPartnerCountry;
    }

    public void setContPartnerCountry(int contPartnerCountry) {
        this.contPartnerCountry = contPartnerCountry;
    }

    public int getBelgContribution() {
        return this.belgContribution;
    }

    public void setBelgContribution(int belgContribution) {
        this.belgContribution = belgContribution;
    }

    public String getSecCode() {
        return this.secCode;
    }

    public void setSecCode(String secCode) {
        this.secCode = secCode;
    }

    public String getOallObjective() {
        return this.oallObjective;
    }

    public void setOallObjective(String oallObjective) {
        this.oallObjective = oallObjective;
    }

    public java.util.Date getAgrmSignDate() {
        return this.agrmSignDate;
    }

    public void setAgrmSignDate(java.util.Date agrmSignDate) {
        this.agrmSignDate = agrmSignDate;
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

    public String getEstmStartDateStr() {
        return estmStartDateStr!=null? DateTool.decorateDate(estmStartDateStr, DateTool.DD_MM_YYYY):"";
    }

    public void setEstmStartDateStr(String estmStartDateStr) {
        this.estmStartDateStr = estmStartDateStr;
    }

    public String getAgrmSignDateStr() {
        return agrmSignDateStr!=null? DateTool.decorateDate(agrmSignDateStr, DateTool.DD_MM_YYYY):"";

    }

    public void setAgrmSignDateStr(String agrmSignDateStr) {
        this.agrmSignDateStr = agrmSignDateStr;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("intrNo", getIntrNo())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmaProgrammeInfo) ) return false;
        PmaProgrammeInfo castOther = (PmaProgrammeInfo) other;
        return new EqualsBuilder()
            .append(this.getIntrNo(), castOther.getIntrNo())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getIntrNo())
            .toHashCode();
    }

}
