package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsProjectsCommunity implements Serializable {

    private PmsProjectsCommunityPK compId;
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;



    /** default constructor */
    public PmsProjectsCommunity() {
    }

    public PmsProjectsCommunityPK getCompId() {
        return compId;
    }

    public void setCompId(PmsProjectsCommunityPK compId) {
        this.compId = compId;
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



    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
