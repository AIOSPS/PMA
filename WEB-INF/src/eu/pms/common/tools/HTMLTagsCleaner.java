package eu.pms.common.tools;

/**
 * Created by IntelliJ IDEA.
 * User: mtamim
 * Date: Apr 30, 2006
 * Time: 2:12:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class HTMLTagsCleaner
{
    public HTMLTagsCleaner()
    {
    }

public static String filter(String value ,int length)
{

        if (value == null)
            return "";

        char content[] = new char[value.length()];
        value.getChars(0, value.length(), content, 0);
        StringBuffer result = new StringBuffer(value.length() + 50);
        boolean isTag = false;
        for (int i = 0; i < value.length(); i++)
        {
            char temp  = content[i];
            if(temp == '<')
                isTag = true;
            else if(temp == '>')
            {
                isTag = false;
            }
            else if(!isTag)
                result.append(temp);
        }
        String res = result.toString();
        if(res.length() > length)
            res = res.substring(0,length);
        return res;
    }
}
