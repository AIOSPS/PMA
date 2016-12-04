package eu.pms.common.component;

import org.apache.struts.upload.FormFile;

import java.io.FileOutputStream;

/**
 * Created by IntelliJ IDEA.
 * User:  Ibrahim Assi (iassi)
 * Date: Dec 3, 2011
 * Time: 9:01:37 AM
 */
public class CommonComponent {

     public boolean copyFormFile(String path, FormFile file, String newFileName)
    {
        try
        {
            FileOutputStream outFile = new FileOutputStream((new StringBuilder()).append(path).append("/").append(newFileName).toString());
            outFile.write(file.getFileData());
            outFile.flush();
            outFile.close();
            return true;
        }
        catch(Exception e)
        {
            System.err.println("--------- Error In copyFormFile Details :"+e);
            e.printStackTrace();
        }
        return false;
    }
}
