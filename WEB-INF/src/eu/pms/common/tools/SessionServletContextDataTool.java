package eu.pms.common.tools;


import eu.pms.common.struct.LabelValueBean;

import javax.servlet.http.HttpServletRequest;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Ibrahim Assi (iassi)
 * Date: 28/12/2015
 * Time: 02:04 م
 */
public class SessionServletContextDataTool
{
        public  final static String HASH_TABLE_NAME = "sessionServletContextHashtable";

        //---------------------------------------------------

        public static void setItem(HttpServletRequest request,Object objKey,Object objValue)
        {
            Hashtable sessionHashtable =null;

            if(request.getSession().getServletContext().getAttribute(HASH_TABLE_NAME)!=null)
            sessionHashtable = (Hashtable) request.getSession().getServletContext().getAttribute(HASH_TABLE_NAME);
            else
            sessionHashtable = new Hashtable();

            sessionHashtable.put(objKey,objValue);
            request.getSession().getServletContext().setAttribute(HASH_TABLE_NAME, sessionHashtable);
        }
        //---------------------------------------------------
        public static void setItem(HttpServletRequest request,List<LabelValueBean> dataList)
        {
           Hashtable sessionHashtable =null;

           if(request.getSession().getServletContext().getAttribute(HASH_TABLE_NAME)!=null)
           sessionHashtable = (Hashtable) request.getSession().getServletContext().getAttribute(HASH_TABLE_NAME);
           else
           sessionHashtable = new Hashtable();

           for(LabelValueBean obj:dataList)
           sessionHashtable.put(obj.getLabel(),obj.getValue());

           request.getSession().getServletContext().setAttribute(HASH_TABLE_NAME, sessionHashtable);
        }

        //---------------------------------------------------

        public static Object getItem(HttpServletRequest request,Object objKey)
        {
            Hashtable sessionHashtable =null;
            if(request.getSession().getServletContext().getAttribute(HASH_TABLE_NAME)!=null)
            sessionHashtable = (Hashtable) request.getSession().getServletContext().getAttribute(HASH_TABLE_NAME);
            else
            return null;

            return sessionHashtable.get(objKey);
        }

        //---------------------------------------------------
}
