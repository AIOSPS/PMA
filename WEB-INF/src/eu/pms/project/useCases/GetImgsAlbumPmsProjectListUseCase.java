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
public class GetImgsAlbumPmsProjectListUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {

        List retList = null;

        try {
            if (input != null && input.size() > 0){
                Iterator itr = input.iterator();
                String projectId= (String) itr.next();
                retList = new DataAccessObjectImpl().getList("getAlbumPmsProjectList",new Object[]{projectId});
            }
        } catch (Exception ce) {
            System.out.println("Error GetImgsAlbumPmsProjectListUseCase: " + ce);
            retList = new ArrayList();
            retList.add(new String("\"Error Loading GetImgsAlbumPmsProjectListUseCase"));
        }
        return retList;
    }

}
