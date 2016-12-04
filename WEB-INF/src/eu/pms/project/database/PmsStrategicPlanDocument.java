package eu.pms.project.database;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class PmsStrategicPlanDocument implements Serializable {

    /** identifier field */
    private String strDocId;

    /** persistent field */
    private InputStream strDocument;

    /** persistent field */
    private String username;

    /** persistent field */
    private java.util.Date timeStamp;

    /** persistent field */
    private Set pmsObjectivs;

    /** full constructor */
    public PmsStrategicPlanDocument(String strDocId, InputStream strDocument, String username, java.util.Date timeStamp, Set pmsObjectivs) {
        this.strDocId = strDocId;
        this.strDocument = strDocument;
        this.username = username;
        this.timeStamp = timeStamp;
        this.pmsObjectivs = pmsObjectivs;
    }

    /** default constructor */
    public PmsStrategicPlanDocument() {
    }

    public String getStrDocId() {
        return this.strDocId;
    }

    public void setStrDocId(String strDocId) {
        this.strDocId = strDocId;
    }

    public InputStream getStrDocument() {
        return this.strDocument;
    }

    public void setStrDocument(InputStream strDocument) {
        this.strDocument = strDocument;
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

    public Set getPmsObjectivs() {
        return this.pmsObjectivs;
    }

    public void setPmsObjectivs(Set pmsObjectivs) {
        this.pmsObjectivs = pmsObjectivs;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("strDocId", getStrDocId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof PmsStrategicPlanDocument) ) return false;
        PmsStrategicPlanDocument castOther = (PmsStrategicPlanDocument) other;
        return new EqualsBuilder()
            .append(this.getStrDocId(), castOther.getStrDocId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getStrDocId())
            .toHashCode();
    }

}
