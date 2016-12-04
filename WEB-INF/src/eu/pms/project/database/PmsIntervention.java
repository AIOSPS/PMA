package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsIntervention implements Serializable {

    /** identifier field */
    private PmsInterventionPK comp_id;

    /** persistent field */
    private String intDesc;

    /** persistent field */
    private int intEstimatedBudget;

    /** nullable persistent field */
    private String intSource;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private PmsSubSector pmsSubSector;

    /** persistent field */
    private eu.pms.project.database.PmsMasterPlan pmsMasterPlan;

    /** persistent field */
    private Set pmsActivities;

    /** full constructor */
    public PmsIntervention(PmsInterventionPK comp_id, String intDesc, int intEstimatedBudget, String intSource, String username, java.util.Date timeStamp, PmsSubSector pmsSubSector, eu.pms.project.database.PmsMasterPlan pmsMasterPlan, Set pmsActivities) {
        this.comp_id = comp_id;
        this.intDesc = intDesc;
        this.intEstimatedBudget = intEstimatedBudget;
        this.intSource = intSource;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsSubSector = pmsSubSector;
        this.pmsMasterPlan = pmsMasterPlan;
        this.pmsActivities = pmsActivities;
    }

    /** default constructor */
    public PmsIntervention() {
    }

    /** minimal constructor */
    public PmsIntervention(PmsInterventionPK comp_id, String intDesc, int intEstimatedBudget, String username, java.util.Date timeStamp, PmsSubSector pmsSubSector, eu.pms.project.database.PmsMasterPlan pmsMasterPlan, Set pmsActivities) {
        this.comp_id = comp_id;
        this.intDesc = intDesc;
        this.intEstimatedBudget = intEstimatedBudget;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsSubSector = pmsSubSector;
        this.pmsMasterPlan = pmsMasterPlan;
        this.pmsActivities = pmsActivities;
    }

    public PmsInterventionPK getComp_id() {
        return this.comp_id;
    }

    public void setComp_id(PmsInterventionPK comp_id) {
        this.comp_id = comp_id;
    }

    public String getIntDesc() {
        return this.intDesc;
    }

    public void setIntDesc(String intDesc) {
        this.intDesc = intDesc;
    }

    public int getIntEstimatedBudget() {
        return this.intEstimatedBudget;
    }

    public void setIntEstimatedBudget(int intEstimatedBudget) {
        this.intEstimatedBudget = intEstimatedBudget;
    }

    public String getIntSource() {
        return this.intSource;
    }

    public void setIntSource(String intSource) {
        this.intSource = intSource;
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

    public PmsSubSector getPmsSubSector() {
        return this.pmsSubSector;
    }

    public void setPmsSubSector(PmsSubSector pmsSubSector) {
        this.pmsSubSector = pmsSubSector;
    }

    public eu.pms.project.database.PmsMasterPlan getPmsMasterPlan() {
        return this.pmsMasterPlan;
    }

    public void setPmsMasterPlan(eu.pms.project.database.PmsMasterPlan pmsMasterPlan) {
        this.pmsMasterPlan = pmsMasterPlan;
    }

    public Set getPmsActivities() {
        return this.pmsActivities;
    }

    public void setPmsActivities(Set pmsActivities) {
        this.pmsActivities = pmsActivities;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsIntervention) ) return false;
        PmsIntervention castOther = (PmsIntervention) other;
        return new EqualsBuilder()
            .append(this.getComp_id(), castOther.getComp_id())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getComp_id())
            .toHashCode();
    }

}
