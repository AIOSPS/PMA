package eu.pms.taglibs;

import eu.pms.common.constant.UserInfoHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.tagext.TagSupport;
import javax.servlet.jsp.JspWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.HibernateException;

/**
 * Auther: Mureed F.Al-Alem
 * Date: Feb 4, 2007
 * Time: 9:18:02 AM
 * QOU Portal Project (ICTC)  center
 * version 1.0
 */
public class LookupInfoTag extends TagSupport
{
    private String lookupId = "";
    private String lookupValue = "";
    private String lang = "ar";

    public String getLookupId()
    {
        return lookupId;
    }

    public void setLookupId(String lookupId)
    {
        this.lookupId = lookupId;
    }

    public String getLookupValue()
    {
        return lookupValue;
    }

    public void setLookupValue(String lookupValue)
    {
        this.lookupValue = lookupValue;
    }

    public String getLang()
    {
        return lang;
    }

    public void setLang(String lang)
    {
        this.lang = lang;
    }

    public int doStartTag()
    {
        try
        {
            JspWriter out = pageContext.getOut();
            HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();

//                if (getLookupId() != null && getLookupId().trim().length() > 0 && getLookupId().equalsIgnoreCase("termInfo"))
//                out.print(getTermInfo(getLookupValue()));
//
//                else if (getLookupId() != null && getLookupId().trim().length() > 0 && getLookupId().equalsIgnoreCase("centerInfo"))
//                out.print(getCenterInfo(getLookupValue()));
//
//                else if (getLookupId() != null && getLookupId().trim().length() > 0 && getLookupId().equalsIgnoreCase("crsStatus"))
//                out.print(getCrsStatusInfo(getLookupValue()));
//
//                else if (getLookupId() != null && getLookupId().trim().length() > 0 && getLookupId().equalsIgnoreCase("calendarItem"))
//                out.print(getCalendarItemInfo(getLookupValue()));
//
//                else if (getLookupId() != null && getLookupId().trim().length() > 0 && getLookupId().equalsIgnoreCase("specInfo"))
//                out.print(getSpecInfoItemInfo(getLookupValue()));
//
//                else if (getLookupId() != null && getLookupId().trim().length() > 0 && getLookupId().equalsIgnoreCase("progInfo"))
//                out.print(getProgInfo(getLookupValue()));
//
//                else if (getLookupId() != null && getLookupId().trim().length() > 0 && getLookupId().equalsIgnoreCase("tutorInfo"))
//                out.print(getTutorInfo(getLookupValue()));
//
//                else if (getLookupId() != null && getLookupId().trim().length() > 0 && getLookupId().equalsIgnoreCase("courseInfo"))
//                out.print(getCourseInfo(getLookupValue()));
//
//                else if (getLookupId() != null && getLookupId().trim().length() > 0 && getLookupId().equalsIgnoreCase("tawBranchInfo"))
//                out.print(getTawBranchInfo(getLookupValue()));
//
//                else if (getLookupId() != null && getLookupId().trim().length() > 0 && getLookupId().equalsIgnoreCase("prtlRepNote"))
//                out.print(getPrtlRepNoteInfo(getLookupValue()));
//
//
//                else
//                out.print(getLookupValue());
        }
        catch (Exception ioe)
        {
            System.out.println("Error: " + ioe);
        }
        return (SKIP_BODY);
    }


}
