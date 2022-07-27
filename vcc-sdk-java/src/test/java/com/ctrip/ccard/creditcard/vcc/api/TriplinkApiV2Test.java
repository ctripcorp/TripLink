package com.ctrip.ccard.creditcard.vcc.api;

import com.ctrip.ccard.creditcard.vcc.api.V2.TripLinkApiImplV2;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardCancelRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardCancelResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardCreateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardCreateResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardDetailQueryRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardDetailQueryResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardRechargeRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardRechargeResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardSuspendRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardSuspendResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardUnsuspendRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardUnsuspendResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardUpdateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardUpdateResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardWithdrawRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.CardWithdrawResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QueryAuthTransactionRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QueryAuthTransactionResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QueryCustomerCreditAmountRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QueryCustomerCreditAmountResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuerySettlementTransactionRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuerySettlementTransactionResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuoteRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V2.QuoteResponse;
import com.ctrip.ccard.creditcard.vcc.biz.V2.TripLinkBizImplV2;
import com.ctrip.ccard.creditcard.vcc.util.JacksonUtil;
import com.ctrip.ccard.creditcard.vcc.util.TripLinkHttpClient;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TripLinkApiV2Test {

    private TripLinkHttpClient tripLinkHttpClient;

    private TripLinkBizImplV2 tripLinkBiz;

    private TripLinkApiImplV2 tripLinkApi;
    /**
     * aes key,携程提供
     */
    private static final String AES_KEY = "填写分配给您的AES KEY";
    /**
     * api 请求地址
     * 测试环境：https://vcc-compass-fat.ctripqa.com/compass/api
     * 生产环境：https://compass.triplinkintl.com/compass/api
     */
    private static final String URL = "接口请求地址";
    /**
     * RSA publick key
     * 测试环境：MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzGuvnpECqBJlD2Rk8eQ3BiNJn6TglMxC+BIzj7g2xOBF1wrn7vDgO40uNwF42SSDbQ2eb9lOyslhFlNZFeasCwKFLQ/uo0HY2vFlFBb49362OL1aYIf3hCgL7J2+4U6vUlrZkm0HWSZm5KMT/Y39hjTPSvaTQQPYBFgbderPIw1CS7hQpOh6MMp6XqdzPEdKWZ431A60wYV89BAd5n5hrlAWXeWsnzsO9FK1AHnDhH8FGkIsxYaZsVAAHwWIk1WLnKTWLLJSJjH+0qG7LwWcnlZDe22xza+LzszgyBcQ3f2jio1KD+xpXGN+qqa9jjuwFUx3qcdURRS53j1qRVhuFwIDAQAB
     */
    private static final String PUBLIC_KEY = "携程提供的RSA公钥，用来验签";
    /**
     * RSA private key
     */
    private static final String PRIVATE_KEY = "您自己创建的RSA私钥，用来加签";

    @Before
    public void setup() {

        tripLinkHttpClient = new TripLinkHttpClient();

        tripLinkBiz = new TripLinkBizImplV2(PRIVATE_KEY, PUBLIC_KEY, AES_KEY, URL, tripLinkHttpClient);

        tripLinkApi = new TripLinkApiImplV2(tripLinkBiz);
    }

    @Test
    public void create() throws Exception {
        CardCreateRequest request = new CardCreateRequest();
        /**
         * 请求流水号
         * 测试示例： request.setRequestId(UUID.randomUUID());
         */
        request.setRequestId("请求流水号，幂等处理的");
        /**
         * 商户ID 携程提供
         * 测试示例： request.setCustomerId("CSR1234567890");
         */
        request.setCustomerId("携程提供 格式为 CSRxxxxxx");
        /**
         * 卡币种，测试环境默认配置的是840 （USD）美元币种
         *  测试示例： request.setCardCurrencyCode("840");
         */
        request.setCardCurrencyCode("开卡币种 ISO 标准 三位数字");
        /**
         * 生效日期 ， 根据您自己的要求填写
         * 测试示例：
         *  request.setActiveDate("2022-01-01");
         */
        request.setActiveDate("生效日期 yyyy-MM-dd");
        /**
         * 失效日期，根据您自己的要求填写
         * 测试示例：
         *  request.setInactiveDate("2023-01-01");
         */
        request.setInactiveDate("失效日期 yyyy-MM-dd");
        /**
         * 卡额度，测试环境配置的币种默认是840 （USD）美元币种，小数位保留两位
         * 测试示例：request.setCardLimit(new BigDecimal(100.00))
         */
        request.setCardLimit(new BigDecimal("开卡的额度，保留的小数位对应卡币种"));
        /**
         * 单次授权金额下限，测试环境配置的币种默认是840 （USD）美元币种，小数位保留两位
         * 测试示例：request.setMinAuthAmount(new BigDecimal(0.00))
         */
        request.setMinAuthAmount(new BigDecimal("单次授权金额下限,保留的小数位对应卡币种"));
        /**
         * 单次授权金额上限，不能高于卡额度
         * 测试环境配置的币种默认是840 （USD）美元币种，小数位保留两位
         * 测试示例：request.setMaxAuthAmount(new BigDecimal(100.00))
         */
        request.setMaxAuthAmount(new BigDecimal("单次授权金额上限,保留的小数位对应卡币种"));
        /**
         * 授权次数上限  1：单次卡，-1：不限次数。
         * 测试示例：request.setMaxAuthTimes(-1)
         */
        request.setMaxAuthTimes(-1);
        /**
         * 关卡百分比,范围0-100。
         * 当剩余额度百分比小于此值，卡会被自动注销。默认值0，当关卡百分比设置为0时，卡片不会自动关卡。
         * 测试示例：request.setCardCloseUsage(100)
         */
        request.setCardCloseUsage(100);
        /**
         * 结算币种，测试环境配置的币种默认是840 （USD）美元币种
         * 测试示例：request.setSettlementCurrencyCode("840");
         */
        request.setSettlementCurrencyCode("840");
        /**
         * mcc 携程提供
         * 测试示例：request.setSupportedMccGroup("ecom");
         */
        request.setSupportedMccGroup("mcc 携程提供");
        /**
         *是否允许非卡币种交易,默认true
         * 测试示例：request.setMultipleCurrencyCard(true);
         */
        request.setMultipleCurrencyCard(true);
        /**
         * 是否验证CVV2 ,默认false
         * 测试示例：request.setCvv2ForceCheck(false);
         */
        request.setCvv2ForceCheck(false);
        /**
         * 卡产品，C01 CO2 CO3
         * 具体值看api文档描述
         */
        request.setCardProductCode("C01");
        /**
         * 用户自定义参数，String键值对，共20个键可选，范围useRef1Txt-useRef20Txt
         * 测试示例：Map<String, String> userReferenceMap = new HashMap<String, String>();
         *           userReferenceMap.put("useRef1Txt", "DLA272031Q4GNE");
         */
        Map<String, String> userReferenceMap = new HashMap<String, String>();
        userReferenceMap.put("useRef1Txt", "DLA272031Q4GNE");
        request.setUserReferenceMap(userReferenceMap);
        CardCreateResponse response = tripLinkApi.create(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void update() throws Exception {
        CardUpdateRequest request = new CardUpdateRequest();
        /**
         * 请求流水号
         * 测试示例： request.setRequestId(UUID.randomUUID());
         */
        request.setRequestId("请求流水号");
        /**
         * 商户ID 携程提供
         * 测试示例： request.setCustomerId("CSR1234567890");
         */
        request.setCustomerId("携程提供 格式为 CSRxxxxxx");
        /**
         * 卡识别号，开卡接口返回的 cardLogId字段
         * 测试示例：request.setCardLogId("db5831315c687528ab03784da1e5e32e19169e6952f164c489a502787abfba92");
         */
        request.setCardLogId("卡识别号，开卡接口返回的 cardLogId字段");
        /**
         * 卡额度，测试环境配置的币种默认是840 （USD）美元币种，小数位保留两位
         * 测试示例：request.setCardLimit(new BigDecimal(200.00))
         */
        request.setCardLimit(new BigDecimal("更新卡的额度，保留的小数位对应卡币种"));
        /**
         * 单次授权金额下限，测试环境配置的币种默认是840 （USD）美元币种，小数位保留两位
         * 测试示例：request.setMinAuthAmount(new BigDecimal(0.00))
         */
        request.setMinAuthAmount(new BigDecimal("单次授权金额下限,保留的小数位对应卡币种"));
        /**
         * 单次授权金额上限，不能高于卡额度
         * 测试环境配置的币种默认是840 （USD）美元币种，小数位保留两位
         * 测试示例：request.setMaxAuthAmount(new BigDecimal(100.00))
         */
        request.setMaxAuthAmount(new BigDecimal("单次授权金额上限,保留的小数位对应卡币种"));
        CardUpdateResponse response = tripLinkApi.update(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void recharge() throws Exception {
        CardRechargeRequest request = new CardRechargeRequest();
        /**
         * 请求流水号
         * 测试示例： request.setRequestId(UUID.randomUUID());
         */
        request.setRequestId("请求流水号");
        /**
         * 商户ID 携程提供
         * 测试示例： request.setCustomerId("CSR1234567890");
         */
        request.setCustomerId("携程提供 格式为 CSRxxxxxx");
        /**
         * 卡识别号，开卡接口返回的 cardLogId字段
         * 测试示例：request.setCardLogId("db5831315c687528ab03784da1e5e32e19169e6952f164c489a502787abfba92");
         */
        request.setCardLogId("卡识别号，开卡接口返回的 cardLogId字段");
        /**
         * 充值金额，测试环境配置的币种默认是840 （USD）美元币种，小数位保留两位
         * 测试示例：request.setRechargeAmount(BigDecimal.valueOf(10.50));
         */
        request.setRechargeAmount(new BigDecimal("充值金额,保留的小数位对应卡币种"));
        CardRechargeResponse response = tripLinkApi.recharge(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void withdraw() throws Exception {
        CardWithdrawRequest request = new CardWithdrawRequest();
        /**
         * 请求流水号
         * 测试示例： request.setRequestId(UUID.randomUUID());
         */
        request.setRequestId("请求流水号");
        /**
         * 商户ID 携程提供
         * 测试示例： request.setCustomerId("CSR1234567890");
         */
        request.setCustomerId("携程提供 格式为 CSRxxxxxx");
        /**
         * 卡识别号，开卡接口返回的 cardLogId字段
         * 测试示例：request.setCardLogId("db5831315c687528ab03784da1e5e32e19169e6952f164c489a502787abfba92");
         */
        request.setCardLogId("卡识别号，开卡接口返回的 cardLogId字段");
        /**
         * 提现金额，测试环境配置的币种默认是840 （USD）美元币种，小数位保留两位
         * 测试示例：request.setWithdrawAmount(BigDecimal.valueOf(10.50));
         */
        request.setWithdrawAmount(new BigDecimal("提现金额,保留的小数位对应卡币种"));
        CardWithdrawResponse response = tripLinkApi.withdraw(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void close() throws Exception {
        CardCancelRequest request = new CardCancelRequest();
        /**
         * 请求流水号
         * 测试示例： request.setRequestId(UUID.randomUUID());
         */
        request.setRequestId("请求流水号");
        /**
         * 商户ID 携程提供
         * 测试示例： request.setCustomerId("CSR1234567890");
         */
        request.setCustomerId("携程提供 格式为 CSRxxxxxx");
        /**
         * 卡识别号，开卡接口返回的 cardLogId字段
         * 测试示例：request.setCardLogId("db5831315c687528ab03784da1e5e32e19169e6952f164c489a502787abfba92");
         */
        request.setCardLogId("卡识别号，开卡接口返回的 cardLogId字段");
        CardCancelResponse response = tripLinkApi.close(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void queryCard() throws Exception {
        CardDetailQueryRequest request = new CardDetailQueryRequest();
        /**
         * 请求流水号
         * 测试示例： request.setRequestId(UUID.randomUUID());
         */
        request.setRequestId("请求流水号");
        /**
         * 商户ID 携程提供
         * 测试示例： request.setCustomerId("CSR1234567890");
         */
        request.setCustomerId("携程提供 格式为 CSRxxxxxx");
        /**
         * 卡识别号，开卡接口返回的 cardLogId字段
         * 测试示例：request.setCardLogId("db5831315c687528ab03784da1e5e32e19169e6952f164c489a502787abfba92");
         */
        request.setCardLogId("卡识别号，开卡接口返回的 cardLogId字段");
        CardDetailQueryResponse response = tripLinkApi.queryCard(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void queryCustomerCredit() throws Exception {
        QueryCustomerCreditAmountRequest request = new QueryCustomerCreditAmountRequest();
        /**
         * 请求流水号
         * 测试示例： request.setRequestId(UUID.randomUUID());
         */
        request.setRequestId("请求流水号");
        /**
         * 商户ID 携程提供
         * 测试示例： request.setCustomerId("CSR1234567890");
         */
        request.setCustomerId("携程提供 格式为 CSRxxxxxx");

        QueryCustomerCreditAmountResponse response = tripLinkApi.queryCustomerCreditAmount(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void queryAuthTransaction() throws Exception {
        QueryAuthTransactionRequest request = new QueryAuthTransactionRequest();
        /**
         * 请求流水号
         * 测试示例： request.setRequestId(UUID.randomUUID());
         */
        request.setRequestId("请求流水号");
        /**
         * 商户ID 携程提供
         * 测试示例： request.setCustomerId("CSR1234567890");
         */
        request.setCustomerId("携程提供 格式为 CSRxxxxxx");
        /**
         * 卡识别号，开卡接口返回的 cardLogId字段
         * 测试示例：request.setCardLogId("db5831315c687528ab03784da1e5e32e19169e6952f164c489a502787abfba92");
         */
        request.setCardLogId("卡识别号，开卡接口返回的 cardLogId字段");
        /**
         * 查询授权记录 时间区间设置 开始时间
         * 测试示例： request.setStartTime("2022-01-01");
         */
        request.setStartTime("时间区间 yyyy-MM-dd");
        /**
         * 查询授权记录 时间区间设置 结束时间
         * 测试示例： request.setStartTime("2022-02-01");
         */
        request.setEndTime("时间区间 yyyy-MM-dd");
        QueryAuthTransactionResponse response = tripLinkApi.queryAuthTransaction(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void querySettlementTransaction() throws Exception {
        QuerySettlementTransactionRequest request = new QuerySettlementTransactionRequest();
        /**
         * 请求流水号
         * 测试示例： request.setRequestId(UUID.randomUUID());
         */
        request.setRequestId("请求流水号");
        /**
         * 商户ID 携程提供
         * 测试示例： request.setCustomerId("CSR1234567890");
         */
        request.setCustomerId("携程提供 格式为 CSRxxxxxx");
        /**
         * 卡识别号，开卡接口返回的 cardLogId字段
         * 测试示例：request.setCardLogId("db5831315c687528ab03784da1e5e32e19169e6952f164c489a502787abfba92");
         */
        request.setCardLogId("卡识别号，开卡接口返回的 cardLogId字段");
        /**
         * 查询清算记录 时间区间设置 开始时间
         * 测试示例： request.setStartTime("2022-01-01");
         */
        request.setStartTime("时间区间 yyyy-MM-dd");
        /**
         * 查询清算记录 时间区间设置 结束时间
         * 测试示例： request.setStartTime("2022-02-01");
         */
        request.setEndTime("时间区间 yyyy-MM-dd");
        QuerySettlementTransactionResponse response = tripLinkApi.querySettlementTransaction(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void suspend() throws Exception {
        CardSuspendRequest request = new CardSuspendRequest();
        /**
         * 请求流水号
         * 测试示例： request.setRequestId(UUID.randomUUID());
         */
        request.setRequestId("请求流水号");
        /**
         * 商户ID 携程提供
         * 测试示例： request.setCustomerId("CSR1234567890");
         */
        request.setCustomerId("携程提供 格式为 CSRxxxxxx");
        /**
         * 卡识别号，开卡接口返回的 cardLogId字段
         * 测试示例：request.setCardLogId("db5831315c687528ab03784da1e5e32e19169e6952f164c489a502787abfba92");
         */
        request.setCardLogId("卡识别号，开卡接口返回的 cardLogId字段");

        CardSuspendResponse response = tripLinkApi.suspend(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void unsuspend() throws Exception {
        CardUnsuspendRequest request = new CardUnsuspendRequest();
        /**
         * 请求流水号
         * 测试示例： request.setRequestId(UUID.randomUUID());
         */
        request.setRequestId("请求流水号");
        /**
         * 商户ID 携程提供
         * 测试示例： request.setCustomerId("CSR1234567890");
         */
        request.setCustomerId("携程提供 格式为 CSRxxxxxx");
        /**
         * 卡识别号，开卡接口返回的 cardLogId字段
         * 测试示例：request.setCardLogId("db5831315c687528ab03784da1e5e32e19169e6952f164c489a502787abfba92");
         */
        request.setCardLogId("卡识别号，开卡接口返回的 cardLogId字段");

        CardUnsuspendResponse response = tripLinkApi.unsuspend(request);
        Assert.assertNotNull(response);
    }
    @Test
    public void quote() throws Exception {
        QuoteRequest request = new QuoteRequest();
        /**
         * 请求流水号
         * 测试示例： request.setRequestId(UUID.randomUUID());
         */
        request.setRequestId(String.valueOf(UUID.randomUUID()));
        /**
         * 商户ID 携程提供
         * 测试示例： request.setCustomerId("CSR1234567890");
         */
        request.setCustomerId("CSR2E54DC4B8A5D4");
        /**
         * 卖出币种
         * 测试示例：request.setSellCurrency("EUR");
         */
        request.setSellCurrency("156");
        /**
         * 买入币种
         * 测试示例： request.setBuyCurrency("USD");
         */
        request.setBuyCurrency("840");
        /**
         * 换汇方向 0-指定卖出 1-指定买入
         * 测试示例： request.setFxDirection(0);
         */
        request.setFxDirection(0);
        /**
         * 交易金额，与FxDirection相互联动
         *  request.setFxAmount(100L);
         */
        request.setFxAmount(BigDecimal.valueOf(100L));

        QuoteResponse response = tripLinkApi.quote(request);
        System.out.println(JacksonUtil.object2JsonString(response));
        //Assert.assertNotNull(response);
    }
}
