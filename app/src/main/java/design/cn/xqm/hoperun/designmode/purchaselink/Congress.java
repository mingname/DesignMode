package design.cn.xqm.hoperun.designmode.purchaselink;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/12.
 * 最后一个节点 董事会
 */

public class Congress extends Approver{
    public Congress(String name) {
        super(name);
    }

    @Override
    public void handlePurchaseRequest(PurchaseRequest purchaseRequest) {
        Log.e("xqm","董事会"+this.name+"审批了采购单"+purchaseRequest.getNum()+"金额"+purchaseRequest.getAmount()+"用于"+purchaseRequest.getPurpose());
    }
}
