package eu.pms.masterPlan.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by orayyan on 2/3/2017.
 */
public class GetPmsMPByCommunityUseCase  implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;
        Iterator itr = input.iterator();
        String comId = (String) itr.next();
        try {
            retList = new DataAccessObjectImpl().getList("getPmsMasterPlanByComId", new Object[]{comId});
        } catch (Exception ce) {
            System.out.println("Error PmsMasterPlan: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmsMasterPlan"));
        }
        return retList;
    }
}
