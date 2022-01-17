package com.ctrip.ccard.creditcard.vcc.api.V2;

import com.ctrip.ccard.creditcard.vcc.bean.V2.CardCancelRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardCancelResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardCreateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardCreateResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardDetailQueryRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardDetailQueryResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardRechargeRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardRechargeResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardUpdateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardUpdateResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardWithdrawRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardWithdrawResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QueryAuthTransactionRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QueryAuthTransactionResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QueryCustomerCreditAmountRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QueryCustomerCreditAmountResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuerySettlementTransactionRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuerySettlementTransactionResponse;

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
}
