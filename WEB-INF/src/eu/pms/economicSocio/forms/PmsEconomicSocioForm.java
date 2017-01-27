package eu.pms.economicSocio.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by orayyan on 1/27/2017.
 */
public class PmsEconomicSocioForm extends ActionForm {
    private String ecoId;
    private String comId;
    private String menLivelihoodSource1;
    private String menLivelihoodSource2;
    private String menLivelihoodSource3;
    private String womenLivelihoodSource1;
    private String womenLivelihoodSource2;
    private String womenLivelihoodSource3;
    private String accessToLandsMilitary;
    private String accessToLandsCheckpoints;
    private java.lang.Integer familyAvgSize;
    private java.math.BigDecimal familyAvgIncome;

    public PmsEconomicSocioForm() {
    }

    public String getEcoId() {
        return ecoId;
    }

    public void setEcoId(String ecoId) {
        this.ecoId = ecoId;
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
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


    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        ecoId = null;
        comId = null;
        menLivelihoodSource1 = null;
        menLivelihoodSource2 = null;
        menLivelihoodSource3 = null;
        womenLivelihoodSource1 = null;
        womenLivelihoodSource2 = null;
        womenLivelihoodSource3 = null;
        accessToLandsMilitary = null;
        accessToLandsCheckpoints = null;
        familyAvgSize = null;
        familyAvgIncome = null;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }
}
