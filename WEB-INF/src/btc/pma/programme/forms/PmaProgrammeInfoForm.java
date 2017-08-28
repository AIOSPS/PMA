package btc.pma.programme.forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by PC on 8/24/2017.
 */
public class PmaProgrammeInfoForm extends ActionForm {

    private String intrNo;
    private String intrTitle;
    private int intrDuration;
    private String intrDescription;
    private String btcNavisionCode;
    private String partInstitution;
    private int agrmDuration;
    private java.util.Date estmStartDate;
    private int contPartnerCountry;
    private int belgContribution;
    private String secCode;
    private String oallObjective;
    private java.util.Date agrmSignDate;
    private String username;
    private java.util.Date timeStamp;

    public PmaProgrammeInfoForm() {
    }

    public String getIntrNo() {
        return intrNo;
    }

    public void setIntrNo(String intrNo) {
        this.intrNo = intrNo;
    }

    public String getIntrTitle() {
        return intrTitle;
    }

    public void setIntrTitle(String intrTitle) {
        this.intrTitle = intrTitle;
    }

    public int getIntrDuration() {
        return intrDuration;
    }

    public void setIntrDuration(int intrDuration) {
        this.intrDuration = intrDuration;
    }

    public String getIntrDescription() {
        return intrDescription;
    }

    public void setIntrDescription(String intrDescription) {
        this.intrDescription = intrDescription;
    }

    public String getBtcNavisionCode() {
        return btcNavisionCode;
    }

    public void setBtcNavisionCode(String btcNavisionCode) {
        this.btcNavisionCode = btcNavisionCode;
    }

    public String getPartInstitution() {
        return partInstitution;
    }

    public void setPartInstitution(String partInstitution) {
        this.partInstitution = partInstitution;
    }

    public int getAgrmDuration() {
        return agrmDuration;
    }

    public void setAgrmDuration(int agrmDuration) {
        this.agrmDuration = agrmDuration;
    }

    public Date getEstmStartDate() {
        return estmStartDate;
    }

    public void setEstmStartDate(Date estmStartDate) {
        this.estmStartDate = estmStartDate;
    }

    public int getContPartnerCountry() {
        return contPartnerCountry;
    }

    public void setContPartnerCountry(int contPartnerCountry) {
        this.contPartnerCountry = contPartnerCountry;
    }

    public int getBelgContribution() {
        return belgContribution;
    }

    public void setBelgContribution(int belgContribution) {
        this.belgContribution = belgContribution;
    }

    public String getSecCode() {
        return secCode;
    }

    public void setSecCode(String secCode) {
        this.secCode = secCode;
    }

    public String getOallObjective() {
        return oallObjective;
    }

    public void setOallObjective(String oallObjective) {
        this.oallObjective = oallObjective;
    }

    public Date getAgrmSignDate() {
        return agrmSignDate;
    }

    public void setAgrmSignDate(Date agrmSignDate) {
        this.agrmSignDate = agrmSignDate;
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

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
          intrNo = null;
          intrTitle = null;
          intrDuration = 0;
          intrDescription = null;
          btcNavisionCode = null;
          partInstitution = null;
          agrmDuration = 0;
          estmStartDate = null;
          contPartnerCountry = 0;
          belgContribution = 0;
          secCode = null;
          oallObjective = null;
          agrmSignDate = null;
          username  = null;
          timeStamp = null;
    }
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }


}
