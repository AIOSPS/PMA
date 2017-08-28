package btc.pma.programme.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmaActivityImplementer implements Serializable {

    /** persistent field */
    private PmaActivityImplementerPK comp_id;

    /** persistent field */
    private String comId;

    /** persistent field */
    private long implCost;

    /** nullable persistent field */
    private String username;

    /** nullable persistent field */
    private java.util.Date timeStamp;


    /** full constructor */
    public PmaActivityImplementer(PmaActivityImplementerPK comp_id, String comId, long implCost, String username, java.util.Date timeStamp) {
        this.implCost = implCost;
        this.username = username;
        this.timeStamp = timeStamp;
        this.comId = comId;
        this.comp_id = comp_id;

    }

    /** default constructor */
    public PmaActivityImplementer() {
    }

    public long getImplCost() {
        return this.implCost;
    }

    public void setImplCost(long implCost) {
        this.implCost = implCost;
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

    public PmaActivityImplementerPK getComp_id() {
        return comp_id;
    }

    public void setComp_id(PmaActivityImplementerPK comp_id) {
        this.comp_id = comp_id;
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
