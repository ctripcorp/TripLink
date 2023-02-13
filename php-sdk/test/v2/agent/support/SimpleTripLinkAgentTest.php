<?php declare(strict_types=1);

namespace v2\agent\support;

use PHPUnit\Framework\TestCase;
use v2\client\support\GuzzleHttpClient;
use v2\config\Customer;
use v2\model\core\CloseCardRequest;
use v2\model\core\CreateCardRequest;
use v2\model\core\QueryAccountRequest;
use v2\model\core\QueryAuthorizationRequest;
use v2\model\core\QueryCardRequest;
use v2\model\core\QuerySettlementRequest;
use v2\model\core\RechargeCardRequest;
use v2\model\core\SuspendCardRequest;
use v2\model\core\UnsuspendCardRequest;
use v2\model\core\UpdateCardRequest;
use v2\model\core\UserReference;
use v2\model\core\WithdrawCardRequest;

const BASE_URL = 'https://vcc-compass-fat.ctripqa.com/compass/api';

const CUSTOMER_ID = 'CSR47184A93E35E4';
const AES_KEY = 'i0BFCWsuAPYH7PTa4jQhaQ==';
const CUSTOMER_PRIVATE_KEY = 'MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDMa6+ekQKoEmUPZGTx5DcGI0mfpOCUzEL4EjOPuDbE4EXXCufu8OA7jS43AXjZJINtDZ5v2U7KyWEWU1kV5qwLAoUtD+6jQdja8WUUFvj3frY4vVpgh/eEKAvsnb7hTq9SWtmSbQdZJmbkoxP9jf2GNM9K9pNBA9gEWBt16s8jDUJLuFCk6Howynpep3M8R0pZnjfUDrTBhXz0EB3mfmGuUBZd5ayfOw70UrUAecOEfwUaQizFhpmxUAAfBYiTVYucpNYsslImMf7SobsvBZyeVkN7bbHNr4vOzODIFxDd/aOKjUoP7GlcY36qpr2OO7AVTHepx1RFFLnePWpFWG4XAgMBAAECggEAJj2u6NbvzElEppB9YdLziC5pw3ewm6VqkcW155jqhgH+jq/3m3dsOze6AYhA9z4hZ/E4Rmw8lSr/ApItBC/W12htSXTFi7zxuGOYKR3zDTmjFRI3Kf/Fie+D64vG/ZcerSVZtk63JTJN5U+sma5KUyTl8nwWJ/90Fbv1xyVaApBOwMXxoA3YYy+oqnnzGXut084bozSWkC3jVzEMPTFI4Vb4YWG4d37SpvJegUXWDDHArer9OaKKMRsjG/ms34NDpjEmNQQAatP217QFLX94R6e4MRDvz8eAtBGQcVhFzSxjPl4OgDrJmwxwLiilT4+FB2FXhtxQeFVsviuZ1TP2gQKBgQDuccBiWt5sbk9h9/qiUws4k8gjb630HoWpwZ8roGQ/sDl0LMPY5XAAeMI9xVTi9VfYEsd3h95D/9z+PvhMpb8c79ThxDH916L71XMrxA/JVOPi8DlD/T7OnOH4q66cYJwVsltaem6smK8soIPkBBBW8HTioLPggtCJDFunq97AcQKBgQDbeKYcb6LPLc7KAuSpFQbLtQyh2o8nmvi8SfycHTopnzVq+bZLI6HrCB0BeFwZuwHSlHljtW91cIYL1ULBSmEpZ03RCFHG15zs3LcE/MduviEcn2TattAc7Ati/z5LHYiiatXf6tNPj4r+C0nIab6r8Fb6gzDd0gNFNUSRjelbBwKBgQCcWIHo++Qz/PCYMF1q6kDFTEFC2wuYshq6gHa5yGVzTT2e62tPYMHbzVKv5iAO4QhEaavYuIII3FAvdWKh/1wcwTU5A8gzxZzcu8zUua4QOVVjjFhAOGFiYIPa5deMOdyebWBxJy5Char2/Bj+/ZspJmm939mSMLRD6JKAkrVwQQKBgCSrZeW+aU+Acdqi3R27G6WRnIi2gdC2PfUHz6Mt5vfpV/2Ft4WacIVal64VNB5Adq9+i0GzoOnYYS089qhhCxbl4cSZRUCZ6ehRgGre6VuBfPrRTwKUJPWQIt7pkrjuOFQa0Z1WGPRkIW8M58kKkgccYwv8O3/0hQNdQRWoxmKlAoGBAKKAr/J2QfS9hmlQP2XVOms0z2acA+qIjWiapk6Utv+XTSxyFWwF4IFo5yw300OAARGhbBMzZvxr3y4lwCrV6UHu+XurAZR5+jLSrLR97fAVvqsSnvEZ5L2H6KwYxDK2t/qGukCZOzC9skp+t3plS+dXLQQLni5DhP3+PzYHJqTc';
const TRIPLINK_PUBLIC_KEY = 'MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzGuvnpECqBJlD2Rk8eQ3BiNJn6TglMxC+BIzj7g2xOBF1wrn7vDgO40uNwF42SSDbQ2eb9lOyslhFlNZFeasCwKFLQ/uo0HY2vFlFBb49362OL1aYIf3hCgL7J2+4U6vUlrZkm0HWSZm5KMT/Y39hjTPSvaTQQPYBFgbderPIw1CS7hQpOh6MMp6XqdzPEdKWZ431A60wYV89BAd5n5hrlAWXeWsnzsO9FK1AHnDhH8FGkIsxYaZsVAAHwWIk1WLnKTWLLJSJjH+0qG7LwWcnlZDe22xza+LzszgyBcQ3f2jio1KD+xpXGN+qqa9jjuwFUx3qcdURRS53j1qRVhuFwIDAQAB';

class SimpleTripLinkAgentTest extends TestCase {

    public function testCreateCard(): void {
        $httpClient = new GuzzleHttpClient();
        $customer = new Customer(CUSTOMER_ID, AES_KEY, CUSTOMER_PRIVATE_KEY, TRIPLINK_PUBLIC_KEY);
        $tripLinkAgent = new SimpleTripLinkAgent(BASE_URL, $customer, $httpClient);

        $request = new CreateCardRequest(uniqid(), CUSTOMER_ID);
        $request->setCardCurrencyCode('840');
        $request->setSettlementCurrencyCode('840');
        $request->setActiveDate('2022-02-01');
        $request->setInactiveDate('2024-08-01');
        $request->setCardLimit(1000.12);
        $request->setMinAuthAmount(3.45);
        $request->setMaxAuthAmount(500.67);
        $request->setMaxAuthTimes(-1);
        $request->setCardCloseUsage(40);
        $request->setSupportedMccGroup('ecom');
        $request->setMultipleCurrencyCard(true);
        $request->setCvv2ForceCheck(true);
        $request->setCardType('GWTTP');
        $request->setCardLabel('MasterCard');
        $userReference = new UserReference();
        $userReference->setUseRef1Txt('anything');
        $request->setUserReferenceMap($userReference);

        $response = $tripLinkAgent->createCard($request);
        var_dump($response);

        $this->assertEquals('000000', $response->getReturnCode());
    }

    public function testUpdateCard(): void {
        $httpClient = new GuzzleHttpClient();
        $customer = new Customer(CUSTOMER_ID, AES_KEY, CUSTOMER_PRIVATE_KEY, TRIPLINK_PUBLIC_KEY);
        $tripLinkAgent = new SimpleTripLinkAgent(BASE_URL, $customer, $httpClient);

        $request = new UpdateCardRequest(uniqid(), CUSTOMER_ID);
        $request->setCardLogId('8e0f30d0f82287463b5fe55b5fa7a62d4f8408ca7acfc3189a1f78a875322e93');
        $request->setCardLimit(2000.12);
        $request->setMultipleCurrencyCard(false);
        $request->setCvv2ForceCheck(false);

        $response = $tripLinkAgent->updateCard($request);
        var_dump($response);

        $this->assertEquals('000000', $response->getReturnCode());
    }

    public function testRechargeCard(): void {
        $httpClient = new GuzzleHttpClient();
        $customer = new Customer(CUSTOMER_ID, AES_KEY, CUSTOMER_PRIVATE_KEY, TRIPLINK_PUBLIC_KEY);
        $tripLinkAgent = new SimpleTripLinkAgent(BASE_URL, $customer, $httpClient);

        $request = new RechargeCardRequest(uniqid(), CUSTOMER_ID);
        $request->setCardLogId('9261267e66b808e9a2f62fe54e516192677236b943aa2dee1836284b369767d7');
        $request->setRechargeAmount(100.12);

        $response = $tripLinkAgent->rechargeCard($request);
        var_dump($response);

        $this->assertEquals('000000', $response->getReturnCode());
    }

    public function testWithdrawCard(): void {
        $httpClient = new GuzzleHttpClient();
        $customer = new Customer(CUSTOMER_ID, AES_KEY, CUSTOMER_PRIVATE_KEY, TRIPLINK_PUBLIC_KEY);
        $tripLinkAgent = new SimpleTripLinkAgent(BASE_URL, $customer, $httpClient);

        $request = new WithdrawCardRequest(uniqid(), CUSTOMER_ID);
        $request->setCardLogId('9261267e66b808e9a2f62fe54e516192677236b943aa2dee1836284b369767d7');
        $request->setWithdrawAmount(80.12);

        $response = $tripLinkAgent->withdrawCard($request);
        var_dump($response);

        $this->assertEquals('000000', $response->getReturnCode());
    }

    public function testSuspendCard(): void {
        $httpClient = new GuzzleHttpClient();
        $customer = new Customer(CUSTOMER_ID, AES_KEY, CUSTOMER_PRIVATE_KEY, TRIPLINK_PUBLIC_KEY);
        $tripLinkAgent = new SimpleTripLinkAgent(BASE_URL, $customer, $httpClient);

        $request = new SuspendCardRequest(uniqid(), CUSTOMER_ID);
        $request->setCardLogId('12bdcdb20b6f304975ef15a12e1686fcfd23eb6c72c3536b3c4aa40e8d1299a3');

        $response = $tripLinkAgent->suspendCard($request);
        var_dump($response);

        $this->assertEquals('000000', $response->getReturnCode());
    }

    public function testUnsuspendCard(): void {
        $httpClient = new GuzzleHttpClient();
        $customer = new Customer(CUSTOMER_ID, AES_KEY, CUSTOMER_PRIVATE_KEY, TRIPLINK_PUBLIC_KEY);
        $tripLinkAgent = new SimpleTripLinkAgent(BASE_URL, $customer, $httpClient);

        $request = new UnsuspendCardRequest(uniqid(), CUSTOMER_ID);
        $request->setCardLogId('12bdcdb20b6f304975ef15a12e1686fcfd23eb6c72c3536b3c4aa40e8d1299a3');

        $response = $tripLinkAgent->unsuspendCard($request);
        var_dump($response);

        $this->assertEquals('000000', $response->getReturnCode());
    }

    public function testCloseCard(): void {
        $httpClient = new GuzzleHttpClient();
        $customer = new Customer(CUSTOMER_ID, AES_KEY, CUSTOMER_PRIVATE_KEY, TRIPLINK_PUBLIC_KEY);
        $tripLinkAgent = new SimpleTripLinkAgent(BASE_URL, $customer, $httpClient);

        $request = new CloseCardRequest(uniqid(), CUSTOMER_ID);
        $request->setCardLogId('8e0f30d0f82287463b5fe55b5fa7a62d4f8408ca7acfc3189a1f78a875322e93');

        $response = $tripLinkAgent->closeCard($request);
        var_dump($response);

        $this->assertEquals('000000', $response->getReturnCode());
    }

    public function testQueryCard(): void {
        $httpClient = new GuzzleHttpClient();
        $customer = new Customer(CUSTOMER_ID, AES_KEY, CUSTOMER_PRIVATE_KEY, TRIPLINK_PUBLIC_KEY);
        $tripLinkAgent = new SimpleTripLinkAgent(BASE_URL, $customer, $httpClient);

        $request = new QueryCardRequest(uniqid(), CUSTOMER_ID);
        $request->setCardLogId('12bdcdb20b6f304975ef15a12e1686fcfd23eb6c72c3536b3c4aa40e8d1299a3');

        $response = $tripLinkAgent->queryCard($request);
        var_dump($response);

        $this->assertEquals('000000', $response->getReturnCode());
    }

    public function testQueryAccount(): void {
        $httpClient = new GuzzleHttpClient();
        $customer = new Customer(CUSTOMER_ID, AES_KEY, CUSTOMER_PRIVATE_KEY, TRIPLINK_PUBLIC_KEY);
        $tripLinkAgent = new SimpleTripLinkAgent(BASE_URL, $customer, $httpClient);

        $request = new QueryAccountRequest(uniqid(), CUSTOMER_ID);

        $response = $tripLinkAgent->queryAccount($request);
        var_dump($response);

        $this->assertEquals('000000', $response->getReturnCode());
    }

    public function testQueryAuthorization(): void {
        $httpClient = new GuzzleHttpClient();
        $customer = new Customer(CUSTOMER_ID, AES_KEY, CUSTOMER_PRIVATE_KEY, TRIPLINK_PUBLIC_KEY);
        $tripLinkAgent = new SimpleTripLinkAgent(BASE_URL, $customer, $httpClient);

        $request = new QueryAuthorizationRequest(uniqid(), CUSTOMER_ID);
        $request->setCardLogId('c55d99dac26bb334c07879404a93d2c6a96b42f7372f9c04d14034d019103fe4');
        $request->setStartTime('2022-02-01');
        $request->setEndTime('2022-03-02');

        $response = $tripLinkAgent->queryAuthorization($request);
        var_dump($response);

        $this->assertEquals('000000', $response->getReturnCode());
    }

    public function testQuerySettlement(): void {
        $httpClient = new GuzzleHttpClient();
        $customer = new Customer(CUSTOMER_ID, AES_KEY, CUSTOMER_PRIVATE_KEY, TRIPLINK_PUBLIC_KEY);
        $tripLinkAgent = new SimpleTripLinkAgent(BASE_URL, $customer, $httpClient);

        $request = new QuerySettlementRequest(uniqid(), CUSTOMER_ID);
        $request->setCardLogId('c55d99dac26bb334c07879404a93d2c6a96b42f7372f9c04d14034d019103fe4');
        $request->setStartTime('2022-02-01');
        $request->setEndTime('2022-03-02');

        $response = $tripLinkAgent->querySettlement($request);
        var_dump($response);

        $this->assertEquals('000000', $response->getReturnCode());
    }

    public function testRequest(): void {
        $httpClient = new GuzzleHttpClient();
        $customer = new Customer(CUSTOMER_ID, AES_KEY, CUSTOMER_PRIVATE_KEY, TRIPLINK_PUBLIC_KEY);
        $tripLinkAgent = new SimpleTripLinkAgent(BASE_URL, $customer, $httpClient);

        $request = [
            'requestId' => uniqid(),
            'customerId' => CUSTOMER_ID,
            'cardLogId' => '7b4d537f43c88d64b28ce1881b2311efe0596b0ea7ae496907530b3db8b96ebc',
        ];

        $response = $tripLinkAgent->general($request, 'queryCardDetail');
        var_dump($response);

        $this->assertEquals('000000', $response['returnCode']);
    }
}