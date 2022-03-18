package com.ctrip.ccard.creditcard.vcc.biz;

import com.ctrip.ccard.creditcard.vcc.bean.*;
import com.ctrip.ccard.creditcard.vcc.util.*;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description: vcc api接口签名方法
 */
public class TripLinkBizImpl implements TripLinkBiz {

    private final Logger logger = LoggerFactory.getLogger(TripLinkBizImpl.class);

    //vcc 卡操作接口 restful地址
    private static final String OPERATE_METHOD = "/operate";
    //vcc 卡操作结果查询接口 restful地址
    private static final String OPERATE_RESULT_METHOD = "/qOperateResult";
    //vcc 卡信息查询接口 restful地址
    private static final String QINFO_METHOD = "/qInfo";
    //vcc 交易查询接口 restful地址
    private static final String TRANS_METHOD = "/qTransInfo";

    /**
     * 户自己生成的RSA密钥，用于生成请求签名
     */
    private String privateKey;
    /**
     * 卡信息加解密使用，由VCC分配，商户保存
     */
    private String desKey;
    /**
     * 接口请求地址
     */
    private String url;
    /**
     * vcc请求客户端
     */
    private HttpClient httpClient;

    public TripLinkBizImpl(String privateKey, String desKey, String url, HttpClient httpClient) {
        this.privateKey = privateKey;
        this.desKey = desKey;
        this.url = url;
        this.httpClient = httpClient;
    }

    public OperateResponse operate(OperateRequest request) {
        //数据校验
        operateRequestVerify(request);
        //数据签名
        request.setSign(buildSign(request,privateKey));
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(request);
        logger.info("call tripLink operate requestJson is："+requestJson);
        String responseStr = httpClient.post(requestJson,url+OPERATE_METHOD);
        logger.info("call tripLink operate responseStr is："+responseStr);
        OperateResponse response = JacksonUtil.str2Object(responseStr,OperateResponse.class);
        //卡信息解密
        decryptCardInfo(response.getCardInfo(),desKey);
        return response;
    }

    public QOperateResultResponse qOperateResult(QOperateResultRequest request) {
        //数据校验
        qOperateResultVerify(request);
        //数据签名
        request.setSign(buildSign(request,privateKey));
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(request);
        logger.info("call tripLink qOperateResult requestJson is："+requestJson);
        String responseStr = httpClient.post(requestJson,url+OPERATE_RESULT_METHOD);
        logger.info("call tripLink qOperateResult responseStr is："+responseStr);
        QOperateResultResponse response = JacksonUtil.str2Object(responseStr,QOperateResultResponse.class);
        //卡信息解密
        decryptCardInfo(response.getCardInfo(),desKey);
        return response;
    }

    public QInfoResponse qInfo(QInfoRequest request) {
        //数据校验
        qInfoVerify(request);
        //数据签名
        request.setSign(buildSign(request,privateKey));
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(request);
        logger.info("call tripLink qInfo requestJson is："+requestJson);
        String responseStr = httpClient.post(requestJson,url+QINFO_METHOD);
        logger.info("call tripLink qInfo responseStr is："+responseStr);
        QInfoResponse response = JacksonUtil.str2Object(responseStr,QInfoResponse.class);
        //卡信息解密
        decryptCardInfo(response.getCardInfo(),desKey);
        return response;
    }

    public QTransInfoResponse qTransInfo(QTransInfoRequest request) {
        //数据校验
        qTransInfoVerify(request);
        //数据签名
        request.setSign(buildSign(request,privateKey));
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(request);
        logger.info("call tripLink qTransInfo requestJson is："+requestJson);
        String responseStr = httpClient.post(requestJson,url+TRANS_METHOD);
        logger.info("call tripLink qTransInfo responseStr is："+responseStr);
        return JacksonUtil.str2Object(responseStr,QTransInfoResponse.class);
    }

    /**
     * 卡操作接口 创建/更新/关闭 必填字段强校验
     * @param request 请求流水号/时间/类型/商户名称 不允许为空
     */
    private static void operateRequestVerify(OperateRequest request){
        verify(StringUtils.isBlank(request.getRequestId()),"requestId is null");
        verify(StringUtils.isBlank(request.getRequestTime()),"requestTime is null");
        verify(StringUtils.isBlank(request.getRequestType()),"requestType is null");
        verify(StringUtils.isBlank(request.getSubRequestType()),"subRequestType is null");
        verify(StringUtils.isBlank(request.getMerchantName()),"merchantName is null");
        verify(null == request.getCardInfo(),"cardInfo is null");
    }

    /**
     * 卡操作结果查询接口 必填字段强校验
     * @param request 请求流水号/时间/类型/商户名称 不允许为空
     */
    private static void qOperateResultVerify(QOperateResultRequest request){
        verify(StringUtils.isBlank(request.getRequestId()),"requestId is null");
        verify(StringUtils.isBlank(request.getRequestTime()),"requestTime is null");
        verify(StringUtils.isBlank(request.getRequestType()),"requestType is null");
        verify(StringUtils.isBlank(request.getSubRequestType()),"subRequestType is null");
        verify(StringUtils.isBlank(request.getMerchantName()),"merchantName is null");
    }

    /**
     * 卡交易信息查询接口 必填字段强校验
     * @param request 请求流水号/时间/类型/商户名称 不允许为空
     */
    private static void qInfoVerify(QInfoRequest request){
        verify(StringUtils.isBlank(request.getRequestId()),"requestId is null");
        verify(StringUtils.isBlank(request.getRequestTime()),"requestTime is null");
        verify(StringUtils.isBlank(request.getRequestType()),"requestType is null");
        verify(StringUtils.isBlank(request.getSubRequestType()),"subRequestType is null");
        verify(StringUtils.isBlank(request.getMerchantName()),"merchantName is null");
        if("CARD_EXTERNAL".equals(request.getSubRequestType())){
            verify(null == request.getCardInfo(),"cardInfo is null");
        }
    }

    /**
     * 卡信息商户信息查询接口 必填字段强校验
     * @param request 请求流水号/时间/类型/商户名称 不允许为空
     */
    private static void qTransInfoVerify(QTransInfoRequest request){
        verify(StringUtils.isBlank(request.getRequestId()),"requestId is null");
        verify(StringUtils.isBlank(request.getRequestTime()),"requestTime is null");
        verify(StringUtils.isBlank(request.getRequestType()),"requestType is null");
        verify(StringUtils.isBlank(request.getSubRequestType()),"subRequestType is null");
        verify(StringUtils.isBlank(request.getMerchantName()),"merchantName is null");
        verify(null == request.getCardInfo(),"cardInfo is null");
    }

    private static void verify(boolean result , String errorMsg){
        if(result){
            throw  new IllegalArgumentException("parameter error: " + errorMsg);
        }
    }



    /**
     * 根据请求类型 生成对应的签名数据
     * @param request
     * @param privateKey
     * @return
     * @throws Exception
     */
    public static String buildSign(Object request,String privateKey){
        //需要参与签名的数据
        String buildSignData = null;
        if(request instanceof OperateRequest){
            buildSignData = buildOperateSignData((OperateRequest) request);
        }
        if(request instanceof QOperateResultRequest){
            buildSignData = buildQOperateResultSignData((QOperateResultRequest) request);
        }
        if(request instanceof QInfoRequest){
            buildSignData = buildQInfoSignData((QInfoRequest) request);
        }
        if(request instanceof QTransInfoRequest){
            buildSignData = buildQTransInfoSignData((QTransInfoRequest) request);
        }
        //签名数据
        return RsaUtil.buildSign(buildSignData,privateKey);
    }

    /**
     * 卡信息DES解密
     * @param cardInfo vcc接口返回的卡信息
     * @param desKey  vcc分配的DES加解密的Key
     * @throws Exception
     */
    public static void decryptCardInfo(CardInfo cardInfo, String desKey){
        if(null != cardInfo){
            //卡号DES解密
            if(StringUtils.isNotBlank(cardInfo.getCardNo())){
                cardInfo.setCardNo(DesUtil.decryptData(cardInfo.getCardNo(),desKey));
            }
            //卡安全验证码DES解密
            if(StringUtils.isNotBlank(cardInfo.getCardVerifyNo())){
                cardInfo.setCardVerifyNo(DesUtil.decryptData(cardInfo.getCardVerifyNo(),desKey));
            }
            //卡有效期DES解密
            if(StringUtils.isNotBlank(cardInfo.getCardExpiryDate())){
                cardInfo.setCardExpiryDate(DesUtil.decryptData(cardInfo.getCardExpiryDate(),desKey));
            }
        }
    }

    /**
     * 构建Operate参与签名的字段
     * 其中字段数据为空就不参与签名
     */
    private static String buildOperateSignData(OperateRequest request) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(request.getRequestId()).append(request.getRequestTime())
                .append(request.getRequestType()).append(request.getSubRequestType())
                .append(request.getMerchantName());
        if (StringUtils.isNotBlank(request.getChannelType())) {
            stringBuffer.append(request.getChannelType());
        }
        if (null != request.getCardInfo()) {
            if (StringUtils.isNotBlank(request.getCardInfo().getCardLogId())) {
                stringBuffer.append(request.getCardInfo().getCardLogId());
            }
            if (StringUtils.isNotBlank(request.getCardInfo().getCardNo())) {
                stringBuffer.append(request.getCardInfo().getCardNo());
            }
            if (StringUtils.isNotBlank(request.getCardInfo().getLocalCurrency())) {
                stringBuffer.append(request.getCardInfo().getLocalCurrency());
            }
            if (StringUtils.isNotBlank(request.getCardInfo().getBillCurrency())) {
                stringBuffer.append(request.getCardInfo().getBillCurrency());
            }
            if (StringUtils.isNotBlank(request.getCardInfo().getStartActiveDate())) {
                stringBuffer.append(request.getCardInfo().getStartActiveDate());
            }
            if (StringUtils.isNotBlank(request.getCardInfo().getEndCloseDate())) {
                stringBuffer.append(request.getCardInfo().getEndCloseDate());
            }
            if (null != request.getCardInfo().getCreditLimitAmt()) {
                stringBuffer.append(String.valueOf(request.getCardInfo().getCreditLimitAmt()));
            }
            if (null != request.getCardInfo().getMinAuthAmt()) {
                stringBuffer.append(String.valueOf(request.getCardInfo().getMinAuthAmt()));
            }
            if (null != request.getCardInfo().getMaxAuthAmt()) {
                stringBuffer.append(String.valueOf(request.getCardInfo().getMaxAuthAmt()));
            }
        }
        return stringBuffer.toString();
    }

    /**
     * 构建QInfo参与签名的字段
     * 其中字段数据为空就不参与签名
     */
    public static String buildQInfoSignData(QInfoRequest request) {
        StringBuffer sb = new StringBuffer();
        sb.append(request.getRequestId()).append(request.getRequestTime())
                .append(request.getRequestType()).append(request.getSubRequestType())
                .append(request.getMerchantName());
        if(StringUtils.isNotBlank(request.getChannelType())){
            sb.append(request.getChannelType());
        }
        if(null!=request.getCardInfo()){
            if(StringUtils.isNotBlank(request.getCardInfo().getCardLogId())){
                sb.append(request.getCardInfo().getCardLogId());
            }
            if(StringUtils.isNotBlank(request.getCardInfo().getCardNo())){
                sb.append(request.getCardInfo().getCardNo());
            }
        }
        return sb.toString();
    }

    /**
     * 构建QTransInfo参与签名的字段
     * 其中字段数据为空就不参与签名
     */
    public static String buildQTransInfoSignData(QTransInfoRequest request){
        StringBuffer sb = new StringBuffer();
        sb.append(request.getRequestId()).append(request.getRequestTime())
                .append(request.getRequestType()).append(request.getSubRequestType())
                .append(request.getMerchantName());
        if(StringUtils.isNotBlank(request.getChannelType())){
            sb.append(request.getChannelType());
        }
        if(null!=request.getCardInfo()){
            if(StringUtils.isNotBlank(request.getCardInfo().getCardLogId())){
                sb.append(request.getCardInfo().getCardLogId());
            }
            if(StringUtils.isNotBlank(request.getCardInfo().getCardNo())){
                sb.append(request.getCardInfo().getCardNo());
            }
        }
        return sb.toString();
    }

    /**
     * 构建QOperateResult参与签名的字段
     * 其中字段数据为空就不参与签名
     */
    public static String buildQOperateResultSignData(QOperateResultRequest request) {
        StringBuffer sb = new StringBuffer();
        sb.append(request.getRequestId());
        if (StringUtils.isNotBlank(request.getRequestTime()))
            sb.append(request.getRequestTime());
        if (StringUtils.isNotBlank(request.getRequestType()))
            sb.append(request.getRequestType());
        if (StringUtils.isNotBlank(request.getSubRequestType()))
            sb.append(request.getSubRequestType());
        sb.append(request.getMerchantName());
        return sb.toString();
    }
}
