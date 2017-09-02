package btc.pma.specObjective.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by PC on 8/30/2017.
 */
public class PmaSpecObjectiveForm extends ActionForm {

    private String intrNo;
    private String sobjNo;
    private String sobjDescription;
    private String sobjDefineDate;
    private String sobjAdaptationDate;
    private String sobjRelatedDocuments;

    public PmaSpecObjectiveForm() {
    }

    public String getIntrNo() {
        return intrNo;
    }

    public void setIntrNo(String intrNo) {
        this.intrNo = intrNo;
    }

    public String getSobjNo() {
        return sobjNo;
    }

    public void setSobjNo(String sobjNo) {
        this.sobjNo = sobjNo;
    }

    public String getSobjDescription() {
        return sobjDescription;
    }

    public void setSobjDescription(String sobjDescription) {
        this.sobjDescription = sobjDescription;
    }

    public String getSobjDefineDate() {
        return sobjDefineDate;
    }

    public void setSobjDefineDate(String sobjDefineDate) {
        this.sobjDefineDate = sobjDefineDate;
    }

    public String getSobjAdaptationDate() {
        return sobjAdaptationDate;
    }

    public void setSobjAdaptationDate(String sobjAdaptationDate) {
        this.sobjAdaptationDate = sobjAdaptationDate;
    }

    public String getSobjRelatedDocuments() {
        return sobjRelatedDocuments;
    }

    public void setSobjRelatedDocuments(String sobjRelatedDocuments) {
        this.sobjRelatedDocuments = sobjRelatedDocuments;
    }

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        intrNo = null;
        sobjNo = null;
        sobjDescription = null;
        sobjDefineDate = null;
        sobjAdaptationDate = null;
        sobjRelatedDocuments = null;
    }
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}


