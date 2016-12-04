package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsResult implements Serializable {

    /** identifier field */
    private eu.pms.project.database.PmsResultPK comp_id;

    /** persistent field */
    private String resDesc;

    /** nullable persistent field */
    private String resLongDesc;

    /** persistent field */
    private java.util.Date resDefineDate;

    /** persistent field */
    private String resStatus;

    /** nullable persistent field */
    private java.util.Date resCloseDate;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private eu.pms.project.database.PmsObjectiv pmsObjectiv;

    /** persistent field */
    private Set pmsIndicators;

    /** full constructor */
    public PmsResult(eu.pms.project.database.PmsResultPK comp_id, String resDesc, String resLongDesc, java.util.Date resDefineDate, String resStatus, java.util.Date resCloseDate, String username, java.util.Date timeStamp, eu.pms.project.database.PmsObjectiv pmsObjectiv, Set pmsIndicators) {
        this.comp_id = comp_id;
        this.resDesc = resDesc;
        this.resLongDesc = resLongDesc;
        this.resDefineDate = resDefineDate;
        this.resStatus = resStatus;
        this.resCloseDate = resCloseDate;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsObjectiv = pmsObjectiv;
        this.pmsIndicators = pmsIndicators;
    }

    /** default constructor */
    public PmsResult() {
    }

    /** minimal constructor */
    public PmsResult(eu.pms.project.database.PmsResultPK comp_id, String resDesc, java.util.Date resDefineDate, String resStatus, String username, java.util.Date timeStamp, eu.pms.project.database.PmsObjectiv pmsObjectiv, Set pmsIndicators) {
        this.comp_id = comp_id;
        this.resDesc = resDesc;
        this.resDefineDate = resDefineDate;
        this.resStatus = resStatus;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsObjectiv = pmsObjectiv;
        this.pmsIndicators = pmsIndicators;
    }

    public eu.pms.project.database.PmsResultPK getComp_id() {
        return this.comp_id;
    }

    public void setComp_id(eu.pms.project.database.PmsResultPK comp_id) {
        this.comp_id = comp_id;
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

    public eu.pms.project.database.PmsObjectiv getPmsObjectiv() {
        return this.pmsObjectiv;
    }

    public void setPmsObjectiv(eu.pms.project.database.PmsObjectiv pmsObjectiv) {
        this.pmsObjectiv = pmsObjectiv;
    }

    public Set getPmsIndicators() {
        return this.pmsIndicators;
    }

    public void setPmsIndicators(Set pmsIndicators) {
        this.pmsIndicators = pmsIndicators;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsResult) ) return false;
        PmsResult castOther = (PmsResult) other;
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
