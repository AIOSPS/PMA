package eu.pms.project.database;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/** @author Hibernate CodeGenerator */
public class PmsInterventionVwPK implements Serializable {

    private String intId;
    private String secId;
    private String masId;

    /** full constructor */
    public PmsInterventionVwPK(String intId, String secId, String masId) {
        this.intId = intId;
        this.secId = secId;
        this.masId = masId;
    }

    /** default constructor */
    public PmsInterventionVwPK() {
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

    public String getMasId() {
        return masId;
    }

    public void setMasId(String masId) {
        this.masId = masId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("intId", getIntId())
            .append("secId", getSecId())
            .append("masId", getSecId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsInterventionVwPK) ) return false;
        PmsInterventionVwPK castOther = (PmsInterventionVwPK) other;
        return new EqualsBuilder()
            .append(this.getIntId(), castOther.getIntId())
            .append(this.getSecId(), castOther.getSecId())
            .append(this.getMasId(), castOther.getMasId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getIntId())
            .append(getSecId())
            .append(getMasId())

            .toHashCode();
    }

}
