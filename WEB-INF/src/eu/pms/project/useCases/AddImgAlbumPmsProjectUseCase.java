package eu.pms.project.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
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
            pmsProjectAlbumPK.setAlbId("1");
            pmsProjectAlbum.setCompId(pmsProjectAlbumPK);
            if(img!=null&& img.getFileSize()>0){
                pmsProjectAlbum.setAlbImage(Hibernate.createBlob(new byte[]{0}));
            }
            pmsProjectAlbum.setUsername(username);
            pmsProjectAlbum.setTimeStamp(timeStamp);


            hbSession = comp.getSession();
            hbSession.beginTransaction();
            comp.insert(pmsProjectAlbum);

            hbSession.flush();
            hbSession.refresh(pmsProjectAlbum, LockMode.UPGRADE);
            SerializableBlob blob = null;
            java.sql.Blob wrapBlob = null;
            com.mysql.jdbc.Blob bb = null;
            java.io.OutputStream pw = null;
            if (img != null && img.getFileSize() > 0) {
                blob = (SerializableBlob) pmsProjectAlbum.getAlbImage();
                wrapBlob = blob.getWrappedBlob();
                bb = (com.mysql.jdbc.Blob) wrapBlob;

                pw = bb.setBinaryStream(0);
                try {
                    pw.write(img.getFileData());
                    pw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
}
