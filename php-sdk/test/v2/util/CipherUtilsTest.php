<?php declare(strict_types=1);

namespace v2\util;

use PHPUnit\Framework\TestCase;

const TRIPLINK_PUBLIC_KEY = 'MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzGuvnpECqBJlD2Rk8eQ3BiNJn6TglMxC+BIzj7g2xOBF1wrn7vDgO40uNwF42SSDbQ2eb9lOyslhFlNZFeasCwKFLQ/uo0HY2vFlFBb49362OL1aYIf3hCgL7J2+4U6vUlrZkm0HWSZm5KMT/Y39hjTPSvaTQQPYBFgbderPIw1CS7hQpOh6MMp6XqdzPEdKWZ431A60wYV89BAd5n5hrlAWXeWsnzsO9FK1AHnDhH8FGkIsxYaZsVAAHwWIk1WLnKTWLLJSJjH+0qG7LwWcnlZDe22xza+LzszgyBcQ3f2jio1KD+xpXGN+qqa9jjuwFUx3qcdURRS53j1qRVhuFwIDAQAB';

class CipherUtilsTest extends TestCase {

    public function testRsaVerify(): void {
        $bizContent = '{"customerId":"CSR47184A93E35E4","authId":"07c93b59-23b2-4aa0-8cff-55a026b02329","cardLogId":"42f4d634e184351e6b035eb58ea4892620ce2eaa5347fcd206646fe24ffae905","cardAvailableBalance":"966.68","occurTime":"2022-06-23 14:06:36","transCurrency":"840","transCurrencyAmt":"33.44","localCurrency":"840","localCurrencyAmt":"33.44","respCode":"0000","respCodeDesc":"Authorization Approval","approveCode":"057685","messageType":"6810","messageTypeDesc":"Authorization Approval","useRef1Txt":"anything","merchantName":"","merchantCategoryCode":"0011","merchantId":"080000100003","merchantCountry":"","merchantCity":"","merchantPostcode":"","acquirerId":"213457","state":""}';
        $sign = 'tNNvnZBcvb7IR4qkPM9j+5/Hun1qj7MlnmcqeLKAO0Q8R4EB2OYLPTf/q50Rlq/gJf5x93OWSbSg9QqhktgZM0abZIKoAnidzNdGoLdINPSfdhkB/bkrpC8LctqEsLXwU2Kn3LHK3qAgDDJAf5AGmZmzn9SXnO2tvdVMvLbSj8vACpMm12g/zQyUPJ5NlCI7Hf5DXQeQy/Hd0hSyAFuhHO/V++a4TdEDZ3wqh9a1JVs0cy7t63vI0IT6r6l6hjiInoahW7H/zVZ1jcdhxNc1hGJRaM6GvlwsSFH9+gqIYv/DIPxIqTP2Bk6IDc0JaPBx/ClH7mefkunRerzCXFKC+g==';

        $verified = CipherUtils::rsaVerify(TRIPLINK_PUBLIC_KEY, $bizContent, $sign);

        $this->assertTrue($verified);
    }
}
