package eu.pms.common.component;

import eu.pms.common.constant.ExceptionType;
import eu.pms.common.exceptions.ComponentException;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: Ibrahim Assi (iassi)
 * Date: 02/06/15
 * Time: 09:38 ص
 */
public class SequencesCmp  extends DgfComponent
{
    public String getNextValue(String seqName) throws ComponentException
    {
         int errorType =0;
         String message =null;
         Session session = null;
         Transaction tx = null;
         String retValue = null;
        try
              {
                  session = getSession();
                  tx = session.beginTransaction();
                  Connection con = session.connection();

                  CallableStatement cs = con.prepareCall("{? = call GET_NEXT_VAL (?)}");
                  cs.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);

                    cs.setString(2, seqName.trim());
                    cs.execute();
                    retValue = cs.getString(1);

                 tx.commit();

         }
        catch (SQLException sqle)       {  errorType=ExceptionType.SQL_EXCEPTION;       message=sqle.getMessage(); }
        catch (HibernateException hbe)  {  errorType=ExceptionType.HIBERNATE_EXCEPTION; message=hbe.getMessage();  }
        catch (Exception e)             {  errorType=ExceptionType.EXCEPTION;           message=e.getMessage();    }

        finally
        {
            if (session != null)
            {
                try  { releaseSession(session); }
                catch (Exception e) { System.err.println (" error in colse Session  in CallProcedureOrFunction.colseSession :" + e);   errorType=ExceptionType.CLOSE_SESSION_EXCEPTION;           message=e.getMessage();}
            }
            if(errorType != 0 && message !=null)
            {
              ComponentException componentException=new ComponentException(ExceptionType.SQL_EXCEPTION,"CallProcedureOrFunction.callProcedure",message);
              System.err.println(componentException.toString());
              throw componentException;
            }

        }
       return retValue;
    }
}
