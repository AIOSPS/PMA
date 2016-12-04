/*******************************************************************************
 Object Name: DgfComponent
 Description: Super Class for all components with generic methods
 to retrieve Lists of DB Objects based on a named query. It also
 has methods for accessing the cache.
 author: Shamir Karkal,     April 11, 2003
 Modification Block:
 S. No.  Name           Initials		Date         Bug fix no.
 1		Ashutosh		Ashutosh	16.04.03		1
 2		Ashutosh		Ashutosh	25.04.03		2
 3       Shamir          S K         29.04.03    changed to use the db objects
 4		Ashutosh		Ashutosh	19.05.03	using single xml mapping

 updated by Tareq Doufish, Mustafa Al-Tamim
 *******************************************************************************/
package eu.pms.common.component;

import eu.pms.common.exceptions.ComponentException;
import eu.pms.common.utils.Count;
import eu.pms.common.constant.ExceptionType;
import oracle.jdbc.OracleTypes;
import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.persister.entity.AbstractEntityPersister;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.cfg.Configuration;

import java.io.InputStream;
import java.sql.*;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;


/**
 * This abstract class has methods to retrieve Lists of DB Objects from the Database or Cache
 * based on the named query passed.
 */
public abstract class DgfComponent
{

    private static SessionFactory sf;

    private static final String PROPERTIES_FILE_NAME = "/app.properties";
    private static Properties dgfProperties;


    static
    {
        try
        {
            dgfProperties = new Properties();

            Class thisClass = Class.forName("edu.qou.common.component.DgfComponent");
            InputStream is = thisClass.getResourceAsStream(PROPERTIES_FILE_NAME);
            dgfProperties.load(is);

            Configuration cfg = new Configuration();

            String uName=cfg.getProperty("hibernate.connection.username");
            cfg.setProperty("hibernate.connection.username",uName);

            String pwd=cfg.getProperty("hibernate.connection.password");
            cfg.setProperty("hibernate.connection.password", pwd);

            Enumeration enumer = dgfProperties.keys();
            while (enumer.hasMoreElements())
            {
                String mappingFile = dgfProperties.getProperty(enumer.nextElement().
                        toString());
                InputStream mappingIs = thisClass.getResourceAsStream(mappingFile);

//Load all the Mappings.
                try
                {
//cfg.addFile(mappingFile);
                    cfg.addInputStream(mappingIs);
                    System.out.println("cfg ("+mappingFile+") added to the system ");
                }
                catch (MappingException mpe)
                {
                    String errKey = "DgfComponent.CannotMapXMLFile.err";
                    Object[] params = {mappingFile};
                    mpe.printStackTrace();
                }
            }
            sf = cfg.buildSessionFactory(); // or supply a Properties arg
        }

// Better to catch any unexpected exceptions since this is
// a static block.
        catch (Exception e)
        {
            e.printStackTrace();
            String errKey = "DgfComponent.UnexpectedError.err";
            System.err.println("Error in build session factory :"+e);
        }
    }

    /**
     * Gets a property from the global properties.
     *
     * @param propertyKey - the property key
     * @return the property value
     */
    public static String getProperty(String propertyKey)
    {
        return dgfProperties.getProperty(propertyKey);
    }

    /**
     * Sets a property in the global properties.
     *
     * @param propertyKey   - the property key
     * @param propertyValue - the property value
     */
    public static void setProperty(String propertyKey, String propertyValue)
    {
        dgfProperties.setProperty(propertyKey, propertyValue);
    }

    /**
     * Opens a Database connection and returns a Session on that connection
     *
     * @return The Hibernate Session
     * @throws java.sql.SQLException
     */
    public Session getSession()
            throws SQLException, HibernateException
    {
        Session session = null;
//		System.out.println("here session is null");
        synchronized (sf)
        {
            session = sf.openSession();
//			System.out.println("got new sessiuon");
        }
        return session;
    }

    /**
     * Releases a Hibernate Session, after committing the underlying connection.
     *
     * @throws org.hibernate.HibernateException
     *
     * @throws java.sql.SQLException
     */
    public void releaseSession(Session session)
            throws SQLException, HibernateException
    {
        if (session == null)
        return;

        try
        {
            session.flush();
            session.connection().commit();
        }
        finally
        {
            session.close();
        }
    }

    /**
     * Gets a List of DBObjects based on the named query passed.
     * The List is retrieved from the Database and returned.
     *
     * @param namedQuery The String that uniquely identifies the OQL Query
     * @return List of DBObjects
     */
    public List getList(String namedQuery) throws ComponentException
    {
        List objList = null;
        Session session = null;
        int errorType=0;
        String message=null;
        try
        {
             session = getSession();
             Query q = session.getNamedQuery(namedQuery);
             objList = q.list();
        }
        catch (SQLException sqle)       {  errorType=ExceptionType.SQL_EXCEPTION;       message=sqle.getMessage(); }
        catch (HibernateException hbe)  {  errorType=ExceptionType.HIBERNATE_EXCEPTION; message=hbe.getMessage();  }
        catch (Exception e)             {  errorType=ExceptionType.EXCEPTION;           message=e.getMessage();    }

        finally
        {
            if (session != null)
            {
                try  { releaseSession(session); }
                catch (Exception e) {  errorType=ExceptionType.CLOSE_SESSION_EXCEPTION;           message=e.getMessage();}
            }
            if(errorType != 0 && message !=null)
            {
              ComponentException componentException=new ComponentException(ExceptionType.SQL_EXCEPTION,"DgfComponent.getList",message);
              System.err.println(componentException.toString());
              throw componentException;
            }

        }


        return objList;
    }

    /**
     * Gets a List of DBObjects based on the query parameters.
     * The List is retrieved from the Database and returned.
     *
     * @param namedQuery  The String that uniquely identifies the OQL Query
     * @param queryParams array of named parameters to be set while querying
     * @return List of DBObjects
     */
    public List getList(String namedQuery, Object[] queryParams)
            throws ComponentException
    {
        List objList = null;
        StringBuffer thisString = new StringBuffer(100);
        int errorType=0;
        String message=null;

        for (int i = 0; i < queryParams.length; i++)
        {
            String strParam = queryParams[i].toString();
            thisString.append("," + strParam);
        }


        String query = namedQuery + thisString.toString();
        Session session = null;
        try
        {
            session = getSession();
            Query q = session.getNamedQuery(namedQuery);
            for (int j = 0; j < queryParams.length; j++)
            {
                q.setParameter(j, queryParams[j]);
            }

            objList = q.list();
        }
        catch (SQLException sqle)       {  errorType=ExceptionType.SQL_EXCEPTION;       message=sqle.getMessage(); }
        catch (HibernateException hbe)  {  errorType=ExceptionType.HIBERNATE_EXCEPTION; message=hbe.getMessage();  }
        catch (Exception e)             {  errorType=ExceptionType.EXCEPTION;           message=e.getMessage();    }

        finally
        {
            if (session != null)
            {
                try  { releaseSession(session); }
                catch (Exception e) {  errorType=ExceptionType.CLOSE_SESSION_EXCEPTION;           message=e.getMessage();}
            }
            if(errorType != 0 && message !=null)
            {
              ComponentException componentException=new ComponentException(ExceptionType.SQL_EXCEPTION,"DgfComponent.getList",message);
              System.err.println(componentException.toString());
              throw componentException;
            }

        }


        return objList;


    }

    /**
     * Gets a List of top 'N' DBObjects based on the query parameter.
     * The List is retrieved from the Database and returned.
     *
     * @param namedQuery  The String that uniquely identifies the OQL Query
     * @param maxCount    maximum number of records to be returned
     * @param queryParams array of named parameters to be set while querying
     * @return List of DBObjects
     */
    public List getList(String namedQuery, int maxCount, Object[] queryParams)
            throws ComponentException
    {
        List objList = null;
        Integer intMaxCount = new Integer(maxCount);
        StringBuffer thisString = new StringBuffer(100);
        int errorType=0;
        String message=null;

        for (int i = 0; i < queryParams.length; i++)
        {
            String strParam = queryParams[i].toString();
            thisString.append("," + strParam);
        }

        String queryString = namedQuery + thisString.toString();
        String query = queryString + "," + maxCount;

        Session session = null;
        try
        {
            session = getSession();
            Query q = session.getNamedQuery(namedQuery);

            for (int j = 0; j < queryParams.length; j++)
            {
                q.setParameter(j, queryParams[j]);
            }

            q.setMaxResults(maxCount);

            objList = q.list();

        }
        catch (SQLException sqle)       {  errorType=ExceptionType.SQL_EXCEPTION;       message=sqle.getMessage(); }
        catch (HibernateException hbe)  {  errorType=ExceptionType.HIBERNATE_EXCEPTION; message=hbe.getMessage();  }
        catch (Exception e)             {  errorType=ExceptionType.EXCEPTION;           message=e.getMessage();    }

        finally
        {
            if (session != null)
            {
                try  { releaseSession(session); }
                catch (Exception e) { errorType=ExceptionType.CLOSE_SESSION_EXCEPTION;           message=e.getMessage();}
            }
            if(errorType != 0 && message !=null)
            {
              ComponentException componentException=new ComponentException(ExceptionType.SQL_EXCEPTION,"DgfComponent.getList",message);
              System.err.println(componentException.toString());
              throw componentException;
            }

        }


        return objList;
    }


    /**
     * Method that retrieves a specific amount of recored, done for
     * pagination .
     *
     * @param namedQuery
     * @param firstRow
     * @param maxCount
     * @param queryParams
     * @return
     * @throws edu.qou.common.exceptions.ComponentException
     */
    public List getList(String namedQuery, int firstRow, int maxCount, Object[] queryParams)
            throws ComponentException
    {
        List objList = null;
        Integer intFirstRow = new Integer(firstRow);
        Integer intMaxCount = new Integer(maxCount);
        StringBuffer thisString = new StringBuffer(100);
        int errorType=0;
        String message=null;

        for (int i = 0; i < queryParams.length; i++)
        {
            String strParam = queryParams[i].toString();
            thisString.append("," + strParam);
        }

        String queryString = namedQuery + thisString.toString();
        String query = queryString + "," + maxCount;

        Session session = null;
        try
        {
            session = getSession();
            Query q = session.getNamedQuery(namedQuery);

            for (int j = 0; j < queryParams.length; j++)
            {
                q.setParameter(j, queryParams[j]);
            }

            q.setFirstResult(firstRow);
//            q.setMaxResults(com.psgateway.util.pagination.Constants.PAGE_SIZE);
            q.setMaxResults(10);

            objList = q.list();

        }
        catch (SQLException sqle)       {  errorType=ExceptionType.SQL_EXCEPTION;       message=sqle.getMessage(); }
        catch (HibernateException hbe)  {  errorType=ExceptionType.HIBERNATE_EXCEPTION; message=hbe.getMessage();  }
        catch (Exception e)             {  errorType=ExceptionType.EXCEPTION;           message=e.getMessage();    }

        finally
        {
            if (session != null)
            {
                try  { releaseSession(session); }
                catch (Exception e) {  errorType=ExceptionType.CLOSE_SESSION_EXCEPTION;           message=e.getMessage();}
            }
            if(errorType != 0 && message !=null)
            {
              ComponentException componentException=new ComponentException(ExceptionType.SQL_EXCEPTION,"DgfComponent.getList",message);
              System.err.println(componentException.toString());
              throw componentException;
            }

        }
        return objList;
    }

    /**
     * Method that retrieves a specific amount of recored, done for
     * pagination .
     *
     * @param query
     * @param firstRow
     * @param maxCount
     * @return
     * @throws edu.qou.common.exceptions.ComponentException
     */
    public List getList(String query, int firstRow, int maxCount)
            throws ComponentException
    {
        List objList = null;
        Integer intFirstRow = new Integer(firstRow);
        Integer intMaxCount = new Integer(maxCount);
        int errorType=0;
        String message=null;

        Session session = null;
        try
        {
            session = getSession();
            Query q = session.createQuery(query);

            q.setFirstResult(firstRow);
//            q.setMaxResults(com.psgateway.util.pagination.Constants.PAGE_SIZE);
            q.setMaxResults(10);

            objList = q.list();
        }
        catch (SQLException sqle)       {  errorType=ExceptionType.SQL_EXCEPTION;       message=sqle.getMessage(); }
        catch (HibernateException hbe)  {  errorType=ExceptionType.HIBERNATE_EXCEPTION; message=hbe.getMessage();  }
        catch (Exception e)             {  errorType=ExceptionType.EXCEPTION;           message=e.getMessage();    }

        finally
        {
            if (session != null)
            {
                try  { releaseSession(session); }
                catch (Exception e) {  errorType=ExceptionType.CLOSE_SESSION_EXCEPTION;           message=e.getMessage(); }
            }
            if(errorType != 0 && message !=null)
            {
              ComponentException componentException=new ComponentException(ExceptionType.SQL_EXCEPTION,"DgfComponent.getList",message);
              System.err.println(componentException.toString());
              throw componentException;
            }

        }
        return objList;
    }

    /**
     * Method that retrieves a specific amount of recored, done for
     * pagination .
     *
     * @param namedQuery
     * @param firstRow
     * @param maxCount
     * @param queryParams
     * @return
     * @throws edu.qou.common.exceptions.ComponentException
     */
    public List getFilteredList(String namedQuery, int firstRow, int maxCount, Object[] queryParams)
            throws ComponentException
    {
        List objList = null;
        Integer intFirstRow = new Integer(firstRow);
        Integer intMaxCount = new Integer(maxCount);
        StringBuffer thisString = new StringBuffer(100);
        int errorType=0;
        String message=null;

        for (int i = 0; i < queryParams.length; i++)
        {
            String strParam = queryParams[i].toString();
            thisString.append("," + strParam);
        }

        String queryString = namedQuery + thisString.toString();
        String query = queryString + "," + maxCount;

        Session session = null;
        try
        {
            session = getSession();
            Query q = session.getNamedQuery(namedQuery);

            for (int j = 0; j < queryParams.length; j++)
            {
                q.setParameter(j, queryParams[j]);
            }

            q.setFirstResult(firstRow);
            q.setMaxResults(maxCount);

            objList = q.list();

        }
        catch (SQLException sqle)       {  errorType=ExceptionType.SQL_EXCEPTION;       message=sqle.getMessage(); }
        catch (HibernateException hbe)  {  errorType=ExceptionType.HIBERNATE_EXCEPTION; message=hbe.getMessage();  }
        catch (Exception e)             {  errorType=ExceptionType.EXCEPTION;           message=e.getMessage();    }

        finally
        {
            if (session != null)
            {
                try  { releaseSession(session); }
                catch (Exception e) {  errorType=ExceptionType.CLOSE_SESSION_EXCEPTION;           message=e.getMessage();}
            }
            if(errorType != 0 && message !=null)
            {
              ComponentException componentException=new ComponentException(ExceptionType.SQL_EXCEPTION,"DgfComponent.getFilteredList",message);
              System.err.println(componentException.toString());
              throw componentException;
            }

        }


        return objList;
    }
    public List getFilteredList(String namedQuery,  Object[] queryParams)
              throws ComponentException
      {
          List objList = null;
          StringBuffer thisString = new StringBuffer(100);
          int errorType=0;
          String message=null;

          for (int i = 0; i < queryParams.length; i++)
          {
              String strParam = queryParams[i].toString();
              thisString.append("," + strParam);
          }

          String queryString = namedQuery + thisString.toString();
          String query = queryString ;

          Session session = null;
          try
          {
              session = getSession();
              Query q = session.getNamedQuery(namedQuery);

              for (int j = 0; j < queryParams.length; j++)
              {
                  q.setParameter(j, queryParams[j]);
              }
              objList = q.list();

          }
          catch (SQLException sqle)       {  errorType=ExceptionType.SQL_EXCEPTION;       message=sqle.getMessage(); }
          catch (HibernateException hbe)  {  errorType=ExceptionType.HIBERNATE_EXCEPTION; message=hbe.getMessage();  }
          catch (Exception e)             {  errorType=ExceptionType.EXCEPTION;           message=e.getMessage();    }

          finally
          {
              if (session != null)
              {
                  try  { releaseSession(session); }
                  catch (Exception e) {  errorType=ExceptionType.CLOSE_SESSION_EXCEPTION;           message=e.getMessage();}
              }
              if(errorType != 0 && message !=null)
              {
                ComponentException componentException=new ComponentException(ExceptionType.SQL_EXCEPTION,"DgfComponent.getFilteredList",message);
                System.err.println(componentException.toString());
                throw componentException;
              }

          }


          return objList;
      }
    /**
     * Gets the Count of records based on the query parameter.
     * The Count is retrieved from the Database and the Cache is updated.
     *
     * @param namedQuery The String that uniquely identifies the OQL Query
     * @return The Count object
     */
    public Count getCount(String namedQuery) throws ComponentException
    {
        Count cnt = null;

        Session session = null;
        int errorType=0;
        String message=null;

        try
        {
            session = getSession();
            Query q = session.getNamedQuery(namedQuery);
            Iterator results = q.iterate();
            if (results.hasNext())
            {
                Long count = (Long) results.next();
                cnt = new Count();
                cnt.setCount(count);
                return cnt;
            }
        }
        catch (SQLException sqle)       {  errorType=ExceptionType.SQL_EXCEPTION;       message=sqle.getMessage(); }
        catch (HibernateException hbe)  {  errorType=ExceptionType.HIBERNATE_EXCEPTION; message=hbe.getMessage();  }
        catch (Exception e)             {  errorType=ExceptionType.EXCEPTION;           message=e.getMessage();    }

        finally
        {
            if (session != null)
            {
                try  { releaseSession(session); }
                catch (Exception e) {  errorType=ExceptionType.CLOSE_SESSION_EXCEPTION;           message=e.getMessage();}
            }
            if(errorType != 0 && message !=null)
            {
              ComponentException componentException=new ComponentException(ExceptionType.SQL_EXCEPTION,"DgfComponent.getCount",message);
              System.err.println(componentException.toString());
              throw componentException;
            }

        }


        return cnt;
    }

    /**
     * Gets the Count of records based on a query parameter.
     * The named parameters can be passed to this query at runtime.
     * These parameters are passed in form of an object array.
     * the Count is retrieved from the Database and returned.
     *
     * @param namedQuery  The String that uniquely identifies the OQL Query
     * @param queryParams The array of named parameters for this query
     * @return The Count object
     */
    public Count getCount(String namedQuery, Object[] queryParams)
            throws ComponentException
    {
        Count cnt = null;
        StringBuffer thisString = new StringBuffer(100);
        int errorType=0;
        String message=null;

        for (int i = 0; i < queryParams.length; i++)
        {
            String strParam = queryParams[i].toString();
            thisString.append("," + strParam);
        }

        String query = namedQuery + thisString.toString();

        Session session = null;

        try
        {
            session = getSession();
            Query q = session.getNamedQuery(namedQuery);

            for (int j = 0; j < queryParams.length; j++)
            {
                q.setParameter(j, queryParams[j]);
            }

            Iterator results = q.iterate();
            if (results.hasNext())
            {
                Long count = (Long) results.next();
                cnt = new Count();
                cnt.setCount(count.intValue());
                return cnt;
            }
        }
        catch (SQLException sqle)       {  errorType=ExceptionType.SQL_EXCEPTION;       message=sqle.getMessage(); }
        catch (HibernateException hbe)  {  errorType=ExceptionType.HIBERNATE_EXCEPTION; message=hbe.getMessage();  }
        catch (Exception e)             {  errorType=ExceptionType.EXCEPTION;           message=e.getMessage();    }

        finally
        {
            if (session != null)
            {
                try  { releaseSession(session); }
                catch (Exception e) {  errorType=ExceptionType.CLOSE_SESSION_EXCEPTION;           message=e.getMessage(); }
            }
            if(errorType != 0 && message !=null)
            {
              ComponentException componentException=new ComponentException(ExceptionType.SQL_EXCEPTION,"DgfComponent.getFilteredList",message);
              System.err.println(componentException.toString());
              throw componentException;
            }

        }


        return cnt;
    }

    /**
     * Method convertToString.
     * <p/>
     * Converts the passed List into a String, which contains the toString of
     * the elements of the vector surrounded by "'" and delimited by ","
     *
     * @param l
     * @return String
     */
    protected String convertToString(List l)
    {
        StringBuffer sb = new StringBuffer();
        Iterator itrLocal = l.iterator();

        while (itrLocal.hasNext())
        {
            sb.append("'").append(itrLocal.next().toString()).append("'");
            if (itrLocal.hasNext())
            {
                sb.append(",");
            }
        }

        return sb.toString();
    }

    /**
     * Converts the passed Clob into a String
     *
     * @param content
     * @return String
     */
    public static String convertToString(Clob content) throws SQLException
    {
        String contentAsString = null;
        if (content != null)
        {
            contentAsString =
                    content.getSubString((long) 1, (int) content.length());
        }

        return contentAsString;
    }

//    Added By Ibrahim Assi date:14-9-2011

  public int updateSqlQuery(String queryString)
        throws SQLException,HibernateException, Exception
    {
        int updatedRowsCount=-1;
        Session hibernateSession = null;

        try
        {
            hibernateSession = getSession();
            Connection connection = hibernateSession.connection();
            PreparedStatement stmt = connection.prepareStatement(queryString);
            updatedRowsCount = stmt.executeUpdate();
            connection.commit();
            stmt.close();
        }
        finally
        {
            if(hibernateSession!=null)
            releaseSession(hibernateSession);
        }


      return updatedRowsCount;
  }

     public Session getSession( Connection conn)
            throws SQLException, HibernateException
    {
        Session session = null;
         synchronized (sf)
        {
            session = sf.openSession(conn);
        }
        return session;
    }

    public Session getSession( EmptyInterceptor interceptor)
            throws SQLException, HibernateException
    {
        Session session = null;
         synchronized (sf)
        {
            session = sf.openSession(interceptor);
         }
        return session;
    }

   public String getTableName(String className)
   {
        String tableName="";
        ClassMetadata hibernateMetadata =null;
        synchronized (sf)
        {
           hibernateMetadata = sf.getClassMetadata(className);
        }

        if (hibernateMetadata != null&&hibernateMetadata instanceof AbstractEntityPersister)
        {
          AbstractEntityPersister persister = (AbstractEntityPersister) hibernateMetadata;
          tableName = persister.getTableName().toUpperCase();
//        String[] columnNames = persister.getKeyColumnNames();
        }

       return tableName;
   }

   public void deleteAsSelect(String query) throws Exception 
   {
       Session session = null;
       List retList=null;

       try
       {
           session=getSession();
           Query q = session.createQuery(query);
           retList = q.list();

           if(retList!=null && retList.size()>0)
           {
               for(Object obj:retList)
               session.delete(obj);
           }
       }
       finally
       {
           releaseSession(session);
       }
   }

    public int callDBProcedure(Object[] par, String procName) throws Exception {

      int errorCode = 0;
      int errorType=0;
      String message=null;


     if (par.length > 0) {

         Session session=null;

         try {

             String procParm = "";

             for (int i = 0; i < par.length; i++) {
                 procParm = procParm + "?,";
             }
             procParm = procParm.substring(0, procParm.lastIndexOf(","));
             session =getSession();
             PreparedStatement st = session.connection().prepareStatement("{call " + procName + " (" + procParm + ")}");

             for (int i = 0; i < par.length; i++) {
                 st.setObject(i + 1, par[i]);
             }

             st.execute();


         }
         catch (Exception generalException)
         {
             generalException.printStackTrace();
             String error = generalException.getMessage().substring(4, 9);
             errorCode = new Integer(error).intValue();
         }
         finally
         {
             if (session != null)
             {
                 try  { releaseSession(session); }
                 catch (Exception e) { errorType=ExceptionType.CLOSE_SESSION_EXCEPTION;           message=e.getMessage(); }
             }
             if(errorType != 0 && message !=null)
             {
               System.err.println("Error in DgfComponent.callProcedure:"+message);
               ComponentException componentException=new ComponentException(ExceptionType.SQL_EXCEPTION,"DataAccessObjectImpl.callProcedure",message);
               throw componentException;
             }

         }
     }


     return errorCode;
 }
    public String callDBFunction(Object[] par, String funName) throws Exception {

      int errorCode = 0;
      int errorType=0;
      String message=null;
      String retVal="";


     if (par.length > 0) {

         Session session=null;

         try {

             String funParm = "";

             for (int i = 0; i < par.length; i++) {
                 funParm = funParm + "?,";
             }
             funParm = funParm.substring(0, funParm.lastIndexOf(","));
             session =getSession();
             CallableStatement st = session.connection().prepareCall("{? = call " + funName + " (" + funParm + ")}");
             st.registerOutParameter(1, OracleTypes.VARCHAR);

             for (int i = 0; i < par.length; i++) {
                 st.setObject(i + 2, par[i]);
             }

             st.execute();
             retVal = st.getString(1);

         }
         finally
         {
             if (session != null)
             {
                 try  { releaseSession(session); }
                 catch (Exception e) { errorType=ExceptionType.CLOSE_SESSION_EXCEPTION;           message=e.getMessage(); }
             }

         }
     }


     return retVal;
 }

//   End Added By Ibrahim Assi date:14-9-2011
}
