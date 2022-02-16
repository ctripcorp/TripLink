<?php

namespace triplink\vcc\card\client\operate;

class UpdateCardInfo
{
    /**
     * VCC发行卡片处唯一参考号
     */
    var $cardLogId;
    /**
     * 卡生效日期 <yyyy-MM-dd>
     */
    var $startActiveDate;
    /**
     * 最晚关卡日期 <yyyy-MM-dd>
     */
    var $endCloseDate;
    /**
     * 卡额度
     */
    var $creditLimitAmt;
    /**
     * 卡最低可扣款金额
     */
    var $minAuthAmt;
    /**
     * 卡最高可扣款金额
     */
    var $maxAuthAmt;
    /**
     * 自动关卡百分数设定
     * 取值范围：[1-100]%
     */
    var $closePercentage;
    /**
     * 商户控制方式
     * 枚举：0:指定商户号/4:指定商户mcc组名;
     */
    var $merchantControlMethod;
    /**
     * MCC类别
     */
    var $merchantCategoryName;
    /**
     * 商户号
     */
    var $merchantCode;
    /**
     * 是否支持3ds验证  0：不支持；1:支持<默认>
     */
    var $enable3DS;
    /**
     * 是否启用CVV检验    0：不开启<默认>；1:开启验证
     */
    var $enaleCVVCheck;
    /**
     * 是否启用交易币种限制
     * 0：不做交易币种限制<默认>/1：只允许开卡币种作为交易币种
     */
    var $enableCurrencyCheck;
    /**
     * 用户自定义信息
     * 按照TripLink约定传送数据，一般在交易账单中体现：
     * 如："userDefineInfo": "{"BookingNumber":"可填客户的订单号，该数据会在交易账单中提现"}"
     */
    var $userDefineInfo;

    /**
     * @return mixed
     */
    public function getCardLogId()
    {
        return $this->cardLogId;
    }

    /**
     * @param mixed $cardLogId
     */
    public function setCardLogId($cardLogId): void
    {
        $this->cardLogId = $cardLogId;
    }

    /**
     * @return mixed
     */
    public function getStartActiveDate()
    {
        return $this->startActiveDate;
    }

    /**
     * @param mixed $startActiveDate
     */
    public function setStartActiveDate($startActiveDate): void
    {
        $this->startActiveDate = $startActiveDate;
    }

    /**
     * @return mixed
     */
    public function getEndCloseDate()
    {
        return $this->endCloseDate;
    }

    /**
     * @param mixed $endCloseDate
     */
    public function setEndCloseDate($endCloseDate): void
    {
        $this->endCloseDate = $endCloseDate;
    }

    /**
     * @return mixed
     */
    public function getCreditLimitAmt()
    {
        return $this->creditLimitAmt;
    }

    /**
     * @param mixed $creditLimitAmt
     */
    public function setCreditLimitAmt($creditLimitAmt): void
    {
        $this->creditLimitAmt = $creditLimitAmt;
    }

    /**
     * @return mixed
     */
    public function getMinAuthAmt()
    {
        return $this->minAuthAmt;
    }

    /**
     * @param mixed $minAuthAmt
     */
    public function setMinAuthAmt($minAuthAmt): void
    {
        $this->minAuthAmt = $minAuthAmt;
    }

    /**
     * @return mixed
     */
    public function getMaxAuthAmt()
    {
        return $this->maxAuthAmt;
    }

    /**
     * @param mixed $maxAuthAmt
     */
    public function setMaxAuthAmt($maxAuthAmt): void
    {
        $this->maxAuthAmt = $maxAuthAmt;
    }

    /**
     * @return mixed
     */
    public function getClosePercentage()
    {
        return $this->closePercentage;
    }

    /**
     * @param mixed $closePercentage
     */
    public function setClosePercentage($closePercentage): void
    {
        $this->closePercentage = $closePercentage;
    }

    /**
     * @return mixed
     */
    public function getMerchantControlMethod()
    {
        return $this->merchantControlMethod;
    }

    /**
     * @param mixed $merchantControlMethod
     */
    public function setMerchantControlMethod($merchantControlMethod): void
    {
        $this->merchantControlMethod = $merchantControlMethod;
    }

    /**
     * @return mixed
     */
    public function getMerchantCategoryName()
    {
        return $this->merchantCategoryName;
    }

    /**
     * @param mixed $merchantCategoryName
     */
    public function setMerchantCategoryName($merchantCategoryName): void
    {
        $this->merchantCategoryName = $merchantCategoryName;
    }

    /**
     * @return mixed
     */
    public function getMerchantCode()
    {
        return $this->merchantCode;
    }

    /**
     * @param mixed $merchantCode
     */
    public function setMerchantCode($merchantCode): void
    {
        $this->merchantCode = $merchantCode;
    }

    /**
     * @return mixed
     */
    public function getEnable3DS()
    {
        return $this->enable3DS;
    }

    /**
     * @param mixed $enable3DS
     */
    public function setEnable3DS($enable3DS): void
    {
        $this->enable3DS = $enable3DS;
    }

    /**
     * @return mixed
     */
    public function getEnaleCVVCheck()
    {
        return $this->enaleCVVCheck;
    }

    /**
     * @param mixed $enaleCVVCheck
     */
    public function setEnaleCVVCheck($enaleCVVCheck): void
    {
        $this->enaleCVVCheck = $enaleCVVCheck;
    }

    /**
     * @return mixed
     */
    public function getEnableCurrencyCheck()
    {
        return $this->enableCurrencyCheck;
    }

    /**
     * @param mixed $enableCurrencyCheck
     */
    public function setEnableCurrencyCheck($enableCurrencyCheck): void
    {
        $this->enableCurrencyCheck = $enableCurrencyCheck;
    }

    /**
     * @return mixed
     */
    public function getUserDefineInfo()
    {
        return $this->userDefineInfo;
    }

    /**
     * @param mixed $userDefineInfo
     */
    public function setUserDefineInfo($userDefineInfo): void
    {
        $this->userDefineInfo = $userDefineInfo;
    }



}

?>