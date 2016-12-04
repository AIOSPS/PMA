package eu.pms.common.constant;

import eu.pms.common.tools.SessionDataTool;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User:  Ibrahim Assi (iassi)
 * Date: Jul 15, 2011
 * Time: 8:57:55 AM
 */
public class SystemConstant {

    public static final String DATA_LIST = "dataList";
    public static final String RESULT_SEARCH_NO = "resultSearchNo";
    public static final String SEARCH_NOT_FOUND_RESULT = "searchNotFoundResult";

    public static final int RATES_ADMISSION = 0;
    public static final int ADMISSION_CONFIGURATION = 1;
    public static final int REGISTRATION_CONFIGURATION = 2;
    public static final int UPDATE_MYSQL_CONNECTION = 3;
    public static final int UPDATE_LOGIN_ATTRIBUTE= 4;
    public static final String FAIL = "fail";
    public static final String SUCCESS = "success";

    public static final String POLLS_FOR_TUTORS = "tut";
    public static final String POLLS_FOR_STUDENT = "stud";
    public static final String POLLS_FOR_ALL_USER = "all";

    public static final int CHECK_DATE_SUB_ANS_ASSIGN = 1;
    public static final int CHECK_DATE_PUB_ANS_ASSIGN = 2;

    public static final String PROPERTY_MESSAGE_TXT = "propertyMessageTxt";

    public static final int TUTOR = 0;
    public static final int STUDENT = 1;

    public static final int ELECTRONIC_COURSES = 1;
    public static final int ELECTRONIC_ASSIGNMENTS = 2;
    public static final int ELECTRONIC_TRAINING = 3;

    public static final String ACTIVE_HTTPS="activeHttps";    

    /* session attributes that will be removed when login  */
    public static ArrayList<String> getSessionAttributes()
    {
        ArrayList<String> dataList=new ArrayList<String>();

        dataList.add(UserInfoHolder.STUDENT_INFO );
        dataList.add(UserInfoHolder.TUTOR_INFO );
        dataList.add(UserInfoHolder.CMAA_INFO );
        dataList.add(UserInfoHolder.ASSIGN_DEPT_INFO );
        dataList.add(UserInfoHolder.REG_DEPT_INFO );
        dataList.add(UserInfoHolder.FIN_DEPT_INFO );
        dataList.add(UserInfoHolder.STUD_AFF_ADMIN_INFO );
        dataList.add(UserInfoHolder.PRES_INFO );
        dataList.add(UserInfoHolder.ADMIN_REG_INFO );
        dataList.add(UserInfoHolder.STUD_ACT_INFO );
        dataList.add(UserInfoHolder.QLTY_INFO );
        dataList.add(UserInfoHolder.ACAD_INFO );
        dataList.add(UserInfoHolder.ODLC_INFO );
        dataList.add(UserInfoHolder.ADMIN_INFO );
        dataList.add(UserInfoHolder.ADM_INFO );
        dataList.add(SessionDataTool.HASH_TABLE_NAME );
        dataList.add("msgCountInfoAllList");

        return  dataList;
    }
}
