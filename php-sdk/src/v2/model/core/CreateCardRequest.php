<?php declare(strict_types=1);

namespace v2\model\core;

use JsonSerializable;
use v2\model\BaseRequest;

class CreateCardRequest extends BaseRequest implements JsonSerializable {
    /**
     * 卡币种
     * @var string card currency code
     */
    private $cardCurrencyCode;
    /**
     * 结算币种
     * @var string settlement currency code
     */
    private $settlementCurrencyCode;
    /**
     * 生效日期
     * @var string effective date
     */
    private $activeDate;
    /**
     * 失效日期
     * @var string expiration date
     */
    private $inactiveDate;
    /**
     * 额度
     * @var float credit limit
     */
    private $cardLimit;
    /**
     * 单次授权金额下限
     * @var float lower limit of single authorized transaction
     */
    private $minAuthAmount;
    /**
     * 单次授权金额上限
     * @var float upper limit of single authorized transaction
     */
    private $maxAuthAmount;
    /**
     * 授权次数上限
     * @var int maximum authorized transaction times
     */
    private $maxAuthTimes;
    /**
     * 自动注销百分比
     * @var int|null auto cancel threshold percentage
     */
    private $cardCloseUsage = null;
    /**
     * 接受的MCC组
     * @var string accepted MCC group
     */
    private $supportedMccGroup;
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
     * 发卡机构识别号
     * @var string|null IIN code
     */
    private $cardBin = null;
    /**
     * 卡产品
     * @var string|null card product
     */
    private $cardProductCode = null;
    /**
     * 卡类型
     * @var string|null card type
     */
    private $cardType = null;
    /**
     * 卡组织
     * @var string|null card association
     */
    private $cardLabel = null;
    /**
     * 卡时区
     * @var string|null card time zone
     */
    private $timeZone = null;
    /**
     * 用户自定义字段
     * @var UserReference|null user defined properties
     */
    private $userReferenceMap = null;

    public function getCardCurrencyCode(): string {
        return $this->cardCurrencyCode;
    }

    public function setCardCurrencyCode(string $cardCurrencyCode): void {
        $this->cardCurrencyCode = $cardCurrencyCode;
    }

    public function getSettlementCurrencyCode(): string {
        return $this->settlementCurrencyCode;
    }

    public function setSettlementCurrencyCode(string $settlementCurrencyCode): void {
        $this->settlementCurrencyCode = $settlementCurrencyCode;
    }

    public function getActiveDate(): string {
        return $this->activeDate;
    }

    public function setActiveDate(string $activeDate): void {
        $this->activeDate = $activeDate;
    }

    public function getInactiveDate(): string {
        return $this->inactiveDate;
    }

    public function setInactiveDate(string $inactiveDate): void {
        $this->inactiveDate = $inactiveDate;
    }

    public function getCardLimit(): float {
        return $this->cardLimit;
    }

    public function setCardLimit(float $cardLimit): void {
        $this->cardLimit = $cardLimit;
    }

    public function getMinAuthAmount(): float {
        return $this->minAuthAmount;
    }

    public function setMinAuthAmount(float $minAuthAmount): void {
        $this->minAuthAmount = $minAuthAmount;
    }

    public function getMaxAuthAmount(): float {
        return $this->maxAuthAmount;
    }

    public function setMaxAuthAmount(float $maxAuthAmount): void {
        $this->maxAuthAmount = $maxAuthAmount;
    }

    public function getMaxAuthTimes(): int {
        return $this->maxAuthTimes;
    }

    public function setMaxAuthTimes(int $maxAuthTimes): void {
        $this->maxAuthTimes = $maxAuthTimes;
    }

    public function getCardCloseUsage(): ?int {
        return $this->cardCloseUsage;
    }

    public function setCardCloseUsage(?int $cardCloseUsage): void {
        $this->cardCloseUsage = $cardCloseUsage;
    }

    public function getSupportedMccGroup(): string {
        return $this->supportedMccGroup;
    }

    public function setSupportedMccGroup(string $supportedMccGroup): void {
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

    public function getCardBin(): ?string {
        return $this->cardBin;
    }

    public function setCardBin(?string $cardBin): void {
        $this->cardBin = $cardBin;
    }

    public function getCardProductCode(): ?string {
        return $this->cardProductCode;
    }

    public function setCardProductCode(?string $cardProductCode): void {
        $this->cardProductCode = $cardProductCode;
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

    public function getTimeZone(): ?string {
        return $this->timeZone;
    }

    public function setTimeZone(?string $timeZone): void {
        $this->timeZone = $timeZone;
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