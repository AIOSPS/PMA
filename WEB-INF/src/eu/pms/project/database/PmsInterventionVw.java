package eu.pms.project.database;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/** @author Hibernate CodeGenerator */
public class PmsInterventionVw implements Serializable {

    private PmsInterventionVwPK compId;
    private String intDesc;
    private int intEstimatedBudget;
    private String intSource;
    private String intPriority;
    private String intSourceDesc;
    private String masMpName;
    private String comName;

    /** default constructor */
    public PmsInterventionVw() {
    }


    public PmsInterventionVwPK getCompId() {
        return this.compId;
    }

    public void setCompId(PmsInterventionVwPK compId) {
        this.compId = compId;
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

    public String getMasMpName() {
        return this.masMpName;
    }

    public void setMasMpName(String masMpName) {
        this.masMpName = masMpName;
    }

    public String getComName() {
        return this.comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getCompId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsInterventionVw) ) return false;
        PmsInterventionVw castOther = (PmsInterventionVw) other;
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
