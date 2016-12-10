package eu.pms.project.database;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author Hibernate CodeGenerator
 */
public class PmsProjectDonor implements Serializable {
    private PmsProjectDonorPK compId;
    private String username;
    private java.util.Date timeStamp;


    /**
     * default constructor
     */
    public PmsProjectDonor() {
    }

    public PmsProjectDonorPK getCompId() {
        return compId;
    }

    public void setCompId(PmsProjectDonorPK compId) {
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


}
