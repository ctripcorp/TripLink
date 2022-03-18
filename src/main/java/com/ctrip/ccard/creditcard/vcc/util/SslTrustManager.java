package com.ctrip.ccard.creditcard.vcc.util;

import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * Description: 信任管理，默认都是信任的
 */
public class SslTrustManager implements X509TrustManager {
    public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

    }

    public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

    }

    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
