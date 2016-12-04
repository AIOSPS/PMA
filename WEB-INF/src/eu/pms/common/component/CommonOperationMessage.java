package eu.pms.common.component;

import eu.pms.common.constant.MsConstant;
import eu.pms.common.struct.LabelValue;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by IntelliJ IDEA.
 * User:  Ibrahim Assi (iassi)
 * Date: Jun 19, 2011
 * Time: 8:49:31 AM
 */
public class CommonOperationMessage {

    public static void updateSuccess(HttpServletRequest request )
    {
        operationMessage(request,"CommonOperationMessage.update.success",MsConstant.COLOR_SUCCESS,true);
    }

   public static void updateFailed(HttpServletRequest request )
    {
          operationMessage(request,"CommonOperationMessage.update.failed",MsConstant.COLOR_FAIL,true);
    }

      public static void addSuccess(HttpServletRequest request )
    {
        operationMessage(request,"CommonOperationMessage.add.success",MsConstant.COLOR_SUCCESS,true);
    }

   public static void addFailed(HttpServletRequest request )
    {
          operationMessage(request,"CommonOperationMessage.add.failed",MsConstant.COLOR_FAIL,true);
    }

    public static void deleteSuccess(HttpServletRequest request )
    {
        operationMessage(request,"CommonOperationMessage.delete.success",MsConstant.COLOR_SUCCESS,true);
    }

   public static void deleteFailed(HttpServletRequest request )
    {
          operationMessage(request,"CommonOperationMessage.delete.failed",MsConstant.COLOR_FAIL,true);
    }

     public static void uploadSuccess(HttpServletRequest request )
    {
        operationMessage(request,"CommonOperationMessage.upload.success",MsConstant.COLOR_SUCCESS,true);
    }

   public static void uploadFailed(HttpServletRequest request )
    {
          operationMessage(request,"CommonOperationMessage.upload.failed",MsConstant.COLOR_FAIL,true);
    }
    public static void saveSuccess(HttpServletRequest request )
    {
        operationMessage(request,"CommonOperationMessage.save.success",MsConstant.COLOR_SUCCESS,true);
    }

   public static void saveFailed(HttpServletRequest request )
    {
          operationMessage(request,"CommonOperationMessage.save.failed",MsConstant.COLOR_FAIL,true);
    }

  public static void operationSuccess(HttpServletRequest request ,String ms )
    {
        operationMessage(request,ms,MsConstant.COLOR_SUCCESS,true);
    }

   public static void operationFailed(HttpServletRequest request,String ms )
    {
          operationMessage(request,ms,MsConstant.COLOR_FAIL,true);
    }

     public static void operationSuccess(HttpServletRequest request  )
    {
        operationMessage(request,"CommonOperationMessage.operation.success",MsConstant.COLOR_SUCCESS,true);
    }

   public static void operationFailed(HttpServletRequest request )
    {
          operationMessage(request,"CommonOperationMessage.operation.failed",MsConstant.COLOR_FAIL,true);
    }

         public static void refreshSuccess(HttpServletRequest request )
    {
        operationMessage(request,"CommonOperationMessage.refresh.success",MsConstant.COLOR_SUCCESS,true);
    }

   public static void refreshFailed(HttpServletRequest request )
    {
          operationMessage(request,"CommonOperationMessage.refresh.failed",MsConstant.COLOR_FAIL,true);
    }

    public static void operationMessageResult(HttpServletRequest request ,String oprType,String oprResult)
    {

        if(oprType.equals("I") && oprResult.equals("S")) // insert  seccess
        addSuccess(request);
        else if(oprType.equals("I") && oprResult.equals("F"))
        addFailed(request);
        else if(oprType.equals("U") && oprResult.equals("S"))
        updateSuccess(request);
        else if(oprType.equals("U") && oprResult.equals("F"))
        updateFailed(request);
        else if(oprType.equals("D") && oprResult.equals("S"))
        deleteSuccess(request);
        else if(oprType.equals("D") && oprResult.equals("F"))
        deleteFailed(request);


    }


    public static void addErrorArabicMessage(HttpServletRequest request,String value )
   {
       addMessage(request,value,MsConstant.COLOR_FAIL,false);
   }

     public static void operationMessage(HttpServletRequest request,
                                         String value,
                                         String color,boolean valueIsUnicode )
    {
            LabelValue lv= new LabelValue();
            lv.setColor(color);
            lv.setValueIsUnicode(valueIsUnicode);
            lv.setLabel("ErrorInCommonOperationMessage");
            lv.setValue(value);

            request.setAttribute(MsConstant.RESULT_MESSAGE, lv );
    }


    public static void addMessage(HttpServletRequest request,
                                        String value,
                                        String color,boolean valueIsUnicode )
   {
           LabelValue lv= new LabelValue();
           lv.setColor(color);
           lv.setValueIsUnicode(valueIsUnicode);
           lv.setLabel("ErrorInCommonOperationMessage");
           lv.setValue(value);

           List  msgList=new ArrayList();
           if(request.getAttribute(MsConstant.RESULT_MESSAGE_LIST)!=null)
           msgList=(List)request.getAttribute(MsConstant.RESULT_MESSAGE_LIST);

           msgList.add(lv);

           request.setAttribute(MsConstant.RESULT_MESSAGE_LIST, msgList );

//         CommonOperationMessage.addMessage(request,"", MsConstant.COLOR_FAIL,false);
   }


    /*
        <qou:commonOperationMessageViewer/>
     */
}
