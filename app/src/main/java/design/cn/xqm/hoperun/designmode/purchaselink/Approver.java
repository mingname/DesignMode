package design.cn.xqm.hoperun.designmode.purchaselink;

/**
 * Created by xueqiaoming on 2019/10/12.
 * 抽象审批类 设计的核心类，处理请求和跳转请求
 */

public abstract class Approver {
    /**
     * 定义下一个处理对象
     */
    protected Approver success;
    /**
     * 定义下一个对象的名字
     */
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    /**
     * 创建链
     */
    public void setApprover(Approver approver){
        this.success = approver;
    }

    public abstract void handlePurchaseRequest(PurchaseRequest purchaseRequest);

}
