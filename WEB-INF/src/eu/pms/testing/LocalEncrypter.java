package eu.pms.testing;

/**
 * Created by IntelliJ IDEA.
 * User:  Ibrahim Assi (iassi)
 * Date: Dec 24, 2011
 * Time: 12:09:06 PM
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.InvalidKeyException;
import java.security.*;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;


public class LocalEncrypter
{

           public static void main(String[] args)
              throws Exception {

               String input = "";

              System.out.println("Please Enter Text to Encrypt it :");
              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

              try
              {
                input=br.readLine();
                System.out.println("-----------------------------------------------");
                System.out.println("input String: " +  input);
//                System.out.println("encrypt String: " + Encrypter.encrypt(input));
              }
              catch (Exception e)
              {
                  System.out.println("Error Occurred .......");
              }


           }




}
