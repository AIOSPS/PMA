package eu.pms.activity.forms;

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
public class PmsActivityForm extends ActionForm {
    private String actId;
    private String intId;
    private String secId;
    private String actDesc;
    private String actUnit;
    private int actUnitQty;
    private int actEstimatedBudget;

    /** default constructor */
    public PmsActivityForm() {
    }

    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId;
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

    public String getActDesc() {
        return actDesc;
    }

    public void setActDesc(String actDesc) {
        this.actDesc = actDesc;
    }

    public String getActUnit() {
        return actUnit;
    }

    public void setActUnit(String actUnit) {
        this.actUnit = actUnit;
    }

    public int getActUnitQty() {
        return actUnitQty;
    }

    public void setActUnitQty(int actUnitQty) {
        this.actUnitQty = actUnitQty;
    }

    public int getActEstimatedBudget() {
        return actEstimatedBudget;
    }

    public void setActEstimatedBudget(int actEstimatedBudget) {
        this.actEstimatedBudget = actEstimatedBudget;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
