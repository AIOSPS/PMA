package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsProjectDonor implements Serializable {

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private eu.pms.project.database.PmsDonor pmsDonor;

    /** persistent field */
    private PmsProject pmsProject;

    /** full constructor */
    public PmsProjectDonor(String username, java.util.Date timeStamp, eu.pms.project.database.PmsDonor pmsDonor, PmsProject pmsProject) {
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsDonor = pmsDonor;
        this.pmsProject = pmsProject;
    }

    /** default constructor */
    public PmsProjectDonor() {
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

    public eu.pms.project.database.PmsDonor getPmsDonor() {
        return this.pmsDonor;
    }

    public void setPmsDonor(eu.pms.project.database.PmsDonor pmsDonor) {
        this.pmsDonor = pmsDonor;
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
