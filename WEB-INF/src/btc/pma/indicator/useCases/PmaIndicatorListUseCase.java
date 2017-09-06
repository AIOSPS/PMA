package btc.pma.indicator.useCases;

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
 * Created by PC on 9/6/2017.
 */
public class PmaIndicatorListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        List retList = null;
        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String intrNo = (String)itr.next();
                String rsltNo = (String)itr.next();

                String cond = " where 1=1 ";
                if(intrNo!=null && !intrNo.trim().equals("")){
                    intrNo =  CommonFilter.cleanQeuryParam(intrNo);
                    cond += " and a.intrNo like '%"+intrNo+"%' ";
                }
                if(rsltNo!=null && !rsltNo.trim().equals("")){
                    rsltNo =  CommonFilter.cleanQeuryParam(rsltNo);
                    cond += " and a.rsltNo like '%"+rsltNo+"%' ";
                }
                String query = " from btc.pma.programme.database.PmaIndicator a ";
                query +=cond;
                query +=" order by a.intrNo ";
                retList = new DataAccessObjectImpl().getFromDynamicQuery(query);
            }else {
                retList = new DataAccessObjectImpl().getList("getPmaIndicatorList");
            }
        } catch (Exception ce) {
            System.out.println("Error getPmaIndicatorList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading getPmaIndicatorList"));
        }
        return retList;
    }
}

