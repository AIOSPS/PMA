package eu.pms.permit.useCases;

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
public class PmsPermitListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String permitTitle = (String)itr.next();
                String permitType = (String) itr.next();
                String permitStatus = (String) itr.next();
                String cond = " where 1=1 ";
                if(permitTitle!=null && !permitTitle.trim().equals("")){
                    cond += " and a.perTitle like '%"+permitTitle+"%' ";
                }
                if(permitType!=null && !permitType.trim().equals("")){
                    cond += " and a.perType= '"+permitType+"' ";
                }
                if(permitStatus!=null && !permitStatus.trim().equals("")){
                    cond += " and a.perStatus= '"+permitStatus+"' ";
                }
                String query = " from eu.pms.project.database.PmsPermit a ";
                query +=cond;
                query +=" order by a.perTitle ";
                retList = new DataAccessObjectImpl().getFromDynamicQuery(query);
            }else {
                retList = new DataAccessObjectImpl().getList("getPmsPermitList");
            }
        } catch (Exception ce) {
            System.out.println("Error PmsPermitList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmsPermitList"));
        }
        return retList;
    }

}
