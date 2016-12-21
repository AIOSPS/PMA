package eu.pms.lookup.component;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.lookup.database.LookupObject;
import eu.pms.lookup.database.PmsDatasourc;
import eu.pms.lookup.database.PmsBenificiaryTyp;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import java.sql.SQLException;

public class LookupComponent extends DataAccessObjectImpl {

    public LookupObject loadLookup(String lookupId, int lookupType)
    {
        Session session = null;
        LookupObject lop = null;
        try
        {
            session = getSession();
            switch (lookupType)
            {
                case 1:
                    lop = (PmsDatasourc) session.get(PmsDatasourc.class, lookupId);
                    break;
                case 2:
                    lop = (PmsDatasourc) session.get(PmsBenificiaryTyp.class, lookupId);
                    break;
            }

        }
         catch (HibernateException hbe)
        {
            System.out.println("Error in loading lookup: " + hbe);
        }
        catch (SQLException sqle)
        {
            System.out.println("Insert error in database" + sqle);
        }
        finally
        {
            if (session != null)
            {
                try
                {
                    releaseSession(session);
                }
                catch (Exception e)
                {
                    System.out.println("Insert error in close session" + e);
                }
            }
        }
        return lop;
    }


}
