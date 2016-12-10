package eu.pms.project.database;

import java.io.Serializable;

/** @author Hibernate CodeGenerator */
public class PmsProjectsIndicatorPK implements Serializable {

    private String proId;
    private String indId;
    private String resId;
    private String objId;

    public PmsProjectsIndicatorPK() {
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getIndId() {
        return indId;
    }

    public void setIndId(String indId) {
        this.indId = indId;
    }

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }

    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }
}
