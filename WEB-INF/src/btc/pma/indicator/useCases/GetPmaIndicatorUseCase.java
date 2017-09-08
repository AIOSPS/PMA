package btc.pma.indicator.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by PC on 9/8/2017.
 */
public class GetPmaIndicatorUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;
        Iterator itr = input.iterator();
        String indrNo = (String) itr.next();

        try {
            retList = new DataAccessObjectImpl().getList("getPmaIndicatorById", new Object[]{indrNo});
        } catch (Exception ce) {
            System.out.println("Error PmaIndicator: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmaIndicator"));
        }
        return retList;
    }

}