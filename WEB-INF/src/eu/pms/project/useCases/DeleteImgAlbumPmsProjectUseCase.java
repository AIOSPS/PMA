package eu.pms.project.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.exceptions.ComponentException;
import eu.pms.common.useCase.ComponentUseCase;
import eu.pms.project.database.PmsProjectAlbum;
import eu.pms.project.database.PmsProjectAlbumPK;
import org.apache.struts.upload.FormFile;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import javax.servlet.http.HttpServletRequest;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by alisa_000 on 12/5/2016.
 */
public class DeleteImgAlbumPmsProjectUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        DataAccessObjectImpl comp = new DataAccessObjectImpl();
        Session hbSession = null;
        try {
            Iterator itr = input.iterator();
            String proId = (String) itr.next();
            String albId = (String) itr.next();

            PmsProjectAlbum pmsProjectAlbum = new PmsProjectAlbum();
            PmsProjectAlbumPK pmsProjectAlbumPK = new PmsProjectAlbumPK();
            pmsProjectAlbumPK.setProId(proId);
            pmsProjectAlbumPK.setAlbId(albId);
            pmsProjectAlbum.setCompId(pmsProjectAlbumPK);

            comp.delete(pmsProjectAlbum);

        } catch (Exception ce) {
            System.err.println("Error delete PMS Project Album Img: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error delete PMS Project Album Img :" + ce.getMessage()));
        } finally {
            if (hbSession != null) {
                try {
                    comp.releaseSession(hbSession);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return retList;
    }

}
