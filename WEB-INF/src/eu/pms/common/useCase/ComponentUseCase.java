/*
 * Created on Nov 13, 2003
 *
 * struts-hibernate
 *
 */
package eu.pms.common.useCase;

import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

/**
 * @author TareqDoufish
 *
 */

public interface ComponentUseCase
{
  public Collection execute(Collection input, HttpServletRequest request) throws HibernateException;
}



