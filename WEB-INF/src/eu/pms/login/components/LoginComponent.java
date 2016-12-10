package eu.pms.login.components;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Al-Quds Open University</p>
 * @author Mustafa Al-Tamim
 * @version 1.0
 */

import eu.pms.common.component.DgfComponent;
import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.exceptions.ComponentException;

import java.util.List;



public class LoginComponent extends  DgfComponent
{

    public LoginComponent()
    {
    }

    public List getList(Object[] parameters)
    {
        List retList = null;
        try
        {
            retList = super.getList("Portal.userLogin", parameters);
        }
        catch (eu.pms.common.exceptions.ComponentException e)
        {
            System.out.println("Error in component " + e);
        }
        return retList;
    }

    public List checkActionPermission(Integer roleId, String actionName)throws ComponentException {

        List result = getList("lib.checkPermission", new Object[]{actionName, roleId});

        return result;
    }

}