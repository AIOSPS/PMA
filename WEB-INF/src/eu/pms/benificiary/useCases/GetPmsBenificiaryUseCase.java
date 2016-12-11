package eu.pms.benificiary.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by alisa_000 on 12/6/2016.
 */
public class GetPmsBenificiaryUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;
        Iterator itr = input.iterator();
        String benId = (String) itr.next();
        try {
            retList = new DataAccessObjectImpl().getList("getPmsBenificiaryById", new Object[]{benId});
        } catch (Exception ce) {
            System.out.println("Error PmsBenificiary: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmsBenificiary"));
        }
        return retList;
    }

}