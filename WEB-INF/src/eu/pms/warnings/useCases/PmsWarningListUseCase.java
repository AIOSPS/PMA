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
                String warningNo = (String)itr.next();
                String warningName = (String)itr.next();
                String warnedId = (String) itr.next();
                String cond = " where 1=1 ";
                if(warningNo!=null && !warningNo.trim().equals("")){
                    warningNo =  CommonFilter.cleanQeuryParam(warningNo);
                    cond += " and a.warNo like '%"+warningNo+"%' ";
                }
                if(warningName!=null && !warningName.trim().equals("")){
                    warningName =  CommonFilter.cleanQeuryParam(warningName);
                    cond += " and a.warWarnedName like '%"+warningName+"%' ";
                }
                if(warnedId!=null && !warnedId.equals("")){
                    warnedId =  CommonFilter.cleanQeuryParam(warnedId);
                    cond += " and a.warWarnedId like '%"+warnedId+"%' ";
                }
                String query = " from eu.pms.project.database.PmsActivity a ";
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
