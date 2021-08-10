<?php
/**
 * Created by PhpStorm.
 * User: wang.xiaoliang
 * Date: 2021/8/4
 * Time: 14:33
 */
namespace triplink\vcc\card\client\query;
class AuthInfo
{
    /**
     * 发生时间
     */
    var $occurTime;

    /**
     * 交易唯一号
     */
    var $transId;

    /**
     * 交易币种
     */
    var $transCurrency;

    /**
     * 交易币种金额
     */
    var $transCurrencyAmt;

    /**
     * 卡币种
     */
    var $localCurrency;

    /**
     * 卡本币种交易金额
     */
    var $localCurrencyAmt;

    /**
     * 交易响应码
     */
    var $respCode;

    /**
     * 交易响应码描述
     */
    var $respCodeDesc;

    /**
     * 授权码
     */
    var $approveCode;

    /**
     * 交易拒绝原因
     */
    var $declineReason;

    /**
     * 卡交易状态
     */
    var $status;

    /**
     * 交易地国家代码
     */
    var $countryCode;

    /**
     * 信息类型
     */
    var $messageType;

    /**
     * 信息类型描述
     */
    var $messageTypeDesc;

    /**
     * 扣款商户信息
     * 参考TransMerchantInfo
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
    public function getTransId()
    {
        return $this->transId;
    }

    /**
     * @param mixed $transId
     */
    public function setTransId($transId): void
    {
        $this->transId = $transId;
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
    public function getTransCurrencyAmt()
    {
        return $this->transCurrencyAmt;
    }

    /**
     * @param mixed $transCurrencyAmt
     */
    public function setTransCurrencyAmt($transCurrencyAmt): void
    {
        $this->transCurrencyAmt = $transCurrencyAmt;
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
    public function getRespCode()
    {
        return $this->respCode;
    }

    /**
     * @param mixed $respCode
     */
    public function setRespCode($respCode): void
    {
        $this->respCode = $respCode;
    }

    /**
     * @return mixed
     */
    public function getRespCodeDesc()
    {
        return $this->respCodeDesc;
    }

    /**
     * @param mixed $respCodeDesc
     */
    public function setRespCodeDesc($respCodeDesc): void
    {
        $this->respCodeDesc = $respCodeDesc;
    }

    /**
     * @return mixed
     */
    public function getApproveCode()
    {
        return $this->approveCode;
    }

    /**
     * @param mixed $approveCode
     */
    public function setApproveCode($approveCode): void
    {
        $this->approveCode = $approveCode;
    }

    /**
     * @return mixed
     */
    public function getDeclineReason()
    {
        return $this->declineReason;
    }

    /**
     * @param mixed $declineReason
     */
    public function setDeclineReason($declineReason): void
    {
        $this->declineReason = $declineReason;
    }

    /**
     * @return mixed
     */
    public function getStatus()
    {
        return $this->status;
    }

    /**
     * @param mixed $status
     */
    public function setStatus($status): void
    {
        $this->status = $status;
    }

    /**
     * @return mixed
     */
    public function getCountryCode()
    {
        return $this->countryCode;
    }

    /**
     * @param mixed $countryCode
     */
    public function setCountryCode($countryCode): void
    {
        $this->countryCode = $countryCode;
    }

    /**
     * @return mixed
     */
    public function getMessageType()
    {
        return $this->messageType;
    }

    /**
     * @param mixed $messageType
     */
    public function setMessageType($messageType): void
    {
        $this->messageType = $messageType;
    }

    /**
     * @return mixed
     */
    public function getMessageTypeDesc()
    {
        return $this->messageTypeDesc;
    }

    /**
     * @param mixed $messageTypeDesc
     */
    public function setMessageTypeDesc($messageTypeDesc): void
    {
        $this->messageTypeDesc = $messageTypeDesc;
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