package com.ctrip.ccard.creditcard.vcc.api.V2;

import com.ctrip.ccard.creditcard.vcc.bean.V2.*;
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

    @Override
    public QuerySettlementTransactionByPageResponse settlementTransactionQueryByPage(QuerySettlementTransactionByPageRequest request) {
        return vccBiz.settlementTransactionQueryByPage(request);
    }

    @Override
    public FxCreateResponse fxCreate(FxCreateRequest request) {
        return vccBiz.fxCreate(request);
    }

    @Override
    public FxQueryResponse fxQuery(FxQueryRequest request) {
        return vccBiz.fxQuery(request);
    }

    @Override
    public ChargebackResponse chargeback(ChargebackRequest request) {
        return vccBiz.chargeback(request);
    }

    @Override
    public ChargebackQueryResponse chargebackQuery(ChargebackQueryRequest request) {
        return vccBiz.chargebackQuery(request);
    }
}
