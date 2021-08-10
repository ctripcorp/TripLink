package com.ctrip.ccard.creditcard.vcc.biz;

import com.ctrip.ccard.creditcard.vcc.bean.*;

public interface TripLinkBiz {

    /**
     * @param request
     * @return
     */
    OperateResponse operate(OperateRequest request);

    /**
     * @param request
     * @return
     * @throws Exception
     */
    QOperateResultResponse qOperateResult(QOperateResultRequest request) ;

    /**
     * @param request
     * @return
     * @throws Exception
     */
    QInfoResponse qInfo(QInfoRequest request);

    /**
     * @param request
     * @return
     * @throws Exception
     */
    QTransInfoResponse qTransInfo(QTransInfoRequest request);

}
