package eu.pms.common.struct;



import javax.servlet.http.HttpServletRequest;
import java.util.Date;


/**
 * Created by IntelliJ IDEA.
 * User:  Ibrahim Assi (iassi)
 * Date: Mar 18, 2012
 * Time: 1:11:45 PM
 */
public class AuditInfo
{
     private HttpServletRequest request;
//     private UserLogins UserLoginInfo;
//   private String  remoteIp;
//   private String  auditScreenId;
//   private RegTerm infoCurrentTerm;

    
    public AuditInfo( HttpServletRequest request)
    {
        this.request = request;
//        UserLoginInfo=new UserLogins(request);
    }

//    public UserLogins getUserLoginInfo() {
//        return UserLoginInfo;
//    }

    public Date getTimeStamp() {
        return new Date();
    }

    public String getRemoteIp() {
        String   remoteIp = (String) request.getSession().getAttribute("remoteIp");

        if(remoteIp==null||remoteIp.equals(""))
        remoteIp=request.getRemoteAddr();

        if(remoteIp==null||remoteIp.trim().equals(""))
        remoteIp="Unknown Ip";
        
        return remoteIp;
    }



    public String getAuditScreenId()
    {
        return request.getParameter("auditScreenId");
    }



}
