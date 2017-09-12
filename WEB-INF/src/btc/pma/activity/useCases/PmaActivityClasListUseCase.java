package btc.pma.activity.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by PC on 9/10/2017.
 */
public class PmaActivityClasListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            retList = new DataAccessObjectImpl().getList("getPmaActivityClasList");
        } catch (Exception ce) {
            System.out.println("Error getPmaActivityClasList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading getPmaActivityClasList"));
        }
        return retList;
    }

}
