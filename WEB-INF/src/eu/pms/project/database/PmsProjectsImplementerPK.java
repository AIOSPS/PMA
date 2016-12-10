package eu.pms.project.database;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/** @author Hibernate CodeGenerator */
public class PmsProjectsImplementerPK implements Serializable {

    private String proId;
    private String impId;

    /** default constructor */
    public PmsProjectsImplementerPK() {
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getImpId() {
        return impId;
    }

    public void setImpId(String impId) {
        this.impId = impId;
    }
}
