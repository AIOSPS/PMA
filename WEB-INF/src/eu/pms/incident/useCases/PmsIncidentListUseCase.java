package eu.pms.incident.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.tools.DateTool;
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
public class PmsIncidentListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String incidentType = (String)itr.next();
                String communityId = (String)itr.next();
                String govId = (String) itr.next();
                String incFromDate = (String)itr.next();
                String incToDate = (String)itr.next();

                String cond = " where 1=1 ";
                if(incidentType!=null && !incidentType.trim().equals("")){
                    cond += " and a.incType like '%"+incidentType+"%' ";
                }
                if(communityId!=null && !communityId.trim().equals("")){
                    cond += " and a.comId like '%"+communityId+"%' ";
                }
                if(govId!=null && !govId.trim().equals("")){
                    cond += " and a.govId like '%"+govId+"%' ";
                }
                if(incFromDate!=null && !incFromDate.trim().equals("")){
                    cond += " and a.incTimeStamp >= '"+ incFromDate+"' ";
                }
                if(incToDate!=null && !incToDate.trim().equals("")){
                    cond += " and a.incTimeStamp <= '"+incToDate+"' ";
                }
                String query = " from eu.pms.project.database.PmsIncidentVw a ";
                query +=cond;
                query +=" order by a.incDescription ";
                retList = new DataAccessObjectImpl().getFromDynamicQuery(query);
            }else {
                retList = new DataAccessObjectImpl().getList("getPmsIncidentList");
            }
        } catch (Exception ce) {
            System.out.println("Error PmsIncidentList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmsIncidentList"));
        }
        return retList;
    }

}
