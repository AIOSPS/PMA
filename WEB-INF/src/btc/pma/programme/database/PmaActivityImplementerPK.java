package btc.pma.programme.database;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by PC on 8/24/2017.
 */
public class PmaActivityImplementerPK implements Serializable {

    /** identifier field */
    private String actvNo;

    /** identifier field */
    private String intrNo;

    /** identifier field */
    private String impId;

    /** full constructor */
    public PmaActivityImplementerPK(String actvNo, String intrNo, String impId) {
        this.actvNo = actvNo;
        this.intrNo = intrNo;
        this.impId =impId;
    }

    /** default constructor */
    public PmaActivityImplementerPK() {
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

    public String getImpId() {
        return impId;
    }

    public void setImpId(String impId) {
        this.impId = impId;
    }

    public String toString() {
        return new ToStringBuilder(this)
                .append("actvNo", getActvNo())
                .append("intrNo", getIntrNo())
                .append("impId", getImpId())
                .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmaActivityImplementerPK) ) return false;
        PmaActivityImplementerPK castOther = (PmaActivityImplementerPK) other;
        return new EqualsBuilder()
                .append(this.getActvNo(), castOther.getActvNo())
                .append(this.getIntrNo(), castOther.getIntrNo())
                .append(this.getImpId(), castOther.getImpId())
                .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
                .append(getActvNo())
                .append(getIntrNo())
                .append(getImpId())
                .toHashCode();
    }

}
