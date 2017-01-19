package eu.pms.project.database;

import eu.pms.common.tools.DateTool;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Created by orayyan on 1/5/2017.
 */
public class PmsWaterSocioVw {

    private String watId;
    private String comId;
    private String watIsconnected;
    private String watNetwork;
    private String watUseWatTanker;
    private String watRainWaterWell;
    private int watNoSprings;
    private java.math.BigDecimal watPriceWater;
    private String watFillingPoint;
    private int watQuantity;
    private java.util.Date watSurveyDate;
    private String watSurveyDateStr;
    private String username;
    private java.util.Date timeStamp;
    private String comName;
    private String govId;
    private String govDesc;
    /** default constructor */
    public PmsWaterSocioVw() {
    }

    public String getWatId() {
        return this.watId;
    }

    public void setWatId(String watId) {
        this.watId = watId;
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    public String getWatIsconnected() {
        return this.watIsconnected;
    }

    public void setWatIsconnected(String watIsconnected) {
        this.watIsconnected = watIsconnected;
    }

    public String getWatNetwork() {
        return this.watNetwork;
    }

    public void setWatNetwork(String watNetwork) {
        this.watNetwork = watNetwork;
    }

    public String getWatUseWatTanker() {
        return this.watUseWatTanker;
    }

    public void setWatUseWatTanker(String watUseWatTanker) {
        this.watUseWatTanker = watUseWatTanker;
    }

    public String getWatRainWaterWell() {
        return this.watRainWaterWell;
    }

    public void setWatRainWaterWell(String watRainWaterWell) {
        this.watRainWaterWell = watRainWaterWell;
    }

    public int getWatNoSprings() {
        return this.watNoSprings;
    }

    public void setWatNoSprings(int watNoSprings) {
        this.watNoSprings = watNoSprings;
    }

    public java.math.BigDecimal getWatPriceWater() {
        return this.watPriceWater;
    }

    public void setWatPriceWater(java.math.BigDecimal watPriceWater) {
        this.watPriceWater = watPriceWater;
    }

    public String getWatFillingPoint() {
        return this.watFillingPoint;
    }

    public void setWatFillingPoint(String watFillingPoint) {
        this.watFillingPoint = watFillingPoint;
    }

    public int getWatQuantity() {
        return this.watQuantity;
    }

    public void setWatQuantity(int watQuantity) {
        this.watQuantity = watQuantity;
    }

    public java.util.Date getWatSurveyDate() {
        return this.watSurveyDate;
    }

    public void setWatSurveyDate(java.util.Date watSurveyDate) {
        this.watSurveyDate = watSurveyDate;
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

    public String getWatSurveyDateStr() {
        return watSurveyDate!=null? DateTool.decorateDate(watSurveyDate, DateTool.DD_MM_YYYY):"";
    }

    public void setWatSurveyDateStr(String watSurveyDateStr) {
        this.watSurveyDateStr = watSurveyDateStr;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getGovId() {
        return govId;
    }

    public void setGovId(String govId) {
        this.govId = govId;
    }

    public String getGovDesc() {
        return govDesc;
    }

    public void setGovDesc(String govDesc) {
        this.govDesc = govDesc;
    }

    public String toString() {
        return new ToStringBuilder(this)
                .append("watId", getWatId())
                .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsWaterSocio) ) return false;
        PmsWaterSocio castOther = (PmsWaterSocio) other;
        return new EqualsBuilder()
                .append(this.getWatId(), castOther.getWatId())
                .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
                .append(getWatId())
                .toHashCode();
    }

}
