package eu.pms.login.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class SecRole implements Serializable {

    /** identifier field */
    private Integer rolId;

    /** persistent field */
    private String rolName;

    /** nullable persistent field */
    private String rolADesc;

    /** nullable persistent field */
    private String rolLDesc;

    /** nullable persistent field */
    private String rolStatus;

    /** nullable persistent field */
    private String rolCat;

    /** persistent field */
    private Set secUserRoles;

    /** full constructor */
    public SecRole(Integer rolId, String rolName, String rolADesc, String rolLDesc, String rolStatus, String rolCat, Set secUserRoles) {
        this.rolId = rolId;
        this.rolName = rolName;
        this.rolADesc = rolADesc;
        this.rolLDesc = rolLDesc;
        this.rolStatus = rolStatus;
        this.rolCat = rolCat;
        this.secUserRoles = secUserRoles;
    }

    /** default constructor */
    public SecRole() {
    }

    /** minimal constructor */
    public SecRole(Integer rolId, String rolName, Set secUserRoles) {
        this.rolId = rolId;
        this.rolName = rolName;
        this.secUserRoles = secUserRoles;
    }

    public Integer getRolId() {
        return this.rolId;
    }

    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }

    public String getRolName() {
        return this.rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

    public String getRolADesc() {
        return this.rolADesc;
    }

    public void setRolADesc(String rolADesc) {
        this.rolADesc = rolADesc;
    }

    public String getRolLDesc() {
        return this.rolLDesc;
    }

    public void setRolLDesc(String rolLDesc) {
        this.rolLDesc = rolLDesc;
    }

    public String getRolStatus() {
        return this.rolStatus;
    }

    public void setRolStatus(String rolStatus) {
        this.rolStatus = rolStatus;
    }

    public String getRolCat() {
        return this.rolCat;
    }

    public void setRolCat(String rolCat) {
        this.rolCat = rolCat;
    }

    public Set getSecUserRoles() {
        return this.secUserRoles;
    }

    public void setSecUserRoles(Set secUserRoles) {
        this.secUserRoles = secUserRoles;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("rolId", getRolId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof SecRole) ) return false;
        SecRole castOther = (SecRole) other;
        return new EqualsBuilder()
            .append(this.getRolId(), castOther.getRolId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getRolId())
            .toHashCode();
    }

}
