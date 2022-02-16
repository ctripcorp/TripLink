<?php
/**
 * Created by PhpStorm.
 * User: wang.xiaoliang
 * Date: 2021/8/4
 * Time: 11:17
 */

namespace triplink\vcc\card\client\query;

class MerchantInfo {
    /**
     * 商户名称
     */
    var $merchantName;

    /**
     * 支持的通道信息列表
     */
    var $channelInfos;

    /**
     * @return mixed
     */
    public function getMerchantName()
    {
        return $this->merchantName;
    }

    /**
     * @param mixed $merchantName
     */
    public function setMerchantName($merchantName): void
    {
        $this->merchantName = $merchantName;
    }

    /**
     * @return mixed
     */
    public function getChannelInfos()
    {
        return $this->channelInfos;
    }

    /**
     * @param mixed $channelInfos
     */
    public function setChannelInfos($channelInfos): void
    {
        $this->channelInfos = $channelInfos;
    }



}
?>