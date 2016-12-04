package eu.pms.common.tools;

/**
 * Created by IntelliJ IDEA.
 * User:  Ibrahim Assi (iassi)
 * Date: Jul 23, 2012
 * Time: 10:43:13 AM
 */
public class QouEmail extends SendEmailTool{

    private String fromName;
    private String fromEmail;
    private String toEmail;
    private String subject;
    private String messageBody ;

    public QouEmail(String fromName, String fromEmail, String toEmail, String subject, String messageBody)
    {
        this.fromName = fromName;
        this.fromEmail = fromEmail;
        this.toEmail = toEmail;
        this.subject = subject;
        this.messageBody = messageBody;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }


    public boolean sendEmail()
    {
      return  super.sendEmail(fromName,fromEmail,toEmail,subject,messageBody) ;
    }
}
