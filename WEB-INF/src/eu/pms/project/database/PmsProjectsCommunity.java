package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsProjectsCommunity implements Serializable {

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private PmsProject pmsProject;

    /** persistent field */
    private eu.pms.project.database.PmsCommunity pmsCommunity;

    /** full constructor */
    public PmsProjectsCommunity(String username, java.util.Date timeStamp, PmsProject pmsProject, eu.pms.project.database.PmsCommunity pmsCommunity) {
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsProject = pmsProject;
        this.pmsCommunity = pmsCommunity;
    }

    /** default constructor */
    public PmsProjectsCommunity() {
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

    public eu.pms.project.database.PmsCommunity getPmsCommunity() {
        return this.pmsCommunity;
    }

    public void setPmsCommunity(eu.pms.project.database.PmsCommunity pmsCommunity) {
        this.pmsCommunity = pmsCommunity;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
