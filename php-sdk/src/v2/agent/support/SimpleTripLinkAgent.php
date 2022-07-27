<?php declare(strict_types=1);

namespace v2\agent\support;

use v2\agent\TripLinkAgent;
use v2\client\HttpClient;
use v2\config\Customer;
use v2\exception\TripLinkException;
use v2\model\core\CloseCardRequest;
use v2\model\core\CloseCardResponse;
use v2\model\core\CreateCardRequest;
use v2\model\core\CreateCardResponse;
use v2\model\core\FxQuoteRequest;
use v2\model\core\FxQuoteResponse;
use v2\model\core\QueryAccountRequest;
use v2\model\core\QueryAccountResponse;
use v2\model\core\QueryAuthorizationRequest;
use v2\model\core\QueryAuthorizationResponse;
use v2\model\core\QueryCardRequest;
use v2\model\core\QueryCardResponse;
use v2\model\core\QuerySettlementRequest;
use v2\model\core\QuerySettlementResponse;
use v2\model\core\RechargeCardRequest;
use v2\model\core\RechargeCardResponse;
use v2\model\core\SuspendCardRequest;
use v2\model\core\SuspendCardResponse;
use v2\model\core\UnsuspendCardRequest;
use v2\model\core\UnsuspendCardResponse;
use v2\model\core\UpdateCardRequest;
use v2\model\core\UpdateCardResponse;
use v2\model\core\WithdrawCardRequest;
use v2\model\core\WithdrawCardResponse;
use v2\util\CipherUtils;

class SimpleTripLinkAgent implements TripLinkAgent {
    /**
     * 基础地址
     * @var string base url
     */
    private $baseUrl;
    /**
     * 客户资料
     * @var Customer customer information
     */
    private $customer;
    /**
     * HTTP客户端
     * @var HttpClient http client
     */
    private $httpClient;

    public function __construct(string $baseUrl, Customer $customer, HttpClient $httpClient) {
        $this->baseUrl = $baseUrl;
        $this->customer = $customer;
        $this->httpClient = $httpClient;
    }

    public function createCard(CreateCardRequest $request): CreateCardResponse {
        return CreateCardResponse::fromArray($this->general(get_object_vars($request->jsonSerialize()), 'createCard'));
    }

    public function updateCard(UpdateCardRequest $request): UpdateCardResponse {
        return UpdateCardResponse::fromArray($this->general(get_object_vars($request->jsonSerialize()), 'updateCard'));
    }

    public function rechargeCard(RechargeCardRequest $request): RechargeCardResponse {
        return RechargeCardResponse::fromArray($this->general(get_object_vars($request->jsonSerialize()), 'rechargeCard'));
    }

    public function withDrawCard(WithdrawCardRequest $request): WithdrawCardResponse {
        return WithdrawCardResponse::fromArray($this->general(get_object_vars($request->jsonSerialize()), 'withdrawCard'));
    }

    public function suspendCard(SuspendCardRequest $request): SuspendCardResponse {
        return SuspendCardResponse::fromArray($this->general(get_object_vars($request->jsonSerialize()), 'suspendCard'));
    }

    public function unsuspendCard(UnsuspendCardRequest $request): UnsuspendCardResponse {
        return UnsuspendCardResponse::fromArray($this->general(get_object_vars($request->jsonSerialize()), 'unSuspendCard'));
    }

    public function closeCard(CloseCardRequest $request): CloseCardResponse {
        return CloseCardResponse::fromArray($this->general(get_object_vars($request->jsonSerialize()), 'closeCard'));
    }

    public function queryCard(QueryCardRequest $request): QueryCardResponse {
        return QueryCardResponse::fromArray($this->general(get_object_vars($request->jsonSerialize()), 'queryCardDetail'));
    }

    public function fxQuote(FxQuoteRequest $request): FxQuoteResponse {
        return FxQuoteResponse::fromArray($this->general(get_object_vars($request->jsonSerialize()), 'fxQuote'));
    }

    public function queryAccount(QueryAccountRequest $request): QueryAccountResponse {
        return QueryAccountResponse::fromArray($this->general(get_object_vars($request->jsonSerialize()), 'queryCustomerCredit'));
    }

    public function queryAuthorization(QueryAuthorizationRequest $request): QueryAuthorizationResponse {
        return QueryAuthorizationResponse::fromArray($this->general(get_object_vars($request->jsonSerialize()), 'queryAuthTransaction'));
    }

    public function querySettlement(QuerySettlementRequest $request): QuerySettlementResponse {
        return QuerySettlementResponse::fromArray($this->general(get_object_vars($request->jsonSerialize()), 'querySettlementTransaction'));
    }

    public function general(array $request, string $service): array {
        $this->verifyRequest($request);
        $reqPayload = CipherUtils::aesEncrypt($this->customer->getAesKey(), json_encode($request));
        $reqHeaders = $this->generateHeaders($request['requestId'], $reqPayload, $service);

        $res = $this->httpClient->post($this->baseUrl, $reqHeaders, json_encode(['payload' => $reqPayload]));

        $resPayload = json_decode($res->getBody(), true)['payload'];
        $this->verifyHeaders($res->getHeaders(), $resPayload);
        return json_decode(CipherUtils::aesDecrypt($this->customer->getAesKey(), $resPayload), true);
    }

    private function verifyRequest(array $request): void {
        if (!isset($request['requestId'])) {
            throw new TripLinkException('request: requestId is required');
        }
        if (!isset($request['customerId'])) {
            throw new TripLinkException('request: customerId is required');
        }
    }

    private function generateHeaders(string $requestId, string $payload, string $service): array {
        $header = [
            'customerId' => $this->customer->getCustomerId(),
            'service' => $service,
            'version' => '2.0',
            'requestId' => $requestId,
            'timestamp' => time(),
        ];
        $content = implode('|', $header) . '|' . $payload;
        $signature = CipherUtils::rsaSign($this->customer->getPrivateKey(), $content);
        $header['sign'] = $signature;
        $header['Content-Type'] = 'application/json';
        return $header;
    }

    private function verifyHeaders(array $headers, string $payload): void {
        $content = "{$headers['customerId']}|{$headers['service']}|{$headers['version']}|{$headers['requestId']}|{$headers['timestamp']}|{$headers['code']}|{$headers['message']}|{$payload}";
        $result = CipherUtils::rsaVerify($this->customer->getPublicKey(), $content, $headers['sign']);
        if (!$result) {
            throw new TripLinkException('response signature incorrect');
        }
    }
}