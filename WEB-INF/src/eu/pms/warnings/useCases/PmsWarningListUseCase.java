package eu.pms.warnings.useCases;

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
public class PmsWarningListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String warType = (String)itr.next();
                String warStructType = (String)itr.next();
                String warStatus = (String) itr.next();
                String comId = (String) itr.next();
                String govId = (String) itr.next();
                String cond = " where 1=1 ";
                if(warType!=null && !warType.trim().equals("")){
                    warType =  CommonFilter.cleanQeuryParam(warType);
                    cond += " and a.warType = '"+warType+"' ";
                }
                if(warStructType!=null && !warStructType.trim().equals("")){
                    warStructType =  CommonFilter.cleanQeuryParam(warStructType);
                    cond += " and a.warStructType = '"+warStructType+"' ";
                }
                if(warStatus!=null && !warStatus.equals("")){
                    warStatus =  CommonFilter.cleanQeuryParam(warStatus);
                    cond += " and a.warStatus = '"+warStatus+"' ";
                }
                if(comId!=null && !comId.equals("")){
                    comId =  CommonFilter.cleanQeuryParam(comId);
                    cond += " and a.comId = '"+comId+"' ";
                }
                if(govId!=null && !govId.equals("")){
                    govId =  CommonFilter.cleanQeuryParam(govId);
                    cond += " and a.govId = '"+govId+"' ";
                }
                String query = " from eu.pms.project.database.PmsWarningsVw a ";
                query +=cond;
                query +=" order by a.warWarnedName ";
                retList = new DataAccessObjectImpl().getFromDynamicQuery(query);
            }else {
                retList = new DataAccessObjectImpl().getList("getPmsWarningList");
            }
        } catch (Exception ce) {
            System.out.println("Error PmsWarningList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmsWarningList"));
        }
        return retList;
    }

}
