package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsActivityPK implements Serializable {

    /** identifier field */
    private String actId;

    /** identifier field */
    private String intId;

    /** identifier field */
    private String secId;

    /** full constructor */
    public PmsActivityPK(String actId, String intId, String secId) {
        this.actId = actId;
        this.intId = intId;
        this.secId = secId;
    }

    /** default constructor */
    public PmsActivityPK() {
    }

    public String getActId() {
        return this.actId;
    }

    public void setActId(String actId) {
        this.actId = actId;
    }

    public String getIntId() {
        return this.intId;
    }

    public void setIntId(String intId) {
        this.intId = intId;
    }

    public String getSecId() {
        return this.secId;
    }

    public void setSecId(String secId) {
        this.secId = secId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("actId", getActId())
            .append("intId", getIntId())
            .append("secId", getSecId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsActivityPK) ) return false;
        PmsActivityPK castOther = (PmsActivityPK) other;
        return new EqualsBuilder()
            .append(this.getActId(), castOther.getActId())
            .append(this.getIntId(), castOther.getIntId())
            .append(this.getSecId(), castOther.getSecId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getActId())
            .append(getIntId())
            .append(getSecId())
            .toHashCode();
    }

}
