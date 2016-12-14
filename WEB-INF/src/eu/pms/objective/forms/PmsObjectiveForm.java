package eu.pms.objective.forms;

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
public class PmsObjectiveForm extends ActionForm {
    private String objId;
    private String strDocId;
    private String objDesc;
    private String objLongDesc;
    private String objDefineDate;
    private String objStatus;
    private String objCloseDate;
    private String ojbUserId;

    /** default constructor */
    public PmsObjectiveForm() {
    }

    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public String getStrDocId() {
        return strDocId;
    }

    public void setStrDocId(String strDocId) {
        this.strDocId = strDocId;
    }

    public String getObjDesc() {
        return objDesc;
    }

    public void setObjDesc(String objDesc) {
        this.objDesc = objDesc;
    }

    public String getObjLongDesc() {
        return objLongDesc;
    }

    public void setObjLongDesc(String objLongDesc) {
        this.objLongDesc = objLongDesc;
    }

    public String getObjDefineDate() {
        return objDefineDate;
    }

    public void setObjDefineDate(String objDefineDate) {
        this.objDefineDate = objDefineDate;
    }

    public String getObjStatus() {
        return objStatus;
    }

    public void setObjStatus(String objStatus) {
        this.objStatus = objStatus;
    }

    public String getObjCloseDate() {
        return objCloseDate;
    }

    public void setObjCloseDate(String objCloseDate) {
        this.objCloseDate = objCloseDate;
    }

    public String getOjbUserId() {
        return ojbUserId;
    }

    public void setOjbUserId(String ojbUserId) {
        this.ojbUserId = ojbUserId;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
