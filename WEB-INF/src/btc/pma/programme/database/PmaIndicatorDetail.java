package btc.pma.programme.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmaIndicatorDetail implements Serializable {

    /** identifier field */
    private PmaIndicatorDetailPK comp_id;

    /** nullable persistent field */
    private String idtlValue;

    /** nullable persistent field */
    private String username;

    /** nullable persistent field */
    private java.util.Date timeStamp;


    /** full constructor */
    public PmaIndicatorDetail(PmaIndicatorDetailPK comp_id, String idtlValue, String username, java.util.Date timeStamp) {
        this.comp_id = comp_id;
        this.idtlValue = idtlValue;
        this.username = username;
        this.timeStamp = timeStamp;
    }

    /** default constructor */
    public PmaIndicatorDetail() {
    }

    public PmaIndicatorDetailPK getComp_id() {
        return this.comp_id;
    }

    public void setComp_id(PmaIndicatorDetailPK comp_id) {
        this.comp_id = comp_id;
    }

    public String getIdtlValue() {
        return this.idtlValue;
    }

    public void setIdtlValue(String idtlValue) {
        this.idtlValue = idtlValue;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public java.util.Date getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(java.util.Date timeStamp) {
        this.timeStamp = timeStamp;
    }


    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmaIndicatorDetail) ) return false;
        PmaIndicatorDetail castOther = (PmaIndicatorDetail) other;
        return new EqualsBuilder()
            .append(this.getComp_id(), castOther.getComp_id())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getComp_id())
            .toHashCode();
    }

}
