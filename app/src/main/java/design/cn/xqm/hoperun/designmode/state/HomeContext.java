package design.cn.xqm.hoperun.designmode.state;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/14.
 * 房间对象
 */

public class HomeContext {
    private State state;

    public void setState(State s){
        Log.e("xqm","修改状态");
        state = s;
        state.handle();
    }
}
