package eu.pms.project.database;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @author Hibernate CodeGenerator
 */
public class PmsProjectsLocationPK implements Serializable {

    private String proId;
    private java.math.BigDecimal comLatitude;
    private java.math.BigDecimal comLongitude;

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

    public java.math.BigDecimal getComLatitude() {
        return comLatitude;
    }

    public void setComLatitude(java.math.BigDecimal comLatitude) {
        this.comLatitude = comLatitude;
    }

    public java.math.BigDecimal getComLongitude() {
        return comLongitude;
    }

    public void setComLongitude(java.math.BigDecimal comLongitude) {
        this.comLongitude = comLongitude;
    }
}
