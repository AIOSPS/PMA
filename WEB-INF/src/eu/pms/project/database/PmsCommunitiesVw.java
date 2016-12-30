package eu.pms.project.database;

import java.io.Serializable;


/** @author Hibernate CodeGenerator */
public class PmsCommunitiesVw implements Serializable {
    private String comId;
    private String comName;
    private String typDesc;
    private String govDesc;
    private String govId;
    private String comPcbsCode;
    private String comOchaCode;
    private String comTopology;

    /** default constructor */
    public PmsCommunitiesVw() {
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getTypDesc() {
        return typDesc;
    }

    public void setTypDesc(String typDesc) {
        this.typDesc = typDesc;
    }

    public String getGovDesc() {
        return govDesc;
    }

    public void setGovDesc(String govDesc) {
        this.govDesc = govDesc;
    }

    public String getGovId() {
        return govId;
    }

    public void setGovId(String govId) {
        this.govId = govId;
    }

    public String getComPcbsCode() {
        return comPcbsCode;
    }

    public void setComPcbsCode(String comPcbsCode) {
        this.comPcbsCode = comPcbsCode;
    }

    public String getComOchaCode() {
        return comOchaCode;
    }

    public void setComOchaCode(String comOchaCode) {
        this.comOchaCode = comOchaCode;
    }

    public String getComTopology() {
        return comTopology;
    }

    public void setComTopology(String comTopology) {
        this.comTopology = comTopology;
    }
}
