package btc.pma.activity.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by PC on 9/11/2017.
 */
public class PmaActivityInfoForm   extends ActionForm {

    private String actvNo;
    private String intrNo;
    private String actvLevel;
    private String actvImplementingPartner;
    private String actvTitle;
    private String actvSummaryDescription;
    private String actvStatus;
    private String actvProposedStartDate;
    private String actvProposedEndDate;
    private String actvBudget;
    private String actvActualStartDate;
    private String actvActualEndDate;
    private String actvTotalCost;
    private String actvResponsibility;
    private String actvLessonsLearned;
    private String actChallenges;
    private String indrNo;
    private String rsltNo;
    private String clasCode;


    public PmaActivityInfoForm() {
    }

    public String getActvNo() {
        return actvNo;
    }

    public void setActvNo(String actvNo) {
        this.actvNo = actvNo;
    }

    public String getIntrNo() {
        return intrNo;
    }

    public void setIntrNo(String intrNo) {
        this.intrNo = intrNo;
    }

    public String getActvLevel() {
        return actvLevel;
    }

    public void setActvLevel(String actvLevel) {
        this.actvLevel = actvLevel;
    }

    public String getActvImplementingPartner() {
        return actvImplementingPartner;
    }

    public void setActvImplementingPartner(String actvImplementingPartner) {
        this.actvImplementingPartner = actvImplementingPartner;
    }

    public String getActvTitle() {
        return actvTitle;
    }

    public void setActvTitle(String actvTitle) {
        this.actvTitle = actvTitle;
    }

    public String getActvSummaryDescription() {
        return actvSummaryDescription;
    }

    public void setActvSummaryDescription(String actvSummaryDescription) {
        this.actvSummaryDescription = actvSummaryDescription;
    }

    public String getActvStatus() {
        return actvStatus;
    }

    public void setActvStatus(String actvStatus) {
        this.actvStatus = actvStatus;
    }

    public String getActvProposedStartDate() {
        return actvProposedStartDate;
    }

    public void setActvProposedStartDate(String actvProposedStartDate) {
        this.actvProposedStartDate = actvProposedStartDate;
    }

    public String getActvProposedEndDate() {
        return actvProposedEndDate;
    }

    public void setActvProposedEndDate(String actvProposedEndDate) {
        this.actvProposedEndDate = actvProposedEndDate;
    }

    public String getActvBudget() {
        return actvBudget;
    }

    public void setActvBudget(String actvBudget) {
        this.actvBudget = actvBudget;
    }

    public String getActvActualStartDate() {
        return actvActualStartDate;
    }

    public void setActvActualStartDate(String actvActualStartDate) {
        this.actvActualStartDate = actvActualStartDate;
    }

    public String getActvActualEndDate() {
        return actvActualEndDate;
    }

    public void setActvActualEndDate(String actvActualEndDate) {
        this.actvActualEndDate = actvActualEndDate;
    }

    public String getActvTotalCost() {
        return actvTotalCost;
    }

    public void setActvTotalCost(String actvTotalCost) {
        this.actvTotalCost = actvTotalCost;
    }

    public String getActvResponsibility() {
        return actvResponsibility;
    }

    public void setActvResponsibility(String actvResponsibility) {
        this.actvResponsibility = actvResponsibility;
    }

    public String getActvLessonsLearned() {
        return actvLessonsLearned;
    }

    public void setActvLessonsLearned(String actvLessonsLearned) {
        this.actvLessonsLearned = actvLessonsLearned;
    }

    public String getActChallenges() {
        return actChallenges;
    }

    public void setActChallenges(String actChallenges) {
        this.actChallenges = actChallenges;
    }

    public String getIndrNo() {
        return indrNo;
    }

    public void setIndrNo(String indrNo) {
        this.indrNo = indrNo;
    }

    public String getRsltNo() {
        return rsltNo;
    }

    public void setRsltNo(String rsltNo) {
        this.rsltNo = rsltNo;
    }

    public String getClasCode() {
        return clasCode;
    }

    public void setClasCode(String clasCode) {
        this.clasCode = clasCode;
    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        actvNo = null;
        intrNo = null;
        actvLevel = null;
        actvImplementingPartner = null;
        actvTitle = null;
        actvSummaryDescription = null;
        actvStatus = null;
        actvProposedStartDate = null;
        actvProposedEndDate = null;
        actvBudget = null;
        actvActualStartDate = null;
        actvActualEndDate = null;
        actvTotalCost = null;
        actvResponsibility = null;
        actvLessonsLearned = null;
        actChallenges = null;
        indrNo = null;
        rsltNo = null;
        clasCode = null;
    }
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }


}
