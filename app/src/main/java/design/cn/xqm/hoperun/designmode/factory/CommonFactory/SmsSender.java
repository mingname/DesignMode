package design.cn.xqm.hoperun.designmode.factory.CommonFactory;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/8.
 */

public class SmsSender implements SenderI{
    @Override
    public void Send() {
        Log.e("xqm","发送SMS");
    }
}
