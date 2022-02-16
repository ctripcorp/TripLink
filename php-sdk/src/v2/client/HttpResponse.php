<?php declare(strict_types=1);

namespace v2\client;

interface HttpResponse {

    public function getStatusCode(): int;

    public function getHeaders(): array;

    public function getBody(): string;
}