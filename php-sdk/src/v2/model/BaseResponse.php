<?php declare(strict_types=1);

namespace v2\model;

abstract class BaseResponse {
    /**
     * 结果码
     * @var string result code
     */
    protected $returnCode;
    /**
     * 结果码描述
     * @var string result code description
     */
    protected $errorMessage;

    public function __construct(string $returnCode, string $errorMessage) {
        $this->returnCode = $returnCode;
        $this->errorMessage = $errorMessage;
    }

    public function getReturnCode(): string {
        return $this->returnCode;
    }

    public function setReturnCode(string $returnCode): void {
        $this->returnCode = $returnCode;
    }

    public function getErrorMessage(): string {
        return $this->errorMessage;
    }

    public function setErrorMessage(string $errorMessage): void {
        $this->errorMessage = $errorMessage;
    }
}