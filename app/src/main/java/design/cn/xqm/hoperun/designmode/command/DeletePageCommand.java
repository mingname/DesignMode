package design.cn.xqm.hoperun.designmode.command;

/**
 * Created by xueqiaoming on 2019/10/12.
 */

public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        /**
         * 找到美工组
         */
        super.pg.find();

        /**
         * 删除一个页面
         */
        super.pg.delete();

        /**
         * 给出计划
         */
        super.pg.plan();
    }
}
