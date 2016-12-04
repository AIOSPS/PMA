package eu.pms.common.struct;

import eu.pms.common.constant.MsConstant;

/**
 * Created by IntelliJ IDEA.
 * User: Ibrahim Assi (iassi)
 * Date: 7/4/2015
 * Time: 01:09 م
 */
public class MsgCountInfo
{
    Integer msgCount;
    String  msgKey;
    String  msgDesc;
    String  roleId;

    public MsgCountInfo(String msgKey,Integer msgCount )
    {
        this.msgCount = msgCount;
        this.msgKey   = msgKey;
//        this.msgDesc  = MsConstant.getMsgCountDesc(msgKey);
//        this.roleId   = MsConstant.getMsgCountRoleId(msgKey);
    }

    public Integer getMsgCount() {
        return this.msgCount;
    }

    public void setMsgCount(Integer msgCount) {
        this.msgCount = msgCount;
    }

    public String getMsgKey() {
        return this.msgKey;
    }

    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey;
    }

    public String getMsgDesc() {
        return this.msgDesc;
    }

    public void setMsgDesc(String msgDesc) {
        this.msgDesc = msgDesc;
    }

    public String getRoleId() {
        return this.roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}
