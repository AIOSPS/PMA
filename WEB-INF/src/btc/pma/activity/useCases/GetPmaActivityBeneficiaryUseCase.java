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
 * Created by PC on 9/16/2017.
 */
public class GetPmaActivityBeneficiaryUseCase   implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;
        Iterator itr = input.iterator();
        String actNo = (String) itr.next();
        String intrNo = (String) itr.next();
        try {
            retList = new DataAccessObjectImpl().getList("getPmaActivityBeneficiary", new Object[]{actNo,intrNo});
        } catch (Exception ce) {
            System.out.println("Error PmaActivityBeneficiary: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmaActivityBeneficiary"));
        }
        return retList;
    }

}