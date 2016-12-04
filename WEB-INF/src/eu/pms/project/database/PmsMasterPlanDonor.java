package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsMasterPlanDonor implements Serializable {

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private PmsDonor pmsDonor;

    /** persistent field */
    private PmsMasterPlan pmsMasterPlan;

    /** full constructor */
    public PmsMasterPlanDonor(String username, java.util.Date timeStamp, PmsDonor pmsDonor, PmsMasterPlan pmsMasterPlan) {
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsDonor = pmsDonor;
        this.pmsMasterPlan = pmsMasterPlan;
    }

    /** default constructor */
    public PmsMasterPlanDonor() {
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

    public PmsDonor getPmsDonor() {
        return this.pmsDonor;
    }

    public void setPmsDonor(PmsDonor pmsDonor) {
        this.pmsDonor = pmsDonor;
    }

    public PmsMasterPlan getPmsMasterPlan() {
        return this.pmsMasterPlan;
    }

    public void setPmsMasterPlan(PmsMasterPlan pmsMasterPlan) {
        this.pmsMasterPlan = pmsMasterPlan;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
