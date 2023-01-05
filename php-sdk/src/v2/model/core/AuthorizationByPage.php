<?php declare(strict_types=1);

namespace v2\model\core;

use JsonSerializable;

class AuthorizationByPage implements JsonSerializable {
    /**
     * 交易唯一ID
     * @var string|null transaction id
     */
    private $requestId = null;
    /**
     * 卡ID
     * @var string|null card ID
     */
    private $cardLogId = null;
    /**
     * 交易关联ID
     * @var string|null transaction relation id
     */
    private $transactionId = null;
    /**
     * 订单号
     * @var string|null order number
     */
    private $orderNo = null;
    /**
     * 交易币种
     * @var string|null transaction currency
     */
    private $transactionCurrencyCode = null;
    /**
     * 交易金额
     * @var float|null transaction amount
     */
    private $transactionAmount = null;
    /**
     * 卡币种
     * @var string|null card currency
     */
    private $cardCurrencyCode = null;
    /**
     * 卡交易金额
     * @var float|null card transaction amount
     */
    private $cardTransactionAmount = null;
    /**
     * 交易响应码
     * @var string|null response code
     */
    private $responseCode = null;
    /**
     * 交易响应码描述
     * @var string|null response code description
     */
    private $responseDescription = null;
    /**
     * 授权码
     * @var string|null approval code
     */
    private $approvalCode = null;
    /**
     * 交易类型
     * @var string|null transaction type
     */
    private $transactionCode = null;
    /**
     * 交易发生时间
     * @var string|null transaction time
     */
    private $transactionDate = null;
    /**
     * 商户名称
     * @var string|null merchant name
     */
    private $merchantName = null;
    /**
     * 商户MCC
     * @var string|null merchant MCC
     */
    private $mcc = null;
    /**
     * 商户所在国家
     * @var string|null merchant country
     */
    private $merchantCountry = null;
    /**
     * 商户所在城市
     * @var string|null merchant city
     */
    private $merchantCity = null;
    /**
     * 商户ID
     * @var string|null merchant ID
     */
    private $merchantId = null;
    /**
     * 收单行ID
     * @var string|null acquirer ID
     */
    private $acquiringBankId = null;
    /**
     * 卡期初金额
     * @var float|null card beginning amount
     */
    private $cardInitialBalance = null;
    /**
     * 卡期末金额
     * @var float|null card ending amount
     */
    private $cardEndingBalance = null;
    /**
     * 借贷记
     * @var string|null debit or credit
     */
    private $creditTransactionSign = null;
    /**
     * 冲正类型
     * @var string|null reversal type
     */
    private $reversalType = null;

    public static function fromArray(array $array): self {
        $instance = new self();
        $instance->requestId = $array['requestId'] ?? null;
        $instance->cardLogId = $array['cardLogId'] ?? null;
        $instance->transactionId = $array['transactionId'] ?? null;
        $instance->orderNo = $array['orderNo'] ?? null;
        $instance->transactionCurrencyCode = $array['transactionCurrencyCode'] ?? null;
        $instance->transactionAmount = $array['transactionAmount'] ?? null;
        $instance->cardCurrencyCode = $array['cardCurrencyCode'] ?? null;
        $instance->cardTransactionAmount = $array['cardTransactionAmount'] ?? null;
        $instance->responseCode = $array['responseCode'] ?? null;
        $instance->responseDescription = $array['responseDescription'] ?? null;
        $instance->approvalCode = $array['approvalCode'] ?? null;
        $instance->transactionCode = $array['transactionCode'] ?? null;
        $instance->transactionDate = $array['transactionDate'] ?? null;
        $instance->merchantName = $array['merchantName'] ?? null;
        $instance->mcc = $array['mcc'] ?? null;
        $instance->merchantCountry = $array['merchantCountry'] ?? null;
        $instance->merchantCity = $array['merchantCity'] ?? null;
        $instance->merchantId = $array['merchantId'] ?? null;
        $instance->acquiringBankId = $array['acquiringBankId'] ?? null;
        $instance->cardInitialBalance = $array['cardInitialBalance'] ?? null;
        $instance->cardEndingBalance = $array['cardEndingBalance'] ?? null;
        $instance->creditTransactionSign = $array['creditTransactionSign'] ?? null;
        $instance->reversalType = $array['reversalType'] ?? null;
        return $instance;
    }

    public function getRequestId(): ?string {
        return $this->requestId;
    }

    public function setRequestId(?string $requestId): void {
        $this->requestId = $requestId;
    }

    public function getCardLogId(): ?string {
        return $this->cardLogId;
    }

    public function setCardLogId(?string $cardLogId): void {
        $this->cardLogId = $cardLogId;
    }

    public function getTransactionId(): ?string {
        return $this->transactionId;
    }

    public function setTransactionId(?string $transactionId): void {
        $this->transactionId = $transactionId;
    }

    public function getOrderNo(): ?string {
        return $this->orderNo;
    }

    public function setOrderNo(?string $orderNo): void {
        $this->orderNo = $orderNo;
    }

    public function getTransactionCurrencyCode(): ?string {
        return $this->transactionCurrencyCode;
    }

    public function setTransactionCurrencyCode(?string $transactionCurrencyCode): void {
        $this->transactionCurrencyCode = $transactionCurrencyCode;
    }

    public function getTransactionAmount(): ?float {
        return $this->transactionAmount;
    }

    public function setTransactionAmount(?float $transactionAmount): void {
        $this->transactionAmount = $transactionAmount;
    }

    public function getCardCurrencyCode(): ?string {
        return $this->cardCurrencyCode;
    }

    public function setCardCurrencyCode(?string $cardCurrencyCode): void {
        $this->cardCurrencyCode = $cardCurrencyCode;
    }

    public function getCardTransactionAmount(): ?float {
        return $this->cardTransactionAmount;
    }

    public function setCardTransactionAmount(?float $cardTransactionAmount): void {
        $this->cardTransactionAmount = $cardTransactionAmount;
    }

    public function getResponseCode(): ?string {
        return $this->responseCode;
    }

    public function setResponseCode(?string $responseCode): void {
        $this->responseCode = $responseCode;
    }

    public function getResponseDescription(): ?string {
        return $this->responseDescription;
    }

    public function setResponseDescription(?string $responseDescription): void {
        $this->responseDescription = $responseDescription;
    }

    public function getApprovalCode(): ?string {
        return $this->approvalCode;
    }

    public function setApprovalCode(?string $approvalCode): void {
        $this->approvalCode = $approvalCode;
    }

    public function getTransactionCode(): ?string {
        return $this->transactionCode;
    }

    public function setTransactionCode(?string $transactionCode): void {
        $this->transactionCode = $transactionCode;
    }

    public function getTransactionDate(): ?string {
        return $this->transactionDate;
    }

    public function setTransactionDate(?string $transactionDate): void {
        $this->transactionDate = $transactionDate;
    }

    public function getMerchantName(): ?string {
        return $this->merchantName;
    }

    public function setMerchantName(?string $merchantName): void {
        $this->merchantName = $merchantName;
    }

    public function getMcc(): ?string {
        return $this->mcc;
    }

    public function setMcc(?string $mcc): void {
        $this->mcc = $mcc;
    }

    public function getMerchantCountry(): ?string {
        return $this->merchantCountry;
    }

    public function setMerchantCountry(?string $merchantCountry): void {
        $this->merchantCountry = $merchantCountry;
    }

    public function getMerchantCity(): ?string {
        return $this->merchantCity;
    }

    public function setMerchantCity(?string $merchantCity): void {
        $this->merchantCity = $merchantCity;
    }

    public function getMerchantId(): ?string {
        return $this->merchantId;
    }

    public function setMerchantId(?string $merchantId): void {
        $this->merchantId = $merchantId;
    }

    public function getAcquiringBankId(): ?string {
        return $this->acquiringBankId;
    }

    public function setAcquiringBankId(?string $acquiringBankId): void {
        $this->acquiringBankId = $acquiringBankId;
    }

    public function getCardInitialBalance(): ?float {
        return $this->cardInitialBalance;
    }

    public function setCardInitialBalance(?float $cardInitialBalance): void {
        $this->cardInitialBalance = $cardInitialBalance;
    }

    public function getCardEndingBalance(): ?float {
        return $this->cardEndingBalance;
    }

    public function setCardEndingBalance(?float $cardEndingBalance): void {
        $this->cardEndingBalance = $cardEndingBalance;
    }

    public function getCreditTransactionSign(): ?string {
        return $this->creditTransactionSign;
    }

    public function setCreditTransactionSign(?string $creditTransactionSign): void {
        $this->creditTransactionSign = $creditTransactionSign;
    }

    public function getReversalType(): ?string {
        return $this->reversalType;
    }

    public function setReversalType(?string $reversalType): void {
        $this->reversalType = $reversalType;
    }

    public function jsonSerialize(): object {
        return (object)array_filter(get_object_vars($this), function ($value) {
            return $value !== null;
        });
    }
}
