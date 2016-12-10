package eu.pms.project.database;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsClusterTyp implements Serializable {

    /** identifier field */
    private PmsClusterTypPK compId;

    /** nullable persistent field */
    private String cluDesc;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;


    /** default constructor */
    public PmsClusterTyp() {
    }


    public PmsClusterTypPK getCompId() {
        return compId;
    }

    public void setCompId(PmsClusterTypPK compId) {
        this.compId = compId;
    }

    public String getCluDesc() {
        return this.cluDesc;
    }

    public void setCluDesc(String cluDesc) {
        this.cluDesc = cluDesc;
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
