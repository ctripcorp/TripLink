<?php declare(strict_types=1);

namespace v2\agent;

use v2\model\core\CloseCardRequest;
use v2\model\core\CloseCardResponse;
use v2\model\core\CreateCardRequest;
use v2\model\core\CreateCardResponse;
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
use v2\model\core\UpdateCardRequest;
use v2\model\core\UpdateCardResponse;
use v2\model\core\WithdrawCardRequest;
use v2\model\core\WithdrawCardResponse;

interface TripLinkAgent {
    /**
     * 创建卡
     */
    public function createCard(CreateCardRequest $request): CreateCardResponse;

    /**
     * 修改卡
     */
    public function updateCard(UpdateCardRequest $request): UpdateCardResponse;

    /**
     * 充值卡
     */
    public function rechargeCard(RechargeCardRequest $request): RechargeCardResponse;

    /**
     * 提现卡
     */
    public function withDrawCard(WithdrawCardRequest $request): WithdrawCardResponse;

    /**
     * 注销卡
     */
    public function closeCard(CloseCardRequest $request): CloseCardResponse;

    /**
     * 查询卡
     */
    public function queryCard(QueryCardRequest $request): QueryCardResponse;

    /**
     * 查询账户额度
     */
    public function queryAccount(QueryAccountRequest $request): QueryAccountResponse;

    /**
     * 查询授权交易
     */
    public function queryAuthorization(QueryAuthorizationRequest $request): QueryAuthorizationResponse;

    /**
     * 查询清算交易
     */
    public function querySettlement(QuerySettlementRequest $request): QuerySettlementResponse;

    /**
     * 通用
     */
    public function general(array $request, string $service): array;
}