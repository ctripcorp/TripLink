package com.ctrip.ccard.creditcard.vcc.biz.V2;

import com.ctrip.ccard.creditcard.vcc.bean.CallHttpResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardCancelRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardCancelResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardCreateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardCreateResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardDetailQueryRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardDetailQueryResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardInfoNotifyRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardInfoNotifyResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardRechargeRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardRechargeResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardRestoreRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardRestoreResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardSuspendRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardSuspendResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardUnsuspendRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardUnsuspendResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardUpdateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardUpdateResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardWithdrawRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardWithdrawResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.ChargebackQueryRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.ChargebackQueryResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.ChargebackRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.ChargebackResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.FxCreateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.FxCreateResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.FxQueryRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.FxQueryResponse;
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
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuerySettlementTransactionByPageRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuerySettlementTransactionByPageResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuerySettlementTransactionRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuerySettlementTransactionResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuoteRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuoteResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.TripLinkApiRequest;
import com.ctrip.ccard.creditcard.vcc.exception.BusinessException;
import com.ctrip.ccard.creditcard.vcc.util.CipherUtils;
import com.ctrip.ccard.creditcard.vcc.util.HttpClient;
import com.ctrip.ccard.creditcard.vcc.util.JacksonUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TripLinkBizImplV2 implements TripLinkBizV2 {

    private static final Logger LOGGER = LoggerFactory.getLogger(TripLinkBizImplV2.class);

    private static final String CREATE_CARD = "createCard";

    private static final String UPDATE_CARD = "updateCard";

    private static final String RECHARGE_CARD = "rechargeCard";

    private static final String WITHDRAW_CARD = "withdrawCard";

    private static final String RESTORE_CARD = "restoreCard";

    private static final String SUSPEND_CARD = "suspendCard";

    private static final String UNSUSPEND_CARD = "unSuspendCard";

    private static final String CLOSE_CARD = "closeCard";

    private static final String QUERY_CARD = "queryCardDetail";

    private static final String QUERY_CREDIT = "queryCustomerCredit";

    private static final String QUERY_AUTH_INFO = "queryAuthTransaction";

    private static final String QUERY_SETTLEMENT_INFO = "querySettlementTransaction";

    private static final String FX_QUOTE = "fxQuote";

    private static final String PAYOUT_CREATE = "payoutCreate";

    private static final String PAYOUT_QUERY = "payoutQuery";

    private static final String FX_CREATE = "fxCreate";

    private static final String FX_QUERY = "fxQuery";

    private static final String AUTH_TRANSACTION_QUERY = "authTransactionQuery";

    private static final String SETTLE_TRANSACTION_QUERY = "settlementTransactionQuery";

    private static final String CHARGEBACK = "chargeback";

    private static final String CHARGEBACK_QUERY = "chargebackQuery";

    private static final String NOTIFY_CARD_INFO = "notifyCardInfo";

    private static final String API_SUCCESS_CODE = "200";

    private static final String DEFAULT_VERSION = "2.0";
    /**
     * 客户自己生成的RSA密钥，用于生成请求签名
     */
    private final String customerRsaPrivateKey;
    /**
     * triplink 提供的RSA公钥，用户验签使用。
     */
    private final String triplinkRsaPublicKey;
    /**
     * AES加解密KEY，由VCC分配，商户保存
     */
    private final String aesKey;
    /**
     * 接口请求地址
     */
    private final String url;
    /**
     * vcc请求客户端
     */
    private final HttpClient<CallHttpResponse> httpClient;

    public TripLinkBizImplV2(String customerRsaPrivateKey, String triplinkRsaPublicKey, String aesKey, String url, HttpClient<CallHttpResponse> httpClient) {
        this.customerRsaPrivateKey = customerRsaPrivateKey;
        this.triplinkRsaPublicKey = triplinkRsaPublicKey;
        this.aesKey = aesKey;
        this.url = url;
        this.httpClient = httpClient;
    }

    public CardCreateResponse create(CardCreateRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        //加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        //当前时间戳
        long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), CREATE_CARD, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        //接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), CREATE_CARD, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 create requestJson is:" + requestJson);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 create responseStr is:" + response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, CardCreateResponse.class);
    }

    public CardUpdateResponse update(CardUpdateRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        //加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        //当前时间戳
        long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), UPDATE_CARD, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        //接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), UPDATE_CARD, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 update requestJson is:" + requestJson);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 update responseStr is:" + response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, CardUpdateResponse.class);
    }

    @Override
    public CardRechargeResponse recharge(CardRechargeRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        //加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        //当前时间戳
        long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), RECHARGE_CARD, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        //接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), RECHARGE_CARD, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 recharge requestJson is:" + requestJson);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 recharge responseStr is:" + response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, CardRechargeResponse.class);
    }

    @Override
    public CardWithdrawResponse withdraw(CardWithdrawRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        //加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        //当前时间戳
        long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), WITHDRAW_CARD, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        //接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), WITHDRAW_CARD, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 withdraw requestJson is:" + requestJson);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 withdraw responseStr is:" + response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, CardWithdrawResponse.class);
    }

    @Override
    public CardRestoreResponse restore(CardRestoreRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        //加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        //当前时间戳
        long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), RESTORE_CARD, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        //接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), RESTORE_CARD, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 restore requestJson is:" + requestJson);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 restore responseStr is:" + response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, CardRestoreResponse.class);
    }

    public CardCancelResponse close(CardCancelRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        //加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        //当前时间戳
        long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), CLOSE_CARD, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        //接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), CLOSE_CARD, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 close requestJson is:" + requestJson);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 close responseStr is:" + response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, CardCancelResponse.class);
    }

    public CardDetailQueryResponse queryCard(CardDetailQueryRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        //加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        //当前时间戳
        long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), QUERY_CARD, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        //接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), QUERY_CARD, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 queryCard requestJson is:" + encryptData);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 queryCard responseStr is:" + response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, CardDetailQueryResponse.class);
    }

    @Override
    public QueryCustomerCreditAmountResponse queryCustomerCreditAmount(QueryCustomerCreditAmountRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        //加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        //当前时间戳
        long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), QUERY_CREDIT, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        //接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), QUERY_CREDIT, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 queryCustomerCreditAmount requestJson is:" + encryptData);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 queryCustomerCreditAmount responseStr is:" + response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, QueryCustomerCreditAmountResponse.class);
    }

    @Override
    public QueryAuthTransactionResponse queryAuthTransaction(QueryAuthTransactionRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        //加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        //当前时间戳
        long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), QUERY_AUTH_INFO, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        //接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), QUERY_AUTH_INFO, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 queryAuthTransaction requestJson is:" + encryptData);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 queryAuthTransaction responseStr is:" + response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, QueryAuthTransactionResponse.class);
    }

    @Override
    public QuerySettlementTransactionResponse querySettlementTransaction(QuerySettlementTransactionRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        //加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        //当前时间戳
        long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), QUERY_SETTLEMENT_INFO, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        //接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), QUERY_SETTLEMENT_INFO, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 querySettlementTransaction requestJson is:" + encryptData);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 querySettlementTransaction responseStr is:" + response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, QuerySettlementTransactionResponse.class);
    }

    @Override
    public CardSuspendResponse suspend(CardSuspendRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        //加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        //当前时间戳
        long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), SUSPEND_CARD, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        //接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), SUSPEND_CARD, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 suspend requestJson is:" + requestJson);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 suspend responseStr is:" + response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, CardSuspendResponse.class);
    }

    @Override
    public CardUnsuspendResponse unsuspend(CardUnsuspendRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        //加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        //当前时间戳
        long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), UNSUSPEND_CARD, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        //接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), UNSUSPEND_CARD, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 unsuspend requestJson is:" + requestJson);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 unsuspend responseStr is:" + response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, CardUnsuspendResponse.class);
    }

    /**
     * 验签的规则:customerId|service|version|requestNo|timestamp|payload 其中值为空不参与签名
     */
    private String buildRequestSignContent(String customerId, String service, String version, String requestNo, long timestamp, String payload) {
        StringBuilder builder = new StringBuilder();
        if (StringUtils.isNotBlank(customerId)) {
            builder.append(customerId).append("|");
        }
        if (StringUtils.isNotBlank(service)) {
            builder.append(service).append("|");
        }
        if (StringUtils.isNotBlank(version)) {
            builder.append(version).append("|");
        }
        if (StringUtils.isNotBlank(requestNo)) {
            builder.append(requestNo).append("|");
        }
        if (0 != timestamp) {
            builder.append(timestamp).append("|");
        }
        if (StringUtils.isNotBlank(payload)) {
            builder.append(payload);
        }
        return builder.toString();
    }

    /**
     * 签名规则:customerId|service|version|requestNo|timestamp|code|message|payload 其中值为空不参与签名
     */
    private String buildResponseSignContent(Map<String, String> header, String result) {
        StringBuilder builder = new StringBuilder();
        String customerId = header.get("customerId");
        if (StringUtils.isBlank(customerId)) {
            customerId = header.get("customerid");
        }
        if (StringUtils.isNotBlank(customerId)) {
            builder.append(customerId).append("|");
        }
        String service = header.get("service");
        if (StringUtils.isNotBlank(service)) {
            builder.append(service).append("|");
        }
        String version = header.get("version");
        if (StringUtils.isNotBlank(version)) {
            builder.append(version).append("|");
        }
        String requestId = header.get("requestId");
        if (StringUtils.isBlank(requestId)) {
            requestId = header.get("requestid");
        }
        if (StringUtils.isNotBlank(requestId)) {
            builder.append(requestId).append("|");
        }
        String timestamp = header.get("timestamp");
        if (StringUtils.isNotBlank(timestamp)) {
            builder.append(timestamp).append("|");
        }
        String code = header.get("code");
        if (StringUtils.isNotBlank(code)) {
            builder.append(code).append("|");
        }
        String message = header.get("message");
        if (StringUtils.isNotBlank(message)) {
            builder.append(message).append("|");
        }
        if (StringUtils.isNotBlank(result)) {
            builder.append(result);
        }
        return builder.toString();
    }

    private Map<String, String> buildHeader(String customerId, String service, String version, Long timestamp, String requestId, String sign) {
        Map<String, String> header = new HashMap<String, String>();
        header.put("customerId", customerId);
        header.put("version", version);
        header.put("service", service);
        header.put("requestId", requestId);
        header.put("timestamp", String.valueOf(timestamp));
        header.put("sign", sign);
        return header;
    }

    @Override
    public QuoteResponse quote(QuoteRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        //加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        //当前时间戳
        long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), FX_QUOTE, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        //接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), FX_QUOTE, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 quote requestJson is:" + encryptData);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 quote responseStr is:" + response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, QuoteResponse.class);
    }

    @Override
    public QueryAuthTransactionByPageResponse authTransactionQueryByPage(QueryAuthTransactionByPageRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        //加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        //当前时间戳
        long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), AUTH_TRANSACTION_QUERY, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        //接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), AUTH_TRANSACTION_QUERY, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 authTransactionQueryByPage requestJson is:" + encryptData);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 authTransactionQueryByPage responseStr is:" + response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, QueryAuthTransactionByPageResponse.class);
    }

    @Override
    public PayoutCreateResponse payoutCreate(PayoutCreateRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        //加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        //当前时间戳
        long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), PAYOUT_CREATE, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        //接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), PAYOUT_CREATE, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 payoutCreate requestJson is:" + encryptData);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 payoutCreate responseStr is:" + response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, PayoutCreateResponse.class);
    }

    @Override
    public PayoutQueryResponse payoutQuery(PayoutQueryRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        //加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        //当前时间戳
        long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), PAYOUT_QUERY, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        //接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), PAYOUT_QUERY, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 payoutQuery requestJson is:" + encryptData);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 payoutQuery responseStr is:" + response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, PayoutQueryResponse.class);
    }

    @Override
    public QuerySettlementTransactionByPageResponse settlementTransactionQueryByPage(QuerySettlementTransactionByPageRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        //加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        //当前时间戳
        long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), SETTLE_TRANSACTION_QUERY, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        //接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), SETTLE_TRANSACTION_QUERY, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 settlementTransactionQueryByPage requestJson is:" + encryptData);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 settlementTransactionQueryByPage responseStr is:" + response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, QuerySettlementTransactionByPageResponse.class);
    }

    @Override
    public FxCreateResponse fxCreate(FxCreateRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        //加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        //当前时间戳
        long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), FX_CREATE, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        //接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), FX_CREATE, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 fxCreate requestJson is:" + encryptData);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 fxCreate responseStr is:" + response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, FxCreateResponse.class);

    }

    @Override
    public FxQueryResponse fxQuery(FxQueryRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        //加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        //当前时间戳
        long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), FX_QUERY, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        //接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), FX_QUERY, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 fxQuery requestJson is:" + encryptData);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 fxQuery responseStr is:" + response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, FxQueryResponse.class);
    }

    @Override
    public ChargebackResponse chargeback(ChargebackRequest request) {
        // 添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        // 加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        // 当前时间戳
        long timestamp = new Date().getTime();
        // 签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), CHARGEBACK, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        // 生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        // 接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), CHARGEBACK, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        // API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 chargeback requestJson is:" + encryptData);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 chargeback responseStr is:" + response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, ChargebackResponse.class);
    }

    @Override
    public ChargebackQueryResponse chargebackQuery(ChargebackQueryRequest request) {
        // 添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        // 加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        // 当前时间戳
        long timestamp = new Date().getTime();
        // 签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), CHARGEBACK_QUERY, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        // 生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        // 接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), CHARGEBACK_QUERY, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        // API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 chargebackQuery requestJson is:" + encryptData);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 chargebackQuery responseStr is:" + response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, ChargebackQueryResponse.class);
    }

    @Override
    public CardInfoNotifyResponse notifyCardInfo(CardInfoNotifyRequest request) {
        // 添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion()) ? DEFAULT_VERSION : request.getServiceVersion());
        // 加密数据
        String encryptData = CipherUtils.aesEncrypt(this.aesKey, JacksonUtil.object2JsonString(request));
        // 当前时间戳
        long timestamp = new Date().getTime();
        // 签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(), NOTIFY_CARD_INFO, request.getServiceVersion(), request.getRequestId(), timestamp, encryptData);
        // 生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey, signContent);
        // 接口请求头
        Map<String, String> header = buildHeader(request.getCustomerId(), NOTIFY_CARD_INFO, request.getServiceVersion(), timestamp, request.getRequestId(), sign);
        // API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryptData);
        // 接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        LOGGER.info("call tripLinkV2 notifyCardInfo requestJson is:" + encryptData);
        CallHttpResponse response = httpClient.post(requestJson, url, header);
        LOGGER.info("call tripLinkV2 notifyCardInfo responseStr is:" + response);
        System.out.println(response);
        // http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        // code判断
        if (!API_SUCCESS_CODE.equals(responseHeaders.get("code"))) {
            throw new BusinessException(responseHeaders.get("message"));
        }
        // http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result, TripLinkApiRequest.class);
        // 生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders, apiResponse.getPayload());
        // 验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey, responseSignContent, responseHeaders.get("sign"));
        if (!signResult) {
            throw new BusinessException("verify response sign failed");
        }
        // 解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey, apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, CardInfoNotifyResponse.class);
    }
}
