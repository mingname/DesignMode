package design.cn.xqm.hoperun.designmode.decorator;

import java.math.BigDecimal;

/**
 * Created by xueqiaoming on 2019/10/9.
 * 加鸡蛋
 */

public class AddEggFriedRice extends BaseShaxianFriedRiceFilter{

    public AddEggFriedRice(FriedRice friedRice) {
        super(friedRice);
    }

    @Override
    public BigDecimal calPrice() {
        return super.calPrice().add(new BigDecimal(FriedRiceConst.BASE_PRICE_EGG));
    }

    @Override
    public String description() {
        return super.description()+FriedRiceConst.BASE_DESCRIPTION_ADD_EGG;
    }


}
