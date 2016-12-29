package eu.pms.project.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.exceptions.ComponentException;
import eu.pms.common.tools.DateTool;
import eu.pms.common.useCase.ComponentUseCase;
import eu.pms.project.database.*;
import org.apache.struts.upload.FormFile;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.lob.SerializableBlob;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by alisa_000 on 12/5/2016.
 */
public class AddImgAlbumPmsProjectUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        DataAccessObjectImpl comp = new DataAccessObjectImpl();
        Session hbSession = null;
        try {
            Iterator itr = input.iterator();
            String proId = (String) itr.next();
            FormFile img = (FormFile) itr.next();

            String username = "pms";
            Date timeStamp = new Date();
            PmsProjectAlbum pmsProjectAlbum = new PmsProjectAlbum();
            PmsProjectAlbumPK pmsProjectAlbumPK = new PmsProjectAlbumPK();
            pmsProjectAlbumPK.setProId(proId);
            pmsProjectAlbumPK.setAlbId(getMaxAlbumID(request,proId));
            pmsProjectAlbum.setCompId(pmsProjectAlbumPK);
            if(img!=null&& img.getFileSize()>0){
                pmsProjectAlbum.setAlbImage(Hibernate.createBlob(new byte[]{0}));
            }
            pmsProjectAlbum.setUsername(username);
            pmsProjectAlbum.setTimeStamp(timeStamp);

            String filePath = img.getFileName();

            int lastIndexOfSlash = filePath.lastIndexOf("\\");
            String filename = filePath.substring(lastIndexOfSlash+1);

            // Convert FormFile to a byte Array
            byte[] byteArray=img.getFileData();
            // Convert this byteArray to a blob
            Blob myblob=Hibernate.createBlob(byteArray);
            pmsProjectAlbum.setAlbImage(myblob);
            hbSession = comp.getSession();
            hbSession.beginTransaction();
            comp.insert(pmsProjectAlbum);

            hbSession.getTransaction().commit();

        } catch (Exception ce) {
            System.err.println("Error add a new PMS Project Album Img: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error add a new PMS Project Album Img :" + ce.getMessage()));
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

    private String getMaxAlbumID(HttpServletRequest request,String proId) {
        List retList = null;
        try {
            retList = new DataAccessObjectImpl().getList("pms.getMaxAlbumId",new Object[]{proId});
        } catch (ComponentException e) {
            e.printStackTrace();
        }
        PmsProjectAlbum pmsProjectAlbum = null;
        if(retList!=null && retList.size()>0)
            pmsProjectAlbum= (PmsProjectAlbum) retList.get(0);
        if(pmsProjectAlbum!=null)
            return ""+(Integer.parseInt(pmsProjectAlbum.getCompId().getAlbId())+1);
        else return "1";
    }
}
