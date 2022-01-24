package com.ctrip.ccard.creditcard.vcc.util;

import com.ctrip.ccard.creditcard.vcc.bean.V1.CardInfo;
import com.ctrip.ccard.creditcard.vcc.bean.V1.CloseRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.CloseResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.CreateCardInfo;
import com.ctrip.ccard.creditcard.vcc.bean.V1.CreateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.CreateResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.OperateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.OperateResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QInfoRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QInfoResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QOperateResultRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QOperateResultResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QTransInfoRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QTransInfoResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryAccountInfoRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryAccountInfoResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryAuthTransInfoRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryAuthTransInfoResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryCardInfo;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryCardInfoRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryCardInfoResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryCloseResultRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryCloseResultResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryCreateResultRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryCreateResultResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryMerchantInfoRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryMerchantInfoResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QuerySettlemetTransInfoRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QuerySettlemetTransInfoResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryUpdateResultRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryUpdateResultResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.RechargeRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.RechargeResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.UpdateCardInfo;
import com.ctrip.ccard.creditcard.vcc.bean.V1.UpdateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.UpdateResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.WithdrawRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.WithdrawResponse;

public class BeanConvertUtil {

    //operate接口 请求子类型值
    private static final String SUB_REQUEST_TYPE_CREATE = "CARD_EXTERNAL";
    //operate接口 开卡请求类型值
    private static final String REQUEST_TYPE_CREATE = "CREATE";
    //operate接口 更新卡请求类型值
    private static final String REQUEST_TYPE_UPDATE = "UPDATE";
    //operate接口 充值卡请求类型值
    private static final String REQUEST_TYPE_RECHARGE = "RECHARGE";
    //operate接口 提现卡请求类型值
    private static final String REQUEST_TYPE_WITHDRAW = "WITHDRAW";
    //operate接口 关闭卡请求类型值
    private static final String REQUEST_TYPE_CLOSE = "CLOSE";
    //qInfo接口 请求类型值
    private static final String REQUEST_TYPE_QINFO = "GET";
    //qInfo接口 请求子类型值 商户信息
    private static final String SUB_REQUEST_TYPE_MERCHANT = "MERCHANT_INFO";
    //qInfo接口 请求子类型值 账户信息
    private static final String SUB_REQUEST_TYPE_ACCOUNT = "ACCOUNT_INFO";
    //qTransInfo接口 请求类型值
    private static final String REQUEST_TYPE_QTRANS = "TRANS";
    //qTransInfo接口 请求子类型值 预授权交易
    private static final String SUB_REQUEST_TYPE_AUTH = "AUTH";
    //qTransInfo接口 请求子类型值 清算交易
    private static final String SUB_REQUEST_TYPE_SETTLEMENT = "SETTLEMENT";

    /**
     * operate接口请求数据 ：开卡操作
     */
    public static OperateRequest convert2CreateRequest(CreateRequest request){
        OperateRequest operateRequest = new OperateRequest();
        //请求流水号
        operateRequest.setRequestId(request.getRequestId());
        //请求时间 yyyyMMddHHmmss
        operateRequest.setRequestTime(request.getRequestTime());
        //请求类型
        operateRequest.setRequestType(REQUEST_TYPE_CREATE);
        //请求子类型
        operateRequest.setSubRequestType(SUB_REQUEST_TYPE_CREATE);
        //商户名
        operateRequest.setMerchantName(request.getMerchantName());
        //发卡通道类型
        operateRequest.setChannelType(request.getChannelType());
        //请求来源标注
        operateRequest.setRequestSource(request.getRequestSource());
        //调用端操作人
        operateRequest.setOperator(request.getOperator());
        //请求扩展字段
        operateRequest.setReqExtra(request.getReqExtra());
        //风控信息
        operateRequest.setRiskInfo(request.getRiskInfo());
        if(null != request.getCardInfo()){
            CreateCardInfo createCardInfo = request.getCardInfo();
            //卡信息
            CardInfo cardInfo = new CardInfo();
            //开卡币种
            cardInfo.setLocalCurrency(createCardInfo.getLocalCurrency());
            //结算币种
            cardInfo.setBillCurrency(createCardInfo.getBillCurrency());
            //卡生效日期 <yyyy-MM-dd>
            cardInfo.setStartActiveDate(createCardInfo.getStartActiveDate());
            //最晚关卡日期 <yyyy-MM-dd>
            cardInfo.setEndCloseDate(createCardInfo.getEndCloseDate());
            //卡额度
            cardInfo.setCreditLimitAmt(createCardInfo.getCreditLimitAmt());
            //卡最低可扣款金额
            cardInfo.setMinAuthAmt(createCardInfo.getMinAuthAmt());
            //卡最高可扣款金额
            cardInfo.setMaxAuthAmt(createCardInfo.getMaxAuthAmt());
            //是否可多次使用
            cardInfo.setEnableMutilUse(createCardInfo.getEnableMutilUse());
            //自动关卡百分数设定
            cardInfo.setClosePercentage(createCardInfo.getClosePercentage());
            //商户控制方式
            cardInfo.setMerchantControlMethod(createCardInfo.getMerchantControlMethod());
            //MCC类别
            cardInfo.setMerchantCategoryName(createCardInfo.getMerchantCategoryName());
            //商户号
            cardInfo.setMerchantCode(createCardInfo.getMerchantCode());
            //是否支持3ds验证
            cardInfo.setEnable3DS(createCardInfo.getEnable3DS());
            //是否启用CVV检验
            cardInfo.setEnaleCVVCheck(createCardInfo.getEnaleCVVCheck());
            //是否启用交易币种限制
            cardInfo.setEnableCurrencyCheck(createCardInfo.getEnableCurrencyCheck());
            //用户自定义信息
            cardInfo.setUserDefineInfo(createCardInfo.getUserDefineInfo());
            //卡组
            cardInfo.setCardLabel(createCardInfo.getCardLabel());
            operateRequest.setCardInfo(cardInfo);
        }
        return operateRequest;
    }

    /**
     * operate接口返回数据 ：开卡操作
     */
    public static CreateResponse convert2CreateResponse(OperateResponse operateResponse){
        CreateResponse createResponse = new CreateResponse();
        //结果状态
        createResponse.setResultStatus(operateResponse.getResultstatus());
        //结果码
        createResponse.setResultRespCode(operateResponse.getResultRespCode());
        //结果码描述
        createResponse.setResultRespMsg(operateResponse.getResultRespMsg());
        //结果码详细描述
        createResponse.setResultRespDetailMsg(operateResponse.getResultRespDetailMsg());
        //发卡通道类型
        createResponse.setChannelType(operateResponse.getChannelType());
        //VCC生成的唯一流水号
        createResponse.setCcOpId(operateResponse.getCcOpId());
        //原请求流水号
        createResponse.setRequestId(operateResponse.getRequestId());
        //原请求时间
        createResponse.setRequestTime(operateResponse.getRequestTime());
        //原请求商户名
        createResponse.setMerchantName(operateResponse.getMerchantName());
        //响应扩展数据
        createResponse.setRespExtra(operateResponse.getRespExtra());
        if(null != operateResponse.getCardInfo()){
            CardInfo cardInfo = operateResponse.getCardInfo();
            //VCC发行卡片处唯一参考号
            createResponse.setCardLogId(cardInfo.getCardLogId());
            //卡号
            createResponse.setCardNo(cardInfo.getCardNo());
            //卡安全验证码CVV（3位）
            createResponse.setCardVerifyNo(cardInfo.getCardVerifyNo());
            //卡有效期 <yyyyMM>
            createResponse.setCardExpiryDate(cardInfo.getCardExpiryDate());
            //卡组
            createResponse.setCardLabel(cardInfo.getCardLabel());
        }
        return createResponse;
    }

    /**
     * operate接口请求数据 ：更新卡操作
     */
    public static OperateRequest convert2UpdateRequest(UpdateRequest request){
        OperateRequest operateRequest = new OperateRequest();
        //请求流水号
        operateRequest.setRequestId(request.getRequestId());
        //请求时间 yyyyMMddHHmmss
        operateRequest.setRequestTime(request.getRequestTime());
        //请求类型
        operateRequest.setRequestType(REQUEST_TYPE_UPDATE);
        //请求子类型
        operateRequest.setSubRequestType(SUB_REQUEST_TYPE_CREATE);
        //商户名
        operateRequest.setMerchantName(request.getMerchantName());
        //发卡通道类型
        operateRequest.setChannelType(request.getChannelType());
        //请求来源标注
        operateRequest.setRequestSource(request.getRequestSource());
        //调用端操作人
        operateRequest.setOperator(request.getOperator());
        //请求扩展字段
        operateRequest.setReqExtra(request.getReqExtra());
        //风控信息
        operateRequest.setRiskInfo(request.getRiskInfo());
        if(null != request.getCardInfo()){
            UpdateCardInfo updateCardInfo = request.getCardInfo();
            //卡信息
            CardInfo cardInfo = new CardInfo();
            //VCC发行卡片处唯一参考号
            cardInfo.setCardLogId(updateCardInfo.getCardLogId());
            //卡生效日期 <yyyy-MM-dd>
            cardInfo.setStartActiveDate(updateCardInfo.getStartActiveDate());
            //最晚关卡日期 <yyyy-MM-dd>
            cardInfo.setEndCloseDate(updateCardInfo.getEndCloseDate());
            //卡额度
            cardInfo.setCreditLimitAmt(updateCardInfo.getCreditLimitAmt());
            //卡最低可扣款金额
            cardInfo.setMinAuthAmt(updateCardInfo.getMinAuthAmt());
            //卡最高可扣款金额
            cardInfo.setMaxAuthAmt(updateCardInfo.getMaxAuthAmt());
            //自动关卡百分数设定
            cardInfo.setClosePercentage(updateCardInfo.getClosePercentage());
            //商户控制方式
            cardInfo.setMerchantControlMethod(updateCardInfo.getMerchantControlMethod());
            //MCC类别
            cardInfo.setMerchantCategoryName(updateCardInfo.getMerchantCategoryName());
            //商户号
            cardInfo.setMerchantCode(updateCardInfo.getMerchantCode());
            //是否支持3ds验证
            cardInfo.setEnable3DS(updateCardInfo.getEnable3DS());
            //是否启用CVV检验
            cardInfo.setEnaleCVVCheck(updateCardInfo.getEnaleCVVCheck());
            //是否启用交易币种限制
            cardInfo.setEnableCurrencyCheck(updateCardInfo.getEnableCurrencyCheck());
            //用户自定义信息
            cardInfo.setUserDefineInfo(updateCardInfo.getUserDefineInfo());
            operateRequest.setCardInfo(cardInfo);
        }
        return operateRequest;
    }

    /**
     * operate接口返回数据 ：更新卡操作
     */
    public static UpdateResponse convert2UpdateResponse(OperateResponse operateResponse){
        UpdateResponse updateResponse = new UpdateResponse();
        //结果状态
        updateResponse.setResultStatus(operateResponse.getResultstatus());
        //结果码
        updateResponse.setResultRespCode(operateResponse.getResultRespCode());
        //结果码描述
        updateResponse.setResultRespMsg(operateResponse.getResultRespMsg());
        //结果码详细描述
        updateResponse.setResultRespDetailMsg(operateResponse.getResultRespDetailMsg());
        //发卡通道类型
        updateResponse.setChannelType(operateResponse.getChannelType());
        //VCC生成的唯一流水号
        updateResponse.setCcOpId(operateResponse.getCcOpId());
        //原请求流水号
        updateResponse.setRequestId(operateResponse.getRequestId());
        //原请求时间
        updateResponse.setRequestTime(operateResponse.getRequestTime());
        //原请求商户名
        updateResponse.setMerchantName(operateResponse.getMerchantName());
        //响应扩展数据
        updateResponse.setRespExtra(operateResponse.getRespExtra());
        if(null != operateResponse.getCardInfo()){
            CardInfo cardInfo = operateResponse.getCardInfo();
            //VCC发行卡片处唯一参考号
            updateResponse.setCardLogId(cardInfo.getCardLogId());
            //卡号
            updateResponse.setCardNo(cardInfo.getCardNo());
            //卡安全验证码CVV（3位）
            updateResponse.setCardVerifyNo(cardInfo.getCardVerifyNo());
            //卡有效期 <yyyyMM>
            updateResponse.setCardExpiryDate(cardInfo.getCardExpiryDate());
        }
        return updateResponse;
    }

    /**
     * operate接口请求数据 ：关闭卡操作
     */
    public static OperateRequest convert2CloseRequest(CloseRequest request){
        OperateRequest operateRequest = new OperateRequest();
        //请求流水号
        operateRequest.setRequestId(request.getRequestId());
        //请求时间 yyyyMMddHHmmss
        operateRequest.setRequestTime(request.getRequestTime());
        //请求类型
        operateRequest.setRequestType(REQUEST_TYPE_CLOSE);
        //请求子类型
        operateRequest.setSubRequestType(SUB_REQUEST_TYPE_CREATE);
        //商户名
        operateRequest.setMerchantName(request.getMerchantName());
        //发卡通道类型
        operateRequest.setChannelType(request.getChannelType());
        //请求来源标注
        operateRequest.setRequestSource(request.getRequestSource());
        //调用端操作人
        operateRequest.setOperator(request.getOperator());
        //请求扩展字段
        operateRequest.setReqExtra(request.getReqExtra());
        //卡信息
        CardInfo cardInfo = new CardInfo();
        //VCC发行卡片处唯一参考号
        cardInfo.setCardLogId(request.getCardLogId());
        operateRequest.setCardInfo(cardInfo);
        return operateRequest;
    }

    /**
     * operate接口返回数据 ：关闭卡操作
     */
    public static CloseResponse convert2CloseResponse(OperateResponse operateResponse){
        CloseResponse closeResponse = new CloseResponse();
        //结果状态
        closeResponse.setResultStatus(operateResponse.getResultstatus());
        //结果码
        closeResponse.setResultRespCode(operateResponse.getResultRespCode());
        //结果码描述
        closeResponse.setResultRespMsg(operateResponse.getResultRespMsg());
        //结果码详细描述
        closeResponse.setResultRespDetailMsg(operateResponse.getResultRespDetailMsg());
        //发卡通道类型
        closeResponse.setChannelType(operateResponse.getChannelType());
        //VCC生成的唯一流水号
        closeResponse.setCcOpId(operateResponse.getCcOpId());
        //原请求流水号
        closeResponse.setRequestId(operateResponse.getRequestId());
        //原请求时间
        closeResponse.setRequestTime(operateResponse.getRequestTime());
        //原请求商户名
        closeResponse.setMerchantName(operateResponse.getMerchantName());
        //响应扩展数据
        closeResponse.setRespExtra(operateResponse.getRespExtra());
        if(null != operateResponse.getCardInfo()){
            CardInfo cardInfo = operateResponse.getCardInfo();
            //VCC发行卡片处唯一参考号
            closeResponse.setCardLogId(cardInfo.getCardLogId());
        }
        return closeResponse;
    }

    /**
     * qOperateResult接口请求数据 ：开卡结果查询
     */
    public static QOperateResultRequest convert2QueryCreateResultRequest(QueryCreateResultRequest request){
        QOperateResultRequest operateResultRequest = new QOperateResultRequest();
        //请求流水号
        operateResultRequest.setRequestId(request.getRequestId());
        //请求时间 yyyyMMddHHmmss
        operateResultRequest.setRequestTime(request.getRequestTime());
        //请求类型
        operateResultRequest.setRequestType(REQUEST_TYPE_CREATE);
        //请求子类型
        operateResultRequest.setSubRequestType(SUB_REQUEST_TYPE_CREATE);
        //商户名
        operateResultRequest.setMerchantName(request.getMerchantName());
        //请求扩展字段
        operateResultRequest.setReqExtra(request.getReqExtra());
        //操作人
        operateResultRequest.setOperator(request.getOperator());
        return operateResultRequest;
    }

    /**
     * qOperateResult接口返回数据 ：开卡结果查询
     */
    public static QueryCreateResultResponse convert2QueryCreateResultResponse(QOperateResultResponse operateResultResponse){
        QueryCreateResultResponse queryCreateResultResponse = new QueryCreateResultResponse();
        //查询状态
        queryCreateResultResponse.setqResultStatus(operateResultResponse.getqResultStatus());
        //查询结果码
        queryCreateResultResponse.setqResultCode(operateResultResponse.getqResultCode());
        //查询结果描述
        queryCreateResultResponse.setqResultMsg(operateResultResponse.getqResultMsg());
        //开卡结果状态
        queryCreateResultResponse.setResultStatus(operateResultResponse.getResultstatus());
        //开卡结果码
        queryCreateResultResponse.setResultRespCode(operateResultResponse.getResultRespCode());
        //开卡结果码描述
        queryCreateResultResponse.setResultRespMsg(operateResultResponse.getResultRespMsg());
        //发卡通道类型
        queryCreateResultResponse.setChannelType(operateResultResponse.getChannelType());
        //VCC生成的唯一流水号
        queryCreateResultResponse.setCcOpId(operateResultResponse.getCcOpId());
        //原请求流水号
        queryCreateResultResponse.setRequestId(operateResultResponse.getRequestId());
        //原请求时间
        queryCreateResultResponse.setRequestTime(operateResultResponse.getRequestTime());
        //原请求商户名
        queryCreateResultResponse.setMerchantName(operateResultResponse.getMerchantName());
        //响应扩展数据
        queryCreateResultResponse.setRespExtra(operateResultResponse.getRespExtra());
        if(null != operateResultResponse.getCardInfo()){
            CardInfo cardInfo = operateResultResponse.getCardInfo();
            //VCC发行卡片处唯一参考号
            queryCreateResultResponse.setCardLogId(cardInfo.getCardLogId());
            //卡号
            queryCreateResultResponse.setCardNo(cardInfo.getCardNo());
            //卡安全验证码CVV（3位）
            queryCreateResultResponse.setCardVerifyNo(cardInfo.getCardVerifyNo());
            //卡有效期 <yyyyMM>
            queryCreateResultResponse.setCardExpiryDate(cardInfo.getCardExpiryDate());
        }
        return queryCreateResultResponse;
    }

    /**
     * qOperateResult接口请求数据 ：更新卡结果查询
     */
    public static QOperateResultRequest convert2QueryUpdateResultRequest(QueryUpdateResultRequest request){
        QOperateResultRequest operateResultRequest = new QOperateResultRequest();
        //请求流水号
        operateResultRequest.setRequestId(request.getRequestId());
        //请求时间 yyyyMMddHHmmss
        operateResultRequest.setRequestTime(request.getRequestTime());
        //请求类型
        operateResultRequest.setRequestType(REQUEST_TYPE_UPDATE);
        //请求子类型
        operateResultRequest.setSubRequestType(SUB_REQUEST_TYPE_CREATE);
        //商户名
        operateResultRequest.setMerchantName(request.getMerchantName());
        //请求扩展字段
        operateResultRequest.setReqExtra(request.getReqExtra());
        //操作人
        operateResultRequest.setOperator(request.getOperator());
        return operateResultRequest;
    }

    /**
     * qOperateResult接口返回数据 ：更新卡结果查询
     */
    public static QueryUpdateResultResponse convert2QueryUpdateResultResponse(QOperateResultResponse operateResultResponse){
        QueryUpdateResultResponse queryUpdateResultResponse = new QueryUpdateResultResponse();
        //查询状态
        queryUpdateResultResponse.setqResultStatus(operateResultResponse.getqResultStatus());
        //查询结果码
        queryUpdateResultResponse.setqResultCode(operateResultResponse.getqResultCode());
        //查询结果描述
        queryUpdateResultResponse.setqResultMsg(operateResultResponse.getqResultMsg());
        //更新卡结果状态
        queryUpdateResultResponse.setResultStatus(operateResultResponse.getResultstatus());
        //更新卡结果码
        queryUpdateResultResponse.setResultRespCode(operateResultResponse.getResultRespCode());
        //更新卡结果码描述
        queryUpdateResultResponse.setResultRespMsg(operateResultResponse.getResultRespMsg());
        //发卡通道类型
        queryUpdateResultResponse.setChannelType(operateResultResponse.getChannelType());
        //VCC生成的唯一流水号
        queryUpdateResultResponse.setCcOpId(operateResultResponse.getCcOpId());
        //原请求流水号
        queryUpdateResultResponse.setRequestId(operateResultResponse.getRequestId());
        //原请求时间
        queryUpdateResultResponse.setRequestTime(operateResultResponse.getRequestTime());
        //原请求商户名
        queryUpdateResultResponse.setMerchantName(operateResultResponse.getMerchantName());
        //响应扩展数据
        queryUpdateResultResponse.setRespExtra(operateResultResponse.getRespExtra());
        if(null != operateResultResponse.getCardInfo()){
            CardInfo cardInfo = operateResultResponse.getCardInfo();
            //VCC发行卡片处唯一参考号
            queryUpdateResultResponse.setCardLogId(cardInfo.getCardLogId());
            //卡号
            queryUpdateResultResponse.setCardNo(cardInfo.getCardNo());
            //卡安全验证码CVV（3位）
            queryUpdateResultResponse.setCardVerifyNo(cardInfo.getCardVerifyNo());
            //卡有效期 <yyyyMM>
            queryUpdateResultResponse.setCardExpiryDate(cardInfo.getCardExpiryDate());
        }
        return queryUpdateResultResponse;
    }

    /**
     * qOperateResult接口请求数据 ：关闭卡结果查询
     */
    public static QOperateResultRequest convert2QueryCloseResultRequest(QueryCloseResultRequest request){
        QOperateResultRequest operateResultRequest = new QOperateResultRequest();
        //请求流水号
        operateResultRequest.setRequestId(request.getRequestId());
        //请求时间 yyyyMMddHHmmss
        operateResultRequest.setRequestTime(request.getRequestTime());
        //请求类型
        operateResultRequest.setRequestType(REQUEST_TYPE_CLOSE);
        //请求子类型
        operateResultRequest.setSubRequestType(SUB_REQUEST_TYPE_CREATE);
        //商户名
        operateResultRequest.setMerchantName(request.getMerchantName());
        //请求扩展字段
        operateResultRequest.setReqExtra(request.getReqExtra());
        //操作人
        operateResultRequest.setOperator(request.getOperator());
        return operateResultRequest;
    }

    /**
     * qOperateResult接口返回数据 ：关闭卡结果查询
     */
    public static QueryCloseResultResponse convert2QueryCloseResultResponse(QOperateResultResponse operateResultResponse){
        QueryCloseResultResponse queryCloseResultResponse = new QueryCloseResultResponse();
        //查询状态
        queryCloseResultResponse.setqResultStatus(operateResultResponse.getqResultStatus());
        //查询结果码
        queryCloseResultResponse.setqResultCode(operateResultResponse.getqResultCode());
        //查询结果描述
        queryCloseResultResponse.setqResultMsg(operateResultResponse.getqResultMsg());
        //关闭卡结果状态
        queryCloseResultResponse.setResultStatus(operateResultResponse.getResultstatus());
        //关闭卡结果码
        queryCloseResultResponse.setResultRespCode(operateResultResponse.getResultRespCode());
        //关闭卡结果码描述
        queryCloseResultResponse.setResultRespMsg(operateResultResponse.getResultRespMsg());
        //发卡通道类型
        queryCloseResultResponse.setChannelType(operateResultResponse.getChannelType());
        //VCC生成的唯一流水号
        queryCloseResultResponse.setCcOpId(operateResultResponse.getCcOpId());
        //原请求流水号
        queryCloseResultResponse.setRequestId(operateResultResponse.getRequestId());
        //原请求时间
        queryCloseResultResponse.setRequestTime(operateResultResponse.getRequestTime());
        //原请求商户名
        queryCloseResultResponse.setMerchantName(operateResultResponse.getMerchantName());
        //响应扩展数据
        queryCloseResultResponse.setRespExtra(operateResultResponse.getRespExtra());
        if(null != operateResultResponse.getCardInfo()){
            CardInfo cardInfo = operateResultResponse.getCardInfo();
            //VCC发行卡片处唯一参考号
            queryCloseResultResponse.setCardLogId(cardInfo.getCardLogId());
        }
        return queryCloseResultResponse;
    }

    /**
     * qInfo接口请求数据 卡信息查询
     */
    public static QInfoRequest convert2QueryCardInfoRequest(QueryCardInfoRequest request){
        QInfoRequest qInfoRequest = new QInfoRequest();
        //请求流水号
        qInfoRequest.setRequestId(request.getRequestId());
        //请求时间 yyyyMMddHHmmss
        qInfoRequest.setRequestTime(request.getRequestTime());
        //请求类型
        qInfoRequest.setRequestType(REQUEST_TYPE_QINFO);
        //请求子类型
        qInfoRequest.setSubRequestType(SUB_REQUEST_TYPE_CREATE);
        //商户名
        qInfoRequest.setMerchantName(request.getMerchantName());
        //发卡通道类型
        qInfoRequest.setChannelType(request.getChannelType());
        //请求扩展字段
        qInfoRequest.setReqExtra(request.getReqExtra());
        //操作人
        qInfoRequest.setOperator(request.getOperator());
       //卡信息
        CardInfo cardInfo = new CardInfo();
        //VCC发行卡片处唯一参考号
        cardInfo.setCardLogId(request.getCardLogId());
        qInfoRequest.setCardInfo(cardInfo);
        return qInfoRequest;
    }

    /**
     * qInfo接口返回数据  卡信息查询
     */
    public static QueryCardInfoResponse convert2QueryCardInfoResponse(QInfoResponse qInfoResponse){
        QueryCardInfoResponse queryCardInfoResponse = new QueryCardInfoResponse();
        //结果状态
        queryCardInfoResponse.setResultStatus(qInfoResponse.getResultstatus());
        //结果码
        queryCardInfoResponse.setResultRespCode(qInfoResponse.getResultRespCode());
        //结果码描述
        queryCardInfoResponse.setResultRespMsg(qInfoResponse.getResultRespMsg());
        //结果码详细描述
        queryCardInfoResponse.setResultRespDetailMsg(qInfoResponse.getResultRespDetailMsg());
        //请求流水号
        queryCardInfoResponse.setRequestId(qInfoResponse.getRequestId());
        //请求时间
        queryCardInfoResponse.setRequestTime(qInfoResponse.getRequestTime());
        //请求商户名
        queryCardInfoResponse.setMerchantName(qInfoResponse.getMerchantName());
        //发卡通道类型
        queryCardInfoResponse.setChannelType(qInfoResponse.getChannelType());
        //响应扩展数据
        queryCardInfoResponse.setRespExtra(qInfoResponse.getRespExtra());
        if(null != qInfoResponse.getCardInfo()){
            CardInfo cardInfo = qInfoResponse.getCardInfo();
            //卡信息
            QueryCardInfo queryCardInfo = new QueryCardInfo();
            //VCC发行卡片处唯一参考号
            queryCardInfo.setCardLogId(cardInfo.getCardLogId());
            //卡号
            queryCardInfo.setCardNo(cardInfo.getCardNo());
            //卡安全验证码CVV（3位）
            queryCardInfo.setCardVerifyNo(cardInfo.getCardVerifyNo());
            //卡有效期 <yyyyMM>
            queryCardInfo.setCardExpiryDate(cardInfo.getCardExpiryDate());
            //卡具体失效日期 <yyyy-MM-dd>
            queryCardInfo.setCardFullExpiryDate(cardInfo.getCardFullExpiryDate());
            //卡类型
            queryCardInfo.setCardType(cardInfo.getCardType());
            //卡组
            queryCardInfo.setCardLabel(cardInfo.getCardLabel());
            //卡本币种 开卡币种
            queryCardInfo.setLocalCurrency(cardInfo.getLocalCurrency());
            //卡入账币种 结算币种
            queryCardInfo.setBillCurrency(cardInfo.getBillCurrency());
            //卡入账币种对应的金额
            queryCardInfo.setBillCurrencyAmt(cardInfo.getBillCurrencyAmt());
            //卡生效日期 <yyyy-MM-dd>
            queryCardInfo.setStartActiveDate(cardInfo.getStartActiveDate());
            //最晚关卡日期 <yyyy-MM-dd>
            queryCardInfo.setEndCloseDate(cardInfo.getEndCloseDate());
            //卡额度
            queryCardInfo.setCreditLimitAmt(cardInfo.getCreditLimitAmt());
            //卡最低可扣款金额
            queryCardInfo.setMinAuthAmt(cardInfo.getMinAuthAmt());
            //卡最高可扣款金额
            queryCardInfo.setMaxAuthAmt(cardInfo.getMaxAuthAmt());
            //卡余额
            queryCardInfo.setBalanceAmt(cardInfo.getBalanceAmt());
            //卡总授权金额
            queryCardInfo.setTotalAuthAmt(cardInfo.getTotalAuthAmt());
            //卡总清算金额
            queryCardInfo.setTotalSettleAmt(cardInfo.getTotalSettleAmt());
            //卡总退款金额
            queryCardInfo.setTotalRefundAmt(cardInfo.getTotalRefundAmt());
            //减去退款金额后的实际结算金额
            queryCardInfo.setNetSettleAmt(cardInfo.getNetSettleAmt());
            //未结算的授权金额
            queryCardInfo.setOutStandingAuthAmt(cardInfo.getOutStandingAuthAmt());
            //是否可多次使用
            queryCardInfo.setEnableMutilUse(cardInfo.getEnableMutilUse());
            //自动关卡百分数设定
            queryCardInfo.setClosePercentage(cardInfo.getClosePercentage());
            //商户控制方式
            queryCardInfo.setMerchantControlMethod(cardInfo.getMerchantControlMethod());
            //MCC类别
            queryCardInfo.setMerchantCategoryName(cardInfo.getMerchantCategoryName());
            //商户号
            queryCardInfo.setMerchantCode(cardInfo.getMerchantCode());
            //是否支持3ds验证
            queryCardInfo.setEnable3DS(cardInfo.getEnable3DS());
            //是否启用CVV检验
            queryCardInfo.setEnaleCVVCheck(cardInfo.getEnaleCVVCheck());
            //是否启用交易币种限制
            queryCardInfo.setEnableCurrencyCheck(cardInfo.getEnableCurrencyCheck());
            //卡状态
            queryCardInfo.setCardStatus(cardInfo.getCardStatus());
            //用户自定义信息
            queryCardInfo.setUserDefineInfo(cardInfo.getUserDefineInfo());
            queryCardInfoResponse.setCardInfo(queryCardInfo);
        }
        return queryCardInfoResponse;
    }

    /**
     * qInfo接口请求数据 商户信息查询
     */
    public static QInfoRequest convert2QueryMerchantInfoRequest(QueryMerchantInfoRequest request){
        QInfoRequest qInfoRequest = new QInfoRequest();
        //请求流水号
        qInfoRequest.setRequestId(request.getRequestId());
        //请求时间 yyyyMMddHHmmss
        qInfoRequest.setRequestTime(request.getRequestTime());
        //请求类型
        qInfoRequest.setRequestType(REQUEST_TYPE_QINFO);
        //请求子类型
        qInfoRequest.setSubRequestType(SUB_REQUEST_TYPE_MERCHANT);
        //商户名
        qInfoRequest.setMerchantName(request.getMerchantName());
        //发卡通道类型
        qInfoRequest.setChannelType(request.getChannelType());
        //请求扩展字段
        qInfoRequest.setReqExtra(request.getReqExtra());
        //操作人
        qInfoRequest.setOperator(request.getOperator());
        //卡信息
        CardInfo cardInfo = new CardInfo();
        //VCC发行卡片处唯一参考号
        cardInfo.setCardLogId(request.getCardLogId());
        qInfoRequest.setCardInfo(cardInfo);
        return qInfoRequest;
    }

    /**
     * qInfo接口返回数据  商户信息查询
     */
    public static QueryMerchantInfoResponse convert2QueryMerchantInfoResponse(QInfoResponse qInfoResponse){
        QueryMerchantInfoResponse queryMerchantInfoResponse = new QueryMerchantInfoResponse();
        //结果状态
        queryMerchantInfoResponse.setResultStatus(qInfoResponse.getResultstatus());
        //结果码
        queryMerchantInfoResponse.setResultRespCode(qInfoResponse.getResultRespCode());
        //结果码描述
        queryMerchantInfoResponse.setResultRespMsg(qInfoResponse.getResultRespMsg());
        //结果码详细描述
        queryMerchantInfoResponse.setResultRespDetailMsg(qInfoResponse.getResultRespDetailMsg());
        //请求流水号
        queryMerchantInfoResponse.setRequestId(qInfoResponse.getRequestId());
        //请求时间
        queryMerchantInfoResponse.setRequestTime(qInfoResponse.getRequestTime());
        //请求商户名
        queryMerchantInfoResponse.setMerchantName(qInfoResponse.getMerchantName());
        //发卡通道类型
        queryMerchantInfoResponse.setChannelType(qInfoResponse.getChannelType());
        //响应扩展数据
        queryMerchantInfoResponse.setRespExtra(qInfoResponse.getRespExtra());
        if(null != qInfoResponse.getMerchantName()){
            queryMerchantInfoResponse.setMerchantInfo(qInfoResponse.getMerchantInfo());
        }
        return queryMerchantInfoResponse;
    }

    /**
     * qInfo接口请求数据 账户信息查询
     */
    public static QInfoRequest convert2QueryAccountInfoRequest(QueryAccountInfoRequest request) {
        QInfoRequest qInfoRequest = new QInfoRequest();
        //请求流水号
        qInfoRequest.setRequestId(request.getRequestId());
        //请求时间 yyyyMMddHHmmss
        qInfoRequest.setRequestTime(request.getRequestTime());
        //请求类型
        qInfoRequest.setRequestType(REQUEST_TYPE_QINFO);
        //请求子类型
        qInfoRequest.setSubRequestType(SUB_REQUEST_TYPE_ACCOUNT);
        //商户名
        qInfoRequest.setMerchantName(request.getMerchantName());
        //发卡通道类型
        qInfoRequest.setChannelType(request.getChannelType());
        //操作人
        qInfoRequest.setOperator(request.getOperator());
        return qInfoRequest;
    }

    /**
     * qInfo接口返回数据 账户信息查询
     */
    public static QueryAccountInfoResponse convert2QueryAccountInfoResponse(QInfoResponse qInfoResponse) {
        QueryAccountInfoResponse queryAccountInfoResponse = new QueryAccountInfoResponse();
        //结果状态
        queryAccountInfoResponse.setResultStatus(qInfoResponse.getResultstatus());
        //结果码
        queryAccountInfoResponse.setResultRespCode(qInfoResponse.getResultRespCode());
        //结果码描述
        queryAccountInfoResponse.setResultRespMsg(qInfoResponse.getResultRespMsg());
        //结果码详细描述
        queryAccountInfoResponse.setResultRespDetailMsg(qInfoResponse.getResultRespDetailMsg());
        //请求流水号
        queryAccountInfoResponse.setRequestId(qInfoResponse.getRequestId());
        //请求时间
        queryAccountInfoResponse.setRequestTime(qInfoResponse.getRequestTime());
        //请求商户名
        queryAccountInfoResponse.setMerchantName(qInfoResponse.getMerchantName());
        //发卡通道类型
        queryAccountInfoResponse.setChannelType(qInfoResponse.getChannelType());
        //商户信息
        queryAccountInfoResponse.setMerchantInfo(qInfoResponse.getMerchantInfo());
        return queryAccountInfoResponse;
    }

    /**
     * qTransInfo接口请求数据 预授权交易查询
     */
    public static QTransInfoRequest convert2QueryAuthTransInfoRequest(QueryAuthTransInfoRequest request){
        QTransInfoRequest qTransInfoRequest = new QTransInfoRequest();
        //请求流水号
        qTransInfoRequest.setRequestId(request.getRequestId());
        //请求时间 yyyyMMddHHmmss
        qTransInfoRequest.setRequestTime(request.getRequestTime());
        //请求类型
        qTransInfoRequest.setRequestType(REQUEST_TYPE_QTRANS);
        //请求子类型
        qTransInfoRequest.setSubRequestType(SUB_REQUEST_TYPE_AUTH);
        //请求渠道
        qTransInfoRequest.setChannelType(request.getChannelType());
        //商户名
        qTransInfoRequest.setMerchantName(request.getMerchantName());
        //查询开始日期
        qTransInfoRequest.setStartDate(request.getStartDate());
        //查询结束日期
        qTransInfoRequest.setEndDate(request.getEndDate());
        //请求扩展字段
        qTransInfoRequest.setReqExtra(request.getReqExtra());
        //操作人
        qTransInfoRequest.setOperator(request.getOperator());
        //卡信息
        CardInfo cardInfo = new CardInfo();
        //VCC发行卡片处唯一参考号
        cardInfo.setCardLogId(request.getCardLogId());
        qTransInfoRequest.setCardInfo(cardInfo);
        return qTransInfoRequest;
    }

    /**
     * qTransInfo接口返回数据  预授权交易查询
     */
    public static QueryAuthTransInfoResponse convert2QueryAuthTransInfoResponse(QTransInfoResponse qTransInfoResponse){
        QueryAuthTransInfoResponse queryAuthTransInfoResponse = new QueryAuthTransInfoResponse();
        //结果状态
        queryAuthTransInfoResponse.setResultStatus(qTransInfoResponse.getResultstatus());
        //结果码
        queryAuthTransInfoResponse.setResultRespCode(qTransInfoResponse.getResultRespCode());
        //结果码描述
        queryAuthTransInfoResponse.setResultRespMsg(qTransInfoResponse.getResultRespMsg());
        //结果码详细描述
        queryAuthTransInfoResponse.setResultRespDetailMsg(qTransInfoResponse.getResultRespDetailMsg());
        //请求流水号
        queryAuthTransInfoResponse.setRequestId(qTransInfoResponse.getRequestId());
        //请求时间
        queryAuthTransInfoResponse.setRequestTime(qTransInfoResponse.getRequestTime());
        //请求商户名
        queryAuthTransInfoResponse.setMerchantName(qTransInfoResponse.getMerchantName());
        //发卡通道类型
        queryAuthTransInfoResponse.setChannelType(qTransInfoResponse.getChannelType());
        if(null != qTransInfoResponse.getAuthInfoResp()){
            queryAuthTransInfoResponse.setAuthInfoResp(qTransInfoResponse.getAuthInfoResp());
        }
        return queryAuthTransInfoResponse;
    }

    /**
     * qTransInfo接口请求数据 清算交易查询
     */
    public static QTransInfoRequest convert2QuerySettlemetTransInfoRequest(QuerySettlemetTransInfoRequest request){
        QTransInfoRequest qTransInfoRequest = new QTransInfoRequest();
        //请求流水号
        qTransInfoRequest.setRequestId(request.getRequestId());
        //请求时间 yyyyMMddHHmmss
        qTransInfoRequest.setRequestTime(request.getRequestTime());
        //请求类型
        qTransInfoRequest.setRequestType(REQUEST_TYPE_QTRANS);
        //请求子类型
        qTransInfoRequest.setSubRequestType(SUB_REQUEST_TYPE_SETTLEMENT);
        //请求渠道
        qTransInfoRequest.setChannelType(request.getChannelType());
        //商户名
        qTransInfoRequest.setMerchantName(request.getMerchantName());
        //查询开始日期
        qTransInfoRequest.setStartDate(request.getStartDate());
        //查询结束日期
        qTransInfoRequest.setEndDate(request.getEndDate());
        //请求扩展字段
        qTransInfoRequest.setReqExtra(request.getReqExtra());
        //操作人
        qTransInfoRequest.setOperator(request.getOperator());
        //卡信息
        CardInfo cardInfo = new CardInfo();
        //VCC发行卡片处唯一参考号
        cardInfo.setCardLogId(request.getCardLogId());
        qTransInfoRequest.setCardInfo(cardInfo);
        return qTransInfoRequest;
    }

    /**
     * qTransInfo接口返回数据  清算交易查询
     */
    public static QuerySettlemetTransInfoResponse convert2QuerySettlemetTransInfoResponse(QTransInfoResponse qTransInfoResponse){
        QuerySettlemetTransInfoResponse querySettlemetTransInfoResponse = new QuerySettlemetTransInfoResponse();
        //结果状态
        querySettlemetTransInfoResponse.setResultStatus(qTransInfoResponse.getResultstatus());
        //结果码
        querySettlemetTransInfoResponse.setResultRespCode(qTransInfoResponse.getResultRespCode());
        //结果码描述
        querySettlemetTransInfoResponse.setResultRespMsg(qTransInfoResponse.getResultRespMsg());
        //结果码详细描述
        querySettlemetTransInfoResponse.setResultRespDetailMsg(qTransInfoResponse.getResultRespDetailMsg());
        //请求流水号
        querySettlemetTransInfoResponse.setRequestId(qTransInfoResponse.getRequestId());
        //请求时间
        querySettlemetTransInfoResponse.setRequestTime(qTransInfoResponse.getRequestTime());
        //请求商户名
        querySettlemetTransInfoResponse.setMerchantName(qTransInfoResponse.getMerchantName());
        //发卡通道类型
        querySettlemetTransInfoResponse.setChannelType(qTransInfoResponse.getChannelType());
        if(null != qTransInfoResponse.getSettlementInfoResp()){
            querySettlemetTransInfoResponse.setSettlementInfoResp(qTransInfoResponse.getSettlementInfoResp());
        }
        return querySettlemetTransInfoResponse;
    }


    /**
     * operate接口请求数据 ：充值卡操作
     */
    public static OperateRequest convert2RechargeRequest(RechargeRequest request){
        OperateRequest operateRequest = new OperateRequest();
        //请求流水号
        operateRequest.setRequestId(request.getRequestId());
        //请求时间 yyyyMMddHHmmss
        operateRequest.setRequestTime(request.getRequestTime());
        //请求类型
        operateRequest.setRequestType(REQUEST_TYPE_RECHARGE);
        //请求子类型
        operateRequest.setSubRequestType(SUB_REQUEST_TYPE_CREATE);
        //商户名
        operateRequest.setMerchantName(request.getMerchantName());
        //发卡通道类型
        operateRequest.setChannelType(request.getChannelType());
        //请求来源标注
        operateRequest.setRequestSource(request.getRequestSource());
        //调用端操作人
        operateRequest.setOperator(request.getOperator());
        //请求扩展字段
        operateRequest.setReqExtra(request.getReqExtra());
        //卡信息
        CardInfo cardInfo = new CardInfo();
        //VCC发行卡片处唯一参考号
        cardInfo.setCardLogId(request.getCardLogId());
        //充值金额
        cardInfo.setWillChangeAmt(request.getWillChangeAmt());
        operateRequest.setCardInfo(cardInfo);
        return operateRequest;
    }

    /**
     * operate接口请求数据 ：提现卡操作
     */
    public static OperateRequest convert2WithdrawRequest(WithdrawRequest request){
        OperateRequest operateRequest = new OperateRequest();
        //请求流水号
        operateRequest.setRequestId(request.getRequestId());
        //请求时间 yyyyMMddHHmmss
        operateRequest.setRequestTime(request.getRequestTime());
        //请求类型
        operateRequest.setRequestType(REQUEST_TYPE_WITHDRAW);
        //请求子类型
        operateRequest.setSubRequestType(SUB_REQUEST_TYPE_CREATE);
        //商户名
        operateRequest.setMerchantName(request.getMerchantName());
        //发卡通道类型
        operateRequest.setChannelType(request.getChannelType());
        //请求来源标注
        operateRequest.setRequestSource(request.getRequestSource());
        //调用端操作人
        operateRequest.setOperator(request.getOperator());
        //请求扩展字段
        operateRequest.setReqExtra(request.getReqExtra());
        //卡信息
        CardInfo cardInfo = new CardInfo();
        //VCC发行卡片处唯一参考号
        cardInfo.setCardLogId(request.getCardLogId());
        //充值金额
        cardInfo.setWillChangeAmt(request.getWillChangeAmt());
        operateRequest.setCardInfo(cardInfo);
        return operateRequest;
    }

    /**
     * operate接口返回数据 ：充值卡操作
     */
    public static RechargeResponse convert2RechargeResponse(OperateResponse operateResponse){
        RechargeResponse rechargeResponse = new RechargeResponse();
        //结果状态
        rechargeResponse.setResultStatus(operateResponse.getResultstatus());
        //结果码
        rechargeResponse.setResultRespCode(operateResponse.getResultRespCode());
        //结果码描述
        rechargeResponse.setResultRespMsg(operateResponse.getResultRespMsg());
        //结果码详细描述
        rechargeResponse.setResultRespDetailMsg(operateResponse.getResultRespDetailMsg());
        //发卡通道类型
        rechargeResponse.setChannelType(operateResponse.getChannelType());
        //VCC生成的唯一流水号
        rechargeResponse.setCcOpId(operateResponse.getCcOpId());
        //原请求流水号
        rechargeResponse.setRequestId(operateResponse.getRequestId());
        //原请求时间
        rechargeResponse.setRequestTime(operateResponse.getRequestTime());
        //原请求商户名
        rechargeResponse.setMerchantName(operateResponse.getMerchantName());
        //响应扩展数据
        rechargeResponse.setRespExtra(operateResponse.getRespExtra());
        if(null != operateResponse.getCardInfo()){
            CardInfo cardInfo = operateResponse.getCardInfo();
            //VCC发行卡片处唯一参考号
            rechargeResponse.setCardLogId(cardInfo.getCardLogId());
        }
        return rechargeResponse;
    }

    /**
     * operate接口返回数据 ：提现卡操作
     */
    public static WithdrawResponse convert2WithdrawResponse(OperateResponse operateResponse){
        WithdrawResponse withdrawResponse = new WithdrawResponse();
        //结果状态
        withdrawResponse.setResultStatus(operateResponse.getResultstatus());
        //结果码
        withdrawResponse.setResultRespCode(operateResponse.getResultRespCode());
        //结果码描述
        withdrawResponse.setResultRespMsg(operateResponse.getResultRespMsg());
        //结果码详细描述
        withdrawResponse.setResultRespDetailMsg(operateResponse.getResultRespDetailMsg());
        //发卡通道类型
        withdrawResponse.setChannelType(operateResponse.getChannelType());
        //VCC生成的唯一流水号
        withdrawResponse.setCcOpId(operateResponse.getCcOpId());
        //原请求流水号
        withdrawResponse.setRequestId(operateResponse.getRequestId());
        //原请求时间
        withdrawResponse.setRequestTime(operateResponse.getRequestTime());
        //原请求商户名
        withdrawResponse.setMerchantName(operateResponse.getMerchantName());
        //响应扩展数据
        withdrawResponse.setRespExtra(operateResponse.getRespExtra());
        if(null != operateResponse.getCardInfo()){
            CardInfo cardInfo = operateResponse.getCardInfo();
            //VCC发行卡片处唯一参考号
            withdrawResponse.setCardLogId(cardInfo.getCardLogId());
        }
        return withdrawResponse;
    }


}
