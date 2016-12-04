package eu.pms.common.component;

import org.hibernate.Session;
import org.hibernate.HibernateException;
import org.hibernate.Query;

import java.util.List;
import java.sql.SQLException;

//import org.apache.log4j.Logger;

/**
 * Created by IntelliJ IDEA.
 * User:  Ibrahim Assi (iassi)
 * Date: Aug 3, 2011
 * Time: 9:18:32 AM
 */
public class DBComponent extends DgfComponent{




//    public List  executeTextHqlQuery(String queryText,Object[] queryParams)
//    {
//        List retList = null;
//        Session session = null;
//
//        try
//        {
//              session = super.getSession();
//              Query query = session.createQuery(queryText);
//
//               for(int j = 0; j < queryParams.length; j++)
//               query.setParameter(j, queryParams[j]);
//
//              retList =query.list();
//
//
//        }
//        catch (SQLException sqle)
//        {
//            if (logger.isDebugEnabled())
//            {
//                logger.debug("Error in data base" + sqle);
//            }
//
//            System.out.println("---->> Error in sql :"+sqle);
//
//        }
//        catch (HibernateException he)
//        {
//            if (logger.isDebugEnabled())
//            {
//                logger.debug("Error in data Hibernate" + he);
//            }
//
//             System.out.println("---->> Error in hibernate :"+he);
//        }
//        finally
//        {
//            if (session != null)
//            {
//                try
//                {
//                    releaseSession(session);
//                }
//                catch (Exception e)
//                {
//                    if (logger.isDebugEnabled())
//                    {
//                        logger.debug("Error closing the session" + e);
//                    }
//                }
//            }
//        }
//        return retList;
//    }
//
//    public List  executeTextHqlQuery(String queryText)
//    {
//        List retList = null;
//        Session session = null;
//
//        try
//        {
//              session = super.getSession();
//              Query query = session.createQuery(queryText);
//              retList =query.list();
//
//
//        }
//        catch (SQLException sqle)
//        {
//            if (logger.isDebugEnabled())
//            {
//                logger.debug("Error in data base" + sqle);
//            }
//
//            System.out.println("---->> Error in sql :"+sqle);
//
//        }
//        catch (HibernateException he)
//        {
//            if (logger.isDebugEnabled())
//            {
//                logger.debug("Error in data Hibernate" + he);
//            }
//
//             System.out.println("---->> Error in hibernate :"+he);
//        }
//        finally
//        {
//            if (session != null)
//            {
//                try
//                {
//                    releaseSession(session);
//                }
//                catch (Exception e)
//                {
//                    if (logger.isDebugEnabled())
//                    {
//                        logger.debug("Error closing the session" + e);
//                    }
//                }
//            }
//        }
//        return retList;
//    }




}
