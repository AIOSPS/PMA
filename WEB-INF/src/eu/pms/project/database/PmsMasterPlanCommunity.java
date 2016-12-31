package eu.pms.project.database;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsMasterPlanCommunity implements Serializable {
private PmsMasterPlanCommunityPK compId;
    private String username;
    private java.util.Date timeStamp;


    /** default constructor */
    public PmsMasterPlanCommunity() {
    }

    public PmsMasterPlanCommunityPK getCompId() {
        return compId;
    }

    public void setCompId(PmsMasterPlanCommunityPK compId) {
        this.compId = compId;
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


    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
