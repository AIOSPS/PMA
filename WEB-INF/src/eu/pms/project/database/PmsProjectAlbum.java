package eu.pms.project.database;

import java.io.InputStream;
import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsProjectAlbum implements Serializable {

    /** persistent field */
    private InputStream albImage;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** nullable persistent field */
    private PmsProject pmsProject;

    /** full constructor */
    public PmsProjectAlbum(InputStream albImage, String username, java.util.Date timeStamp, PmsProject pmsProject) {
        this.albImage = albImage;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsProject = pmsProject;
    }

    /** default constructor */
    public PmsProjectAlbum() {
    }

    /** minimal constructor */
    public PmsProjectAlbum(InputStream albImage, String username, java.util.Date timeStamp) {
        this.albImage = albImage;
        this.username = username;
        this.timeStamp = timeStamp;
    }

    public InputStream getAlbImage() {
        return this.albImage;
    }

    public void setAlbImage(InputStream albImage) {
        this.albImage = albImage;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public java.util.Date getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(java.util.Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public PmsProject getPmsProject() {
        return this.pmsProject;
    }

    public void setPmsProject(PmsProject pmsProject) {
        this.pmsProject = pmsProject;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
