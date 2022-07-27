<?php declare(strict_types=1);

namespace v2\model\core;

use JsonSerializable;

class Authorization implements JsonSerializable {
    /**
     * 交易唯一ID
     * @var string|null transaction id
     */
    private $txnId = null;
    /**
     * 交易关联ID
     * @var string|null authorization relation id
     */
    private $transactionID = null;
    /**
     * 交易发生时间
     * @var string|null authorization occur time
     */
    private $occurDateTime = null;
    /**
     * 交易类型
     * @var string|null authorization type
     */
    private $messageType = null;
    /**
     * 交易类型描述
     * @var string|null authorization type description
     */
    private $messageTypeDescription = null;
    /**
     * 冲正类型
     * @var string|null reversal type
     */
    private $reversalType = null;
    /**
     * 交易响应码
     * @var string|null response code
     */
    private $responseCode = null;
    /**
     * 交易响应码描述
     * @var string|null response code description
     */
    private $responseCodeDescription = null;
    /**
     * 授权码
     * @var string|null approval code
     */
    private $approvalCode = null;
    /**
     * 交易币种
     * @var string|null authorized currency
     */
    private $originalTransactionCurrency = null;
    /**
     * 交易金额
     * @var float|null authorized amount
     */
    private $originalTransactionAmount = null;
    /**
     * 卡币种
     * @var string|null card currency
     */
    private $cardTransactionCurrency = null;
    /**
     * 卡交易金额
     * @var float|null card authorized amount
     */
    private $cardTransactionAmount = null;
    /**
     * 商户ID
     * @var string|null merchant ID
     */
    private $posMerchantID = null;
    /**
     * 商户名称
     * @var string|null merchant name
     */
    private $posMerchantName = null;
    /**
     * 商户MCC
     * @var string|null merchant MCC
     */
    private $posMerchantClassCode = null;
    /**
     * 商户所在国家
     * @var string|null merchant country
     */
    private $posMerchantCountry = null;
    /**
     * 商户所在城市
     * @var string|null merchant city
     */
    private $posMerchantCity = null;
    /**
     * 收单行ID
     * @var string|null acquirer ID
     */
    private $posAcquirerID = null;

    public static function fromArray(array $array): self {
        $instance = new self();
        $instance->txnId = $array['txnId'] ?? null;
        $instance->transactionID = $array['transactionID'] ?? null;
        $instance->occurDateTime = $array['occurDateTime'] ?? null;
        $instance->messageType = $array['messageType'] ?? null;
        $instance->messageTypeDescription = $array['messageTypeDescription'] ?? null;
        $instance->reversalType = $array['reversalType'] ?? null;
        $instance->responseCode = $array['responseCode'] ?? null;
        $instance->responseCodeDescription = $array['responseCodeDescription'] ?? null;
        $instance->approvalCode = $array['approvalCode'] ?? null;
        $instance->originalTransactionCurrency = $array['originalTransactionCurrency'] ?? null;
        $instance->originalTransactionAmount = $array['originalTransactionAmount'] ?? null;
        $instance->cardTransactionCurrency = $array['cardTransactionCurrency'] ?? null;
        $instance->cardTransactionAmount = $array['cardTransactionAmount'] ?? null;
        $instance->posMerchantID = $array['posMerchantID'] ?? null;
        $instance->posMerchantName = $array['posMerchantName'] ?? null;
        $instance->posMerchantClassCode = $array['posMerchantClassCode'] ?? null;
        $instance->posMerchantCountry = $array['posMerchantCountry'] ?? null;
        $instance->posMerchantCity = $array['posMerchantCity'] ?? null;
        $instance->posAcquirerID = $array['posAcquirerID'] ?? null;
        return $instance;
    }

    public function getTxnId(): ?string {
        return $this->txnId;
    }

    public function setTxnId(?string $txnId): void {
        $this->txnId = $txnId;
    }

    public function getTransactionID(): ?string {
        return $this->transactionID;
    }

    public function setTransactionID(?string $transactionID): void {
        $this->transactionID = $transactionID;
    }

    public function getOccurDateTime(): ?string {
        return $this->occurDateTime;
    }

    public function setOccurDateTime(?string $occurDateTime): void {
        $this->occurDateTime = $occurDateTime;
    }

    public function getMessageType(): ?string {
        return $this->messageType;
    }

    public function setMessageType(?string $messageType): void {
        $this->messageType = $messageType;
    }

    public function getMessageTypeDescription(): ?string {
        return $this->messageTypeDescription;
    }

    public function setMessageTypeDescription(?string $messageTypeDescription): void {
        $this->messageTypeDescription = $messageTypeDescription;
    }

    public function getReversalType(): ?string {
        return $this->reversalType;
    }

    public function setReversalType(?string $reversalType): void {
        $this->reversalType = $reversalType;
    }

    public function getResponseCode(): ?string {
        return $this->responseCode;
    }

    public function setResponseCode(?string $responseCode): void {
        $this->responseCode = $responseCode;
    }

    public function getResponseCodeDescription(): ?string {
        return $this->responseCodeDescription;
    }

    public function setResponseCodeDescription(?string $responseCodeDescription): void {
        $this->responseCodeDescription = $responseCodeDescription;
    }

    public function getApprovalCode(): ?string {
        return $this->approvalCode;
    }

    public function setApprovalCode(?string $approvalCode): void {
        $this->approvalCode = $approvalCode;
    }

    public function getOriginalTransactionCurrency(): ?string {
        return $this->originalTransactionCurrency;
    }

    public function setOriginalTransactionCurrency(?string $originalTransactionCurrency): void {
        $this->originalTransactionCurrency = $originalTransactionCurrency;
    }

    public function getOriginalTransactionAmount(): ?float {
        return $this->originalTransactionAmount;
    }

    public function setOriginalTransactionAmount(?float $originalTransactionAmount): void {
        $this->originalTransactionAmount = $originalTransactionAmount;
    }

    public function getCardTransactionCurrency(): ?string {
        return $this->cardTransactionCurrency;
    }

    public function setCardTransactionCurrency(?string $cardTransactionCurrency): void {
        $this->cardTransactionCurrency = $cardTransactionCurrency;
    }

    public function getCardTransactionAmount(): ?float {
        return $this->cardTransactionAmount;
    }

    public function setCardTransactionAmount(?float $cardTransactionAmount): void {
        $this->cardTransactionAmount = $cardTransactionAmount;
    }

    public function getPosMerchantID(): ?string {
        return $this->posMerchantID;
    }

    public function setPosMerchantID(?string $posMerchantID): void {
        $this->posMerchantID = $posMerchantID;
    }

    public function getPosMerchantName(): ?string {
        return $this->posMerchantName;
    }

    public function setPosMerchantName(?string $posMerchantName): void {
        $this->posMerchantName = $posMerchantName;
    }

    public function getPosMerchantClassCode(): ?string {
        return $this->posMerchantClassCode;
    }

    public function setPosMerchantClassCode(?string $posMerchantClassCode): void {
        $this->posMerchantClassCode = $posMerchantClassCode;
    }

    public function getPosMerchantCountry(): ?string {
        return $this->posMerchantCountry;
    }

    public function setPosMerchantCountry(?string $posMerchantCountry): void {
        $this->posMerchantCountry = $posMerchantCountry;
    }

    public function getPosMerchantCity(): ?string {
        return $this->posMerchantCity;
    }

    public function setPosMerchantCity(?string $posMerchantCity): void {
        $this->posMerchantCity = $posMerchantCity;
    }

    public function getPosAcquirerID(): ?string {
        return $this->posAcquirerID;
    }

    public function setPosAcquirerID(?string $posAcquirerID): void {
        $this->posAcquirerID = $posAcquirerID;
    }

    public function jsonSerialize(): object {
        return (object)array_filter(get_object_vars($this), function ($value) {
            return $value !== null;
        });
    }
}