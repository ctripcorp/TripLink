<?php
require_once __DIR__ . '/../vendor/autoload.php';

use PHPUnit\Framework\TestCase;

require_once(__DIR__ . '/../src/triplink/vcc/card/client/CardOperation.php');
require_once(__DIR__ . '/../src/triplink/vcc/card/client/operate/CreateCardRequest.php');
require_once(__DIR__ . '/../src/triplink/vcc/card/client/operate/CreateCardInfo.php');
require_once(__DIR__ . '/../src/triplink/vcc/card/client/operate/UpdateCardRequest.php');
require_once(__DIR__ . '/../src/triplink/vcc/card/client/operate/UpdateCardInfo.php');


use triplink\vcc\card\client\CardOperation;
use triplink\vcc\card\client\operate\CreateCardRequest;
use triplink\vcc\card\client\operate\UpdateCardRequest;
use triplink\vcc\card\client\operate\CreateCardInfo;
use triplink\vcc\card\client\operate\UpdateCardInfo;


class Test extends TestCase
{


    public function test()
    {

        $URL = "https://openpci.fws.ctripqa.com/restful/soa2/18375/json";

        $PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAKpQrSAzyJV0MfBN7qKvE8d73phdredNhF3cKm3IWKFlCWg/3alVWI6GE462rPc5A4T+shYcvzqhV5wSOS0QMfj9VfLPqUT+xggFcCQ48mbeX4Jy/N5QZB3RZuQu+YbmQT6f54h2sJvhqLurvE7sgW4qL7r6AaJfDsvYPjKSezYXAgMBAAECgYA32EY8Jd6iarwpMFSMEV4p7craKPVpv3gkkply79tn6EpCXZaf/HUSHpJxHCLw2Uf3JtBcAccOQXMJoMwQo5vOoMVl5nk+EZN//MB8Re8r/7GQV8E+myHdlntMjxOf38PGn9z8Ze0Q020fZwGjA6egBFcU/ld1lCcI0TAj3cZDcQJBANS9UOC3J5njhnuzACjQ1qTTXuv6hr2lbglr2za4Ju9xFJUkKXy2LBAp2LlakXZXDhf7lsqmwZg5BvOBK6DPl18CQQDM8tqqOr4LRJRhq2bqBx398IqtyoZpMshpzBXLr7bdhp7FR2N4AEoAGaa5hS5k3z5SYNLEGKFhRM+sFJBQjnRJAkBnq647I+YffxotM8jTGxpOjlbGhnqc9n4OB0p3evw2WRPfrhStmpUUd2AOy4zxb3EFzOvp66OSC9BQX9Uj86XfAkEAouGbgVDgOupNFvZ2+yWe43Ppc0eS3UZ72wFUjSXgKlzUECu1VOi95yh7xdOf1JFL4YKL30dH8psShUtuimc86QJAeBXASabJBcHAIisPkODvsciiz1pzm1WSuXRUxnuis0TRTRs7+2KEnWE4UV3jxehxkc1RAgteYosWXg5TWQgiUg==";

        $RSA_KEY = "Wa8Nw*Ei";
        $cardCard = new CreateCardRequest();
        $cardCard->setRequestId("20210721105555017");
        $cardCard->setRequestTime("20210721110050");
        $cardCard->setMerchantName("WANWEI");
        $cardCard->setChannelType("WANWEI_CFNC_VCC");
        $cardCard->setOperator("max");
        $cardCard->setRequestSource("goldenwater");

        $createCardInfo = new CreateCardInfo();
        $createCardInfo->setLocalCurrency("USD");
        $createCardInfo->setBillCurrency("USD");
        $createCardInfo->setStartActiveDate("2021-07-27");
        $createCardInfo->setEndCloseDate("2021-08-27");
        $createCardInfo->setCreditLimitAmt(120.05);
        $createCardInfo->setMinAuthAmt(0.00);
        $createCardInfo->setMaxAuthAmt(120.05);
        $createCardInfo->setEnableMutilUse("1");
        $createCardInfo->setClosePercentage(100);
        $createCardInfo->setEnable3DS("0");
        $createCardInfo->setEnableCurrencyCheck("0");

        $createCardInfo->setUserDefineInfo("{\"BookingNumber\":\"0d4a88ac-690f-7123-4930-17a831c41a49\"}");

        $cardCard->setCardInfo($createCardInfo);
        $cardOperation = new CardOperation($URL, $PRIVATE_KEY, $RSA_KEY);
        $cardOperation->createCard($cardCard);

    }

//   public function test()
//   {
//       $URL = "https://openpci.fws.ctripqa.com/restful/soa2/18375/json";
//
//       $PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAKpQrSAzyJV0MfBN7qKvE8d73phdredNhF3cKm3IWKFlCWg/3alVWI6GE462rPc5A4T+shYcvzqhV5wSOS0QMfj9VfLPqUT+xggFcCQ48mbeX4Jy/N5QZB3RZuQu+YbmQT6f54h2sJvhqLurvE7sgW4qL7r6AaJfDsvYPjKSezYXAgMBAAECgYA32EY8Jd6iarwpMFSMEV4p7craKPVpv3gkkply79tn6EpCXZaf/HUSHpJxHCLw2Uf3JtBcAccOQXMJoMwQo5vOoMVl5nk+EZN//MB8Re8r/7GQV8E+myHdlntMjxOf38PGn9z8Ze0Q020fZwGjA6egBFcU/ld1lCcI0TAj3cZDcQJBANS9UOC3J5njhnuzACjQ1qTTXuv6hr2lbglr2za4Ju9xFJUkKXy2LBAp2LlakXZXDhf7lsqmwZg5BvOBK6DPl18CQQDM8tqqOr4LRJRhq2bqBx398IqtyoZpMshpzBXLr7bdhp7FR2N4AEoAGaa5hS5k3z5SYNLEGKFhRM+sFJBQjnRJAkBnq647I+YffxotM8jTGxpOjlbGhnqc9n4OB0p3evw2WRPfrhStmpUUd2AOy4zxb3EFzOvp66OSC9BQX9Uj86XfAkEAouGbgVDgOupNFvZ2+yWe43Ppc0eS3UZ72wFUjSXgKlzUECu1VOi95yh7xdOf1JFL4YKL30dH8psShUtuimc86QJAeBXASabJBcHAIisPkODvsciiz1pzm1WSuXRUxnuis0TRTRs7+2KEnWE4UV3jxehxkc1RAgteYosWXg5TWQgiUg==";
//
//       $RSA_KEY = "Wa8Nw*Ei";
//       $updateRequest = new UpdateCardRequest();
//       $updateRequest->setRequestId("update20210728224700011");
//       $updateRequest->setRequestTime("20210728225550");
//       $updateRequest->setMerchantName("WANWEI");
//       $updateRequest->setChannelType("WANWEI_CFNC_VCC");
//       $updateRequest->setOperator("max");
//       $updateRequest->setRequestSource("goldenwater");
//
//       $updateCardInfo = new UpdateCardInfo();
//
//       $updateCardInfo->setCardLogId("880d1f7b0336d62bf96e795fa81fc1e29d3beb3b1cdc97cf4554414a4ce4db93");
//       $updateCardInfo->setStartActiveDate("2023-07-28");
//       $updateCardInfo->setEndCloseDate("2023-07-28");
//       $updateCardInfo->setCreditLimitAmt(3200.00);
//       $updateCardInfo->setMinAuthAmt(0.00);
//       $updateCardInfo->setMaxAuthAmt(3200.00);
//       $updateCardInfo->setClosePercentage(90);
//       $updateCardInfo->setEnable3DS("0");
//       $updateCardInfo->setEnaleCVVCheck("0");
//       $updateCardInfo->setEnableCurrencyCheck("0");
//       $updateCardInfo->setMerchantCategoryName("0011");
//       $updateCardInfo->setUserDefineInfo("{\"BookingNumber\":\"0d4a88ac-690f-7123-4930-17a831c41a49\"}");
//       $updateRequest->setCardInfo($updateCardInfo);
//       $cardOperation = new CardOperation($URL, $PRIVATE_KEY, $RSA_KEY);
//       $cardOperation->updateCard($updateRequest);
//   }

}