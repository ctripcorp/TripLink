package com.ctrip.ccard.creditcard.vcc.exception;

public class HttpException extends RuntimeException {

    public HttpException(String msg){
        super(msg);
    }

    public HttpException(Throwable ex) {
        super(ex);
    }

    public HttpException(String msg, Throwable ex) {
        super(msg, ex);
    }

}
