package design.cn.xqm.hoperun.designmode.command;

/**
 * Created by xueqiaoming on 2019/10/12.
 */

public abstract class Command {
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();


    //只要一个方法，你要我做什么事情
    public abstract void execute();
}
