package eu.pms.login.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by orayyan on 11/22/2016.
 */
public class LoginForm extends ActionForm
{
    private String password;
    private String userId;


    public LoginForm()
    {
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getUserId()
    {
        return userId;
    }



    public ActionErrors validate(ActionMapping mapping, HttpServletRequest req)
    {
        ActionErrors errors = new ActionErrors();

        if (userId == null || password == null || userId.trim().equals("") || password.trim().equals("") )
        {
                errors.add("userIdError", new ActionMessage("errors.userNotExist"));
        }
        return errors;
    }
}
