<?php declare(strict_types=1);

namespace v2\model\core;

use JsonSerializable;
use v2\model\BaseRequest;

class QueryCardRequest extends BaseRequest implements JsonSerializable {
    /**
     * 卡ID
     * @var string card ID
     */
    private $cardLogId;

    public function getCardLogId(): string {
        return $this->cardLogId;
    }

    public function setCardLogId(string $cardLogId): void {
        $this->cardLogId = $cardLogId;
    }

    public function jsonSerialize(): object {
        return (object)array_filter(get_object_vars($this), function ($value) {
            return $value !== null;
        });
    }
}