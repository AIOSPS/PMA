package eu.pms.agricultureSocio.forms;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.Date;

/** @author Hibernate CodeGenerator */
public class PmsAgricultureSocioForm  extends ActionForm {
    private String agrId;
    private String comId;
    private Integer agrArea;
    private Integer agrNoCowYear;
    private Integer agrNoSheepYear;
    private Integer agrCostWaterTank;
    private Integer agrHerdingArea;
    private Integer agrMilitaryArea;
    private Integer agrBypassRoadArea;
    private String agrSurveyDate;



    /** default constructor */
    public PmsAgricultureSocioForm() {
    }

    public String getAgrId() {
        return agrId;
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

    public Integer getAgrArea() {
        return agrArea;
    }

    public void setAgrArea(Integer agrArea) {
        this.agrArea = agrArea;
    }

    public Integer getAgrNoCowYear() {
        return agrNoCowYear;
    }

    public void setAgrNoCowYear(Integer agrNoCowYear) {
        this.agrNoCowYear = agrNoCowYear;
    }

    public Integer getAgrNoSheepYear() {
        return agrNoSheepYear;
    }

    public void setAgrNoSheepYear(Integer agrNoSheepYear) {
        this.agrNoSheepYear = agrNoSheepYear;
    }

    public Integer getAgrCostWaterTank() {
        return agrCostWaterTank;
    }

    public void setAgrCostWaterTank(Integer agrCostWaterTank) {
        this.agrCostWaterTank = agrCostWaterTank;
    }

    public Integer getAgrHerdingArea() {
        return agrHerdingArea;
    }

    public void setAgrHerdingArea(Integer agrHerdingArea) {
        this.agrHerdingArea = agrHerdingArea;
    }

    public Integer getAgrMilitaryArea() {
        return agrMilitaryArea;
    }

    public void setAgrMilitaryArea(Integer agrMilitaryArea) {
        this.agrMilitaryArea = agrMilitaryArea;
    }

    public Integer getAgrBypassRoadArea() {
        return agrBypassRoadArea;
    }

    public void setAgrBypassRoadArea(Integer agrBypassRoadArea) {
        this.agrBypassRoadArea = agrBypassRoadArea;
    }

    public String getAgrSurveyDate() {
        return agrSurveyDate;
    }

    public void setAgrSurveyDate(String agrSurveyDate) {
        this.agrSurveyDate = agrSurveyDate;
    }

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        agrId = null;
        comId = null;
        agrArea = null;
        agrNoCowYear = null;
        agrNoSheepYear = null;
        agrCostWaterTank = null;
        agrHerdingArea = null;
        agrMilitaryArea = null;
        agrBypassRoadArea = null;
        agrSurveyDate = null;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
