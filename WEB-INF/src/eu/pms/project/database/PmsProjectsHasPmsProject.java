package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsProjectsHasPmsProject implements Serializable {

    /** persistent field */
    private PmsProject pmsProjectByPmsProjectsProId;

    /** persistent field */
    private PmsProject pmsProjectByPmsProjectsProId1;

    /** full constructor */
    public PmsProjectsHasPmsProject(PmsProject pmsProjectByPmsProjectsProId, PmsProject pmsProjectByPmsProjectsProId1) {
        this.pmsProjectByPmsProjectsProId = pmsProjectByPmsProjectsProId;
        this.pmsProjectByPmsProjectsProId1 = pmsProjectByPmsProjectsProId1;
    }

    /** default constructor */
    public PmsProjectsHasPmsProject() {
    }

    public PmsProject getPmsProjectByPmsProjectsProId() {
        return this.pmsProjectByPmsProjectsProId;
    }

    public void setPmsProjectByPmsProjectsProId(PmsProject pmsProjectByPmsProjectsProId) {
        this.pmsProjectByPmsProjectsProId = pmsProjectByPmsProjectsProId;
    }

    public PmsProject getPmsProjectByPmsProjectsProId1() {
        return this.pmsProjectByPmsProjectsProId1;
    }

    public void setPmsProjectByPmsProjectsProId1(PmsProject pmsProjectByPmsProjectsProId1) {
        this.pmsProjectByPmsProjectsProId1 = pmsProjectByPmsProjectsProId1;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
