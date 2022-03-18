package com.ctrip.ccard.creditcard.vcc.bean.V2;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: j.mao
 * Date: 2021-10-21
 * Time: 18:11
 */
public class TripLinkApiRequest {

   private String payload;

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "TripLinkApiRequest{" +
                "payload='" + payload + '\'' +
                '}';
    }
}
