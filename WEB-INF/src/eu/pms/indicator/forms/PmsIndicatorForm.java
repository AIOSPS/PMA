package eu.pms.indicator.forms;

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
public class PmsIndicatorForm extends ActionForm {
    private String indId;
    private String resId;
    private String objId;
    private String indTitle;
    private String indDate;
    private String indLongDesc;
    private Integer indBaseline;
    private Integer indFrequency;
    private String indCollectionMethod;
    private String indStatisticalMethod;

    /** default constructor */
    public PmsIndicatorForm() {
    }

    public String getIndId() {
        return indId;
    }

    public void setIndId(String indId) {
        this.indId = indId;
    }

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }

    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public String getIndTitle() {
        return indTitle;
    }

    public void setIndTitle(String indTitle) {
        this.indTitle = indTitle;
    }

    public String getIndDate() {
        return indDate;
    }

    public void setIndDate(String indDate) {
        this.indDate = indDate;
    }

    public String getIndLongDesc() {
        return indLongDesc;
    }

    public void setIndLongDesc(String indLongDesc) {
        this.indLongDesc = indLongDesc;
    }

    public Integer getIndBaseline() {
        return indBaseline;
    }

    public void setIndBaseline(Integer indBaseline) {
        this.indBaseline = indBaseline;
    }

    public Integer getIndFrequency() {
        return indFrequency;
    }

    public void setIndFrequency(Integer indFrequency) {
        this.indFrequency = indFrequency;
    }

    public String getIndCollectionMethod() {
        return indCollectionMethod;
    }

    public void setIndCollectionMethod(String indCollectionMethod) {
        this.indCollectionMethod = indCollectionMethod;
    }

    public String getIndStatisticalMethod() {
        return indStatisticalMethod;
    }

    public void setIndStatisticalMethod(String indStatisticalMethod) {
        this.indStatisticalMethod = indStatisticalMethod;
    }

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        indId = null;
        resId = null;
        objId = null;
        indTitle = null;
        indDate = null;
        indLongDesc = null;
        indBaseline = null;
        indFrequency = null;
        indCollectionMethod = null;
        indStatisticalMethod = null;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
