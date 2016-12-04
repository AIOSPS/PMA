package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsWaterSocio implements Serializable {

    /** identifier field */
    private String watId;

    /** persistent field */
    private String watIsconnected;

    /** persistent field */
    private int watNetwork;

    /** persistent field */
    private String watUseWatTanker;

    /** persistent field */
    private String watRainWaterWell;

    /** persistent field */
    private int watNoSprings;

    /** persistent field */
    private java.math.BigDecimal watPriceWater;

    /** persistent field */
    private int watFillingPoint;

    /** persistent field */
    private int watQuantity;

    /** persistent field */
    private java.util.Date watSurveyDate;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private eu.pms.project.database.PmsCommunity pmsCommunity;

    /** full constructor */
    public PmsWaterSocio(String watId, String watIsconnected, int watNetwork, String watUseWatTanker, String watRainWaterWell, int watNoSprings, java.math.BigDecimal watPriceWater, int watFillingPoint, int watQuantity, java.util.Date watSurveyDate, String username, java.util.Date timeStamp, eu.pms.project.database.PmsCommunity pmsCommunity) {
        this.watId = watId;
        this.watIsconnected = watIsconnected;
        this.watNetwork = watNetwork;
        this.watUseWatTanker = watUseWatTanker;
        this.watRainWaterWell = watRainWaterWell;
        this.watNoSprings = watNoSprings;
        this.watPriceWater = watPriceWater;
        this.watFillingPoint = watFillingPoint;
        this.watQuantity = watQuantity;
        this.watSurveyDate = watSurveyDate;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsCommunity = pmsCommunity;
    }

    /** default constructor */
    public PmsWaterSocio() {
    }

    public String getWatId() {
        return this.watId;
    }

    public void setWatId(String watId) {
        this.watId = watId;
    }

    public String getWatIsconnected() {
        return this.watIsconnected;
    }

    public void setWatIsconnected(String watIsconnected) {
        this.watIsconnected = watIsconnected;
    }

    public int getWatNetwork() {
        return this.watNetwork;
    }

    public void setWatNetwork(int watNetwork) {
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

    public int getWatFillingPoint() {
        return this.watFillingPoint;
    }

    public void setWatFillingPoint(int watFillingPoint) {
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

    public eu.pms.project.database.PmsCommunity getPmsCommunity() {
        return this.pmsCommunity;
    }

    public void setPmsCommunity(eu.pms.project.database.PmsCommunity pmsCommunity) {
        this.pmsCommunity = pmsCommunity;
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
