package com.ctrip.ccard.creditcard.vcc.api.V1;

import com.ctrip.ccard.creditcard.vcc.bean.V1.*;

/**
 * Description: TripLink Api
 * 此版本是V1版，已经废弃维护。建议使用V2版本 @TripLinkApiV2
 */
public interface TripLinkApi {

    CreateResponse create(CreateRequest request);

    UpdateResponse update(UpdateRequest request);

    RechargeResponse recharge(RechargeRequest request);

    WithdrawResponse withdraw(WithdrawRequest request);

    CloseResponse close(CloseRequest request);

    QueryCreateResultResponse queryCreateResult(QueryCreateResultRequest request);

    QueryUpdateResultResponse queryUpdateResult(QueryUpdateResultRequest request);

    QueryCloseResultResponse queryCloseResult(QueryCloseResultRequest request);

    QueryCardInfoResponse queryCardInfo(QueryCardInfoRequest request);

    QueryMerchantInfoResponse queryMerchantInfo(QueryMerchantInfoRequest request);

    QueryAuthTransInfoResponse queryAuthTransInfo(QueryAuthTransInfoRequest request);

    QuerySettlemetTransInfoResponse querySettlemetTransInfo(QuerySettlemetTransInfoRequest request);

}
