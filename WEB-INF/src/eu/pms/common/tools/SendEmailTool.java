package eu.pms.common.tools;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.InputStream;
import java.util.Properties;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Al-Quds Open University</p>
 *
 * @author Mustafa Al-Tamim
 * @version 1.0
 */

public class SendEmailTool
{
    private String toAddreass = "portal@qou.edu";
    private String mailServer = "mta.qou.edu";
    private String fromAddress = "portal@qou.edu";

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public SendEmailTool()
    {
        mailServer = getMailName("mailServer");
    }

    public boolean sendEmail(String fromName, String fromEmail, String toEmail, String subject, String messageBody)
    {
        toAddreass = toEmail;
        return sendEmail(fromName, fromEmail, subject, messageBody);
    }

    public boolean sendEmail(String toEmailKey, String subject, String messageBody)
    {
        toAddreass = getRecieverMail(toEmailKey);
        return sendEmail("QOU Academic Portal", fromAddress, subject, messageBody);
    }

    public boolean sendEmail(String fromName, String fromEmail, String subject, String messageBody)
    {
        boolean success = false;
        Properties props = new Properties();
        props.put("mail.smtp.host", mailServer);
        Session session = Session.getDefaultInstance(props, null);
        session.setDebug(false);
        try
        {
            Message msg = new MimeMessage(session);
            InternetAddress from = new InternetAddress(fromEmail.trim());
            msg.setFrom(from);
            InternetAddress[] to = null;

            if((toAddreass != null) && (toAddreass.indexOf(";") > 0))// more than one email (group)
            {
                String[] toAddressesList = toAddreass.split(";");
                to = new InternetAddress[toAddressesList.length];

                for(int i=0; i< toAddressesList.length; i++)
                    to[i] = new InternetAddress(toAddressesList[i]);
            }
            else // single address
                to = new InternetAddress[]{new InternetAddress(toAddreass)};

            msg.setRecipients(Message.RecipientType.TO, to);
            msg.setSubject(subject);
            msg.setContent(messageBody, "text/html; charset=UTF-8");
            msg.setHeader("Content-Type", "text/html; charset=UTF-8");
            Transport.send(msg);
            success = true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("From the mailing tool : " + e.getMessage());
            return false;
        }
        return success;
    }

    public String getMailName(String key)
    {

        String PROPERTIES_FILE_NAME = "/mailList.properties";
        String mailServer = "mta.qou.edu";
        Properties mailListProperties;
        try
        {
            mailListProperties = new Properties();
            Class thisClass = Class.forName("edu.qou.common.tools.SendEmailTool");
            InputStream is = thisClass.getResourceAsStream(PROPERTIES_FILE_NAME);
            mailListProperties.load(is);
            mailServer = mailListProperties.getProperty(key);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return mailServer;
    }

    public String getRecieverMail(String key)
    {

        String PROPERTIES_FILE_NAME = "/mailList.properties";
        String reciever = "portal@qou.edu";
        Properties mailListProperties;
        try
        {
            mailListProperties = new Properties();
            Class thisClass = Class.forName("edu.qou.common.tools.SendEmailTool");
            InputStream is = thisClass.getResourceAsStream(PROPERTIES_FILE_NAME);
            mailListProperties.load(is);
            reciever = mailListProperties.getProperty(key);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return reciever;
    }
}