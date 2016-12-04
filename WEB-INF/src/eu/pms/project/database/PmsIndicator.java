package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsIndicator implements Serializable {

    /** identifier field */
    private PmsIndicatorPK comp_id;

    /** persistent field */
    private String indTitle;

    /** persistent field */
    private java.util.Date indDate;

    /** persistent field */
    private String indLongDesc;

    /** persistent field */
    private int indBaseline;

    /** persistent field */
    private int indFrequency;

    /** persistent field */
    private String indCollectionMethod;

    /** persistent field */
    private String indStatisticalMethod;

    /** persistent field */
    private int indTarget;

    /** persistent field */
    private int indValue;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private PmsResult pmsResult;

    /** full constructor */
    public PmsIndicator(PmsIndicatorPK comp_id, String indTitle, java.util.Date indDate, String indLongDesc, int indBaseline, int indFrequency, String indCollectionMethod, String indStatisticalMethod, int indTarget, int indValue, String username, java.util.Date timeStamp, PmsResult pmsResult) {
        this.comp_id = comp_id;
        this.indTitle = indTitle;
        this.indDate = indDate;
        this.indLongDesc = indLongDesc;
        this.indBaseline = indBaseline;
        this.indFrequency = indFrequency;
        this.indCollectionMethod = indCollectionMethod;
        this.indStatisticalMethod = indStatisticalMethod;
        this.indTarget = indTarget;
        this.indValue = indValue;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsResult = pmsResult;
    }

    /** default constructor */
    public PmsIndicator() {
    }

    public PmsIndicatorPK getComp_id() {
        return this.comp_id;
    }

    public void setComp_id(PmsIndicatorPK comp_id) {
        this.comp_id = comp_id;
    }

    public String getIndTitle() {
        return this.indTitle;
    }

    public void setIndTitle(String indTitle) {
        this.indTitle = indTitle;
    }

    public java.util.Date getIndDate() {
        return this.indDate;
    }

    public void setIndDate(java.util.Date indDate) {
        this.indDate = indDate;
    }

    public String getIndLongDesc() {
        return this.indLongDesc;
    }

    public void setIndLongDesc(String indLongDesc) {
        this.indLongDesc = indLongDesc;
    }

    public int getIndBaseline() {
        return this.indBaseline;
    }

    public void setIndBaseline(int indBaseline) {
        this.indBaseline = indBaseline;
    }

    public int getIndFrequency() {
        return this.indFrequency;
    }

    public void setIndFrequency(int indFrequency) {
        this.indFrequency = indFrequency;
    }

    public String getIndCollectionMethod() {
        return this.indCollectionMethod;
    }

    public void setIndCollectionMethod(String indCollectionMethod) {
        this.indCollectionMethod = indCollectionMethod;
    }

    public String getIndStatisticalMethod() {
        return this.indStatisticalMethod;
    }

    public void setIndStatisticalMethod(String indStatisticalMethod) {
        this.indStatisticalMethod = indStatisticalMethod;
    }

    public int getIndTarget() {
        return this.indTarget;
    }

    public void setIndTarget(int indTarget) {
        this.indTarget = indTarget;
    }

    public int getIndValue() {
        return this.indValue;
    }

    public void setIndValue(int indValue) {
        this.indValue = indValue;
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

    public PmsResult getPmsResult() {
        return this.pmsResult;
    }

    public void setPmsResult(PmsResult pmsResult) {
        this.pmsResult = pmsResult;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsIndicator) ) return false;
        PmsIndicator castOther = (PmsIndicator) other;
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
