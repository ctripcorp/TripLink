<?php
namespace triplink\vcc\card\client\operate;
class OperateResponse {

    var $resultstatus;

    var $resultRespCode;

    var $resultRespMsg;

    var $channelType;

    var $ccOpId;

    var $requestId;

    var $requestTime;

    var $requestType;

    var $subRequestType;

    var $merchantName;

    var $cardInfo;

    var $respExtra;
    /**
     * @return the $resultstatus
     */
    public function getResultstatus()
    {
        return $this->resultstatus;
    }

    /**
     * @return the $resultRespCode
     */
    public function getResultRespCode()
    {
        return $this->resultRespCode;
    }

    /**
     * @return the $resultRespMsg
     */
    public function getResultRespMsg()
    {
        return $this->resultRespMsg;
    }

    /**
     * @return the $channelType
     */
    public function getChannelType()
    {
        return $this->channelType;
    }

    /**
     * @return the $ccOpId
     */
    public function getCcOpId()
    {
        return $this->ccOpId;
    }

    /**
     * @return the $requestId
     */
    public function getRequestId()
    {
        return $this->requestId;
    }

    /**
     * @return the $requestTime
     */
    public function getRequestTime()
    {
        return $this->requestTime;
    }

    /**
     * @return the $requestType
     */
    public function getRequestType()
    {
        return $this->requestType;
    }

    /**
     * @return the $subRequestType
     */
    public function getSubRequestType()
    {
        return $this->subRequestType;
    }

    /**
     * @return the $merchantName
     */
    public function getMerchantName()
    {
        return $this->merchantName;
    }

    /**
     * @return the $cardInfo
     */
    public function getCardInfo()
    {
        return $this->cardInfo;
    }

    /**
     * @return the $respExtra
     */
    public function getRespExtra()
    {
        return $this->respExtra;
    }

    /**
     * @param field_type $resultstatus
     */
    public function setResultstatus($resultstatus)
    {
        $this->resultstatus = $resultstatus;
    }

    /**
     * @param field_type $resultRespCode
     */
    public function setResultRespCode($resultRespCode)
    {
        $this->resultRespCode = $resultRespCode;
    }

    /**
     * @param field_type $resultRespMsg
     */
    public function setResultRespMsg($resultRespMsg)
    {
        $this->resultRespMsg = $resultRespMsg;
    }

    /**
     * @param field_type $channelType
     */
    public function setChannelType($channelType)
    {
        $this->channelType = $channelType;
    }

    /**
     * @param field_type $ccOpId
     */
    public function setCcOpId($ccOpId)
    {
        $this->ccOpId = $ccOpId;
    }

    /**
     * @param field_type $requestId
     */
    public function setRequestId($requestId)
    {
        $this->requestId = $requestId;
    }

    /**
     * @param field_type $requestTime
     */
    public function setRequestTime($requestTime)
    {
        $this->requestTime = $requestTime;
    }

    /**
     * @param field_type $requestType
     */
    public function setRequestType($requestType)
    {
        $this->requestType = $requestType;
    }

    /**
     * @param field_type $subRequestType
     */
    public function setSubRequestType($subRequestType)
    {
        $this->subRequestType = $subRequestType;
    }

    /**
     * @param field_type $merchantName
     */
    public function setMerchantName($merchantName)
    {
        $this->merchantName = $merchantName;
    }

    /**
     * @param field_type $cardInfo
     */
    public function setCardInfo($cardInfo)
    {
        $this->cardInfo = $cardInfo;
    }

    /**
     * @param field_type $respExtra
     */
    public function setRespExtra($respExtra)
    {
        $this->respExtra = $respExtra;
    }

    
    
}
?>