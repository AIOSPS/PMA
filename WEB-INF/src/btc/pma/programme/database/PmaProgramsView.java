package btc.pma.programme.database;

import java.io.Serializable;
import java.util.Date;

import eu.pms.common.tools.DateTool;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmaProgramsView implements Serializable {


    private PmaProgramsViewPK comp_id;
    /** nullable persistent field */
    private String intrTitle;

    /** nullable persistent field */
    private int intrDuration;

    /** nullable persistent field */
    private String secCode;

    /** persistent field */
    private String secName;

    /** persistent field */
    private String btpId;

    /** nullable persistent field */
    private String beneCount;

    /** persistent field */
    private String btpDesc;

    /** nullable persistent field */
    private String actvTitle;

    /** persistent field */
    private String impId;

    /** persistent field */
    private String impName;

    /** nullable persistent field */
    private String impType;

    /** persistent field */
    private String impAbbName;

    /** persistent field */
    private String comId;

    /** nullable persistent field */
    private String comName;

    /** nullable persistent field */
    private String sobjDescription;

    /** persistent field */
    private String govDesc;

    /** persistent field */
    private String govId;

    /** nullable persistent field */
    private java.util.Date actvProposedStartDate;

    /** nullable persistent field */
    private java.util.Date actvProposedEndDate;

    /** nullable persistent field */
    private String actvProposedStartDateStr;

    /** nullable persistent field */
    private String actvProposedEndDateStr;

    /** full constructor */
    public PmaProgramsView(PmaProgramsViewPK comp_id, String intrTitle, int intrDuration, String secCode, String secName, String btpId, String beneCount, String btpDesc, String actvTitle, String impId, String impName, String impType, String impAbbName, String comId, String comName, String sobjDescription, String govDesc, String govId, java.util.Date actvProposedStartDate, java.util.Date actvProposedEndDate) {
        this.comp_id = comp_id;
        this.intrTitle = intrTitle;
        this.intrDuration = intrDuration;
        this.secCode = secCode;
        this.secName = secName;
        this.btpId = btpId;
        this.beneCount = beneCount;
        this.btpDesc = btpDesc;
        this.actvTitle = actvTitle;
        this.impId = impId;
        this.impName = impName;
        this.impType = impType;
        this.impAbbName = impAbbName;
        this.comId = comId;
        this.comName = comName;
        this.sobjDescription = sobjDescription;
        this.govDesc = govDesc;
        this.govId= govId;
        this.actvProposedStartDate = actvProposedStartDate;
        this.actvProposedEndDate = actvProposedEndDate;
    }

    /** default constructor */
    public PmaProgramsView() {
    }

    /** minimal constructor */
    public PmaProgramsView(PmaProgramsViewPK comp_id, String secName, String btpId, String btpDesc, String impId, String impName, String impAbbName, String comId, String govDesc) {
        this.comp_id = comp_id;
        this.secName = secName;
        this.btpId = btpId;
        this.btpDesc = btpDesc;
        this.impId = impId;
        this.impName = impName;
        this.impAbbName = impAbbName;
        this.comId = comId;
        this.govDesc = govDesc;
    }

    public PmaProgramsViewPK getComp_id() {
        return comp_id;
    }

    public void setComp_id(PmaProgramsViewPK comp_id) {
        this.comp_id = comp_id;
    }

    public String getIntrTitle() {
        return this.intrTitle;
    }

    public void setIntrTitle(String intrTitle) {
        this.intrTitle = intrTitle;
    }

    public int getIntrDuration() {
        return this.intrDuration;
    }

    public void setIntrDuration(int intrDuration) {
        this.intrDuration = intrDuration;
    }

    public String getSecCode() {
        return this.secCode;
    }

    public void setSecCode(String secCode) {
        this.secCode = secCode;
    }

    public String getSecName() {
        return this.secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getBtpId() {
        return this.btpId;
    }

    public void setBtpId(String btpId) {
        this.btpId = btpId;
    }

    public String getBeneCount() {
        return this.beneCount;
    }

    public void setBeneCount(String beneCount) {
        this.beneCount = beneCount;
    }

    public String getBtpDesc() {
        return this.btpDesc;
    }

    public void setBtpDesc(String btpDesc) {
        this.btpDesc = btpDesc;
    }

    public String getActvTitle() {
        return this.actvTitle;
    }

    public void setActvTitle(String actvTitle) {
        this.actvTitle = actvTitle;
    }

    public String getImpId() {
        return this.impId;
    }

    public void setImpId(String impId) {
        this.impId = impId;
    }

    public String getImpName() {
        return this.impName;
    }

    public void setImpName(String impName) {
        this.impName = impName;
    }

    public String getImpType() {
        return this.impType;
    }

    public void setImpType(String impType) {
        this.impType = impType;
    }

    public String getImpAbbName() {
        return this.impAbbName;
    }

    public void setImpAbbName(String impAbbName) {
        this.impAbbName = impAbbName;
    }

    public String getComId() {
        return this.comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    public String getComName() {
        return this.comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getSobjDescription() {
        return this.sobjDescription;
    }

    public void setSobjDescription(String sobjDescription) {
        this.sobjDescription = sobjDescription;
    }

    public String getGovDesc() {
        return this.govDesc;
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

    public Date getActvProposedStartDate() {
        return actvProposedStartDate;
    }

    public void setActvProposedStartDate(Date actvProposedStartDate) {
        this.actvProposedStartDate = actvProposedStartDate;
    }

    public Date getActvProposedEndDate() {
        return actvProposedEndDate;
    }

    public void setActvProposedEndDate(Date actvProposedEndDate) {
        this.actvProposedEndDate = actvProposedEndDate;
    }

    public String getActvProposedStartDateStr() {
        return actvProposedStartDate!=null? DateTool.decorateDate(actvProposedStartDate, DateTool.DD_MM_YYYY):"";
    }

    public void setActvProposedStartDateStr(String actvProposedStartDateStr) {
        this.actvProposedStartDateStr = actvProposedStartDateStr;
    }

    public String getActvProposedEndDateStr() {
        return actvProposedEndDate!=null? DateTool.decorateDate(actvProposedEndDate, DateTool.DD_MM_YYYY):"";
    }

    public void setActvProposedEndDateStr(String actvProposedEndDateStr) {
        this.actvProposedEndDateStr = actvProposedEndDateStr;
    }

    public String toString() {
        return new ToStringBuilder(this)
                .append("comp_id", getComp_id())
                .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmaProgramsView) ) return false;
        PmaProgramsView castOther = (PmaProgramsView) other;
        return new EqualsBuilder()
                .append(this.getComp_id(), castOther.getComp_id())
                .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
                .append(getComp_id())
                .toHashCode();
    }

}
