package btc.pma.activity.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by PC on 9/9/2017.
 */
public class PmaActivitySearchForm  extends ActionForm {

    private String rsltNo;
    private String intrNo;
    private String indrNo;


    public PmaActivitySearchForm() {
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

    public String getIndrNo() {
        return indrNo;
    }

    public void setIndrNo(String indrNo) {
        this.indrNo = indrNo;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }


}