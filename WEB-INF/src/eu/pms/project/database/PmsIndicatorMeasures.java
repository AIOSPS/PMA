package eu.pms.project.database;

import java.io.Serializable;

import eu.pms.common.tools.DateTool;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsIndicatorMeasures implements Serializable {

    /** identifier field */
    private PmsIndicatorMeasuresPK compId;

    /** persistent field */
    private int indTarget;

    /** persistent field */
    private int indValue;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;




    /** default constructor */
    public PmsIndicatorMeasures() {
    }

    public PmsIndicatorMeasuresPK getCompId() {
        return this.compId;
    }

    public void setCompId(PmsIndicatorMeasuresPK compId) {
        this.compId = compId;
    }

    public int getIndTarget() {
        return indTarget;
    }

    public void setIndTarget(int indTarget) {
        this.indTarget = indTarget;
    }

    public int getIndValue() {
        return indValue;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmsIndicatorMeasures that = (PmsIndicatorMeasures) o;

        if (indTarget != that.indTarget) return false;
        if (indValue != that.indValue) return false;
        if (compId != null ? !compId.equals(that.compId) : that.compId != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        return timeStamp != null ? timeStamp.equals(that.timeStamp) : that.timeStamp == null;
    }

    @Override
    public int hashCode() {
        int result = compId != null ? compId.hashCode() : 0;
        result = 31 * result + indTarget;
        result = 31 * result + indValue;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (timeStamp != null ? timeStamp.hashCode() : 0);
        return result;
    }
}
