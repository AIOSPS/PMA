package btc.pma.programme.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmaIndicatorDetailPK implements Serializable {

    /** identifier field */
    private String indrNo;

    /** identifier field */
    private java.util.Date idtlMeasureDate;

    /** full constructor */
    public PmaIndicatorDetailPK(String indrNo, java.util.Date idtlMeasureDate) {
        this.indrNo = indrNo;
        this.idtlMeasureDate = idtlMeasureDate;
    }

    /** default constructor */
    public PmaIndicatorDetailPK() {
    }

    public String getIndrNo() {
        return this.indrNo;
    }

    public void setIndrNo(String indrNo) {
        this.indrNo = indrNo;
    }

    public java.util.Date getIdtlMeasureDate() {
        return this.idtlMeasureDate;
    }

    public void setIdtlMeasureDate(java.util.Date idtlMeasureDate) {
        this.idtlMeasureDate = idtlMeasureDate;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("indrNo", getIndrNo())
            .append("idtlMeasureDate", getIdtlMeasureDate())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmaIndicatorDetailPK) ) return false;
        PmaIndicatorDetailPK castOther = (PmaIndicatorDetailPK) other;
        return new EqualsBuilder()
            .append(this.getIndrNo(), castOther.getIndrNo())
            .append(this.getIdtlMeasureDate(), castOther.getIdtlMeasureDate())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getIndrNo())
            .append(getIdtlMeasureDate())
            .toHashCode();
    }

}
