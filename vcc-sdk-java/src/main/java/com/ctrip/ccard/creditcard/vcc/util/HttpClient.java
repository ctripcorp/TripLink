package com.ctrip.ccard.creditcard.vcc.util;

import com.ctrip.ccard.creditcard.vcc.bean.CallHttpResponse;

import java.util.Map;

/**
 * Description:
 */
public interface HttpClient<T extends CallHttpResponse> {

    T post(String requestJson,String url,Map<String,String> header);

    T get(String url,Map<String,String> header);


}
