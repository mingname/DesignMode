package design.cn.xqm.hoperun.designmode.observable;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by xueqiaoming on 2019/10/12.
 * 观察者
 */

public class TargetObserver01 implements Observer{
    private String name01;
    public String getObserverName(){
        return name01;
    }

    public void setObserverName(String observerName){
        this.name01 = observerName;
    }
    @Override
    public void update(Observable o, Object arg) {
        Log.e("xqm",name01+"收到了发生变化的数据内容是："+((TargetObservable)o).getConent());
    }
}
