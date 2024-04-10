package com.ctrip.ccard.creditcard.vcc.api.V2;

import com.ctrip.ccard.creditcard.vcc.bean.V2.*;

public interface TripLinkApiV2 {
    /**
     * create card
     * request.requestId can not null
     * @return CardCreateResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    CardCreateResponse create(CardCreateRequest request);

    /**
     * update card
     * request.requestId can not null
     * @return CardUpdateResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    CardUpdateResponse update(CardUpdateRequest request);

    /**
     * recharge card
     * request.requestId can not null
     * @return CardRechargeResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    CardRechargeResponse recharge(CardRechargeRequest request);

    /**
     * withdraw card
     * request.requestId can not null
     * @return CardWithdrawResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    CardWithdrawResponse withdraw(CardWithdrawRequest request);

    /**
     * close card
     * request.requestId can not null
     * @return CardCancelResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    CardCancelResponse close(CardCancelRequest request);

    /**
     * query card
     * request.customerId and  cardLogId can not null
     * @return CardDetailQueryResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    CardDetailQueryResponse queryCard(CardDetailQueryRequest request);

    /**
     * query customer credit amount
     * request.customerId and  cardLogId can not null
     * @return QueryCustomerCreditAmountResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    QueryCustomerCreditAmountResponse queryCustomerCreditAmount(QueryCustomerCreditAmountRequest request);

    /**
     * query auth info
     * request.customerId and  cardLogId can not null
     * @return QueryAuthTransactionResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    QueryAuthTransactionResponse queryAuthTransaction(QueryAuthTransactionRequest request);

    /**
     * query settlement info
     * request.customerId and  cardLogId can not null
     * @return QuerySettlementTransactionResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    QuerySettlementTransactionResponse querySettlementTransaction(QuerySettlementTransactionRequest request);

    /**
     * suspend card
     * request.requestId can not null
     * @return CardSuspendResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    CardSuspendResponse suspend(CardSuspendRequest request);

    /**
     * unsuspend card
     * request.requestId can not null
     * @return CardUnsuspendResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    CardUnsuspendResponse unsuspend(CardUnsuspendRequest request);

    /**
     * fx quote
     * @param quoteRequest
     * @return
     */
    QuoteResponse quote(QuoteRequest quoteRequest);

    /**
     * authTransactionQueryByPage
     * request.requestId can not null
     * @return QueryAuthTransactionByPageResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    QueryAuthTransactionByPageResponse authTransactionQueryByPage(QueryAuthTransactionByPageRequest request);

    /**
     * payout create
     * @param request
     * @return
     */
    PayoutCreateResponse payoutCreate(PayoutCreateRequest request);

    /**
     * query payout order
     * @param request
     * @return
     */
    PayoutQueryResponse payoutQuery(PayoutQueryRequest request);

    /**
     * settlementTransactionQueryByPage
     * request.requestId can not null
     * @return QueryAuthTransactionByPageResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    QuerySettlementTransactionByPageResponse settlementTransactionQueryByPage(QuerySettlementTransactionByPageRequest request);


    /**
     * fx create
     * @param request
     * @return
     */
    FxCreateResponse fxCreate(FxCreateRequest request);

    /**
     * query fx order
     * @param request
     * @return
     */
    FxQueryResponse fxQuery(FxQueryRequest request);


    /**
     * chargeback
     * request.requestId can not null
     * @return ChargebackResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.Message
     */
    ChargebackResponse chargeback(ChargebackRequest request);

    /**
     * chargebackQuery
     * request.requestId can not null
     * @return ChargebackQueryResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.Message
     */
    ChargebackQueryResponse chargebackQuery(ChargebackQueryRequest request);

}
