<?php
namespace triplink\vcc\card\utils;

class RsaUtils {
    
    static function generateSign($content, $primaryKey) {
        $primaryKey = "-----BEGIN RSA PRIVATE KEY-----\n" .
            wordwrap($primaryKey, 64, "\n", true) .
            "\n-----END RSA PRIVATE KEY-----";
            $key = openssl_pkey_get_private($primaryKey);
            openssl_sign($content, $signature, $key, "SHA256");
            openssl_free_key($key);
            $sign = base64_encode($signature);
            return $sign;
    }
}
?>
