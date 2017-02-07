package eu.pms.project.database.structs;

/**
 * Created by orayyan on 2/7/2017.
 */
public class PmsProjectList {
    private String proId;
    private String proTitle;
    private String proDescription;
    private String proStatusDesc;
    private String proStartDate;
    private String proEndDate;

    public PmsProjectList(){}
    public PmsProjectList(String proId,String proTitle, String proDescription, String proStatusDesc, String proStartDate, String proEndDate) {
        this.proId = proId;
        this.proTitle = proTitle;
        this.proDescription = proDescription;
        this.proStatusDesc = proStatusDesc;
        this.proStartDate = proStartDate;
        this.proEndDate = proEndDate;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProTitle() {
        return proTitle;
    }

    public void setProTitle(String proTitle) {
        this.proTitle = proTitle;
    }

    public String getProDescription() {
        return proDescription;
    }

    public void setProDescription(String proDescription) {
        this.proDescription = proDescription;
    }

    public String getProStatusDesc() {
        return proStatusDesc;
    }

    public void setProStatusDesc(String proStatusDesc) {
        this.proStatusDesc = proStatusDesc;
    }

    public String getProStartDate() {
        return proStartDate;
    }

    public void setProStartDate(String proStartDate) {
        this.proStartDate = proStartDate;
    }

    public String getProEndDate() {
        return proEndDate;
    }

    public void setProEndDate(String proEndDate) {
        this.proEndDate = proEndDate;
    }
}
