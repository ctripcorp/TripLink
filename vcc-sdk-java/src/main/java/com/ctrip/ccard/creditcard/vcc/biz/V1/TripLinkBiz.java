package com.ctrip.ccard.creditcard.vcc.biz.V1;

import com.ctrip.ccard.creditcard.vcc.bean.V1.OperateRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.OperateResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QInfoRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QInfoResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QOperateResultRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QOperateResultResponse;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QTransInfoRequest;
import com.ctrip.ccard.creditcard.vcc.bean.V1.QTransInfoResponse;

public interface TripLinkBiz {

    OperateResponse operate(OperateRequest request);

    QOperateResultResponse qOperateResult(QOperateResultRequest request) ;

    QInfoResponse qInfo(QInfoRequest request);

    QTransInfoResponse qTransInfo(QTransInfoRequest request);
}
