package btc.pma.programme.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by PC on 8/27/2017.
 */
public class PmaProgrammeSearchForm extends ActionForm {

    private String intrNo;
    private String intrTitle;
    private String intrDescription;

    public PmaProgrammeSearchForm() {
    }

    public String getIntrNo() {
        return intrNo;
    }

    public void setIntrNo(String intrNo) {
        this.intrNo = intrNo;
    }

    public String getIntrTitle() {
        return intrTitle;
    }

    public void setIntrTitle(String intrTitle) {
        this.intrTitle = intrTitle;
    }

    public String getIntrDescription() {
        return intrDescription;
    }

    public void setIntrDescription(String intrDescription) {
        this.intrDescription = intrDescription;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
