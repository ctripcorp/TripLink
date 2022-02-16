<?php declare(strict_types=1);

namespace v2\client;

interface HttpClient {

    public function post(string $url, array $headers, string $body): HttpResponse;
}