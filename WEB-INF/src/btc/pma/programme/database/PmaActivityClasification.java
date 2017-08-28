package btc.pma.programme.database;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmaActivityClasification implements Serializable {

    /** identifier field */
    private String clasCode;

    /** nullable persistent field */
    private String clasDescription;

    /** nullable persistent field */
    private String clasType;

    /** nullable persistent field */
    private String username;

    /** nullable persistent field */
    private java.util.Date timeStamp;

    /** full constructor */
    public PmaActivityClasification(String clasCode, String clasDescription, String clasType, String username, java.util.Date timeStamp) {
        this.clasCode = clasCode;
        this.clasDescription = clasDescription;
        this.clasType = clasType;
        this.username = username;
        this.timeStamp = timeStamp;
    }

    /** default constructor */
    public PmaActivityClasification() {
    }


    public String getClasCode() {
        return this.clasCode;
    }

    public void setClasCode(String clasCode) {
        this.clasCode = clasCode;
    }

    public String getClasDescription() {
        return this.clasDescription;
    }

    public void setClasDescription(String clasDescription) {
        this.clasDescription = clasDescription;
    }

    public String getClasType() {
        return this.clasType;
    }

    public void setClasType(String clasType) {
        this.clasType = clasType;
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
            .append("clasCode", getClasCode())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmaActivityClasification) ) return false;
        PmaActivityClasification castOther = (PmaActivityClasification) other;
        return new EqualsBuilder()
            .append(this.getClasCode(), castOther.getClasCode())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getClasCode())
            .toHashCode();
    }

}
