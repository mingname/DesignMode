package design.cn.xqm.hoperun.designmode.proxy.staticproxy;

import android.util.Log;

import design.cn.xqm.hoperun.designmode.proxy.ISinger;

/**
 * Created by xueqiaoming on 2019/10/10.
 */

public class Singer implements ISinger {
    @Override
    public void sing() {
        Log.e("xqm","唱一首歌");
    }
}
