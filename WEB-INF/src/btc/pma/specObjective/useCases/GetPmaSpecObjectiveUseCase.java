package btc.pma.specObjective.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by PC on 9/2/2017.
 */
public class GetPmaSpecObjectiveUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        List retList = null;
        Iterator itr = input.iterator();
        String sobjNo = (String) itr.next();
        try {
            retList = new DataAccessObjectImpl().getList("getPmaSpecObjectiveById", new Object[]{sobjNo});
        } catch (Exception ce) {
            System.out.println("Error getPmaSpecObjectiveById: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading getPmaSpecObjectiveById"));
        }
        return retList;
    }
}
