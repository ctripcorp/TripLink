package com.ctrip.ccard.creditcard.vcc.api.V2;

import com.ctrip.ccard.creditcard.vcc.bean.V2.*;

/**
 * Description:
 */
public interface TripLinkApiV2 {
    /**
     * <careate> card
     * request.requestId can not null
     * @return CardCreateResponse
     * response.resultCode equals "000000" it is successed otherwise it is failed
     * if response.resultCode is not euqals "000000" check the response.message
     */
    CardCreateResponse create(CardCreateRequest request);
    /**
     * <update> card
     * request.requestId can not null
     * @return CardCreateResponse
     * response.resultCode equals "000000" it is successed otherwise it is failed
     * if response.resultCode is not euqals "000000" check the response.message
     */
    CardUpdateResponse update(CardUpdateRequest request);
    /**
     * <close> card
     * request.requestId can not null
     * @return CardCreateResponse
     * response.resultCode equals "000000" it is successed otherwise it is failed
     * if response.resultCode is not euqals "000000" check the response.message
     */
    CardCancelResponse close(CardCancelRequest request);
    /**
     * <query> card
     * request.customerId and  cardLogId can not null
     * @return CardCreateResponse
     * response.resultCode equals "000000" it is successed otherwise it is failed
     * if response.resultCode is not euqals "000000" check the response.message
     */
    CardDetailQueryResponse queryCard(CardDetailQueryRequest request);
    /**
     * <query> customer credit amount
     * request.customerId and  cardLogId can not null
     * @return CardCreateResponse
     * response.resultCode equals "000000" it is successed otherwise it is failed
     * if response.resultCode is not euqals "000000" check the response.message
     */
    QueryCustomerCreditAmountResponse queryCustomerCreditAmount(QueryCustomerCreditAmountRequest request);
    /**
     * <query> auth info
     * request.customerId and  cardLogId can not null
     * @return CardCreateResponse
     * response.resultCode equals "000000" it is successed otherwise it is failed
     * if response.resultCode is not euqals "000000" check the response.message
     */
    QueryAuthTranscationResponse queryAuthTranscation(QueryAuthTranscationReuqest request);
    /**
     * <query> selltement info
     * request.customerId and  cardLogId can not null
     * @return CardCreateResponse
     * response.resultCode equals "000000" it is successed otherwise it is failed
     * if response.resultCode is not euqals "000000" check the response.message
     */
    QuerySettlementTranscationResponse querySettlementTranscation(QuerySettlementTranscationRequest request);
}
