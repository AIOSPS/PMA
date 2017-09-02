package btc.pma.specObjective.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by PC on 8/29/2017.
 */
public class PmaSpecObjectiveSearchForm extends ActionForm {

    private String intrNo;
    private String sobjNo;
    private String sobjDescription;

    public PmaSpecObjectiveSearchForm() {
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

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}

