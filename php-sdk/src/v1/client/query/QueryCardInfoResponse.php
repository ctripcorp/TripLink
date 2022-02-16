<?php

namespace triplink\vcc\card\client\query;

/**
 * Created by PhpStorm.
 * User: wang.xiaoliang
 * Date: 2021/8/3
 * Time: 14:36
 */
class QueryCardInfoResponse
{
    /**
     * query result
     * PROCESS：处理中
     * SUCCEED：成功
     * FAILURE：失败
     * EXCEPTION：异常
     */
    var $resultStatus;
    /**
     * result code
     */
    var $resultRespCode;
    /**
     * result desc
     */
    var $resultRespMsg;
    /**
     * query request number
     */
    var $requestId;
    /**
     * query request time
     */
    var $requestTime;
    /**
     * query merchant name
     */
    var $merchantName;
    /**
     * channel type, TripLink distribution
     */
    var $channelType;
    /**
     * response extra info
     * json type
     * eg: {"BinFlagDcre":"12345"}
     */
    var $respExtra;

    /**
     * result of card info
     * class CardInfo
     */
    var $cardInfo;

    /**
     * @return mixed
     */
    public function getResultStatus()
    {
        return $this->resultStatus;
    }

    /**
     * @param mixed $resultStatus
     */
    public function setResultStatus($resultStatus): void
    {
        $this->resultStatus = $resultStatus;
    }

    /**
     * @return mixed
     */
    public function getResultRespCode()
    {
        return $this->resultRespCode;
    }

    /**
     * @param mixed $resultRespCode
     */
    public function setResultRespCode($resultRespCode): void
    {
        $this->resultRespCode = $resultRespCode;
    }

    /**
     * @return mixed
     */
    public function getResultRespMsg()
    {
        return $this->resultRespMsg;
    }

    /**
     * @param mixed $resultRespMsg
     */
    public function setResultRespMsg($resultRespMsg): void
    {
        $this->resultRespMsg = $resultRespMsg;
    }

    /**
     * @return mixed
     */
    public function getRequestId()
    {
        return $this->requestId;
    }

    /**
     * @param mixed $requestId
     */
    public function setRequestId($requestId): void
    {
        $this->requestId = $requestId;
    }

    /**
     * @return mixed
     */
    public function getRequestTime()
    {
        return $this->requestTime;
    }

    /**
     * @param mixed $requestTime
     */
    public function setRequestTime($requestTime): void
    {
        $this->requestTime = $requestTime;
    }

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
    public function getChannelType()
    {
        return $this->channelType;
    }

    /**
     * @param mixed $channelType
     */
    public function setChannelType($channelType): void
    {
        $this->channelType = $channelType;
    }

    /**
     * @return mixed
     */
    public function getRespExtra()
    {
        return $this->respExtra;
    }

    /**
     * @param mixed $respExtra
     */
    public function setRespExtra($respExtra): void
    {
        $this->respExtra = $respExtra;
    }

    /**
     * @return mixed
     */
    public function getCardInfo()
    {
        return $this->cardInfo;
    }

    /**
     * @param mixed $cardInfo
     */
    public function setCardInfo($cardInfo): void
    {
        $this->cardInfo = $cardInfo;
    }


}

?>