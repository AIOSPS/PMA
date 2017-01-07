package eu.pms.project.database;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/** @author Hibernate CodeGenerator */
public class PmsProjectsBenificiaryVw implements Serializable {

    private PmsProjectsBenificiaryVwPK compId;
    private int benTotal;
    private String btnDesc;
    private String username;
    private java.util.Date timeStamp;

    /** default constructor */
    public PmsProjectsBenificiaryVw() {
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

    public PmsProjectsBenificiaryVwPK getCompId() {
        return compId;
    }

    public void setCompId(PmsProjectsBenificiaryVwPK compId) {
        this.compId = compId;
    }

    public String getBtnDesc() {
        return btnDesc;
    }

    public void setBtnDesc(String btnDesc) {
        this.btnDesc = btnDesc;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
