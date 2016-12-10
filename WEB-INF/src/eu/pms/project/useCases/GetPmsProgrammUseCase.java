package eu.pms.project.useCases;

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
public class GetPmsProgrammUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            retList=new DataAccessObjectImpl().getList("pmsProgramm");
        } catch (Exception ce) {
            System.out.println("Error PMS Programm list: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading PMS Programm list"));
        }
        return retList;
    }

}
