package com.ctrip.ccard.creditcard.vcc.util;

import org.apache.commons.codec.binary.Base64;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * Description:
 */
public class RsaUtil {

    private static final String ALGORITHM="RSA";

    private static final String SHA_256_WITH_RSA_ALGORITHM="SHA256withRSA";

    private static final  String ENCODING="UTF-8";

    /**
     * 格式化公钥
     * @param base64Key
     * @return
     */
    private static String formatRS256PubKey(String base64Key) {
        return base64Key.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "")
                .replaceAll("[\\t\\n\\r]", "").trim();
    }

    /**
     * 格式化私钥
     * @param base64Key
     * @return
     */
    private static String formatRS256PriKey(String base64Key) {
        return base64Key.replace("-----BEGIN PRIVATE KEY-----", "").replace("-----END PRIVATE KEY-----", "")
                .replaceAll("[\\t\\n\\r]", "").trim();
    }

    private static PublicKey getPublicKeyWithBase64KeyContent(String keyContent) throws Exception {
        byte[] buffer = Base64.decodeBase64(formatRS256PubKey(keyContent));
        X509EncodedKeySpec spec =
                new X509EncodedKeySpec(buffer);
        KeyFactory kf = KeyFactory.getInstance(ALGORITHM);
        return kf.generatePublic(spec);
    }

    private static PrivateKey getPrivateKeyWithBase64KeyContent(String keyContent) throws Exception {
        byte[] buffer = Base64.decodeBase64(formatRS256PriKey(keyContent));
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(buffer);
        KeyFactory keyFactory = KeyFactory.getInstance(ALGORITHM);
        return keyFactory.generatePrivate(keySpec);
    }

    /**
     * 生成签名
     * @param content
     * @param privateKey
     * @return
     * @throws Exception
     */
    public static String buildSign(String content, String privateKey){
        try{
            byte[] contentBytes = content.getBytes(ENCODING);
            Signature signature = Signature.getInstance(SHA_256_WITH_RSA_ALGORITHM);
            signature.initSign(getPrivateKeyWithBase64KeyContent(privateKey));
            signature.update(contentBytes);
            byte[] signs = signature.sign();
            return Base64.encodeBase64String(signs);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 验签
     * @param content
     * @param sign
     * @param publicKey
     * @return
     * @throws Exception
     */
    public static boolean verifySign(String content, String sign, String publicKey) throws Exception{
        byte[] contentBytes = content.getBytes(ENCODING);
        Signature signature = Signature.getInstance(SHA_256_WITH_RSA_ALGORITHM);
        signature.initVerify(getPublicKeyWithBase64KeyContent(publicKey));
        signature.update(contentBytes);
        return signature.verify(Base64.decodeBase64(sign));
    }


}
