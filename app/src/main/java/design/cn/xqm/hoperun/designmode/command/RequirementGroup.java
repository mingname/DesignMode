package design.cn.xqm.hoperun.designmode.command;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/12.
 */

public class RequirementGroup extends Group{
    @Override
    public void add() {
        Log.e("xqm","客户要求增加一项需求。。。");
    }

    @Override
    public void delete() {
        Log.e("xqm","客户要求删除一项需求。。。");
    }

    @Override
    public void change() {
        Log.e("xqm","客户要求修改一项需求。。。");
    }

    @Override
    public void find() {
        Log.e("xqm","找到需求组。。。");
    }

    @Override
    public void plan() {
        Log.e("xqm","客户要求列出需求变更计划。。。");
    }
}
