package eu.pms.login.useCases;

import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.List;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Al-Quds Open University</p>
 * @author Mustafa
 * @version 1.0
 */

public class ResendPasswordUseCase implements eu.pms.common.useCase.ComponentUseCase
{
  public Collection execute(Collection input, HttpServletRequest request) throws HibernateException
  {
    List retList = null;
    try
    {
//      AccountRegistrationComponent cmp = new AccountRegistrationComponent();
//
//      retList = cmp.registUser(input, cmp.RESENDPASSWORD_PROCESS);
    }
    catch (Exception e)
    {
      e.printStackTrace();
      System.out.println("Error in account registration use case" + e);
    }
    return retList;
  }
}
