package eu.pms.economicSocio.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by orayyan on 1/27/2017.
 */
public class PmsEconomicSocioListUseCase implements ComponentUseCase {
    @Override
    public Collection execute(Collection input, HttpServletRequest request) throws HibernateException {
        List retList = null;

        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String comId= (String) itr.next();
                String cond = " where 1=1 ";
                if(comId!=null && !comId.trim().equals("")){
                    cond += " and a.comId = '"+comId+"' ";
                }

                String query = " from eu.pms.project.database.PmsEconomicSocio a ";
                query +=cond;
                query +=" order by a.familyAvgSize ";
                retList = new DataAccessObjectImpl().getFromDynamicQuery(query);
            }else {
                retList = new DataAccessObjectImpl().getList("getPmsEconomicSocio");
            }
        } catch (Exception ce) {
            System.out.println("Error PmsEconomicSocioListUseCase: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmsEconomicSocioListUseCase"));
        }
        return retList;

    }
}
