package design.cn.xqm.hoperun.designmode.state;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/14.
 */

public class FreeState implements State {
    @Override
    public void handle() {
        Log.e("xqm","房间空闲！！！没人住！");
    }
}
