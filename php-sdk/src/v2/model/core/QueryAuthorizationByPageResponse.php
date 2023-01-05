<?php declare(strict_types=1);

namespace v2\model\core;

use JsonSerializable;
use v2\model\BaseResponse;

class QueryAuthorizationByPageResponse extends BaseResponse implements JsonSerializable {
    /**
     * 卡ID
     * @var string|null card ID
     */
    private $cardLogId = null;
    /**
     * 数据数量
     * @var int|null data count
     */
    private $count = null;
    /**
     * 更多数据
     * @var bool|null more data
     */
    private $more = null;
    /**
     * 授权交易
     * @var AuthorizationByPage[]|null authorization transactions
     */
    private $transactionData = null;

    public static function fromArray(array $array): self {
        $instance = new self($array['returnCode'], $array['errorMessage']);
        $instance->cardLogId = $array['cardLogId'] ?? null;
        $instance->count = $array['count'] ?? null;
        $instance->more = $array['more'] ?? null;
        $instance->transactionData = isset($array['transactionData']) ? array_map([AuthorizationByPage::class, 'fromArray'], $array['transactionData']) : null;
        return $instance;
    }

    public function getCardLogId(): ?string {
        return $this->cardLogId;
    }

    public function setCardLogId(?string $cardLogId): void {
        $this->cardLogId = $cardLogId;
    }

    public function getCount(): ?int {
        return $this->count;
    }

    public function setCount(?int $count): void {
        $this->count = $count;
    }

    public function getMore(): ?bool {
        return $this->more;
    }

    public function setMore(?bool $more): void {
        $this->more = $more;
    }

    public function getTransactionData(): ?array {
        return $this->transactionData;
    }

    public function setTransactionData(?array $transactionData): void {
        $this->transactionData = $transactionData;
    }

    public function jsonSerialize(): object {
        return (object)array_filter(get_object_vars($this), function ($value) {
            return $value !== null;
        });
    }
}
