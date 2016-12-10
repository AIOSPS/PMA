package eu.pms.project.useCases;

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
public class PmsProjectListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String projectTitle= (String) itr.next();
                String projectDescription= (String) itr.next();
                String projectStatus= (String) itr.next();
                String projectStartDate= (String) itr.next();
                String projectEndDate= (String) itr.next();
                String projectNeedPermit= (String) itr.next();
                String projectHasCluster= (String) itr.next();
                String cond = " where 1=1 ";
                if(projectTitle!=null && !projectTitle.trim().equals("")){
                    cond += " and a.proTitle like '%"+projectTitle+"%' ";
                }
                if(projectDescription!=null && !projectDescription.trim().equals("")){
                    cond += " and a.proDescription like '%"+projectDescription+"%' ";
                }
                if(projectStatus!=null && !projectStatus.trim().equals("")){
                    cond += " and a.proStatus = '"+projectStatus+"' ";
                }
                if(projectNeedPermit!=null && !projectNeedPermit.equals("")){
                    cond += " and a.proNeedPermit = "+projectNeedPermit+" ";
                }
                if(projectHasCluster!=null && !projectHasCluster.equals("")){
                    cond += " and a.proHasCluster = "+projectHasCluster+" ";
                }
                if(projectStartDate!=null && !projectStartDate.equals("")){
                    cond += " and a.proStartDate = STR_TO_DATE('" + projectStartDate + "','%d/%m/%Y') ";;
                }
                if(projectEndDate!=null && !projectEndDate.equals("")){
                    cond += " and a.proEndDate = STR_TO_DATE('" + projectEndDate + "','%d/%m/%Y') ";
                }
                String query = " from eu.pms.project.database.PmsProject a ";
                query +=cond;
                query +=" order by a.proTitle ";
                retList = new DataAccessObjectImpl().getFromDynamicQuery(query);
            }else {
                retList = new DataAccessObjectImpl().getList("getPmsProjectList");
            }
        } catch (Exception ce) {
            System.out.println("Error PmsProjectList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmsProjectList"));
        }
        return retList;
    }

}
