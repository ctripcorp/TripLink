<?php declare(strict_types=1);

namespace v2\model;

abstract class BaseRequest {
    /**
     * 请求流水号
     * @var string request ID
     */
    protected $requestId;
    /**
     * 客户ID
     * @var string customer ID
     */
    protected $customerId;

    public function __construct(string $requestId, string $customerId) {
        $this->requestId = $requestId;
        $this->customerId = $customerId;
    }

    public function getRequestId(): string {
        return $this->requestId;
    }

    public function setRequestId(string $requestId): void {
        $this->requestId = $requestId;
    }

    public function getCustomerId(): string {
        return $this->customerId;
    }

    public function setCustomerId(string $customerId): void {
        $this->customerId = $customerId;
    }
}