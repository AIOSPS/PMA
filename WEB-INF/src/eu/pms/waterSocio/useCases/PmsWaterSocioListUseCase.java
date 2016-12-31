package eu.pms.waterSocio.useCases;

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
public class PmsWaterSocioListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String waterUseWatTanker= (String) itr.next();
                String waterRainWaterWell= (String) itr.next();
                String cond = " where 1=1 ";
                if(waterUseWatTanker!=null && !waterUseWatTanker.trim().equals("")){
                    cond += " and a.watUseWatTanker like '%"+waterUseWatTanker+"%' ";
                }
                if(waterRainWaterWell!=null && !waterRainWaterWell.trim().equals("")){
                    cond += " and a.watRainWaterWell like '%"+waterRainWaterWell+"%' ";
                }
                String query = " from eu.pms.project.database.PmsWaterSocio a ";
                query +=cond;
                query +=" order by a.watUseWatTanker ";
                retList = new DataAccessObjectImpl().getFromDynamicQuery(query);
            }else {
                retList = new DataAccessObjectImpl().getList("getPmsWaterSocio");
            }
        } catch (Exception ce) {
            System.out.println("Error PmsWaterSocioList: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmsWaterSocioList"));
        }
        return retList;
    }

}
