package design.cn.xqm.hoperun.designmode.command;

/**
 * Created by xueqiaoming on 2019/10/12.
 * 接头人
 */

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }
}
