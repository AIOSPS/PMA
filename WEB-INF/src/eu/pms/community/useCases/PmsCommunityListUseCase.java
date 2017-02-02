package eu.pms.community.useCases;

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
public class PmsCommunityListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String comName = (String)itr.next();
                String comPcbsCode = (String)itr.next();
//                String comOchaCode = (String)itr.next();
//                String comTopology = (String) itr.next();
                String comGovId = (String) itr.next();
                String cond = " where 1=1 ";
                if(comName!=null && !comName.trim().equals("")){
                    comName =  CommonFilter.cleanQeuryParam(comName);
                    cond += " and a.comId = '"+comName+"' ";
                }
                if(comPcbsCode!=null && !comPcbsCode.trim().equals("")){
                    cond += " and a.comPcbsCode like '%"+comPcbsCode+"%' ";
                }
//                if(comOchaCode!=null && !comOchaCode.trim().equals("")){
//                    cond += " and a.comOchaCode like '%"+comOchaCode+"%' ";
//                }
//                if(comTopology!=null && !comTopology.trim().equals("")){
//                    cond += " and a.comTopology like '%"+comTopology+"%' ";
//                }
                if(comGovId!=null && !comGovId.trim().equals("")){
                    cond += " and a.govId = '"+comGovId+"' ";
                }
                String query = " from eu.pms.project.database.PmsCommunitiesVw a ";
                query +=cond;
                query +=" order by a.comName ";
                retList = new DataAccessObjectImpl().getFromDynamicQuery(query);
            }else {
                retList = new DataAccessObjectImpl().getList("getPmsCommunityList");
            }
        } catch (Exception ce) {
            System.out.println("Error PmsCommunityList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmsCommunityList"));
        }
        return retList;
    }

}
