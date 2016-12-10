package eu.pms.login.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class SecUserRole implements Serializable {
private SecUserRolePK compId;
    /** persistent field */
    private SecRole secRole;

    /** persistent field */
    private SecUser secUser;

    /** full constructor */
    public SecUserRole(SecRole secRole, SecUser secUser) {
        this.secRole = secRole;
        this.secUser = secUser;
    }

    /** default constructor */
    public SecUserRole() {
    }

    public SecUserRolePK getCompId() {
        return compId;
    }

    public void setCompId(SecUserRolePK compId) {
        this.compId = compId;
    }

    public SecRole getSecRole() {
        return this.secRole;
    }

    public void setSecRole(SecRole secRole) {
        this.secRole = secRole;
    }

    public SecUser getSecUser() {
        return this.secUser;
    }

    public void setSecUser(SecUser secUser) {
        this.secUser = secUser;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
