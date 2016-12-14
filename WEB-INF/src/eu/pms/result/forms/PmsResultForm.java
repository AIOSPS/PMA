package eu.pms.result.forms;

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
public class PmsResultForm extends ActionForm {
    private String resId;
    private String objId;
    private String resDesc;
    private String resLongDesc;
    private String resDefineDate;
    private String resStatus;
    private String resCloseDate;

    /** default constructor */
    public PmsResultForm() {
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

    public String getResDesc() {
        return resDesc;
    }

    public void setResDesc(String resDesc) {
        this.resDesc = resDesc;
    }

    public String getResLongDesc() {
        return resLongDesc;
    }

    public void setResLongDesc(String resLongDesc) {
        this.resLongDesc = resLongDesc;
    }

    public String getResDefineDate() {
        return resDefineDate;
    }

    public void setResDefineDate(String resDefineDate) {
        this.resDefineDate = resDefineDate;
    }

    public String getResStatus() {
        return resStatus;
    }

    public void setResStatus(String resStatus) {
        this.resStatus = resStatus;
    }

    public String getResCloseDate() {
        return resCloseDate;
    }

    public void setResCloseDate(String resCloseDate) {
        this.resCloseDate = resCloseDate;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
