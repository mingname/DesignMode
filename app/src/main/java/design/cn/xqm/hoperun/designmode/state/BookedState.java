package design.cn.xqm.hoperun.designmode.state;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/14.
 * 房间已预订状态
 */

public class BookedState implements State {
    @Override
    public void handle() {
        Log.e("xqm","房价已预订，别人不能定");
    }
}
