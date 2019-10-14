package design.cn.xqm.hoperun.designmode.state;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/14.
 */

public class CheckedInState implements State {
    @Override
    public void handle() {
        Log.e("xqm","房价已入住!请勿打扰！");
    }
}
