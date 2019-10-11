package design.cn.xqm.hoperun.designmode.component;

import android.text.TextUtils;

/**
 * Created by xueqiaoming on 2019/10/11.
 * 抽象类，用来管理子类
 */

public abstract class Firm {
    private String firmName;

    public Firm(String firmName) {
        this.firmName = firmName;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    /**
     * 添加公司如：新增分公司
     * @param firm
     */
    protected abstract void append(Firm firm);

    /**
     * 删除公司如：因故关闭分公司
     * @param firm
     */
    protected abstract void remove(Firm firm);

    /**
     * 显示公司所在的层级：总公司，分公司，办事处等
     * @param level
     */
    protected abstract void show(int level);
}
