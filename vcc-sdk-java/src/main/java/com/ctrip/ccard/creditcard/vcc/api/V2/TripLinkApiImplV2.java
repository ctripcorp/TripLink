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
    public QueryAuthTranscationResponse queryAuthTranscation(QueryAuthTranscationReuqest request) {
        return vccBiz.queryAuthTranscation(request);
    }

    @Override
    public QuerySettlementTranscationResponse querySettlementTranscation(QuerySettlementTranscationRequest request) {
        return vccBiz.querySettlementTranscation(request);
    }
}
