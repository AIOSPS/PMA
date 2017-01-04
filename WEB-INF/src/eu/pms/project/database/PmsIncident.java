package eu.pms.project.database;

import java.io.Serializable;
import java.math.BigDecimal;

import eu.pms.common.tools.DateTool;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsIncident implements Serializable {

    private String incId;
    private String datId;
    private String comId;
    private String proId;
    private String incOchaId;
    private String incDescription;
    private Integer incAffectedWomen;
    private Integer incAffectedMen;
    private Integer incAffectedAdaults;
    private Integer incAffectedChildren;
    private Integer incDisplacedWomen;
    private Integer incDemolishedStructure;
    private String incSourceLink;
    private String incType;
    private java.util.Date incTimeStamp;
    private String incTimeStampStr;
    private java.math.BigDecimal ochaLocLatitude;
    private java.math.BigDecimal ochaLocLongitude;
    private Integer incDisplacedMen;
    private Integer incDisplacedAdult;
    private Integer incDisplacedChildren;
    private java.math.BigDecimal locLatitude;
    private java.math.BigDecimal locLongitude;
    private String username;
    private java.util.Date timeStamp;


    /** default constructor */
    public PmsIncident() {
    }


    public String getIncId() {
        return this.incId;
    }

    public void setIncId(String incId) {
        this.incId = incId;
    }

    public String getIncOchaId() {
        return this.incOchaId;
    }

    public void setIncOchaId(String incOchaId) {
        this.incOchaId = incOchaId;
    }

    public String getIncDescription() {
        return this.incDescription;
    }

    public void setIncDescription(String incDescription) {
        this.incDescription = incDescription;
    }

    public int getIncAffectedWomen() {
        return this.incAffectedWomen;
    }

    public void setIncAffectedWomen(int incAffectedWomen) {
        this.incAffectedWomen = incAffectedWomen;
    }

    public int getIncAffectedMen() {
        return this.incAffectedMen;
    }

    public void setIncAffectedMen(int incAffectedMen) {
        this.incAffectedMen = incAffectedMen;
    }

    public int getIncAffectedAdaults() {
        return this.incAffectedAdaults;
    }

    public void setIncAffectedAdaults(int incAffectedAdaults) {
        this.incAffectedAdaults = incAffectedAdaults;
    }

    public int getIncAffectedChildren() {
        return this.incAffectedChildren;
    }

    public void setIncAffectedChildren(int incAffectedChildren) {
        this.incAffectedChildren = incAffectedChildren;
    }

    public int getIncDisplacedWomen() {
        return this.incDisplacedWomen;
    }

    public void setIncDisplacedWomen(int incDisplacedWomen) {
        this.incDisplacedWomen = incDisplacedWomen;
    }

    public int getIncDemolishedStructure() {
        return this.incDemolishedStructure;
    }

    public void setIncDemolishedStructure(int incDemolishedStructure) {
        this.incDemolishedStructure = incDemolishedStructure;
    }

    public String getIncSourceLink() {
        return this.incSourceLink;
    }

    public void setIncSourceLink(String incSourceLink) {
        this.incSourceLink = incSourceLink;
    }

    public String getIncType() {
        return incType;
    }

    public void setIncType(String incType) {
        this.incType = incType;
    }

    public java.util.Date getIncTimeStamp() {
        return this.incTimeStamp;
    }

    public void setIncTimeStamp(java.util.Date incTimeStamp) {
        this.incTimeStamp = incTimeStamp;
    }

    public java.math.BigDecimal getLocLatitude() {
        return this.locLatitude;
    }

    public void setLocLatitude(java.math.BigDecimal locLatitude) {
        this.locLatitude = locLatitude;
    }

    public java.math.BigDecimal getLocLongitude() {
        return this.locLongitude;
    }

    public void setLocLongitude(java.math.BigDecimal locLongitude) {
        this.locLongitude = locLongitude;
    }

    public Integer getIncDisplacedMen() {
        return this.incDisplacedMen;
    }

    public void setIncDisplacedMen(Integer incDisplacedMen) {
        this.incDisplacedMen = incDisplacedMen;
    }

    public Integer getIncDisplacedAdult() {
        return this.incDisplacedAdult;
    }

    public void setIncDisplacedAdult(Integer incDisplacedAdult) {
        this.incDisplacedAdult = incDisplacedAdult;
    }

    public Integer getIncDisplacedChildren() {
        return this.incDisplacedChildren;
    }

    public void setIncDisplacedChildren(Integer incDisplacedChildren) {
        this.incDisplacedChildren = incDisplacedChildren;
    }

    public BigDecimal getOchaLocLatitude() {
        return ochaLocLatitude;
    }

    public void setOchaLocLatitude(BigDecimal ochaLocLatitude) {
        this.ochaLocLatitude = ochaLocLatitude;
    }

    public BigDecimal getOchaLocLongitude() {
        return ochaLocLongitude;
    }

    public void setOchaLocLongitude(BigDecimal ochaLocLongitude) {
        this.ochaLocLongitude = ochaLocLongitude;
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

    public String getDatId() {
        return datId;
    }

    public void setDatId(String datId) {
        this.datId = datId;
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getIncTimeStampStr() {
        return incTimeStamp!=null? DateTool.decorateDate(incTimeStamp, DateTool.DD_MM_YYYY):"";
    }

    public void setIncTimeStampStr(String incTimeStampStr) {
        this.incTimeStampStr = incTimeStampStr;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("incId", getIncId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsIncident) ) return false;
        PmsIncident castOther = (PmsIncident) other;
        return new EqualsBuilder()
            .append(this.getIncId(), castOther.getIncId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getIncId())
            .toHashCode();
    }

}
