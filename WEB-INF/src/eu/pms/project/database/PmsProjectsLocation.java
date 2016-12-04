package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsProjectsLocation implements Serializable {

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private eu.pms.project.database.PmsLocation pmsLocation;

    /** persistent field */
    private PmsProject pmsProject;

    /** full constructor */
    public PmsProjectsLocation(String username, java.util.Date timeStamp, eu.pms.project.database.PmsLocation pmsLocation, PmsProject pmsProject) {
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsLocation = pmsLocation;
        this.pmsProject = pmsProject;
    }

    /** default constructor */
    public PmsProjectsLocation() {
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

    public eu.pms.project.database.PmsLocation getPmsLocation() {
        return this.pmsLocation;
    }

    public void setPmsLocation(eu.pms.project.database.PmsLocation pmsLocation) {
        this.pmsLocation = pmsLocation;
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
