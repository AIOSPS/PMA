package eu.pms.login.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class SecUserRole implements Serializable {

    /** persistent field */
    private eu.pms.login.database.SecRole secRole;

    /** persistent field */
    private eu.pms.login.database.SecUser secUser;

    /** full constructor */
    public SecUserRole(eu.pms.login.database.SecRole secRole, eu.pms.login.database.SecUser secUser) {
        this.secRole = secRole;
        this.secUser = secUser;
    }

    /** default constructor */
    public SecUserRole() {
    }

    public eu.pms.login.database.SecRole getSecRole() {
        return this.secRole;
    }

    public void setSecRole(eu.pms.login.database.SecRole secRole) {
        this.secRole = secRole;
    }

    public eu.pms.login.database.SecUser getSecUser() {
        return this.secUser;
    }

    public void setSecUser(eu.pms.login.database.SecUser secUser) {
        this.secUser = secUser;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
