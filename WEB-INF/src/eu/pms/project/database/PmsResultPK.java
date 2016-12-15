package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsResultPK implements Serializable {

    /** identifier field */
    private String resId;

    /** identifier field */
    private String objId;
    private String compId;

    /** full constructor */
    public PmsResultPK(String resId, String objId) {
        this.resId = resId;
        this.objId = objId;
        this.compId = resId+"_"+objId;
    }

    /** default constructor */
    public PmsResultPK() {
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

    public String getCompId() {
        return resId+"_"+objId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("resId", getResId())
            .append("objId", getObjId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsResultPK) ) return false;
        PmsResultPK castOther = (PmsResultPK) other;
        return new EqualsBuilder()
            .append(this.getResId(), castOther.getResId())
            .append(this.getObjId(), castOther.getObjId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getResId())
            .append(getObjId())
            .toHashCode();
    }

}
