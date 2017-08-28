package btc.pma.programme.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by PC on 8/26/2017.
 */
public class GetPmaProgrammeUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        List retList = null;
        Iterator itr = input.iterator();
        String intrNo = (String) itr.next();
        try {
            retList = new DataAccessObjectImpl().getList("getPmaProgrammeById", new Object[]{intrNo});
        } catch (Exception ce) {
            System.out.println("Error PmaProgramme: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmaProgramme"));
        }
        return retList;
    }
}
