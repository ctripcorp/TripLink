<?php declare(strict_types=1);

namespace v2\model\core;

use JsonSerializable;
use v2\model\BaseResponse;

class QueryCardResponse extends BaseResponse implements JsonSerializable {
    /**
     * 客户ID
     * @var string|null customer ID
     */
    private $customerId = null;
    /**
     * 卡ID
     * @var string|null card ID
     */
    private $cardLogId = null;
    /**
     * 卡币种
     * @var string|null card currency code
     */
    private $cardCurrencyCode = null;
    /**
     * 结算币种
     * @var string|null settlement currency code
     */
    private $settlementCurrencyCode = null;
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
     * 授权次数上限
     * @var int|null maximum authorized transaction times
     */
    private $maxAuthTimes = null;
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
     * 申请日期
     * @var string|null apply date
     */
    private $applyTime = null;
    /**
     * 卡状态
     * @var string|null card status
     */
    private $status = null;
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
     * 可用余额
     * @var float|null available balance
     */
    private $availableBalance = null;
    /**
     * 待入账金额
     * @var float|null authorized amount
     */
    private $authorizeAmount = null;
    /**
     * 已入账金额
     * @var float|null settled amount
     */
    private $settlementAmount = null;
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

    public static function fromArray(array $array): self {
        $instance = new self($array['returnCode'], $array['errorMessage']);
        $instance->customerId = $array['customerId'] ?? null;
        $instance->cardLogId = $array['cardLogId'] ?? null;
        $instance->cardCurrencyCode = $array['cardCurrencyCode'] ?? null;
        $instance->settlementCurrencyCode = $array['settlementCurrencyCode'] ?? null;
        $instance->activeDate = $array['activeDate'] ?? null;
        $instance->inactiveDate = $array['inactiveDate'] ?? null;
        $instance->cardLimit = $array['cardLimit'] ?? null;
        $instance->minAuthAmount = $array['minAuthAmount'] ?? null;
        $instance->maxAuthAmount = $array['maxAuthAmount'] ?? null;
        $instance->maxAuthTimes = $array['maxAuthTimes'] ?? null;
        $instance->cardCloseUsage = $array['cardCloseUsage'] ?? null;
        $instance->supportedMccGroup = $array['supportedMccGroup'] ?? null;
        $instance->supportedMid = $array['supportedMid'] ?? null;
        $instance->supportedAcquirerId = $array['supportedAcquirerId'] ?? null;
        $instance->multipleCurrencyCard = $array['multipleCurrencyCard'] ?? null;
        $instance->cvv2ForceCheck = $array['cvv2ForceCheck'] ?? null;
        $instance->applyTime = $array['applyTime'] ?? null;
        $instance->status = $array['status'] ?? null;
        $instance->cardNum = $array['cardNum'] ?? null;
        $instance->cardExpirationDate = $array['cardExpirationDate'] ?? null;
        $instance->cvv2 = $array['cvv2'] ?? null;
        $instance->availableBalance = $array['availableBalance'] ?? null;
        $instance->authorizeAmount = $array['authorizeAmount'] ?? null;
        $instance->settlementAmount = $array['settlementAmount'] ?? null;
        $instance->cardType = $array['cardType'] ?? null;
        $instance->cardLabel = $array['cardLabel'] ?? null;
        $instance->timeZone = $array['timeZone'] ?? null;
        $instance->userReferenceMap = isset($array['userReferenceMap']) ? UserReference::fromArray($array['userReferenceMap']) : null;
        return $instance;
    }

    public function getCustomerId(): ?string {
        return $this->customerId;
    }

    public function setCustomerId(?string $customerId): void {
        $this->customerId = $customerId;
    }

    public function getCardLogId(): ?string {
        return $this->cardLogId;
    }

    public function setCardLogId(?string $cardLogId): void {
        $this->cardLogId = $cardLogId;
    }

    public function getCardCurrencyCode(): ?string {
        return $this->cardCurrencyCode;
    }

    public function setCardCurrencyCode(?string $cardCurrencyCode): void {
        $this->cardCurrencyCode = $cardCurrencyCode;
    }

    public function getSettlementCurrencyCode(): ?string {
        return $this->settlementCurrencyCode;
    }

    public function setSettlementCurrencyCode(?string $settlementCurrencyCode): void {
        $this->settlementCurrencyCode = $settlementCurrencyCode;
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

    public function getMaxAuthTimes(): ?int {
        return $this->maxAuthTimes;
    }

    public function setMaxAuthTimes(?int $maxAuthTimes): void {
        $this->maxAuthTimes = $maxAuthTimes;
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

    public function getApplyTime(): ?string {
        return $this->applyTime;
    }

    public function setApplyTime(?string $applyTime): void {
        $this->applyTime = $applyTime;
    }

    public function getStatus(): ?string {
        return $this->status;
    }

    public function setStatus(?string $status): void {
        $this->status = $status;
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

    public function getAvailableBalance(): ?float {
        return $this->availableBalance;
    }

    public function setAvailableBalance(?float $availableBalance): void {
        $this->availableBalance = $availableBalance;
    }

    public function getAuthorizeAmount(): ?float {
        return $this->authorizeAmount;
    }

    public function setAuthorizeAmount(?float $authorizeAmount): void {
        $this->authorizeAmount = $authorizeAmount;
    }

    public function getSettlementAmount(): ?float {
        return $this->settlementAmount;
    }

    public function setSettlementAmount(?float $settlementAmount): void {
        $this->settlementAmount = $settlementAmount;
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