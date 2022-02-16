<?php
namespace triplink\vcc\card\utils;


class DesUtils {
    public static function encryptByTDES($data, $key){
        $decrypted = openssl_decrypt(base64_decode($data), 'DES-CBC', $key, OPENSSL_NO_PADDING,$key);
        return self::pkcs7_unpad($decrypted);
    }

    public static function pkcs7_unpad($text)
    {
        $pad = ord($text[strlen($text) - 1]);
        if ($pad > strlen($text)) return false;
        if (strspn($text, chr($pad), strlen($text) - $pad) != $pad) return false;
        return substr($text, 0, -1 * $pad);
    }
}
?>