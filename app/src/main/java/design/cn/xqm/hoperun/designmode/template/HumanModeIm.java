package design.cn.xqm.hoperun.designmode.template;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/12.
 * 模板
 */

public class HumanModeIm extends HumanMode{
    @Override
    protected void getUp() {
        Log.e("xqm","小明--6点起床");
    }

    @Override
    protected void breakFast() {
        Log.e("xqm","小明--早饭");
    }

    @Override
    protected void work() {
        Log.e("xqm","小明--工作");
    }

    @Override
    protected void sleep() {
        Log.e("xqm","小明--睡觉");
    }
}
