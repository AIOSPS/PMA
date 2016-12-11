package eu.pms.benificiary.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by alisa_000 on 12/6/2016.
 */
public class PmsBenificiaryListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String benificiaryDesc = (String)itr.next();
                Integer benificiaryTotal = (Integer)itr.next();
                String benificiaryType = (String) itr.next();
                String cond = " where 1=1 ";
                if(benificiaryDesc!=null && !benificiaryDesc.trim().equals("")){
                    cond += " and a.benDesc like '%"+benificiaryDesc+"%' ";
                }
                if(benificiaryType!=null && !benificiaryType.trim().equals("")){
                    cond += " and a.btpId like '%"+benificiaryType+"%' ";
                }
                if(benificiaryTotal!=null && !benificiaryTotal.equals("")&& benificiaryTotal!=0 ){
                    cond += " and a.benTotal= "+benificiaryTotal+" ";
                }
                String query = " from eu.pms.project.database.PmsBenificiary a ";
                query +=cond;
                query +=" order by a.benDesc ";
                retList = new DataAccessObjectImpl().getFromDynamicQuery(query);
            }else {
                retList = new DataAccessObjectImpl().getList("getPmsBenificiaryList");
            }
        } catch (Exception ce) {
            System.out.println("Error PmsBenificiaryList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmsBenificiaryList"));
        }
        return retList;
    }

}
