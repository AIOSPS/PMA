package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsWaterSocio implements Serializable {

    private String watId;
    private String comId;
    private String watIsconnected;
    private int watNetwork;
    private String watUseWatTanker;
    private String watRainWaterWell;
    private int watNoSprings;
    private java.math.BigDecimal watPriceWater;
    private int watFillingPoint;
    private int watQuantity;
    private java.util.Date watSurveyDate;
    private String username;
    private java.util.Date timeStamp;
    /** default constructor */
    public PmsWaterSocio() {
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
