<?php declare(strict_types=1);

namespace v2\model\core;

use JsonSerializable;

class Settlement implements JsonSerializable {
    /**
     * 交易唯一ID
     * @var string|null transaction id
     */
    private $txnId = null;
    /**
     * 交易关联ID
     * @var string|null transaction relation id
     */
    private $transactionId = null;
    /**
     * 交易流水号
     * @var string|null settlement reference number
     */
    private $referenceNumber = null;
    /**
     * 交易发生时间
     * @var string|null authorization occur time
     */
    private $occurDateTime = null;
    /**
     * 入账处理时间
     * @var string|null posting time
     */
    private $postingDateTime = null;
    /**
     * 入账系统时间
     * @var string|null posting system date
     */
    private $postingSysTime = null;
    /**
     * 交易类型
     * @var string|null settlement type
     */
    private $transactionCode = null;
    /**
     * 交易类型描述
     * @var string|null settlement type description
     */
    private $transactionType = null;
    /**
     * 授权码
     * @var string|null approval code
     */
    private $approvalCode = null;
    /**
     * 借贷记
     * @var string|null debit or credit
     */
    private $isCredit = null;
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
     * 清算币种
     * @var string|null settlement currency
     */
    private $accountCurrency = null;
    /**
     * 清算金额
     * @var float|null settlement amount
     */
    private $billAccountAmount = null;
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
        $instance->transactionId = $array['transactionId'] ?? null;
        $instance->referenceNumber = $array['referenceNumber'] ?? null;
        $instance->occurDateTime = $array['occurDateTime'] ?? null;
        $instance->postingDateTime = $array['postingDateTime'] ?? null;
        $instance->postingSysTime = $array['postingSysTime'] ?? null;
        $instance->transactionCode = $array['transactionCode'] ?? null;
        $instance->transactionType = $array['transactionType'] ?? null;
        $instance->approvalCode = $array['approvalCode'] ?? null;
        $instance->isCredit = $array['isCredit'] ?? null;
        $instance->originalTransactionCurrency = $array['originalTransactionCurrency'] ?? null;
        $instance->originalTransactionAmount = $array['originalTransactionAmount'] ?? null;
        $instance->cardTransactionCurrency = $array['cardTransactionCurrency'] ?? null;
        $instance->cardTransactionAmount = $array['cardTransactionAmount'] ?? null;
        $instance->accountCurrency = $array['accountCurrency'] ?? null;
        $instance->billAccountAmount = $array['billAccountAmount'] ?? null;
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

    public function getTransactionId(): ?string {
        return $this->transactionId;
    }

    public function setTransactionId(?string $transactionId): void {
        $this->transactionId = $transactionId;
    }

    public function getReferenceNumber(): ?string {
        return $this->referenceNumber;
    }

    public function setReferenceNumber(?string $referenceNumber): void {
        $this->referenceNumber = $referenceNumber;
    }

    public function getOccurDateTime(): ?string {
        return $this->occurDateTime;
    }

    public function setOccurDateTime(?string $occurDateTime): void {
        $this->occurDateTime = $occurDateTime;
    }

    public function getPostingDateTime(): ?string {
        return $this->postingDateTime;
    }

    public function setPostingDateTime(?string $postingDateTime): void {
        $this->postingDateTime = $postingDateTime;
    }

    public function getPostingSysTime(): ?string {
        return $this->postingSysTime;
    }

    public function setPostingSysTime(?string $postingSysTime): void {
        $this->postingSysTime = $postingSysTime;
    }

    public function getTransactionCode(): ?string {
        return $this->transactionCode;
    }

    public function setTransactionCode(?string $transactionCode): void {
        $this->transactionCode = $transactionCode;
    }

    public function getTransactionType(): ?string {
        return $this->transactionType;
    }

    public function setTransactionType(?string $transactionType): void {
        $this->transactionType = $transactionType;
    }

    public function getApprovalCode(): ?string {
        return $this->approvalCode;
    }

    public function setApprovalCode(?string $approvalCode): void {
        $this->approvalCode = $approvalCode;
    }

    public function getIsCredit(): ?string {
        return $this->isCredit;
    }

    public function setIsCredit(?string $isCredit): void {
        $this->isCredit = $isCredit;
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

    public function getAccountCurrency(): ?string {
        return $this->accountCurrency;
    }

    public function setAccountCurrency(?string $accountCurrency): void {
        $this->accountCurrency = $accountCurrency;
    }

    public function getBillAccountAmount(): ?float {
        return $this->billAccountAmount;
    }

    public function setBillAccountAmount(?float $billAccountAmount): void {
        $this->billAccountAmount = $billAccountAmount;
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
