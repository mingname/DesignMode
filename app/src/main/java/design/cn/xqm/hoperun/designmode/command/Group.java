package design.cn.xqm.hoperun.designmode.command;

/**
 * Created by xueqiaoming on 2019/10/12.
 * 项目分为三个组，每组要接受增删改的命令
 */

public abstract class Group {
    public abstract void add();
    public abstract void delete();
    public abstract void change();

    /**
     * 客户要和某个小组沟通，必须先找到对应的小组
     */
    public abstract void find();

    /**
     * 客户要求某小组列出执行计划
     */
    public abstract void plan();
}
