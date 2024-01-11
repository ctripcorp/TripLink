<?php declare(strict_types=1);

namespace v2\model\core;

use JsonSerializable;
use v2\model\BaseRequest;

class FxQueryRequest extends BaseRequest implements JsonSerializable {
    /**
     * 原始流水号
     * @var string|null
     */
    private $oriRequestId;
    /**
     * 订单号
     * @var string|null
     */
    private $orderId;

    public function getOrderId(): ?string {
       return $this->orderId;
    }

    public function setOrderId(?string $orderId): void {
       $this->orderId = $orderId;
    }

    public function getOriRequestId(): ?string {
       return $this->oriRequestId;
    }

    public function setOriRequestId(?string $oriRequestId): void {
       $this->oriRequestId = $oriRequestId;
    }

    public function jsonSerialize(): object {
        return (object)array_filter(get_object_vars($this), function ($value) {
            return $value !== null;
        });
    }
}