package design.cn.xqm.hoperun.designmode.bridge;

/**
 * Created by xueqiaoming on 2019/10/10.
 */

public abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    //示例方法
    public void operation(){
        implementor.operationImpl();
    }
}
