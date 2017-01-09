package eu.pms.common.utils;

import org.apache.commons.lang.StringEscapeUtils;

/**
 * Created by orayyan on 1/9/2017.
 */
public class CommonFilter {
    public static String cleanQeuryParam(String value) {

        if(value == null || value.equals(""))
            return value;

        //     System.out.println("-----------In Cleaner -----------");
        //You'll need to remove the spaces from the html entities below
        value = StringEscapeUtils.escapeSql(value);
        value = StringEscapeUtils.escapeJava(value);
//        value = value.replaceAll("<", "").replaceAll(">", "");
//        value = value.replaceAll(";", "").replaceAll("/", "");
//        value = value.replaceAll("\\(", "").replaceAll("\\)", "");
//        value = value.replaceAll("'", "").replaceAll("\"", "");
//        value = value.replaceAll("#", "").replaceAll("&", "");
//        value = value.replaceAll("#", "").replaceAll("&", "");
//        value = value.replaceAll("--", "").replaceAll("-", "");
//        System.out.println("++++++++++++++++++++++++ : "+value);
        return value;
    }
}
