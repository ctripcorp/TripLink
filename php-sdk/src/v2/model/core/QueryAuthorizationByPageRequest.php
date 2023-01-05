<?php declare(strict_types=1);

namespace v2\model\core;

use JsonSerializable;
use v2\model\BaseRequest;

class QueryAuthorizationByPageRequest extends BaseRequest implements JsonSerializable {
    /**
     * 卡ID
     * @var string card ID
     */
    private $cardLogId;
    /**
     * 订单号
     * @var string|null order number
     */
    private $orderNo = null;
    /**
     * 交易状态
     * @var string|null transaction status
     */
    private $transactionStatus = null;
    /**
     * 交易类型
     * @var string|null transaction code
     */
    private $transactionCode = null;
    /**
     * 交易起始时间
     * @var string|null transaction start time
     */
    private $transactionStartTime = null;
    /**
     * 交易截止时间
     * @var string|null transaction end time
     */
    private $transactionEndTime = null;
    /**
     * 页码
     * @var int|null page number
     */
    private $pageNo = null;
    /**
     * 页大小
     * @var int|null page size
     */
    private $pageSize = null;

    public function getCardLogId(): string {
        return $this->cardLogId;
    }

    public function setCardLogId(string $cardLogId): void {
        $this->cardLogId = $cardLogId;
    }

    public function getOrderNo(): ?string {
        return $this->orderNo;
    }

    public function setOrderNo(?string $orderNo): void {
        $this->orderNo = $orderNo;
    }

    public function getTransactionStatus(): ?string {
        return $this->transactionStatus;
    }

    public function setTransactionStatus(?string $transactionStatus): void {
        $this->transactionStatus = $transactionStatus;
    }

    public function getTransactionCode(): ?string {
        return $this->transactionCode;
    }

    public function setTransactionCode(?string $transactionCode): void {
        $this->transactionCode = $transactionCode;
    }

    public function getTransactionStartTime(): ?string {
        return $this->transactionStartTime;
    }

    public function setTransactionStartTime(?string $transactionStartTime): void {
        $this->transactionStartTime = $transactionStartTime;
    }

    public function getTransactionEndTime(): ?string {
        return $this->transactionEndTime;
    }

    public function setTransactionEndTime(?string $transactionEndTime): void {
        $this->transactionEndTime = $transactionEndTime;
    }

    public function getPageNo(): ?int {
        return $this->pageNo;
    }

    public function setPageNo(?int $pageNo): void {
        $this->pageNo = $pageNo;
    }

    public function getPageSize(): ?int {
        return $this->pageSize;
    }

    public function setPageSize(?int $pageSize): void {
        $this->pageSize = $pageSize;
    }

    public function jsonSerialize(): object {
        return (object)array_filter(get_object_vars($this), function ($value) {
            return $value !== null;
        });
    }
}
