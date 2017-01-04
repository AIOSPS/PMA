package eu.pms.project.database;

import eu.pms.common.tools.DateTool;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by orayyan on 1/1/2017.
 */
public class PmsIndicatorMeasuresPK implements Serializable{
    private String indId;
    private String resId;
    private String objId;
    private Date msrDate;
    private String msrDateStr;

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

    public Date getMsrDate() {
        return msrDate;
    }

    public void setMsrDate(Date msrDate) {
        this.msrDate = msrDate;
    }

    public String getMsrDateStr() {
        return msrDate!=null? DateTool.decorateDate(msrDate, DateTool.DD_MM_YYYY):"";
    }

    public void setMsrDateStr(String msrDateStr) {
        this.msrDateStr = msrDateStr;
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
