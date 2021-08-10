<?php
namespace triplink\vcc\card\client;

class CardInfo {
    var $cardLogId;

    var $cardNo;
    
    var $cardVerifyNo;
    
    var $cardExpiryDate;
    
    var $cardFullExpiryDate;
    
    var $cardType;
    
    var $localCurrency;
    
    var $billCurrency;
    
    var $billCurrencyAmt;
    
    var $startActiveDate;
    
    var $endCloseDate;
    
    var $creditLimitAmt;
    
    var $minAuthAmt;
    
    var $maxAuthAmt;
    
    var $balanceAmt;
    
    var $totalAuthAmt;
    
    var $totalSettleAmt;
    
    var $totalRefundAmt;
    
    var $netSettleAmt;
    
    var $outStandingAuthAmt;
    
    var $enableMutilUse;
    
    var $closePercentage;
    
    var $merchantControlMethod;
    
    var $merchantCategoryName;
    
    var $merchantCode;
    
    var $enable3DS;
    
    var $enaleCVVCheck;
    
    var $enableCurrencyCheck;
    
    var $cardStatus;
    
    var $userDefineInfo;
    /**
     * @return the $cardLogId
     */
    public function getCardLogId()
    {
        return $this->cardLogId;
    }

    /**
     * @return the $cardNo
     */
    public function getCardNo()
    {
        return $this->cardNo;
    }

    /**
     * @return the $cardVerifyNo
     */
    public function getCardVerifyNo()
    {
        return $this->cardVerifyNo;
    }

    /**
     * @return the $cardExpiryDate
     */
    public function getCardExpiryDate()
    {
        return $this->cardExpiryDate;
    }

    /**
     * @return the $cardFullExpiryDate
     */
    public function getCardFullExpiryDate()
    {
        return $this->cardFullExpiryDate;
    }

    /**
     * @return the $cardType
     */
    public function getCardType()
    {
        return $this->cardType;
    }

    /**
     * @return the $localCurrency
     */
    public function getLocalCurrency()
    {
        return $this->localCurrency;
    }

    /**
     * @return the $billCurrency
     */
    public function getBillCurrency()
    {
        return $this->billCurrency;
    }

    /**
     * @return the $billCurrencyAmt
     */
    public function getBillCurrencyAmt()
    {
        return $this->billCurrencyAmt;
    }

    /**
     * @return the $startActiveDate
     */
    public function getStartActiveDate()
    {
        return $this->startActiveDate;
    }

    /**
     * @return the $endCloseDate
     */
    public function getEndCloseDate()
    {
        return $this->endCloseDate;
    }

    /**
     * @return the $creditLimitAmt
     */
    public function getCreditLimitAmt()
    {
        return $this->creditLimitAmt;
    }

    /**
     * @return the $minAuthAmt
     */
    public function getMinAuthAmt()
    {
        return $this->minAuthAmt;
    }

    /**
     * @return the $maxAuthAmt
     */
    public function getMaxAuthAmt()
    {
        return $this->maxAuthAmt;
    }

    /**
     * @return the $balanceAmt
     */
    public function getBalanceAmt()
    {
        return $this->balanceAmt;
    }

    /**
     * @return the $totalAuthAmt
     */
    public function getTotalAuthAmt()
    {
        return $this->totalAuthAmt;
    }

    /**
     * @return the $totalSettleAmt
     */
    public function getTotalSettleAmt()
    {
        return $this->totalSettleAmt;
    }

    /**
     * @return the $totalRefundAmt
     */
    public function getTotalRefundAmt()
    {
        return $this->totalRefundAmt;
    }

    /**
     * @return the $netSettleAmt
     */
    public function getNetSettleAmt()
    {
        return $this->netSettleAmt;
    }

    /**
     * @return the $outStandingAuthAmt
     */
    public function getOutStandingAuthAmt()
    {
        return $this->outStandingAuthAmt;
    }

    /**
     * @return the $enableMutilUse
     */
    public function getEnableMutilUse()
    {
        return $this->enableMutilUse;
    }

    /**
     * @return the $closePercentage
     */
    public function getClosePercentage()
    {
        return $this->closePercentage;
    }

    /**
     * @return the $merchantControlMethod
     */
    public function getMerchantControlMethod()
    {
        return $this->merchantControlMethod;
    }

    /**
     * @return the $merchantCategoryName
     */
    public function getMerchantCategoryName()
    {
        return $this->merchantCategoryName;
    }

    /**
     * @return the $merchantCode
     */
    public function getMerchantCode()
    {
        return $this->merchantCode;
    }

    /**
     * @return the $enable3DS
     */
    public function getEnable3DS()
    {
        return $this->enable3DS;
    }

    /**
     * @return the $enaleCVVCheck
     */
    public function getEnaleCVVCheck()
    {
        return $this->enaleCVVCheck;
    }

    /**
     * @return the $enableCurrencyCheck
     */
    public function getEnableCurrencyCheck()
    {
        return $this->enableCurrencyCheck;
    }

    /**
     * @return the $cardStatus
     */
    public function getCardStatus()
    {
        return $this->cardStatus;
    }

    /**
     * @return the $userDefineInfo
     */
    public function getUserDefineInfo()
    {
        return $this->userDefineInfo;
    }

    /**
     * @param field_type $cardLogId
     */
    public function setCardLogId($cardLogId)
    {
        $this->cardLogId = $cardLogId;
    }

    /**
     * @param field_type $cardNo
     */
    public function setCardNo($cardNo)
    {
        $this->cardNo = $cardNo;
    }

    /**
     * @param field_type $cardVerifyNo
     */
    public function setCardVerifyNo($cardVerifyNo)
    {
        $this->cardVerifyNo = $cardVerifyNo;
    }

    /**
     * @param field_type $cardExpiryDate
     */
    public function setCardExpiryDate($cardExpiryDate)
    {
        $this->cardExpiryDate = $cardExpiryDate;
    }

    /**
     * @param field_type $cardFullExpiryDate
     */
    public function setCardFullExpiryDate($cardFullExpiryDate)
    {
        $this->cardFullExpiryDate = $cardFullExpiryDate;
    }

    /**
     * @param field_type $cardType
     */
    public function setCardType($cardType)
    {
        $this->cardType = $cardType;
    }

    /**
     * @param field_type $localCurrency
     */
    public function setLocalCurrency($localCurrency)
    {
        $this->localCurrency = $localCurrency;
    }

    /**
     * @param field_type $billCurrency
     */
    public function setBillCurrency($billCurrency)
    {
        $this->billCurrency = $billCurrency;
    }

    /**
     * @param field_type $billCurrencyAmt
     */
    public function setBillCurrencyAmt($billCurrencyAmt)
    {
        $this->billCurrencyAmt = $billCurrencyAmt;
    }

    /**
     * @param field_type $startActiveDate
     */
    public function setStartActiveDate($startActiveDate)
    {
        $this->startActiveDate = $startActiveDate;
    }

    /**
     * @param field_type $endCloseDate
     */
    public function setEndCloseDate($endCloseDate)
    {
        $this->endCloseDate = $endCloseDate;
    }

    /**
     * @param field_type $creditLimitAmt
     */
    public function setCreditLimitAmt($creditLimitAmt)
    {
        $this->creditLimitAmt = $creditLimitAmt;
    }

    /**
     * @param field_type $minAuthAmt
     */
    public function setMinAuthAmt($minAuthAmt)
    {
        $this->minAuthAmt = $minAuthAmt;
    }

    /**
     * @param field_type $maxAuthAmt
     */
    public function setMaxAuthAmt($maxAuthAmt)
    {
        $this->maxAuthAmt = $maxAuthAmt;
    }

    /**
     * @param field_type $balanceAmt
     */
    public function setBalanceAmt($balanceAmt)
    {
        $this->balanceAmt = $balanceAmt;
    }

    /**
     * @param field_type $totalAuthAmt
     */
    public function setTotalAuthAmt($totalAuthAmt)
    {
        $this->totalAuthAmt = $totalAuthAmt;
    }

    /**
     * @param field_type $totalSettleAmt
     */
    public function setTotalSettleAmt($totalSettleAmt)
    {
        $this->totalSettleAmt = $totalSettleAmt;
    }

    /**
     * @param field_type $totalRefundAmt
     */
    public function setTotalRefundAmt($totalRefundAmt)
    {
        $this->totalRefundAmt = $totalRefundAmt;
    }

    /**
     * @param field_type $netSettleAmt
     */
    public function setNetSettleAmt($netSettleAmt)
    {
        $this->netSettleAmt = $netSettleAmt;
    }

    /**
     * @param field_type $outStandingAuthAmt
     */
    public function setOutStandingAuthAmt($outStandingAuthAmt)
    {
        $this->outStandingAuthAmt = $outStandingAuthAmt;
    }

    /**
     * @param field_type $enableMutilUse
     */
    public function setEnableMutilUse($enableMutilUse)
    {
        $this->enableMutilUse = $enableMutilUse;
    }

    /**
     * @param field_type $closePercentage
     */
    public function setClosePercentage($closePercentage)
    {
        $this->closePercentage = $closePercentage;
    }

    /**
     * @param field_type $merchantControlMethod
     */
    public function setMerchantControlMethod($merchantControlMethod)
    {
        $this->merchantControlMethod = $merchantControlMethod;
    }

    /**
     * @param field_type $merchantCategoryName
     */
    public function setMerchantCategoryName($merchantCategoryName)
    {
        $this->merchantCategoryName = $merchantCategoryName;
    }

    /**
     * @param field_type $merchantCode
     */
    public function setMerchantCode($merchantCode)
    {
        $this->merchantCode = $merchantCode;
    }

    /**
     * @param field_type $enable3DS
     */
    public function setEnable3DS($enable3DS)
    {
        $this->enable3DS = $enable3DS;
    }

    /**
     * @param field_type $enaleCVVCheck
     */
    public function setEnaleCVVCheck($enaleCVVCheck)
    {
        $this->enaleCVVCheck = $enaleCVVCheck;
    }

    /**
     * @param field_type $enableCurrencyCheck
     */
    public function setEnableCurrencyCheck($enableCurrencyCheck)
    {
        $this->enableCurrencyCheck = $enableCurrencyCheck;
    }

    /**
     * @param field_type $cardStatus
     */
    public function setCardStatus($cardStatus)
    {
        $this->cardStatus = $cardStatus;
    }

    /**
     * @param field_type $userDefineInfo
     */
    public function setUserDefineInfo($userDefineInfo)
    {
        $this->userDefineInfo = $userDefineInfo;
    }

 
    
}
?>