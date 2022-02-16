<?php declare(strict_types=1);

namespace v2\model\core;

use JsonSerializable;
use v2\model\BaseRequest;

class QuerySettlementRequest extends BaseRequest implements JsonSerializable {
    /**
     * 卡ID
     * @var string card ID
     */
    private $cardLogId;
    /**
     * 起始日期
     * @var string start date
     */
    private $startTime;
    /**
     * 截止日期
     * @var string end date
     */
    private $endTime;

    public function getCardLogId(): string {
        return $this->cardLogId;
    }

    public function setCardLogId(string $cardLogId): void {
        $this->cardLogId = $cardLogId;
    }

    public function getStartTime(): string {
        return $this->startTime;
    }

    public function setStartTime(string $startTime): void {
        $this->startTime = $startTime;
    }

    public function getEndTime(): string {
        return $this->endTime;
    }

    public function setEndTime(string $endTime): void {
        $this->endTime = $endTime;
    }

    public function jsonSerialize(): object {
        return (object)array_filter(get_object_vars($this), function ($value) {
            return $value !== null;
        });
    }
}