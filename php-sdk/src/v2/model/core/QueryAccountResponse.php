<?php declare(strict_types=1);

namespace v2\model\core;

use JsonSerializable;
use v2\model\BaseResponse;

class QueryAccountResponse extends BaseResponse implements JsonSerializable {
    /**
     * 客户ID
     * @var string|null customer ID
     */
    private $customerId = null;
    /**
     * 账户信息
     * @var Account[]|null accounts
     */
    private $list = null;

    public static function fromArray(array $array): self {
        $instance = new self($array['returnCode'], $array['errorMessage']);
        $instance->customerId = $array['customerId'] ?? null;
        $instance->list = isset($array['list']) ? array_map([Account::class, 'fromArray'], $array['list']) : null;
        return $instance;
    }

    public function getCustomerId(): ?string {
        return $this->customerId;
    }

    public function setCustomerId(?string $customerId): void {
        $this->customerId = $customerId;
    }

    public function getList(): ?array {
        return $this->list;
    }

    public function setList(?array $list): void {
        $this->list = $list;
    }

    public function jsonSerialize(): object {
        return (object)array_filter(get_object_vars($this), function ($value) {
            return $value !== null;
        });
    }
}