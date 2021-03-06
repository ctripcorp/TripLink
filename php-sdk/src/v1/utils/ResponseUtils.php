<?php
namespace triplink\vcc\card\utils;

use triplink\vcc\card\client\CardInfo;
use triplink\vcc\card\client\operate\CloseCardResponse;
use triplink\vcc\card\client\operate\CreateCardResponse;
use triplink\vcc\card\client\operate\UpdateCardResponse;
use triplink\vcc\card\client\query\AuthInfo;
use triplink\vcc\card\client\query\AuthInfoResp;
use triplink\vcc\card\client\query\ChannelInfo;
use triplink\vcc\card\client\query\MerchantInfo;
use triplink\vcc\card\client\query\QueryAuthTransInfoResponse;
use triplink\vcc\card\client\query\QueryCardInfoResponse;
use triplink\vcc\card\client\query\QueryCloseResultResponse;
use triplink\vcc\card\client\query\QueryCreateResultResponse;
use triplink\vcc\card\client\query\QueryMerchantInfoResponse;
use triplink\vcc\card\client\query\QuerySettlementTransInfoResponse;
use triplink\vcc\card\client\query\QueryUpdateResultResponse;
use triplink\vcc\card\client\query\SettlementInfo;
use triplink\vcc\card\client\query\SettlementInfoResp;
use triplink\vcc\card\client\query\TransMerchantInfo;


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
        //????????????
        $closeResponse->setResultStatus($respObject['resultstatus']);
        //?????????
        $closeResponse->setResultRespCode($respObject['resultRespCode']);
        //???????????????
        $closeResponse->setResultRespMsg($respObject['resultRespMsg']);
        //??????????????????
        $closeResponse->setChannelType($respObject['channelType']);
        //VCC????????????????????????
        $closeResponse->setCcOpId($respObject['ccOpId']??'');
        //??????????????????
        $closeResponse->setRequestId($respObject['requestId']);
        //???????????????
        $closeResponse->setRequestTime($respObject['requestTime']);
        //??????????????????
        $closeResponse->setMerchantName($respObject['merchantName']??'');
        //??????????????????
        $closeResponse->setRespExtra($respObject['respExtra']??'');
        if (!empty($respObject['cardInfo'])) {
            $closeResponse->setCardLogId(($respObject['cardInfo']['cardLogId']));
        }
        return $closeResponse;

    }


    static function convertQueryCreateCardResponse($respObject, $rsaKey) {
        $queryCreateCardResponse = new QueryCreateResultResponse();
        //????????????
        $queryCreateCardResponse->setqResultStatus($respObject['qResultStatus']);
        //???????????????
        $queryCreateCardResponse->setqResultCode($respObject['qResultCode']);
        //??????????????????
        $queryCreateCardResponse->setqResultMsg($respObject['qResultMsg']);
        //??????????????????
        $queryCreateCardResponse->setResultStatus($respObject['resultstatus']);
        //???????????????
        $queryCreateCardResponse->setResultRespCode($respObject['resultRespCode']);
        //?????????????????????
        $queryCreateCardResponse->setResultRespMsg($respObject['resultRespMsg']);
        //??????????????????
        $queryCreateCardResponse->setChannelType($respObject['channelType']??'');
        //VCC????????????????????????
        $queryCreateCardResponse->setCcOpId($respObject['ccOpId']??'');
        //??????????????????
        $queryCreateCardResponse->setRequestId($respObject['requestId']??'');
        //???????????????
        $queryCreateCardResponse->setRequestTime($respObject['requestTime']??'');
        //??????????????????
        $queryCreateCardResponse->setMerchantName($respObject['merchantName']??'');
        //??????????????????
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
        //????????????
        $queryUpdateCardResponse->setqResultStatus($respObject['qResultStatus']);
        //???????????????
        $queryUpdateCardResponse->setqResultCode($respObject['qResultCode']);
        //??????????????????
        $queryUpdateCardResponse->setqResultMsg($respObject['qResultMsg']);
        //??????????????????
        $queryUpdateCardResponse->setResultStatus($respObject['resultstatus']);
        //???????????????
        $queryUpdateCardResponse->setResultRespCode($respObject['resultRespCode']);
        //?????????????????????
        $queryUpdateCardResponse->setResultRespMsg($respObject['resultRespMsg']);
        //??????????????????
        $queryUpdateCardResponse->setChannelType($respObject['channelType']??'');
        //VCC????????????????????????
        $queryUpdateCardResponse->setCcOpId($respObject['ccOpId']??'');
        //??????????????????
        $queryUpdateCardResponse->setRequestId($respObject['requestId']??'');
        //???????????????
        $queryUpdateCardResponse->setRequestTime($respObject['requestTime']??'');
        //??????????????????
        $queryUpdateCardResponse->setMerchantName($respObject['merchantName']??'');
        //??????????????????
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
        //????????????
        $queryCloseCardResponse->setqResultStatus($respObject['qResultStatus']);
        //???????????????
        $queryCloseCardResponse->setqResultCode($respObject['qResultCode']);
        //??????????????????
        $queryCloseCardResponse->setqResultMsg($respObject['qResultMsg']);
        //??????????????????
        $queryCloseCardResponse->setResultStatus($respObject['resultstatus']);
        //???????????????
        $queryCloseCardResponse->setResultRespCode($respObject['resultRespCode']);
        //?????????????????????
        $queryCloseCardResponse->setResultRespMsg($respObject['resultRespMsg']);
        //??????????????????
        $queryCloseCardResponse->setChannelType($respObject['channelType']??'');
        //VCC????????????????????????
        $queryCloseCardResponse->setCcOpId($respObject['ccOpId']??'');
        //??????????????????
        $queryCloseCardResponse->setRequestId($respObject['requestId']??'');
        //???????????????
        $queryCloseCardResponse->setRequestTime($respObject['requestTime']??'');
        //??????????????????
        $queryCloseCardResponse->setMerchantName($respObject['merchantName']??'');
        //??????????????????
        $queryCloseCardResponse->setRespExtra($respObject['respExtra']??'');
        if (!empty($respObject['cardInfo'])) {
            $queryCloseCardResponse->setCardLogId(($respObject['cardInfo']['cardLogId']));

        }
        return $queryCloseCardResponse;
    }


    static function convertQueryCardInfoResponse($respObject, $rsaKey) {
        $queryCardInfoResponse = new QueryCardInfoResponse();
        //????????????
        $queryCardInfoResponse->setResultStatus($respObject['resultstatus']);
        //?????????
        $queryCardInfoResponse->setResultRespCode($respObject['resultRespCode']);
        //???????????????
        $queryCardInfoResponse->setResultRespMsg($respObject['resultRespMsg']);
        //???????????????
        $queryCardInfoResponse->setRequestId($respObject['requestId']);
        //????????????
        $queryCardInfoResponse->setRequestTime($respObject['requestTime']);
        //???????????????
        $queryCardInfoResponse->setMerchantName($respObject['merchantName']);
        //??????????????????
        $queryCardInfoResponse->setChannelType($respObject['channelType']??'');
        //??????????????????
        $queryCardInfoResponse->setRespExtra($respObject['respExtra']??'');
        if (!empty($respObject['cardInfo'])) {
            $cardInfo = new CardInfo();
            $cardInfo->setCardLogId(($respObject['cardInfo']['cardLogId']));
            //??????
            $cardInfo->setCardNo(DesUtils::encryptByTDES($respObject['cardInfo']['cardNo'], $rsaKey));
            //??????????????????CVV???3??????
            $cardInfo->setCardVerifyNo(DesUtils::encryptByTDES($respObject['cardInfo']['cardVerifyNo'], $rsaKey));
            //???????????? <yyyyMM>
            $cardInfo->setCardExpiryDate(DesUtils::encryptByTDES($respObject['cardInfo']['cardExpiryDate'], $rsaKey));
            //????????????????????? <yyyy-MM-dd>
            $cardInfo->setCardFullExpiryDate($respObject['cardInfo']['cardFullExpiryDate']?? '');
            //?????????
            $cardInfo->setCardType($respObject['cardInfo']['cardType']?? '');
            //???????????? ????????????
            $cardInfo->setLocalCurrency($respObject['cardInfo']['localCurrency']?? '');
            //??????????????? ????????????
            $cardInfo->setBillCurrency($respObject['cardInfo']['billCurrency']?? '');
            //??????????????????????????????
            $cardInfo->setBillCurrencyAmt($respObject['cardInfo']['billCurrencyAmt']?? 0);
            //??????????????? <yyyy-MM-dd>
            $cardInfo->setStartActiveDate($respObject['cardInfo']['startActiveDate']?? '');
            //?????????????????? <yyyy-MM-dd>
            $cardInfo->setEndCloseDate($respObject['cardInfo']['endCloseDate']?? '');
            //?????????
            $cardInfo->setCreditLimitAmt($respObject['cardInfo']['creditLimitAmt']);
            //????????????????????????
            $cardInfo->setMinAuthAmt($respObject['cardInfo']['minAuthAmt']);
            //????????????????????????
            $cardInfo->setMaxAuthAmt($respObject['cardInfo']['maxAuthAmt']);
            //?????????
            $cardInfo->setBalanceAmt($respObject['cardInfo']['balanceAmt']);
            //??????????????????
            $cardInfo->setTotalAuthAmt($respObject['cardInfo']['totalAuthAmt']);
            //??????????????????
            $cardInfo->setTotalSettleAmt($respObject['cardInfo']['totalSettleAmt']);
            //??????????????????
            $cardInfo->setTotalRefundAmt($respObject['cardInfo']['totalRefundAmt']);
            //??????????????????????????????????????????
            $cardInfo->setNetSettleAmt($respObject['cardInfo']['netSettleAmt']);
            //????????????????????????
            $cardInfo->setOutStandingAuthAmt($respObject['cardInfo']['outStandingAuthAmt']);
            //?????????????????????
            $cardInfo->setEnableMutilUse($respObject['cardInfo']['enableMutilUse']);
            //???????????????????????????
            $cardInfo->setClosePercentage($respObject['cardInfo']['closePercentage']);
            //??????????????????
            $cardInfo->setMerchantControlMethod($respObject['cardInfo']['merchantControlMethod']);
            //MCC??????
            $cardInfo->setMerchantCategoryName($respObject['cardInfo']['merchantCategoryName']);
            //?????????
            $cardInfo->setMerchantCode($respObject['cardInfo']['merchantCode']);
            //????????????3ds??????
            $cardInfo->setEnable3DS($respObject['cardInfo']['enable3DS']);
            //????????????CVV??????
            $cardInfo->setEnaleCVVCheck($respObject['cardInfo']['enableCVVCheck']);
            //??????????????????????????????
            $cardInfo->setEnableCurrencyCheck($respObject['cardInfo']['enableCurrencyCheck']);
            //?????????
            $cardInfo->setCardStatus($respObject['cardInfo']['cardStatus']);
            //?????????????????????
            $cardInfo->setUserDefineInfo($respObject['cardInfo']['userDefineInfo']);
            $queryCardInfoResponse->setCardInfo(queryCardInfo);

        }
        
        return $queryCardInfoResponse;
    }


    static function convertQueryMerchantInfoResponse($respObject) {
        $queryMerchantInfoResponse = new QueryMerchantInfoResponse();
        //????????????
        $queryMerchantInfoResponse->setResultStatus($respObject['resultstatus']);
        //?????????
        $queryMerchantInfoResponse->setResultRespCode($respObject['resultRespCode'] ?? '');
        //???????????????
        $queryMerchantInfoResponse->setResultRespMsg($respObject['resultRespMsg'] ?? '');
        //???????????????
        $queryMerchantInfoResponse->setRequestId($respObject['requestId'] ?? '');
        //????????????
        $queryMerchantInfoResponse->setRequestTime($respObject['requestTime'] ?? '');
        //???????????????
        $queryMerchantInfoResponse->setMerchantName($respObject['merchantName'] ?? '');
        //??????????????????
        $queryMerchantInfoResponse->setChannelType($respObject['channelType']?? '');
        //??????????????????
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
        //????????????
        $queryAuthTransInfoResponse->setResultStatus($respObject['resultstatus']);
        //?????????
        $queryAuthTransInfoResponse->setResultRespCode($respObject['resultRespCode']);
        //???????????????
        $queryAuthTransInfoResponse->setResultRespMsg($respObject['resultRespMsg']);
        //???????????????
        $queryAuthTransInfoResponse->setRequestId($respObject['requestId']);
        //????????????
        $queryAuthTransInfoResponse->setRequestTime($respObject['requestTime']);
        //???????????????
        $queryAuthTransInfoResponse->setMerchantName($respObject['merchantName'] ?? '');
        //??????????????????
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
        //????????????
        $querySettlementTransInfoResponse->setResultStatus($respObject['resultstatus']);
        //?????????
        $querySettlementTransInfoResponse->setResultRespCode($respObject['resultRespCode']);
        //???????????????
        $querySettlementTransInfoResponse->setResultRespMsg($respObject['resultRespMsg']);
        //???????????????
        $querySettlementTransInfoResponse->setRequestId($respObject['requestId']);
        //????????????
        $querySettlementTransInfoResponse->setRequestTime($respObject['requestTime']);
        //???????????????
        $querySettlementTransInfoResponse->setMerchantName($respObject['merchantName'] ?? '');
        //??????????????????
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