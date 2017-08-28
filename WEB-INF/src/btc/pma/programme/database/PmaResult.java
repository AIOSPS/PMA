package btc.pma.programme.database;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmaResult implements Serializable {

    /** identifier field */
    private String rsltNo;

    /** nullable persistent field */
    private String rsltTitle;

    /** nullable persistent field */
    private java.util.Date rsltDefineDate;

    /** nullable persistent field */
    private java.util.Date rsltCloseDate;

    /** nullable persistent field */
    private String rsltStatus;

    /** nullable persistent field */
    private String rsltLongDescription;

    /** nullable persistent field */
    private String username;

    /** nullable persistent field */
    private java.util.Date timeStamp;

    /** full constructor */
    public PmaResult(String rsltNo, String rsltTitle, java.util.Date rsltDefineDate, java.util.Date rsltCloseDate, String rsltStatus, String rsltLongDescription, String username, java.util.Date timeStamp) {
        this.rsltNo = rsltNo;
        this.rsltTitle = rsltTitle;
        this.rsltDefineDate = rsltDefineDate;
        this.rsltCloseDate = rsltCloseDate;
        this.rsltStatus = rsltStatus;
        this.rsltLongDescription = rsltLongDescription;
        this.username = username;
        this.timeStamp = timeStamp;
    }

    /** default constructor */
    public PmaResult() {
    }


    public String getRsltNo() {
        return this.rsltNo;
    }

    public void setRsltNo(String rsltNo) {
        this.rsltNo = rsltNo;
    }

    public String getRsltTitle() {
        return this.rsltTitle;
    }

    public void setRsltTitle(String rsltTitle) {
        this.rsltTitle = rsltTitle;
    }

    public java.util.Date getRsltDefineDate() {
        return this.rsltDefineDate;
    }

    public void setRsltDefineDate(java.util.Date rsltDefineDate) {
        this.rsltDefineDate = rsltDefineDate;
    }

    public java.util.Date getRsltCloseDate() {
        return this.rsltCloseDate;
    }

    public void setRsltCloseDate(java.util.Date rsltCloseDate) {
        this.rsltCloseDate = rsltCloseDate;
    }

    public String getRsltStatus() {
        return this.rsltStatus;
    }

    public void setRsltStatus(String rsltStatus) {
        this.rsltStatus = rsltStatus;
    }

    public String getRsltLongDescription() {
        return this.rsltLongDescription;
    }

    public void setRsltLongDescription(String rsltLongDescription) {
        this.rsltLongDescription = rsltLongDescription;
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
            .append("rsltNo", getRsltNo())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmaResult) ) return false;
        PmaResult castOther = (PmaResult) other;
        return new EqualsBuilder()
            .append(this.getRsltNo(), castOther.getRsltNo())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getRsltNo())
            .toHashCode();
    }

}
