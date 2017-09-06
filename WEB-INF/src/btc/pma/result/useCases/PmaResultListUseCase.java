package btc.pma.result.useCases;


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
 * Created by PC on 9/2/2017.
 */
public class PmaResultListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        List retList = null;
        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String rsltNo = (String)itr.next();
                String rsltTitle = (String)itr.next();
                String sobjNo = (String) itr.next();
                String cond = " where 1=1 ";
                if(rsltNo!=null && !rsltNo.trim().equals("")){
                    rsltNo =  CommonFilter.cleanQeuryParam(rsltNo);
                    cond += " and a.rsltNo like '%"+rsltNo+"%' ";
                }
                if(rsltTitle!=null && !rsltTitle.trim().equals("")){
                    rsltTitle =  CommonFilter.cleanQeuryParam(rsltTitle);
                    cond += " and a.rsltTitle like '%"+rsltTitle+"%' ";
                }
                if(sobjNo!=null && !sobjNo.equals("") ){
                    cond += " and a.sobjNo= "+sobjNo+" ";
                }
                String query = " from btc.pma.programme.database.PmaResult a ";
                query +=cond;
                query +=" order by a.rsltNo ";
                retList = new DataAccessObjectImpl().getFromDynamicQuery(query);
            }else {
                retList = new DataAccessObjectImpl().getList("getPmaResultList");
            }
        } catch (Exception ce) {
            System.out.println("Error getPmaResultList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading getPmaResultList"));
        }
        return retList;
    }
}
