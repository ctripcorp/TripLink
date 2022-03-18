package com.ctrip.ccard.creditcard.vcc.biz.V2;

import com.ctrip.ccard.creditcard.vcc.bean.V2.*;

public interface TripLinkBizV2 {

    CardCreateResponse create(CardCreateRequest request);

    CardUpdateResponse update(CardUpdateRequest request);

    CardRechargeResponse recharge(CardRechargeRequest request);

    CardWithdrawResponse withdraw(CardWithdrawRequest request);

    CardCancelResponse close(CardCancelRequest request);

    CardDetailQueryResponse queryCard(CardDetailQueryRequest request);

    QueryCustomerCreditAmountResponse queryCustomerCreditAmount(QueryCustomerCreditAmountRequest request);

    QueryAuthTransactionResponse queryAuthTransaction(QueryAuthTransactionRequest request);

    QuerySettlementTransactionResponse querySettlementTransaction(QuerySettlementTransactionRequest request);

    CardSuspendResponse suspend(CardSuspendRequest request);

    CardUnsuspendResponse unsuspend(CardUnsuspendRequest request);
}
