package btc.pma.indicator.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by PC on 9/8/2017.
 */
public class PmaIndicatorForm extends ActionForm {

    private String indrNo;
    private String indrDefinition;
    private String indrBaseline;
    private String indrDefineDate;
    private String indrClosedDate;
    private String indrStatus;
    private String indrTargetPlaned;
    private String indrDataCollMethod;
    private String indrTool;
    private String indrFrequency;
    private String indrResponsibilities;
    private String indrTargetAcheived;
    private String indrType;
    private String rsltNo;
    private String intrNo;

    public PmaIndicatorForm() {
    }

    public String getIndrNo() {
        return indrNo;
    }

    public void setIndrNo(String indrNo) {
        this.indrNo = indrNo;
    }

    public String getIndrDefinition() {
        return indrDefinition;
    }

    public void setIndrDefinition(String indrDefinition) {
        this.indrDefinition = indrDefinition;
    }

    public String getIndrBaseline() {
        return indrBaseline;
    }

    public void setIndrBaseline(String indrBaseline) {
        this.indrBaseline = indrBaseline;
    }

    public String getIndrDefineDate() {
        return indrDefineDate;
    }

    public void setIndrDefineDate(String indrDefineDate) {
        this.indrDefineDate = indrDefineDate;
    }

    public String getIndrClosedDate() {
        return indrClosedDate;
    }

    public void setIndrClosedDate(String indrClosedDate) {
        this.indrClosedDate = indrClosedDate;
    }

    public String getIndrStatus() {
        return indrStatus;
    }

    public void setIndrStatus(String indrStatus) {
        this.indrStatus = indrStatus;
    }

    public String getIndrTargetPlaned() {
        return indrTargetPlaned;
    }

    public void setIndrTargetPlaned(String indrTargetPlaned) {
        this.indrTargetPlaned = indrTargetPlaned;
    }

    public String getIndrDataCollMethod() {
        return indrDataCollMethod;
    }

    public void setIndrDataCollMethod(String indrDataCollMethod) {
        this.indrDataCollMethod = indrDataCollMethod;
    }

    public String getIndrTool() {
        return indrTool;
    }

    public void setIndrTool(String indrTool) {
        this.indrTool = indrTool;
    }

    public String getIndrFrequency() {
        return indrFrequency;
    }

    public void setIndrFrequency(String indrFrequency) {
        this.indrFrequency = indrFrequency;
    }

    public String getIndrResponsibilities() {
        return indrResponsibilities;
    }

    public void setIndrResponsibilities(String indrResponsibilities) {
        this.indrResponsibilities = indrResponsibilities;
    }

    public String getIndrTargetAcheived() {
        return indrTargetAcheived;
    }

    public void setIndrTargetAcheived(String indrTargetAcheived) {
        this.indrTargetAcheived = indrTargetAcheived;
    }

    public String getIndrType() {
        return indrType;
    }

    public void setIndrType(String indrType) {
        this.indrType = indrType;
    }

    public String getRsltNo() {
        return rsltNo;
    }

    public void setRsltNo(String rsltNo) {
        this.rsltNo = rsltNo;
    }

    public String getIntrNo() {
        return intrNo;
    }

    public void setIntrNo(String intrNo) {
        this.intrNo = intrNo;
    }

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        indrNo = null;
        indrDefinition = null;
        indrBaseline = null;
        indrDefineDate = null;
        indrClosedDate = null;
        indrStatus = null;
        indrTargetPlaned = null;
        indrDataCollMethod = null;
        indrTool = null;
        indrFrequency = null;
        indrResponsibilities = null;
        indrTargetAcheived = null;
        indrType = null;
        rsltNo = null;
        intrNo = null;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }


}
