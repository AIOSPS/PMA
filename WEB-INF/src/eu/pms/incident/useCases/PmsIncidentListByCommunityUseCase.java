package eu.pms.incident.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by orayyan on 2/2/2017.
 */
public class PmsIncidentListByCommunityUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String comId = (String)itr.next();
                String cond = " where 1=1 ";
                if(comId!=null && !comId.trim().equals("")){
                    cond += " and a.comId = '"+comId+"' ";
                }
                String query = " from eu.pms.project.database.PmsIncident a ";
                query +=cond;
                query +=" order by a.incDescription ";
                retList = new DataAccessObjectImpl().getFromDynamicQuery(query);
            }else {
                retList = null;//new DataAccessObjectImpl().getList("getPmsIncidentList");
            }
        } catch (Exception ce) {
            System.out.println("Error PmsIncidentList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmsIncidentList"));
        }
        return retList;
    }
}
