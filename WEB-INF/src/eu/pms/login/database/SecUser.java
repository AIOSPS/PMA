package eu.pms.login.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class SecUser implements Serializable {

    /** identifier field */
    private String usrId;

    /** nullable persistent field */
    private String usrPassword;

    /** persistent field */
    private String usrStatus;

    /** nullable persistent field */
    private String usrName;

    /** nullable persistent field */
    private String usrEmail;

    /** nullable persistent field */
    private String usrMobile;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private Set secUserRoles;

    /** full constructor */
    public SecUser(String usrId, String usrPassword, String usrStatus, String usrName, String usrEmail, String usrMobile, String username, java.util.Date timeStamp, Set secUserRoles) {
        this.usrId = usrId;
        this.usrPassword = usrPassword;
        this.usrStatus = usrStatus;
        this.usrName = usrName;
        this.usrEmail = usrEmail;
        this.usrMobile = usrMobile;
        this.username = username;
        this.timeStamp = timeStamp;
        this.secUserRoles = secUserRoles;
    }

    /** default constructor */
    public SecUser() {
    }

    /** minimal constructor */
    public SecUser(String usrId, String usrStatus, String username, java.util.Date timeStamp, Set secUserRoles) {
        this.usrId = usrId;
        this.usrStatus = usrStatus;
        this.username = username;
        this.timeStamp = timeStamp;
        this.secUserRoles = secUserRoles;
    }

    public String getUsrId() {
        return this.usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getUsrPassword() {
        return this.usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }

    public String getUsrStatus() {
        return this.usrStatus;
    }

    public void setUsrStatus(String usrStatus) {
        this.usrStatus = usrStatus;
    }

    public String getUsrName() {
        return this.usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getUsrEmail() {
        return this.usrEmail;
    }

    public void setUsrEmail(String usrEmail) {
        this.usrEmail = usrEmail;
    }

    public String getUsrMobile() {
        return this.usrMobile;
    }

    public void setUsrMobile(String usrMobile) {
        this.usrMobile = usrMobile;
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

    public Set getSecUserRoles() {
        return this.secUserRoles;
    }

    public void setSecUserRoles(Set secUserRoles) {
        this.secUserRoles = secUserRoles;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("usrId", getUsrId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof SecUser) ) return false;
        SecUser castOther = (SecUser) other;
        return new EqualsBuilder()
            .append(this.getUsrId(), castOther.getUsrId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getUsrId())
            .toHashCode();
    }

}
