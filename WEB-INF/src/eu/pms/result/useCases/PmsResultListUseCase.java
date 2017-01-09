package eu.pms.result.useCases;

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
public class PmsResultListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String resultDesc = (String)itr.next();
                String resStatus = (String) itr.next();
                String cond = " where 1=1 ";
                if(resultDesc!=null && !resultDesc.trim().equals("")){
                    resultDesc = CommonFilter.cleanQeuryParam(resultDesc);
                    cond += " and a.resDesc like '%"+resultDesc+"%' ";
                }
                if(resStatus!=null && !resStatus.trim().equals("")){
                    cond += " and a.resStatus like '%"+resStatus+"%' ";
                }
                String query = " from eu.pms.project.database.PmsResult a ";
                query +=cond;
                query +=" order by a.resDesc ";
                retList = new DataAccessObjectImpl().getFromDynamicQuery(query);
            }else {
                retList = new DataAccessObjectImpl().getList("getPmsResultList");
            }
        } catch (Exception ce) {
            System.out.println("Error PmsResultList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmsResultList"));
        }
        return retList;
    }

}
