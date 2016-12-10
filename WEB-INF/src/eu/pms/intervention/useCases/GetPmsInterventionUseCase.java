package eu.pms.intervention.useCases;

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
public class GetPmsInterventionUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;
        Iterator itr = input.iterator();
        String intId = (String) itr.next();
        String secId = (String) itr.next();
        String subId = (String) itr.next();
        try {
            retList = new DataAccessObjectImpl().getList("getPmsInterventionById", new Object[]{intId,secId,subId});
        } catch (Exception ce) {
            System.out.println("Error PmsIntervention: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmsIntervention"));
        }
        return retList;
    }

}