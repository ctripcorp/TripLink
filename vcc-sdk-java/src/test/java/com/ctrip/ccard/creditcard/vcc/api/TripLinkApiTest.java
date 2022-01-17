package com.ctrip.ccard.creditcard.vcc.api;

import com.ctrip.ccard.creditcard.vcc.api.V1.TripLinkApiImpl;
import com.ctrip.ccard.creditcard.vcc.bean.V1.*;
import com.ctrip.ccard.creditcard.vcc.biz.V1.TripLinkBizImpl;
import com.ctrip.ccard.creditcard.vcc.util.TripLinkHttpClient;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Description:
 */
public class TripLinkApiTest {

    private TripLinkHttpClient tripLinkHttpClient;

    private TripLinkBizImpl tripLinkBiz;

    private TripLinkApiImpl tripLinkApi;

    private static final String DES = "Wa8Nw*Ei";

    private static final String URL = "https://openpci-fws.ctripqa.com/restful/soa2/18375/json";

    private static final String PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAKpQrSAzyJV0MfBN7qKvE8d73phdredNhF3cKm3IWKFlCWg/3alVWI6GE462rPc5A4T+shYcvzqhV5wSOS0QMfj9VfLPqUT+xggFcCQ48mbeX4Jy/N5QZB3RZuQu+YbmQT6f54h2sJvhqLurvE7sgW4qL7r6AaJfDsvYPjKSezYXAgMBAAECgYA32EY8Jd6iarwpMFSMEV4p7craKPVpv3gkkply79tn6EpCXZaf/HUSHpJxHCLw2Uf3JtBcAccOQXMJoMwQo5vOoMVl5nk+EZN//MB8Re8r/7GQV8E+myHdlntMjxOf38PGn9z8Ze0Q020fZwGjA6egBFcU/ld1lCcI0TAj3cZDcQJBANS9UOC3J5njhnuzACjQ1qTTXuv6hr2lbglr2za4Ju9xFJUkKXy2LBAp2LlakXZXDhf7lsqmwZg5BvOBK6DPl18CQQDM8tqqOr4LRJRhq2bqBx398IqtyoZpMshpzBXLr7bdhp7FR2N4AEoAGaa5hS5k3z5SYNLEGKFhRM+sFJBQjnRJAkBnq647I+YffxotM8jTGxpOjlbGhnqc9n4OB0p3evw2WRPfrhStmpUUd2AOy4zxb3EFzOvp66OSC9BQX9Uj86XfAkEAouGbgVDgOupNFvZ2+yWe43Ppc0eS3UZ72wFUjSXgKlzUECu1VOi95yh7xdOf1JFL4YKL30dH8psShUtuimc86QJAeBXASabJBcHAIisPkODvsciiz1pzm1WSuXRUxnuis0TRTRs7+2KEnWE4UV3jxehxkc1RAgteYosWXg5TWQgiUg==";

    @Before
    public void setup() {

        tripLinkHttpClient = new TripLinkHttpClient();

        tripLinkBiz = new TripLinkBizImpl(PRIVATE_KEY, DES, URL, tripLinkHttpClient);

        tripLinkApi = new TripLinkApiImpl(tripLinkBiz);
    }

    @Test
    public void createTest() {
        CreateRequest createRequest = new CreateRequest();
        createRequest.setRequestId("2021072822470000112");
        createRequest.setRequestTime("20210728224750");
        createRequest.setMerchantName("WANWEI");
        createRequest.setChannelType("WANWEI_CFNC_VCC");
        createRequest.setOperator("max");
        createRequest.setRequestSource("goldenwater");
        CreateCardInfo createCardInfo = new CreateCardInfo();
        createCardInfo.setLocalCurrency("USD");
        createCardInfo.setBillCurrency("USD");
        createCardInfo.setStartActiveDate("2021-07-28");
        createCardInfo.setEndCloseDate("2023-07-28");
        createCardInfo.setCreditLimitAmt(BigDecimal.valueOf(1200.00));
        createCardInfo.setMinAuthAmt(BigDecimal.valueOf(0.00));
        createCardInfo.setMaxAuthAmt(BigDecimal.valueOf(1200.00));
        createCardInfo.setEnableMutilUse("1");
        createCardInfo.setClosePercentage(100);
        createCardInfo.setEnable3DS("0");
        createCardInfo.setEnaleCVVCheck("0");
        createCardInfo.setEnableCurrencyCheck("0");
        createCardInfo.setMerchantCategoryName("0011");
        createCardInfo.setUserDefineInfo("{\"BookingNumber\":\"0d4a88ac-690f-7123-4930-17a831c41a49\"}");
        createRequest.setCardInfo(createCardInfo);
        CreateResponse createResponse = tripLinkApi.create(createRequest);
        Assert.assertNotNull(createResponse);
    }

    @Test
    public void queryCreateResultTest() {
        QueryCreateResultRequest request = new QueryCreateResultRequest();
        request.setRequestId("20210728224700001");
        request.setRequestTime("20210728224750");
        request.setMerchantName("WANWEI");
        request.setOperator("max");
        QueryCreateResultResponse response = tripLinkApi.queryCreateResult(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void updateTest() {
        UpdateRequest updateRequest = new UpdateRequest();
        updateRequest.setRequestId("update20210728224700002");
        updateRequest.setRequestTime("20210728225550");
        updateRequest.setMerchantName("WANWEI");
        updateRequest.setChannelType("WANWEI_CFNC_VCC");
        updateRequest.setOperator("max");
        updateRequest.setRequestSource("goldenwater");
        UpdateCardInfo updateCardInfo = new UpdateCardInfo();
        updateCardInfo.setCardLogId("a7558f115f25893d3588d9fc3ecab8e8b887bc92e82f4c3e2ba3d4e239a6e9b9");
        updateCardInfo.setStartActiveDate("2021-07-28");
        updateCardInfo.setEndCloseDate("2023-07-28");
        updateCardInfo.setCreditLimitAmt(BigDecimal.valueOf(3200.00));
        updateCardInfo.setMinAuthAmt(BigDecimal.valueOf(0.00));
        updateCardInfo.setMaxAuthAmt(BigDecimal.valueOf(3200.00));
        updateCardInfo.setClosePercentage(90);
        updateCardInfo.setEnable3DS("0");
        updateCardInfo.setEnaleCVVCheck("0");
        updateCardInfo.setEnableCurrencyCheck("0");
        updateCardInfo.setMerchantCategoryName("0011");
        updateCardInfo.setUserDefineInfo("{\"BookingNumber\":\"0d4a88ac-690f-7123-4930-17a831c41a49\"}");
        updateRequest.setCardInfo(updateCardInfo);
        UpdateResponse updateResponse = tripLinkApi.update(updateRequest);
        Assert.assertNotNull(updateResponse);
    }

    @Test
    public void queryUpdateResultTest() {
        QueryUpdateResultRequest request = new QueryUpdateResultRequest();
        request.setRequestId("update20210728224700002");
        request.setRequestTime("20210728225550");
        request.setMerchantName("WANWEI");
        request.setOperator("max");
        QueryUpdateResultResponse response = tripLinkApi.queryUpdateResult(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void rechargeTest() {
        RechargeRequest rechargeRequest = new RechargeRequest();
        rechargeRequest.setRequestId("recharge2021072822470000000");
        rechargeRequest.setRequestTime("20210728230050");
        rechargeRequest.setMerchantName("WANWEI");
        rechargeRequest.setChannelType("WANWEI_CFNC_VCC");
        rechargeRequest.setOperator("max");
        rechargeRequest.setRequestSource("goldenwater");
        rechargeRequest.setCardLogId("a7558f115f25893d3588d9fc3ecab8e8b887bc92e82f4c3e2ba3d4e239a6e9b9");
        rechargeRequest.setWillChangeAmt(new BigDecimal("100"));
        RechargeResponse rechargeResponse = tripLinkApi.recharge(rechargeRequest);
        Assert.assertNotNull(rechargeResponse);
    }

    @Test
    public void withdrawTest() {
        WithdrawRequest withdrawRequest = new WithdrawRequest();
        withdrawRequest.setRequestId("withdraw202107282247000000001");
        withdrawRequest.setRequestTime("20210728230050");
        withdrawRequest.setMerchantName("WANWEI");
        withdrawRequest.setChannelType("WANWEI_CFNC_VCC");
        withdrawRequest.setOperator("max");
        withdrawRequest.setRequestSource("goldenwater");
        withdrawRequest.setCardLogId("a7558f115f25893d3588d9fc3ecab8e8b887bc92e82f4c3e2ba3d4e239a6e9b9");
        withdrawRequest.setWillChangeAmt(new BigDecimal("100"));
        WithdrawResponse withdrawResponse = tripLinkApi.withdraw(withdrawRequest);
        Assert.assertNotNull(withdrawResponse);
    }

    @Test
    public void closeTest() {
        CloseRequest closeRequest = new CloseRequest();
        closeRequest.setRequestId("close20210728224700001");
        closeRequest.setRequestTime("20210728230050");
        closeRequest.setMerchantName("WANWEI");
        closeRequest.setChannelType("WANWEI_CFNC_VCC");
        closeRequest.setOperator("max");
        closeRequest.setRequestSource("goldenwater");
        closeRequest.setCardLogId("a7558f115f25893d3588d9fc3ecab8e8b887bc92e82f4c3e2ba3d4e239a6e9b9");
        CloseResponse closeResponse = tripLinkApi.close(closeRequest);
        Assert.assertNotNull(closeResponse);
    }

    @Test
    public void queryCloseResultTest() {
        QueryCloseResultRequest request = new QueryCloseResultRequest();
        request.setRequestId("close20210728224700001");
        request.setRequestTime("20210728230050");
        request.setMerchantName("WANWEI");
        request.setOperator("max");
        QueryCloseResultResponse response = tripLinkApi.queryCloseResult(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void queryCardInfoTest() {
        QueryCardInfoRequest request = new QueryCardInfoRequest();
        request.setRequestId("card20210728224700002");
        request.setRequestTime("20210728230850");
        request.setMerchantName("WANWEI");
        request.setChannelType("WANWEI_CFNC_VCC");
        request.setCardLogId("a7558f115f25893d3588d9fc3ecab8e8b887bc92e82f4c3e2ba3d4e239a6e9b9");
        request.setOperator("max");
        QueryCardInfoResponse response = tripLinkApi.queryCardInfo(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void queryMerchantInfoTest() {
        QueryMerchantInfoRequest request = new QueryMerchantInfoRequest();
        request.setRequestId("merchant202107282247000021");
        request.setRequestTime("202107282308501");
        request.setMerchantName("WANWEI");
        request.setChannelType("WANWEI_CFNC_VCC");
        request.setCardLogId("a7558f115f25893d3588d9fc3ecab8e8b887bc92e82f4c3e2ba3d4e239a6e9b9");
        request.setOperator("max");
        QueryMerchantInfoResponse response = tripLinkApi.queryMerchantInfo(request);
        Assert.assertNotNull(response);
    }


    @Test
    public void queryAuthTransInfoTest() {
        QueryAuthTransInfoRequest request = new QueryAuthTransInfoRequest();
        request.setRequestId("auth20210728224700002");
        request.setRequestTime("20210728230850");
        request.setMerchantName("WANWEI");
        request.setChannelType("WANWEI_CFNC_VCC");
        request.setStartDate("2021-07-28");
        request.setEndDate("2021-08-28");
        request.setCardLogId("a7558f115f25893d3588d9fc3ecab8e8b887bc92e82f4c3e2ba3d4e239a6e9b9");
        request.setOperator("max");
        QueryAuthTransInfoResponse response = tripLinkApi.queryAuthTransInfo(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void querySettlemetTransInfoTest() {
        QuerySettlemetTransInfoRequest request = new QuerySettlemetTransInfoRequest();
        request.setRequestId("settle20210728224700002");
        request.setRequestTime("20210728230850");
        request.setMerchantName("WANWEI");
        request.setChannelType("WANWEI_CFNC_VCC");
        request.setStartDate("2021-07-28");
        request.setEndDate("2021-08-28");
        request.setCardLogId("a7558f115f25893d3588d9fc3ecab8e8b887bc92e82f4c3e2ba3d4e239a6e9b9");
        request.setOperator("max");
        QuerySettlemetTransInfoResponse response = tripLinkApi.querySettlemetTransInfo(request);
        Assert.assertNotNull(response);
    }
}
