package btc.pma.activity.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by PC on 9/10/2017.
 */
public class PmaBeneficiaryTypeListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            retList = new DataAccessObjectImpl().getList("getPmaBeneficiaryTypeList");
        } catch (Exception ce) {
            System.out.println("Error getPmaBeneficiaryTypeList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading getPmaBeneficiaryTypeList"));
        }
        return retList;
    }

}
