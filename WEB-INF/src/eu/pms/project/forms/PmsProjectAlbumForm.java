package eu.pms.project.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** @author Hibernate CodeGenerator */
public class PmsProjectAlbumForm extends ActionForm {
    private String proId;
    private String albId;
    private FormFile albImage ;

    /** default constructor */
    public PmsProjectAlbumForm() {
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getAlbId() {
        return albId;
    }

    public void setAlbId(String albId) {
        this.albId = albId;
    }

    public FormFile getAlbImage() {
        return albImage;
    }

    public void setAlbImage(FormFile albImage) {
        this.albImage = albImage;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
