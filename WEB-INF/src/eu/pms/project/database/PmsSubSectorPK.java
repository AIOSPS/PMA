package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsSubSectorPK implements Serializable {

    private String subId;
    private String secId;
    /** full constructor */
    public PmsSubSectorPK(String subId, String secId) {
        this.subId = subId;
        this.secId = secId;
    }

    /** default constructor */
    public PmsSubSectorPK() {
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
            .append("subId", getSubId())
            .append("secId", getSecId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsSubSectorPK) ) return false;
        PmsSubSectorPK castOther = (PmsSubSectorPK) other;
        return new EqualsBuilder()
            .append(this.getSubId(), castOther.getSubId())
            .append(this.getSecId(), castOther.getSecId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getSubId())
            .append(getSecId())
            .toHashCode();
    }

}
