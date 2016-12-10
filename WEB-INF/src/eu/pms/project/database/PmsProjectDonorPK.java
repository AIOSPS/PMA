package eu.pms.project.database;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @author Hibernate CodeGenerator
 */
public class PmsProjectDonorPK implements Serializable {

    private String proId;
    private String donId;


    /**
     * default constructor
     */
    public PmsProjectDonorPK() {
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getDonId() {
        return donId;
    }

    public void setDonId(String donId) {
        this.donId = donId;
    }
}
