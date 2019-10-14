package design.cn.xqm.hoperun.designmode.memento;

import android.text.TextUtils;

/**
 * Created by xueqiaoming on 2019/10/14.
 * 原发器角色  西汉王朝
 */

public class Han {
    private String thing;

    public String getThing() {
        return TextUtils.isEmpty(thing) ? "" : thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }
}
