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
    private Integer intEstimatedBudget;
    private String intSource;
    private String intPriority;
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

    public Integer getIntEstimatedBudget() {
        return intEstimatedBudget;
    }

    public void setIntEstimatedBudget(Integer intEstimatedBudget) {
        this.intEstimatedBudget = intEstimatedBudget;
    }

    public String getIntSource() {
        return intSource;
    }

    public void setIntSource(String intSource) {
        this.intSource = intSource;
    }

    public String getIntPriority() {
        return intPriority;
    }

    public void setIntPriority(String intPriority) {
        this.intPriority = intPriority;
    }

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        intId = null;
        secId = null;
        masId = null;
        intDesc = null;
        intEstimatedBudget = null;
        intSource = null;
        intPriority = null;
    }
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
