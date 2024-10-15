package com.ctrip.ccard.creditcard.vcc.api.V2;

import com.ctrip.ccard.creditcard.vcc.bean.V2.CardCancelRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardCancelResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardCreateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardCreateResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardDetailQueryRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardDetailQueryResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardInfoNotifyRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardInfoNotifyResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardRechargeRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardRechargeResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardRestoreRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardRestoreResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardSuspendRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardSuspendResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardUnsuspendRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardUnsuspendResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardUpdateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardUpdateResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardWithdrawRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardWithdrawResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.ChargebackQueryRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.ChargebackQueryResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.ChargebackRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.ChargebackResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.FxCreateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.FxCreateResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.FxQueryRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.FxQueryResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.PayoutCreateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.PayoutCreateResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.PayoutQueryRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.PayoutQueryResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QueryAuthTransactionByPageRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QueryAuthTransactionByPageResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QueryAuthTransactionRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QueryAuthTransactionResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QueryCustomerCreditAmountRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QueryCustomerCreditAmountResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuerySettlementTransactionByPageRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuerySettlementTransactionByPageResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuerySettlementTransactionRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuerySettlementTransactionResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuoteRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuoteResponse;

public interface TripLinkApiV2 {

    /**
     * create card
     * request.requestId can not null
     *
     * @return CardCreateResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    CardCreateResponse create(CardCreateRequest request);

    /**
     * update card
     * request.requestId can not null
     *
     * @return CardUpdateResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    CardUpdateResponse update(CardUpdateRequest request);

    /**
     * recharge card
     * request.requestId can not null
     *
     * @return CardRechargeResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    CardRechargeResponse recharge(CardRechargeRequest request);

    /**
     * withdraw card
     * request.requestId can not null
     *
     * @return CardWithdrawResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    CardWithdrawResponse withdraw(CardWithdrawRequest request);

    /**
     * restore card
     */
    CardRestoreResponse restore(CardRestoreRequest request);

    /**
     * close card
     * request.requestId can not null
     *
     * @return CardCancelResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    CardCancelResponse close(CardCancelRequest request);

    /**
     * query card
     * request.customerId and  cardLogId can not null
     *
     * @return CardDetailQueryResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    CardDetailQueryResponse queryCard(CardDetailQueryRequest request);

    /**
     * query customer credit amount
     * request.customerId and  cardLogId can not null
     *
     * @return QueryCustomerCreditAmountResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    QueryCustomerCreditAmountResponse queryCustomerCreditAmount(QueryCustomerCreditAmountRequest request);

    /**
     * query auth info
     * request.customerId and  cardLogId can not null
     *
     * @return QueryAuthTransactionResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    QueryAuthTransactionResponse queryAuthTransaction(QueryAuthTransactionRequest request);

    /**
     * query settlement info
     * request.customerId and  cardLogId can not null
     *
     * @return QuerySettlementTransactionResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    QuerySettlementTransactionResponse querySettlementTransaction(QuerySettlementTransactionRequest request);

    /**
     * suspend card
     * request.requestId can not null
     *
     * @return CardSuspendResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    CardSuspendResponse suspend(CardSuspendRequest request);

    /**
     * unsuspend card
     * request.requestId can not null
     *
     * @return CardUnsuspendResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    CardUnsuspendResponse unsuspend(CardUnsuspendRequest request);

    /**
     * fx quote
     */
    QuoteResponse quote(QuoteRequest quoteRequest);

    /**
     * authTransactionQueryByPage
     * request.requestId can not null
     *
     * @return QueryAuthTransactionByPageResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    QueryAuthTransactionByPageResponse authTransactionQueryByPage(QueryAuthTransactionByPageRequest request);

    /**
     * payout create
     */
    PayoutCreateResponse payoutCreate(PayoutCreateRequest request);

    /**
     * query payout order
     */
    PayoutQueryResponse payoutQuery(PayoutQueryRequest request);

    /**
     * settlementTransactionQueryByPage
     * request.requestId can not null
     *
     * @return QueryAuthTransactionByPageResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.message
     */
    QuerySettlementTransactionByPageResponse settlementTransactionQueryByPage(QuerySettlementTransactionByPageRequest request);


    /**
     * fx create
     */
    FxCreateResponse fxCreate(FxCreateRequest request);

    /**
     * query fx order
     */
    FxQueryResponse fxQuery(FxQueryRequest request);


    /**
     * chargeback
     * request.requestId can not null
     *
     * @return ChargebackResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.Message
     */
    ChargebackResponse chargeback(ChargebackRequest request);

    /**
     * chargebackQuery
     * request.requestId can not null
     *
     * @return ChargebackQueryResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.Message
     */
    ChargebackQueryResponse chargebackQuery(ChargebackQueryRequest request);

    /**
     * notifyCardInfo
     * request.requestId can not null
     *
     * @return ChargebackQueryResponse
     * response.resultCode equals "000000" it succeeds otherwise it is failed
     * if response.resultCode is not equals "000000" check the response.Message
     */
    CardInfoNotifyResponse notifyCardInfo(CardInfoNotifyRequest request);
}
