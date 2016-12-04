package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsActivity implements Serializable {

    /** identifier field */
    private PmsActivityPK comp_id;

    /** persistent field */
    private String actDesc;

    /** persistent field */
    private String actUnit;

    /** persistent field */
    private int actUnitQty;

    /** nullable persistent field */
    private int actEstimatedBudget;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private eu.pms.project.database.PmsIntervention pmsIntervention;

    /** full constructor */
    public PmsActivity(PmsActivityPK comp_id, String actDesc, String actUnit, int actUnitQty, int actEstimatedBudget, String username, java.util.Date timeStamp, eu.pms.project.database.PmsIntervention pmsIntervention) {
        this.comp_id = comp_id;
        this.actDesc = actDesc;
        this.actUnit = actUnit;
        this.actUnitQty = actUnitQty;
        this.actEstimatedBudget = actEstimatedBudget;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsIntervention = pmsIntervention;
    }

    /** default constructor */
    public PmsActivity() {
    }

    /** minimal constructor */
    public PmsActivity(PmsActivityPK comp_id, String actDesc, String actUnit, int actUnitQty, String username, java.util.Date timeStamp, eu.pms.project.database.PmsIntervention pmsIntervention) {
        this.comp_id = comp_id;
        this.actDesc = actDesc;
        this.actUnit = actUnit;
        this.actUnitQty = actUnitQty;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsIntervention = pmsIntervention;
    }

    public PmsActivityPK getComp_id() {
        return this.comp_id;
    }

    public void setComp_id(PmsActivityPK comp_id) {
        this.comp_id = comp_id;
    }

    public String getActDesc() {
        return this.actDesc;
    }

    public void setActDesc(String actDesc) {
        this.actDesc = actDesc;
    }

    public String getActUnit() {
        return this.actUnit;
    }

    public void setActUnit(String actUnit) {
        this.actUnit = actUnit;
    }

    public int getActUnitQty() {
        return this.actUnitQty;
    }

    public void setActUnitQty(int actUnitQty) {
        this.actUnitQty = actUnitQty;
    }

    public int getActEstimatedBudget() {
        return this.actEstimatedBudget;
    }

    public void setActEstimatedBudget(int actEstimatedBudget) {
        this.actEstimatedBudget = actEstimatedBudget;
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

    public eu.pms.project.database.PmsIntervention getPmsIntervention() {
        return this.pmsIntervention;
    }

    public void setPmsIntervention(eu.pms.project.database.PmsIntervention pmsIntervention) {
        this.pmsIntervention = pmsIntervention;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsActivity) ) return false;
        PmsActivity castOther = (PmsActivity) other;
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
