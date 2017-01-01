package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsProjectsBenificiary implements Serializable {

    private PmsProjectsBenificiaryPK compId;
    private int benTotal;
    private String username;
    private java.util.Date timeStamp;

    /** default constructor */
    public PmsProjectsBenificiary() {
    }

    public int getBenTotal() {
        return benTotal;
    }

    public void setBenTotal(int benTotal) {
        this.benTotal = benTotal;
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

    public PmsProjectsBenificiaryPK getCompId() {
        return compId;
    }

    public void setCompId(PmsProjectsBenificiaryPK compId) {
        this.compId = compId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
