package btc.pma.result.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by PC on 9/6/2017.
 */
public class PmaResultForm extends ActionForm {

    private String rsltNo;
    private String rsltTitle;
    private String rsltDefineDate;
    private String rsltCloseDate;
    private String rsltStatus;
    private String rsltLongDescription;
    private String sobjNo;

    public PmaResultForm() {
    }

    public String getRsltNo() {
        return rsltNo;
    }

    public void setRsltNo(String rsltNo) {
        this.rsltNo = rsltNo;
    }

    public String getRsltTitle() {
        return rsltTitle;
    }

    public void setRsltTitle(String rsltTitle) {
        this.rsltTitle = rsltTitle;
    }

    public String getRsltDefineDate() {
        return rsltDefineDate;
    }

    public void setRsltDefineDate(String rsltDefineDate) {
        this.rsltDefineDate = rsltDefineDate;
    }

    public String getRsltCloseDate() {
        return rsltCloseDate;
    }

    public void setRsltCloseDate(String rsltCloseDate) {
        this.rsltCloseDate = rsltCloseDate;
    }

    public String getRsltStatus() {
        return rsltStatus;
    }

    public void setRsltStatus(String rsltStatus) {
        this.rsltStatus = rsltStatus;
    }

    public String getRsltLongDescription() {
        return rsltLongDescription;
    }

    public void setRsltLongDescription(String rsltLongDescription) {
        this.rsltLongDescription = rsltLongDescription;
    }

    public String getSobjNo() {
        return sobjNo;
    }

    public void setSobjNo(String sobjNo) {
        this.sobjNo = sobjNo;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }


}

