package design.cn.xqm.hoperun.designmode.purchaselink;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/12.
 * 第二个审批节点 副董事类
 *
 */

public class VicePresident extends Approver{
    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void handlePurchaseRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getAmount()<50000){
            Log.e("xqm","副董事"+this.name+"审批了采购单"+purchaseRequest.getNum()+"金额"+purchaseRequest.getAmount()+"用于"+purchaseRequest.getPurpose());
        }else{
            //将传递给下一个
            this.success.handlePurchaseRequest(purchaseRequest);
        }
    }
}
