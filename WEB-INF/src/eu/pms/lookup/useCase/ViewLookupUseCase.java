package eu.pms.lookup.useCase;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.exceptions.ComponentException;
import eu.pms.common.useCase.ComponentUseCase;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ViewLookupUseCase implements ComponentUseCase
{
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException
    {
       List retList = null;
       Iterator itr = input.iterator();

        String lockupType = (String) itr.next();
        int caseNo = Integer.parseInt(lockupType);
        String lkpQuery = null;

        switch (caseNo)
        {
            case 1:
                lkpQuery = "getPmsDataSourceList";
                break;
            case 2:
                lkpQuery = "getPmsBenificiaryTypeList";
                break;
        }
        try
        {
            if(lkpQuery != null)
                retList = new DataAccessObjectImpl().getList(lkpQuery);
            else
                throw new HibernateException("Undefined lookup in the system");
        }
        catch (ComponentException ce)
        {
            System.out.println("Error adding a new current job: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error adding a new current job"));
        }
        return retList;
    }
    
}
