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

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
