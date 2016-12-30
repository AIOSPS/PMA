package eu.pms.reporting.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by alisa_000 on 12/28/2016.
 */
public class DynaReportCriteriaForm extends ActionForm
{

    private String[] inputItems;
    private String[] outputItems;
    private String reportType;
    private String reportTypeData;
    private String orderBy;

    public DynaReportCriteriaForm()
    {
    }

    public String[] getInputItems()
    {
        return inputItems;
    }

    public void setInputItems(String[] inputItems)
    {
        this.inputItems = inputItems;
    }

    public String[] getOutputItems()
    {
        return outputItems;
    }

    public void setOutputItems(String[] outputItems)
    {
        this.outputItems = outputItems;
    }

    public String getReportType()
    {
        return reportType;
    }

    public void setReportType(String reportType)
    {
        this.reportType = reportType;
    }

    public String getReportTypeData() {
        return reportTypeData;
    }

    public void setReportTypeData(String reportTypeData) {
        this.reportTypeData = reportTypeData;
    }

    public String getOrderBy()
    {
        return orderBy;
    }

    public void setOrderBy(String orderBy)
    {
        this.orderBy = orderBy;
    }

    public ActionErrors validate(ActionMapping map, HttpServletRequest request)
    {
        ActionErrors errors = new ActionErrors();
//
//        /* to check the forum id if it not null in the update action */
//        if (map.getType().trim().equalsIgnoreCase("edu.qou.studentAffairs.forum.action.forum.UpdateForumAction"))
//        {
//            if (forumId == null || forumId.trim().length() == 0)
//            {
//                errors.add("empty.ForumId", new ActionMessage("forum.empty.forumId"));
//            }
//        }
//        if (name == null || name.trim().length() == 0)
//        {
//            errors.add("empty.title", new ActionMessage("forum.empty.title"));
//        }
//        if (status == null || status.trim().length() == 0)
//        {
//            errors.add("empty.status", new ActionMessage("forum.empty.status"));
//        }
//        if (topicAddLevel == null || topicAddLevel.trim().length() == 0)
//        {
//            errors.add("empty.topicAddLevel", new ActionMessage("forum.empty.adderLevel"));
//        }
        return errors;
    }

    public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest)
    {
    }
}
