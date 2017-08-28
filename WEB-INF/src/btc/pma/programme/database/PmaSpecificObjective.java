package btc.pma.programme.database;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmaSpecificObjective implements Serializable {

    /** identifier field */
    private String sobjNo;

    /** nullable persistent field */
    private String sobjDescription;

    /** nullable persistent field */
    private java.util.Date sobjDefineDate;

    /** nullable persistent field */
    private java.util.Date sobjAdaptationDate;

    /** nullable persistent field */
    private String sobjRelatedDocuments;

    /** nullable persistent field */
    private String username;

    /** nullable persistent field */
    private java.util.Date timeStamp;

    /** full constructor */
    public PmaSpecificObjective(String sobjNo, String sobjDescription, java.util.Date sobjDefineDate, java.util.Date sobjAdaptationDate, String sobjRelatedDocuments, String username, java.util.Date timeStamp) {
        this.sobjNo = sobjNo;
        this.sobjDescription = sobjDescription;
        this.sobjDefineDate = sobjDefineDate;
        this.sobjAdaptationDate = sobjAdaptationDate;
        this.sobjRelatedDocuments = sobjRelatedDocuments;
        this.username = username;
        this.timeStamp = timeStamp;
    }

    /** default constructor */
    public PmaSpecificObjective() {
    }

    public String getSobjNo() {
        return this.sobjNo;
    }

    public void setSobjNo(String sobjNo) {
        this.sobjNo = sobjNo;
    }

    public String getSobjDescription() {
        return this.sobjDescription;
    }

    public void setSobjDescription(String sobjDescription) {
        this.sobjDescription = sobjDescription;
    }

    public java.util.Date getSobjDefineDate() {
        return this.sobjDefineDate;
    }

    public void setSobjDefineDate(java.util.Date sobjDefineDate) {
        this.sobjDefineDate = sobjDefineDate;
    }

    public java.util.Date getSobjAdaptationDate() {
        return this.sobjAdaptationDate;
    }

    public void setSobjAdaptationDate(java.util.Date sobjAdaptationDate) {
        this.sobjAdaptationDate = sobjAdaptationDate;
    }

    public String getSobjRelatedDocuments() {
        return this.sobjRelatedDocuments;
    }

    public void setSobjRelatedDocuments(String sobjRelatedDocuments) {
        this.sobjRelatedDocuments = sobjRelatedDocuments;
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
            .append("sobjNo", getSobjNo())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmaSpecificObjective) ) return false;
        PmaSpecificObjective castOther = (PmaSpecificObjective) other;
        return new EqualsBuilder()
            .append(this.getSobjNo(), castOther.getSobjNo())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getSobjNo())
            .toHashCode();
    }

}
