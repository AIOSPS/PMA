package eu.pms.taglibs;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Al-Quds Open University</p>
 * @author unascribed
 * @version 1.0
 */

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class SessionValidator extends TagSupport
{
  public int doStartTag()
  {
    try
    {
      JspWriter out = pageContext.getOut();
      ServletRequest requset = pageContext.getRequest();

      if(!(eu.pms.common.tools.SessionTraker.isSessionExist((HttpServletRequest)requset)))
        requset.getRequestDispatcher("../errorPage.jsp").forward(requset,pageContext.getResponse());
    }
    catch(Exception ioe)
    {
      System.out.println("Error: " + ioe);
    }
    return(SKIP_BODY);
  }
}

