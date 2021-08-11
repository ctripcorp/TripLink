<?php
namespace triplink\vcc\card\utils;

require_once(__DIR__. '/../utils/RsaUtils.php');
require_once(__DIR__. '/../client/operate/OperateRequest.php');


use triplink\vcc\card\client\operate\OperateRequest;

use triplink\vcc\card\client\query\QueryOperateRequest;
use triplink\vcc\card\client\query\QueryInfoRequest;
use triplink\vcc\card\client\query\QueryTransInfoRequest;


class SignUtils {
    
    static function buildSign($request, $primaryKey) {
        $baseData = SignUtils::buildSignBaseData($request);
        print_r($baseData);
        return RsaUtils::generateSign($baseData, $primaryKey);
        
    }
    
    static function buildSignBaseData($request) {
        if ($request instanceof OperateRequest) {
            $baseData = '';
            $baseData = $baseData.$request->getRequestId().$request->getRequestTime().$request->getRequestType().$request->getSubRequestType()
            .$request->getMerchantName();
            
            if (!empty($request->getChannelType())) {
                $baseData = $baseData.$request->getChannelType();              
            }
            if (!empty($request->getCardInfo())) {
                $cardInfo = $request->getCardInfo();
                if (!empty($cardInfo->getCardLogId())) {
                    $baseData = $baseData.$cardInfo->getCardLogId();
                }
                if (!empty($cardInfo->getCardNo())) {
                    $baseData = $baseData.$cardInfo->getCardNo();
                }
                if (!empty($cardInfo->getLocalCurrency())) {
                    $baseData = $baseData.$cardInfo->getLocalCurrency();
                }
                if (!empty($cardInfo->getBillCurrency())) {
                    $baseData = $baseData.$cardInfo->getBillCurrency();
                }
                if (!empty($cardInfo->getStartActiveDate())) {
                    $baseData = $baseData.$cardInfo->getStartActiveDate();
                }
                if (!empty($cardInfo->getEndCloseDate())) {
                    $baseData = $baseData.$cardInfo->getEndCloseDate();
                }
                if (is_numeric($cardInfo->getCreditLimitAmt())) {
                    $baseData = $baseData.$cardInfo->getCreditLimitAmt();
                }
                
                if (is_numeric($cardInfo->getMinAuthAmt())) {
                    $baseData = $baseData.$cardInfo->getMinAuthAmt();
                    
                }
                if (is_numeric($cardInfo->getMaxAuthAmt())) {
                    $baseData = $baseData.$cardInfo->getMaxAuthAmt();
                }
            }
            return $baseData;
        }elseif ($request instanceof QueryOperateRequest) {
            $baseData = '';
            $baseData = $baseData.$request->getRequestId();
            if (!empty($request->getRequestTime())) {
                $baseData = $baseData.$request->getRequestTime();
            }
            if (!empty($request->getRequestType())) {
                $baseData = $baseData.$request->getRequestType();
            }
            if (!empty($request->getSubRequestType())) {
                $baseData = $baseData.$request->getSubRequestType();
            }
            $baseData = $baseData.$request->getMerchantName();
            return $baseData;
        }elseif ($request instanceof QueryInfoRequest) {
            $baseData = '';
            $baseData = $baseData.$request->getRequestId();
            $baseData = $baseData.$request->getRequestTime();
            $baseData = $baseData.$request->getRequestType();
            $baseData = $baseData.$request->getSubRequestType();
            $baseData = $baseData.$request->getMerchantName();
            $baseData = $baseData.$request->getChannelType();

            if (!empty($request->getCardInfo())) {
                $cardInfo = $request->getCardInfo();
                if (!empty($cardInfo->getCardLogId())) {
                    $baseData = $baseData.$cardInfo->getCardLogId();
                }
                if (!empty($cardInfo->getCardNo())) {
                    $baseData = $baseData.$cardInfo->getCardNo();
                }
            }
            return $baseData;
        }elseif($request instanceof QueryTransInfoRequest) {
            $baseData = '';
            $baseData = $baseData.$request->getRequestId();
            $baseData = $baseData.$request->getRequestTime();
            $baseData = $baseData.$request->getRequestType();
            $baseData = $baseData.$request->getSubRequestType();
            $baseData = $baseData.$request->getMerchantName();
            $baseData = $baseData.$request->getChannelType();
            if (!empty($request->getCardInfo())) {
                $cardInfo = $request->getCardInfo();
                if (!empty($cardInfo->getCardLogId())) {
                    $baseData = $baseData . $cardInfo->getCardLogId();
                }
                if (!empty($cardInfo->getCardNo())) {
                    $baseData = $baseData . $cardInfo->getCardNo();
                }
            }
            return $baseData;
        }
    }
}
?>