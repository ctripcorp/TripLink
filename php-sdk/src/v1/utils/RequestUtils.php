<?php

namespace triplink\vcc\card\utils;


use triplink\vcc\card\client\CardInfo;
use triplink\vcc\card\client\operate\OperateRequest;
use triplink\vcc\card\client\query\QueryInfoRequest;
use triplink\vcc\card\client\query\QueryOperateRequest;
use triplink\vcc\card\client\query\QueryTransInfoRequest;


class RequestUtils
{

    const REQUEST_TYPE_CREATE = "CREATE";

    const REQUEST_TYPE_UPDATE = "UPDATE";

    const REQUEST_TYPE_CLOSE = "CLOSE";

    const REQUEST_TYPE_QINFO = "GET";

    //qTransInfo接口 请求类型值
    const REQUEST_TYPE_QTRANS = "TRANS";
    //qTransInfo接口 请求子类型值 预授权交易
    const SUB_REQUEST_TYPE_AUTH = "AUTH";
    //qTransInfo接口 请求子类型值 清算交易
    const SUB_REQUEST_TYPE_SETTLEMENT = "SETTLEMENT";

    const SUB_REQUEST_TYPE_CARD = "CARD_EXTERNAL";

    const SUB_REQUEST_TYPE_MERCHANT = "MERCHANT_INFO";


    static function convertCreateRequest($request)
    {
        $operateRequest = new OperateRequest();
        $operateRequest->setRequestId($request->getRequestId());
        $operateRequest->setRequestTime($request->getRequestTime());
        $operateRequest->setRequestType(self::REQUEST_TYPE_CREATE);
        $operateRequest->setSubRequestType(self::SUB_REQUEST_TYPE_CARD);
        $operateRequest->setMerchantName($request->getMerchantName());
        $operateRequest->setChannelType($request->getChannelType());
        $operateRequest->setRequestSource($request->getRequestSource());
        $operateRequest->setOperator($request->getOperator());
        $operateRequest->setReqExtra($request->getReqExtra());

        $operateRequest->setRiskInfo($request->getRiskInfo());

        $createCardInfo = $request->getCardInfo();
        if (!empty($createCardInfo)) {
            $cardInfo = new CardInfo();
            $cardInfo->setLocalCurrency($createCardInfo->getLocalCurrency());
            $cardInfo->setBillCurrency($createCardInfo->getBillCurrency());
            $cardInfo->setStartActiveDate($createCardInfo->getStartActiveDate());
            $cardInfo->setEndCloseDate($createCardInfo->getEndCloseDate());
            $cardInfo->setCreditLimitAmt($createCardInfo->getCreditLimitAmt());
            $cardInfo->setMinAuthAmt($createCardInfo->getMinAuthAmt());
            $cardInfo->setMaxAuthAmt($createCardInfo->getMaxAuthAmt());
            $cardInfo->setEnableMutilUse($createCardInfo->getEnableMutilUse());
            $cardInfo->setClosePercentage($createCardInfo->getClosePercentage());
            $cardInfo->setMerchantControlMethod($createCardInfo->getMerchantControlMethod());
            $cardInfo->setMerchantCategoryName($createCardInfo->getMerchantCategoryName());
            $cardInfo->setMerchantCode($createCardInfo->getMerchantCode());
            $cardInfo->setEnable3DS($createCardInfo->getEnable3DS());
            $cardInfo->setEnaleCVVCheck($createCardInfo->getEnaleCVVCheck());
            $cardInfo->setUserDefineInfo($createCardInfo->getUserDefineInfo());

            $operateRequest->setCardInfo($cardInfo);
        }

        return $operateRequest;
    }

    static function convertUpdateRequest($request)
    {

        $operateRequest = new OperateRequest();
        $operateRequest->setRequestId($request->getRequestId());
        $operateRequest->setRequestTime($request->getRequestTime());
        $operateRequest->setRequestType(self::REQUEST_TYPE_UPDATE);
        $operateRequest->setSubRequestType(self::SUB_REQUEST_TYPE_CARD);
        $operateRequest->setMerchantName($request->getMerchantName());
        $operateRequest->setChannelType($request->getChannelType());
        $operateRequest->setRequestSource($request->getRequestSource());
        $operateRequest->setOperator($request->getOperator());
        $operateRequest->setReqExtra($request->getReqExtra());

        $operateRequest->setRiskInfo($request->getRiskInfo());
        $updateCardInfo = $request->getCardInfo();
        if (!empty($updateCardInfo)) {
            $cardInfo = new CardInfo();
            //VCC发行卡片处唯一参考号
            $cardInfo->setCardLogId($updateCardInfo->getCardLogId());
            //卡生效日期 <yyyy-MM-dd>
            $cardInfo->setStartActiveDate($updateCardInfo->getStartActiveDate());
            //最晚关卡日期 <yyyy-MM-dd>
            $cardInfo->setEndCloseDate($updateCardInfo->getEndCloseDate());
            //卡额度
            $cardInfo->setCreditLimitAmt($updateCardInfo->getCreditLimitAmt());
            //卡最低可扣款金额
            $cardInfo->setMinAuthAmt($updateCardInfo->getMinAuthAmt());
            //卡最高可扣款金额
            $cardInfo->setMaxAuthAmt($updateCardInfo->getMaxAuthAmt());
            //自动关卡百分数设定
            $cardInfo->setClosePercentage($updateCardInfo->getClosePercentage());
            //商户控制方式
            $cardInfo->setMerchantControlMethod($updateCardInfo->getMerchantControlMethod());
            //MCC类别
            $cardInfo->setMerchantCategoryName($updateCardInfo->getMerchantCategoryName());
            //商户号
            $cardInfo->setMerchantCode($updateCardInfo->getMerchantCode());
            //是否支持3ds验证
            $cardInfo->setEnable3DS($updateCardInfo->getEnable3DS());
            //是否启用CVV检验
            $cardInfo->setEnaleCVVCheck($updateCardInfo->getEnaleCVVCheck());
            //是否启用交易币种限制
            $cardInfo->setEnableCurrencyCheck($updateCardInfo->getEnableCurrencyCheck());
            //用户自定义信息
            $cardInfo->setUserDefineInfo($updateCardInfo->getUserDefineInfo());

            $operateRequest->setCardInfo($cardInfo);
        }


        return $operateRequest;
    }


    static function convertCloseRequest($request)
    {
        $operateRequest = new OperateRequest();
        //请求流水号
        $operateRequest->setRequestId($request->getRequestId());
        //请求时间 yyyyMMddHHmmss
        $operateRequest->setRequestTime($request->getRequestTime());
        //请求类型
        $operateRequest->setRequestType(self::REQUEST_TYPE_CLOSE);
        //请求子类型
        $operateRequest->setSubRequestType(self::SUB_REQUEST_TYPE_CARD);
        //商户名
        $operateRequest->setMerchantName($request->getMerchantName());
        //发卡通道类型
        $operateRequest->setChannelType($request->getChannelType());
        //请求来源标注
        $operateRequest->setRequestSource($request->getRequestSource());
        //调用端操作人
        $operateRequest->setOperator($request->getOperator());
        //请求扩展字段
        $operateRequest->setReqExtra($request->getReqExtra());
        //卡信息
        $cardInfo = new CardInfo();
        //VCC发行卡片处唯一参考号
        $cardInfo->setCardLogId($request->getCardLogId());
        $operateRequest->setCardInfo($cardInfo);
        return $operateRequest;
    }

    static function convertQueryCreateCardRequest($request)
    {
        $operateResultRequest = new QueryOperateRequest();
        //请求流水号
        $operateResultRequest->setRequestId($request->getRequestId());
        //请求时间 yyyyMMddHHmmss
        $operateResultRequest->setRequestTime($request->getRequestTime());
        //请求类型
        $operateResultRequest->setRequestType(self::REQUEST_TYPE_CREATE);
        //请求子类型
        $operateResultRequest->setSubRequestType(self::SUB_REQUEST_TYPE_CARD);
        //商户名
        $operateResultRequest->setMerchantName($request->getMerchantName());
        //请求扩展字段
        $operateResultRequest->setReqExtra($request->getReqExtra());
        //操作人
        $operateResultRequest->setOperator($request->getOperator());
        return $operateResultRequest;
    }


    static function convertQueryUpdateCardRequest($request)
    {
        $operateResultRequest = new QueryOperateRequest();
        //请求流水号
        $operateResultRequest->setRequestId($request->getRequestId());
        //请求时间 yyyyMMddHHmmss
        $operateResultRequest->setRequestTime($request->getRequestTime());
        //请求类型
        $operateResultRequest->setRequestType(self::REQUEST_TYPE_UPDATE);
        //请求子类型
        $operateResultRequest->setSubRequestType(self::SUB_REQUEST_TYPE_CARD);
        //商户名
        $operateResultRequest->setMerchantName($request->getMerchantName());
        //请求扩展字段
        $operateResultRequest->setReqExtra($request->getReqExtra());
        //操作人
        $operateResultRequest->setOperator($request->getOperator());
        return $operateResultRequest;
    }


    static function convertQueryCloseCardRequest($request)
    {
        $operateResultRequest = new QueryOperateRequest();
        //请求流水号
        $operateResultRequest->setRequestId($request->getRequestId());
        //请求时间 yyyyMMddHHmmss
        $operateResultRequest->setRequestTime($request->getRequestTime());
        //请求类型
        $operateResultRequest->setRequestType(self::REQUEST_TYPE_CLOSE);
        //请求子类型
        $operateResultRequest->setSubRequestType(self::SUB_REQUEST_TYPE_CARD);
        //商户名
        $operateResultRequest->setMerchantName($request->getMerchantName());
        //请求扩展字段
        $operateResultRequest->setReqExtra($request->getReqExtra());
        //操作人
        $operateResultRequest->setOperator($request->getOperator());
        return $operateResultRequest;
    }

    static function convertQueryCardInfoRequest($request)
    {
        $queryInfoRequest = new QueryInfoRequest();
        //请求流水号
        $queryInfoRequest->setRequestId($request->getRequestId());
        //请求时间 yyyyMMddHHmmss
        $queryInfoRequest->setRequestTime($request->getRequestTime());
        //请求类型
        $queryInfoRequest->setRequestType(self::REQUEST_TYPE_QINFO);
        //请求子类型
        $queryInfoRequest->setSubRequestType(self::SUB_REQUEST_TYPE_CARD);
        //商户名
        $queryInfoRequest->setMerchantName($request->getMerchantName());
        //请求扩展字段
        $queryInfoRequest->setReqExtra($request->getReqExtra());
        //操作人
        $queryInfoRequest->setOperator($request->getOperator());

        $cardInfo = new CardInfo();

        $cardInfo->setCardLogId($request->getCardLogId());
        $queryInfoRequest->setCardInfo($cardInfo);
        return $queryInfoRequest;
    }


    static function convertMerchantCardInfoRequest($request)
    {
        $queryInfoRequest = new QueryInfoRequest();
        //请求流水号
        $queryInfoRequest->setRequestId($request->getRequestId());
        //请求时间 yyyyMMddHHmmss
        $queryInfoRequest->setRequestTime($request->getRequestTime());
        //请求类型
        $queryInfoRequest->setRequestType(self::REQUEST_TYPE_QINFO);
        //请求子类型
        $queryInfoRequest->setSubRequestType(self::SUB_REQUEST_TYPE_MERCHANT);
        //商户名
        $queryInfoRequest->setMerchantName($request->getMerchantName());
        //请求扩展字段
        $queryInfoRequest->setReqExtra($request->getReqExtra());
        //操作人
        $queryInfoRequest->setOperator($request->getOperator());

        $cardInfo = new CardInfo();

        $cardInfo->setCardLogId($request->getCardLogId());
        $queryInfoRequest->setCardInfo($cardInfo);
        return $queryInfoRequest;
    }

    static function convertQueryAuthTransInfoRequest($request)
    {
        $queryTransInfoRequest = new QueryTransInfoRequest();
        //请求流水号
        $queryTransInfoRequest->setRequestId($request->getRequestId());
        //请求时间 yyyyMMddHHmmss
        $queryTransInfoRequest->setRequestTime($request->getRequestTime());
        //请求类型
        $queryTransInfoRequest->setRequestType(self::REQUEST_TYPE_QTRANS);
        //请求子类型
        $queryTransInfoRequest->setSubRequestType(self::SUB_REQUEST_TYPE_AUTH);
        //请求渠道
        $queryTransInfoRequest->setChannelType($request->getChannelType());
        //商户名
        $queryTransInfoRequest->setMerchantName($request->getMerchantName());
        //请求扩展字段
        $queryTransInfoRequest->setReqExtra($request->getReqExtra());
        //操作人
        $queryTransInfoRequest->setOperator($request->getOperator());
        //卡信息
        $cardInfo = new CardInfo();
        //VCC发行卡片处唯一参考号
        $cardInfo->setCardLogId($request->getCardLogId());
        $queryTransInfoRequest->setCardInfo($cardInfo);
        return $queryTransInfoRequest;
    }

    static function convertQuerySettlementTransInfoRequest($request)
    {
        $queryTransInfoRequest = new QueryTransInfoRequest();
        //请求流水号
        $queryTransInfoRequest->setRequestId($request->getRequestId());
        //请求时间 yyyyMMddHHmmss
        $queryTransInfoRequest->setRequestTime($request->getRequestTime());
        //请求类型
        $queryTransInfoRequest->setRequestType(self::REQUEST_TYPE_QTRANS);
        //请求子类型
        $queryTransInfoRequest->setSubRequestType(self::SUB_REQUEST_TYPE_SETTLEMENT);
        //请求渠道
        $queryTransInfoRequest->setChannelType($request->getChannelType());
        //商户名
        $queryTransInfoRequest->setMerchantName($request->getMerchantName());
        //请求扩展字段
        $queryTransInfoRequest->setReqExtra($request->getReqExtra());
        //操作人
        $queryTransInfoRequest->setOperator($request->getOperator());
        //卡信息
        $cardInfo = new CardInfo();
        //VCC发行卡片处唯一参考号
        $cardInfo->setCardLogId($request->getCardLogId());
        $queryTransInfoRequest->setCardInfo($cardInfo);
        return $queryTransInfoRequest;
    }


}


?>