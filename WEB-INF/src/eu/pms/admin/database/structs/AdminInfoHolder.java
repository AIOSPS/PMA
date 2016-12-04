package eu.pms.admin.database.structs;

/**
 * Created by IntelliJ IDEA.
 * User: orayyan
 * Date: 12/11/2008
 * Time: 09:32:17 ص
 * To change this template use File | Settings | File Templates.
 */
public class AdminInfoHolder {

    private String userCode;
    private String userName;
    private String userProgramNo;
    private String userSpecNo;
    private String currentTermNo;

    public AdminInfoHolder()
    {

    }

    public AdminInfoHolder(String userCode, String userName, String userProgramNo, String userSpecNo)
    {
        this.userCode = userCode;
        this.userName = userName;
        this.userProgramNo = userProgramNo;
        this.userSpecNo = userSpecNo;
    }

    public AdminInfoHolder(String userCode, String userName, String userProgramNo, String userSpecNo, String currentTermNo)
    {
        this.userCode = userCode;
        this.userName = userName;
        this.userProgramNo = userProgramNo;
        this.userSpecNo = userSpecNo;
        this.currentTermNo = currentTermNo;
    }

    public String getUserCode()
    {
        return userCode;
    }

    public void setUserCode(String userCode)
    {
        this.userCode = userCode;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserProgramNo() {
        return userProgramNo;
    }

    public void setUserProgramNo(String userProgramNo) {
        this.userProgramNo = userProgramNo;
    }

    public String getUserSpecNo() {
        return userSpecNo;
    }

    public void setUserSpecNo(String userSpecNo) {
        this.userSpecNo = userSpecNo;
    }

    public String getCurrentTermNo() {
        return currentTermNo;
    }

    public void setCurrentTermNo(String currentTermNo)
    {
        this.currentTermNo = currentTermNo;
    }
}
