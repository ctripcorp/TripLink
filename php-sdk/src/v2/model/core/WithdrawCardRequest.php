<?php declare(strict_types=1);

namespace v2\model\core;

use JsonSerializable;
use v2\model\BaseRequest;

class WithdrawCardRequest extends BaseRequest implements JsonSerializable {
    /**
     * 卡ID
     * @var string card ID
     */
    private $cardLogId;
    /**
     * 提现金额
     * @var float withdraw amount
     */
    private $withdrawAmount;

    public function getCardLogId(): string {
        return $this->cardLogId;
    }

    public function setCardLogId(string $cardLogId): void {
        $this->cardLogId = $cardLogId;
    }

    public function getWithdrawAmount(): float {
        return $this->withdrawAmount;
    }

    public function setWithdrawAmount(float $withdrawAmount): void {
        $this->withdrawAmount = $withdrawAmount;
    }

    public function jsonSerialize(): object {
        return (object)array_filter(get_object_vars($this), function ($value) {
            return $value !== null;
        });
    }
}