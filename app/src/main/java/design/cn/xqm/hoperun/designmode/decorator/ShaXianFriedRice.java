package design.cn.xqm.hoperun.designmode.decorator;

import java.math.BigDecimal;

/**
 * Created by xueqiaoming on 2019/10/9.
 * 蛋炒饭类的基本实现
 */

public class ShaXianFriedRice implements FriedRice {
    private BigDecimal price;

    public ShaXianFriedRice() {
        price = new BigDecimal(FriedRiceConst.BASE_PRICE_RICE);
    }

    @Override
    public BigDecimal calPrice() {
        return new BigDecimal(FriedRiceConst.BASE_PRICE_RICE);
    }

    @Override
    public String description() {
        return FriedRiceConst.BASE_DESCRIPTION;
    }
}
