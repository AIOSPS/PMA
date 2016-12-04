package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsClusterTypPK implements Serializable {

    /** identifier field */
    private String cluId;

    /** identifier field */
    private String cluType;

    /** full constructor */
    public PmsClusterTypPK(String cluId, String cluType) {
        this.cluId = cluId;
        this.cluType = cluType;
    }

    /** default constructor */
    public PmsClusterTypPK() {
    }

    public String getCluId() {
        return this.cluId;
    }

    public void setCluId(String cluId) {
        this.cluId = cluId;
    }

    public String getCluType() {
        return this.cluType;
    }

    public void setCluType(String cluType) {
        this.cluType = cluType;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("cluId", getCluId())
            .append("cluType", getCluType())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsClusterTypPK) ) return false;
        PmsClusterTypPK castOther = (PmsClusterTypPK) other;
        return new EqualsBuilder()
            .append(this.getCluId(), castOther.getCluId())
            .append(this.getCluType(), castOther.getCluType())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getCluId())
            .append(getCluType())
            .toHashCode();
    }

}
