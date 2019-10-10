package design.cn.xqm.hoperun.designmode.decorator;

import java.math.BigDecimal;

/**
 * Created by xueqiaoming on 2019/10/9.
 * 蛋炒饭装饰器基类
 */

public abstract class BaseShaxianFriedRiceFilter implements FriedRice{

    protected FriedRice friedRice;

    public BaseShaxianFriedRiceFilter(FriedRice friedRice) {
        this.friedRice = friedRice;
    }

    @Override
    public BigDecimal calPrice() {
        return friedRice.calPrice();
    }

    @Override
    public String description() {
        return friedRice.description();
    }
}
