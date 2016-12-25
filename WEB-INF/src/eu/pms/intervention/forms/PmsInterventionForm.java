package eu.pms.intervention.forms;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** @author Hibernate CodeGenerator */
public class PmsInterventionForm extends ActionForm {
    private String intId;
    private String secId;
    private String masId;
    private String intDesc;
    private int intEstimatedBudget;
    private String intSource;

    /** default constructor */
    public PmsInterventionForm() {
    }

    public String getIntId() {
        return intId;
    }

    public void setIntId(String intId) {
        this.intId = intId;
    }

    public String getSecId() {
        return secId;
    }

    public void setSecId(String secId) {
        this.secId = secId;
    }

    public String getMasId() {
        return masId;
    }

    public void setMasId(String masId) {
        this.masId = masId;
    }

    public String getIntDesc() {
        return intDesc;
    }

    public void setIntDesc(String intDesc) {
        this.intDesc = intDesc;
    }

    public int getIntEstimatedBudget() {
        return intEstimatedBudget;
    }

    public void setIntEstimatedBudget(int intEstimatedBudget) {
        this.intEstimatedBudget = intEstimatedBudget;
    }

    public String getIntSource() {
        return intSource;
    }

    public void setIntSource(String intSource) {
        this.intSource = intSource;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
