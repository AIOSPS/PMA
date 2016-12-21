package eu.pms.project.database;

import java.io.Serializable;

/** @author Hibernate CodeGenerator */
public class PmsClusterTyp implements Serializable {

    private String cluId;
    private String cluType;
    private String cluDesc;
    private String username;
    private java.util.Date timeStamp;


    /** default constructor */
    public PmsClusterTyp() {
    }


    public String getCluId() {
        return cluId;
    }

    public void setCluId(String cluId) {
        this.cluId = cluId;
    }

    public String getCluType() {
        return cluType;
    }

    public void setCluType(String cluType) {
        this.cluType = cluType;
    }

    public String getCluDesc() {
        return this.cluDesc;
    }

    public void setCluDesc(String cluDesc) {
        this.cluDesc = cluDesc;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public java.util.Date getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(java.util.Date timeStamp) {
        this.timeStamp = timeStamp;
    }


}
