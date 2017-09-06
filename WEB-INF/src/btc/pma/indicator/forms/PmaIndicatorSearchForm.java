package btc.pma.indicator.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by PC on 9/6/2017.
 */
public class PmaIndicatorSearchForm extends ActionForm {

    private String rsltNo;
    private String intrNo;

    public PmaIndicatorSearchForm() {
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

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }


}
