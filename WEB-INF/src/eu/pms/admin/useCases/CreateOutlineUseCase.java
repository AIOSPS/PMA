package eu.pms.admin.useCases;


import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import eu.pms.common.component.CommonOperationMessage;
import eu.pms.common.constant.SystemConstant;

/**
 * Created by IntelliJ IDEA.
 * User:  Ibrahim Assi (iassi)
 * Date: Aug 7, 2011
 * Time: 10:59:45 AM
 */
public class CreateOutlineUseCase  implements eu.pms.common.useCase.
        ComponentUseCase
{

    public Collection execute(Collection input, HttpServletRequest request) throws HibernateException
    {
        Iterator itr= input.iterator();
        String crsNo = (String)itr.next();
        String crsSeq = (String)itr.next();
        String descACrs = (String)itr.next();
        String distributionMarks = (String)itr.next();
        String eduMedia = (String)itr.next();
        String gradProjects = (String)itr.next();
        Integer isGradProject = (Integer)itr.next();
        String specLinks = (String)itr.next();
        String trainingManual = (String)itr.next();

        String path=SystemConstant.FAIL;;
        try
        {
//            new AdminComponent().createOutline(crsNo,crsSeq,descACrs,distributionMarks,eduMedia,gradProjects,
//                    isGradProject,specLinks,trainingManual);

          CommonOperationMessage.addSuccess(request);
          path=SystemConstant.SUCCESS;
        }
        catch (Exception cmpE)
         {
           CommonOperationMessage.addFailed(request);
           path=SystemConstant.FAIL;
         }

         List resultList=new ArrayList();
         resultList.add(path)  ;

        return resultList ;
    }
}