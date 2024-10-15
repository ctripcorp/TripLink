package com.ctrip.ccard.creditcard.vcc.api.V1;

import com.ctrip.ccard.creditcard.vcc.bean.V1.CloseRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.CloseResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.CreateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.CreateResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryAuthTransInfoByPageRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryAuthTransInfoByPageResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryAuthTransInfoRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryAuthTransInfoResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryCardInfoRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryCardInfoResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryCloseResultRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryCloseResultResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryCreateResultRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryCreateResultResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryMerchantInfoRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryMerchantInfoResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QuerySettlemetTransInfoByPageRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QuerySettlemetTransInfoByPageResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QuerySettlemetTransInfoRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QuerySettlemetTransInfoResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryUpdateResultRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryUpdateResultResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.RechargeRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.RechargeResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.RestoreRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.RestoreResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.SuspendRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.SuspendResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.UnSuspendRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.UnSuspendResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.UpdateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.UpdateResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.WithdrawRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.WithdrawResponse;

/**
 * Description: TripLink Api
 * 此版本是V1版，已经废弃维护。建议使用V2版本 @TripLinkApiV2
 */
public interface TripLinkApi {

    CreateResponse create(CreateRequest request);

    UpdateResponse update(UpdateRequest request);

    RechargeResponse recharge(RechargeRequest request);

    WithdrawResponse withdraw(WithdrawRequest request);

    RestoreResponse restore(RestoreRequest request);

    CloseResponse close(CloseRequest request);

    QueryCreateResultResponse queryCreateResult(QueryCreateResultRequest request);

    QueryUpdateResultResponse queryUpdateResult(QueryUpdateResultRequest request);

    QueryCloseResultResponse queryCloseResult(QueryCloseResultRequest request);

    QueryCardInfoResponse queryCardInfo(QueryCardInfoRequest request);

    QueryMerchantInfoResponse queryMerchantInfo(QueryMerchantInfoRequest request);

    QueryAuthTransInfoResponse queryAuthTransInfo(QueryAuthTransInfoRequest request);

    QuerySettlemetTransInfoResponse querySettlemetTransInfo(QuerySettlemetTransInfoRequest request);

    SuspendResponse suspend(SuspendRequest request);

    UnSuspendResponse unSuspend(UnSuspendRequest request);

    QueryAuthTransInfoByPageResponse queryAuthTransInfoByPage(QueryAuthTransInfoByPageRequest request);

    QuerySettlemetTransInfoByPageResponse querySettlemetTransInfoByPage(QuerySettlemetTransInfoByPageRequest request);

}
