package eu.pms.project.database;

import java.io.InputStream;
import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsProjectAlbum implements Serializable {

    private PmsProjectAlbumPK compId;
    private Blob albImage;
    private String username;
    private Date timeStamp;

    /** default constructor */
    public PmsProjectAlbum() {
    }

    public PmsProjectAlbumPK getCompId() {
        return compId;
    }

    public void setCompId(PmsProjectAlbumPK compId) {
        this.compId = compId;
    }

    public Blob getAlbImage() {
        return this.albImage;
    }

    public void setAlbImage(Blob albImage) {
        this.albImage = albImage;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }


    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
