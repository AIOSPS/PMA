package eu.pms.common.component;

import org.apache.struts.upload.FormFile;

import java.util.Collection;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: iassi
 * Date: 06/07/2013
 * Time: 08:45:52 ص
 * To change this template use File | Settings | File Templates.
 */
public class FormCmp 
{


    public static String arabicText(String txt,boolean editOperation  )
    {
         if (!editOperation)
        {
          try {   txt = new String(txt.getBytes("ISO8859_1"), "utf8"); }
          catch (Exception e) { }
        }

        return txt;
    }

    public static String arabicText(String txt )
    {
         try
         {
             txt = new String(txt.getBytes("ISO8859_1"), "utf8");
         }
         catch (Exception e)
         { }
        return txt;
    }

    public static boolean isEmpty(String txt  )
    {
        boolean res=true;

        if(txt!=null && !txt.trim().equals(""))
        res=false;

        return res;
    }

    public static boolean isEmpty(Collection list  )
    {
        boolean res=true;

        if(list!=null && list.size()>0)
        res=false;

        return res;
    }
    public static boolean isEmpty(String [] inpt  )
    {
        boolean res=true;

        if(inpt!=null && inpt.length >0)
        res=false;

        return res;
    }


    public static boolean isEmpty(FormFile theFile)
    {
        boolean res=true;

        if(theFile!=null && theFile.getFileSize()>0)
        res=false;

        return res;
    }



    public static boolean notSelected(String txt  )
    {
        boolean res=true;

        if(txt!=null && !txt.trim().equals("")&& !txt.trim().equals("*"))
        res=false;

        return res;
    }


     public static Integer getValue(Integer v )
    {
          if(v==null)
          v=new Integer(0);

        return v;
    }

    public static boolean isInteger(String txt  )
    {
        boolean res=false;

        try
        {Integer.parseInt(txt);  res=true;  }
        catch (Exception e)
        { res=false;}

        return res;
    }

    public static boolean isLong(String txt  )
    {
        boolean res=false;

        try
        {Long.parseLong(txt);  res=true;  }
        catch (Exception e)
        { res=false;}

        return res;
    }

    public static boolean isDouble(String txt  )
    {
        boolean res=false;

        try
        {Double.parseDouble(txt);  res=true;  }
        catch (Exception e)
        { res=false;}

        return res;
    }

    public static boolean emailPattern(String email  )
    {
        boolean res=false;

        try
        {
            Pattern emailPattern = Pattern.compile("^[a-zA-Z][\\w\\.-]*[a-zA-Z0-9]@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]$");
            if(!isEmpty(email))
            res=emailPattern.matcher(email).matches();
        }
        catch (Exception e)
        {
            res=false;
        }

        return res;
    }
}
