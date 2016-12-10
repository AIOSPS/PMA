package eu.pms.login.database;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/** @author Hibernate CodeGenerator */
public class SecUserRolePK implements Serializable {

private String userId;
    private Integer roleId;

    /** default constructor */
    public SecUserRolePK() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
