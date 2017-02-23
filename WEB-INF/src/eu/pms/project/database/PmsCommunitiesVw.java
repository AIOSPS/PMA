package eu.pms.project.database;

import java.io.Serializable;
import java.math.BigDecimal;


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
    private String comFullName;
    private BigDecimal comLatitude;
    private BigDecimal comLongitude;

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

    public String getComFullName() {
        return comFullName;
    }

    public void setComFullName(String comFullName) {
        this.comFullName = comFullName;
    }

    public BigDecimal getComLatitude() {
        return comLatitude;
    }

    public void setComLatitude(BigDecimal comLatitude) {
        this.comLatitude = comLatitude;
    }

    public BigDecimal getComLongitude() {
        return comLongitude;
    }

    public void setComLongitude(BigDecimal comLongitude) {
        this.comLongitude = comLongitude;
    }
}
