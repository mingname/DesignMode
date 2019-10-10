package design.cn.xqm.hoperun.designmode.decorator;

import java.math.BigDecimal;

/**
 * Created by xueqiaoming on 2019/10/9.
 * 加鸡腿
 */

public class AddDrumstickFriedRice extends BaseShaxianFriedRiceFilter{
    public AddDrumstickFriedRice(FriedRice friedRice) {
        super(friedRice);
    }

    @Override
    public BigDecimal calPrice() {
        return super.calPrice().add(new BigDecimal(FriedRiceConst.BASE_PRICE_DRUMSTICK));
    }

    @Override
    public String description() {
        return super.description()+FriedRiceConst.BASE_DESCRIPTION_ADD_DRUMSTICK;
    }

}
