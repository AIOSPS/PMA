package btc.pma.programme.database;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by PC on 8/24/2017.
 */
public class PmaActivityBeneficiarPK implements Serializable {

    /** identifier field */
    private String actvNo;

    /** identifier field */
    private String intrNo;

    /** identifier field */
    private String btpId;

    /** full constructor */
    public PmaActivityBeneficiarPK(String actvNo, String intrNo, String btpId) {
        this.actvNo = actvNo;
        this.intrNo = intrNo;
        this.btpId =btpId;
    }

    /** default constructor */
    public PmaActivityBeneficiarPK() {
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

    public String getBtpId() {
        return btpId;
    }

    public void setBtpId(String btpId) {
        this.btpId = btpId;
    }

    public String toString() {
        return new ToStringBuilder(this)
                .append("actvNo", getActvNo())
                .append("intrNo", getIntrNo())
                .append("btpId", getBtpId())
                .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmaActivityBeneficiarPK) ) return false;
        PmaActivityBeneficiarPK castOther = (PmaActivityBeneficiarPK) other;
        return new EqualsBuilder()
                .append(this.getActvNo(), castOther.getActvNo())
                .append(this.getIntrNo(), castOther.getIntrNo())
                .append(this.getBtpId(), castOther.getBtpId())
                .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
                .append(getActvNo())
                .append(getIntrNo())
                .append(getBtpId())
                .toHashCode();
    }

}