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

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
