<?php declare(strict_types=1);

namespace v2\config;

class Customer {
    /**
     * 客户ID
     * @var string customer ID
     */
    private $customerId;
    /**
     * AES密钥 (用于加密与解密数据)
     * @var string AES key
     */
    private $aesKey;
    /**
     * 客户RSA私钥 (用于生成请求签名)
     * @var string customer RSA private key
     */
    private $privateKey;
    /**
     * TripLink RSA公钥 (用于验证响应签名)
     * @var string tripLink RSA public key
     */
    private $publicKey;

    public function __construct(string $customerId, string $aesKey, string $privateKey, string $publicKey) {
        $this->customerId = $customerId;
        $this->aesKey = $aesKey;
        $this->privateKey = $privateKey;
        $this->publicKey = $publicKey;
    }

    public function getCustomerId(): string {
        return $this->customerId;
    }

    public function getAesKey(): string {
        return $this->aesKey;
    }

    public function getPrivateKey(): string {
        return $this->privateKey;
    }

    public function getPublicKey(): string {
        return $this->publicKey;
    }
}