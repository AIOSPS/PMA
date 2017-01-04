package eu.pms.incident.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;


/** @author Hibernate CodeGenerator */
public class PmsIncidentForm extends ActionForm {
    private String incId;
    private String datId;
    private String comId;
    private String proId;
    private String incOchaId;
    private String incDescription;
    private int incAffectedWomen;
    private int incAffectedMen;
    private int incAffectedAdaults;
    private int incAffectedChildren;
    private int incDisplacedWomen;
    private int incDemolishedStructure;
    private String incSourceLink;
    private String incType;
    private String incTimeStamp;
    private java.math.BigDecimal locLatitude;
    private java.math.BigDecimal locLongitude;
    private int incDisplacedMen;
    private int incDisplacedAdult;
    private int incDisplacedChildren;

    /** default constructor */
    public PmsIncidentForm() {
    }

    public String getIncId() {
        return incId;
    }

    public void setIncId(String incId) {
        this.incId = incId;
    }

    public String getDatId() {
        return datId;
    }

    public void setDatId(String datId) {
        this.datId = datId;
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getIncOchaId() {
        return incOchaId;
    }

    public void setIncOchaId(String incOchaId) {
        this.incOchaId = incOchaId;
    }

    public String getIncDescription() {
        return incDescription;
    }

    public void setIncDescription(String incDescription) {
        this.incDescription = incDescription;
    }

    public int getIncAffectedWomen() {
        return incAffectedWomen;
    }

    public void setIncAffectedWomen(int incAffectedWomen) {
        this.incAffectedWomen = incAffectedWomen;
    }

    public int getIncAffectedMen() {
        return incAffectedMen;
    }

    public void setIncAffectedMen(int incAffectedMen) {
        this.incAffectedMen = incAffectedMen;
    }

    public int getIncAffectedAdaults() {
        return incAffectedAdaults;
    }

    public void setIncAffectedAdaults(int incAffectedAdaults) {
        this.incAffectedAdaults = incAffectedAdaults;
    }

    public int getIncAffectedChildren() {
        return incAffectedChildren;
    }

    public void setIncAffectedChildren(int incAffectedChildren) {
        this.incAffectedChildren = incAffectedChildren;
    }

    public int getIncDisplacedWomen() {
        return incDisplacedWomen;
    }

    public void setIncDisplacedWomen(int incDisplacedWomen) {
        this.incDisplacedWomen = incDisplacedWomen;
    }

      public String getIncSourceLink() {
        return incSourceLink;
    }

    public void setIncSourceLink(String incSourceLink) {
        this.incSourceLink = incSourceLink;
    }

    public String getIncType() {
        return incType;
    }

    public void setIncType(String incType) {
        this.incType = incType;
    }

    public String getIncTimeStamp() {
        return incTimeStamp;
    }

    public void setIncTimeStamp(String incTimeStamp) {
        this.incTimeStamp = incTimeStamp;
    }

    public BigDecimal getLocLatitude() {
        return locLatitude;
    }

    public void setLocLatitude(BigDecimal locLatitude) {
        this.locLatitude = locLatitude;
    }

    public BigDecimal getLocLongitude() {
        return locLongitude;
    }

    public void setLocLongitude(BigDecimal locLongitude) {
        this.locLongitude = locLongitude;
    }

    public int getIncDisplacedMen() {
        return incDisplacedMen;
    }

    public void setIncDisplacedMen(int incDisplacedMen) {
        this.incDisplacedMen = incDisplacedMen;
    }

    public int getIncDisplacedAdult() {
        return incDisplacedAdult;
    }

    public void setIncDisplacedAdult(int incDisplacedAdult) {
        this.incDisplacedAdult = incDisplacedAdult;
    }

    public int getIncDisplacedChildren() {
        return incDisplacedChildren;
    }

    public void setIncDisplacedChildren(int incDisplacedChildren) {
        this.incDisplacedChildren = incDisplacedChildren;
    }

    public int getIncDemolishedStructure() {
        return incDemolishedStructure;
    }

    public void setIncDemolishedStructure(int incDemolishedStructure) {
        this.incDemolishedStructure = incDemolishedStructure;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
