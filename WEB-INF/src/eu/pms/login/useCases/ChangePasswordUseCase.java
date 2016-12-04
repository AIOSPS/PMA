package eu.pms.login.useCases;

import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.List;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: Al-Quds Open University</p>
 * @author mureed
 * @version 1.0
 */

public class ChangePasswordUseCase implements eu.pms.common.useCase.ComponentUseCase
{
  public Collection execute(Collection input, HttpServletRequest request) throws HibernateException
  {
    List retList = null;
    try
    {
//      UpdatePasswordComponent cmp = new UpdatePasswordComponent();
//
//      retList = cmp.viewUserLoginData(input);
    }
    catch (Exception e)
    {
      e.printStackTrace();
      System.out.println("Error in the update password use case" + e);
    }
    return retList;
  }
}

