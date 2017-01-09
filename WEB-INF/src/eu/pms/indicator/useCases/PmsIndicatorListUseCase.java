package eu.pms.indicator.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
import eu.pms.common.utils.CommonFilter;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by alisa_000 on 12/6/2016.
 */
public class PmsIndicatorListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String indicatorTitle = (String)itr.next();
                String indicatorLongDesc = (String) itr.next();
                String cond = " where 1=1 ";
                if(indicatorTitle!=null && !indicatorTitle.trim().equals("")){
                    indicatorTitle = CommonFilter.cleanQeuryParam(indicatorTitle);
                    cond += " and a.indTitle like '%"+indicatorTitle+"%' ";
                }
                if(indicatorLongDesc!=null && !indicatorLongDesc.trim().equals("")){
                    cond += " and a.indLongDesc like '%"+indicatorLongDesc+"%' ";
                }
                String query = " from eu.pms.project.database.PmsIndicator a ";
                query +=cond;
                query +=" order by a.indTitle ";
                retList = new DataAccessObjectImpl().getFromDynamicQuery(query);
            }else {
                retList = new DataAccessObjectImpl().getList("getPmsIndicatorList");
            }
        } catch (Exception ce) {
            System.out.println("Error PmsIndicatorList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmsIndicatorList"));
        }
        return retList;
    }

}
