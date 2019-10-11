package design.cn.xqm.hoperun.designmode.strategy;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/11.
 */

public class Person {
    private String name;
    private String age;
    private Car car;

    public void driver(Car car){
        Log.e("xqm",name+" "+age+" 岁"+"开着");
        car.run();
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
