package com.ctrip.ccard.creditcard.vcc.api;

import com.ctrip.ccard.creditcard.vcc.api.V1.TripLinkApiImpl;
import com.ctrip.ccard.creditcard.vcc.bean.V1.CloseRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.CloseResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.CreateCardInfo;
import com.ctrip.ccard.creditcard.vcc.bean.V1.CreateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.CreateResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryAccountInfoRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QueryAccountInfoResponse;
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
import com.ctrip.ccard.creditcard.vcc.bean.V1.UpdateCardInfo;
import com.ctrip.ccard.creditcard.vcc.bean.V1.UpdateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.UpdateResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.WithdrawRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.WithdrawResponse;
import com.ctrip.ccard.creditcard.vcc.biz.V1.TripLinkBizImpl;
import com.ctrip.ccard.creditcard.vcc.util.JacksonUtil;
import com.ctrip.ccard.creditcard.vcc.util.TripLinkHttpClient;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class TripLinkApiTest {

    private TripLinkHttpClient tripLinkHttpClient;

    private TripLinkBizImpl tripLinkBiz;

    private TripLinkApiImpl tripLinkApi;

    private static final String DES = "Wa8Nw*Ei";

    private static final String URL = "https://m.fat3672.qa.nt.ctripcorp.com/api";

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
        createCardInfo.setCardProductCode(null);
        createCardInfo.setQuoteId(null);
        createCardInfo.setSellCurrency(null);
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
    public void restoreTest() {
        RestoreRequest restoreRequest = new RestoreRequest();
        restoreRequest.setRequestId("restore20240426000000001");
        restoreRequest.setRequestTime("20240426230000");
        restoreRequest.setMerchantName("WANWEI");
        restoreRequest.setChannelType("WANWEI_CFNC_VCC");
        restoreRequest.setOperator("max");
        restoreRequest.setRequestSource("goldenwater");
        restoreRequest.setCardLogId("a7558f115f25893d3588d9fc3ecab8e8b887bc92e82f4c3e2ba3d4e239a6e9b9");
        restoreRequest.setLocalCurrency("USD");
        restoreRequest.setLocalCurrencyAmt(BigDecimal.valueOf(12.34));
        restoreRequest.setSettlementId("ffc5d82d-35ec-4cd9-b9f5-7b65e1cd4fad");
        RestoreResponse restoreResponse = tripLinkApi.restore(restoreRequest);
        Assert.assertNotNull(restoreResponse);
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
    public void queryAccountInfoTest() {
        QueryAccountInfoRequest request = new QueryAccountInfoRequest();
        request.setRequestId("account20220111");
        request.setRequestTime("20220111170850");
        request.setMerchantName("WANWEI");
        request.setChannelType("WANWEI_CFNC_VCC");
        request.setOperator("max");
        QueryAccountInfoResponse response = tripLinkApi.queryAccountInfo(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void queryAuthTransInfoTest() {
        QueryAuthTransInfoRequest request = new QueryAuthTransInfoRequest();
        request.setRequestId("auth20210728224700002");
        request.setRequestTime("20240910230850");
        request.setMerchantName("PLATFORM01");
        request.setChannelType("PLATFORM01_CFNC_VCC");
        request.setStartDate("2024-10-13");
        request.setEndDate("2024-10-14");
        request.setCardLogId("91da7811592cc5b7ed390914407b4218064008859aed69e1338999d63b8f1c0f");
        request.setOperator("max");
        QueryAuthTransInfoResponse response = tripLinkApi.queryAuthTransInfo(request);
        System.out.println(JacksonUtil.object2JsonString(response));
        //Assert.assertNotNull(response);
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

    @Test
    public void suspendCardTest(){
        SuspendRequest request = new SuspendRequest();
        request.setRequestId("suspend20200201111233");
        request.setRequestTime("20220306230850");
        request.setMerchantName("WANWEI");
        request.setChannelType("WANWEI_CFNC_VCC");
        request.setOperator("max");
        request.setRequestSource("goldenwater");
        request.setCardLogId("a7558f115f25893d3588d9fc3ecab8e8b887bc92e82f4c3e2ba3d4e239a6e9b9");
        SuspendResponse response = tripLinkApi.suspend(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void unSuspendCardTest(){
        UnSuspendRequest request = new UnSuspendRequest();
        request.setRequestId("suspend20200201111233");
        request.setRequestTime("20220306230850");
        request.setMerchantName("WANWEI");
        request.setChannelType("WANWEI_CFNC_VCC");
        request.setOperator("max");
        request.setRequestSource("goldenwater");
        request.setCardLogId("a7558f115f25893d3588d9fc3ecab8e8b887bc92e82f4c3e2ba3d4e239a6e9b9");
        UnSuspendResponse response = tripLinkApi.unSuspend(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void queryAuthTransInfoByPageTest() {
        QueryAuthTransInfoByPageRequest request = new QueryAuthTransInfoByPageRequest();
        request.setRequestId("8908089");
        request.setRequestTime("20210728230850");
        request.setMerchantName("WANWEI");
        request.setChannelType("WANWEI_CFNC_VCC");
        request.setStartDate("2022-04-01 00:00:00");
        request.setEndDate("2023-05-01 00:00:00");
        request.setCardLogId("98d523cd2eaddeda76ca4e4d0f24660abda7e39b7e819c05ab92c8ff45e80167");
        request.setOperator("max");
        request.setPageNo(1);
        request.setPageSize(100);
        QueryAuthTransInfoByPageResponse response = tripLinkApi.queryAuthTransInfoByPage(request);
        System.out.println(JacksonUtil.object2JsonString(response));
       // Assert.assertNotNull(response);
    }

    @Test
    public void querySettlemetTransInfoByPageTest() {
        QuerySettlemetTransInfoByPageRequest request = new QuerySettlemetTransInfoByPageRequest();
        request.setRequestId("9808686");
        request.setRequestTime("20210728230850");
        request.setMerchantName("WANWEI");
        request.setChannelType("WANWEI_CFNC_VCC");
        request.setStartDate("2023-04-01 00:00:00");
        request.setEndDate("2023-05-01 00:00:00");
        request.setCardLogId("98d523cd2eaddeda76ca4e4d0f24660abda7e39b7e819c05ab92c8ff45e80167");
        request.setOperator("max");
        request.setPageNo(1);
        request.setPageSize(100);
        QuerySettlemetTransInfoByPageResponse response = tripLinkApi.querySettlemetTransInfoByPage(request);
        System.out.println(JacksonUtil.object2JsonString(response));
        //Assert.assertNotNull(response);
    }
}
