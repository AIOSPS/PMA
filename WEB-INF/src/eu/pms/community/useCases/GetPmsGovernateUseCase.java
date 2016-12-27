package eu.pms.community.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by orayyan on 12/25/2016.
 */
public class GetPmsGovernateUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            retList=new DataAccessObjectImpl().getList("getPmsGovernateList");
        } catch (Exception ce) {
            System.out.println("Error PMS Gvernate list: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PMS Gvernate list"));
        }
        return retList;
    }

}