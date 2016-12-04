package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsInterventionPK implements Serializable {

    /** identifier field */
    private String intId;

    /** identifier field */
    private String subId;

    /** identifier field */
    private String secId;

    /** full constructor */
    public PmsInterventionPK(String intId, String subId, String secId) {
        this.intId = intId;
        this.subId = subId;
        this.secId = secId;
    }

    /** default constructor */
    public PmsInterventionPK() {
    }

    public String getIntId() {
        return this.intId;
    }

    public void setIntId(String intId) {
        this.intId = intId;
    }

    public String getSubId() {
        return this.subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public String getSecId() {
        return this.secId;
    }

    public void setSecId(String secId) {
        this.secId = secId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("intId", getIntId())
            .append("subId", getSubId())
            .append("secId", getSecId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsInterventionPK) ) return false;
        PmsInterventionPK castOther = (PmsInterventionPK) other;
        return new EqualsBuilder()
            .append(this.getIntId(), castOther.getIntId())
            .append(this.getSubId(), castOther.getSubId())
            .append(this.getSecId(), castOther.getSecId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getIntId())
            .append(getSubId())
            .append(getSecId())
            .toHashCode();
    }

}
