<?php
/**
 * Created by PhpStorm.
 * User: wang.xiaoliang
 * Date: 2021/7/30
 * Time: 14:49
 */

namespace triplink\vcc\card\client\query;

class QueryInfoRequest
{
    /**
     * 请求流水号
     */
    var $requestId;
    /**
     * 请求时间
     */
    var $requestTime;
    /**
     * 请求类型
     */
    var $requestType;
    /**
     * 请求子类型
     */
    var $subRequestType;
    /**
     * 请求商户名
     */
    var $merchantName;
    /**
     * 发卡通道类型
     */
    var $channelType;
    /**
     * 卡信息请求
     */
    var $cardInfo;
    /**
     * 签名信息
     */
    var $sign;
    /**
     * 请求扩展字段
     */
    var $reqExtra;
    /**
     * 操作人
     */
    var $operator;

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
    public function getRequestType()
    {
        return $this->requestType;
    }

    /**
     * @param mixed $requestType
     */
    public function setRequestType($requestType): void
    {
        $this->requestType = $requestType;
    }

    /**
     * @return mixed
     */
    public function getSubRequestType()
    {
        return $this->subRequestType;
    }

    /**
     * @param mixed $subRequestType
     */
    public function setSubRequestType($subRequestType): void
    {
        $this->subRequestType = $subRequestType;
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

    /**
     * @return mixed
     */
    public function getSign()
    {
        return $this->sign;
    }

    /**
     * @param mixed $sign
     */
    public function setSign($sign): void
    {
        $this->sign = $sign;
    }

    /**
     * @return mixed
     */
    public function getReqExtra()
    {
        return $this->reqExtra;
    }

    /**
     * @param mixed $reqExtra
     */
    public function setReqExtra($reqExtra): void
    {
        $this->reqExtra = $reqExtra;
    }

    /**
     * @return mixed
     */
    public function getOperator()
    {
        return $this->operator;
    }

    /**
     * @param mixed $operator
     */
    public function setOperator($operator): void
    {
        $this->operator = $operator;
    }



}

?>