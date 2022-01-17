package com.ctrip.ccard.creditcard.vcc.biz.V2;

import com.ctrip.ccard.creditcard.vcc.bean.CallHttpResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.*;
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
import java.util.UUID;

/**
 * Description:
 */
public class TripLinkBizImplV2 implements TripLinkBizV2 {

    private final Logger logger = LoggerFactory.getLogger(TripLinkBizImplV2.class);

    private static final String CREATE_CARD = "createCard";

    private static final String UPDATE_CARD = "updateCard";

    private static final String CLOSE_CARD = "closeCard";

    private static final String QUERY_CARD = "queryCardDetail";

    private static final String QUERY_CREDIT = "queryCustomerCredit";

    private static final String QUERY_AUTH_INFO = "queryAuthTranscation";

    private static final String QUERY_SETTLEMENT_INFO = "querySettlementTranscation";

    private static final String API_SUCCESS_CODE = "200";

    private static final String DEFAULT_VERSION = "2.0";
    /**
     * 客户自己生成的RSA密钥，用于生成请求签名
     */
    private String customerRsaPrivateKey;
    /**
     * triplink 提供的RSA公钥，用户验签使用。
     */
    private String triplinkRsaPublicKey;
    /**
     * AES加解密KEY，由VCC分配，商户保存
     */
    private String aesKey;
    /**
     * 接口请求地址
     */
    private String url;
    /**
     * vcc请求客户端
     */
    private HttpClient httpClient;

    public TripLinkBizImplV2(String customerRsaPrivateKey,String triplinkRsaPublicKey,
                             String aesKey, String url,HttpClient httpClient) {
        this.customerRsaPrivateKey = customerRsaPrivateKey;
        this.triplinkRsaPublicKey = triplinkRsaPublicKey;
        this.aesKey = aesKey;
        this.url = url;
        this.httpClient = httpClient;
    }

    public CardCreateResponse create(CardCreateRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion())?DEFAULT_VERSION:request.getServiceVersion());
        //加密数据
        String encryprData = CipherUtils.aesEncrypt(this.aesKey,JacksonUtil.object2JsonString(request));
        //当前时间戳
        Long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(),CREATE_CARD,request.getServiceVersion(),
                request.getRequestId(),timestamp,encryprData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey,signContent);
        //接口请求头
        Map<String,String> header = getHeader(request.getCustomerId(),CREATE_CARD,request.getServiceVersion(),
                timestamp,request.getRequestId(),sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryprData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        logger.info("call tripLinkV2 createCard requestJson is："+requestJson);
        CallHttpResponse response = httpClient.post(requestJson,url,header);
        logger.info("call tripLinkV2 createCard responseStr is："+response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if(!API_SUCCESS_CODE.equals(responseHeaders.get("code"))){
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result,TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders,apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey,responseSignContent,responseHeaders.get("sign"));
        if(!signResult){
            throw new BusinessException("create card verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey,apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, CardCreateResponse.class);
    }

    public CardUpdateResponse update(CardUpdateRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion())?DEFAULT_VERSION:request.getServiceVersion());
        //加密数据
        String encryprData = CipherUtils.aesEncrypt(this.aesKey,JacksonUtil.object2JsonString(request));
        //当前时间戳
        Long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(),UPDATE_CARD,
                request.getServiceVersion(),request.getRequestId(),timestamp,encryprData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey,signContent);
        //接口请求头
        Map<String,String> header = getHeader(request.getCustomerId(),UPDATE_CARD,request.getServiceVersion(),
                timestamp,request.getRequestId(),sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryprData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        logger.info("call tripLinkV2 updateCard requestJson is："+requestJson);
        CallHttpResponse response = httpClient.post(requestJson,url,header);
        logger.info("call tripLinkV2 updateCard responseStr is："+response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if(!API_SUCCESS_CODE.equals(responseHeaders.get("code"))){
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result,TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders,apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey,responseSignContent,responseHeaders.get("sign"));
        if(!signResult){
            throw new BusinessException("update card verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey,apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, CardUpdateResponse.class);
    }

    public CardCancelResponse close(CardCancelRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion())?DEFAULT_VERSION:request.getServiceVersion());
        //加密数据
        String encryprData = CipherUtils.aesEncrypt(this.aesKey,JacksonUtil.object2JsonString(request));
        //当前时间戳
        Long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(),CLOSE_CARD,
                request.getServiceVersion(),request.getRequestId(),timestamp,encryprData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey,signContent);
        //接口请求头
        Map<String,String> header =  getHeader(request.getCustomerId(),CLOSE_CARD,request.getServiceVersion(),
                timestamp,request.getRequestId(),sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryprData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        logger.info("call tripLinkV2 closeCard requestJson is："+requestJson);
        CallHttpResponse response = httpClient.post(requestJson,url,header);
        logger.info("call tripLinkV2 closeCard responseStr is："+response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if(!API_SUCCESS_CODE.equals(responseHeaders.get("code"))){
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result,TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders,apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey,responseSignContent,responseHeaders.get("sign"));
        if(!signResult){
            throw new BusinessException("close card verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey,apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, CardCancelResponse.class);
    }

    public CardDetailQueryResponse queryCard(CardDetailQueryRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion())?DEFAULT_VERSION:request.getServiceVersion());
        //加密数据
        String encryprData = CipherUtils.aesEncrypt(this.aesKey,JacksonUtil.object2JsonString(request));
        //当前时间戳
        Long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(),QUERY_CARD,
                request.getServiceVersion(),request.getRequestId(),timestamp,encryprData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey,signContent);
        //接口请求头
        Map<String,String> header =  getHeader(request.getCustomerId(),QUERY_CARD,request.getServiceVersion(),
                timestamp,request.getRequestId(),sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryprData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        logger.info("call tripLinkV2 queryCard requestJson is："+encryprData);
        CallHttpResponse response = httpClient.post(requestJson,url,header);
        logger.info("call tripLinkV2 queryCard responseStr is："+response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if(!API_SUCCESS_CODE.equals(responseHeaders.get("code"))){
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result,TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders,apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey,responseSignContent,responseHeaders.get("sign"));
        if(!signResult){
            throw new BusinessException("query card verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey,apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, CardDetailQueryResponse.class);
    }

    @Override
    public QueryCustomerCreditAmountResponse queryCustomerCreditAmount(QueryCustomerCreditAmountRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion())?DEFAULT_VERSION:request.getServiceVersion());
        //加密数据
        String encryprData = CipherUtils.aesEncrypt(this.aesKey,JacksonUtil.object2JsonString(request));
        //当前时间戳
        Long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(),QUERY_CREDIT,
                request.getServiceVersion(),request.getRequestId(),timestamp,encryprData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey,signContent);
        //接口请求头
        Map<String,String> header =  getHeader(request.getCustomerId(),QUERY_CREDIT,request.getServiceVersion(),
                timestamp,request.getRequestId(),sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryprData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        logger.info("call tripLinkV2 queryCustomerCreditAmount requestJson is："+encryprData);
        CallHttpResponse response = httpClient.post(requestJson,url,header);
        logger.info("call tripLinkV2 queryCustomerCreditAmount responseStr is："+response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if(!API_SUCCESS_CODE.equals(responseHeaders.get("code"))){
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result,TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders,apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey,responseSignContent,responseHeaders.get("sign"));
        if(!signResult){
            throw new BusinessException("query customer credit amount verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey,apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, QueryCustomerCreditAmountResponse.class);
    }

    @Override
    public QueryAuthTranscationResponse queryAuthTranscation(QueryAuthTranscationReuqest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion())?DEFAULT_VERSION:request.getServiceVersion());
        //加密数据
        String encryprData = CipherUtils.aesEncrypt(this.aesKey,JacksonUtil.object2JsonString(request));
        //当前时间戳
        Long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(),QUERY_AUTH_INFO,
                request.getServiceVersion(),request.getRequestId(),timestamp,encryprData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey,signContent);
        //接口请求头
        Map<String,String> header =  getHeader(request.getCustomerId(),QUERY_AUTH_INFO,request.getServiceVersion(),
                timestamp,request.getRequestId(),sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryprData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        logger.info("call tripLinkV2 queryAuthTranscation requestJson is："+encryprData);
        CallHttpResponse response = httpClient.post(requestJson,url,header);
        logger.info("call tripLinkV2 queryAuthTranscation responseStr is："+response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if(!API_SUCCESS_CODE.equals(responseHeaders.get("code"))){
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result,TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders,apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey,responseSignContent,responseHeaders.get("sign"));
        if(!signResult){
            throw new BusinessException("query auth transcation verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey,apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, QueryAuthTranscationResponse.class);
    }

    @Override
    public QuerySettlementTranscationResponse querySettlementTranscation(QuerySettlementTranscationRequest request) {
        //添加默认版本2.0
        request.setServiceVersion(StringUtils.isEmpty(request.getServiceVersion())?DEFAULT_VERSION:request.getServiceVersion());
        //加密数据
        String encryprData = CipherUtils.aesEncrypt(this.aesKey,JacksonUtil.object2JsonString(request));
        //当前时间戳
        Long timestamp = new Date().getTime();
        //签名数据
        String signContent = buildRequestSignContent(request.getCustomerId(),QUERY_SETTLEMENT_INFO,
                request.getServiceVersion(),request.getRequestId(),timestamp,encryprData);
        //生成签名
        String sign = CipherUtils.rsaSign(this.customerRsaPrivateKey,signContent);
        //接口请求头
        Map<String,String> header =  getHeader(request.getCustomerId(),QUERY_SETTLEMENT_INFO,request.getServiceVersion(),
                timestamp,request.getRequestId(),sign);
        //API请求入参
        TripLinkApiRequest apiRequest = new TripLinkApiRequest();
        apiRequest.setPayload(encryprData);
        //接口请求
        String requestJson = JacksonUtil.object2JsonString(apiRequest);
        logger.info("call tripLinkV2 queryCustomerCreditAmount requestJson is："+encryprData);
        CallHttpResponse response = httpClient.post(requestJson,url,header);
        logger.info("call tripLinkV2 queryCustomerCreditAmount responseStr is："+response);
        //http请求返回报文 header
        Map<String, String> responseHeaders = response.getHeader();
        //code判断
        if(!API_SUCCESS_CODE.equals(responseHeaders.get("code"))){
            throw new BusinessException(responseHeaders.get("message"));
        }
        //http请求返回报文 业务数据
        String result = response.getResult();
        TripLinkApiRequest apiResponse = JacksonUtil.str2Object(result,TripLinkApiRequest.class);
        //生成需要验签的签名数据
        String responseSignContent = buildResponseSignContent(responseHeaders,apiResponse.getPayload());
        //验签
        boolean signResult = CipherUtils.rsaVerify(this.triplinkRsaPublicKey,responseSignContent,responseHeaders.get("sign"));
        if(!signResult){
            throw new BusinessException("query customer credit amount verify response sign failed");
        }
        //解密数据
        String payload = CipherUtils.aesDecrypt(this.aesKey,apiResponse.getPayload());
        return JacksonUtil.str2Object(payload, QuerySettlementTranscationResponse.class);
    }

    /**
     * 验签的规则:customerId|service|version|requestNo|timestamp|payload 其中值为空不参与签名
     * @param customerId
     * @param service
     * @param version
     * @param requestNo
     * @param timestamp
     * @param payload
     * @return
     */
    private String buildRequestSignContent(String customerId,String service, String version, String requestNo, long timestamp, String payload){
        StringBuffer stringBuffer = new StringBuffer();
        if(StringUtils.isNotBlank(customerId)){
            stringBuffer.append(customerId).append("|");
        }
        if(StringUtils.isNotBlank(service)){
            stringBuffer.append(service).append("|");
        }
        if(StringUtils.isNotBlank(version)){
            stringBuffer.append(version).append("|");
        }
        if(StringUtils.isNotBlank(requestNo)){
            stringBuffer.append(requestNo).append("|");
        }
        if(0 != timestamp){
            stringBuffer.append(timestamp).append("|");
        }
        if(StringUtils.isNotBlank(payload)){
            stringBuffer.append(payload);
        }
        return stringBuffer.toString();
    }

    /**
     * 签名规则:customerId|service|version|requestNo|timestamp|code|message|payload 其中值为空不参与签名
     * @param header
     * @param result
     * @return
     */
    private String buildResponseSignContent(Map<String,String> header,String result){
        StringBuffer stringBuffer = new StringBuffer();
        String customerId = header.get("customerId");
        if(StringUtils.isNotBlank(customerId)){
            stringBuffer.append(customerId).append("|");
        }
        String service = header.get("service");
        if(StringUtils.isNotBlank(service)){
            stringBuffer.append(service).append("|");
        }
        String version = header.get("version");
        if(StringUtils.isNotBlank(version)){
            stringBuffer.append(version).append("|");
        }
        String requestId = header.get("requestId");
        if(StringUtils.isNotBlank(requestId)){
            stringBuffer.append(requestId).append("|");
        }
        String timestamp = header.get("timestamp");
        if(StringUtils.isNotBlank(timestamp)){
            stringBuffer.append(timestamp).append("|");
        }
        String code = header.get("code");
        if(StringUtils.isNotBlank(code)){
            stringBuffer.append(code).append("|");
        }
        String message = header.get("message");
        if(StringUtils.isNotBlank(message)){
            stringBuffer.append(message).append("|");
        }
        if(StringUtils.isNotBlank(result)){
            stringBuffer.append(result);
        }
        return stringBuffer.toString();
    }

    private Map<String,String> getHeader(String customerId,String service,String version,Long timestamp,String requestNo,String sign){
        Map<String,String> header = new HashMap<String, String>();
        header.put("customerId",customerId);
        header.put("version",version);
        header.put("service",service);
        header.put("requestId",requestNo);
        header.put("timestamp", String.valueOf(timestamp));
        header.put("sign",sign);
        return header;
    }
}
