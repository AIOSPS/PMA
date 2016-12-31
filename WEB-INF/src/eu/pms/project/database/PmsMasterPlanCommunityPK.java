package eu.pms.project.database;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/** @author Hibernate CodeGenerator */
public class PmsMasterPlanCommunityPK implements Serializable {
    private String masId;
    private String comId;


    /** default constructor */
    public PmsMasterPlanCommunityPK() {
    }

    public String getMasId() {
        return masId;
    }

    public void setMasId(String masId) {
        this.masId = masId;
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
