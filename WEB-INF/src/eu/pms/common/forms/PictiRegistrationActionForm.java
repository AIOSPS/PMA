package eu.pms.common.forms;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: Al-Quds Open University</p>
 * @author Mustafa Al-Tamim
 * @version 1.0
 */

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PictiRegistrationActionForm extends ActionForm
{
    private String email;
    private String phone;

    public PictiRegistrationActionForm()
    {
    }
    
    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest req)
    {
        ActionErrors errors = new ActionErrors();

        if((email == null || email.equals("")) && (phone == null || phone.equals("")))
           errors.add("userIdError",new ActionMessage("actionAdmin.errors.addAction","the message"));

        if(email != null && ! email.equals(""))
        {
            Pattern emailPattern = Pattern.compile("^[a-zA-Z][\\w\\.-]*[a-zA-Z0-9]@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]$");
            Matcher email1Match = emailPattern.matcher(email);

            if (!email1Match.matches())
              errors.add("userIdError",new ActionMessage("errors.accountRegistration.badEmailFormat"));
        }
        return errors;
    }
}
