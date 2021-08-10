package com.ctrip.ccard.creditcard.vcc.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.security.Security;

/**
 * Description: 提供Des 数据加解密处理 其中key由vcc服务方提供
 */
public class DesUtil {

    private static String ALGORITHM = "DES/CBC/PKCS7Padding";

    private static String ALGORITHMDES = "DES";

    private static String CHARSETNAME = "UTF-8";

    private static final String BC = "BC";

    static{
        if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    /**
     *Des 数据解密
     * @param data 卡加密数据
     * @param key  加解密的Key 由服务方提供
     * @return 解密数据为空返回NULL
     * @throws Exception
     */
    public static String decryptData(String data,String key)  {
       try{
           if(StringUtils.isNotBlank(data)) {
               Cipher cipher = Cipher.getInstance(ALGORITHM, BC);
               SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHMDES);
               DESKeySpec desKeySpec = new DESKeySpec(key.getBytes(CHARSETNAME));
               SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
               IvParameterSpec iv = new IvParameterSpec(key.getBytes(CHARSETNAME));
               cipher.init(Cipher.DECRYPT_MODE, secretKey,iv);
               byte[] asBytes = Base64.decodeBase64(data);
               return new String(cipher.doFinal(asBytes), CHARSETNAME);
           }
           return null;
       }catch (Exception e){
          throw new RuntimeException(e);
       }
    }

    /**
     * Des 数据加密
     * @param data 卡明文信息
     * @param key   加解密的Key 由服务方提供
     * @return 加密数据为空返回NULL
     * @throws Exception
     */
    public static String encryptData(String data,String key) throws Exception {
        if(StringUtils.isNotBlank(data)) {
            Cipher cipher = Cipher.getInstance(ALGORITHM, BC);
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHMDES);
            DESKeySpec desKeySpec = new DESKeySpec(key.getBytes(CHARSETNAME));
            SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
            IvParameterSpec iv = new IvParameterSpec(key.getBytes(CHARSETNAME));
            cipher.init(Cipher.ENCRYPT_MODE, secretKey,iv);
            byte[] asBytes = Base64.encodeBase64(cipher.doFinal(data.getBytes(CHARSETNAME)));
            return new String(asBytes, CHARSETNAME);
        }
        return null;
    }

}
