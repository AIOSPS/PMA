package eu.pms.agricultureSocio.useCases;

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
public class PmsAgricultureSocioListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String agricultureArea= (String) itr.next();
                String agricultureNoCowYear= (String) itr.next();
                String cond = " where 1=1 ";
                if(agricultureArea!=null && !agricultureArea.trim().equals("")){
                    cond += " and a.agrArea like '%"+agricultureArea+"%' ";
                }
                if(agricultureNoCowYear!=null && !agricultureNoCowYear.trim().equals("")){
                    cond += " and a.agrNoCowYear like '%"+agricultureNoCowYear+"%' ";
                }
                String query = " from eu.pms.project.database.PmsAgricultureSocio a ";
                query +=cond;
                query +=" order by a.agrArea ";
                retList = new DataAccessObjectImpl().getFromDynamicQuery(query);
            }else {
                retList = new DataAccessObjectImpl().getList("getPmsAgricultureSocio");
            }
        } catch (Exception ce) {
            System.out.println("Error PmsAgricultureSocioList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmsAgricultureSocioList"));
        }
        return retList;
    }

}
