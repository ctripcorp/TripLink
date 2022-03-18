package com.ctrip.ccard.creditcard.vcc.bean;

import java.util.Map;

/**
 * Description:
 */
public class CallHttpResponse {

    private String result;

    private Map<String,String> header;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Map<String, String> getHeader() {
        return header;
    }

    public void setHeader(Map<String, String> header) {
        this.header = header;
    }

    @Override
    public String toString() {
        return "CallHttpResponse{" +
                "result='" + result + '\'' +
                ", header=" + header +
                '}';
    }
}
