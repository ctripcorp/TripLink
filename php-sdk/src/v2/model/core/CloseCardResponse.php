<?php declare(strict_types=1);

namespace v2\model\core;

use JsonSerializable;
use v2\model\BaseResponse;

class CloseCardResponse extends BaseResponse implements JsonSerializable {

    public static function fromArray(array $array): self {
        return new self($array['returnCode'], $array['errorMessage']);
    }

    public function jsonSerialize(): object {
        return (object)array_filter(get_object_vars($this), function ($value) {
            return $value !== null;
        });
    }
}