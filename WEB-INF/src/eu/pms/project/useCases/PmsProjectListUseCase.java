package eu.pms.project.useCases;

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
public class PmsProjectListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String donorId= (String) itr.next();
                String sectorId= (String) itr.next();
                String governateId= (String) itr.next();
                String communityId= (String) itr.next();
                String statusId= (String) itr.next();
                String cond = " where 1=1 ";
                if(donorId!=null && !donorId.trim().equals("")){
                    cond += " and a.donorId = '"+donorId+"' ";
                }
                if(sectorId!=null && !sectorId.trim().equals("")){
                    cond += " and a.sectorId = '"+sectorId+"' ";
                }
                if(governateId!=null && !governateId.trim().equals("")){
                    cond += " and a.governateId = '"+governateId+"' ";
                }
                if(communityId!=null && !communityId.trim().equals("")){
                    cond += " and a.communityId = '"+communityId+"' ";
                }
                if(statusId!=null && !statusId.trim().equals("")){
                    cond += " and a.proStatus = '"+statusId+"' ";
                }
                String query = " select distinct new eu.pms.project.database.structs.PmsProjectList(a.proId,a.proTitle,a.proDescription,a.proStatusDesc,a.proStartDate,a.proEndDate) "+
                               " from eu.pms.project.database.PmsProjectVw a ";
                query +=cond;
                query +=" order by a.proTitle ";
                retList = new DataAccessObjectImpl().getFromDynamicQuery(query);
            }else {
                retList = new DataAccessObjectImpl().getList("getPmsProjectList");
            }
        } catch (Exception ce) {
            System.out.println("Error PmsProjectList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmsProjectList"));
        }
        return retList;
    }

}
