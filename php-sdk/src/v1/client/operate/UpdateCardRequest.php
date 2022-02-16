<?php
namespace triplink\vcc\card\client\operate;

class UpdateCardRequest{
    
    
    /**
     * need new request number on each request
     */
    var $requestId;
    /**
     * request time
     */
    var $requestTime;
    /**
     * merchant name , TripLink distribution
     */
    var $merchantName;
    /**
     * channel type, TripLink distribution
     */
    var $channelType;
    /**
     * user defined
     */
    var $requestSource;
    /**
     * operator
     */
    var $operator;
    /**
     * request extra info
     * json type
     * eg: {"BinFlagDcre":"12345"}
     */
    var $reqExtra;
    /**
     * risk info
     */
    var $riskInfo;
    /**
     * create card info
     */
    var $cardInfo;
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
     * @return the $riskInfo
     */
    public function getRiskInfo()
    {
        return $this->riskInfo;
    }

    /**
     * @return the $cardInfo
     */
    public function getCardInfo()
    {
        return $this->cardInfo;
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
     * @param field_type $riskInfo
     */
    public function setRiskInfo($riskInfo)
    {
        $this->riskInfo = $riskInfo;
    }

    /**
     * @param field_type $cardInfo
     */
    public function setCardInfo($cardInfo)
    {
        $this->cardInfo = $cardInfo;
    }



    
}
?>