package eu.pms.intervention.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by alisa_000 on 12/5/2016.
 */
public class GetPmsSubSectorsUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            retList=new DataAccessObjectImpl().getList("getPmsSubSectors");
        } catch (Exception ce) {
            System.out.println("Error PMS SubSectors list: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PMS SubSectors list"));
        }
        return retList;
    }

}