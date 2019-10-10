package design.cn.xqm.hoperun.designmode.decorator;

import java.math.BigDecimal;

/**
 * Created by xueqiaoming on 2019/10/9.
 * 蛋炒饭类接口
 */

public interface FriedRice {
    /**
     * 计算价格
     */
    BigDecimal calPrice();

    /**
     * 描述
     */
    String description();

}
