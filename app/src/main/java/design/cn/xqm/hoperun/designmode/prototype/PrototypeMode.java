package design.cn.xqm.hoperun.designmode.prototype;

import android.text.TextUtils;

import java.io.Serializable;

/**
 * Created by xueqiaoming on 2019/10/9.
 */

public class PrototypeMode implements Cloneable,Serializable{
    private String name;
    private String payAmount;
    private String msg;

    public String getName() {
        return TextUtils.isEmpty(name) ? "" : name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPayAmount() {
        return TextUtils.isEmpty(payAmount) ? "" : payAmount;
    }

    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }

    public String getMsg() {
        return TextUtils.isEmpty(msg) ? "" : msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public PrototypeMode clone() throws CloneNotSupportedException {

        PrototypeMode clone = (PrototypeMode) super.clone();
        return clone;
    }
}
