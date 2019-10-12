package design.cn.xqm.hoperun.designmode.purchaselink;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/12.
 * 主任类 第一个审批节点
 */

public class Director extends Approver{

    public Director(String name) {
        super(name);
    }

    @Override
    public void handlePurchaseRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getAmount() <10000){
            Log.e("xqm","主任"+this.name+"审批了采购单"+purchaseRequest.getNum()+"金额"+purchaseRequest.getAmount()+"用于"+purchaseRequest.getPurpose());
        }else{

            //将传递给下一个
            this.success.handlePurchaseRequest(purchaseRequest);
        }
    }
}
