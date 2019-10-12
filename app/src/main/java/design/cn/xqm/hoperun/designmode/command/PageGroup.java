package design.cn.xqm.hoperun.designmode.command;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/12.
 */

public class PageGroup extends Group {
    @Override
    public void add() {
        Log.e("xqm","客户要求增加一个页面");
    }

    @Override
    public void delete() {
        Log.e("xqm","客户要求删除一个页面");
    }

    @Override
    public void change() {
        Log.e("xqm","客户要求修改一个页面");
    }

    @Override
    public void find() {
        Log.e("xqm","找到美工组");
    }

    @Override
    public void plan() {
        Log.e("xqm","客户要求列出页面变更计划");
    }
}
