package eu.pms.project.database;

import java.io.InputStream;
import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsStrategicPlanDocument implements Serializable {

    private String strDocId;
    private Blob strDocument;
    private String username;
    private java.util.Date timeStamp;
    private String conId;
    private String strPlanTitle;
    private java.util.Date strStartDate;
    private java.util.Date strEndDate;
    /** default constructor */
    public PmsStrategicPlanDocument() {
    }

    public String getStrDocId() {
        return this.strDocId;
    }

    public void setStrDocId(String strDocId) {
        this.strDocId = strDocId;
    }

    public Blob getStrDocument() {
        return this.strDocument;
    }

    public void setStrDocument(Blob strDocument) {
        this.strDocument = strDocument;
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

    public String getConId() {
        return conId;
    }

    public void setConId(String conId) {
        this.conId = conId;
    }

    public String getStrPlanTitle() {
        return strPlanTitle;
    }

    public void setStrPlanTitle(String strPlanTitle) {
        this.strPlanTitle = strPlanTitle;
    }

    public Date getStrStartDate() {
        return strStartDate;
    }

    public void setStrStartDate(Date strStartDate) {
        this.strStartDate = strStartDate;
    }

    public Date getStrEndDate() {
        return strEndDate;
    }

    public void setStrEndDate(Date strEndDate) {
        this.strEndDate = strEndDate;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("strDocId", getStrDocId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsStrategicPlanDocument) ) return false;
        PmsStrategicPlanDocument castOther = (PmsStrategicPlanDocument) other;
        return new EqualsBuilder()
            .append(this.getStrDocId(), castOther.getStrDocId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getStrDocId())
            .toHashCode();
    }

}
