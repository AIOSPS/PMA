package eu.pms.taglibs;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CurrentDateViewer extends TagSupport
{
  public int doStartTag()
  {
    try
    {
      JspWriter out = pageContext.getOut();
      SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
      Calendar cal = Calendar.getInstance();
      out.print(format.format(cal.getTime()));
    }
    catch(Exception ioe)
    {
      System.out.println("Error: " + ioe);
    }
    return(SKIP_BODY);
  }
}

