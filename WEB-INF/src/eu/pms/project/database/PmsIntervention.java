package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsIntervention implements Serializable {

    private PmsInterventionPK compId;
    private String masId;
    private String intDesc;
    private int intEstimatedBudget;
    private String intSource;
    private String intPriority;
    private String intSourceDesc;
    private String username;
    private java.util.Date timeStamp;

    /** default constructor */
    public PmsIntervention() {
    }


    public PmsInterventionPK getCompId() {
        return this.compId;
    }

    public void setCompId(PmsInterventionPK compId) {
        this.compId = compId;
    }

    public String getMasId() {
        return masId;
    }

    public void setMasId(String masId) {
        this.masId = masId;
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

    public String getIntPriority() {
        return intPriority;
    }

    public void setIntPriority(String intPriority) {
        this.intPriority = intPriority;
    }

    public String getIntSourceDesc() {
        if (this.intSource==null || this.intSource.isEmpty()){
            intSourceDesc = "Unknown";
        }else if(this.intSource.equals("MASTER")){
            intSourceDesc = "Master Plan";
        }else if(this.intSource.equals("ASSESS")){
            intSourceDesc = "Assessment";
        }else if(this.intSource.equals("COMM")){
            intSourceDesc = "Community Representative";
        }else{
            intSourceDesc = "Unknown";
        }
        return intSourceDesc;
    }
    public void setIntSourceDesc(String intSourceDesc) {
        this.intSourceDesc = intSourceDesc;
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
            .append("comp_id", getCompId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsIntervention) ) return false;
        PmsIntervention castOther = (PmsIntervention) other;
        return new EqualsBuilder()
            .append(this.getCompId(), castOther.getCompId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getCompId())
            .toHashCode();
    }

}
