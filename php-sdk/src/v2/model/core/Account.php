<?php declare(strict_types=1);

namespace v2\model\core;

use JsonSerializable;

class Account implements JsonSerializable {
    /**
     * 账户类型
     * @var string|null account type
     */
    private $accountType = null;
    /**
     * 账户币种
     * @var string|null account currency
     */
    private $accountCurrency = null;
    /**
     * 账户额度
     * @var float|null account amount
     */
    private $accountAmount = null;
    /**
     * 剩余账户额度
     * @var float|null remain account amount
     */
    private $remainAccountAmount = null;

    public static function fromArray(array $array): self {
        $instance = new self();
        $instance->accountType = $array['accountType'] ?? null;
        $instance->accountCurrency = $array['accountCurrency'] ?? null;
        $instance->accountAmount = $array['accountAmount'] ?? null;
        $instance->remainAccountAmount = $array['remainAccountAmount'] ?? null;
        return $instance;
    }

    public function getAccountType(): ?string {
        return $this->accountType;
    }

    public function setAccountType(?string $accountType): void {
        $this->accountType = $accountType;
    }

    public function getAccountCurrency(): ?string {
        return $this->accountCurrency;
    }

    public function setAccountCurrency(?string $accountCurrency): void {
        $this->accountCurrency = $accountCurrency;
    }

    public function getAccountAmount(): ?float {
        return $this->accountAmount;
    }

    public function setAccountAmount(?float $accountAmount): void {
        $this->accountAmount = $accountAmount;
    }

    public function getRemainAccountAmount(): ?float {
        return $this->remainAccountAmount;
    }

    public function setRemainAccountAmount(?float $remainAccountAmount): void {
        $this->remainAccountAmount = $remainAccountAmount;
    }

    public function jsonSerialize(): object {
        return (object)array_filter(get_object_vars($this), function ($value) {
            return $value !== null;
        });
    }
}