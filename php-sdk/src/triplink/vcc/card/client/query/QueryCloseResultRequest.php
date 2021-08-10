<?php
/**
 * Created by PhpStorm.
 * User: wang.xiaoliang
 * Date: 2021/8/2
 * Time: 18:56
 */

namespace triplink\vcc\card\client\query;

class QueryCloseResultRequest
{
    /**
     * the request number of the original update request number
     */
    var $requestId;
    /**
     * the request time of the original update request time
     */
    var $requestTime;
    /**
     * the merchant name of the original update merchant name
     */
    var $merchantName;
    /**
     * request extra info
     * json type
     * eg: {"BinFlagDcre":"12345"}
     */
    var $reqExtra;
    /**
     * operator
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