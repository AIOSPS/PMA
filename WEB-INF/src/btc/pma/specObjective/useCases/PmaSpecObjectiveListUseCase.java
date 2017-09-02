package btc.pma.specObjective.useCases;

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
 * Created by PC on 8/29/2017.
 */
public class PmaSpecObjectiveListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        List retList = null;
        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String intrNo = (String)itr.next();
                String sobjNo = (String)itr.next();
                String sobjDescription = (String) itr.next();
                String cond = " where 1=1 ";
                if(intrNo!=null && !intrNo.trim().equals("")){
                    intrNo =  CommonFilter.cleanQeuryParam(intrNo);
                    cond += " and a.intrNo like '%"+intrNo+"%' ";
                }
                if(sobjNo!=null && !sobjNo.trim().equals("")){
                    sobjNo =  CommonFilter.cleanQeuryParam(sobjNo);
                    cond += " and a.sobjNo like '%"+sobjNo+"%' ";
                }
                if(sobjDescription!=null && !sobjDescription.equals("") ){
                    cond += " and a.sobjDescription= "+sobjDescription+" ";
                }
                String query = " from btc.pma.programme.database.PmaSpecificObjective a ";
                query +=cond;
                query +=" order by a.intrNo ";
                retList = new DataAccessObjectImpl().getFromDynamicQuery(query);
            }else {
                retList = new DataAccessObjectImpl().getList("getPmaSpecObjectiveList");
            }
        } catch (Exception ce) {
            System.out.println("Error PmaSpecObjectiveList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmaSpecObjectiveList"));
        }
        return retList;
    }
}
