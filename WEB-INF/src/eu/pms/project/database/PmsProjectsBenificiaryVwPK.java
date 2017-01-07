package eu.pms.project.database;

import java.io.Serializable;

/** @author Hibernate CodeGenerator */
public class PmsProjectsBenificiaryVwPK implements Serializable {

    private String proId;
    private String btpId;

    /** default constructor */
    public PmsProjectsBenificiaryVwPK() {
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getBtpId() {
        return btpId;
    }

    public void setBtpId(String btpId) {
        this.btpId = btpId;
    }
}
