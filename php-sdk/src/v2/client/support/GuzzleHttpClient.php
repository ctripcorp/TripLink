<?php declare(strict_types=1);

namespace v2\client\support;

use GuzzleHttp\Client;
use GuzzleHttp\Exception\GuzzleException;
use v2\client\HttpClient;
use v2\client\HttpResponse;
use v2\exception\TripLinkException;

class GuzzleHttpClient implements HttpClient {
    /**
     * @var Client Guzzle http client
     */
    private $client;

    public function __construct(float $timeout = 0) {
        $this->client = new Client(['timeout' => $timeout, 'verify' => false]);
    }

    public function post(string $url, array $headers, string $body): HttpResponse {
        try {
            $res = $this->client->post($url, ['headers' => $headers, 'body' => $body]);
        } catch (GuzzleException $e) {
            throw new TripLinkException($e->getMessage());
        }
        $resHeaders = [];
        foreach ($res->getHeaders() as $key => $value) {
            $resHeaders[$key] = implode(',', $value);
        }
        if ($resHeaders['code'] !== '200') {
            throw new TripLinkException("response header: code={$resHeaders['code']}, message={$resHeaders['message']}");
        }
        return new SimpleHttpResponse($res->getStatusCode(), $resHeaders, $res->getBody()->__toString());
    }
}