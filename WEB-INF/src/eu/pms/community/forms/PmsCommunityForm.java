package eu.pms.community.forms;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** @author Hibernate CodeGenerator */
public class PmsCommunityForm extends ActionForm {
    private String comId;
    private String govId;
    //private String locId;
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
    public PmsCommunityForm() {
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    public String getGovId() {
        return govId;
    }

    public void setGovId(String govId) {
        this.govId = govId;
    }

//    public String getLocId() {
//        return locId;
//    }
//
//    public void setLocId(String locId) {
//        this.locId = locId;
//    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
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

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public Integer getComTotalAreaLand() {
        return comTotalAreaLand;
    }

    public void setComTotalAreaLand(Integer comTotalAreaLand) {
        this.comTotalAreaLand = comTotalAreaLand;
    }

    public String getComLocationShortDescription() {
        return comLocationShortDescription;
    }

    public void setComLocationShortDescription(String comLocationShortDescription) {
        this.comLocationShortDescription = comLocationShortDescription;
    }

    public String getComHistoricalBackground() {
        return comHistoricalBackground;
    }

    public void setComHistoricalBackground(String comHistoricalBackground) {
        this.comHistoricalBackground = comHistoricalBackground;
    }

    public String getComTopology() {
        return comTopology;
    }

    public void setComTopology(String comTopology) {
        this.comTopology = comTopology;
    }

    public Integer getComResidentsTotal() {
        return comResidentsTotal;
    }

    public void setComResidentsTotal(Integer comResidentsTotal) {
        this.comResidentsTotal = comResidentsTotal;
    }

    public Integer getComMaleTotal() {
        return comMaleTotal;
    }

    public void setComMaleTotal(Integer comMaleTotal) {
        this.comMaleTotal = comMaleTotal;
    }

    public Integer getComFemaleTotal() {
        return comFemaleTotal;
    }

    public void setComFemaleTotal(Integer comFemaleTotal) {
        this.comFemaleTotal = comFemaleTotal;
    }

    public Integer getComYouthTotal() {
        return comYouthTotal;
    }

    public void setComYouthTotal(Integer comYouthTotal) {
        this.comYouthTotal = comYouthTotal;
    }

    public Integer getComKidsTotal() {
        return comKidsTotal;
    }

    public void setComKidsTotal(Integer comKidsTotal) {
        this.comKidsTotal = comKidsTotal;
    }

    public String getComSchoolsInfo() {
        return comSchoolsInfo;
    }

    public void setComSchoolsInfo(String comSchoolsInfo) {
        this.comSchoolsInfo = comSchoolsInfo;
    }

    public String getComHealthSchoolsInfo() {
        return comHealthSchoolsInfo;
    }

    public void setComHealthSchoolsInfo(String comHealthSchoolsInfo) {
        this.comHealthSchoolsInfo = comHealthSchoolsInfo;
    }

    public String getComReligionCenters() {
        return comReligionCenters;
    }

    public void setComReligionCenters(String comReligionCenters) {
        this.comReligionCenters = comReligionCenters;
    }

    public String getComCemetery() {
        return comCemetery;
    }

    public void setComCemetery(String comCemetery) {
        this.comCemetery = comCemetery;
    }

    public String getComWaterNetworkInfo() {
        return comWaterNetworkInfo;
    }

    public void setComWaterNetworkInfo(String comWaterNetworkInfo) {
        this.comWaterNetworkInfo = comWaterNetworkInfo;
    }

    public String getComSewerageNetworkInfo() {
        return comSewerageNetworkInfo;
    }

    public void setComSewerageNetworkInfo(String comSewerageNetworkInfo) {
        this.comSewerageNetworkInfo = comSewerageNetworkInfo;
    }

    public String getComElectricalNetworkInfo() {
        return comElectricalNetworkInfo;
    }

    public void setComElectricalNetworkInfo(String comElectricalNetworkInfo) {
        this.comElectricalNetworkInfo = comElectricalNetworkInfo;
    }

    public String getComSolidWasteServiceInfo() {
        return comSolidWasteServiceInfo;
    }

    public void setComSolidWasteServiceInfo(String comSolidWasteServiceInfo) {
        this.comSolidWasteServiceInfo = comSolidWasteServiceInfo;
    }

    public String getComRoadNetworkInfo() {
        return comRoadNetworkInfo;
    }

    public void setComRoadNetworkInfo(String comRoadNetworkInfo) {
        this.comRoadNetworkInfo = comRoadNetworkInfo;
    }

    public String getComTransportNetworkInfo() {
        return comTransportNetworkInfo;
    }

    public void setComTransportNetworkInfo(String comTransportNetworkInfo) {
        this.comTransportNetworkInfo = comTransportNetworkInfo;
    }

    public String getComEcnonomicActivitiesInfo() {
        return comEcnonomicActivitiesInfo;
    }

    public void setComEcnonomicActivitiesInfo(String comEcnonomicActivitiesInfo) {
        this.comEcnonomicActivitiesInfo = comEcnonomicActivitiesInfo;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        comId = null;
        comPcbsCode = null;
        comOchaCode = null;
        comName = null;
        typeId = null;
        comTotalAreaLand = null;
        comLocationShortDescription = null;
        comTopology = null;
        comResidentsTotal = null;
        comMaleTotal = null;
        comFemaleTotal = null;
        comKidsTotal = null;
        comSchoolsInfo = null;
        comHealthSchoolsInfo = null;
        comReligionCenters = null;
        comCemetery = null;
        comWaterNetworkInfo = null;
        comSewerageNetworkInfo = null;
        comElectricalNetworkInfo = null;
        comSolidWasteServiceInfo = null;
        comRoadNetworkInfo = null;
        comTransportNetworkInfo = null;
        comEcnonomicActivitiesInfo = null;
        govId = null;
        comLatitude = null;
        comLongitude = null;
        comPercentAreaC = null;
        comTouchingBorder = null;
    }
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
