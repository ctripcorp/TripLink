<?php declare(strict_types=1);

namespace v2\model\core;

use JsonSerializable;
use v2\model\BaseResponse;

class FxCreateResponse extends BaseResponse implements JsonSerializable {
    /**
     * 订单id
     * @var string|null order Id
     */
    private $orderId = null;

    /**
     * 受理时间
     * @var string|null accept time
     */
    private $acceptTime = null;

    /**
     * 卖出币种
     * @var string|null sell currency
     */
    private $sellCurrency = null;
    /**
     * 卖出金额
     * @var float|null sell amount
     */
    private $sellAmount = null;
    /**
     * 买入币种
     * @var string|null buy currency
     */
    private $buyCurrency = null;
    /**
     * 买入金额
     * @var float|null buy amount
     */
    private $buyAmount = null;
    /**
     * 汇率
     * @var float|null exchange rate
     */
    private $rate = null;
    /**
      * 汇率id
      * @var string|null quoteId
     */
    private $quoteId;

    public static function fromArray(array $array): self {
        $instance = new self($array['returnCode'], $array['errorMessage']);
        $instance->orderId = $array['orderId'] ?? null;
        $instance->quoteId = $array['quoteId'] ?? null;
        $instance->sellCurrency = $array['sellCurrency'] ?? null;
        $instance->sellAmount = $array['sellAmount'] ?? null;
        $instance->buyCurrency = $array['buyCurrency'] ?? null;
        $instance->buyAmount = $array['buyAmount'] ?? null;
        $instance->rate = $array['rate'] ?? null;
        $instance->acceptTime = $array['acceptTime'] ?? null;
        return $instance;
    }
    public function getOrderId(): ?string {
        return $this->orderId;
    }

    public function setOrderId(?string $orderId): void {
        $this->orderId = $orderId;
    }

    public function getAcceptTime(): ?string {
        return $this->acceptTime;
    }

    public function setAcceptTime(?string $acceptTime): void {
        $this->acceptTime = $acceptTime;
    }
    public function getQuoteId(): ?string {
        return $this->quoteId;
    }

    public function setQuoteId(?string $quoteId): void {
        $this->quoteId = $quoteId;
    }

    public function getSellCurrency(): ?string {
        return $this->sellCurrency;
    }

    public function setSellCurrency(?string $sellCurrency): void {
        $this->sellCurrency = $sellCurrency;
    }

    public function getSellAmount(): ?float {
        return $this->sellAmount;
    }

    public function setSellAmount(?float $sellAmount): void {
        $this->sellAmount = $sellAmount;
    }

    public function getBuyCurrency(): ?string {
        return $this->buyCurrency;
    }

    public function setBuyCurrency(?string $buyCurrency): void {
        $this->buyCurrency = $buyCurrency;
    }

    public function getBuyAmount(): ?float {
        return $this->buyAmount;
    }

    public function setBuyAmount(?float $buyAmount): void {
        $this->buyAmount = $buyAmount;
    }

    public function getRate(): ?float {
        return $this->rate;
    }

    public function setRate(?float $rate): void {
        $this->rate = $rate;
    }

    public function jsonSerialize(): object {
        return (object)array_filter(get_object_vars($this), function ($value) {
            return $value !== null;
        });
    }
}
