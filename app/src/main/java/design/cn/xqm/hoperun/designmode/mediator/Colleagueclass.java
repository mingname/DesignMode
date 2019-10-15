package design.cn.xqm.hoperun.designmode.mediator;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/15.
 */

public class Colleagueclass extends Colleague{
    //具体同事类继承自Colleague，此刻就可以与中介者Mediator进行通信了
    public Colleagueclass(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void getMessage(String message){
        Log.e("xqm","同事A"+name+"获取信息"+message);
    }

    //同事A与中介者通信
    public void contact(String message){
        mediator.contact(message,this);
    }

}
