<?php declare(strict_types=1);

namespace v2\util;

class CipherUtils {

    public static function aesEncrypt(string $keyStr, string $plaintext): string {
        return base64_encode(openssl_encrypt($plaintext, 'AES-128-ECB', base64_decode($keyStr), OPENSSL_RAW_DATA));
    }

    public static function aesDecrypt(string $keyStr, string $ciphertext): string {
        return openssl_decrypt(base64_decode($ciphertext), 'AES-128-ECB', base64_decode($keyStr), OPENSSL_RAW_DATA);
    }

    public static function rsaSign(string $privateKeyStr, string $content): string {
        openssl_sign($content, $signature, self::pemFormat($privateKeyStr, 'PRIVATE KEY'), OPENSSL_ALGO_SHA256);
        return base64_encode($signature);
    }

    public static function rsaVerify(string $publicKeyStr, string $content, string $signature): bool {
        return openssl_verify($content, base64_decode($signature), self::pemFormat($publicKeyStr, 'PUBLIC KEY'), OPENSSL_ALGO_SHA256) === 1;
    }

    private static function pemFormat(string $keyStr, string $label): string {
        return "-----BEGIN {$label}-----\n" . chunk_split($keyStr, 64) . "-----END {$label}-----\n";
    }
}
