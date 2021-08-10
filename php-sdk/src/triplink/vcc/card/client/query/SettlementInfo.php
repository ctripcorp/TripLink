<?php
/**
 * Created by PhpStorm.
 * User: wang.xiaoliang
 * Date: 2021/8/5
 * Time: 13:58
 */
namespace triplink\vcc\card\client\query;

class SettlementInfo
{
    /**
     * 交易发生时间
     */
    var $occurTime;

    /**
     * 入账日期
     */
    var $postDate;

    /**
     * 出账日期
     */
    var $settleDate;

    /**
     * 交易币种
     */
    var $transCurrency;

    /**
     * 交易金额
     */
    var $transAmt;

    /**
     * 卡币种
     */
    var $localCurrency;

    /**
     * 卡本币种交易金额
     */
    var $localCurrencyAmt;

    /**
     * 入账币种
     */
    var $billCurrency;

    /**
     * 入账币种对应金额
     */
    var $billCurrencyAmt;

    /**
     * 入账原金额
     */
    var $originalBillCurrencyAmt;

    /**
     * 交易类型
     */
    var $transType;

    /**
     * 交易类型码
     */
    var $transCode;

    /**
     * 授权码
     */
    var $authNo;

    /**
     * 交易流水号
     */
    var $transNo;

    /**
     * 是否是收或付标识
     */
    var $isCredit;

    /**
     * 扣款商户信息
     */
    var $transMerchantInfo;

    /**
     * 用于今后的扩展
     */
    var $transExtra;

    /**
     * @return mixed
     */
    public function getOccurTime()
    {
        return $this->occurTime;
    }

    /**
     * @param mixed $occurTime
     */
    public function setOccurTime($occurTime): void
    {
        $this->occurTime = $occurTime;
    }

    /**
     * @return mixed
     */
    public function getPostDate()
    {
        return $this->postDate;
    }

    /**
     * @param mixed $postDate
     */
    public function setPostDate($postDate): void
    {
        $this->postDate = $postDate;
    }

    /**
     * @return mixed
     */
    public function getSettleDate()
    {
        return $this->settleDate;
    }

    /**
     * @param mixed $settleDate
     */
    public function setSettleDate($settleDate): void
    {
        $this->settleDate = $settleDate;
    }

    /**
     * @return mixed
     */
    public function getTransCurrency()
    {
        return $this->transCurrency;
    }

    /**
     * @param mixed $transCurrency
     */
    public function setTransCurrency($transCurrency): void
    {
        $this->transCurrency = $transCurrency;
    }

    /**
     * @return mixed
     */
    public function getTransAmt()
    {
        return $this->transAmt;
    }

    /**
     * @param mixed $transAmt
     */
    public function setTransAmt($transAmt): void
    {
        $this->transAmt = $transAmt;
    }

    /**
     * @return mixed
     */
    public function getLocalCurrency()
    {
        return $this->localCurrency;
    }

    /**
     * @param mixed $localCurrency
     */
    public function setLocalCurrency($localCurrency): void
    {
        $this->localCurrency = $localCurrency;
    }

    /**
     * @return mixed
     */
    public function getLocalCurrencyAmt()
    {
        return $this->localCurrencyAmt;
    }

    /**
     * @param mixed $localCurrencyAmt
     */
    public function setLocalCurrencyAmt($localCurrencyAmt): void
    {
        $this->localCurrencyAmt = $localCurrencyAmt;
    }

    /**
     * @return mixed
     */
    public function getBillCurrency()
    {
        return $this->billCurrency;
    }

    /**
     * @param mixed $billCurrency
     */
    public function setBillCurrency($billCurrency): void
    {
        $this->billCurrency = $billCurrency;
    }

    /**
     * @return mixed
     */
    public function getBillCurrencyAmt()
    {
        return $this->billCurrencyAmt;
    }

    /**
     * @param mixed $billCurrencyAmt
     */
    public function setBillCurrencyAmt($billCurrencyAmt): void
    {
        $this->billCurrencyAmt = $billCurrencyAmt;
    }

    /**
     * @return mixed
     */
    public function getOriginalBillCurrencyAmt()
    {
        return $this->originalBillCurrencyAmt;
    }

    /**
     * @param mixed $originalBillCurrencyAmt
     */
    public function setOriginalBillCurrencyAmt($originalBillCurrencyAmt): void
    {
        $this->originalBillCurrencyAmt = $originalBillCurrencyAmt;
    }

    /**
     * @return mixed
     */
    public function getTransType()
    {
        return $this->transType;
    }

    /**
     * @param mixed $transType
     */
    public function setTransType($transType): void
    {
        $this->transType = $transType;
    }

    /**
     * @return mixed
     */
    public function getTransCode()
    {
        return $this->transCode;
    }

    /**
     * @param mixed $transCode
     */
    public function setTransCode($transCode): void
    {
        $this->transCode = $transCode;
    }

    /**
     * @return mixed
     */
    public function getAuthNo()
    {
        return $this->authNo;
    }

    /**
     * @param mixed $authNo
     */
    public function setAuthNo($authNo): void
    {
        $this->authNo = $authNo;
    }

    /**
     * @return mixed
     */
    public function getTransNo()
    {
        return $this->transNo;
    }

    /**
     * @param mixed $transNo
     */
    public function setTransNo($transNo): void
    {
        $this->transNo = $transNo;
    }

    /**
     * @return mixed
     */
    public function getisCredit()
    {
        return $this->isCredit;
    }

    /**
     * @param mixed $isCredit
     */
    public function setIsCredit($isCredit): void
    {
        $this->isCredit = $isCredit;
    }

    /**
     * @return mixed
     */
    public function getTransMerchantInfo()
    {
        return $this->transMerchantInfo;
    }

    /**
     * @param mixed $transMerchantInfo
     */
    public function setTransMerchantInfo($transMerchantInfo): void
    {
        $this->transMerchantInfo = $transMerchantInfo;
    }

    /**
     * @return mixed
     */
    public function getTransExtra()
    {
        return $this->transExtra;
    }

    /**
     * @param mixed $transExtra
     */
    public function setTransExtra($transExtra): void
    {
        $this->transExtra = $transExtra;
    }


}

?>