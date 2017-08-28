package btc.pma.programme.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmaActivityBeneficiar implements Serializable {

    /** nullable persistent field */
    private String beneCount;

    /** nullable persistent field */
    private String username;

    /** nullable persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private PmaActivityBeneficiarPK comp_id;



    /** full constructor */
    public PmaActivityBeneficiar(String beneCount, String username, java.util.Date timeStamp, PmaActivityBeneficiarPK comp_id) {
        this.beneCount = beneCount;
        this.username = username;
        this.timeStamp = timeStamp;
        this.comp_id = comp_id;
    }

    /** default constructor */
    public PmaActivityBeneficiar() {
    }


    public String getBeneCount() {
        return this.beneCount;
    }

    public void setBeneCount(String beneCount) {
        this.beneCount = beneCount;
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

    public PmaActivityBeneficiarPK getComp_id() {
        return comp_id;
    }

    public void setComp_id(PmaActivityBeneficiarPK comp_id) {
        this.comp_id = comp_id;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
