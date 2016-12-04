package eu.pms.common.component;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author Mustafa Al-Tamim
 * @version 1.0
 */

public class QouDbManager extends DBManager
{
  public static final int GET_ALL_TABLES = 1;
  public static final int GET_TABLE_COLUMN = 2;
  public static final int GET_RESULT = 3;


  public QouDbManager(String serverIp,String tns,String userName,String password)
  {

      super(serverIp, tns, userName, password);
  }

  protected String getQueryBody(int queryNumber, Object[] parameters)throws Exception
  {
    String query="";
    switch(queryNumber)
       {
        case GET_ALL_TABLES:
           query ="select a.tname,a.tabtype from tab a  where a.tabtype='TABLE'";
          break;

        case GET_TABLE_COLUMN:
            query =  " select a.column_name,a.data_type,a.data_length, "+
         " decode(a.nullable,'Y','Allow Null','N','Not Allow Null'), "+
         " a.column_name||' | '||a.data_type||' | '||a.data_length "+
         " from user_tab_columns  a where  table_name='"+parameters[0]+"'";
        break;

      case GET_RESULT:
       query ="";
      break;
      }

    return query;
  }
}
