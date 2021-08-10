package com.ctrip.ccard.creditcard.vcc.bean;

/**
 * Description:
 */
public class RiskVerifyInfo {

    /**
     * 单号
     * 携程内部使用
     */
    private String riskOrderId;

    /**
     * 订单类型
     * flight：机票
     * hotel：酒店
     * vacation：度假
     * Advertising：广告及市场推广服务业
     * Information technology：软件和信息技术服务业
     * Educational institutions：教育机构
     * Online retail：网上零售
     * E-Commerce-retail：电商平台-零售
     * Local courier activities：本地速递服务
     * Logistics and storage：国际物流及仓储服务
     * E-Commerce-B2B：电商平台-批发
     */
    private String riskOrderType;

    /**
     * 产品名称
     * 机票写路线，酒店写酒店名称
     */
    private String riskOrderTitle;

    /**
     * 订单使用人姓名
     * 机票乘机人姓名、酒店入住人姓名
     */
    private String riskOrderGuestName;

    /**
     * 订单生效日期
     * 机票起飞日期、酒店入住日期
     */
    private String riskOrderActiveDate;

    /**
     * 订单失效日期
     * 酒店离店日期，机票落地日期
     */
    private String riskOrderExpiryDate;

    /**
     * 订单人名币金额
     */
    private String riskOrderCNYAmount;

    /**
     * 出票单号信息
     * 订单为携程订单时，传入携程出票单号
     */
    private String riskIssueBillId;

    /**
     * 订单源系统 服务方分配
     */
    private String riskOrderSourceSys;

    /**
     * 订单结算方式
     * 枚举：
     * 0:单结，1:批结
     */
    private String riskOrderSettleTp;

    /**
     * 订单供应商编码
     */
    private String riskOrderSupplierCd;

    /**
     * 订单供应商名称
     */
    private String riskOrderSupplierNm;

    /**
     * 调用方UID
     */
    private String riskUID;

    /**
     * 调用方联系人
     */
    private String riskContactName;

    /**
     * 调用方联系邮箱
     */
    private String riskContactEmail;

    /**
     * 调用方联系手机号
     */
    private String riskContactPhoneNo;

    /**
     * 风控扩展数据
     */
    private String riskExtra;

    public String getRiskOrderId() {
        return riskOrderId;
    }

    public void setRiskOrderId(String riskOrderId) {
        this.riskOrderId = riskOrderId;
    }

    public String getRiskOrderType() {
        return riskOrderType;
    }

    public void setRiskOrderType(String riskOrderType) {
        this.riskOrderType = riskOrderType;
    }

    public String getRiskOrderTitle() {
        return riskOrderTitle;
    }

    public void setRiskOrderTitle(String riskOrderTitle) {
        this.riskOrderTitle = riskOrderTitle;
    }

    public String getRiskOrderGuestName() {
        return riskOrderGuestName;
    }

    public void setRiskOrderGuestName(String riskOrderGuestName) {
        this.riskOrderGuestName = riskOrderGuestName;
    }

    public String getRiskOrderActiveDate() {
        return riskOrderActiveDate;
    }

    public void setRiskOrderActiveDate(String riskOrderActiveDate) {
        this.riskOrderActiveDate = riskOrderActiveDate;
    }

    public String getRiskOrderExpiryDate() {
        return riskOrderExpiryDate;
    }

    public void setRiskOrderExpiryDate(String riskOrderExpiryDate) {
        this.riskOrderExpiryDate = riskOrderExpiryDate;
    }

    public String getRiskOrderCNYAmount() {
        return riskOrderCNYAmount;
    }

    public void setRiskOrderCNYAmount(String riskOrderCNYAmount) {
        this.riskOrderCNYAmount = riskOrderCNYAmount;
    }

    public String getRiskIssueBillId() {
        return riskIssueBillId;
    }

    public void setRiskIssueBillId(String riskIssueBillId) {
        this.riskIssueBillId = riskIssueBillId;
    }

    public String getRiskOrderSourceSys() {
        return riskOrderSourceSys;
    }

    public void setRiskOrderSourceSys(String riskOrderSourceSys) {
        this.riskOrderSourceSys = riskOrderSourceSys;
    }

    public String getRiskOrderSettleTp() {
        return riskOrderSettleTp;
    }

    public void setRiskOrderSettleTp(String riskOrderSettleTp) {
        this.riskOrderSettleTp = riskOrderSettleTp;
    }

    public String getRiskOrderSupplierCd() {
        return riskOrderSupplierCd;
    }

    public void setRiskOrderSupplierCd(String riskOrderSupplierCd) {
        this.riskOrderSupplierCd = riskOrderSupplierCd;
    }

    public String getRiskOrderSupplierNm() {
        return riskOrderSupplierNm;
    }

    public void setRiskOrderSupplierNm(String riskOrderSupplierNm) {
        this.riskOrderSupplierNm = riskOrderSupplierNm;
    }

    public String getRiskUID() {
        return riskUID;
    }

    public void setRiskUID(String riskUID) {
        this.riskUID = riskUID;
    }

    public String getRiskContactName() {
        return riskContactName;
    }

    public void setRiskContactName(String riskContactName) {
        this.riskContactName = riskContactName;
    }

    public String getRiskContactEmail() {
        return riskContactEmail;
    }

    public void setRiskContactEmail(String riskContactEmail) {
        this.riskContactEmail = riskContactEmail;
    }

    public String getRiskContactPhoneNo() {
        return riskContactPhoneNo;
    }

    public void setRiskContactPhoneNo(String riskContactPhoneNo) {
        this.riskContactPhoneNo = riskContactPhoneNo;
    }

    public String getRiskExtra() {
        return riskExtra;
    }

    public void setRiskExtra(String riskExtra) {
        this.riskExtra = riskExtra;
    }
}
