<?php declare(strict_types=1);

namespace v2\model\core;

use JsonSerializable;
use v2\model\BaseRequest;

class FxCreateRequest extends BaseRequest implements JsonSerializable {
    /**
     * 卖出币种
     * @var string sell currency
     */
    private $sellCurrency;
    /**
     * 买入币种
     * @var string buy currency
     */
    private $buyCurrency;
    /**
     * 交易方向
     * @var int trading direction
     */
    private $fxDirection;
    /**
     * 交易金额
     * @var float trading amount
     */
    private $fxAmount;

      /**
         * 汇率id
         * @var string|null
    */
    private $quoteId;

    public function getSellCurrency(): string {
        return $this->sellCurrency;
    }

    public function setSellCurrency(string $sellCurrency): void {
        $this->sellCurrency = $sellCurrency;
    }

    public function getBuyCurrency(): string {
        return $this->buyCurrency;
    }

    public function setBuyCurrency(string $buyCurrency): void {
        $this->buyCurrency = $buyCurrency;
    }

    public function getFxDirection(): int {
        return $this->fxDirection;
    }

    public function setFxDirection(int $fxDirection): void {
        $this->fxDirection = $fxDirection;
    }

    public function getFxAmount(): float {
        return $this->fxAmount;
    }

    public function setFxAmount(float $fxAmount): void {
        $this->fxAmount = $fxAmount;
    }

    public function getQuoteId(): string {
        return $this->quoteId;
    }

    public function setQuoteId(string $quoteId): void {
         $this->quoteId = $quoteId;
    }

    public function jsonSerialize(): object {
        return (object)array_filter(get_object_vars($this), function ($value) {
            return $value !== null;
        });
    }
}