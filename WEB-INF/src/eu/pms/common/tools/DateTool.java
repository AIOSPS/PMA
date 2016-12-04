package eu.pms.common.tools;

import org.apache.commons.lang.time.FastDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.text.SimpleDateFormat;

/**
 * Auther: Mureed F.Al-Alem
 * Date: Jan 2, 2008
 * Time: 12:24:52 PM
 * QOU Portal Project (ICTC)  center
 * version 1.0
 */
public class DateTool {

    public static int  oneDay = 86400000;    // day time represent by long

    public static String DD_MM_YYYY = "dd/MM/yyyy";
    public static String DD_MM_YY = "dd/MM/yy";
    public static String DDMMYYYY = "dd.MM.yyyy";
    public static String DDMMYY = "dd.MM.yy";
    public static String YYYY_MM_DD = "yyyy/MM/dd";
    public static String YY_MM_DD = "yy/MM/dd";
    public static String YYYYMMDD = "yyyy.MM.dd";
    public static String YYMMDD = "yy.MM.dd";
    public static String YYYY_DD_MM = "yyyy/dd/MM";
    public static String YY_DD_MM = "yy/dd/MM";
    public static String YYYYDDMM = "yyyy.dd.MM";
    public static String YYDDMM = "yy.dd.MM";
    public static String HHMMSS = "HH:mm:SS";
    public static String HHMM = "HH:mm";
    public static String HH = "HH";
    public static String MI = "mm";
    public static String DD_MM_YYYY_HH_MM = "dd/MM/yyyy HH:mm";
    public static String DD_MM_YYYY_HH_MM_SS = "dd/MM/yyyy HH:mm:SS";
    public static String DDMMYYYYHH_MM_SS = "dd.MM.yyyy HH:mm:SS";
    public static String DDMMYYYYHH_MM = "dd.MM.yyyy HH:mm";
    public static String DDMMYYHH_MM = "dd.MM.yy HH:mm";
    public static String DDMMYYHH_MM_SS = "dd.MM.yy HH:mm:SS";
    public static String DD_MM_YY_HH_MM_SS = "dd/MM/yy HH:mm:SS";
    public static String MM_YY =  "MM/yy";
    public static String MM_YYYY =  "MM/yyyy";
    public static String MMYY =  "MM.yy";
    public static String MMYYYY =  "MM.yyyy";
    public static String DASH_DD_MM_YYYY = "dd-MM-yyyy";
    public static String DASH_DD_MM_YY = "dd-MM-yy";
    public static String DASH_DD_MM_YYYY_HH_MM = "dd-MM-yyyy HH:mm";
    public static String DASH_DD_MM_YY_HH_MM = "dd-MM-yy HH:mm";
    public static String DASH_YYYY_MM_DD = "yyyy-MM-dd";
    public static String DASH_YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";
    public static String DASH_YY_MM_DD = "yy-MM-dd";
    

    public static String getNextDate(Date startDate, int period, Hashtable exceptionDate) {

        Date nextDay = new Date(startDate.getTime());
        for (int i = 0; i < period;) {
            nextDay = new Date(nextDay.getTime() + oneDay);
            if (exceptionDate.get(nextDay.getDay() + "") != null) {
                continue;
            }
            i++;
        }
        return new SimpleDateFormat("dd/MM/yyyy").format(new Date(nextDay.getTime()));
    }

    public static String getNextDate(Date startDate, Date endDate, int period, Hashtable exceptionDate) {
        try{
            Date nextDay = new Date(startDate.getTime());
        for (int i = 0; i < period;) {
            nextDay = new Date(nextDay.getTime() + oneDay);
            if (exceptionDate.get(nextDay.getDay() + "") != null) {
                continue;
            }
            i++;
        }

        if (endDate.getTime() < nextDay.getTime())
            return new SimpleDateFormat("dd/MM/yyyy").format(new Date(endDate.getTime()));
        else
            return new SimpleDateFormat("dd/MM/yyyy").format(new Date(nextDay.getTime()));
        }catch(Exception e)
        {
         e.printStackTrace();
         return "--/--/----";   
        }

    }


    public static String getDateDay(int dayValue) {

        String day = "Sunday";

        if (dayValue == 0)
            day = "Sunday";
        else if (dayValue == 1)
            day = "Monday";
        else if (dayValue == 2)
            day = "Tuesday";
        else if (dayValue == 3)
            day = "Wednesday";
        else if (dayValue == 4)
            day = "Thursday";
        else if (dayValue == 5)
            day = "Friday";
        else if (dayValue == 6)
            day = "Saturday";
        return day;
    }

    public static String getDateArabicDay(int dayValue) {

        String day = "الاحد";

        if (dayValue == 0)
            day = "الاحد";
        else if (dayValue == 1)
            day = "الاثنين";
        else if (dayValue == 2)
            day = "الثلاثاء";
        else if (dayValue == 3)
            day = "الاربعاء";
        else if (dayValue == 4)
            day = "الخميس";
        else if (dayValue == 5)
            day = "الجمعة";
        else if (dayValue == 6)
            day = "السبت";


        return day;
    }

    public static Date convertStringToDate_dd_mm_yyyy(String dateValue) {

        Date date = null;

        try {
            SimpleDateFormat formatter = new
                    SimpleDateFormat("dd/MM/yyyy");
            if (dateValue != null && dateValue.trim().length() > 0)
                date = formatter.parse(dateValue.trim());
        } catch (Exception ex) {
        }
        return date;
    }


    public static Date convertStringDotsToDate_HH_mm_SS(String dateValue) {

        Date date = null;

        try {
            SimpleDateFormat formatter = new
                    SimpleDateFormat("HH:mm:SS");
            if (dateValue != null && dateValue.trim().length() > 0)
                date = formatter.parse(dateValue.trim());
        } catch (Exception ex) {
        }
        return date;
    }

    public static Date convertStringDotsToDate_HH_mm(String dateValue) {

        Date date = null;

        try {
            SimpleDateFormat formatter = new
                    SimpleDateFormat("HH:mm");
            if (dateValue != null && dateValue.trim().length() > 0)
                date = formatter.parse(dateValue.trim());
        } catch (Exception ex) {
        }
        return date;
    }

    public static Date convertStringToDate(String dateValue) {

        Date date = null;

        try {
            SimpleDateFormat formatter = new
                    SimpleDateFormat("dd/MM/yyyy");
            if (dateValue != null && dateValue.trim().length() > 0)
                date = formatter.parse(dateValue.trim());
        } catch (Exception ex) {
        }
        return date;
    }

    public static Date convertStringToDateMM_YYYY(String dateValue) {

        Date date = null;

        try {
            SimpleDateFormat formatter = new
                    SimpleDateFormat("MM/yyyy");
            if (dateValue != null && dateValue.trim().length() > 0)
                date = formatter.parse(dateValue.trim());
        } catch (Exception ex) {
            System.out.println(" error in converting date to month date ");
        }
        return date;
    }

    public static Date convertStringToDateYYY_MM_DD(String dateValue) {

        Date date = null;

        try {
            SimpleDateFormat formatter = new
                    SimpleDateFormat("yyyy-MM-dd");
            if (dateValue != null && dateValue.trim().length() > 0)
                date = formatter.parse(dateValue.trim());
        } catch (Exception ex) {
        }
        return date;
    }

  public static Date convertStringToDate(String dateValue, String format)
  {

        Date date = null;

        try {
            SimpleDateFormat formatter = new SimpleDateFormat(format);
            if (dateValue != null && dateValue.trim().length() > 0) {
                date = formatter.parse(dateValue.trim());
            }
        } catch (Exception ex) {
        }
        return date;
    }


    public static final String decorateYYYY_MM_DD(Object columnValue) {

        FastDateFormat dateFormat = FastDateFormat.getInstance("yyyy-MM-dd");

        if (columnValue != null) {

            Date date = (Date) columnValue;
            return dateFormat.format(date);
        } else
            return " ";
    }

    public static final String decorateHH_mm_SS(Object columnValue) {

        FastDateFormat dateFormat = FastDateFormat.getInstance("HH:mm:SS");

        if (columnValue != null) {

            Date date = (Date) columnValue;
            return dateFormat.format(date);
        } else
            return " ";
    }

    public static final String decorateHH_mm(Object columnValue) {

        FastDateFormat dateFormat = FastDateFormat.getInstance("HH:mm");

        if (columnValue != null) {

            Date date = (Date) columnValue;
            return dateFormat.format(date);
        } else
            return " ";
    }

    public static final String decorateDD_MM_YYYY(Object columnValue) {

        FastDateFormat dateFormat = FastDateFormat.getInstance("dd/MM/yyyy");

        if (columnValue != null) {

            Date date = (Date) columnValue;
            return dateFormat.format(date);
        } else
            return " ";
    }

     public static final String decorateDate(Object columnValue,String format)
     {

        FastDateFormat dateFormat = FastDateFormat.getInstance(format);

        if (columnValue != null) {

            Date date = (Date) columnValue;
            return dateFormat.format(date);
        } else {
            return " ";
        }
    }

      public static final long calcDiffMinutesBtwnDate(Date startDate,Date endDate)
        {
            long result=-1;
            try
            {
                result=  (endDate.getTime() - startDate.getTime())/ (60 * 1000);
            }
            catch (Exception e)
            {
                result=-1;
                e.printStackTrace();

            }
            return result;
        }


    public static final Date getNextDate(Date startDate,int period)
      {
          Date result=null;
          try
          {
              Calendar c = Calendar.getInstance();
              c.setTime(startDate);
              c.add(Calendar.DATE, period);
              result = c.getTime();
          }
          catch (Exception e)
          {
              result=null;
              e.printStackTrace();
          }
          return result;
      }


}
