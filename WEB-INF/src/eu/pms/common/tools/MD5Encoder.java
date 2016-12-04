package eu.pms.common.tools;

/**
 * Created by IntelliJ IDEA.
 * User: mtamim
 * Date: 27/05/2009
 * Time: 11:39:08 ص
 * To change this template use File | Settings | File Templates.
 */

import java.security.*;
import java.math.*;

public class MD5Encoder
{
    public static String encode(String s) throws Exception
    {
        //String s = "This is a test";
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.update(s.getBytes(), 0, s.length());

        s = new BigInteger(1, m.digest()).toString(16);

        if (s.length() == 31)// to not truncate 0 if encoded values start with 0
          s = "0" + s;

        return s;
    }
}
