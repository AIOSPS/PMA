package eu.pms.common.component;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author Mustafa Al-Tamim
 * @version 1.0
 */

import java.sql.*;

public abstract class DBManager
{
  private Connection connection = null;

  public DBManager(String serverIp,String tns,String userName,String password)
  {
    try
    {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      connection = DriverManager.getConnection(
          "jdbc:oracle:thin:@"+serverIp+":1521:"+tns,
          userName, password);
    }
    catch(Exception e)
    {
      System.out.print(e);
      e.printStackTrace();
    }
  }

  private PreparedStatement buildQuery(int queryID, Object[] parameters)throws Exception
  {
    PreparedStatement stmt = connection.prepareStatement(getQueryBody(queryID, parameters));
    for(int i=0; i<parameters.length; i++)
    {
      stmt.setObject(i+1,parameters[i]);
    }
    return stmt;
  }

  private PreparedStatement buildQuery(String query, Object[] parameters)throws Exception
    {
      PreparedStatement stmt = connection.prepareStatement(query);
      for(int i=0; i<parameters.length; i++)
      {
        stmt.setObject(i+1,parameters[i]);
      }
      return stmt;
    }



  public ResultSet getResultSet(int queryID, Object[] parameters)throws Exception
  {
    PreparedStatement stmt = buildQuery(queryID, parameters);
    stmt.execute();
    return stmt.getResultSet();
  }

  public ResultSet getResultSet(String query, Object[] parameters)throws Exception
  {
    PreparedStatement stmt = buildQuery(query, parameters);
    stmt.execute();
    return stmt.getResultSet();
  }

  public ResultSet getDataFromDynamicQuery(int queryID, Object[] parameters)throws Exception
  {
    PreparedStatement stmt = connection.prepareStatement(getQueryBody(queryID, parameters));
    stmt.execute();
    return stmt.getResultSet();
  }

  public int executeUpdateQuery(int queryID, Object[] parameters, int transactionLevel, boolean autoCommit)throws Exception
  {
    try
    {
      PreparedStatement stmt = buildQuery(queryID, parameters);
      connection.setAutoCommit(autoCommit);
      connection.setTransactionIsolation(transactionLevel);
      stmt.executeUpdate();
      return stmt.getUpdateCount();
    }
    catch(Exception e)
    {
      try{connection.rollback();}
      catch(Exception ee){}
      throw e;
    }
  }

  public void closeConnection()
  {
    try
    {
      connection.commit();
      connection.close();
    }
    catch(SQLException sqlE){sqlE.printStackTrace();}
  }

  // This method must be overwritten in the class which inheret this class
  abstract protected String getQueryBody(int queryID, Object[] parameters) throws Exception;
}
