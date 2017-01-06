package eu.pms.masterPlan.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

/** @author Hibernate CodeGenerator */
public class PmsMasterPlanSearchForm extends ActionForm {
    private String masterPlanNo;
    private String masterPlanName;
    private String communityId;
    private String status;
    /** default constructor */
    public PmsMasterPlanSearchForm() {
    }

    public String getMasterPlanNo() {
        return masterPlanNo;
    }

    public void setMasterPlanNo(String masterPlanNo) {
        this.masterPlanNo = masterPlanNo;
    }

    public String getMasterPlanName() {
        return masterPlanName;
    }

    public void setMasterPlanName(String masterPlanName) {
        this.masterPlanName = masterPlanName;
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
