package com.ctrip.ccard.creditcard.vcc.api;

import com.ctrip.ccard.creditcard.vcc.bean.*;

/**
 * Description: TripLink Api
 */
public interface TripLinkApi {

    CreateResponse create(CreateRequest request);

    UpdateResponse update(UpdateRequest request);

    CloseResponse close(CloseRequest request);

    QueryCreateResultResponse queryCreateResult(QueryCreateResultRequest request);

    QueryUpdateResultResponse queryUpdateResult(QueryUpdateResultRequest request);

    QueryCloseResultResponse queryCloseResult(QueryCloseResultRequest request);

    QueryCardInfoResponse queryCardInfo(QueryCardInfoRequest request);

    QueryMerchantInfoResponse queryMerchantInfo(QueryMerchantInfoRequest request);

    QueryAuthTransInfoResponse queryAuthTransInfo(QueryAuthTransInfoRequest request);

    QuerySettlemetTransInfoResponse querySettlemetTransInfo(QuerySettlemetTransInfoRequest request);

}
