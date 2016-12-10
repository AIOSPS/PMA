package eu.pms.project.database;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/** @author Hibernate CodeGenerator */
public class PmsProjectsCommunityPK implements Serializable {

    private String proId;
    private String comId;
    /** default constructor */
    public PmsProjectsCommunityPK() {
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }
}
