package eu.pms.project.database;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/** @author Hibernate CodeGenerator */
public class PmsProjectsBenificiaryPK implements Serializable {

    private String proId;
    private String benId;

    /** default constructor */
    public PmsProjectsBenificiaryPK() {
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getBenId() {
        return benId;
    }

    public void setBenId(String benId) {
        this.benId = benId;
    }
}
