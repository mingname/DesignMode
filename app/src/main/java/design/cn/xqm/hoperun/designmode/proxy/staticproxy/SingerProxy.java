package design.cn.xqm.hoperun.designmode.proxy.staticproxy;

import android.util.Log;

import design.cn.xqm.hoperun.designmode.proxy.ISinger;

/**
 * Created by xueqiaoming on 2019/10/10.
 */

public class SingerProxy implements ISinger {
    private ISinger target;

    public SingerProxy(ISinger target) {
        this.target = target;
    }

    @Override
    public void sing() {
        Log.e("xqm","向观众问好");
        target.sing();
        Log.e("xqm","谢谢大家");
    }
}
