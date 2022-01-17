package com.ctrip.ccard.creditcard.vcc.util;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public final class CipherUtils {

    private static final Charset UTF_8 = Charset.forName("UTF-8");

    private static final Base64 BASE64 = new Base64(0, null, false);

    public static String aesEncrypt(String keyStr, String plaintext) {
        SecretKey key = newAesKey(keyStr);
        try {
            return aesEncrypt(key, plaintext);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String aesDecrypt( String keyStr,String ciphertext) {
        SecretKey key = newAesKey(keyStr);
        try {
            return aesDecrypt(key, ciphertext);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String rsaSign(String privateKeyStr,String content) {
        try {
            PrivateKey privateKey = newRsaPrivateKey(privateKeyStr);
            return rsaSign(privateKey, content);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean rsaVerify(String publicKeyStr, String content,String signature) {
        try{
            PublicKey publicKey = newRsaPublicKey(publicKeyStr);
            return rsaVerify(publicKey, content, signature);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    private static String aesEncrypt(SecretKey key, String plaintext) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] cipherBytes = cipher.doFinal(plaintext.getBytes(UTF_8));
        return new String(BASE64.encode(cipherBytes), UTF_8);
    }

    private static String aesDecrypt(SecretKey key, String ciphertext) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] cipherBytes = BASE64.decode(ciphertext.getBytes(UTF_8));
        return new String(cipher.doFinal(cipherBytes), UTF_8);
    }

    private static SecretKey newAesKey(String keyStr) {
        return new SecretKeySpec(BASE64.decode(keyStr.getBytes(UTF_8)), "AES");
    }

    private static String rsaSign(PrivateKey privateKey, String content) throws Exception {
        Signature signer = Signature.getInstance("SHA256withRSA");
        signer.initSign(privateKey);
        signer.update(content.getBytes(UTF_8));
        return new String(BASE64.encode(signer.sign()), UTF_8);
    }

    private static boolean rsaVerify(PublicKey publicKey, String content, String signature) throws Exception {
        Signature signer = Signature.getInstance("SHA256withRSA");
        signer.initVerify(publicKey);
        signer.update(content.getBytes(UTF_8));
        return signer.verify(BASE64.decode(signature.getBytes(UTF_8)));
    }

    private static PrivateKey newRsaPrivateKey(String privateKeyStr) throws Exception {
        byte[] bytes = BASE64.decode(privateKeyStr.getBytes(UTF_8));
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bytes));
    }

    private static PublicKey newRsaPublicKey(String publicKeyStr) throws Exception {
        byte[] bytes = BASE64.decode(publicKeyStr.getBytes(UTF_8));
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return keyFactory.generatePublic(new X509EncodedKeySpec(bytes));
    }

    private static String toRsaPrivateKeyStr(PrivateKey privateKey) {
        return new String(BASE64.encode(privateKey.getEncoded()), UTF_8);
    }

}
