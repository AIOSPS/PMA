package eu.pms.common.useCase;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: Al-Quds Open University</p>
 * @author Mustafa Al-Tamim
 * @version 1.0
 */

 import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CommonDownloaderUseCase implements eu.pms.common.useCase.ComponentUseCase
{
  public Collection execute(Collection input, HttpServletRequest request) throws HibernateException
  {
    List result = null;

    Iterator itr = input.iterator();

    String assignId = (String) itr.next();
    String fileId = (String) itr.next();
    ArrayList userRoles = (ArrayList) itr.next();
//        Moidifed By Ibrahim Assi Date :4/3/2012
     Boolean tutorUploaded = new Boolean(false);
     if(itr.hasNext())
         tutorUploaded= (Boolean)itr.next();

    try
    {
//      result = new CommonDownloadComponent().getFile(assignId, fileId, userRoles,tutorUploaded);
//       End Moidifed By Ibrahim Assi Date :4/3/2012
    }
    catch (Exception e)
    {
      e.printStackTrace();
      System.out.println("Error in CommonDownloaderUseCase " + e);
    }
    return result;
  }
}
