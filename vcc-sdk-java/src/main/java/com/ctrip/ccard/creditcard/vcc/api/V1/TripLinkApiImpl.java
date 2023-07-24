package com.ctrip.ccard.creditcard.vcc.api.V1;

import com.ctrip.ccard.creditcard.vcc.bean.V1.*;
import com.ctrip.ccard.creditcard.vcc.biz.V1.TripLinkBiz;
import com.ctrip.ccard.creditcard.vcc.util.BeanConvertUtil;

/**
 * Description: 此版本是V1版，已经废弃维护。建议使用V2版本 @TripLinkApiV2
 */
public class TripLinkApiImpl implements TripLinkApi {

    private TripLinkBiz vccBiz;

    public TripLinkApiImpl(TripLinkBiz vccBiz) {
        this.vccBiz = vccBiz;
    }

    /**
     * VCC <careate> card
     * request.requestId/requestTime/merchantName  can not null
     * @return CreateResponse
     * response.resultstatus enums is : PROCESS：处理中 SUCCEED：成功 FAILURE：失败 EXCEPTION：异常
     * if response.resultstatus is PROCESS or EXCEPTION call <queryCreateResult> check the <careate> result
     * response.resultRespMsg is result message
     */
    public CreateResponse create(CreateRequest request) {
        OperateRequest bizRequest = BeanConvertUtil.convert2CreateRequest(request);
        OperateResponse bizResponse = vccBiz.operate(bizRequest);
        return BeanConvertUtil.convert2CreateResponse(bizResponse);
    }

    /**
     * VCC <update> card
     * request.requestId/requestTime/merchantName/cardLogId  can not null
     * @return UpdateResponse
     * response.resultstatus enums is : PROCESS：处理中 SUCCEED：成功 FAILURE：失败 EXCEPTION：异常
     * if response.resultstatus is PROCESS or EXCEPTION call <queryUpdateResult> check the <update> result
     * response.resultRespMsg is result message
     */
    public UpdateResponse update(UpdateRequest request) {
        OperateRequest bizRequest = BeanConvertUtil.convert2UpdateRequest(request);
        OperateResponse bizResponse = vccBiz.operate(bizRequest);
        return BeanConvertUtil.convert2UpdateResponse(bizResponse);
    }

    /**
     * VCC <recharge> card
     * request.requestId/requestTime/merchantName/cardLogId/willChangeAmt  can not null
     * @return RechargeResponse
     * response.resultstatus enums is : PROCESS：处理中 SUCCEED：成功 FAILURE：失败 EXCEPTION：异常
     * if response.resultstatus is PROCESS or EXCEPTION call <queryCloseResult> check the <close> result
     * response.resultRespMsg is result message
     */
    public RechargeResponse recharge(RechargeRequest request) {
        OperateRequest bizRequest = BeanConvertUtil.convert2RechargeRequest(request);
        OperateResponse bizResponse = vccBiz.operate(bizRequest);
        return BeanConvertUtil.convert2RechargeResponse(bizResponse);
    }

    /**
     * VCC <withdraw> card
     * request.requestId/requestTime/merchantName/cardLogId/willChangeAmt  can not null
     * @return WithdrawResponse
     * response.resultstatus enums is : PROCESS：处理中 SUCCEED：成功 FAILURE：失败 EXCEPTION：异常
     * if response.resultstatus is PROCESS or EXCEPTION call <queryCloseResult> check the <close> result
     * response.resultRespMsg is result message
     */
    public WithdrawResponse withdraw(WithdrawRequest request) {
        OperateRequest bizRequest = BeanConvertUtil.convert2WithdrawRequest(request);
        OperateResponse bizResponse = vccBiz.operate(bizRequest);
        return BeanConvertUtil.convert2WithdrawResponse(bizResponse);
    }

    /**
     * VCC <close> card
     * request.requestId/requestTime/merchantName/cardLogId  can not null
     * @return CloseResponse
     * response.resultstatus enums is : PROCESS：处理中 SUCCEED：成功 FAILURE：失败 EXCEPTION：异常
     * if response.resultstatus is PROCESS or EXCEPTION call <queryCloseResult> check the <close> result
     * response.resultRespMsg is result message
     */
    public CloseResponse close(CloseRequest request) {
        OperateRequest bizRequest = BeanConvertUtil.convert2CloseRequest(request);
        OperateResponse bizResponse = vccBiz.operate(bizRequest);
        return BeanConvertUtil.convert2CloseResponse(bizResponse);
    }

    /**
     * VCC <queryCreateResult>
     * request.requestId/requestTime/merchantName  can not null
     * @return QueryCreateResultResponse
     * response.resultstatus enums is : PROCESS：处理中 SUCCEED：成功 FAILURE：失败 EXCEPTION：异常
     * if response.resultstatus is PROCESS or EXCEPTION please retry
     * response.resultRespMsg is result message
     */
    public QueryCreateResultResponse queryCreateResult(QueryCreateResultRequest request) {
        QOperateResultRequest bizRequest = BeanConvertUtil.convert2QueryCreateResultRequest(request);
        QOperateResultResponse bizResponse = vccBiz.qOperateResult(bizRequest);
        return BeanConvertUtil.convert2QueryCreateResultResponse(bizResponse);
    }

    /**
     * VCC <queryUpdateResult>
     * request.requestId/requestTime/merchantName  can not null
     * @return QueryUpdateResultResponse
     * response.resultstatus enums is : PROCESS：处理中 SUCCEED：成功 FAILURE：失败 EXCEPTION：异常
     * if response.resultstatus is PROCESS or EXCEPTION please retry
     * response.resultRespMsg is result message
     */
    public QueryUpdateResultResponse queryUpdateResult(QueryUpdateResultRequest request) {
        QOperateResultRequest bizRequest = BeanConvertUtil.convert2QueryUpdateResultRequest(request);
        QOperateResultResponse bizResponse = vccBiz.qOperateResult(bizRequest);
        return BeanConvertUtil.convert2QueryUpdateResultResponse(bizResponse);
    }

    /**
     * VCC <queryCloseResult>
     * request.requestId/requestTime/merchantName  can not null
     * @return QueryCloseResultResponse
     * response.resultstatus enums is : PROCESS：处理中 SUCCEED：成功 FAILURE：失败 EXCEPTION：异常
     * if response.resultstatus is PROCESS or EXCEPTION please retry
     * response.resultRespMsg is result message
     */
    public QueryCloseResultResponse queryCloseResult(QueryCloseResultRequest request) {
        QOperateResultRequest bizRequest = BeanConvertUtil.convert2QueryCloseResultRequest(request);
        QOperateResultResponse bizResponse = vccBiz.qOperateResult(bizRequest);
        return BeanConvertUtil.convert2QueryCloseResultResponse(bizResponse);
    }

    /**
     * VCC <queryCardInfo>
     * request.requestId/requestTime/merchantName/cardLogId  can not null
     * @return QueryCardInfoResponse
     * return card info
     * response.resultstatus enums is : PROCESS：处理中 SUCCEED：成功 FAILURE：失败 EXCEPTION：异常
     * if response.resultstatus is PROCESS or EXCEPTION please retry
     * response.resultRespMsg is result message
     */
    public QueryCardInfoResponse queryCardInfo(QueryCardInfoRequest request) {
        QInfoRequest bizRequest = BeanConvertUtil.convert2QueryCardInfoRequest(request);
        QInfoResponse bizResponse = vccBiz.qInfo(bizRequest);
        return BeanConvertUtil.convert2QueryCardInfoResponse(bizResponse);
    }

    /**
     * VCC <queryMerchantInfo>
     * request.requestId/requestTime/merchantName/cardLogId  can not null
     * @return QueryMerchantInfoResponse
     * return merchant info
     * response.resultstatus enums is : PROCESS：处理中 SUCCEED：成功 FAILURE：失败 EXCEPTION：异常
     * if response.resultstatus is PROCESS or EXCEPTION please retry
     * response.resultRespMsg is result message
     */
    public QueryMerchantInfoResponse queryMerchantInfo(QueryMerchantInfoRequest request){
        QInfoRequest bizRequest = BeanConvertUtil.convert2QueryMerchantInfoRequest(request);
        QInfoResponse bizResponse = vccBiz.qInfo(bizRequest);
        return BeanConvertUtil.convert2QueryMerchantInfoResponse(bizResponse);
    }

    /**
     * VCC <queryAccountInfo>
     * request.requestId/requestTime/merchantName can not null
     * @return QueryAccountInfoResponse
     * return account info
     * response.resultstatus enums is : PROCESS：处理中 SUCCEED：成功 FAILURE：失败 EXCEPTION：异常
     * if response.resultstatus is PROCESS or EXCEPTION please retry
     * response.resultRespMsg is result message
     */
    public QueryAccountInfoResponse queryAccountInfo(QueryAccountInfoRequest request){
        QInfoRequest bizRequest = BeanConvertUtil.convert2QueryAccountInfoRequest(request);
        QInfoResponse bizResponse = vccBiz.qInfo(bizRequest);
        return BeanConvertUtil.convert2QueryAccountInfoResponse(bizResponse);
    }

    /**
     * VCC <queryAuthTransInfo>
     * request.requestId/requestTime/merchantName/cardLogId  can not null
     * @return QueryAuthTransInfoResponse
     * return auth trans info
     * response.resultstatus enums is : PROCESS：处理中 SUCCEED：成功 FAILURE：失败 EXCEPTION：异常
     * if response.resultstatus is PROCESS or EXCEPTION please retry
     * response.resultRespMsg is result message
     */
    public QueryAuthTransInfoResponse queryAuthTransInfo(QueryAuthTransInfoRequest request) {
        QTransInfoRequest bizRequest = BeanConvertUtil.convert2QueryAuthTransInfoRequest(request);
        QTransInfoResponse bizResponse = vccBiz.qTransInfo(bizRequest);
        return BeanConvertUtil.convert2QueryAuthTransInfoResponse(bizResponse);
    }

    /**
     * VCC <querySettlemetTransInfo>
     * request.requestId/requestTime/merchantName/cardLogId  can not null
     * @return QuerySettlemetTransInfoResponse
     * return settlement trans info
     * response.resultstatus enums is : PROCESS：处理中 SUCCEED：成功 FAILURE：失败 EXCEPTION：异常
     * if response.resultstatus is PROCESS or EXCEPTION please retry
     * response.resultRespMsg is result message
     */
    public QuerySettlemetTransInfoResponse querySettlemetTransInfo(QuerySettlemetTransInfoRequest request) {
        QTransInfoRequest bizRequest = BeanConvertUtil.convert2QuerySettlemetTransInfoRequest(request);
        QTransInfoResponse bizResponse = vccBiz.qTransInfo(bizRequest);
        return BeanConvertUtil.convert2QuerySettlemetTransInfoResponse(bizResponse);
    }

    /**
     * VCC <suspend> card
     * request.requestId/requestTime/merchantName/cardLogId/  can not null
     * @return SuspendResponse
     * response.resultstatus enums is : PROCESS：处理中 SUCCEED：成功 FAILURE：失败 EXCEPTION：异常
     * if response.resultstatus is PROCESS or EXCEPTION please retry
     * response.resultRespMsg is result message
     */
    @Override
    public SuspendResponse suspend(SuspendRequest request){
        OperateRequest bizRequest = BeanConvertUtil.convert2SuspendRequest(request);
        OperateResponse bizResponse = vccBiz.operate(bizRequest);
        return BeanConvertUtil.convert2SuspendResponse(bizResponse);
    }

    /**
     * VCC <unSuspend> card
     * request.requestId/requestTime/merchantName/cardLogId/  can not null
     * @return UnsuspendResponse
     * response.resultstatus enums is : PROCESS：处理中 SUCCEED：成功 FAILURE：失败 EXCEPTION：异常
     * if response.resultstatus is PROCESS or EXCEPTION please retry
     * response.resultRespMsg is result message
     */
    @Override
    public UnSuspendResponse unSuspend(UnSuspendRequest request) {
        OperateRequest bizRequest = BeanConvertUtil.convert2UnSuspendRequest(request);
        OperateResponse bizResponse = vccBiz.operate(bizRequest);
        return BeanConvertUtil.convert2UnSuspendResponse(bizResponse);
    }

    @Override
    public QueryAuthTransInfoByPageResponse queryAuthTransInfoByPage(QueryAuthTransInfoByPageRequest request) {
        QTransInfoRequest bizRequest = BeanConvertUtil.convert2QueryAuthTransInfoByPageRequest(request);
        QTransInfoResponse bizResponse = vccBiz.qTransInfo(bizRequest);
        return BeanConvertUtil.convert2QueryAuthTransInfoByPageResponse(bizResponse);
    }

    @Override
    public QuerySettlemetTransInfoByPageResponse querySettlemetTransInfoByPage(QuerySettlemetTransInfoByPageRequest request) {
        QTransInfoRequest bizRequest = BeanConvertUtil.convert2QuerySettlemetTransInfoByPageRequest(request);
        QTransInfoResponse bizResponse = vccBiz.qTransInfo(bizRequest);
        return BeanConvertUtil.convert2QuerySettlemetTransInfoByPageResponse(bizResponse);
    }
}
