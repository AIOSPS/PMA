package eu.pms.common.utils;

/**
 * Created by IntelliJ IDEA.
 * User: orayyan
 * Date: 20/07/2010
 * Time: 02:20:21 م
 * To change this template use File | Settings | File Templates.
 */
public class CheckIdCard
 {
    public CheckIdCard()
    {

    }
    public boolean validCardId(String no)
    {
      int counter = 1;
      int odd_even;
      int digit;
      int vSum = 0;
      int result;
      int lastDigit;
    if (no.length() == 9){
     try{
         if (Integer.parseInt(no) == 0){
             return false;
         }else{
          while(counter < 9){
              digit =  Integer.parseInt(no.substring(counter-1,counter));
              odd_even = counter % 2;

              if (odd_even == 0){
               digit = digit*2;
                  if (digit > 9){
                      digit = Integer.parseInt(String.valueOf(digit).substring(0,1))+Integer.parseInt(String.valueOf(digit).substring(1,2));
                  }

              }else{
               digit = digit*1;
                  if (digit > 9){
                      digit = Integer.parseInt(String.valueOf(digit).substring(0,1))+Integer.parseInt(String.valueOf(digit).substring(1,2));
                  }

              }
           counter=counter+1;
           vSum=vSum+digit;
          }
              System.out.println("vSum "+vSum);
          result = ((10- vSum%10)%10);
          lastDigit = Integer.parseInt(no.substring(8));

         if (result == lastDigit)
            return true;
         else
            return false;
         }              
     }catch(Exception e){
         e.printStackTrace();
         return false;}
    }else
        return false;
    }
}
