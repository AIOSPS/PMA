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
 * Created by alisa_000 on 12/5/2016.
 */
public class GetPmsActivitiesByInterventionUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;
        Iterator itr = input.iterator();
        String intId = (String) itr.next();
        String secId = (String) itr.next();
        try {
            retList = new DataAccessObjectImpl().getList("getPmsActivitiesByIntervention", new Object[]{intId,secId});
        } catch (Exception ce) {
            System.out.println("Error GetPmsActivitiesByInterventionUseCase: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading GetPmsActivitiesByInterventionUseCase"));
        }
        return retList;
    }

}