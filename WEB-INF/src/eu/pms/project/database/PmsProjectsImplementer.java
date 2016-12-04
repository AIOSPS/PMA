package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsProjectsImplementer implements Serializable {

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private PmsProject pmsProject;

    /** persistent field */
    private eu.pms.project.database.PmsImplementer pmsImplementer;

    /** full constructor */
    public PmsProjectsImplementer(String username, java.util.Date timeStamp, PmsProject pmsProject, eu.pms.project.database.PmsImplementer pmsImplementer) {
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsProject = pmsProject;
        this.pmsImplementer = pmsImplementer;
    }

    /** default constructor */
    public PmsProjectsImplementer() {
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

    public eu.pms.project.database.PmsImplementer getPmsImplementer() {
        return this.pmsImplementer;
    }

    public void setPmsImplementer(eu.pms.project.database.PmsImplementer pmsImplementer) {
        this.pmsImplementer = pmsImplementer;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
