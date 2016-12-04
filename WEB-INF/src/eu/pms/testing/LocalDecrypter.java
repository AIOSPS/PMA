package eu.pms.testing;


import javax.crypto.*;
import javax.crypto.spec.DESedeKeySpec;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.InvalidKeyException;

import java.security.*;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;

/**
 * Created by IntelliJ IDEA.
 * User:  Ibrahim Assi (iassi)
 * Date: Dec 31, 2011
 * Time: 9:10:01 AM
 */
public class LocalDecrypter
{

          public static void main(String[] args)
             throws Exception {

              String input = "";

              System.out.println("Please Enter Encryption Text to Decrypt it :");
              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

              try
              {
                input=br.readLine();
                System.out.println("-----------------------------------------------");
                System.out.println("input String: " +  input);
//                System.out.println("decrypt String: " + Encrypter.decrypt(input));
              }
              catch (Exception e)
              {
                  System.out.println("Error Occurred .......");
              }



          }


}
   