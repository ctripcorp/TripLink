<?php declare(strict_types=1);

namespace v2\model\core;

use JsonSerializable;
use v2\model\BaseRequest;

class UpdateCardRequest extends BaseRequest implements JsonSerializable {
    /**
     * 卡ID
     * @var string card ID
     */
    private $cardLogId;
    /**
     * 生效日期
     * @var string|null effective date
     */
    private $activeDate = null;
    /**
     * 失效日期
     * @var string|null expiration date
     */
    private $inactiveDate = null;
    /**
     * 额度
     * @var float|null credit limit
     */
    private $cardLimit = null;
    /**
     * 单次授权金额下限
     * @var float|null lower limit of single authorized transaction
     */
    private $minAuthAmount = null;
    /**
     * 单次授权金额上限
     * @var float|null upper limit of single authorized transaction
     */
    private $maxAuthAmount = null;
    /**
     * 自动注销百分比
     * @var int|null auto cancel threshold percentage
     */
    private $cardCloseUsage = null;
    /**
     * 接受的MCC组
     * @var string|null accepted MCC group
     */
    private $supportedMccGroup = null;
    /**
     * 接受的商户ID
     * @var string|null accepted merchant ID
     */
    private $supportedMid = null;
    /**
     * 接受的收单行ID
     * @var string|null accepted acquirer ID
     */
    private $supportedAcquirerId = null;
    /**
     * 是否允许非卡币种交易
     * @var bool|null whether allow transactions not in card currency
     */
    private $multipleCurrencyCard = null;
    /**
     * 是否验证CVV2
     * @var bool|null whether verify CVV2
     */
    private $cvv2ForceCheck = null;
    /**
     * 卡时区
     * @var string|null card time zone
     */
    private $timeZone = null;
    /**
     * 是否接受3DS验证
     * @var bool|null whether allow 3DS
     */
    private $allow3ds = null;
    /**
     * 用户自定义字段
     * @var UserReference|null user defined properties
     */
    private $userReferenceMap = null;

    public function getCardLogId(): string {
        return $this->cardLogId;
    }

    public function setCardLogId(string $cardLogId): void {
        $this->cardLogId = $cardLogId;
    }

    public function getActiveDate(): ?string {
        return $this->activeDate;
    }

    public function setActiveDate(?string $activeDate): void {
        $this->activeDate = $activeDate;
    }

    public function getInactiveDate(): ?string {
        return $this->inactiveDate;
    }

    public function setInactiveDate(?string $inactiveDate): void {
        $this->inactiveDate = $inactiveDate;
    }

    public function getCardLimit(): ?float {
        return $this->cardLimit;
    }

    public function setCardLimit(?float $cardLimit): void {
        $this->cardLimit = $cardLimit;
    }

    public function getMinAuthAmount(): ?float {
        return $this->minAuthAmount;
    }

    public function setMinAuthAmount(?float $minAuthAmount): void {
        $this->minAuthAmount = $minAuthAmount;
    }

    public function getMaxAuthAmount(): ?float {
        return $this->maxAuthAmount;
    }

    public function setMaxAuthAmount(?float $maxAuthAmount): void {
        $this->maxAuthAmount = $maxAuthAmount;
    }

    public function getCardCloseUsage(): ?int {
        return $this->cardCloseUsage;
    }

    public function setCardCloseUsage(?int $cardCloseUsage): void {
        $this->cardCloseUsage = $cardCloseUsage;
    }

    public function getSupportedMccGroup(): ?string {
        return $this->supportedMccGroup;
    }

    public function setSupportedMccGroup(?string $supportedMccGroup): void {
        $this->supportedMccGroup = $supportedMccGroup;
    }

    public function getSupportedMid(): ?string {
        return $this->supportedMid;
    }

    public function setSupportedMid(?string $supportedMid): void {
        $this->supportedMid = $supportedMid;
    }

    public function getSupportedAcquirerId(): ?string {
        return $this->supportedAcquirerId;
    }

    public function setSupportedAcquirerId(?string $supportedAcquirerId): void {
        $this->supportedAcquirerId = $supportedAcquirerId;
    }

    public function getMultipleCurrencyCard(): ?bool {
        return $this->multipleCurrencyCard;
    }

    public function setMultipleCurrencyCard(?bool $multipleCurrencyCard): void {
        $this->multipleCurrencyCard = $multipleCurrencyCard;
    }

    public function getCvv2ForceCheck(): ?bool {
        return $this->cvv2ForceCheck;
    }

    public function setCvv2ForceCheck(?bool $cvv2ForceCheck): void {
        $this->cvv2ForceCheck = $cvv2ForceCheck;
    }

    public function getTimeZone(): ?string {
        return $this->timeZone;
    }

    public function setTimeZone(?string $timeZone): void {
        $this->timeZone = $timeZone;
    }

    public function getAllow3ds(): ?bool {
        return $this->allow3ds;
    }

    public function setAllow3ds(?bool $allow3ds): void {
        $this->allow3ds = $allow3ds;
    }

    public function getUserReferenceMap(): ?UserReference {
        return $this->userReferenceMap;
    }

    public function setUserReferenceMap(?UserReference $userReferenceMap): void {
        $this->userReferenceMap = $userReferenceMap;
    }

    public function jsonSerialize(): object {
        return (object)array_filter(get_object_vars($this), function ($value) {
            return $value !== null;
        });
    }
}
