package eu.pms.common.tools;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Al-Quds Open University</p>
 * @author unascribed
 * @version 1.0
 */
import eu.pms.common.utils.TermsList;

import java.util.List;

public class RequestSelectedTermIndexBinder
{
  public RequestSelectedTermIndexBinder()
  {

  }
  public static String setRequestSelectedTermIndex(List termsList, String selectedTerm)
  {
    int index=0;
    for(int i=0; i<termsList.size(); i++)
    {
      TermsList storedTermsList = (TermsList) termsList.get(i);
      if(storedTermsList.getTermNo().equals(selectedTerm))
      {
        index = i;
        break;
      }
    }
    return new String(""+index);
  }
}