package eu.pms.project.database;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @author Hibernate CodeGenerator
 */
public class PmsProjectsLocationPK implements Serializable {

    private String proId;
    private String locId;

    /**
     * default constructor
     */
    public PmsProjectsLocationPK() {
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
    }
}
