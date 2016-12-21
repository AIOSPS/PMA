package eu.pms.lookup.useCase;

import eu.pms.common.exceptions.ComponentException;
import eu.pms.common.useCase.ComponentUseCase;
import eu.pms.lookup.component.LookupComponent;
import eu.pms.lookup.database.LookupObject;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DeleteLookupUseCase implements ComponentUseCase
{
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException
    {
        ArrayList retList = null;
        Iterator itr = input.iterator();

        String lockupType = (String) itr.next();
        int lkpType = Integer.parseInt(lockupType);
        String lkpId = (String) itr.next();
        LookupObject lop = null;
        LookupComponent lookupComponent = new LookupComponent();
        try
        {
            lop = lookupComponent.loadLookup(lkpId,lkpType);
            if(lop != null)
            {
                lookupComponent.delete(lop);
            }
            else
                throw new HibernateException("Undefined lookup in the system");
        }
        catch (ComponentException ce)
        {
            System.out.println("Error deleting a lookup: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error deleting a lookup"));
        }
        return retList;
    }

}
