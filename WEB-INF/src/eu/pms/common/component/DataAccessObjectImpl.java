package eu.pms.common.component;

/**
 * Created by IntelliJ IDEA.
 * User: orayyan
 * Date: 07/05/2007
 * Time: 09:58:12 ص
 * To change this template use File | Settings | File Templates.
 */

import eu.pms.common.exceptions.ComponentException;
import eu.pms.common.constant.ExceptionType;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.sql.SQLException;
import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;

public class DataAccessObjectImpl extends DgfComponent implements DataAccessObject {


    public Object insert(Object valueObject) throws ComponentException {
        Session session = null;
        int errorType = 0;
        String message = null;

        List retList = new ArrayList();
        Object pkObject = null;
        try {

            session = getSession();
            pkObject = session.save(valueObject);
            retList.add(pkObject);

        } catch (HibernateException hbe) {
            errorType = ExceptionType.HIBERNATE_EXCEPTION;
            message = hbe.getMessage();
        } catch (SQLException sqle) {
            errorType = ExceptionType.SQL_EXCEPTION;
            message = sqle.getMessage();
        } catch (Exception e) {
            errorType = ExceptionType.EXCEPTION;
            message = e.getMessage();
        } finally {
            if (session != null) {
                try {
                    releaseSession(session);
                } catch (Exception e) {
                    errorType = ExceptionType.CLOSE_SESSION_EXCEPTION;
                    message = e.getMessage();
                }
            }
            if (errorType != 0 && message != null) {
                ComponentException componentException = new ComponentException(ExceptionType.SQL_EXCEPTION, "DataAccessObjectImpl.insert", message);

                throw componentException;
            }

        }

        return pkObject;

    }

    public void insertOrUpdate(Object valueObject) throws ComponentException {
        Session session = null;
        int errorType = 0;
        String message = null;


        try {

            session = getSession();
            session.saveOrUpdate(valueObject);

        } catch (HibernateException hbe) {
            errorType = ExceptionType.HIBERNATE_EXCEPTION;
            message = hbe.getMessage();
        } catch (SQLException sqle) {
            errorType = ExceptionType.SQL_EXCEPTION;
            message = sqle.getMessage();
        } catch (Exception e) {
            errorType = ExceptionType.EXCEPTION;
            message = e.getMessage();
        } finally {
            if (session != null) {
                try {
                    releaseSession(session);
                } catch (Exception e) {
                    errorType = ExceptionType.CLOSE_SESSION_EXCEPTION;
                    message = e.getMessage();
                }
            }
            if (errorType != 0 && message != null) {
                ComponentException componentException = new ComponentException(ExceptionType.SQL_EXCEPTION, "DataAccessObjectImpl.insertOrUpdate", message);
                throw componentException;
            }

        }


    }

    public void insertOrUpdate(List data) throws ComponentException {
        Session session = null;
        int errorType = 0;
        String message = null;
        Transaction transaction = null;

        try {

            session = getSession();
            transaction = session.beginTransaction();
            for (Object obj : data)
                session.saveOrUpdate(obj);

            transaction.commit();
        } catch (HibernateException hbe) {
            errorType = ExceptionType.HIBERNATE_EXCEPTION;
            message = hbe.getMessage();
        } catch (SQLException sqle) {
            errorType = ExceptionType.SQL_EXCEPTION;
            message = sqle.getMessage();
        } catch (Exception e) {
            errorType = ExceptionType.EXCEPTION;
            message = e.getMessage();
        } finally {
            if (errorType != 0 && message != null && session != null && transaction != null) {
                transaction.rollback();
            }

            if (session != null) {
                try {
                    releaseSession(session);
                } catch (Exception e) {
                    errorType = ExceptionType.CLOSE_SESSION_EXCEPTION;
                    message = e.getMessage();
                }
            }
            if (errorType != 0 && message != null) {
                ComponentException componentException = new ComponentException(ExceptionType.SQL_EXCEPTION, "DataAccessObjectImpl.insertOrUpdate", message);
                throw componentException;
            }

        }

    }

    public void delete(Object valueObject) throws ComponentException {
        Session session = null;
        int errorType = 0;
        String message = null;

        try {
            session = getSession();
            session.delete(valueObject);

        } catch (HibernateException hbe) {
            errorType = ExceptionType.HIBERNATE_EXCEPTION;
            message = hbe.getMessage();
        } catch (SQLException sqle) {
            errorType = ExceptionType.SQL_EXCEPTION;
            message = sqle.getMessage();
        } catch (Exception e) {
            errorType = ExceptionType.EXCEPTION;
            message = e.getMessage();
        } finally {
            if (session != null) {
                try {
                    releaseSession(session);
                } catch (Exception e) {
                    errorType = ExceptionType.CLOSE_SESSION_EXCEPTION;
                    message = e.getMessage();
                }
            }
            if (errorType != 0 && message != null) {
                ComponentException componentException = new ComponentException(ExceptionType.SQL_EXCEPTION, "DataAccessObjectImpl.delete", message);
                throw componentException;
            }

        }
    }

    public int deleteByHqlQuery(String query, Object[] params) throws ComponentException {
        Session session = null;
        int errorType = 0;
        String message = null;

        int updatedEntities = 0;
        try {
            session = getSession();
            Query q = session.createQuery(query);

            for (int i = 0; i < params.length; i++) {
                q.setParameter(i, params[i]);
            }

            updatedEntities = q.executeUpdate();
        } catch (HibernateException hbe) {
            errorType = ExceptionType.HIBERNATE_EXCEPTION;
            message = hbe.getMessage();
        } catch (SQLException sqle) {
            errorType = ExceptionType.SQL_EXCEPTION;
            message = sqle.getMessage();
        } catch (Exception e) {
            errorType = ExceptionType.EXCEPTION;
            message = e.getMessage();
        } finally {
            if (session != null) {
                try {
                    releaseSession(session);
                } catch (Exception e) {
                    errorType = ExceptionType.CLOSE_SESSION_EXCEPTION;
                    message = e.getMessage();
                }
            }
            if (errorType != 0 && message != null) {
                ComponentException componentException = new ComponentException(ExceptionType.SQL_EXCEPTION, "DataAccessObjectImpl.deleteByHqlQuery", message);
                throw componentException;
            }

        }

        return updatedEntities;
    }
    public int deleteByHqlQuery(String query) throws ComponentException {
        Session session = null;
        int errorType = 0;
        String message = null;

        int updatedEntities = 0;
        try {
            session = getSession();
            Query q = session.createQuery(query);

            updatedEntities = q.executeUpdate();
        } catch (HibernateException hbe) {
            errorType = ExceptionType.HIBERNATE_EXCEPTION;
            message = hbe.getMessage();
        } catch (SQLException sqle) {
            errorType = ExceptionType.SQL_EXCEPTION;
            message = sqle.getMessage();
        } catch (Exception e) {
            errorType = ExceptionType.EXCEPTION;
            message = e.getMessage();
        } finally {
            if (session != null) {
                try {
                    releaseSession(session);
                } catch (Exception e) {
                    errorType = ExceptionType.CLOSE_SESSION_EXCEPTION;
                    message = e.getMessage();
                }
            }
            if (errorType != 0 && message != null) {
                ComponentException componentException = new ComponentException(ExceptionType.SQL_EXCEPTION, "DataAccessObjectImpl.deleteByHqlQuery", message);
                throw componentException;
            }

        }

        return updatedEntities;
    }
    public List delete_JDBC_ODBC(String queryString) throws Exception {
        int errorType = 0;
        String message = null;
        Session session = null;
        List retList = null;
        try {
            session = getSession();
            Query query = session.createSQLQuery(queryString);

            int retVal = query.executeUpdate();
            retList.add(retVal);
        } catch (HibernateException hbe) {
            errorType = ExceptionType.HIBERNATE_EXCEPTION;
            message = hbe.getMessage();
        } catch (SQLException sqle) {
            errorType = ExceptionType.SQL_EXCEPTION;
            message = sqle.getMessage();
        } catch (Exception e) {
            errorType = ExceptionType.EXCEPTION;
            message = e.getMessage();
        } finally {
            if (session != null) {
                try {
                    releaseSession(session);
                } catch (Exception e) {
                    errorType = ExceptionType.CLOSE_SESSION_EXCEPTION;
                    message = e.getMessage();
                }
            }
            if (errorType != 0 && message != null) {
                ComponentException componentException = new ComponentException(ExceptionType.SQL_EXCEPTION, "DataAccessObjectImpl.getJDBC_ODBCList", message);
                throw componentException;
            }

        }

        return retList;
    }


    public void update(Object valueObject) throws ComponentException {
        Session session = null;
        int errorType = 0;
        String message = null;

        try {
            session = getSession();
            session.update(valueObject);
        } catch (HibernateException hbe) {
            errorType = ExceptionType.HIBERNATE_EXCEPTION;
            message = hbe.getMessage();
        } catch (SQLException sqle) {
            errorType = ExceptionType.SQL_EXCEPTION;
            message = sqle.getMessage();
        } catch (Exception e) {
            errorType = ExceptionType.EXCEPTION;
            message = e.getMessage();
        } finally {
            if (session != null) {
                try {
                    releaseSession(session);
                } catch (Exception e) {
                    errorType = ExceptionType.CLOSE_SESSION_EXCEPTION;
                    message = e.getMessage();
                }
            }
            if (errorType != 0 && message != null) {
                ComponentException componentException = new ComponentException(ExceptionType.SQL_EXCEPTION, "DataAccessObjectImpl.update", message);
                throw componentException;
            }

        }
    }

    public List getFromDynamicQuery(String query) throws ComponentException {
        Session session = null;
        int errorType = 0;
        String message = null;

        try {
            session = getSession();
            Query q = session.createQuery(query);
            return q.list();
        } catch (HibernateException hbe) {
            errorType = ExceptionType.HIBERNATE_EXCEPTION;
            message = hbe.getMessage();
        } catch (SQLException sqle) {
            errorType = ExceptionType.SQL_EXCEPTION;
            message = sqle.getMessage();
        } catch (Exception e) {
            errorType = ExceptionType.EXCEPTION;
            message = e.getMessage();
        } finally {
            if (session != null) {
                try {
                    releaseSession(session);
                } catch (Exception e) {
                    errorType = ExceptionType.CLOSE_SESSION_EXCEPTION;
                    message = e.getMessage();
                }
            }
            if (errorType != 0 && message != null) {
                ComponentException componentException = new ComponentException(ExceptionType.SQL_EXCEPTION, "DataAccessObjectImpl.getFromDynamicQuery", message);
                throw componentException;
            }

        }
        return null;
    }

//    Added By Ibrahim Asi Date :23-8-2011

    public Collection getFromDynamicQuery(String query, int firstResult, int maxResult) throws ComponentException {
        Session session = null;
        int errorType = 0;
        String message = null;

        try {
            session = getSession();
            Query q = session.createQuery(query);
            q.setFirstResult(firstResult);
            q.setMaxResults(maxResult);
            return q.list();
        } catch (HibernateException hbe) {
            errorType = ExceptionType.HIBERNATE_EXCEPTION;
            message = hbe.getMessage();
        } catch (SQLException sqle) {
            errorType = ExceptionType.SQL_EXCEPTION;
            message = sqle.getMessage();
        } catch (Exception e) {
            errorType = ExceptionType.EXCEPTION;
            message = e.getMessage();
        } finally {
            if (session != null) {
                try {
                    releaseSession(session);
                } catch (Exception e) {
                    errorType = ExceptionType.CLOSE_SESSION_EXCEPTION;
                    message = e.getMessage();
                }
            }
            if (errorType != 0 && message != null) {
                ComponentException componentException = new ComponentException(ExceptionType.SQL_EXCEPTION, "DataAccessObjectImpl.getFromDynamicQuery(q,f,m)", message);
                throw componentException;
            }

        }
        return null;
    }

    public Collection getFromDynamicQuery(String query, Object[] queryParams, int firstResult, int maxResult) throws ComponentException {
        Session session = null;
        int errorType = 0;
        String message = null;
        try {
            session = getSession();
            Query q = session.createQuery(query);

            for (int j = 0; queryParams != null && j < queryParams.length; j++) {
                q.setParameter(j, queryParams[j]);
            }

            q.setFirstResult(firstResult);
            q.setMaxResults(maxResult);
            return q.list();
        } catch (HibernateException hbe) {
            errorType = ExceptionType.HIBERNATE_EXCEPTION;
            message = hbe.getMessage();
        } catch (SQLException sqle) {
            errorType = ExceptionType.SQL_EXCEPTION;
            message = sqle.getMessage();
        } catch (Exception e) {
            errorType = ExceptionType.EXCEPTION;
            message = e.getMessage();
        } finally {
            if (session != null) {
                try {
                    releaseSession(session);
                } catch (Exception e) {
                    errorType = ExceptionType.CLOSE_SESSION_EXCEPTION;
                    message = e.getMessage();
                }
            }
            if (errorType != 0 && message != null) {
                ComponentException componentException = new ComponentException(ExceptionType.SQL_EXCEPTION, "DataAccessObjectImpl.getFromDynamicQuery(q,f,m)", message);
                throw componentException;
            }

        }
        return null;

    }

    public Collection getFromDynamicQuery(String query, Object[] queryParams) throws ComponentException {
        Session session = null;
        int errorType = 0;
        String message = null;

        try {
            session = getSession();
            Query q = session.createQuery(query);

            for (int j = 0; queryParams != null && j < queryParams.length; j++) {
                q.setParameter(j, queryParams[j]);
            }

            return q.list();
        } catch (HibernateException hbe) {
            errorType = ExceptionType.HIBERNATE_EXCEPTION;
            message = hbe.getMessage();
        } catch (SQLException sqle) {
            errorType = ExceptionType.SQL_EXCEPTION;
            message = sqle.getMessage();
        } catch (Exception e) {
            errorType = ExceptionType.EXCEPTION;
            message = e.getMessage();
        } finally {
            if (session != null) {
                try {
                    releaseSession(session);
                } catch (Exception e) {
                    errorType = ExceptionType.CLOSE_SESSION_EXCEPTION;
                    message = e.getMessage();
                }
            }
            if (errorType != 0 && message != null) {
                ComponentException componentException = new ComponentException(ExceptionType.SQL_EXCEPTION, "DataAccessObjectImpl.getFromDynamicQuery(q,f,m)", message);
                throw componentException;
            }

        }
        return null;

    }


    public Object load(Object object, Object objectKey) throws ComponentException {
        Object retObject;
        Session session;

        int errorType = 0;
        String message = null;

        retObject = null;
        session = null;
        try {
            session = getSession();
            retObject = session.load(object.getClass(), (Serializable) objectKey);
        } catch (HibernateException hbe) {
            errorType = ExceptionType.HIBERNATE_EXCEPTION;
            message = hbe.getMessage();
        } catch (SQLException sqle) {
            errorType = ExceptionType.SQL_EXCEPTION;
            message = sqle.getMessage();
        } catch (Exception e) {
            errorType = ExceptionType.EXCEPTION;
            message = e.getMessage();
        } finally {
            if (session != null) {
                try {
                    releaseSession(session);
                } catch (Exception e) {
                    errorType = ExceptionType.CLOSE_SESSION_EXCEPTION;
                    message = e.getMessage();
                }
            }
            if (errorType != 0 && message != null) {
                ComponentException componentException = new ComponentException(ExceptionType.SQL_EXCEPTION, "DataAccessObjectImpl.load", message);
                throw componentException;
            }

        }

        return retObject;
    }

    public List getList(String namedQuery) throws ComponentException {
        int errorType = 0;
        String message = null;

        List objList = null;
        Session session = null;
        try {
            session = getSession();
            Query q = session.getNamedQuery(namedQuery);
            objList = q.list();
        } catch (HibernateException hbe) {
            errorType = ExceptionType.HIBERNATE_EXCEPTION;
            message = hbe.getMessage();
        } catch (SQLException sqle) {
            errorType = ExceptionType.SQL_EXCEPTION;
            message = sqle.getMessage();
        } catch (Exception e) {
            errorType = ExceptionType.EXCEPTION;
            message = e.getMessage();
        } finally {
            if (session != null) {
                try {
                    releaseSession(session);
                } catch (Exception e) {
                    errorType = ExceptionType.CLOSE_SESSION_EXCEPTION;
                    message = e.getMessage();
                }
            }
            if (errorType != 0 && message != null) {
                ComponentException componentException = new ComponentException(ExceptionType.SQL_EXCEPTION, "DataAccessObjectImpl.getList", message);
                throw componentException;
            }

        }


        return objList;
    }

    public List getJDBC_ODBCList(String queryString) throws Exception {
        return getJDBC_ODBCList(queryString, new Object[]{});
    }

    public List getJDBC_ODBCList(String queryString, Object parameters[]) throws Exception {
        int errorType = 0;
        String message = null;
        Session session = null;
        List retList = null;
        try {
            session = getSession();
            Query query = session.createSQLQuery(queryString);

            for (int i = 0; parameters != null && i < parameters.length; i++)
                query.setParameter(i, parameters[i]);

            retList = query.list();
        } catch (HibernateException hbe) {
            errorType = ExceptionType.HIBERNATE_EXCEPTION;
            message = hbe.getMessage();
        } catch (SQLException sqle) {
            errorType = ExceptionType.SQL_EXCEPTION;
            message = sqle.getMessage();
        } catch (Exception e) {
            errorType = ExceptionType.EXCEPTION;
            message = e.getMessage();
        } finally {
            if (session != null) {
                try {
                    releaseSession(session);
                } catch (Exception e) {
                    errorType = ExceptionType.CLOSE_SESSION_EXCEPTION;
                    message = e.getMessage();
                }
            }
            if (errorType != 0 && message != null) {
                ComponentException componentException = new ComponentException(ExceptionType.SQL_EXCEPTION, "DataAccessObjectImpl.getJDBC_ODBCList", message);
                throw componentException;
            }

        }

        return retList;
    }

    public void deleteAsSelect(String query) throws Exception
    {
        int errorType=0;
        String message=null;

        List objList = null;
        Session session = null;
        try
        {
            session=getSession();
            Query q = session.createQuery(query);
            objList = q.list();

            if(objList!=null && objList.size()>0)
            {
                for(Object obj:objList)
                    session.delete(obj);
            }
        }
        catch (HibernateException hbe)  {  errorType=ExceptionType.HIBERNATE_EXCEPTION; message=hbe.getMessage();  }
        catch (SQLException sqle)       {  errorType=ExceptionType.SQL_EXCEPTION;       message=sqle.getMessage(); }
        catch (Exception e)             {  errorType=ExceptionType.EXCEPTION;           message=e.getMessage();    }

        finally
        {
            if (session != null)
            {
                try  { releaseSession(session); }
                catch (Exception e) { errorType=ExceptionType.CLOSE_SESSION_EXCEPTION;           message=e.getMessage(); }
            }
            if(errorType != 0 && message !=null)
            {
                ComponentException componentException=new ComponentException(ExceptionType.SQL_EXCEPTION,"DataAccessObjectImpl.deleteAsSelect",message);
                throw componentException;
            }

        }
    }

}
