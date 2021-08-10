<?php
/**
 * Created by PhpStorm.
 * User: wang.xiaoliang
 * Date: 2021/8/4
 * Time: 14:35
 */

namespace triplink\vcc\card\client\query;

class TransMerchantInfo
{
    /**
     * 商户名称
     */
    var $merchantName;

    /**
     * 商户MCC
     */
    var $merchantCategoryCode;

    /**
     * 商户所在国家码
     */
    var $merchantCountryCode;

    /**
     * 商户所在国家城市
     */
    var $merchantCity;

    /**
     * 商户所在国家城市区域
     */
    var $merchantState;

    /**
     * 商户所在国家邮编
     */
    var $merchantZipCode;

    /**
     * 商户描述
     */
    var $merchantDesc;

    /**
     * @return mixed
     */
    public function getMerchantName()
    {
        return $this->merchantName;
    }

    /**
     * @param mixed $merchantName
     */
    public function setMerchantName($merchantName): void
    {
        $this->merchantName = $merchantName;
    }

    /**
     * @return mixed
     */
    public function getMerchantCategoryCode()
    {
        return $this->merchantCategoryCode;
    }

    /**
     * @param mixed $merchantCategoryCode
     */
    public function setMerchantCategoryCode($merchantCategoryCode): void
    {
        $this->merchantCategoryCode = $merchantCategoryCode;
    }

    /**
     * @return mixed
     */
    public function getMerchantCountryCode()
    {
        return $this->merchantCountryCode;
    }

    /**
     * @param mixed $merchantCountryCode
     */
    public function setMerchantCountryCode($merchantCountryCode): void
    {
        $this->merchantCountryCode = $merchantCountryCode;
    }

    /**
     * @return mixed
     */
    public function getMerchantCity()
    {
        return $this->merchantCity;
    }

    /**
     * @param mixed $merchantCity
     */
    public function setMerchantCity($merchantCity): void
    {
        $this->merchantCity = $merchantCity;
    }

    /**
     * @return mixed
     */
    public function getMerchantState()
    {
        return $this->merchantState;
    }

    /**
     * @param mixed $merchantState
     */
    public function setMerchantState($merchantState): void
    {
        $this->merchantState = $merchantState;
    }

    /**
     * @return mixed
     */
    public function getMerchantZipCode()
    {
        return $this->merchantZipCode;
    }

    /**
     * @param mixed $merchantZipCode
     */
    public function setMerchantZipCode($merchantZipCode): void
    {
        $this->merchantZipCode = $merchantZipCode;
    }

    /**
     * @return mixed
     */
    public function getMerchantDesc()
    {
        return $this->merchantDesc;
    }

    /**
     * @param mixed $merchantDesc
     */
    public function setMerchantDesc($merchantDesc): void
    {
        $this->merchantDesc = $merchantDesc;
    }


}

?>