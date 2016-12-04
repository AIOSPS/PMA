package eu.pms.taglibs;

import eu.pms.common.component.FormCmp;
import eu.pms.common.struct.LabelValueBean;
import eu.pms.common.tools.SessionDataTool;
import eu.pms.common.constant.MsConstant;
import eu.pms.common.struct.LabelValue;
import eu.pms.common.tools.SessionServletContextDataTool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.InputStream;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Ibrahim Assi (iassi)
 * Date: 01/06/15
 * Time: 09:25 ص
 */
public class CommonOperationMessageTag  extends TagSupport
{
    public int doStartTag()
        {
                try
                {
                   HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();

                    JspWriter out = pageContext.getOut();

                    if(request.getAttribute(MsConstant.RESULT_MESSAGE)!=null)
                    {
                        out.print("<div class=\"alert-danger text-center\" role=\"alert\" align=\"center\"><b>");
                        LabelValue lvalue=(LabelValue) request.getAttribute(MsConstant.RESULT_MESSAGE);
                        if(lvalue.getValueIsUnicode())
                        out.print(getMessage(request,lvalue.getValue()));
                        else
                        out.print(lvalue.getValue());
                        out.print("</b><br/></div>");
                    }

                    if(request.getAttribute(MsConstant.RESULT_MESSAGE_LIST)!=null)
                    {
                        Iterator itr=((List)request.getAttribute(MsConstant.RESULT_MESSAGE_LIST)).iterator();
                        out.print("<div class=\"alert-danger text-center\" role=\"alert\" align=\"center\">");
                        while (itr.hasNext())
                        {
                            out.print("<b>");
                            LabelValue lvalue=(LabelValue) itr.next();
                            if(lvalue.getValueIsUnicode())
                            out.print(getMessage(request,lvalue.getValue()));
                            else
                            out.print(lvalue.getValue());
                            out.print("</b><br/>");
                       }
                        out.print("</div>");
                    }


                    // clear request Data
                    request.removeAttribute(MsConstant.RESULT_MESSAGE_LIST);
                    request.removeAttribute(MsConstant.RESULT_MESSAGE);

                }
                catch (Exception ioe)
                {
                   System.err.println("Error: " + ioe);
                }

                return (SKIP_BODY);
        }

   //----------------------------------------------------------------------------
    private String getMessage(HttpServletRequest request,String property)
    {
           //  check to fill/not fill load Messages In Application Resources  into memory
           String flag= SessionServletContextDataTool.getItem(request, "flagAppRes")+"";
           if(FormCmp.isEmpty(flag)|| flag.equals("null"))
           {
               SessionServletContextDataTool.setItem(request, getAllMessagesInApplicationResources());
               SessionServletContextDataTool.setItem(request, "flagAppRes","true");
           }

           String msg = SessionServletContextDataTool.getItem(request,property)+"";
           if(!FormCmp.isEmpty(msg)|| flag.equals("msg"))
           return  msg;
           else
           return property;
    }

   //----------------------------------------------------------------------------
    private List<LabelValueBean> getAllMessagesInApplicationResources()
    {
            List<LabelValueBean> retList=new ArrayList<LabelValueBean>();

            try
            {
                Properties applicationResources = new Properties();
                Class thisClass = Class.forName("edu.qou.taglibs.CommonOperationMessageTag");
                InputStream is = thisClass.getResourceAsStream("/ApplicationResources.properties");
                applicationResources.load(is);
                Enumeration enumer = applicationResources.keys();
                String keyName="",keyVal="";
                while (enumer.hasMoreElements())
                {
                   keyName = enumer.nextElement().toString();
                   keyVal  = applicationResources.getProperty(keyName);
                    retList.add(new LabelValueBean(keyName,keyVal));
                }
                is.close();

            }
            catch (Exception e)
            {
               System.err.println("Error in CommonOperationMessageTag.getAllMessagesInApplicationResources:"+e);
            }

            return retList;
    }

}
