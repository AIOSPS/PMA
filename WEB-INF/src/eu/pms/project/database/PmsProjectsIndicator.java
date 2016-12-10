package eu.pms.project.database;

import java.io.Serializable;

/** @author Hibernate CodeGenerator */
public class PmsProjectsIndicator implements Serializable {

    /** identifier field */
    private PmsProjectsIndicatorPK compId;

    public PmsProjectsIndicatorPK getCompId() {
        return compId;
    }

    public void setCompId(PmsProjectsIndicatorPK compId) {
        this.compId = compId;
    }
}
