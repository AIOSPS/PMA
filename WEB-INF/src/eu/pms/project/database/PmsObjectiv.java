package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsObjectiv implements Serializable {

    /** identifier field */
    private String objId;

    /** persistent field */
    private String objDesc;

    /** nullable persistent field */
    private String objLongDesc;

    /** persistent field */
    private java.util.Date objDefineDate;

    /** persistent field */
    private String objStatus;

    /** persistent field */
    private java.util.Date objCloseDate;

    /** persistent field */
    private String ojbUserId;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private PmsStrategicPlanDocument pmsStrategicPlanDocument;

    /** persistent field */
    private Set pmsResults;

    /** full constructor */
    public PmsObjectiv(String objId, String objDesc, String objLongDesc, java.util.Date objDefineDate, String objStatus, java.util.Date objCloseDate, String ojbUserId, String username, java.util.Date timeStamp, PmsStrategicPlanDocument pmsStrategicPlanDocument, Set pmsResults) {
        this.objId = objId;
        this.objDesc = objDesc;
        this.objLongDesc = objLongDesc;
        this.objDefineDate = objDefineDate;
        this.objStatus = objStatus;
        this.objCloseDate = objCloseDate;
        this.ojbUserId = ojbUserId;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsStrategicPlanDocument = pmsStrategicPlanDocument;
        this.pmsResults = pmsResults;
    }

    /** default constructor */
    public PmsObjectiv() {
    }

    /** minimal constructor */
    public PmsObjectiv(String objId, String objDesc, java.util.Date objDefineDate, String objStatus, java.util.Date objCloseDate, String ojbUserId, String username, java.util.Date timeStamp, PmsStrategicPlanDocument pmsStrategicPlanDocument, Set pmsResults) {
        this.objId = objId;
        this.objDesc = objDesc;
        this.objDefineDate = objDefineDate;
        this.objStatus = objStatus;
        this.objCloseDate = objCloseDate;
        this.ojbUserId = ojbUserId;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsStrategicPlanDocument = pmsStrategicPlanDocument;
        this.pmsResults = pmsResults;
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

    public PmsStrategicPlanDocument getPmsStrategicPlanDocument() {
        return this.pmsStrategicPlanDocument;
    }

    public void setPmsStrategicPlanDocument(PmsStrategicPlanDocument pmsStrategicPlanDocument) {
        this.pmsStrategicPlanDocument = pmsStrategicPlanDocument;
    }

    public Set getPmsResults() {
        return this.pmsResults;
    }

    public void setPmsResults(Set pmsResults) {
        this.pmsResults = pmsResults;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("objId", getObjId())
            .toString();
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
