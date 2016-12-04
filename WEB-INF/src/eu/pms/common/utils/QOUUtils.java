package eu.pms.common.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Ibrahim Assi (iassi)
 * Date: 7/1/2015
 * Time: 01:44 م
 */
public class QOUUtils
{
    public static String getSmallUserName( String empName)
        {
            String smallEmpName="";

                if (empName != null && !empName.trim().equalsIgnoreCase(""))
                {
                    if (empName.trim().indexOf(" ") > -1) {
                        smallEmpName = empName.substring(0, empName.indexOf(" "));
                        if (empName.trim().lastIndexOf(" ") > -1 && empName.trim().lastIndexOf(" ") < empName.trim().length())
                        {
                            smallEmpName = smallEmpName + " " + empName.substring(empName.trim().lastIndexOf(" "), empName.trim().length());
                            return smallEmpName;
                        }
                    }
                    return empName;
                }
                else
                    return "";
        }

    public static boolean befor6Months(Date d1) {


            boolean res= false;
            Calendar c = Calendar.getInstance();
            c.setTime(d1);
            c.add(Calendar.MONTH,6);

           if(c.getTime().compareTo(new Date()) <=0)
           res=true ;


            return res;
        }
}
