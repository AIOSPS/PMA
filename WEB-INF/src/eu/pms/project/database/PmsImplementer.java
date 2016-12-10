package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsImplementer implements Serializable {

    private String impId;
    private String conId;
    private String impName;
    private String impType;
    private String impAbbName;
    private String username;
    private java.util.Date timeStamp;


    /** default constructor */
    public PmsImplementer() {
    }

    public String getImpId() {
        return this.impId;
    }

    public void setImpId(String impId) {
        this.impId = impId;
    }

    public String getImpName() {
        return this.impName;
    }

    public void setImpName(String impName) {
        this.impName = impName;
    }

    public String getImpType() {
        return this.impType;
    }

    public void setImpType(String impType) {
        this.impType = impType;
    }

    public String getImpAbbName() {
        return this.impAbbName;
    }

    public void setImpAbbName(String impAbbName) {
        this.impAbbName = impAbbName;
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

    public String toString() {
        return new ToStringBuilder(this)
            .append("impId", getImpId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsImplementer) ) return false;
        PmsImplementer castOther = (PmsImplementer) other;
        return new EqualsBuilder()
            .append(this.getImpId(), castOther.getImpId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getImpId())
            .toHashCode();
    }

}
