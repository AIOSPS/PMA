package eu.pms.waterSocio.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

/** @author Hibernate CodeGenerator */
public class PmsWaterSocioSearchForm extends ActionForm {
    private String waterUseWatTanker;
    private String waterRainWaterWell;
    private String comId;
    private String govId;
    /** default constructor */
    public PmsWaterSocioSearchForm() {
    }

    public String getWaterUseWatTanker() {
        return waterUseWatTanker;
    }

    public void setWaterUseWatTanker(String waterUseWatTanker) {
        this.waterUseWatTanker = waterUseWatTanker;
    }

    public String getWaterRainWaterWell() {
        return waterRainWaterWell;
    }

    public void setWaterRainWaterWell(String waterRainWaterWell) {
        this.waterRainWaterWell = waterRainWaterWell;
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    public String getGovId() {
        return govId;
    }

    public void setGovId(String govId) {
        this.govId = govId;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
