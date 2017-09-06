package btc.pma.result.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by PC on 9/2/2017.
 */
public class PmaResultSearchForm extends ActionForm {

    private String rsltNo;
    private String rsltTitle;
    private String sobjNo;

    public PmaResultSearchForm() {
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
