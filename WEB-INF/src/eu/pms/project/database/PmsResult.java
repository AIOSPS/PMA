package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;

import eu.pms.common.tools.DateTool;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsResult implements Serializable {

    private eu.pms.project.database.PmsResultPK compId;
    private String resDesc;
    private String resLongDesc;
    private java.util.Date resDefineDate;
    private String resDefineDateStr;
    private String resStatus;
    private java.util.Date resCloseDate;
    private String resCloseDateStr;
    private String username;
    private java.util.Date timeStamp;

    /** default constructor */
    public PmsResult() {
    }

    public PmsResultPK getCompId() {
        return compId;
    }

    public void setCompId(PmsResultPK compId) {
        this.compId = compId;
    }

    public String getResDesc() {
        return this.resDesc;
    }

    public void setResDesc(String resDesc) {
        this.resDesc = resDesc;
    }

    public String getResLongDesc() {
        return this.resLongDesc;
    }

    public void setResLongDesc(String resLongDesc) {
        this.resLongDesc = resLongDesc;
    }

    public java.util.Date getResDefineDate() {
        return this.resDefineDate;
    }

    public void setResDefineDate(java.util.Date resDefineDate) {
        this.resDefineDate = resDefineDate;
    }

    public String getResStatus() {
        return this.resStatus;
    }

    public void setResStatus(String resStatus) {
        this.resStatus = resStatus;
    }

    public java.util.Date getResCloseDate() {
        return this.resCloseDate;
    }

    public void setResCloseDate(java.util.Date resCloseDate) {
        this.resCloseDate = resCloseDate;
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

    public String getResDefineDateStr() {
        return resDefineDate!=null? DateTool.decorateDate(resDefineDate, DateTool.DD_MM_YYYY):"";
    }

    public void setResDefineDateStr(String resDefineDateStr) {
        this.resDefineDateStr = resDefineDateStr;
    }

    public String getResCloseDateStr() {
        return resCloseDate!=null? DateTool.decorateDate(resCloseDate, DateTool.DD_MM_YYYY):"";
    }

    public void setResCloseDateStr(String resCloseDateStr) {
        this.resCloseDateStr = resCloseDateStr;
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsResult) ) return false;
        PmsResult castOther = (PmsResult) other;
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
