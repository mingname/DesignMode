package design.cn.xqm.hoperun.designmode.observable;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by xueqiaoming on 2019/10/12.
 * 观察者
 */

public class TargetObserver implements Observer{
    private String name;
    public String getObserverName(){

        return name;
    }


    public void setObserverName(String observerName){
        this.name = observerName;
    }

    /**
     * 更新消息数据
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        Log.e("xqm",name+"收到发送变化的数据内容是："+((TargetObservable)o).getConent());
    }
}
