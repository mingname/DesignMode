package design.cn.xqm.hoperun.designmode.strategy;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/11.
 * 具体策略父类
 */

public class Car implements CarFunction{
    /**
     * 车名字
     */
    protected String name;

    /**
     * 车颜色
     */
    protected  String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void run() {
        Log.e("xqm",color+" "+name+"在行驶。。。");
    }
}
