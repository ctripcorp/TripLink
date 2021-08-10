<?php
/**
 * Created by PhpStorm.
 * User: wang.xiaoliang
 * Date: 2021/8/4
 * Time: 14:32
 */

namespace triplink\vcc\card\client\query;
class AuthInfoResp
{
    /**
     * 返回总条数
     */
    var $totalCount;
    /**
     * 可用余额
     */
    var $balanceAmt;
    /**
     * 授权交易记录 参考AuthInfo
     */
    var $authInfos;

    /**
     * @return mixed
     */
    public function getTotalCount()
    {
        return $this->totalCount;
    }

    /**
     * @param mixed $totalCount
     */
    public function setTotalCount($totalCount): void
    {
        $this->totalCount = $totalCount;
    }

    /**
     * @return mixed
     */
    public function getBalanceAmt()
    {
        return $this->balanceAmt;
    }

    /**
     * @param mixed $balanceAmt
     */
    public function setBalanceAmt($balanceAmt): void
    {
        $this->balanceAmt = $balanceAmt;
    }

    /**
     * @return mixed
     */
    public function getAuthInfos()
    {
        return $this->authInfos;
    }

    /**
     * @param mixed $authInfos
     */
    public function setAuthInfos($authInfos): void
    {
        $this->authInfos = $authInfos;
    }


}

?>