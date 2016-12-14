package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;

import eu.pms.common.tools.DateTool;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsObjectiv implements Serializable {

    private String objId;
    private String strDocId;
    private String objDesc;
    private String objLongDesc;
    private java.util.Date objDefineDate;
    private String objDefineDateStr;
    private String objStatus;
    private java.util.Date objCloseDate;
    private String objCloseDateStr;
    private String ojbUserId;
    private String username;
    private java.util.Date timeStamp;
    /** default constructor */
    public PmsObjectiv() {
    }

    public String getObjId() {
        return this.objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public String getObjDesc() {
        return this.objDesc;
    }

    public void setObjDesc(String objDesc) {
        this.objDesc = objDesc;
    }

    public String getObjLongDesc() {
        return this.objLongDesc;
    }

    public void setObjLongDesc(String objLongDesc) {
        this.objLongDesc = objLongDesc;
    }

    public java.util.Date getObjDefineDate() {
        return this.objDefineDate;
    }

    public void setObjDefineDate(java.util.Date objDefineDate) {
        this.objDefineDate = objDefineDate;
    }

    public String getObjStatus() {
        return this.objStatus;
    }

    public void setObjStatus(String objStatus) {
        this.objStatus = objStatus;
    }

    public java.util.Date getObjCloseDate() {
        return this.objCloseDate;
    }

    public void setObjCloseDate(java.util.Date objCloseDate) {
        this.objCloseDate = objCloseDate;
    }

    public String getOjbUserId() {
        return this.ojbUserId;
    }

    public void setOjbUserId(String ojbUserId) {
        this.ojbUserId = ojbUserId;
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
            .append("objId", getObjId())
            .toString();
    }

    public String getStrDocId() {
        return strDocId;
    }

    public void setStrDocId(String strDocId) {
        this.strDocId = strDocId;
    }

    public String getObjDefineDateStr() {
        return objDefineDate!=null? DateTool.decorateDate(objDefineDate, DateTool.DD_MM_YYYY):"";
    }

    public void setObjDefineDateStr(String objDefineDateStr) {
        this.objDefineDateStr = objDefineDateStr;
    }

    public String getObjCloseDateStr() {
        return objCloseDate!=null? DateTool.decorateDate(objCloseDate, DateTool.DD_MM_YYYY):"";
    }

    public void setObjCloseDateStr(String objCloseDateStr) {
        this.objCloseDateStr = objCloseDateStr;
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsObjectiv) ) return false;
        PmsObjectiv castOther = (PmsObjectiv) other;
        return new EqualsBuilder()
            .append(this.getObjId(), castOther.getObjId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getObjId())
            .toHashCode();
    }

}
