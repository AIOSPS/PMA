package eu.pms.project.database;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/** @author Hibernate CodeGenerator */
public class PmsMasterPlanDonorPK implements Serializable {

    private String masId;
    private String donId;

    /** default constructor */
    public PmsMasterPlanDonorPK() {
    }

    public String getMasId() {
        return masId;
    }

    public void setMasId(String masId) {
        this.masId = masId;
    }

    public String getDonId() {
        return donId;
    }

    public void setDonId(String donId) {
        this.donId = donId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
