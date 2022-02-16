<?php
namespace triplink\vcc\card\client\operate;
/**
 * Created by PhpStorm.
 * User: wang.xiaoliang
 * Date: 2021/7/29
 * Time: 17:09
 */
class CloseCardResponse
{
    /**
     * create result
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
     * channel type, TripLink distribution
     */
    var $channelType;
    /**
     * TripLink ccOpId
     */
    var $ccOpId;
    /**
     * update request number
     */
    var $requestId;
    /**
     * update request time
     */
    var $requestTime;
    /**
     * update merchant name
     */
    var $merchantName;
    /**
     * response extra info
     * json type
     * eg: {"BinFlagDcre":"12345"}
     */
    var $respExtra;

    /**
     * TripLink unique reference number
     */
    var $cardLogId;

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
    public function getCcOpId()
    {
        return $this->ccOpId;
    }

    /**
     * @param mixed $ccOpId
     */
    public function setCcOpId($ccOpId): void
    {
        $this->ccOpId = $ccOpId;
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


}

?>