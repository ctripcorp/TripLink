package com.ctrip.ccard.creditcard.vcc.biz.V2;

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

public interface TripLinkBizV2 {

    CardCreateResponse create(CardCreateRequest request);

    CardUpdateResponse update(CardUpdateRequest request);

    CardRechargeResponse recharge(CardRechargeRequest request);

    CardWithdrawResponse withdraw(CardWithdrawRequest request);

    CardRestoreResponse restore(CardRestoreRequest request);

    CardCancelResponse close(CardCancelRequest request);

    CardDetailQueryResponse queryCard(CardDetailQueryRequest request);

    QueryCustomerCreditAmountResponse queryCustomerCreditAmount(QueryCustomerCreditAmountRequest request);

    QueryAuthTransactionResponse queryAuthTransaction(QueryAuthTransactionRequest request);

    QuerySettlementTransactionResponse querySettlementTransaction(QuerySettlementTransactionRequest request);

    CardSuspendResponse suspend(CardSuspendRequest request);

    CardUnsuspendResponse unsuspend(CardUnsuspendRequest request);

    QuoteResponse quote(QuoteRequest request);

    QueryAuthTransactionByPageResponse authTransactionQueryByPage(QueryAuthTransactionByPageRequest request);

    PayoutCreateResponse payoutCreate(PayoutCreateRequest request);

    PayoutQueryResponse payoutQuery(PayoutQueryRequest request);

    QuerySettlementTransactionByPageResponse settlementTransactionQueryByPage(QuerySettlementTransactionByPageRequest request);

    FxCreateResponse fxCreate(FxCreateRequest request);

    FxQueryResponse fxQuery(FxQueryRequest request);

    ChargebackResponse chargeback(ChargebackRequest request);

    ChargebackQueryResponse chargebackQuery(ChargebackQueryRequest request);

    CardInfoNotifyResponse notifyCardInfo(CardInfoNotifyRequest request);
}
