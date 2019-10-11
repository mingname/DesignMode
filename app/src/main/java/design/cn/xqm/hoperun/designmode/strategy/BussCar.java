package design.cn.xqm.hoperun.designmode.strategy;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/11.
 */

public class BussCar extends Car{
    public BussCar(String name, String color) {
        super(name, color);
    }

    @Override
    public void run() {
        super.run();
        Log.e("xqm",color+" "+name+"在缓慢的行驶。。。");
    }
}
