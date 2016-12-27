package eu.pms.project.database;

import java.io.Serializable;

/**
 * @author Hibernate CodeGenerator
 */
public class PmsProjectAlbumPK implements Serializable {

    private String proId;
    private String albId;


    /**
     * default constructor
     */
    public PmsProjectAlbumPK() {
    }

    public PmsProjectAlbumPK(String proId) {
        this.proId = proId;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getAlbId() {
        return albId;
    }

    public void setAlbId(String albId) {
        this.albId = albId;
    }
}
