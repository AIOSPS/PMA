package eu.pms.taglibs;

import eu.pms.common.component.FormCmp;
import eu.pms.common.tools.DateTool;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Ibrahim Assi (iassi)
 * Date: 7/7/2015
 * Time: 01:01 م
 */
public class CustomComponents  extends TagSupport
{
    private String id         = "";
    private String styleClass = "";
    private String type       = "";
    private String endDate    = "";


    public int doStartTag()
    {
        JspWriter out = pageContext.getOut();

        if(type.equals("file"))
        generateUploadFileInput(out);
        else if(type.equals("wedgitNew"))  // ex: <qou:customComponents type='wedgitNew' endDate='15/2/2016' />
        generateWedgitNew(out);


        return SKIP_BODY;
    }

    //-----------------------------------

      private void generateWedgitNew(JspWriter out)
      {
          try
             {
                 if(FormCmp.isEmpty(getEndDate()))
                 throw new Exception("*** Invalid endDate ..");

                if(DateTool.convertStringToDate_dd_mm_yyyy(getEndDate()).compareTo(new Date())==1 )
                out.print("&nbsp<span class='menu-wedgit'>جديد</span>&nbsp");
                else  // Print every calling not active WedgitNew to remember remove it
                System.out.println("# WedgitNew ##### endDate:"+getEndDate()+" ########################");
             }
             catch (Exception e)
             {
                 System.err.println("Error in CustomComponents.generateWedgitNew:"+e);
             }
      }

    //-----------------------------------

      private void generateUploadFileInput(JspWriter out)
      {
          try
           {
               if(FormCmp.isEmpty(getId()))
               throw new Exception("*** Invalid Id ..");

               if(FormCmp.isEmpty(getType()))
               throw new Exception("*** Invalid type ..");

               out.print("  <script>");
               out.print("  $(document).on('change', '.btn-file :file', function() {");
               out.print("  var input = $(this),");
               out.print("  numFiles = input.get(0).files ? input.get(0).files.length : 1,");
               out.print("  label = input.val().replace(/\\\\/g, '/').replace(/.*\\//, '');");
               out.print("  input.trigger('fileselect', [numFiles, label]);");
               out.print("  });");
               out.print("  $(document).ready( function() {");
               out.print("  $('.btn-file :file').on('fileselect', function(event, numFiles, label) {");
               out.print("  var input = $(this).parents('.input-group').find(':text'),");
               out.print("  log = numFiles > 1 ? numFiles + ' files selected' : label;");
               out.print("  if( input.length ) {");
               out.print("  input.val(log);");
               out.print("  } else {");
               out.print("  if( log ) alert(log);");
               out.print("  }");
               out.print("  });");
               out.print("  });");
               out.print("  </script>");
               out.print("  <div class=\"input-group\">");
               out.print("  <span class=\"input-group-btn\">");
               out.print("  <span class=\"btn btn-success input-sm btn-file\">");
               out.print("  ارفاق");
               out.print("  &hellip; <input type=\"file\" name=\""+getId()+"\" id=\""+getId()+"\" class=\""+getStyleClass()+"\">");
               out.print("  </span>");
               out.print("  </span>");
               out.print("  <input type=\"text\" class=\""+getStyleClass()+"\" readonly>");
               out.print("  </div>");
           }
           catch (Exception e)
           {
               System.err.println("Error in CustomComponents.generateUploadFileInput:"+e);
           }
      }

    //*************************** Getter & setter ********************+

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getStyleClass() {
        return this.styleClass;
    }

    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
