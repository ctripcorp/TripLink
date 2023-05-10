package com.ctrip.ccard.creditcard.vcc.api.V2;

import com.ctrip.ccard.creditcard.vcc.bean.V2.CardCancelRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardCancelResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardCreateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardCreateResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardDetailQueryRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardDetailQueryResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardRechargeRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardRechargeResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardSuspendRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardSuspendResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardUnsuspendRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardUnsuspendResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardUpdateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardUpdateResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardWithdrawRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardWithdrawResponse;
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
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuerySettlementTransactionRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuerySettlementTransactionResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuoteRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuoteResponse;
import com.ctrip.ccard.creditcard.vcc.biz.V2.TripLinkBizV2;

/**
 * Description:
 */
public class TripLinkApiImplV2 implements TripLinkApiV2 {

    private TripLinkBizV2 vccBiz;

    public TripLinkApiImplV2(TripLinkBizV2 vccBiz) {
        this.vccBiz = vccBiz;
    }

    @Override
    public CardCreateResponse create(CardCreateRequest request) {
        return vccBiz.create(request);
    }

    @Override
    public CardUpdateResponse update(CardUpdateRequest request) {
        return vccBiz.update(request);
    }

    @Override
    public CardRechargeResponse recharge(CardRechargeRequest request) {
        return vccBiz.recharge(request);
    }

    @Override
    public CardWithdrawResponse withdraw(CardWithdrawRequest request) {
        return vccBiz.withdraw(request);
    }

    @Override
    public CardCancelResponse close(CardCancelRequest request) {
        return vccBiz.close(request);
    }

    @Override
    public CardDetailQueryResponse queryCard(CardDetailQueryRequest request) {
        return vccBiz.queryCard(request);
    }

    @Override
    public QueryCustomerCreditAmountResponse queryCustomerCreditAmount(QueryCustomerCreditAmountRequest request) {
        return vccBiz.queryCustomerCreditAmount(request);
    }

    @Override
    public QueryAuthTransactionResponse queryAuthTransaction(QueryAuthTransactionRequest request) {
        return vccBiz.queryAuthTransaction(request);
    }

    @Override
    public QuerySettlementTransactionResponse querySettlementTransaction(QuerySettlementTransactionRequest request) {
        return vccBiz.querySettlementTransaction(request);
    }

    @Override
    public QuoteResponse quote(QuoteRequest request) {
        return vccBiz.quote(request);
    }

    @Override
    public QueryAuthTransactionByPageResponse authTransactionQueryByPage(QueryAuthTransactionByPageRequest request) {
        return vccBiz.authTransactionQueryByPage(request);
    }

    @Override
    public CardSuspendResponse suspend(CardSuspendRequest request) {
        return vccBiz.suspend(request);
    }

    @Override
    public CardUnsuspendResponse unsuspend(CardUnsuspendRequest request) {
        return vccBiz.unsuspend(request);
    }

    @Override
    public PayoutCreateResponse payoutCreate(PayoutCreateRequest request) {
        return vccBiz.payoutCreate(request);
    }

    @Override
    public PayoutQueryResponse payoutQuery(PayoutQueryRequest request) {
        return vccBiz.payoutQuery(request);
    }
}
