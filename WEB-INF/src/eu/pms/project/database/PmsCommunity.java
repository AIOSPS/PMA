package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsCommunity implements Serializable {

    /** identifier field */
    private String comId;

    /** persistent field */
    private String comPcbsCode;

    /** persistent field */
    private String comOchaCode;

    /** nullable persistent field */
    private String comName;

    /** persistent field */
    private int comTotalAreaLand;

    /** persistent field */
    private String comLocationShortDescription;

    /** persistent field */
    private String comHistoricalBackground;

    /** persistent field */
    private String comTopology;

    /** persistent field */
    private int comResidentsTotal;

    /** persistent field */
    private int comMaleTotal;

    /** persistent field */
    private int comFemaleTotal;

    /** persistent field */
    private int comYouthTotal;

    /** persistent field */
    private int comKidsTotal;

    /** nullable persistent field */
    private String comSchoolsInfo;

    /** nullable persistent field */
    private String comHealthSchoolsInfo;

    /** nullable persistent field */
    private String comReligionCenters;

    /** nullable persistent field */
    private String comCemetery;

    /** nullable persistent field */
    private String comWaterNetworkInfo;

    /** nullable persistent field */
    private String comSewerageNetworkInfo;

    /** nullable persistent field */
    private String comElectricalNetworkInfo;

    /** nullable persistent field */
    private String comSolidWasteServiceInfo;

    /** nullable persistent field */
    private String comRoadNetworkInfo;

    /** nullable persistent field */
    private String comTransportNetworkInfo;

    /** nullable persistent field */
    private String comEcnonomicActivitiesInfo;

    /** nullable persistent field */
    private java.math.BigDecimal locLatitude;

    /** nullable persistent field */
    private java.math.BigDecimal locLongitude;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private eu.pms.project.database.PmsCommunityTyp pmsCommunityTyp;

    /** persistent field */
    private Set pmsProjectsCommunities;

    /** persistent field */
    private Set pmsMasterPlanCommunities;

    /** persistent field */
    private Set pmsAccessToLands;

    /** persistent field */
    private Set pmsAgricultureSocios;

    /** persistent field */
    private Set pmsIncidents;

    /** persistent field */
    private Set pmsWaterSocios;

    /** full constructor */
    public PmsCommunity(String comId, String comPcbsCode, String comOchaCode, String comName, int comTotalAreaLand, String comLocationShortDescription, String comHistoricalBackground, String comTopology, int comResidentsTotal, int comMaleTotal, int comFemaleTotal, int comYouthTotal, int comKidsTotal, String comSchoolsInfo, String comHealthSchoolsInfo, String comReligionCenters, String comCemetery, String comWaterNetworkInfo, String comSewerageNetworkInfo, String comElectricalNetworkInfo, String comSolidWasteServiceInfo, String comRoadNetworkInfo, String comTransportNetworkInfo, String comEcnonomicActivitiesInfo, java.math.BigDecimal locLatitude, java.math.BigDecimal locLongitude, String username, java.util.Date timeStamp, eu.pms.project.database.PmsCommunityTyp pmsCommunityTyp, Set pmsProjectsCommunities, Set pmsMasterPlanCommunities, Set pmsAccessToLands, Set pmsAgricultureSocios, Set pmsIncidents, Set pmsWaterSocios) {
        this.comId = comId;
        this.comPcbsCode = comPcbsCode;
        this.comOchaCode = comOchaCode;
        this.comName = comName;
        this.comTotalAreaLand = comTotalAreaLand;
        this.comLocationShortDescription = comLocationShortDescription;
        this.comHistoricalBackground = comHistoricalBackground;
        this.comTopology = comTopology;
        this.comResidentsTotal = comResidentsTotal;
        this.comMaleTotal = comMaleTotal;
        this.comFemaleTotal = comFemaleTotal;
        this.comYouthTotal = comYouthTotal;
        this.comKidsTotal = comKidsTotal;
        this.comSchoolsInfo = comSchoolsInfo;
        this.comHealthSchoolsInfo = comHealthSchoolsInfo;
        this.comReligionCenters = comReligionCenters;
        this.comCemetery = comCemetery;
        this.comWaterNetworkInfo = comWaterNetworkInfo;
        this.comSewerageNetworkInfo = comSewerageNetworkInfo;
        this.comElectricalNetworkInfo = comElectricalNetworkInfo;
        this.comSolidWasteServiceInfo = comSolidWasteServiceInfo;
        this.comRoadNetworkInfo = comRoadNetworkInfo;
        this.comTransportNetworkInfo = comTransportNetworkInfo;
        this.comEcnonomicActivitiesInfo = comEcnonomicActivitiesInfo;
        this.locLatitude = locLatitude;
        this.locLongitude = locLongitude;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsCommunityTyp = pmsCommunityTyp;
        this.pmsProjectsCommunities = pmsProjectsCommunities;
        this.pmsMasterPlanCommunities = pmsMasterPlanCommunities;
        this.pmsAccessToLands = pmsAccessToLands;
        this.pmsAgricultureSocios = pmsAgricultureSocios;
        this.pmsIncidents = pmsIncidents;
        this.pmsWaterSocios = pmsWaterSocios;
    }

    /** default constructor */
    public PmsCommunity() {
    }

    /** minimal constructor */
    public PmsCommunity(String comId, String comPcbsCode, String comOchaCode, int comTotalAreaLand, String comLocationShortDescription, String comHistoricalBackground, String comTopology, int comResidentsTotal, int comMaleTotal, int comFemaleTotal, int comYouthTotal, int comKidsTotal, String username, java.util.Date timeStamp, eu.pms.project.database.PmsCommunityTyp pmsCommunityTyp, Set pmsProjectsCommunities, Set pmsMasterPlanCommunities, Set pmsAccessToLands, Set pmsAgricultureSocios, Set pmsIncidents, Set pmsWaterSocios) {
        this.comId = comId;
        this.comPcbsCode = comPcbsCode;
        this.comOchaCode = comOchaCode;
        this.comTotalAreaLand = comTotalAreaLand;
        this.comLocationShortDescription = comLocationShortDescription;
        this.comHistoricalBackground = comHistoricalBackground;
        this.comTopology = comTopology;
        this.comResidentsTotal = comResidentsTotal;
        this.comMaleTotal = comMaleTotal;
        this.comFemaleTotal = comFemaleTotal;
        this.comYouthTotal = comYouthTotal;
        this.comKidsTotal = comKidsTotal;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsCommunityTyp = pmsCommunityTyp;
        this.pmsProjectsCommunities = pmsProjectsCommunities;
        this.pmsMasterPlanCommunities = pmsMasterPlanCommunities;
        this.pmsAccessToLands = pmsAccessToLands;
        this.pmsAgricultureSocios = pmsAgricultureSocios;
        this.pmsIncidents = pmsIncidents;
        this.pmsWaterSocios = pmsWaterSocios;
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

    public int getComTotalAreaLand() {
        return this.comTotalAreaLand;
    }

    public void setComTotalAreaLand(int comTotalAreaLand) {
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

    public int getComResidentsTotal() {
        return this.comResidentsTotal;
    }

    public void setComResidentsTotal(int comResidentsTotal) {
        this.comResidentsTotal = comResidentsTotal;
    }

    public int getComMaleTotal() {
        return this.comMaleTotal;
    }

    public void setComMaleTotal(int comMaleTotal) {
        this.comMaleTotal = comMaleTotal;
    }

    public int getComFemaleTotal() {
        return this.comFemaleTotal;
    }

    public void setComFemaleTotal(int comFemaleTotal) {
        this.comFemaleTotal = comFemaleTotal;
    }

    public int getComYouthTotal() {
        return this.comYouthTotal;
    }

    public void setComYouthTotal(int comYouthTotal) {
        this.comYouthTotal = comYouthTotal;
    }

    public int getComKidsTotal() {
        return this.comKidsTotal;
    }

    public void setComKidsTotal(int comKidsTotal) {
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

    public eu.pms.project.database.PmsCommunityTyp getPmsCommunityTyp() {
        return this.pmsCommunityTyp;
    }

    public void setPmsCommunityTyp(eu.pms.project.database.PmsCommunityTyp pmsCommunityTyp) {
        this.pmsCommunityTyp = pmsCommunityTyp;
    }

    public Set getPmsProjectsCommunities() {
        return this.pmsProjectsCommunities;
    }

    public void setPmsProjectsCommunities(Set pmsProjectsCommunities) {
        this.pmsProjectsCommunities = pmsProjectsCommunities;
    }

    public Set getPmsMasterPlanCommunities() {
        return this.pmsMasterPlanCommunities;
    }

    public void setPmsMasterPlanCommunities(Set pmsMasterPlanCommunities) {
        this.pmsMasterPlanCommunities = pmsMasterPlanCommunities;
    }

    public Set getPmsAccessToLands() {
        return this.pmsAccessToLands;
    }

    public void setPmsAccessToLands(Set pmsAccessToLands) {
        this.pmsAccessToLands = pmsAccessToLands;
    }

    public Set getPmsAgricultureSocios() {
        return this.pmsAgricultureSocios;
    }

    public void setPmsAgricultureSocios(Set pmsAgricultureSocios) {
        this.pmsAgricultureSocios = pmsAgricultureSocios;
    }

    public Set getPmsIncidents() {
        return this.pmsIncidents;
    }

    public void setPmsIncidents(Set pmsIncidents) {
        this.pmsIncidents = pmsIncidents;
    }

    public Set getPmsWaterSocios() {
        return this.pmsWaterSocios;
    }

    public void setPmsWaterSocios(Set pmsWaterSocios) {
        this.pmsWaterSocios = pmsWaterSocios;
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
