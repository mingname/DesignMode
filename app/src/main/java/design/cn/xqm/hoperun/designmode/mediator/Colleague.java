package design.cn.xqm.hoperun.designmode.mediator;

/**
 * Created by xueqiaoming on 2019/10/15.
 */

public class Colleague {
    protected String name;
    protected Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
