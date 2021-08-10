<?php
/**
 * Created by PhpStorm.
 * User: wang.xiaoliang
 * Date: 2021/8/5
 * Time: 13:57
 */
namespace triplink\vcc\card\client\query;


class SettlementInfoResp
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
     * 清算交易记录
     */
    var $settlementInfos;

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
    public function getSettlementInfos()
    {
        return $this->settlementInfos;
    }

    /**
     * @param mixed $settlementInfos
     */
    public function setSettlementInfos($settlementInfos): void
    {
        $this->settlementInfos = $settlementInfos;
    }


}

?>