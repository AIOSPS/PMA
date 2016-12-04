package eu.pms.admin.forms;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * User:  Ibrahim Assi (iassi)
 * Date: Aug 6, 2011
 * Time: 1:12:05 PM
 */
public class CreateOutlineForm  extends ActionForm
{
     private String crsNo;
     private String crsSeq;
     private String eduMedia;
     private String descACrs;
     private String trainingManual;
     private String gradProjects;
     private String distributionMarks;
     private String specLinks;
     private Integer  isGradProject=0;

    public Integer getIsGradProject() {
        return isGradProject;
    }

    public void setIsGradProject(Integer gradProject) {
        isGradProject = gradProject;
    }

    public String getCrsNo() {
        return crsNo;
    }

    public void setCrsNo(String crsNo) {
        this.crsNo = crsNo;
    }

    public String getCrsSeq() {
        return crsSeq;
    }

    public void setCrsSeq(String crsSeq) {
        this.crsSeq = crsSeq;
    }

    public String getEduMedia() {

      String temp = ""; try { temp =
      new String(eduMedia.getBytes("ISO8859_1"), "utf8"); } catch (Exception e) { }

      return temp;
    }

    public void setEduMedia(String eduMedia) {
        this.eduMedia = eduMedia;
    }

    public String getDescACrs() {
      String temp = ""; try { temp =
      new String(descACrs.getBytes("ISO8859_1"), "utf8"); } catch (Exception e) { }

      return temp;
    }

    public void setDescACrs(String descACrs) {
        this.descACrs = descACrs;
    }

    public String getTrainingManual() {
      String temp = ""; try { temp =
      new String(trainingManual.getBytes("ISO8859_1"), "utf8"); } catch (Exception e) { }

      return temp;
    }

    public void setTrainingManual(String trainingManual) {
        this.trainingManual = trainingManual;
    }

    public String getGradProjects() {
      String temp = ""; try { temp =
      new String(gradProjects.getBytes("ISO8859_1"), "utf8"); } catch (Exception e) { }

      return temp;
    }

    public void setGradProjects(String gradProjects) {
        this.gradProjects = gradProjects;
    }

    public String getDistributionMarks() {
      String temp = ""; try { temp =
      new String(distributionMarks.getBytes("ISO8859_1"), "utf8"); } catch (Exception e) { }

      return temp;
    }

    public void setDistributionMarks(String distributionMarks) {
        this.distributionMarks = distributionMarks;
    }

    public String getSpecLinks() {
      String temp = ""; try { temp =
      new String(specLinks.getBytes("ISO8859_1"), "utf8"); } catch (Exception e) { }

      return temp;
    }

    public void setSpecLinks(String specLinks) {
        this.specLinks = specLinks;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest req)
    {
        ActionErrors errors = new ActionErrors();

        return errors;
    }
}
