<?php declare(strict_types=1);

namespace v2\model\core;

use JsonSerializable;
use v2\model\BaseResponse;

class QuerySettlementResponse extends BaseResponse implements JsonSerializable {
    /**
     * 卡ID
     * @var string|null card ID
     */
    private $cardLogId = null;
    /**
     * 清算交易
     * @var Settlement[]|null settlement transactions
     */
    private $list = null;

    public static function fromArray(array $array): self {
        $instance = new self($array['returnCode'], $array['errorMessage']);
        $instance->cardLogId = $array['cardLogId'] ?? null;
        $instance->list = isset($array['list']) ? array_map([Settlement::class, 'fromArray'], $array['list']) : null;
        return $instance;
    }

    public function getCardLogId(): ?string {
        return $this->cardLogId;
    }

    public function setCardLogId(?string $cardLogId): void {
        $this->cardLogId = $cardLogId;
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