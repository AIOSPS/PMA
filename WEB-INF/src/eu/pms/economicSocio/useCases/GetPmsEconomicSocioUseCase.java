package eu.pms.economicSocio.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by orayyan on 1/27/2017.
 */
public class GetPmsEconomicSocioUseCase implements ComponentUseCase{
    @Override
    public Collection execute(Collection input, HttpServletRequest request) throws HibernateException {
        List retList = null;
        Iterator itr = input.iterator();
        String ecoId = (String) itr.next();
        try {
            retList = new DataAccessObjectImpl().getList("getPmsEconomicSocioByEcoId", new Object[]{ecoId});
        } catch (Exception ce) {
            System.out.println("Error PmsEconomicSocio: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PmsEconomicSocio"));
        }
        return retList;
    }
}
