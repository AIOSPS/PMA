package eu.pms.project.database;

import java.io.Serializable;
import java.util.Date;

/** @author Hibernate CodeGenerator */
public class PmsProjectsIndicator implements Serializable {

    /** identifier field */
    private PmsProjectsIndicatorPK compId;
    private String username;
    private java.util.Date timeStamp;

    public PmsProjectsIndicatorPK getCompId() {
        return compId;
    }

    public void setCompId(PmsProjectsIndicatorPK compId) {
        this.compId = compId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
