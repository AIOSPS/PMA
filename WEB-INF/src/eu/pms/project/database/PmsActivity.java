package eu.pms.project.database;

import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsActivity implements Serializable {

    private PmsActivityPK compId;
    private String actDesc;
    private String actUnit;
    private BigDecimal actUnitQty;
    private int actEstimatedBudget;
    private String username;
    private java.util.Date timeStamp;

    /** default constructor */
    public PmsActivity() {
    }

    public PmsActivityPK getCompId() {
        return compId;
    }

    public void setCompId(PmsActivityPK compId) {
        this.compId = compId;
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

    public BigDecimal getActUnitQty() {
        return this.actUnitQty;
    }

    public void setActUnitQty(BigDecimal actUnitQty) {
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


    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getCompId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsActivity) ) return false;
        PmsActivity castOther = (PmsActivity) other;
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
