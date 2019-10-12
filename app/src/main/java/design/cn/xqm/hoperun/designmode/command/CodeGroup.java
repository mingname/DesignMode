package design.cn.xqm.hoperun.designmode.command;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/12.
 */

public class CodeGroup extends Group {
    @Override
    public void add() {
        Log.e("xqm","客户要求增加一个功能");
    }

    @Override
    public void delete() {
        Log.e("xqm","客户要求删除一个功能");
    }

    @Override
    public void change() {
        Log.e("xqm","客户要求修改一个功能");
    }

    @Override
    public void find() {
        Log.e("xqm","找到代码组");
    }

    @Override
    public void plan() {
        Log.e("xqm","客户要求列出代码变更计划");
    }
}
