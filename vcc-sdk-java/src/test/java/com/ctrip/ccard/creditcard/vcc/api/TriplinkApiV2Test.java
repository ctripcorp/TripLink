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
import com.ctrip.ccard.creditcard.vcc.biz.V2.TripLinkBizImplV2;
import com.ctrip.ccard.creditcard.vcc.util.TripLinkHttpClient;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TriplinkApiV2Test {

    private TripLinkHttpClient tripLinkHttpClient;

    private TripLinkBizImplV2 tripLinkBiz;

    private TripLinkApiImplV2 tripLinkApi;

    private static final String AES_KEY = "i0BFCWsuAPYH7PTa4jQhaQ==";

    private static final String URL = "https://vcc.compass.fws.qa.nt.ctripcorp.com/compass/api/triplink";

    private static final String PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzGuvnpECqBJlD2Rk8eQ3BiNJn6TglMxC+BIzj7g2xOBF1wrn7vDgO40uNwF42SSDbQ2eb9lOyslhFlNZFeasCwKFLQ/uo0HY2vFlFBb49362OL1aYIf3hCgL7J2+4U6vUlrZkm0HWSZm5KMT/Y39hjTPSvaTQQPYBFgbderPIw1CS7hQpOh6MMp6XqdzPEdKWZ431A60wYV89BAd5n5hrlAWXeWsnzsO9FK1AHnDhH8FGkIsxYaZsVAAHwWIk1WLnKTWLLJSJjH+0qG7LwWcnlZDe22xza+LzszgyBcQ3f2jio1KD+xpXGN+qqa9jjuwFUx3qcdURRS53j1qRVhuFwIDAQAB";

    private static final String PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDMa6+ekQKoEmUPZGTx5DcGI0mfpOCUzEL4EjOPuDbE4EXXCufu8OA7jS43AXjZJINtDZ5v2U7KyWEWU1kV5qwLAoUtD+6jQdja8WUUFvj3frY4vVpgh/eEKAvsnb7hTq9SWtmSbQdZJmbkoxP9jf2GNM9K9pNBA9gEWBt16s8jDUJLuFCk6Howynpep3M8R0pZnjfUDrTBhXz0EB3mfmGuUBZd5ayfOw70UrUAecOEfwUaQizFhpmxUAAfBYiTVYucpNYsslImMf7SobsvBZyeVkN7bbHNr4vOzODIFxDd/aOKjUoP7GlcY36qpr2OO7AVTHepx1RFFLnePWpFWG4XAgMBAAECggEAJj2u6NbvzElEppB9YdLziC5pw3ewm6VqkcW155jqhgH+jq/3m3dsOze6AYhA9z4hZ/E4Rmw8lSr/ApItBC/W12htSXTFi7zxuGOYKR3zDTmjFRI3Kf/Fie+D64vG/ZcerSVZtk63JTJN5U+sma5KUyTl8nwWJ/90Fbv1xyVaApBOwMXxoA3YYy+oqnnzGXut084bozSWkC3jVzEMPTFI4Vb4YWG4d37SpvJegUXWDDHArer9OaKKMRsjG/ms34NDpjEmNQQAatP217QFLX94R6e4MRDvz8eAtBGQcVhFzSxjPl4OgDrJmwxwLiilT4+FB2FXhtxQeFVsviuZ1TP2gQKBgQDuccBiWt5sbk9h9/qiUws4k8gjb630HoWpwZ8roGQ/sDl0LMPY5XAAeMI9xVTi9VfYEsd3h95D/9z+PvhMpb8c79ThxDH916L71XMrxA/JVOPi8DlD/T7OnOH4q66cYJwVsltaem6smK8soIPkBBBW8HTioLPggtCJDFunq97AcQKBgQDbeKYcb6LPLc7KAuSpFQbLtQyh2o8nmvi8SfycHTopnzVq+bZLI6HrCB0BeFwZuwHSlHljtW91cIYL1ULBSmEpZ03RCFHG15zs3LcE/MduviEcn2TattAc7Ati/z5LHYiiatXf6tNPj4r+C0nIab6r8Fb6gzDd0gNFNUSRjelbBwKBgQCcWIHo++Qz/PCYMF1q6kDFTEFC2wuYshq6gHa5yGVzTT2e62tPYMHbzVKv5iAO4QhEaavYuIII3FAvdWKh/1wcwTU5A8gzxZzcu8zUua4QOVVjjFhAOGFiYIPa5deMOdyebWBxJy5Char2/Bj+/ZspJmm939mSMLRD6JKAkrVwQQKBgCSrZeW+aU+Acdqi3R27G6WRnIi2gdC2PfUHz6Mt5vfpV/2Ft4WacIVal64VNB5Adq9+i0GzoOnYYS089qhhCxbl4cSZRUCZ6ehRgGre6VuBfPrRTwKUJPWQIt7pkrjuOFQa0Z1WGPRkIW8M58kKkgccYwv8O3/0hQNdQRWoxmKlAoGBAKKAr/J2QfS9hmlQP2XVOms0z2acA+qIjWiapk6Utv+XTSxyFWwF4IFo5yw300OAARGhbBMzZvxr3y4lwCrV6UHu+XurAZR5+jLSrLR97fAVvqsSnvEZ5L2H6KwYxDK2t/qGukCZOzC9skp+t3plS+dXLQQLni5DhP3+PzYHJqTc";

    @Before
    public void setup() {

        tripLinkHttpClient = new TripLinkHttpClient();

        tripLinkBiz = new TripLinkBizImplV2(PRIVATE_KEY, PUBLIC_KEY, AES_KEY, URL, tripLinkHttpClient);

        tripLinkApi = new TripLinkApiImplV2(tripLinkBiz);
    }

    @Test
    public void create() throws Exception {
        CardCreateRequest request = new CardCreateRequest();
        request.setRequestId(UUID.randomUUID().toString());
        request.setCustomerId("CSR9258286F29A84");
        request.setCardCurrencyCode("840");
        request.setActiveDate(new Date());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        request.setInactiveDate(simpleDateFormat.parse("2022-10-28"));
        request.setCardLimit(BigDecimal.valueOf(100.05));
        request.setMinAuthAmount(BigDecimal.valueOf(0.00));
        request.setMaxAuthAmount(BigDecimal.valueOf(100.05));
        request.setMaxAuthTimes(1);
        request.setCardCloseUsage(100);
        request.setSettlementCurrencyCode("840");
        request.setSupportedMccGroup("TOPT");
        request.setMultipleCurrencyCard(false);
        request.setCvv2ForceCheck(false);
        request.setRequestUser("api2");
        request.setRequestSource("api2");
        request.setProductCode("MasterCard_GWTTP");
        request.setCardType("GWTTP");
        request.setCardLabel("MasterCard");
        Map<String, String> userReferenceMap = new HashMap<String, String>();
        userReferenceMap.put("useRef1Txt", "DLA272031Q4GNE");
        request.setUserReferenceMap(userReferenceMap);
        CardCreateResponse response = tripLinkApi.create(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void update() throws Exception {
        CardUpdateRequest request = new CardUpdateRequest();
        request.setRequestId(UUID.randomUUID().toString());
        request.setCustomerId("CSR9258286F29A84");
        request.setCardLogId("db5831315c687528ab03784da1e5e32e19169e6952f164c489a502787abfba92");
        request.setCardLimit(BigDecimal.valueOf(200.05));
        request.setMinAuthAmount(BigDecimal.valueOf(10.00));
        request.setMaxAuthAmount(BigDecimal.valueOf(200.05));
        CardUpdateResponse response = tripLinkApi.update(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void recharge() throws Exception {
        CardRechargeRequest request = new CardRechargeRequest();
        request.setRequestId(UUID.randomUUID().toString());
        request.setCustomerId("CSR9258286F29A84");
        request.setCardLogId("db5831315c687528ab03784da1e5e32e19169e6952f164c489a502787abfba92");
        request.setRechargeAmount(BigDecimal.valueOf(10.50));
        CardRechargeResponse response = tripLinkApi.recharge(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void withdraw() throws Exception {
        CardWithdrawRequest request = new CardWithdrawRequest();
        request.setRequestId(UUID.randomUUID().toString());
        request.setCustomerId("CSR9258286F29A84");
        request.setCardLogId("db5831315c687528ab03784da1e5e32e19169e6952f164c489a502787abfba92");
        request.setWithdrawAmount(BigDecimal.valueOf(10.50));
        CardWithdrawResponse response = tripLinkApi.withdraw(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void close() throws Exception {
        CardCancelRequest request = new CardCancelRequest();
        request.setRequestId(UUID.randomUUID().toString());
        request.setCustomerId("CSR9258286F29A84");
        request.setCardLogId("db5831315c687528ab03784da1e5e32e19169e6952f164c489a502787abfba92");
        CardCancelResponse response = tripLinkApi.close(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void queryCard() throws Exception {
        CardDetailQueryRequest request = new CardDetailQueryRequest();
        request.setRequestId(UUID.randomUUID().toString());
        request.setCustomerId("CSR9258286F29A84");
        request.setCardLogId("399d1322867b6774b4144ba968149d50d33201c0c8082785df8b780beeb79f81");
        CardDetailQueryResponse response = tripLinkApi.queryCard(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void queryCustomerCredit() throws Exception {
        QueryCustomerCreditAmountRequest request = new QueryCustomerCreditAmountRequest();
        request.setRequestId(UUID.randomUUID().toString());
        request.setCustomerId("CSR9258286F29A84");
        QueryCustomerCreditAmountResponse response = tripLinkApi.queryCustomerCreditAmount(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void queryAuthTransaction() throws Exception {
        QueryAuthTransactionRequest request = new QueryAuthTransactionRequest();
        request.setRequestId(UUID.randomUUID().toString());
        request.setCustomerId("CSR9258286F29A84");
        request.setCardLogId("f06afb9c2615e10f399eeba6b8f2476e54bd3c5d988be6f68d041dc2d1280e44");
        QueryAuthTransactionResponse response = tripLinkApi.queryAuthTransaction(request);
        Assert.assertNotNull(response);
    }

    @Test
    public void querySettlementTransaction() throws Exception {
        QuerySettlementTransactionRequest request = new QuerySettlementTransactionRequest();
        request.setRequestId(UUID.randomUUID().toString());
        request.setCustomerId("CSR9258286F29A84");
        request.setCardLogId("399d1322867b6774b4144ba968149d50d33201c0c8082785df8b780beeb79f81");
        QuerySettlementTransactionResponse response = tripLinkApi.querySettlementTransaction(request);
        Assert.assertNotNull(response);
    }
}
