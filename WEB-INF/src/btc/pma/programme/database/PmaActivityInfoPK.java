package btc.pma.programme.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmaActivityInfoPK implements Serializable {

    /** identifier field */
    private String actvNo;

    /** identifier field */
    private String intrNo;

    /** full constructor */
    public PmaActivityInfoPK(String actvNo, String intrNo) {
        this.actvNo = actvNo;
        this.intrNo = intrNo;
    }

    /** default constructor */
    public PmaActivityInfoPK() {
    }

    public String getActvNo() {
        return this.actvNo;
    }

    public void setActvNo(String actvNo) {
        this.actvNo = actvNo;
    }

    public String getIntrNo() {
        return this.intrNo;
    }

    public void setIntrNo(String intrNo) {
        this.intrNo = intrNo;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("actvNo", getActvNo())
            .append("intrNo", getIntrNo())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmaActivityInfoPK) ) return false;
        PmaActivityInfoPK castOther = (PmaActivityInfoPK) other;
        return new EqualsBuilder()
            .append(this.getActvNo(), castOther.getActvNo())
            .append(this.getIntrNo(), castOther.getIntrNo())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getActvNo())
            .append(getIntrNo())
            .toHashCode();
    }

}
