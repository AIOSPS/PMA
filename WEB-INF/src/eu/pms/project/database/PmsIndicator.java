package eu.pms.project.database;

import java.io.Serializable;

import eu.pms.common.tools.DateTool;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsIndicator implements Serializable {

    /** identifier field */
    private PmsIndicatorPK compId;

    /** persistent field */
    private String indTitle;

    /** persistent field */
    private java.util.Date indDate;
    private String indDateStr;

    /** persistent field */
    private String indLongDesc;

    /** persistent field */
    private int indBaseline;

    /** persistent field */
    private int indFrequency;

    /** persistent field */
    private String indCollectionMethod;

    /** persistent field */
    private String indStatisticalMethod;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private PmsResult pmsResult;



    /** default constructor */
    public PmsIndicator() {
    }

    public PmsIndicatorPK getCompId() {
        return this.compId;
    }

    public void setCompId(PmsIndicatorPK compId) {
        this.compId = compId;
    }

    public String getIndTitle() {
        return this.indTitle;
    }

    public void setIndTitle(String indTitle) {
        this.indTitle = indTitle;
    }

    public java.util.Date getIndDate() {
        return this.indDate;
    }

    public void setIndDate(java.util.Date indDate) {
        this.indDate = indDate;
    }

    public String getIndLongDesc() {
        return this.indLongDesc;
    }

    public void setIndLongDesc(String indLongDesc) {
        this.indLongDesc = indLongDesc;
    }

    public int getIndBaseline() {
        return this.indBaseline;
    }

    public void setIndBaseline(int indBaseline) {
        this.indBaseline = indBaseline;
    }

    public int getIndFrequency() {
        return this.indFrequency;
    }

    public void setIndFrequency(int indFrequency) {
        this.indFrequency = indFrequency;
    }

    public String getIndCollectionMethod() {
        return this.indCollectionMethod;
    }

    public void setIndCollectionMethod(String indCollectionMethod) {
        this.indCollectionMethod = indCollectionMethod;
    }

    public String getIndStatisticalMethod() {
        return this.indStatisticalMethod;
    }

    public void setIndStatisticalMethod(String indStatisticalMethod) {
        this.indStatisticalMethod = indStatisticalMethod;
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

    public PmsResult getPmsResult() {
        return this.pmsResult;
    }

    public void setPmsResult(PmsResult pmsResult) {
        this.pmsResult = pmsResult;
    }

    public String getIndDateStr() {
        return indDate!=null? DateTool.decorateDate(indDate, DateTool.DD_MM_YYYY):"";
    }

    public void setIndDateStr(String indDateStr) {
        this.indDateStr = indDateStr;
    }
}
