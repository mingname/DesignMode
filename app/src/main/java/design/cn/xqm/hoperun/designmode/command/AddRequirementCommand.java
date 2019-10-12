package design.cn.xqm.hoperun.designmode.command;

/**
 * Created by xueqiaoming on 2019/10/12.
 * 具体实现类
 */

public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        /**
         * 找到需求组
         */
        super.rg.find();
        /**
         * 增加一份需求
         */
        super.rg.add();

        /**
         * 给出计划
         */
        super.rg.plan();
    }
}
