package eu.pms.common.tools;

import java.util.Hashtable;

/**
 * Created by IntelliJ IDEA.
 * User: mtamim
 * Date: Nov 29, 2005
 * Time: 1:12:31 PM
 * To change this template use File | Settings | File Templates.
 */

public class CharToUnicode
{
    private static Hashtable h = new Hashtable();
    private static String[] keys={"ذ","د","ج","ح","خ","ه","ع","غ","ف","ق",
    "ث","ص","ض","ط","ك","م","ن","ت","ا","ل","ب",
    "ي","س","ش","ظ","ز","و","ة","ى","ر","ؤ","ء",
    "ئ","إ","أ","آ"," ","(",")",",",".","-","/","\\"};
    private static String[] val={"0630","062F","062C","062D","062E","0647","0639",
    "063A","0641","0642","062B","0635","0636","0637","0643","0645",
    "0646","062A","0627","0644","0628","064A","0633","0634","0638",
    "0632","0648","0629","0649","0631","0624","0621","0626","0625",
    "0623","0622","0020","0028","0029","002C","002E","002D","002F",
    "005C"};

    public static String getUnicodeValue(String statement)
    {
      String unicode="";
      if(statement != null && !statement.equals(""))
      {
          for(int y = 0; y < keys.length; y++)
              h.put(keys[y], val[y]);

          String s = statement;

          String sub = "";
          String a = new String();

          for(int n = 0; n < s.length(); n++)
          {
              a = s.substring(n, n + 1);
              if(h.get(a) != null)
                  sub = "\\u" + h.get(a);
              else
                  sub = a;
              unicode = unicode + sub;
          }
          unicode = loadConvert(unicode);
      }
      return unicode;
    }

    public static String loadConvert(String theString) {
            char aChar;
            int len = theString.length();
            StringBuffer outBuffer = new StringBuffer(len);

            for (int x=0; x<len; ) {
                aChar = theString.charAt(x++);
                if (aChar == '\\') {
                    aChar = theString.charAt(x++);
                    if (aChar == 'u') {
                        // Read the xxxx
                        int value=0;
                for (int i=0; i<4; i++) {
                    aChar = theString.charAt(x++);
                    switch (aChar) {
                      case '0': case '1': case '2': case '3': case '4':
                      case '5': case '6': case '7': case '8': case '9':
                         value = (value << 4) + aChar - '0';
                     break;
                  case 'a': case 'b': case 'c':
                              case 'd': case 'e': case 'f':
                     value = (value << 4) + 10 + aChar - 'a';
                     break;
                  case 'A': case 'B': case 'C':
                              case 'D': case 'E': case 'F':
                     value = (value << 4) + 10 + aChar - 'A';
                     break;
                  default:
                                  throw new IllegalArgumentException(
                                               "Malformed \\uxxxx encoding.");
                            }
                        }
                        outBuffer.append((char)value);
                    } else {
                        if (aChar == 't') aChar = '\t';
                        else if (aChar == 'r') aChar = '\r';
                        else if (aChar == 'n') aChar = '\n';
                        else if (aChar == 'f') aChar = '\f';
                        outBuffer.append(aChar);
                    }
                } else
                    outBuffer.append(aChar);
            }
            return outBuffer.toString();
        }


}
