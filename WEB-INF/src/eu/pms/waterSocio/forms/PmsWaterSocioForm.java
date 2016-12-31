package eu.pms.waterSocio.forms;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** @author Hibernate CodeGenerator */
public class PmsWaterSocioForm  extends ActionForm {
    private String watId;
    private String comId;
    private String watIsconnected;
    private Integer watNetwork;
    private String watUseWatTanker;
    private String watRainWaterWell;
    private Integer watNoSprings;
    private java.math.BigDecimal watPriceWater;
    private Integer watFillingPoint;
    private Integer watQuantity;
    private String watSurveyDate;



    /** default constructor */
    public PmsWaterSocioForm() {
    }

    public String getWatId() {
        return watId;
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
        return watIsconnected;
    }

    public void setWatIsconnected(String watIsconnected) {
        this.watIsconnected = watIsconnected;
    }

    public Integer getWatNetwork() {
        return watNetwork;
    }

    public void setWatNetwork(Integer watNetwork) {
        this.watNetwork = watNetwork;
    }

    public String getWatUseWatTanker() {
        return watUseWatTanker;
    }

    public void setWatUseWatTanker(String watUseWatTanker) {
        this.watUseWatTanker = watUseWatTanker;
    }

    public String getWatRainWaterWell() {
        return watRainWaterWell;
    }

    public void setWatRainWaterWell(String watRainWaterWell) {
        this.watRainWaterWell = watRainWaterWell;
    }

    public Integer getWatNoSprings() {
        return watNoSprings;
    }

    public void setWatNoSprings(Integer watNoSprings) {
        this.watNoSprings = watNoSprings;
    }

    public BigDecimal getWatPriceWater() {
        return watPriceWater;
    }

    public void setWatPriceWater(BigDecimal watPriceWater) {
        this.watPriceWater = watPriceWater;
    }

    public Integer getWatFillingPoint() {
        return watFillingPoint;
    }

    public void setWatFillingPoint(Integer watFillingPoint) {
        this.watFillingPoint = watFillingPoint;
    }

    public Integer getWatQuantity() {
        return watQuantity;
    }

    public void setWatQuantity(Integer watQuantity) {
        this.watQuantity = watQuantity;
    }

    public String getWatSurveyDate() {
        return watSurveyDate;
    }

    public void setWatSurveyDate(String watSurveyDate) {
        this.watSurveyDate = watSurveyDate;
    }

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        watId = null;
        comId = null;
        watIsconnected = null;
        watNetwork = null;
        watUseWatTanker = null;
        watRainWaterWell = null;
        watNoSprings = null;
        watPriceWater = null;
        watFillingPoint = null;
        watQuantity = null;
        watSurveyDate = null;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
