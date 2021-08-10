<?php
require_once __DIR__ . '/../vendor/autoload.php';

use PHPUnit\Framework\TestCase;

require_once(__DIR__ . '/../src/triplink/vcc/card/client/CardOperation.php');
require_once(__DIR__ . '/../src/triplink/vcc/card/client/operate/CreateCardRequest.php');
require_once(__DIR__ . '/../src/triplink/vcc/card/client/operate/CloseCardRequest.php');

require_once(__DIR__ . '/../src/triplink/vcc/card/client/operate/CreateCardInfo.php');
require_once(__DIR__ . '/../src/triplink/vcc/card/client/operate/UpdateCardRequest.php');
require_once(__DIR__ . '/../src/triplink/vcc/card/client/operate/UpdateCardInfo.php');


use triplink\vcc\card\client\CardOperation;
use triplink\vcc\card\client\operate\CreateCardRequest;
use triplink\vcc\card\client\operate\UpdateCardRequest;
use triplink\vcc\card\client\operate\CloseCardRequest;
use triplink\vcc\card\client\operate\CreateCardInfo;
use triplink\vcc\card\client\operate\UpdateCardInfo;


class DeleteTest extends TestCase
{


    public function test()
    {
        $URL = "https://openpci.fws.ctripqa.com/restful/soa2/18375/json";

        $PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAKpQrSAzyJV0MfBN7qKvE8d73phdredNhF3cKm3IWKFlCWg/3alVWI6GE462rPc5A4T+shYcvzqhV5wSOS0QMfj9VfLPqUT+xggFcCQ48mbeX4Jy/N5QZB3RZuQu+YbmQT6f54h2sJvhqLurvE7sgW4qL7r6AaJfDsvYPjKSezYXAgMBAAECgYA32EY8Jd6iarwpMFSMEV4p7craKPVpv3gkkply79tn6EpCXZaf/HUSHpJxHCLw2Uf3JtBcAccOQXMJoMwQo5vOoMVl5nk+EZN//MB8Re8r/7GQV8E+myHdlntMjxOf38PGn9z8Ze0Q020fZwGjA6egBFcU/ld1lCcI0TAj3cZDcQJBANS9UOC3J5njhnuzACjQ1qTTXuv6hr2lbglr2za4Ju9xFJUkKXy2LBAp2LlakXZXDhf7lsqmwZg5BvOBK6DPl18CQQDM8tqqOr4LRJRhq2bqBx398IqtyoZpMshpzBXLr7bdhp7FR2N4AEoAGaa5hS5k3z5SYNLEGKFhRM+sFJBQjnRJAkBnq647I+YffxotM8jTGxpOjlbGhnqc9n4OB0p3evw2WRPfrhStmpUUd2AOy4zxb3EFzOvp66OSC9BQX9Uj86XfAkEAouGbgVDgOupNFvZ2+yWe43Ppc0eS3UZ72wFUjSXgKlzUECu1VOi95yh7xdOf1JFL4YKL30dH8psShUtuimc86QJAeBXASabJBcHAIisPkODvsciiz1pzm1WSuXRUxnuis0TRTRs7+2KEnWE4UV3jxehxkc1RAgteYosWXg5TWQgiUg==";

        $RSA_KEY = "Wa8Nw*Ei";

        $closeRequest = new CloseCardRequest();
        $closeRequest->setRequestId("close20210728224700002");
        $closeRequest->setRequestTime("20210728230050");
        $closeRequest->setMerchantName("WANWEI");
        $closeRequest->setChannelType("WANWEI_CFNC_VCC");
        $closeRequest->setOperator("max");
        $closeRequest->setRequestSource("goldenwater");
        $closeRequest->setCardLogId("a7558f115f25893d3588d9fc3ecab8e8b887bc92e82f4c3e2ba3d4e239a6e9b9");

        $cardOperation = new CardOperation($URL, $PRIVATE_KEY, $RSA_KEY);
        $cardOperation->closeCard($closeRequest);
    }

}