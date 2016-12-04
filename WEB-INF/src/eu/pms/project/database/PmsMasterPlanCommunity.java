package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsMasterPlanCommunity implements Serializable {

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private PmsMasterPlan pmsMasterPlan;

    /** persistent field */
    private PmsCommunity pmsCommunity;

    /** full constructor */
    public PmsMasterPlanCommunity(String username, java.util.Date timeStamp, PmsMasterPlan pmsMasterPlan, PmsCommunity pmsCommunity) {
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsMasterPlan = pmsMasterPlan;
        this.pmsCommunity = pmsCommunity;
    }

    /** default constructor */
    public PmsMasterPlanCommunity() {
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

    public PmsMasterPlan getPmsMasterPlan() {
        return this.pmsMasterPlan;
    }

    public void setPmsMasterPlan(PmsMasterPlan pmsMasterPlan) {
        this.pmsMasterPlan = pmsMasterPlan;
    }

    public PmsCommunity getPmsCommunity() {
        return this.pmsCommunity;
    }

    public void setPmsCommunity(PmsCommunity pmsCommunity) {
        this.pmsCommunity = pmsCommunity;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
