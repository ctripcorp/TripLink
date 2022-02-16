<?php declare(strict_types=1);

namespace v2\model\core;

use JsonSerializable;

class UserReference implements JsonSerializable {
    /**
     * @var string|null useRef1Txt
     */
    private $useRef1Txt = null;
    /**
     * @var string|null useRef2Txt
     */
    private $useRef2Txt = null;
    /**
     * @var string|null useRef3Txt
     */
    private $useRef3Txt = null;
    /**
     * @var string|null useRef4Txt
     */
    private $useRef4Txt = null;
    /**
     * @var string|null useRef5Txt
     */
    private $useRef5Txt = null;
    /**
     * @var string|null useRef6Txt
     */
    private $useRef6Txt = null;
    /**
     * @var string|null useRef7Txt
     */
    private $useRef7Txt = null;
    /**
     * @var string|null useRef8Txt
     */
    private $useRef8Txt = null;
    /**
     * @var string|null useRef9Txt
     */
    private $useRef9Txt = null;
    /**
     * @var string|null useRef10Txt
     */
    private $useRef10Txt = null;
    /**
     * @var string|null useRef11Txt
     */
    private $useRef11Txt = null;
    /**
     * @var string|null useRef12Txt
     */
    private $useRef12Txt = null;
    /**
     * @var string|null useRef13Txt
     */
    private $useRef13Txt = null;
    /**
     * @var string|null useRef14Txt
     */
    private $useRef14Txt = null;
    /**
     * @var string|null useRef15Txt
     */
    private $useRef15Txt = null;
    /**
     * @var string|null useRef16Txt
     */
    private $useRef16Txt = null;
    /**
     * @var string|null useRef17Txt
     */
    private $useRef17Txt = null;
    /**
     * @var string|null useRef18Txt
     */
    private $useRef18Txt = null;
    /**
     * @var string|null useRef19Txt
     */
    private $useRef19Txt = null;
    /**
     * @var string|null useRef20Txt
     */
    private $useRef20Txt = null;

    public static function fromArray(array $array): self {
        $instance = new self();
        $instance->setUseRef1Txt($array['useRef1Txt'] ?? null);
        $instance->setUseRef2Txt($array['useRef2Txt'] ?? null);
        $instance->setUseRef3Txt($array['useRef3Txt'] ?? null);
        $instance->setUseRef4Txt($array['useRef4Txt'] ?? null);
        $instance->setUseRef5Txt($array['useRef5Txt'] ?? null);
        $instance->setUseRef6Txt($array['useRef6Txt'] ?? null);
        $instance->setUseRef7Txt($array['useRef7Txt'] ?? null);
        $instance->setUseRef8Txt($array['useRef8Txt'] ?? null);
        $instance->setUseRef9Txt($array['useRef9Txt'] ?? null);
        $instance->setUseRef10Txt($array['useRef10Txt'] ?? null);
        $instance->setUseRef11Txt($array['useRef11Txt'] ?? null);
        $instance->setUseRef12Txt($array['useRef12Txt'] ?? null);
        $instance->setUseRef13Txt($array['useRef13Txt'] ?? null);
        $instance->setUseRef14Txt($array['useRef14Txt'] ?? null);
        $instance->setUseRef15Txt($array['useRef15Txt'] ?? null);
        $instance->setUseRef16Txt($array['useRef16Txt'] ?? null);
        $instance->setUseRef17Txt($array['useRef17Txt'] ?? null);
        $instance->setUseRef18Txt($array['useRef18Txt'] ?? null);
        $instance->setUseRef19Txt($array['useRef19Txt'] ?? null);
        $instance->setUseRef20Txt($array['useRef20Txt'] ?? null);
        return $instance;
    }

    public function getUseRef1Txt(): ?string {
        return $this->useRef1Txt;
    }

    public function setUseRef1Txt(?string $useRef1Txt): void {
        $this->useRef1Txt = $useRef1Txt;
    }

    public function getUseRef2Txt(): ?string {
        return $this->useRef2Txt;
    }

    public function setUseRef2Txt(?string $useRef2Txt): void {
        $this->useRef2Txt = $useRef2Txt;
    }

    public function getUseRef3Txt(): ?string {
        return $this->useRef3Txt;
    }

    public function setUseRef3Txt(?string $useRef3Txt): void {
        $this->useRef3Txt = $useRef3Txt;
    }

    public function getUseRef4Txt(): ?string {
        return $this->useRef4Txt;
    }

    public function setUseRef4Txt(?string $useRef4Txt): void {
        $this->useRef4Txt = $useRef4Txt;
    }

    public function getUseRef5Txt(): ?string {
        return $this->useRef5Txt;
    }

    public function setUseRef5Txt(?string $useRef5Txt): void {
        $this->useRef5Txt = $useRef5Txt;
    }

    public function getUseRef6Txt(): ?string {
        return $this->useRef6Txt;
    }

    public function setUseRef6Txt(?string $useRef6Txt): void {
        $this->useRef6Txt = $useRef6Txt;
    }

    public function getUseRef7Txt(): ?string {
        return $this->useRef7Txt;
    }

    public function setUseRef7Txt(?string $useRef7Txt): void {
        $this->useRef7Txt = $useRef7Txt;
    }

    public function getUseRef8Txt(): ?string {
        return $this->useRef8Txt;
    }

    public function setUseRef8Txt(?string $useRef8Txt): void {
        $this->useRef8Txt = $useRef8Txt;
    }

    public function getUseRef9Txt(): ?string {
        return $this->useRef9Txt;
    }

    public function setUseRef9Txt(?string $useRef9Txt): void {
        $this->useRef9Txt = $useRef9Txt;
    }

    public function getUseRef10Txt(): ?string {
        return $this->useRef10Txt;
    }

    public function setUseRef10Txt(?string $useRef10Txt): void {
        $this->useRef10Txt = $useRef10Txt;
    }

    public function getUseRef11Txt(): ?string {
        return $this->useRef11Txt;
    }

    public function setUseRef11Txt(?string $useRef11Txt): void {
        $this->useRef11Txt = $useRef11Txt;
    }

    public function getUseRef12Txt(): ?string {
        return $this->useRef12Txt;
    }

    public function setUseRef12Txt(?string $useRef12Txt): void {
        $this->useRef12Txt = $useRef12Txt;
    }

    public function getUseRef13Txt(): ?string {
        return $this->useRef13Txt;
    }

    public function setUseRef13Txt(?string $useRef13Txt): void {
        $this->useRef13Txt = $useRef13Txt;
    }

    public function getUseRef14Txt(): ?string {
        return $this->useRef14Txt;
    }

    public function setUseRef14Txt(?string $useRef14Txt): void {
        $this->useRef14Txt = $useRef14Txt;
    }

    public function getUseRef15Txt(): ?string {
        return $this->useRef15Txt;
    }

    public function setUseRef15Txt(?string $useRef15Txt): void {
        $this->useRef15Txt = $useRef15Txt;
    }

    public function getUseRef16Txt(): ?string {
        return $this->useRef16Txt;
    }

    public function setUseRef16Txt(?string $useRef16Txt): void {
        $this->useRef16Txt = $useRef16Txt;
    }

    public function getUseRef17Txt(): ?string {
        return $this->useRef17Txt;
    }

    public function setUseRef17Txt(?string $useRef17Txt): void {
        $this->useRef17Txt = $useRef17Txt;
    }

    public function getUseRef18Txt(): ?string {
        return $this->useRef18Txt;
    }

    public function setUseRef18Txt(?string $useRef18Txt): void {
        $this->useRef18Txt = $useRef18Txt;
    }

    public function getUseRef19Txt(): ?string {
        return $this->useRef19Txt;
    }

    public function setUseRef19Txt(?string $useRef19Txt): void {
        $this->useRef19Txt = $useRef19Txt;
    }

    public function getUseRef20Txt(): ?string {
        return $this->useRef20Txt;
    }

    public function setUseRef20Txt(?string $useRef20Txt): void {
        $this->useRef20Txt = $useRef20Txt;
    }

    public function jsonSerialize(): object {
        return (object)array_filter(get_object_vars($this), function ($value) {
            return $value !== null;
        });
    }
}