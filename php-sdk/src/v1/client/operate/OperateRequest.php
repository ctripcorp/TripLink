<?php

namespace triplink\vcc\card\client\operate;


class OperateRequest {

    var $requestId;

    var $requestTime;

    var $requestType;

    var $subRequestType;

    var $merchantName;

    var $channelType;

    var $cardInfo;

    var $riskInfo;

    var $requestSource;

    var $operator;

    var $reqExtra;
    
    var $sign;

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
     * @return the $channelType
     */
    public function getChannelType()
    {
        return $this->channelType;
    }

    /**
     * @return the $cardInfo
     */
    public function getCardInfo()
    {
        return $this->cardInfo;
    }

    /**
     * @return the $riskInfo
     */
    public function getRiskInfo()
    {
        return $this->riskInfo;
    }

    /**
     * @return the $requestSource
     */
    public function getRequestSource()
    {
        return $this->requestSource;
    }

    /**
     * @return the $operator
     */
    public function getOperator()
    {
        return $this->operator;
    }


    /**
     * @return the $reqExtra
     */
    public function getReqExtra()
    {
        return $this->reqExtra;
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
     * @param field_type $channelType
     */
    public function setChannelType($channelType)
    {
        $this->channelType = $channelType;
    }

    /**
     * @param field_type $cardInfo
     */
    public function setCardInfo($cardInfo)
    {
        $this->cardInfo = $cardInfo;
    }

    /**
     * @param field_type $riskInfo
     */
    public function setRiskInfo($riskInfo)
    {
        $this->riskInfo = $riskInfo;
    }

    /**
     * @param field_type $requestSource
     */
    public function setRequestSource($requestSource)
    {
        $this->requestSource = $requestSource;
    }

    /**
     * @param field_type $operator
     */
    public function setOperator($operator)
    {
        $this->operator = $operator;
    }


    /**
     * @param field_type $reqExtra
     */
    public function setReqExtra($reqExtra)
    {
        $this->reqExtra = $reqExtra;
    }
    /**
     * @return the $sign
     */
    public function getSign()
    {
        return $this->sign;
    }

    /**
     * @param field_type $sign
     */
    public function setSign($sign)
    {
        $this->sign = $sign;
    }

    
    

    
}
?>