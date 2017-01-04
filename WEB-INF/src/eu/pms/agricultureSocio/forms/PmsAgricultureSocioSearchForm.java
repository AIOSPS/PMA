package eu.pms.agricultureSocio.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

/** @author Hibernate CodeGenerator */
public class PmsAgricultureSocioSearchForm extends ActionForm {
    private String agricultureArea;
    private String agricultureNoCowYear;
    private String comId;
    private String govId;
    /** default constructor */
    public PmsAgricultureSocioSearchForm() {
    }

    public String getAgricultureArea() {
        return agricultureArea;
    }

    public void setAgricultureArea(String agricultureArea) {
        this.agricultureArea = agricultureArea;
    }

    public String getAgricultureNoCowYear() {
        return agricultureNoCowYear;
    }

    public void setAgricultureNoCowYear(String agricultureNoCowYear) {
        this.agricultureNoCowYear = agricultureNoCowYear;
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
