package eu.pms.lookup.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;

public class LookupForm extends ActionForm {
    private String lockupId;
    private String lockupDesc;
    private String lockupType;

    public String getLockupId() {
        return lockupId;
    }

    public void setLockupId(String lockupId) {
        this.lockupId = lockupId;
    }

    public String getLockupDesc() {
        return lockupDesc;
    }

    public void setLockupDesc(String lockupDesc) {
        this.lockupDesc = lockupDesc;
    }

    public String getLockupType() {
        return lockupType;
    }

    public void setLockupType(String lockupType) {
        this.lockupType = lockupType;
    }

    public void reset() {
        this.lockupId = null;
        this.lockupDesc = null;
        this.lockupType = null;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();

        if (lockupDesc == null || lockupDesc.trim().equals(""))
            errors.add("lockupError", new ActionMessage("errors.lockup", "Error: Lockup can not be empty."));

        return errors;
    }
}
