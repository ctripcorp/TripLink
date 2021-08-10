<?php
/**
 * Created by PhpStorm.
 * User: wang.xiaoliang
 * Date: 2021/8/4
 * Time: 11:35
 */
namespace triplink\vcc\card\client\query;


class ChannelInfo
{
    /**
     * 卡通道类型
     */
    var $channelType;

    /**
     * 卡通道总限额
     */
    var $channelCardCreditLimitAmt;

    /**
     * 卡通道总限额剩余额度
     */
    var $channelRemainCardCreditLimitAmt;

    /**
     * 卡通道总授信额度
     */
    var $channelAuthLimitAmt;

    /**
     * 卡通道总授信额度剩余额度
     */
    var $channelRemainAuthLimitAmt;

    /**
     * 卡通道限额币种
     */
    var $channelCurrencyCodeOfLimitAmt;

    /**
     * @return mixed
     */
    public function getChannelType()
    {
        return $this->channelType;
    }

    /**
     * @param mixed $channelType
     */
    public function setChannelType($channelType): void
    {
        $this->channelType = $channelType;
    }

    /**
     * @return mixed
     */
    public function getChannelCardCreditLimitAmt()
    {
        return $this->channelCardCreditLimitAmt;
    }

    /**
     * @param mixed $channelCardCreditLimitAmt
     */
    public function setChannelCardCreditLimitAmt($channelCardCreditLimitAmt): void
    {
        $this->channelCardCreditLimitAmt = $channelCardCreditLimitAmt;
    }

    /**
     * @return mixed
     */
    public function getChannelRemainCardCreditLimitAmt()
    {
        return $this->channelRemainCardCreditLimitAmt;
    }

    /**
     * @param mixed $channelRemainCardCreditLimitAmt
     */
    public function setChannelRemainCardCreditLimitAmt($channelRemainCardCreditLimitAmt): void
    {
        $this->channelRemainCardCreditLimitAmt = $channelRemainCardCreditLimitAmt;
    }

    /**
     * @return mixed
     */
    public function getChannelAuthLimitAmt()
    {
        return $this->channelAuthLimitAmt;
    }

    /**
     * @param mixed $channelAuthLimitAmt
     */
    public function setChannelAuthLimitAmt($channelAuthLimitAmt): void
    {
        $this->channelAuthLimitAmt = $channelAuthLimitAmt;
    }

    /**
     * @return mixed
     */
    public function getChannelRemainAuthLimitAmt()
    {
        return $this->channelRemainAuthLimitAmt;
    }

    /**
     * @param mixed $channelRemainAuthLimitAmt
     */
    public function setChannelRemainAuthLimitAmt($channelRemainAuthLimitAmt): void
    {
        $this->channelRemainAuthLimitAmt = $channelRemainAuthLimitAmt;
    }

    /**
     * @return mixed
     */
    public function getChannelCurrencyCodeOfLimitAmt()
    {
        return $this->channelCurrencyCodeOfLimitAmt;
    }

    /**
     * @param mixed $channelCurrencyCodeOfLimitAmt
     */
    public function setChannelCurrencyCodeOfLimitAmt($channelCurrencyCodeOfLimitAmt): void
    {
        $this->channelCurrencyCodeOfLimitAmt = $channelCurrencyCodeOfLimitAmt;
    }


}

?>