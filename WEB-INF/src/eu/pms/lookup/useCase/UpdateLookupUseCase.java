package eu.pms.lookup.useCase;


import eu.pms.common.useCase.ComponentUseCase;
import eu.pms.lookup.component.LookupComponent;
import eu.pms.lookup.database.LookupObject;
import eu.pms.lookup.database.PmsBenificiaryTyp;
import eu.pms.lookup.database.PmsDatasourc;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.*;


public class UpdateLookupUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        Iterator itr = input.iterator();

        String lockupType = (String) itr.next();
        String lkpId = (String) itr.next();
        String lockupDesc = (String) itr.next();
        String username = "pms";
        Date timeStamp = new Date();
        LookupComponent lookupComponent = new LookupComponent();

        int caseNo = Integer.parseInt(lockupType);
        LookupObject lop = null;
        switch (caseNo) {
            case 1:
                lop = new PmsDatasourc();
                break;
            case 2:
                lop = new PmsBenificiaryTyp();
                break;
        }
        lop.setLookupId(lkpId);
        lop.setLookupDesc(lockupDesc);
        lop.setUsername(username);
        lop.setTimeStamp(timeStamp);

        try {
            if (lop != null)
                lookupComponent.update(lop);
            else
                throw new HibernateException("Undefined lookup in the system");
        } catch (Exception ce) {
            System.out.println("Error updating a lookup: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error updating a lookup"));
        }
        return retList;
    }
}
