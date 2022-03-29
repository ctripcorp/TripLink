欢迎使用 TripLink SDK For Java ！

TripLink SDK For Java 让您不用更轻松方便对接TripLink开发接口，可以自动帮您满足能力调用过程中所需的参数校验、加签、数据解密、发送HTTP请求等非功能性要求。

这里向您介绍如何获取 TripLink SDK For Java 并开始调用。
如果您在使用 TripLink SDK For Java 的过程中遇到任何问题，欢迎在当前 GitHub [提交 Issues](https://https://github.com/ctripcorp/TripLink)。

## 环境要求
1. TripLink SDK For Java 建议配合`JKD 1.8`版本。

2. 使用 TripLink SDK For Java 之前 ，您需要先前往[TripLink文档中心-准备工作](http://vcc.docs.fws.qa.nt.ctripcorp.com/quickstart.html)完成开发者接入的一些准备工作，包括RSA公钥、DES密钥、商户账号等。

3. 准备工作完成后，注意保存如下信息，后续将作为使用SDK的输入。

* 签名、数据解密

  `商户RSA私钥`、`商户RSA公钥`、`DES密钥`

* 商户数据

  `商户名 merchantName`、`渠道 channelType`、`mcc码 MerchantCategoryName `

## 安装依赖
推荐通过Maven来管理项目依赖，您只需在项目的`pom.xml`文件中声明如下依赖
```xml
<dependency>
    <groupId>com.ctripcrop.sdk</groupId>
    <artifactId>triplink-sdk-java</artifactId>
    <version>1.0.0</version>
</dependency>
```

## 使用说明

  TripLink SDK For Java 支持您扩展自己的Http请和日志实现。

1.`HttpClient`

TripLink SDK For Java 的Https请求使用的Java原生的方法，您可以自己实现  `HttpClient` 接口，重写  `post` 方法

```java
import com.ctrip.ccard.creditcard.vcc.exception.HttpException;

public class YouSelfHttpClient implements HttpClient{
    //requestJson 请求入参  url 请求地址
    publick String post(String requestJson,String url){
        //自己的实现
        return null;
    }
    
}
```

2.日志实现

TripLink SDK For Java 引用了`slf4j`日志标准，您可以根据自己应用选择具体的实现，`slf4j-simple`、`logback`、`log4j`都实现。

## 快速使用

以下这段代码示例向您展示了使用TripLink SDK For Java调用一个API的3个主要步骤：
1. 创建HttpClient实例
2. 创建TripLinkBiz实例
3. 创建TripLinkApi实例
4. 创建使用Open Api 对应的请求参数
5. 接口请求响应处理

```java
import com.ctrip.ccard.creditcard.vcc.api.TripLinkApiImpl;
import com.ctrip.ccard.creditcard.vcc.bean.CreateCardInfo;
import com.ctrip.ccard.creditcard.vcc.bean.CreateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.CreateResponse;
import com.ctrip.ccard.creditcard.vcc.biz.TripLinkBizImpl;
import org.junit.Assert;

import java.math.BigDecimal;

/**
 * Description:
 */
public class TestApi {

    private static final String DES = "Wa8Nw*Ei";

    private static final String URL = "https://openpci.fws.ctripqa.com/restful/soa2/18375/json";

    private static final String  PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAKpQrSAzyJV0MfBN7qKvE8d73phdredNhF3cKm3IWKFlCWg/3alVWI6GE462rPc5A4T+shYcvzqhV5wSOS0QMfj9VfLPqUT+xggFcCQ48mbeX4Jy/N5QZB3RZuQu+YbmQT6f54h2sJvhqLurvE7sgW4qL7r6AaJfDsvYPjKSezYXAgMBAAECgYA32EY8Jd6iarwpMFSMEV4p7craKPVpv3gkkply79tn6EpCXZaf/HUSHpJxHCLw2Uf3JtBcAccOQXMJoMwQo5vOoMVl5nk+EZN//MB8Re8r/7GQV8E+myHdlntMjxOf38PGn9z8Ze0Q020fZwGjA6egBFcU/ld1lCcI0TAj3cZDcQJBANS9UOC3J5njhnuzACjQ1qTTXuv6hr2lbglr2za4Ju9xFJUkKXy2LBAp2LlakXZXDhf7lsqmwZg5BvOBK6DPl18CQQDM8tqqOr4LRJRhq2bqBx398IqtyoZpMshpzBXLr7bdhp7FR2N4AEoAGaa5hS5k3z5SYNLEGKFhRM+sFJBQjnRJAkBnq647I+YffxotM8jTGxpOjlbGhnqc9n4OB0p3evw2WRPfrhStmpUUd2AOy4zxb3EFzOvp66OSC9BQX9Uj86XfAkEAouGbgVDgOupNFvZ2+yWe43Ppc0eS3UZ72wFUjSXgKlzUECu1VOi95yh7xdOf1JFL4YKL30dH8psShUtuimc86QJAeBXASabJBcHAIisPkODvsciiz1pzm1WSuXRUxnuis0TRTRs7+2KEnWE4UV3jxehxkc1RAgteYosWXg5TWQgiUg==";

    public static void main(String[] args) {
        //1：创建HttpClient实例
        TripLinkHttpClient tripLinkHttpClient = new TripLinkHttpClient();
        //2：创建TripLinkBiz实例
        TripLinkBizImpl tripLinkBiz = new TripLinkBizImpl(PRIVATE_KEY,DES,URL,tripLinkHttpClient);
        //3：创建TripLinkApi实例
        TripLinkApiImpl tripLinkApi = new TripLinkApiImpl(tripLinkBiz);
        //4：创建使用Open Api 对应的请求参数
        CreateRequest request = getCreateParams();
        //5：接口请求响应处理
        CreateResponse response = tripLinkApi.create(request);
        Assert.assertNotNull(response);
    }

    private static CreateRequest getCreateParams(){
        CreateRequest createRequest = new CreateRequest();
        createRequest.setRequestId("2021000000001");
        createRequest.setRequestTime("20210728102355");
        createRequest.setMerchantName("TEST");
        createRequest.setChannelType("TEST_CFNC_VCC");
        createRequest.setOperator("max");
        createRequest.setRequestSource("order");
        CreateCardInfo createCardInfo = new CreateCardInfo();
        createCardInfo.setLocalCurrency("USD");
        createCardInfo.setBillCurrency("USD");
        createCardInfo.setStartActiveDate("2021-07-28");
        createCardInfo.setEndCloseDate("2023-07-28");
        createCardInfo.setCreditLimitAmt(new BigDecimal(1200.00));
        createCardInfo.setMinAuthAmt(new BigDecimal(0.00));
        createCardInfo.setMaxAuthAmt(new BigDecimal(1200.00));
        createCardInfo.setEnableMutilUse("1");
        createCardInfo.setClosePercentage(100);
        createCardInfo.setEnable3DS("0");
        createCardInfo.setEnaleCVVCheck("0");
        createCardInfo.setEnableCurrencyCheck("0");
        createCardInfo.setMerchantCategoryName("0011");
        createCardInfo.setUserDefineInfo("{\"BookingNumber\":\"205D140D5-01DFFS\"}");
        createRequest.setCardInfo(createCardInfo);
        return createRequest;
    }


}

```

## 文档
[SDK文档首页](http://vcc.docs.fws.qa.nt.ctripcorp.com/)

## 问题
[提交 Issue](https://https://github.com/ctripcorp/TripLink)，我们会定期查看Issue记录并尽快做出反馈。

## 变更日志
每个版本的详细更改记录在[变更日志]()中。

## 相关
* [携程开放源码](https://github.com/ctripcorp)

