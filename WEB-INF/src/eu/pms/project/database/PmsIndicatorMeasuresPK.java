package eu.pms.project.database;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by orayyan on 1/1/2017.
 */
public class PmsIndicatorMeasuresPK implements Serializable{
    /** identifier field */
    private String indId;

    /** identifier field */
    private String resId;

    /** identifier field */
    private String objId;

    /** identifier field */
    private Date msrDate;
    private String compId;

    /** full constructor */
    public PmsIndicatorMeasuresPK(String indId, String resId, String objId, Date msrDate) {
        this.indId = indId;
        this.resId = resId;
        this.objId = objId;
        this.msrDate = msrDate;
        this.compId = indId+"_"+resId+"_"+objId+"_"+msrDate;
    }

    /** default constructor */
    public PmsIndicatorMeasuresPK() {
    }

    public String getIndId() {
        return this.indId;
    }

    public void setIndId(String indId) {
        this.indId = indId;
    }

    public String getResId() {
        return this.resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }

    public String getObjId() {
        return this.objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public String getCompId() {
        return indId+"_"+resId+"_"+objId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    public Date getMsrDate() {
        return msrDate;
    }

    public void setMsrDate(Date msrDate) {
        this.msrDate = msrDate;
    }

    public String toString() {
        return new ToStringBuilder(this)
                .append("indId", getIndId())
                .append("resId", getResId())
                .append("objId", getObjId())
                .append("msrDate", getMsrDate())
                .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsIndicatorMeasuresPK) ) return false;
        PmsIndicatorMeasuresPK castOther = (PmsIndicatorMeasuresPK) other;
        return new EqualsBuilder()
                .append(this.getIndId(), castOther.getIndId())
                .append(this.getResId(), castOther.getResId())
                .append(this.getObjId(), castOther.getObjId())
                .append(this.getMsrDate(), castOther.getMsrDate())
                .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
                .append(getIndId())
                .append(getResId())
                .append(getObjId())
                .append(getMsrDate())
                .toHashCode();
    }

}
