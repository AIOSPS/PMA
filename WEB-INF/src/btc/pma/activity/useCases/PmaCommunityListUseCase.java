package btc.pma.activity.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by PC on 9/12/2017.
 */
public class PmaCommunityListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            retList=new DataAccessObjectImpl().getList("getPmaCommunity");
        } catch (Exception ce) {
            System.out.println("Error PMS Community list: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PMS Community list"));
        }
        return retList;
    }

}