package eu.pms.project.database;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by orayyan on 1/27/2017.
 */
public class PmsEconomicSocioVw implements Serializable {
    private PmsEconomicSocioVwPK compId;
    private String menLivelihoodSource1;
    private String menLivelihoodSource2;
    private String menLivelihoodSource3;
    private String womenLivelihoodSource1;
    private String womenLivelihoodSource2;
    private String womenLivelihoodSource3;
    private String accessToLandsMilitary;
    private String accessToLandsCheckpoints;
    private Integer familyAvgSize;
    private BigDecimal familyAvgIncome;
    private String username;
    private Date timeStamp;

    public PmsEconomicSocioVw() {
    }

    public PmsEconomicSocioVwPK getCompId() {
        return compId;
    }

    public void setCompId(PmsEconomicSocioVwPK compId) {
        this.compId = compId;
    }

    public String getMenLivelihoodSource1() {
        return menLivelihoodSource1;
    }

    public void setMenLivelihoodSource1(String menLivelihoodSource1) {
        this.menLivelihoodSource1 = menLivelihoodSource1;
    }

    public String getMenLivelihoodSource2() {
        return menLivelihoodSource2;
    }

    public void setMenLivelihoodSource2(String menLivelihoodSource2) {
        this.menLivelihoodSource2 = menLivelihoodSource2;
    }

    public String getMenLivelihoodSource3() {
        return menLivelihoodSource3;
    }

    public void setMenLivelihoodSource3(String menLivelihoodSource3) {
        this.menLivelihoodSource3 = menLivelihoodSource3;
    }

    public String getWomenLivelihoodSource1() {
        return womenLivelihoodSource1;
    }

    public void setWomenLivelihoodSource1(String womenLivelihoodSource1) {
        this.womenLivelihoodSource1 = womenLivelihoodSource1;
    }

    public String getWomenLivelihoodSource2() {
        return womenLivelihoodSource2;
    }

    public void setWomenLivelihoodSource2(String womenLivelihoodSource2) {
        this.womenLivelihoodSource2 = womenLivelihoodSource2;
    }

    public String getWomenLivelihoodSource3() {
        return womenLivelihoodSource3;
    }

    public void setWomenLivelihoodSource3(String womenLivelihoodSource3) {
        this.womenLivelihoodSource3 = womenLivelihoodSource3;
    }

    public String getAccessToLandsMilitary() {
        return accessToLandsMilitary;
    }

    public void setAccessToLandsMilitary(String accessToLandsMilitary) {
        this.accessToLandsMilitary = accessToLandsMilitary;
    }

    public String getAccessToLandsCheckpoints() {
        return accessToLandsCheckpoints;
    }

    public void setAccessToLandsCheckpoints(String accessToLandsCheckpoints) {
        this.accessToLandsCheckpoints = accessToLandsCheckpoints;
    }

    public Integer getFamilyAvgSize() {
        return familyAvgSize;
    }

    public void setFamilyAvgSize(Integer familyAvgSize) {
        this.familyAvgSize = familyAvgSize;
    }

    public BigDecimal getFamilyAvgIncome() {
        return familyAvgIncome;
    }

    public void setFamilyAvgIncome(BigDecimal familyAvgIncome) {
        this.familyAvgIncome = familyAvgIncome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmsEconomicSocioVw that = (PmsEconomicSocioVw) o;

        if (compId != null ? !compId.equals(that.compId) : that.compId != null) return false;
        if (menLivelihoodSource1 != null ? !menLivelihoodSource1.equals(that.menLivelihoodSource1) : that.menLivelihoodSource1 != null)
            return false;
        if (menLivelihoodSource2 != null ? !menLivelihoodSource2.equals(that.menLivelihoodSource2) : that.menLivelihoodSource2 != null)
            return false;
        if (menLivelihoodSource3 != null ? !menLivelihoodSource3.equals(that.menLivelihoodSource3) : that.menLivelihoodSource3 != null)
            return false;
        if (womenLivelihoodSource1 != null ? !womenLivelihoodSource1.equals(that.womenLivelihoodSource1) : that.womenLivelihoodSource1 != null)
            return false;
        if (womenLivelihoodSource2 != null ? !womenLivelihoodSource2.equals(that.womenLivelihoodSource2) : that.womenLivelihoodSource2 != null)
            return false;
        if (womenLivelihoodSource3 != null ? !womenLivelihoodSource3.equals(that.womenLivelihoodSource3) : that.womenLivelihoodSource3 != null)
            return false;
        if (accessToLandsMilitary != null ? !accessToLandsMilitary.equals(that.accessToLandsMilitary) : that.accessToLandsMilitary != null)
            return false;
        if (accessToLandsCheckpoints != null ? !accessToLandsCheckpoints.equals(that.accessToLandsCheckpoints) : that.accessToLandsCheckpoints != null)
            return false;
        if (familyAvgSize != null ? !familyAvgSize.equals(that.familyAvgSize) : that.familyAvgSize != null)
            return false;
        if (familyAvgIncome != null ? !familyAvgIncome.equals(that.familyAvgIncome) : that.familyAvgIncome != null)
            return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        return timeStamp != null ? timeStamp.equals(that.timeStamp) : that.timeStamp == null;
    }

    @Override
    public int hashCode() {
        int result = compId != null ? compId.hashCode() : 0;
        result = 31 * result + (menLivelihoodSource1 != null ? menLivelihoodSource1.hashCode() : 0);
        result = 31 * result + (menLivelihoodSource2 != null ? menLivelihoodSource2.hashCode() : 0);
        result = 31 * result + (menLivelihoodSource3 != null ? menLivelihoodSource3.hashCode() : 0);
        result = 31 * result + (womenLivelihoodSource1 != null ? womenLivelihoodSource1.hashCode() : 0);
        result = 31 * result + (womenLivelihoodSource2 != null ? womenLivelihoodSource2.hashCode() : 0);
        result = 31 * result + (womenLivelihoodSource3 != null ? womenLivelihoodSource3.hashCode() : 0);
        result = 31 * result + (accessToLandsMilitary != null ? accessToLandsMilitary.hashCode() : 0);
        result = 31 * result + (accessToLandsCheckpoints != null ? accessToLandsCheckpoints.hashCode() : 0);
        result = 31 * result + (familyAvgSize != null ? familyAvgSize.hashCode() : 0);
        result = 31 * result + (familyAvgIncome != null ? familyAvgIncome.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (timeStamp != null ? timeStamp.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PmsEconomicSocioVw{" +
                "compId=" + compId +
                ", menLivelihoodSource1='" + menLivelihoodSource1 + '\'' +
                ", menLivelihoodSource2='" + menLivelihoodSource2 + '\'' +
                ", menLivelihoodSource3='" + menLivelihoodSource3 + '\'' +
                ", womenLivelihoodSource1='" + womenLivelihoodSource1 + '\'' +
                ", womenLivelihoodSource2='" + womenLivelihoodSource2 + '\'' +
                ", womenLivelihoodSource3='" + womenLivelihoodSource3 + '\'' +
                ", accessToLandsMilitary='" + accessToLandsMilitary + '\'' +
                ", accessToLandsCheckpoints='" + accessToLandsCheckpoints + '\'' +
                ", familyAvgSize=" + familyAvgSize +
                ", familyAvgIncome=" + familyAvgIncome +
                ", username='" + username + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
