package com.ctrip.ccard.creditcard.vcc.biz.V2;

import com.ctrip.ccard.creditcard.vcc.bean.V2.*;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: j.mao
 * Date: 2021-10-20
 * Time: 14:05
 */
public interface TripLinkBizV2 {

    CardCreateResponse create(CardCreateRequest request);

    CardUpdateResponse update(CardUpdateRequest request);

    CardCancelResponse close(CardCancelRequest request);

    CardDetailQueryResponse queryCard(CardDetailQueryRequest request);

    QueryCustomerCreditAmountResponse queryCustomerCreditAmount(QueryCustomerCreditAmountRequest request);

    QueryAuthTranscationResponse queryAuthTranscation(QueryAuthTranscationReuqest request);

    QuerySettlementTranscationResponse querySettlementTranscation(QuerySettlementTranscationRequest request);
}
