<?php
namespace triplink\vcc\card\client\operate;

class CreateCardResponse {
    /**
     * create result
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
     * create request number
     */
    var $requestId;
    /**
     * create request time
     */
    var $requestTime;
    /**
     *create merchant name
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
     * card no
     * encrypt by des
     */
    var $cardNo;
    
    /**
     * cvv
     * encrypt by des
     */
    var $cardVerifyNo;
    
    /**
     * expiration date of the card
     * encrypt by des
     */
    var $cardExpiryDate;
    /**
     * @return the $resultStatus
     */
    public function getResultStatus()
    {
        return $this->resultStatus;
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
     * @return the $merchantName
     */
    public function getMerchantName()
    {
        return $this->merchantName;
    }

    /**
     * @return the $respExtra
     */
    public function getRespExtra()
    {
        return $this->respExtra;
    }

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
     * @param field_type $resultStatus
     */
    public function setResultStatus($resultStatus)
    {
        $this->resultStatus = $resultStatus;
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
     * @param field_type $merchantName
     */
    public function setMerchantName($merchantName)
    {
        $this->merchantName = $merchantName;
    }

    /**
     * @param field_type $respExtra
     */
    public function setRespExtra($respExtra)
    {
        $this->respExtra = $respExtra;
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

}
?>