<?php declare(strict_types=1);

namespace v2\client\support;

use v2\client\HttpResponse;

class SimpleHttpResponse implements HttpResponse {
    /**
     * @var int status code
     */
    private $statusCode;
    /**
     * @var string[] headers
     */
    private $headers;
    /**
     * @var string body
     */
    private $body;

    public function __construct(int $statusCode, array $headers, string $body) {
        $this->statusCode = $statusCode;
        $this->headers = $headers;
        $this->body = $body;
    }

    public function getStatusCode(): int {
        return $this->statusCode;
    }

    public function getHeaders(): array {
        return $this->headers;
    }

    public function getBody(): string {
        return $this->body;
    }
}