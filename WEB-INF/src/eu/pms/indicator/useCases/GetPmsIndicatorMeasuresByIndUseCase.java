package eu.pms.indicator.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by alisa_000 on 12/5/2016.
 */
public class GetPmsIndicatorMeasuresByIndUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;
        Iterator itr = input.iterator();
        String indId = (String) itr.next();
        String resId = (String) itr.next();
        String objId = (String) itr.next();
        try {
            retList = new DataAccessObjectImpl().getList("getPmsIndicatorMeasuresByInd", new Object[]{indId,resId,objId});
        } catch (Exception ce) {
            System.out.println("Error GetPmsIndicatorMeasuresByIndUseCase: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading GetPmsIndicatorMeasuresByIndUseCase"));
        }
        return retList;
    }

}