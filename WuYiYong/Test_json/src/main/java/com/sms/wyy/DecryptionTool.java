package com.sms.wyy;

public class DecryptionTool {
    //解密key
    public static String deciphering(String k){
        char[] key = k.toCharArray();
        for (int i = 0; i < key.length ; i++) {
            key[i]=(char)(key[i]^2000);
        }
        return String.valueOf(key);
    }
}
