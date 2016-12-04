package eu.pms.common.tools;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: Al-Quds Open University</p>
 * @author:
 * @version 1.0
 */

import java.util.Random;

public class Randomizer
{
    private static final String hexChars = "0123456789abcdef";
    private static final byte INDEX_TYPE = 6;
    private static final byte INDEX_VARIATION = 8;
    private static final byte TYPE_RANDOM_BASED = 4;
    private static int RandomAdjuster = 0;
    private Random rnd;


    public Randomizer()
    {
        rnd = new Random(System.currentTimeMillis());
    }

    public static String RandomPassword()
    {
        // Generate a random password
        String Password = "";

        int Seed = (int) (System.currentTimeMillis() % 20) + 1 + RandomAdjuster;
        RandomAdjuster++;

        String PassChars = "Lz23456789AaBbCcDdEeFfGgHhJjKkMmNnMkPpQqRrSsTtUuVvWwXxYyZzf52abc";

        Random Rand = new Random();
        Rand.setSeed(System.currentTimeMillis() * Seed);

        byte[] PassByte = new byte[20];
        Rand.nextBytes(PassByte);

        for (int i = 0; i < PassByte.length; i++)
        {
            Password +=
                    PassChars.charAt(PassByte[i] & 0x3f);
        }

        return Password;
    }

    public static String shortRandom()
    {
        // Generate a random password
        String Password = "";

        int Seed = (int) (System.currentTimeMillis() % 20) + 1 + RandomAdjuster;
        RandomAdjuster++;

        String PassChars = "Lz23456789AaBbCcDdEeFfGgHhJjKkMmNnMkPpQqRrSsTtUuVvWwXxYyZzf52abc";

        Random Rand = new Random();
        Rand.setSeed(System.currentTimeMillis() * Seed);

        int x = (int) (Math.random() * 10) / 1;
        if (x <= 0) x = 9;

        byte[] PassByte = new byte[x+6];
        Rand.nextBytes(PassByte);

        for (int i = 0; i < PassByte.length; i++)
        {
            Password += PassChars.charAt(PassByte[i] & 0x3f);
        }

        return Password;
    }


 public static String shortRandom(Integer length)
    {
        // Generate a random password
        String Password = "";

        int Seed = (int) (System.currentTimeMillis() % 20) + 1 + RandomAdjuster;
        RandomAdjuster++;

        String PassChars = "Lz23456789AaBbCcDdEeFfGgHhJjKkMmNnMkPpQqRrSsTtUuVvWwXxYyZzf52abc";

        Random Rand = new Random();
        Rand.setSeed(System.currentTimeMillis() * Seed);

        int x = (int) (Math.random() * 1000) / 1;
        if (x <= 0)
            x = 9;

        byte[] PassByte = new byte[x+6];
        Rand.nextBytes(PassByte);

        if(length>PassByte.length)
         length=PassByte.length;

        for (int i = 0; i < length; i++)
        {
            Password += PassChars.charAt(PassByte[i] & 0x3f);
        }

        return Password;
    }


    /**
     * Generates a random UUID and returns the String representation of it.
     *
     * @returns a String representing a randomly generated UUID.
     */
    public String generateUUID()
    {
        // Generate 128-bit random number
        byte[] uuid = new byte[16];
        nextRandomBytes(uuid);

        // Set various bits such as type
        uuid[INDEX_TYPE] &= (byte) 0x0F;
        uuid[INDEX_TYPE] |= (byte) (TYPE_RANDOM_BASED << 4);
        uuid[INDEX_VARIATION] &= (byte) 0x3F;
        uuid[INDEX_VARIATION] |= (byte) 0x80;

        // Convert byte array into a UUID formated string
        StringBuffer b = new StringBuffer(36);
        for (int i = 0; i < 16; i++)
        {
            if (i == 4 || i == 6 || i == 8 || i == 10) b.append('-');
            int hex = uuid[i] & 0xFF;
            b.append(hexChars.charAt(hex >> 4));
            b.append(hexChars.charAt(hex & 0x0F));
        }

        // Return UUID
        return b.toString();
    }


    /**
     * Generates random bytes and places them into a user-supplied byte array.
     * The number of random bytes produced is equal to the length of the byte array.
     * Nicked from java.util.Random becuase the stupid SNAP board doesn't have this method!
     *
     * @param bytes the non-null byte array in which to put the random bytes.
     */
    private void nextRandomBytes(byte[] bytes)
    {
        int numRequested = bytes.length;
        int numGot = 0, rand = 0;
        while (true)
        {
            for (int i = 0; i < 4; i++)
            {
                if (numGot == numRequested)
                {
                    return;
                }
                rand = (i == 0 ? rnd.nextInt() : rand >> 8);
                bytes[numGot++] = (byte) rand;
            }
        }
    }

//    Added by Ibrahim Assi Date :25-6-2011

     public static  String randomIntegers(Integer length)
     {
        String result="";int randomInt ;
        Random randomGenerator = new Random();
        for (int idx = 0; idx < length; ++idx)
        {
          randomInt = randomGenerator.nextInt(10);
          result+=randomInt;
        }

         return result;
   }

//  end  Added by Ibrahim Assi Date :25-6-2011
}