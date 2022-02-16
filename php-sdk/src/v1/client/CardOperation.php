<?php

namespace triplink\vcc\card\client;


use triplink\vcc\card\utils\CURLUtils;
use triplink\vcc\card\utils\RequestUtils;
use triplink\vcc\card\utils\ResponseUtils;
use triplink\vcc\card\utils\SignUtils;


/**
 * @author wang.xiaoliang
 *
 */
class CardOperation
{


    const OPERATE_METHOD = "/operate";

    const OPERATE_RESULT_METHOD = "/qOperateResult";

    const QUERY_RESULT_METHOD = "/qInfo";

    const TRANS_METHOD = "/qTransInfo";

    var $rsaKey;

    var $primaryKey;

    var $requestUrl;

    function __construct($requestUrl, $primaryKey, $rsaKey)
    {
        $this->requestUrl = $requestUrl;
        $this->primaryKey = $primaryKey;
        $this->rsaKey = $rsaKey;
    }

    function createCard($createCardRequest)
    {

        $operateRequest = RequestUtils::convertCreateRequest($createCardRequest);
        $sign = SignUtils::buildSign($operateRequest, $this->primaryKey);

        $operateRequest->setSign($sign);
        $dataArray = $this->object_array($operateRequest);
        $data = json_encode($dataArray);


        $respStr = CURLUtils::curl_post($this->requestUrl . self::OPERATE_METHOD, $data);
        $respObject = json_decode($respStr, true);

        $respData = ResponseUtils::convertCreateCardResponse($respObject, $this->rsaKey);
        return $respData;
    }

    function updateCard($updateCardRequest)
    {
        $operateRequest = RequestUtils::convertUpdateRequest($updateCardRequest);
        $sign = SignUtils::buildSign($operateRequest, $this->primaryKey);

        $operateRequest->setSign($sign);
        $dataArray = $this->object_array($operateRequest);
        $data = json_encode($dataArray);


        $respStr = CURLUtils::curl_post($this->requestUrl . self::OPERATE_METHOD, $data);
        $respObject = json_decode($respStr, true);

        $respData = ResponseUtils::convertUpdateCardResponse($respObject, $this->rsaKey);
        return $respData;
    }

    function closeCard($closeCardRequest)
    {
        $operateRequest = RequestUtils::convertCloseRequest($closeCardRequest);
        $sign = SignUtils::buildSign($operateRequest, $this->primaryKey);

        $operateRequest->setSign($sign);
        $dataArray = $this->object_array($operateRequest);
        $data = json_encode($dataArray);


        $respStr = CURLUtils::curl_post($this->requestUrl . self::OPERATE_METHOD, $data);
        $respObject = json_decode($respStr, true);

        $respData = ResponseUtils::convertCloseCardResponse($respObject, $this->rsaKey);
        return $respData;
    }

    function queryCreateCardResult($queryCreateCardResult)
    {
        $operateRequest = RequestUtils::convertQueryCreateCardRequest($queryCreateCardResult);

        //数据签名
        $operateRequest->setSign(SignUtils::buildSign($operateRequest, $this->primaryKey));
        //接口请求
        $dataArray = $this->object_array($operateRequest);
        $data = json_encode($dataArray);

        $respStr = CURLUtils::curl_post($this->requestUrl . self::OPERATE_RESULT_METHOD, $data);

        $respObject = json_decode($respStr, true);

        $respData = ResponseUtils::convertQueryCreateCardResponse($respObject, $this->rsaKey);
        return $respData;


    }


    function queryUpdateCardResult($queryUpdateCardResult)
    {
        $operateRequest = RequestUtils::convertQueryUpdateCardRequest($queryUpdateCardResult);

        //数据签名
        $operateRequest->setSign(SignUtils::buildSign($operateRequest, $this->primaryKey));
        //接口请求
        $dataArray = $this->object_array($operateRequest);
        $data = json_encode($dataArray);


        $respStr = CURLUtils::curl_post($this->requestUrl . self::OPERATE_RESULT_METHOD, $data);

        $respObject = json_decode($respStr, true);

        $respData = ResponseUtils::convertQueryUpdateCardResponse($respObject, $this->rsaKey);
        return $respData;


    }


    function queryCloseCardResult($queryCloseCardResult)
    {
        $operateRequest = RequestUtils::convertQueryCloseCardRequest($queryCloseCardResult);

        //数据签名
        $operateRequest->setSign(SignUtils::buildSign($operateRequest, $this->primaryKey));
        //接口请求
        $dataArray = $this->object_array($operateRequest);
        $data = json_encode($dataArray);

        $respStr = CURLUtils::curl_post($this->requestUrl . self::OPERATE_RESULT_METHOD, $data);

        $respObject = json_decode($respStr, true);

        $respData = ResponseUtils::convertQueryCloseCardResponse($respObject, $this->rsaKey);
        return $respData;


    }


    function queryCardInfoResult($queryCardInfoResult)
    {
        $operateRequest = RequestUtils::convertQueryCardInfoRequest($queryCardInfoResult);

        //数据签名
        $operateRequest->setSign(SignUtils::buildSign($operateRequest, $this->primaryKey));
        //接口请求
        $dataArray = $this->object_array($operateRequest);
        $data = json_encode($dataArray);

        $respStr = CURLUtils::curl_post($this->requestUrl . self::QUERY_RESULT_METHOD, $data);

        $respObject = json_decode($respStr, true);

        $respData = ResponseUtils::convertQueryCardInfoResponse($respObject, $this->rsaKey);
        return $respData;


    }


    function queryMerchantInfoResult($queryMerchantInfoResult)
    {
        $operateRequest = RequestUtils::convertMerchantCardInfoRequest($queryMerchantInfoResult);

        //数据签名
        $operateRequest->setSign(SignUtils::buildSign($operateRequest, $this->primaryKey));
        //接口请求
        $dataArray = $this->object_array($operateRequest);
        $data = json_encode($dataArray);

        $respStr = CURLUtils::curl_post($this->requestUrl . self::QUERY_RESULT_METHOD, $data);

        $respObject = json_decode($respStr, true);

        $respData = ResponseUtils::convertQueryMerchantInfoResponse($respObject);
        return $respData;

    }

    function queryAuthTransInfo($queryAuthTransInfoRequest)
    {

        $operateRequest = RequestUtils::convertQueryAuthTransInfoRequest($queryAuthTransInfoRequest);

        //数据签名
        $operateRequest->setSign(SignUtils::buildSign($operateRequest, $this->primaryKey));
        //接口请求
        $dataArray = $this->object_array($operateRequest);
        $data = json_encode($dataArray);

        $respStr = CURLUtils::curl_post($this->requestUrl . self::TRANS_METHOD, $data);

        $respObject = json_decode($respStr, true);

        $respData = ResponseUtils::convertQueryAuthTransInfoResponse($respObject);
        return $respData;

    }

    function querySettlementTransInfo($querySettlementTransInfoRequest)
    {

        $operateRequest = RequestUtils::convertQuerySettlementTransInfoRequest($querySettlementTransInfoRequest);

        //数据签名
        $operateRequest->setSign(SignUtils::buildSign($operateRequest, $this->primaryKey));
        //接口请求
        $dataArray = $this->object_array($operateRequest);
        $data = json_encode($dataArray);

        $respStr = CURLUtils::curl_post($this->requestUrl . self::TRANS_METHOD, $data);

        $respObject = json_decode($respStr, true);

        $respData = ResponseUtils::convertQuerySettlementTransInfoResponse($respObject);
        return $respData;

    }


    function object_array($array)
    {
        if (is_object($array)) {
            $array = (array)$array;
        }
        if (is_array($array)) {
            foreach ($array as $key => $value) {
                $array[$key] = $this->object_array($value);
            }
        }
        return $array;
    }
}

?>