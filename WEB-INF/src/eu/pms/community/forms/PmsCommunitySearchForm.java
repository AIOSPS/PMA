package eu.pms.community.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

/** @author Hibernate CodeGenerator */
public class PmsCommunitySearchForm extends ActionForm {

    private String communityPcbsCode;
    private String communityOchaCode;
    private String communityName;
    private String communityTopology;
    private String communityGovId;

    /** default constructor */
    public PmsCommunitySearchForm() {
    }

    public String getCommunityPcbsCode() {
        return communityPcbsCode;
    }

    public void setCommunityPcbsCode(String communityPcbsCode) {
        this.communityPcbsCode = communityPcbsCode;
    }

    public String getCommunityOchaCode() {
        return communityOchaCode;
    }

    public void setCommunityOchaCode(String communityOchaCode) {
        this.communityOchaCode = communityOchaCode;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getCommunityTopology() {
        return communityTopology;
    }

    public void setCommunityTopology(String communityTopology) {
        this.communityTopology = communityTopology;
    }

    public String getCommunityGovId() {
        return communityGovId;
    }

    public void setCommunityGovId(String communityGovId) {
        this.communityGovId = communityGovId;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
