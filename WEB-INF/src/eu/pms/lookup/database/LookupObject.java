package eu.pms.lookup.database;


import java.io.Serializable;
import java.util.Date;

public abstract class LookupObject implements Serializable {
    private String lookupId;
    private String lookupDesc;
    private String username;
    private java.util.Date timeStamp;

    protected LookupObject() {
    }

    public String getLookupId() {
        return lookupId;
    }

    public void setLookupId(String lookupId) {
        this.lookupId = lookupId;
    }

    public String getLookupDesc() {
        return lookupDesc;
    }

    public void setLookupDesc(String lookupDesc) {
        this.lookupDesc = lookupDesc;
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
}
