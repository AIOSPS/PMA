package btc.pma.programme.useCases;

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
 * Created by PC on 8/26/2017.
 */
public class PmaProgrammeListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        List retList = null;
        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String intrNo = (String)itr.next();
                String intrTitle = (String)itr.next();
                String intrDescription = (String) itr.next();
                String cond = " where 1=1 ";
                if(intrNo!=null && !intrNo.trim().equals("")){
                    intrNo =  CommonFilter.cleanQeuryParam(intrNo);
                    cond += " and a.intrNo like '%"+intrNo+"%' ";
                }
                if(intrTitle!=null && !intrTitle.trim().equals("")){
                    intrTitle =  CommonFilter.cleanQeuryParam(intrTitle);
                    cond += " and a.intrTitle like '%"+intrTitle+"%' ";
                }
                if(intrDescription!=null && !intrDescription.equals("") ){
                    cond += " and a.intrDescription= "+intrDescription+" ";
                }
                String query = " from btc.pma.programme.database.PmaProgrammeInfo a ";
                query +=cond;
                query +=" order by a.intrNo ";
                retList = new DataAccessObjectImpl().getFromDynamicQuery(query);
            }else {
                retList = new DataAccessObjectImpl().getList("getPmaProgrammeList");
            }
        } catch (Exception ce) {
            System.out.println("Error PmaProgrammeInfoList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmaProgrammeInfoList"));
        }
        return retList;
    }
}
