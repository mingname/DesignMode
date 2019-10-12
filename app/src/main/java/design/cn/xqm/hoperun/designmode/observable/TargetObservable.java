package design.cn.xqm.hoperun.designmode.observable;

import java.util.Observable;

/**
 * Created by xueqiaoming on 2019/10/12.
 * 被观察者
 */

public class TargetObservable extends Observable{
    private String message;
    public String getConent(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
        //被观察者数据发生变化时，通过以下两行代码通知所有的观察者
        this.setChanged();
        this.notifyObservers(message);
    }
}
