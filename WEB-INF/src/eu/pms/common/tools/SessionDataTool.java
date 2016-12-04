package eu.pms.common.tools;

import javax.servlet.http.HttpServletRequest;
import java.util.Hashtable;

/**
 * Created by IntelliJ IDEA.
 * User: Ibrahim Assi (iassi)
 * Date: 01/06/15
 * Time: 09:56 ص
 */
public class SessionDataTool
{
    private  HttpServletRequest request;
    private Hashtable           sessionHashtable ;
    public  final static String HASH_TABLE_NAME = "sessionHashtable";

    public SessionDataTool(HttpServletRequest request)
    {
        this.request = request;
    }


    //***********************************************************************************    HASH_TABLE
        public  void sessionHashtable_setItem(Object objKey,Object objValue)
        {
            if(request.getSession().getAttribute(HASH_TABLE_NAME)!=null)
                sessionHashtable = (Hashtable) request.getSession().getAttribute(HASH_TABLE_NAME);
            else
                sessionHashtable = new Hashtable();

            sessionHashtable.put(objKey,objValue);
            request.getSession().setAttribute(HASH_TABLE_NAME, sessionHashtable);
        }
        //---------------------------------------------------
        public  Object sessionHashtable_getItem(Object objKey)
        {
            if(request.getSession().getAttribute(HASH_TABLE_NAME)!=null)
            sessionHashtable = (Hashtable) request.getSession().getAttribute(HASH_TABLE_NAME);
            else
            return null;

            return sessionHashtable.get(objKey);
        }
    //***********************************************************************************
}
