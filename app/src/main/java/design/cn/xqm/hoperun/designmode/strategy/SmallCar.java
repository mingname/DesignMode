package design.cn.xqm.hoperun.designmode.strategy;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/11.
 * 具体策略实现子类
 */

public class SmallCar extends Car{
    public SmallCar(String name, String color) {
        super(name, color);
    }

    @Override
    public void run() {
        super.run();

        Log.e("xqm",color+" "+ name +"再告诉的行驶。。。");
    }
}
