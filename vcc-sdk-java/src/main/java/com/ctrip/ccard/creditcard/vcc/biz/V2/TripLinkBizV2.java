package com.ctrip.ccard.creditcard.vcc.biz.V2;

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
}
