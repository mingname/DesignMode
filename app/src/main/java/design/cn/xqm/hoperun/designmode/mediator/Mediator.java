package design.cn.xqm.hoperun.designmode.mediator;

/**
 * Created by xueqiaoming on 2019/10/15.
 * 定义抽象Mediator，可以与同事们进行联络
 */

public abstract class Mediator {
    public abstract void contact(String content,Colleague coll);
}
