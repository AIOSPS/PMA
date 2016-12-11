package eu.pms.benificiary.forms;

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
public class PmsBenificiaryForm extends ActionForm {
    private String benId;
    private String btpId;
    private String benDesc;
    private int benTotal;

    /** default constructor */
    public PmsBenificiaryForm() {
    }

    public String getBenId() {
        return benId;
    }

    public void setBenId(String benId) {
        this.benId = benId;
    }

    public String getBtpId() {
        return btpId;
    }

    public void setBtpId(String btpId) {
        this.btpId = btpId;
    }

    public String getBenDesc() {
        return benDesc;
    }

    public void setBenDesc(String benDesc) {
        this.benDesc = benDesc;
    }

    public int getBenTotal() {
        return benTotal;
    }

    public void setBenTotal(int benTotal) {
        this.benTotal = benTotal;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
