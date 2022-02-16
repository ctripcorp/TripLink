<?php declare(strict_types=1);

namespace v2\model\core;

use JsonSerializable;
use v2\model\BaseResponse;

class CreateCardResponse extends BaseResponse implements JsonSerializable {
    /**
     * 卡ID
     * @var string|null card ID
     */
    private $cardLogId = null;
    /**
     * 卡号
     * @var string|null card number
     */
    private $cardNum = null;
    /**
     * 有效期
     * @var string|null expiration date
     */
    private $cardExpirationDate = null;
    /**
     * CVV2
     * @var string|null cvv2
     */
    private $cvv2 = null;
    /**
     * 卡品牌
     * @var string|null card brand
     */
    private $cardType = null;
    /**
     * 卡组织
     * @var string|null card association
     */
    private $cardLabel = null;

    public static function fromArray(array $array): self {
        $instance = new self($array['returnCode'], $array['errorMessage']);
        $instance->cardLogId = $array['cardLogId'] ?? null;
        $instance->cardNum = $array['cardNum'] ?? null;
        $instance->cardExpirationDate = $array['cardExpirationDate'] ?? null;
        $instance->cvv2 = $array['cvv2'] ?? null;
        $instance->cardType = $array['cardType'] ?? null;
        $instance->cardLabel = $array['cardLabel'] ?? null;
        return $instance;
    }

    public function getCardLogId(): ?string {
        return $this->cardLogId;
    }

    public function setCardLogId(?string $cardLogId): void {
        $this->cardLogId = $cardLogId;
    }

    public function getCardNum(): ?string {
        return $this->cardNum;
    }

    public function setCardNum(?string $cardNum): void {
        $this->cardNum = $cardNum;
    }

    public function getCardExpirationDate(): ?string {
        return $this->cardExpirationDate;
    }

    public function setCardExpirationDate(?string $cardExpirationDate): void {
        $this->cardExpirationDate = $cardExpirationDate;
    }

    public function getCvv2(): ?string {
        return $this->cvv2;
    }

    public function setCvv2(?string $cvv2): void {
        $this->cvv2 = $cvv2;
    }

    public function getCardType(): ?string {
        return $this->cardType;
    }

    public function setCardType(?string $cardType): void {
        $this->cardType = $cardType;
    }

    public function getCardLabel(): ?string {
        return $this->cardLabel;
    }

    public function setCardLabel(?string $cardLabel): void {
        $this->cardLabel = $cardLabel;
    }

    public function jsonSerialize(): object {
        return (object)array_filter(get_object_vars($this), function ($value) {
            return $value !== null;
        });
    }
}