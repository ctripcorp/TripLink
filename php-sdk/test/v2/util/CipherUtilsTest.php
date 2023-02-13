<?php declare(strict_types=1);

namespace v2\util;

use PHPUnit\Framework\TestCase;

class CipherUtilsTest extends TestCase {

    public function testAesEncryptDecrypt(): void {
        $plaintext = 'plaintext';
        $keyStr = '9ehthOcVJJ1Dyp1appaKEg==';

        $encrypted = CipherUtils::aesEncrypt($keyStr, $plaintext);
        $decrypted = CipherUtils::aesDecrypt($keyStr, $encrypted);

        $this->assertEquals($plaintext, $decrypted);
    }

    public function testRsaSignVerify(): void {
        $content = 'content';
        $privateKeyStr = 'MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCCFYckNSKbUnR02d1EyMsb40CehfCBAHGENDhJCQSWl17sEd5EiFRqN/w0SbumDeL4k+vPYZc2pNwVSnN08wgyWtaJCi9c7vd3/+cTAsv/N4cJsxiCZrl1NBUywbPzms3rb3JPiV+STaeTd4mT03iVOL7YMS4f3mpqajyItCeokOOd778Ne7nKPv6K4A0XcTr1w3Kn+lvsYULwsy2yt4pIuu8CtL9PLyRJezi1b2prtHaKS3q4dt5FcnqIqg/zND/hmb03LgcSc+rUxTtOfRt09X2NRrXwIQuyy2R4njGfJ8MwOtL6zXxojsWsndfc/6prZVL7LHiZjqb0tNYK7+dvAgMBAAECggEAUaogMBvngOkP0Tfg0EjaMcTGEX72kJXtrdh2qWsu5TdcUQmapx2LGS/SdiT/1+yJ3BJJDOUwYA65V+hoeTgFok8itd+eAlLHKx+NOoMb/Doo3W8A6QSCU1ECKd4vEbTSp4ZMliAgzqFPnaWCyjoNTmjUbrbZRQqFdg8Bt7SZ3RlHsSMfH7HCYG/KbTqd+IAO77O9B/uhCLvHW12FUWgPFZ0WlQS49Jfh11Mg/095bZJ/GH/BaHpCshz31yXimntImuhYFyVVZFtVSx8/Wyl82N3xkU0C/o49hq6iWznJgTDlfuT3cqqrxxCrbajdB+xhEGIlNCyLjWx+Sw8B1gEvsQKBgQDbe8WIDVxb8rdAqOqb8NwBd2S8Ye6hUfex5l6o1vMV+vnir58kkQG0csC9R1IwxFfHIbLdWWX+bRvepnI2Mfg3ZnuloF+DkOYwLDzYZIQZT2NyiFfIzK0K8FRNPaLvB6BuM+2uqkGf1ajt7wVH6nlsmMcQ5/49UXN8bkkkjdMWeQKBgQCXug/6/Q5C5HC1PwFZnISwgdTfja2LGcNoigXduXGCYviBYdRAuwYah/fP9+unkZKHKD2owBQL8IHnPXGM9UiurLo7aEF6WupceFUM3VYcch+ey4YPzhh0iV6JpryV6EWKVgQwzgwhKBQaCtYmzLpqK3nkVEqQHYb+DTRBEOCTJwKBgQCZ5K8cNkIMNqNHMylNLhUU8iIv9HrdohuLIXw95nmLb+7Gg12Sxhnr7Io4LUnz57ekaHyBt61MODTSaOKsHV1teu43s7tFBNRh8qK3F8OH+6I/LFpg8SJkCR8TCaS09SQIIWEGl1psN+O68V1Cj6WT/4uUzxX06KeRF8MxXkAkAQKBgCLV9mtTBJ45IuOKRr4TYKfB92Uoe0rvrFzpK7WfqT8diB70ni4Kgrk+tJgMPQ/pLXJYu+dtymx/WOQFyHdrrbdlMxEGu9ni2+JFQonEm8vGLBpicjJYyGahT5JdNPlaLfU4EJhABqrqL8tW55pa8QYFW2QgMkpqbR8RWwkBXf6LAoGAN1WQ/naVBi5cFFuCiWoEQ4rZLur2mMsPCN2hgubF8M3lyAzTmDx7dPpFRpUZiuc8Zo8JwtrVyDzK5iTXNZHeYaeUYIKJqCMtOU9fLv1SnhlW/zFTwwl5c0p/J5f2XfphTWeGwsyLkaBi1CZDBQYehx3QS6nTaRHhOHiA9ji9nyI=';
        $publicKeyStr = 'MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAghWHJDUim1J0dNndRMjLG+NAnoXwgQBxhDQ4SQkElpde7BHeRIhUajf8NEm7pg3i+JPrz2GXNqTcFUpzdPMIMlrWiQovXO73d//nEwLL/zeHCbMYgma5dTQVMsGz85rN629yT4lfkk2nk3eJk9N4lTi+2DEuH95qamo8iLQnqJDjne+/DXu5yj7+iuANF3E69cNyp/pb7GFC8LMtsreKSLrvArS/Ty8kSXs4tW9qa7R2ikt6uHbeRXJ6iKoP8zQ/4Zm9Ny4HEnPq1MU7Tn0bdPV9jUa18CELsstkeJ4xnyfDMDrS+s18aI7FrJ3X3P+qa2VS+yx4mY6m9LTWCu/nbwIDAQAB';

        $signature = CipherUtils::rsaSign($privateKeyStr, $content);
        $verified = CipherUtils::rsaVerify($publicKeyStr, $content, $signature);

        $this->assertTrue($verified);
    }
}
