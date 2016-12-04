package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsIndicatorPK implements Serializable {

    /** identifier field */
    private String indId;

    /** identifier field */
    private String resId;

    /** identifier field */
    private String objId;

    /** full constructor */
    public PmsIndicatorPK(String indId, String resId, String objId) {
        this.indId = indId;
        this.resId = resId;
        this.objId = objId;
    }

    /** default constructor */
    public PmsIndicatorPK() {
    }

    public String getIndId() {
        return this.indId;
    }

    public void setIndId(String indId) {
        this.indId = indId;
    }

    public String getResId() {
        return this.resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }

    public String getObjId() {
        return this.objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("indId", getIndId())
            .append("resId", getResId())
            .append("objId", getObjId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsIndicatorPK) ) return false;
        PmsIndicatorPK castOther = (PmsIndicatorPK) other;
        return new EqualsBuilder()
            .append(this.getIndId(), castOther.getIndId())
            .append(this.getResId(), castOther.getResId())
            .append(this.getObjId(), castOther.getObjId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getIndId())
            .append(getResId())
            .append(getObjId())
            .toHashCode();
    }

}
