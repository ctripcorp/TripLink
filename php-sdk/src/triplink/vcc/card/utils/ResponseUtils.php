<?php
namespace triplink\vcc\card\utils;

require_once(__DIR__ . '/../client/operate/CreateCardResponse.php');
require_once(__DIR__ . '/../client/operate/UpdateCardResponse.php');
require_once(__DIR__ . '/../client/operate/CloseCardResponse.php');
require_once(__DIR__ . '/../client/query/QueryCreateResultResponse.php');
require_once(__DIR__ . '/../client/query/QueryUpdateResultResponse.php');
require_once(__DIR__ . '/../client/query/QueryCloseResultResponse.php');
require_once(__DIR__ . '/../client/query/QueryCardInfoResponse.php');
require_once(__DIR__ . '/../client/query/QueryMerchantInfoResponse.php');
require_once(__DIR__ . '/../client/query/MerchantInfo.php');
require_once(__DIR__ . '/../client/query/ChannelInfo.php');
require_once(__DIR__ . '/../client/query/AuthInfoResp.php');
require_once(__DIR__ . '/../client/query/TransMerchantInfo.php');
require_once(__DIR__ . '/../client/query/AuthInfo.php');
require_once(__DIR__ . '/../client/query/QuerySettlementTransInfoResponse.php');
require_once(__DIR__ . '/../client/query/SettlementInfo.php');
require_once(__DIR__ . '/../client/query/SettlementInfoResp.php');



require_once(__DIR__ . '/../utils/DesUtils.php');

use triplink\vcc\card\client\CardInfo;
use triplink\vcc\card\client\operate\CreateCardResponse;
use triplink\vcc\card\client\query\ChannelInfo;
use triplink\vcc\card\client\operate\UpdateCardResponse;
use triplink\vcc\card\client\operate\CloseCardResponse;
use triplink\vcc\card\client\query\QueryCreateResultResponse;
use triplink\vcc\card\client\query\QueryUpdateResultResponse;
use triplink\vcc\card\client\query\QueryCloseResultResponse;
use triplink\vcc\card\client\query\QueryCardInfoResponse;
use triplink\vcc\card\client\query\QueryMerchantInfoResponse;
use triplink\vcc\card\client\query\QueryAuthTransInfoResponse;
use triplink\vcc\card\client\query\MerchantInfo;
use triplink\vcc\card\client\query\AuthInfoResp;
use triplink\vcc\card\client\query\TransMerchantInfo;
use triplink\vcc\card\client\query\AuthInfo;
use triplink\vcc\card\client\query\QuerySettlementTransInfoResponse;
use triplink\vcc\card\client\query\SettlementInfo;
use triplink\vcc\card\client\query\SettlementInfoResp;




class ResponseUtils {
    
    static function convertCreateCardResponse($respObject, $rsaKey) {
        $resp = new CreateCardResponse();
        
        $resp->setResultStatus($respObject['resultstatus']);
        $resp->setResultRespCode($respObject['resultRespCode']);
        $resp->setResultRespMsg($respObject['resultRespMsg']);
        
        $resp->setChannelType($respObject['channelType']);
        
        $resp->setRequestId($respObject['requestId']);
        $resp->setRequestTime($respObject['requestTime']);
        $resp->setMerchantName($respObject['merchantName']);
        $resp->setChannelType($respObject['channelType']);
        $resp->setCcOpId($respObject['ccOpId']??'');
        $resp->setRespExtra($respObject['respExtra']??'');
        if (!empty($respObject['cardInfo'])) {
            $resp->setCardLogId(($respObject['cardInfo']['cardLogId']));
            $resp->setCardNo(DesUtils::encryptByTDES($respObject['cardInfo']['cardNo'], $rsaKey));
            $resp->setCardVerifyNo(DesUtils::encryptByTDES($respObject['cardInfo']['cardVerifyNo'], $rsaKey));
            $resp->setCardExpiryDate(DesUtils::encryptByTDES($respObject['cardInfo']['cardExpiryDate'], $rsaKey));
            
        }
        return $resp;
        
    }

    static function convertUpdateCardResponse($respObject, $rsaKey) {
        $resp = new UpdateCardResponse();

        $resp->setResultStatus($respObject['resultstatus']);
        $resp->setResultRespCode($respObject['resultRespCode']);
        $resp->setResultRespMsg($respObject['resultRespMsg']);

        $resp->setChannelType($respObject['channelType']);

        $resp->setRequestId($respObject['requestId']);
        $resp->setRequestTime($respObject['requestTime']);
        $resp->setMerchantName($respObject['merchantName']);
        $resp->setChannelType($respObject['channelType']);
        $resp->setCcOpId($respObject['ccOpId']??'');
        $resp->setRespExtra($respObject['respExtra']??'');
        if (!empty($respObject['cardInfo'])) {
            $resp->setCardLogId(($respObject['cardInfo']['cardLogId']));
            $resp->setCardNo(DesUtils::encryptByTDES($respObject['cardInfo']['cardNo'], $rsaKey));
            $resp->setCardVerifyNo(DesUtils::encryptByTDES($respObject['cardInfo']['cardVerifyNo'], $rsaKey));
            $resp->setCardExpiryDate(DesUtils::encryptByTDES($respObject['cardInfo']['cardExpiryDate'], $rsaKey));

        }
        return $resp;

    }

    static function convertCloseCardResponse($respObject, $rsaKey) {
        $closeResponse = new CloseCardResponse();
        //结果状态
        $closeResponse->setResultStatus($respObject['resultstatus']);
        //结果码
        $closeResponse->setResultRespCode($respObject['resultRespCode']);
        //结果码描述
        $closeResponse->setResultRespMsg($respObject['resultRespMsg']);
        //发卡通道类型
        $closeResponse->setChannelType($respObject['channelType']);
        //VCC生成的唯一流水号
        $closeResponse->setCcOpId($respObject['ccOpId']??'');
        //原请求流水号
        $closeResponse->setRequestId($respObject['requestId']);
        //原请求时间
        $closeResponse->setRequestTime($respObject['requestTime']);
        //原请求商户名
        $closeResponse->setMerchantName($respObject['merchantName']??'');
        //响应扩展数据
        $closeResponse->setRespExtra($respObject['respExtra']??'');
        if (!empty($respObject['cardInfo'])) {
            $closeResponse->setCardLogId(($respObject['cardInfo']['cardLogId']));
        }
        return $closeResponse;

    }


    static function convertQueryCreateCardResponse($respObject, $rsaKey) {
        $queryCreateCardResponse = new QueryCreateResultResponse();
        //查询状态
        $queryCreateCardResponse->setqResultStatus($respObject['qResultStatus']);
        //查询结果码
        $queryCreateCardResponse->setqResultCode($respObject['qResultCode']);
        //查询结果描述
        $queryCreateCardResponse->setqResultMsg($respObject['qResultMsg']);
        //开卡结果状态
        $queryCreateCardResponse->setResultStatus($respObject['resultstatus']);
        //开卡结果码
        $queryCreateCardResponse->setResultRespCode($respObject['resultRespCode']);
        //开卡结果码描述
        $queryCreateCardResponse->setResultRespMsg($respObject['resultRespMsg']);
        //发卡通道类型
        $queryCreateCardResponse->setChannelType($respObject['channelType']??'');
        //VCC生成的唯一流水号
        $queryCreateCardResponse->setCcOpId($respObject['ccOpId']??'');
        //原请求流水号
        $queryCreateCardResponse->setRequestId($respObject['requestId']??'');
        //原请求时间
        $queryCreateCardResponse->setRequestTime($respObject['requestTime']??'');
        //原请求商户名
        $queryCreateCardResponse->setMerchantName($respObject['merchantName']??'');
        //响应扩展数据
        $queryCreateCardResponse->setRespExtra($respObject['respExtra']??'');
        if (!empty($respObject['cardInfo'])) {
            $queryCreateCardResponse->setCardLogId(($respObject['cardInfo']['cardLogId']));
            $queryCreateCardResponse->setCardNo(DesUtils::encryptByTDES($respObject['cardInfo']['cardNo'], $rsaKey));
            $queryCreateCardResponse->setCardVerifyNo(DesUtils::encryptByTDES($respObject['cardInfo']['cardVerifyNo'], $rsaKey));
            $queryCreateCardResponse->setCardExpiryDate(DesUtils::encryptByTDES($respObject['cardInfo']['cardExpiryDate'], $rsaKey));

        }
        return $queryCreateCardResponse;
    }

    static function convertQueryUpdateCardResponse($respObject, $rsaKey) {
        $queryUpdateCardResponse = new QueryUpdateResultResponse();
        //查询状态
        $queryUpdateCardResponse->setqResultStatus($respObject['qResultStatus']);
        //查询结果码
        $queryUpdateCardResponse->setqResultCode($respObject['qResultCode']);
        //查询结果描述
        $queryUpdateCardResponse->setqResultMsg($respObject['qResultMsg']);
        //开卡结果状态
        $queryUpdateCardResponse->setResultStatus($respObject['resultstatus']);
        //开卡结果码
        $queryUpdateCardResponse->setResultRespCode($respObject['resultRespCode']);
        //开卡结果码描述
        $queryUpdateCardResponse->setResultRespMsg($respObject['resultRespMsg']);
        //发卡通道类型
        $queryUpdateCardResponse->setChannelType($respObject['channelType']??'');
        //VCC生成的唯一流水号
        $queryUpdateCardResponse->setCcOpId($respObject['ccOpId']??'');
        //原请求流水号
        $queryUpdateCardResponse->setRequestId($respObject['requestId']??'');
        //原请求时间
        $queryUpdateCardResponse->setRequestTime($respObject['requestTime']??'');
        //原请求商户名
        $queryUpdateCardResponse->setMerchantName($respObject['merchantName']??'');
        //响应扩展数据
        $queryUpdateCardResponse->setRespExtra($respObject['respExtra']??'');
        if (!empty($respObject['cardInfo'])) {
            $queryUpdateCardResponse->setCardLogId(($respObject['cardInfo']['cardLogId']));
            $queryUpdateCardResponse->setCardNo(DesUtils::encryptByTDES($respObject['cardInfo']['cardNo'], $rsaKey));
            $queryUpdateCardResponse->setCardVerifyNo(DesUtils::encryptByTDES($respObject['cardInfo']['cardVerifyNo'], $rsaKey));
            $queryUpdateCardResponse->setCardExpiryDate(DesUtils::encryptByTDES($respObject['cardInfo']['cardExpiryDate'], $rsaKey));

        }
        return $queryUpdateCardResponse;
    }


    static function convertQueryCloseCardResponse($respObject, $rsaKey) {
        $queryCloseCardResponse = new QueryCloseResultResponse();
        //查询状态
        $queryCloseCardResponse->setqResultStatus($respObject['qResultStatus']);
        //查询结果码
        $queryCloseCardResponse->setqResultCode($respObject['qResultCode']);
        //查询结果描述
        $queryCloseCardResponse->setqResultMsg($respObject['qResultMsg']);
        //开卡结果状态
        $queryCloseCardResponse->setResultStatus($respObject['resultstatus']);
        //开卡结果码
        $queryCloseCardResponse->setResultRespCode($respObject['resultRespCode']);
        //开卡结果码描述
        $queryCloseCardResponse->setResultRespMsg($respObject['resultRespMsg']);
        //发卡通道类型
        $queryCloseCardResponse->setChannelType($respObject['channelType']??'');
        //VCC生成的唯一流水号
        $queryCloseCardResponse->setCcOpId($respObject['ccOpId']??'');
        //原请求流水号
        $queryCloseCardResponse->setRequestId($respObject['requestId']??'');
        //原请求时间
        $queryCloseCardResponse->setRequestTime($respObject['requestTime']??'');
        //原请求商户名
        $queryCloseCardResponse->setMerchantName($respObject['merchantName']??'');
        //响应扩展数据
        $queryCloseCardResponse->setRespExtra($respObject['respExtra']??'');
        if (!empty($respObject['cardInfo'])) {
            $queryCloseCardResponse->setCardLogId(($respObject['cardInfo']['cardLogId']));

        }
        return $queryCloseCardResponse;
    }


    static function convertQueryCardInfoResponse($respObject, $rsaKey) {
        $queryCardInfoResponse = new QueryCardInfoResponse();
        //结果状态
        $queryCardInfoResponse->setResultStatus($respObject['resultstatus']);
        //结果码
        $queryCardInfoResponse->setResultRespCode($respObject['resultRespCode']);
        //结果码描述
        $queryCardInfoResponse->setResultRespMsg($respObject['resultRespMsg']);
        //请求流水号
        $queryCardInfoResponse->setRequestId($respObject['requestId']);
        //请求时间
        $queryCardInfoResponse->setRequestTime($respObject['requestTime']);
        //请求商户名
        $queryCardInfoResponse->setMerchantName($respObject['merchantName']);
        //发卡通道类型
        $queryCardInfoResponse->setChannelType($respObject['channelType']??'');
        //响应扩展数据
        $queryCardInfoResponse->setRespExtra($respObject['respExtra']??'');
        if (!empty($respObject['cardInfo'])) {
            $cardInfo = new CardInfo();
            $cardInfo->setCardLogId(($respObject['cardInfo']['cardLogId']));
            //卡号
            $cardInfo->setCardNo(DesUtils::encryptByTDES($respObject['cardInfo']['cardNo'], $rsaKey));
            //卡安全验证码CVV（3位）
            $cardInfo->setCardVerifyNo(DesUtils::encryptByTDES($respObject['cardInfo']['cardVerifyNo'], $rsaKey));
            //卡有效期 <yyyyMM>
            $cardInfo->setCardExpiryDate(DesUtils::encryptByTDES($respObject['cardInfo']['cardExpiryDate'], $rsaKey));
            //卡具体失效日期 <yyyy-MM-dd>
            $cardInfo->setCardFullExpiryDate($respObject['cardInfo']['cardFullExpiryDate']?? '');
            //卡类型
            $cardInfo->setCardType($respObject['cardInfo']['cardType']?? '');
            //卡本币种 开卡币种
            $cardInfo->setLocalCurrency($respObject['cardInfo']['localCurrency']?? '');
            //卡入账币种 结算币种
            $cardInfo->setBillCurrency($respObject['cardInfo']['billCurrency']?? '');
            //卡入账币种对应的金额
            $cardInfo->setBillCurrencyAmt($respObject['cardInfo']['billCurrencyAmt']?? 0);
            //卡生效日期 <yyyy-MM-dd>
            $cardInfo->setStartActiveDate($respObject['cardInfo']['startActiveDate']?? '');
            //最晚关卡日期 <yyyy-MM-dd>
            $cardInfo->setEndCloseDate($respObject['cardInfo']['endCloseDate']?? '');
            //卡额度
            $cardInfo->setCreditLimitAmt($respObject['cardInfo']['creditLimitAmt']);
            //卡最低可扣款金额
            $cardInfo->setMinAuthAmt($respObject['cardInfo']['minAuthAmt']);
            //卡最高可扣款金额
            $cardInfo->setMaxAuthAmt($respObject['cardInfo']['maxAuthAmt']);
            //卡余额
            $cardInfo->setBalanceAmt($respObject['cardInfo']['balanceAmt']);
            //卡总授权金额
            $cardInfo->setTotalAuthAmt($respObject['cardInfo']['totalAuthAmt']);
            //卡总清算金额
            $cardInfo->setTotalSettleAmt($respObject['cardInfo']['totalSettleAmt']);
            //卡总退款金额
            $cardInfo->setTotalRefundAmt($respObject['cardInfo']['totalRefundAmt']);
            //减去退款金额后的实际结算金额
            $cardInfo->setNetSettleAmt($respObject['cardInfo']['netSettleAmt']);
            //未结算的授权金额
            $cardInfo->setOutStandingAuthAmt($respObject['cardInfo']['outStandingAuthAmt']);
            //是否可多次使用
            $cardInfo->setEnableMutilUse($respObject['cardInfo']['enableMutilUse']);
            //自动关卡百分数设定
            $cardInfo->setClosePercentage($respObject['cardInfo']['closePercentage']);
            //商户控制方式
            $cardInfo->setMerchantControlMethod($respObject['cardInfo']['merchantControlMethod']);
            //MCC类别
            $cardInfo->setMerchantCategoryName($respObject['cardInfo']['merchantCategoryName']);
            //商户号
            $cardInfo->setMerchantCode($respObject['cardInfo']['merchantCode']);
            //是否支持3ds验证
            $cardInfo->setEnable3DS($respObject['cardInfo']['enable3DS']);
            //是否启用CVV检验
            $cardInfo->setEnaleCVVCheck($respObject['cardInfo']['enableCVVCheck']);
            //是否启用交易币种限制
            $cardInfo->setEnableCurrencyCheck($respObject['cardInfo']['enableCurrencyCheck']);
            //卡状态
            $cardInfo->setCardStatus($respObject['cardInfo']['cardStatus']);
            //用户自定义信息
            $cardInfo->setUserDefineInfo($respObject['cardInfo']['userDefineInfo']);
            $queryCardInfoResponse->setCardInfo(queryCardInfo);

        }
        
        return $queryCardInfoResponse;
    }


    static function convertQueryMerchantInfoResponse($respObject) {
        $queryMerchantInfoResponse = new QueryMerchantInfoResponse();
        //结果状态
        $queryMerchantInfoResponse->setResultStatus($respObject['resultstatus']);
        //结果码
        $queryMerchantInfoResponse->setResultRespCode($respObject['resultRespCode'] ?? '');
        //结果码描述
        $queryMerchantInfoResponse->setResultRespMsg($respObject['resultRespMsg'] ?? '');
        //请求流水号
        $queryMerchantInfoResponse->setRequestId($respObject['requestId'] ?? '');
        //请求时间
        $queryMerchantInfoResponse->setRequestTime($respObject['requestTime'] ?? '');
        //请求商户名
        $queryMerchantInfoResponse->setMerchantName($respObject['merchantName'] ?? '');
        //发卡通道类型
        $queryMerchantInfoResponse->setChannelType($respObject['channelType']?? '');
        //响应扩展数据
        $queryMerchantInfoResponse->setRespExtra($respObject['respExtra'] ?? '');
        if(!empty($respObject['merchantInfo'])){
            $merchantInfo = new MerchantInfo();
            $merchantInfo->setMerchantName($respObject['merchantInfo']['merchantName']);
            $channelInfos = Array();
            foreach ($respObject['merchantInfo']['channelInfos'] as $channelInfo) {
                $channelInfoCopy = new ChannelInfo();
                $channelInfoCopy->setChannelAuthLimitAmt($channelInfo['channelAuthLimitAmt']);
                $channelInfoCopy->setChannelCardCreditLimitAmt($channelInfo['channelCardCreditLimitAmt']);
                $channelInfoCopy->setChannelCurrencyCodeOfLimitAmt($channelInfo['channelCurrencyCodeOfLimitAmt']);
                $channelInfoCopy->setChannelRemainAuthLimitAmt($channelInfo['channelRemainAuthLimitAmt']);
                $channelInfoCopy->setChannelRemainCardCreditLimitAmt($channelInfo['channelRemainCardCreditLimitAmt']);
                $channelInfoCopy->setChannelType($channelInfo['channelType']);
                array_push($channelInfos, $channelInfoCopy);
            }
            $merchantInfo->setChannelInfos($channelInfos);
            $queryMerchantInfoResponse->setMerchantInfo($merchantInfo);

        }
        return $queryMerchantInfoResponse;
    }


    static function convertQueryAuthTransInfoResponse($respObject) {
        $queryAuthTransInfoResponse = new QueryAuthTransInfoResponse();
        //结果状态
        $queryAuthTransInfoResponse->setResultStatus($respObject['resultstatus']);
        //结果码
        $queryAuthTransInfoResponse->setResultRespCode($respObject['resultRespCode']);
        //结果码描述
        $queryAuthTransInfoResponse->setResultRespMsg($respObject['resultRespMsg']);
        //请求流水号
        $queryAuthTransInfoResponse->setRequestId($respObject['requestId']);
        //请求时间
        $queryAuthTransInfoResponse->setRequestTime($respObject['requestTime']);
        //请求商户名
        $queryAuthTransInfoResponse->setMerchantName($respObject['merchantName'] ?? '');
        //发卡通道类型
        $queryAuthTransInfoResponse->setChannelType($respObject['channelType'] ?? '');
        if(!empty($respObject['authInfoResp'])){
            $authInfoRespObject = $respObject['authInfoResp'];
            $authInfoResp = new AuthInfoResp();
            $authInfoResp->setBalanceAmt($authInfoRespObject['balanceAmt']);
            $authInfoResp->setTotalCount($authInfoRespObject['totalCount']);
            if (!empty($authInfoRespObject['authInfos'])) {
                $authInfos = Array();
                foreach($authInfoRespObject['authInfos'] as $authInfo) {
                    $authInfoCopy = new AuthInfo();
                    $authInfoCopy->setApproveCode($authInfo['approveCode']??'');
                    $authInfoCopy->setCountryCode($authInfo['countryCode']?? '');
                    $authInfoCopy->setDeclineReason($authInfo['declineReason']??'');
                    $authInfoCopy->setLocalCurrency($authInfo['localCurrency']??'');
                    $authInfoCopy->setLocalCurrencyAmt($authInfo['localCurrencyAmt']??'');
                    $authInfoCopy->setMessageType($authInfo['messageType']??'');
                    $authInfoCopy->setMessageTypeDesc($authInfo['messageTypeDesc']??'');
                    $authInfoCopy->setOccurTime($authInfo['occurTime']??'');
                    $authInfoCopy->setRespCode($authInfo['respCode']??'');
                    $authInfoCopy->setRespCodeDesc($authInfo['respCodeDesc']??'');
                    $authInfoCopy->setStatus($authInfo['status']?? '');
                    $authInfoCopy->setTransCurrency($authInfo['transCurrency']??'');
                    $authInfoCopy->setTransCurrencyAmt($authInfo['transCurrencyAmt']??'');
                    $authInfoCopy->setTransId($authInfo['transId']);
                    if (!empty($authInfo['transMerchantInfo'])) {
                        $transMerchantData = $authInfo['transMerchantInfo'];
                        $transMerchantInfo = new TransMerchantInfo();
                        $transMerchantInfo->setMerchantCategoryCode($transMerchantData['merchantCategoryCode']??'');
                        $transMerchantInfo->setMerchantCity($transMerchantData['merchantCity']??'');
                        $transMerchantInfo->setMerchantCountryCode($transMerchantData['merchantCountryCode']??'');
                        $transMerchantInfo->setMerchantDesc($transMerchantData['merchantDesc']??'');
                        $transMerchantInfo->setMerchantName($transMerchantData['merchantName']??'');
                        $transMerchantInfo->setMerchantState($transMerchantData['merchantState']??'');
                        $transMerchantInfo->setMerchantZipCode($transMerchantData['merchantZipCode']??'');
                        $authInfoCopy->setTransMerchantInfo($transMerchantInfo);
                    }
                    $authInfoCopy->setTransExtra($authInfo['transExtra']??'');
                    array_push($authInfos, $authInfoCopy);
                }
                $authInfoResp->setAuthInfos($authInfos);
            }
            $queryAuthTransInfoResponse->setAuthInfoResp($authInfoResp);
        }
        return $queryAuthTransInfoResponse;
    }

    static function convertQuerySettlementTransInfoResponse($respObject) {
        $querySettlementTransInfoResponse = new QuerySettlementTransInfoResponse();
        //结果状态
        $querySettlementTransInfoResponse->setResultStatus($respObject['resultstatus']);
        //结果码
        $querySettlementTransInfoResponse->setResultRespCode($respObject['resultRespCode']);
        //结果码描述
        $querySettlementTransInfoResponse->setResultRespMsg($respObject['resultRespMsg']);
        //请求流水号
        $querySettlementTransInfoResponse->setRequestId($respObject['requestId']);
        //请求时间
        $querySettlementTransInfoResponse->setRequestTime($respObject['requestTime']);
        //请求商户名
        $querySettlementTransInfoResponse->setMerchantName($respObject['merchantName'] ?? '');
        //发卡通道类型
        $querySettlementTransInfoResponse->setChannelType($respObject['channelType'] ?? '');
        if(!empty($respObject['settlementInfoResp'])){
            $settlementInfoRespObject = $respObject['settlementInfoResp'];
            $settlementInfoResp = new SettlementInfoResp();
            $settlementInfoResp->setBalanceAmt($settlementInfoRespObject['balanceAmt']);
            $settlementInfoResp->setTotalCount($settlementInfoRespObject['totalCount']);
            if (!empty($settlementInfoRespObject['settlementInfos'])) {
                $settlementInfos = Array();
                foreach($settlementInfoRespObject['settlementInfos'] as $settlementInfo) {
                    $settlementInfoCopy = new SettlementInfo();
                    $settlementInfoCopy->setOccurTime($settlementInfo['occurTime']??'');
                    $settlementInfoCopy->setPostDate($settlementInfo['postDate']??'');
                    $settlementInfoCopy->setSettleDate($settlementInfo['settleDate']??'');
                    $settlementInfoCopy->setTransCurrency($settlementInfo['transCurrency']??'');
                    $settlementInfoCopy->setTransAmt($settlementInfo['transAmt']??'');
                    $settlementInfoCopy->setLocalCurrency($settlementInfo['localCurrency']??'');
                    $settlementInfoCopy->setLocalCurrencyAmt($settlementInfo['localCurrencyAmt']??'');
                    $settlementInfoCopy->setBillCurrency($settlementInfo['billCurrency']?? '');
                    $settlementInfoCopy->setBillCurrencyAmt($settlementInfo['billCurrencyAmt']??'');
                    $settlementInfoCopy->setOriginalBillCurrencyAmt($settlementInfo['originalBillCurrencyAmt']??'');
                    $settlementInfoCopy->setTransType($settlementInfo['transType']??'');
                    $settlementInfoCopy->setTransCode($settlementInfo['transCode']??'');

                    $settlementInfoCopy->setAuthNo($settlementInfo['authNo']??'');

                    $settlementInfoCopy->setTransNo($settlementInfo['transNo']??'');

                    $settlementInfoCopy->setIsCredit($settlementInfo['isCredit']??'');
                    if (!empty($settlementInfo['transMerchantInfo'])) {
                        $transMerchantData = $settlementInfo['transMerchantInfo'];
                        $transMerchantInfo = new TransMerchantInfo();
                        $transMerchantInfo->setMerchantCategoryCode($transMerchantData['merchantCategoryCode']??'');
                        $transMerchantInfo->setMerchantCity($transMerchantData['merchantCity']??'');
                        $transMerchantInfo->setMerchantCountryCode($transMerchantData['merchantCountryCode']??'');
                        $transMerchantInfo->setMerchantDesc($transMerchantData['merchantDesc']??'');
                        $transMerchantInfo->setMerchantName($transMerchantData['merchantName']??'');
                        $transMerchantInfo->setMerchantState($transMerchantData['merchantState']??'');
                        $transMerchantInfo->setMerchantZipCode($transMerchantData['merchantZipCode']??'');
                        $settlementInfoCopy->setTransMerchantInfo($transMerchantInfo);
                    }
                    $settlementInfoCopy->setTransExtra($authInfo['transExtra']??'');
                    array_push($settlementInfos, $settlementInfoCopy);
                }
                $settlementInfoResp->setSettlementInfos($settlementInfos);
            }
            $querySettlementTransInfoResponse->setSettlementInfoResp($settlementInfoResp);
        }
        return $querySettlementTransInfoResponse;
    }
}
?>