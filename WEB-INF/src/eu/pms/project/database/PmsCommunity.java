package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsCommunity implements Serializable {

    private String comId;
    private String govId;
//    private String locId;
    private String typeId;
    private String comPcbsCode;
    private String comOchaCode;
    private String comName;
    private Integer comTotalAreaLand;
    private String comLocationShortDescription;
    private String comHistoricalBackground;
    private String comTopology;
    private Integer comResidentsTotal;
    private Integer comMaleTotal;
    private Integer comFemaleTotal;
    private Integer comYouthTotal;
    private Integer comKidsTotal;
    private String comSchoolsInfo;
    private String comHealthSchoolsInfo;
    private String comReligionCenters;
    private String comCemetery;
    private String comWaterNetworkInfo;
    private String comSewerageNetworkInfo;
    private String comElectricalNetworkInfo;
    private String comSolidWasteServiceInfo;
    private String comRoadNetworkInfo;
    private String comTransportNetworkInfo;
    private String comEcnonomicActivitiesInfo;
    private java.math.BigDecimal comLatitude;
    private java.math.BigDecimal comLongitude;
    private String comPercentAreaC;
    private String comTouchingBorder;
    private String username;
    private java.util.Date timeStamp;

    /** default constructor */
    public PmsCommunity() {
    }


    public String getComId() {
        return this.comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    public String getComPcbsCode() {
        return this.comPcbsCode;
    }

    public void setComPcbsCode(String comPcbsCode) {
        this.comPcbsCode = comPcbsCode;
    }

    public String getComOchaCode() {
        return this.comOchaCode;
    }

    public void setComOchaCode(String comOchaCode) {
        this.comOchaCode = comOchaCode;
    }

    public String getComName() {
        return this.comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public Integer getComTotalAreaLand() {
        return this.comTotalAreaLand;
    }

    public void setComTotalAreaLand(Integer comTotalAreaLand) {
        this.comTotalAreaLand = comTotalAreaLand;
    }

    public String getComLocationShortDescription() {
        return this.comLocationShortDescription;
    }

    public void setComLocationShortDescription(String comLocationShortDescription) {
        this.comLocationShortDescription = comLocationShortDescription;
    }

    public String getComHistoricalBackground() {
        return this.comHistoricalBackground;
    }

    public void setComHistoricalBackground(String comHistoricalBackground) {
        this.comHistoricalBackground = comHistoricalBackground;
    }

    public String getComTopology() {
        return this.comTopology;
    }

    public void setComTopology(String comTopology) {
        this.comTopology = comTopology;
    }

    public Integer getComResidentsTotal() {
        return this.comResidentsTotal;
    }

    public void setComResidentsTotal(Integer comResidentsTotal) {
        this.comResidentsTotal = comResidentsTotal;
    }

    public Integer getComMaleTotal() {
        return this.comMaleTotal;
    }

    public void setComMaleTotal(Integer comMaleTotal) {
        this.comMaleTotal = comMaleTotal;
    }

    public Integer getComFemaleTotal() {
        return this.comFemaleTotal;
    }

    public void setComFemaleTotal(Integer comFemaleTotal) {
        this.comFemaleTotal = comFemaleTotal;
    }

    public Integer getComYouthTotal() {
        return this.comYouthTotal;
    }

    public void setComYouthTotal(Integer comYouthTotal) {
        this.comYouthTotal = comYouthTotal;
    }

    public Integer getComKidsTotal() {
        return this.comKidsTotal;
    }

    public void setComKidsTotal(Integer comKidsTotal) {
        this.comKidsTotal = comKidsTotal;
    }

    public String getComSchoolsInfo() {
        return this.comSchoolsInfo;
    }

    public void setComSchoolsInfo(String comSchoolsInfo) {
        this.comSchoolsInfo = comSchoolsInfo;
    }

    public String getComHealthSchoolsInfo() {
        return this.comHealthSchoolsInfo;
    }

    public void setComHealthSchoolsInfo(String comHealthSchoolsInfo) {
        this.comHealthSchoolsInfo = comHealthSchoolsInfo;
    }

    public String getComReligionCenters() {
        return this.comReligionCenters;
    }

    public void setComReligionCenters(String comReligionCenters) {
        this.comReligionCenters = comReligionCenters;
    }

    public String getComCemetery() {
        return this.comCemetery;
    }

    public void setComCemetery(String comCemetery) {
        this.comCemetery = comCemetery;
    }

    public String getComWaterNetworkInfo() {
        return this.comWaterNetworkInfo;
    }

    public void setComWaterNetworkInfo(String comWaterNetworkInfo) {
        this.comWaterNetworkInfo = comWaterNetworkInfo;
    }

    public String getComSewerageNetworkInfo() {
        return this.comSewerageNetworkInfo;
    }

    public void setComSewerageNetworkInfo(String comSewerageNetworkInfo) {
        this.comSewerageNetworkInfo = comSewerageNetworkInfo;
    }

    public String getComElectricalNetworkInfo() {
        return this.comElectricalNetworkInfo;
    }

    public void setComElectricalNetworkInfo(String comElectricalNetworkInfo) {
        this.comElectricalNetworkInfo = comElectricalNetworkInfo;
    }

    public String getComSolidWasteServiceInfo() {
        return this.comSolidWasteServiceInfo;
    }

    public void setComSolidWasteServiceInfo(String comSolidWasteServiceInfo) {
        this.comSolidWasteServiceInfo = comSolidWasteServiceInfo;
    }

    public String getComRoadNetworkInfo() {
        return this.comRoadNetworkInfo;
    }

    public void setComRoadNetworkInfo(String comRoadNetworkInfo) {
        this.comRoadNetworkInfo = comRoadNetworkInfo;
    }

    public String getComTransportNetworkInfo() {
        return this.comTransportNetworkInfo;
    }

    public void setComTransportNetworkInfo(String comTransportNetworkInfo) {
        this.comTransportNetworkInfo = comTransportNetworkInfo;
    }

    public String getComEcnonomicActivitiesInfo() {
        return this.comEcnonomicActivitiesInfo;
    }

    public void setComEcnonomicActivitiesInfo(String comEcnonomicActivitiesInfo) {
        this.comEcnonomicActivitiesInfo = comEcnonomicActivitiesInfo;
    }

    public java.math.BigDecimal getComLatitude() {
        return this.comLatitude;
    }

    public void setComLatitude(java.math.BigDecimal comLatitude) {
        this.comLatitude = comLatitude;
    }

    public java.math.BigDecimal getComLongitude() {
        return this.comLongitude;
    }

    public void setComLongitude(java.math.BigDecimal comLongitude) {
        this.comLongitude = comLongitude;
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

    public String getGovId() {
        return govId;
    }

    public void setGovId(String govId) {
        this.govId = govId;
    }

    public String getComPercentAreaC() {
        return comPercentAreaC;
    }

    public void setComPercentAreaC(String comPercentAreaC) {
        this.comPercentAreaC = comPercentAreaC;
    }

    public String getComTouchingBorder() {
        return comTouchingBorder;
    }

    public void setComTouchingBorder(String comTouchingBorder) {
        this.comTouchingBorder = comTouchingBorder;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("comId", getComId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsCommunity) ) return false;
        PmsCommunity castOther = (PmsCommunity) other;
        return new EqualsBuilder()
            .append(this.getComId(), castOther.getComId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getComId())
            .toHashCode();
    }

}
