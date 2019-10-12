package design.cn.xqm.hoperun.designmode.purchaselink;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/12.
 * 第三个审批节点   董事
 */

public class President extends Approver{
    public President(String name) {
        super(name);
    }

    @Override
    public void handlePurchaseRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getAmount()<100000){
            Log.e("xqm","董事"+this.name+"审批了采购单"+purchaseRequest.getNum()+"金额"+purchaseRequest.getAmount()+"用于"+purchaseRequest.getPurpose());
        }else {
            //将传递给下一个
            this.success.handlePurchaseRequest(purchaseRequest);
        }
    }
}
