package design.cn.xqm.hoperun.designmode.purchaselink;

import android.text.TextUtils;

/**
 * Created by xueqiaoming on 2019/10/12.
 * 采购申请单（请求类）
 */

public class PurchaseRequest {
    /**
     * 采购目的
     */
    private String purpose;
    /**
     * 采购单号
     */
    private int num;
    /**
     * 采购总价
     */
    private double amount;

    public PurchaseRequest(String purpose, int num, double amount) {
        this.purpose = purpose;
        this.num = num;
        this.amount = amount;
    }

    public String getPurpose() {
        return TextUtils.isEmpty(purpose) ? "" : purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
